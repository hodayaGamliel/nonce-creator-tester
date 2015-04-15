
package views.html

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
object install extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<div class="footerInstallation">
	<div class="installationContent siteCentered">
		<div class="subPageMiniSignupDialog"></div>
		<div class="miniSignupFred"></div>
	</div>
</div>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Apr 15 17:20:35 IDT 2015
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/install.scala.html
                  HASH: c9b8d9ad1a238437a9e10cea92b16331f66ff788
                  MATRIX: 582->0
                  LINES: 22->1
                  -- GENERATED --
              */
          