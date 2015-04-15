package controllers

import play.api._
import play.api.cache.Cached
import play.api.mvc._
import play.api.Play.current
import scala.util.Random
import views.html._
import play.twirl.api.Html

object Application extends Controller 
{
	def ping = Action
	{
		Ok("good ping")
	}
	
	def pricing = Action 
	{
		var bodyHtml : Html = body(pages.pricing())
		var headHtml : Html = head.pricing()
		var readyHtml : Html = ready.pricing()
		var allHtml : Html = regular("Pricing", bodyHtml, headHtml, readyHtml)

		Ok(allHtml)
	}

	def monsters = Cached("actionApplicationMonsters") 
	{
		Action 
		{
			var bodyHtml : Html = body(pages.monsters())
			var allHtml : Html = regular("Monsters", bodyHtml)

			Ok(allHtml)
		}
	}

	def scala = Action 
	{
		var bodyHtml : Html = body(pages.scala())
		var headHtml : Html = head.scala()
		var readyHtml : Html = ready.scala()
		var allHtml : Html = regular("Debugging Scala in Takipi", bodyHtml, headHtml, readyHtml)

		Ok(allHtml)
	}

	def aboutus = Action 
	{
		Redirect(routes.Application.about)
	}

	def about = Action 
	{
		var bodyHtml : Html = body(views.html.about.about())
		var allHtml : Html = regular("About Us", bodyHtml)

		Ok(allHtml)
	}

	def newrelic = Action 
	{
		var bodyHtml : Html = body(pages.newrelic())
		var readyHtml : Html = ready.newrelic()
		var allHtml : Html = regular("New Relic", bodyHtml, null, readyHtml)

		Ok(allHtml)
	}

	def newrelicnew = Action 
	{
		var bodyHtml : Html = body(pages.newrelicnew())
		var readyHtml : Html = ready.newrelicnew()
		var allHtml : Html = regular("New Relic", bodyHtml, null, readyHtml)

		Ok(allHtml)
	}

	def adtech = Action 
	{
		var bodyHtml : Html = body(pages.adtech(), false, true)
		var headHtml : Html = head.features()
		var readyHtml : Html = ready.adtech()
		var allHtml : Html = regular("Ad-Tech", bodyHtml, headHtml, readyHtml)

		Ok(allHtml)
	}

	def ci = Action 
	{
		var bodyHtml : Html = body(pages.ci(), false, true)
		var headHtml : Html = head.features()
		var readyHtml : Html = ready.adtech()
		var allHtml : Html = regular("Continuous Integration", bodyHtml, headHtml, readyHtml)

		Ok(allHtml)
	}

	def sneakybug = Action 
	{
		var bodyHtml : Html = body(pages.sneakybug(), false, true)
		var headHtml : Html = head.features()
		var readyHtml : Html = ready.adtech()
		var allHtml : Html = regular("The Sneaky Bug", bodyHtml, headHtml, readyHtml)

		Ok(allHtml)
	}

	def howitworks = Action 
	{
		var bodyHtml : Html = body(pages.howitworks())
		var headHtml : Html = head.howitworks()
		var readyHtml : Html = ready.howitworks()
		var allHtml : Html = regular("How it works?", bodyHtml, headHtml, readyHtml)

		Ok(allHtml)
	}

	def sourceattach = Action 
	{
		Redirect(globals.TAKIPI_SUPPORT_SITE + "/connecting-takipi/source-attach/", 301)
	}

	def logs = Action 
	{
		var bodyHtml : Html = body(pages.logs())
		var allHtml : Html = regular("Logs", bodyHtml)

		Ok(allHtml)
	}

	def jobs = Action
	{
		var bodyHtml : Html = body(pages.jobs())
		var readyHtml : Html = ready.jobs()
		var allHtml : Html = regular("Jobs", bodyHtml, null, readyHtml)

		Ok(allHtml)
	}

	def careers = Action
	{
		Redirect(routes.Application.jobs)
	}

	def tos = Action
	{
		Redirect(routes.Application.terms)
	}

	def terms = Cached("actionApplicationTerms") 
	{
		Action
		{
			var bodyHtml : Html = body(pages.terms())
			var allHtml : Html = regular("Terms Of Service", bodyHtml)

			Ok(allHtml)
		}
	}

	def privacypolicy = Action
	{
		Redirect(routes.Application.privacy)
	}

	def privacy = Cached("actionApplicationPrivacy") 
	{
		Action
		{
			var bodyHtml : Html = body(pages.privacy())
			var allHtml : Html = regular("Privacy Policy", bodyHtml)

			Ok(allHtml)
		}
	}


	def blog = Action
	{
		Redirect(globals.TAKIPI_BLOG, 301)
	}

	def redirectS3(folder: String, link: String) = Action
	{ implicit request =>
		{
			val queryString = parseQueryString(request)
			
			Redirect(globals.OLD_TAKIPI_BUCKET + folder + "/" + link + queryString, 301)
		}
	}

	def redirectHtml(html: String) = Action 
	{ implicit request => 
		{
			println("in redirect " + html + " request: " + request.rawQueryString + "secure:" + request.secure)

			val queryString = parseQueryString(request)
			
			html match 
			{
				case "index.html" => Redirect("/" + queryString)
				case _ => Redirect(html.replace(".html", "") + queryString, 301)
			}
		}
	}

	def parseQueryString(request: RequestHeader): String =
	{
		request.rawQueryString match
		{
			case "" => ""
			case _ => "?" + request.rawQueryString
		}
	}

	def start = Action
	{
		Redirect(routes.BlueSite.product)
	}
}
