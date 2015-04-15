
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
object monsters extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<div class="backgroundFiller"></div>
<div id="monstersMain" class="subPageMain siteCentered">
	<div class="heading">
		<h1>What's the deal with the monsters?</h1>
		<div class="headerMiniSignup"></div>
	</div>
	<div class="content styled">
		<span>Meet some of the monster exceptions and problems Takipi helps you debug in production -</span>
		<div class="img invalid"></div>
		<div class="img fred"></div>
		<div class="img latency"></div>
		<div class="img null"></div>
		<div class="img index"></div>
		<div class="img stack"></div>
	</div>
	<div class="contentFooter">
		<span>* Yes, we know it's not a problem by itself, but it's such a pain when debugging servers we decided it should have its own monster</span>
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
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/pages/monsters.scala.html
                  HASH: 9fcd4706d15771167be65bc6533c97dbca75dbde
                  MATRIX: 589->0
                  LINES: 22->1
                  -- GENERATED --
              */
          