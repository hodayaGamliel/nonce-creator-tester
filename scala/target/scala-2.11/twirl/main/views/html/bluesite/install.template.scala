
package views.html.bluesite

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
object install extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Boolean,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(showInstallWizard: Boolean = false):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.38*/("""
"""),format.raw/*2.1*/("""<div class="bottom-form">
	<div class="container">
		<header>
			<h2>Simple installation</h2>
			<p>Takipi installs in minutes as a simple Java agent.</p>
			<p>No code changes, annotations, dependencies, or build configurations needed.</p>
			<p>Linux, OS X, and Windows. Java 6-8.</p>
		</header>
	</div>
	"""),_display_(/*11.3*/if(showInstallWizard)/*11.24*/ {_display_(Seq[Any](format.raw/*11.26*/("""
		"""),_display_(/*12.4*/bluesite/*12.12*/.installationwizard()),format.raw/*12.33*/("""
	""")))}),format.raw/*13.3*/("""
	"""),format.raw/*14.2*/("""<div id="start-area" class="start-form takipiMiniSignupForm">
		<form action="#">
			<div class="row">
				<input class="text emailInput" type="email" placeholder="Email address">
				<input class="btn-submit createStubAccountBtn" type="submit" value="Start using Takipi &#62;&#62;" >
			</div>
			<div class="errorLabel">User already exists <a class="loginLink" href=""""),_display_(/*20.76*/globals/*20.83*/.LOGIN_PAGE),format.raw/*20.94*/("""">Log in</a></div>
			<p>Java / Scala</p>
		</form>
	</div><!-- end start-form -->
</div><!-- bottom-form -->"""))}
  }

  def render(showInstallWizard:Boolean): play.twirl.api.HtmlFormat.Appendable = apply(showInstallWizard)

  def f:((Boolean) => play.twirl.api.HtmlFormat.Appendable) = (showInstallWizard) => apply(showInstallWizard)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Apr 15 17:20:36 IDT 2015
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/bluesite/install.scala.html
                  HASH: 1eec1c4e1eac3a835351775dbeeb4b090caa08f6
                  MATRIX: 517->1|641->37|668->38|1003->347|1033->368|1073->370|1103->374|1120->382|1162->403|1195->406|1224->408|1621->778|1637->785|1669->796
                  LINES: 19->1|22->1|23->2|32->11|32->11|32->11|33->12|33->12|33->12|34->13|35->14|41->20|41->20|41->20
                  -- GENERATED --
              */
          