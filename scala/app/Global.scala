import play.api._
import play.api.Logger
import play.api.mvc._
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import views.html._

object Global extends WithFilters(HTTPSRedirectFilter)
{
  override def onHandlerNotFound(request: RequestHeader) =
  {  
    Future.successful(
      Results.NotFound(
        regular("404", body(notFoundPage(request.path)))))
  }
}

package object globals
{
  def isDev =
  {
  	! play.api.Play.isProd(play.api.Play.current)
  }

  lazy val TAKIPI_APP            = if (isDev) "http://localhost:8080"                    else "https://app.takipi.com"
  lazy val TAKIPI_APP_INDEX      = if (isDev) TAKIPI_APP + "/index-debug.html"           else TAKIPI_APP
  lazy val TAKIPI_APP_TALE       = if (isDev) TAKIPI_APP + "/tale-debug.html"            else TAKIPI_APP + "/tale.html"
  lazy val TAKIPI_CREATE_ACCOUNT = if (isDev) TAKIPI_APP + "/account-debug.html"         else TAKIPI_APP + "/account.html"
  lazy val LOGIN_PAGE            = if (isDev) TAKIPI_APP + "/login-debug.html"           else TAKIPI_APP + "/login.html"
  lazy val SITE_ORIGIN           = if (isDev) "http://localhost:9000"                    else "https://www.takipi.com"

  lazy val SAMPLE_TALE           = TAKIPI_APP_TALE + "?event=UzUwOCM0MCM0&tscode=demo"

  lazy val SECURITY_WHITEPAPER   = "https://www.takipi.com/pub/TakipiSecurityWhitepaper.pdf"

  lazy val TAKIPI_BLOG           = "http://blog.takipi.com"
  lazy val DEMO_VIDEO            = "a-4ftQsoZas"

  lazy val HELLO_MAIL            = "hello@takipi.com"
  lazy val HELLO_MAILTO          = "mailto:" + HELLO_MAIL

  lazy val ENTERPRISE_MAIL       = "enterprise@takipi.com"
  lazy val ENTERPRISE_MAILTO     = "mailto:" + ENTERPRISE_MAIL

  lazy val OLD_TAKIPI_BUCKET     = "http://www.takipi.com.s3-website-us-east-1.amazonaws.com/"
  
  lazy val TAKIPI_SUPPORT_SITE   = "http://docs.takipi.com"
}

object HTTPSRedirectFilter extends Filter
{
  def apply(nextFilter: (RequestHeader) => Future[Result])(request: RequestHeader): Future[Result] =
  {
    // XXX: Reformat
    val msg = s"method=${request.method} uri=${request.uri} remote-address=${request.remoteAddress} " +
      s"domain=${request.domain} query-string=${request.rawQueryString} " +
      s"referrer=${request.headers.get("referrer").getOrElse("N/A")} " +
      s"user-agent=[${request.headers.get("user-agent").getOrElse("N/A")}]"
    play.Logger.of("access").info(msg)

    if (globals.isDev || request.host == "localhost:9000")
    {
      return nextFilter(request)
    }

    if (request.uri == "/ping")
    {
      return nextFilter(request)
    }

    //play uses lower case headers.
    request.headers.get("x-forwarded-proto") match
    {
      case Some(header) =>
      {
          if ("https" == header)
          {
            nextFilter(request).map
            {
              result =>
                result.withHeaders(("Strict-Transport-Security", "max-age=31536000"))
            }
          } 
          else
          {
            Future.successful(Results.Redirect("https://" + request.host + request.uri, 301))
          }
      }
      case None => 
      {
        request.secure match 
        {
          case false =>
          {
            Future.successful(Results.Redirect("https://" + request.host + request.uri, 301))
          }
          case true => nextFilter(request)
        }
      }
    }
  }
}
