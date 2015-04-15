
package views.html.pages

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._

/**/
object logs extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<div class="backgroundFiller fillBigger"></div>
<div id="logsMain" class="mainPageMain siteCentered">
	<div class="heading">
		<h1>Takipi Log Links</h1>
		<h2>Stop deciphering log errors and see the actual data and code which caused them.</h2>
		<div class="createAccountZone">
			<a id="mainCreateAccountBtn" class="createAccount" href=""""),_display_(/*7.62*/globals/*7.69*/.TAKIPI_CREATE_ACCOUNT),format.raw/*7.91*/(""""></a>
			<div class="javaScala">Java/Scala developers</div>
			<div class="noCredit">Free trial, no credit card required</div>
		</div>
	</div>
	<div class="content styled">
		<h3>Takipi makes your log files smarter by connecting them directly to your code. For each error in your log you'll now automatically see - </h3>
		<ul class="stepsList">
			<li>The actual variable and object values across the stack.</li>
			<li>The exact source code which executed at the moment the error occurred.</li>
			<li>The rate of the error across all your machines, and in which deployment it first appeared.</li>
		</ul>
		<div class="infographicHolder">
			<div class="logsInfographic"></div>
		</div>
		<h3>Whenever an error is logged, Takipi automatically appends a tiny URL to it. Takipi supports Logback, Log4j, SLF4J, Akka logging, Apache JCL & JUL.</h3>
		<h3>Click the link to see the source code and variable values as if you were there at the moment the error occurred.</h3>
		<div class="screenshotHolder">
			<div class="logsScreenshot"></div>
			<div class="logsTerminal"></div>
			<div class="arrow"></div>
		</div>
	</div>
</div>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Apr 15 17:20:38 IDT 2015
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/pages/logs.scala.html
                  HASH: 30b8784390ea6c39bd5820bd5902831426d7c4f4
                  MATRIX: 585->0|950->339|965->346|1007->368
                  LINES: 22->1|28->7|28->7|28->7
                  -- GENERATED --
              */
          