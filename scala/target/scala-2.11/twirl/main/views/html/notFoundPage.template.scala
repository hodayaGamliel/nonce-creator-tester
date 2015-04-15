
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
object notFoundPage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(path: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.16*/("""
"""),format.raw/*2.1*/("""<div class="backgroundFiller"></div>
	<div id="faqMain" class="subPageMain siteCentered">
		<div class="heading">
			<h1>404</h1>
			<div class="subHeader"></div>
			<div class="monster"></div>
			<div class="headerMiniSignup"></div>
		</div>
		<div class="content styled">
		<div class="category general">
			<img src=""""),_display_(/*12.15*/routes/*12.21*/.Assets.at("images/218_404.jpg")),format.raw/*12.53*/(""""/>
		</div>
	</div>
</div>
"""))}
  }

  def render(path:String): play.twirl.api.HtmlFormat.Appendable = apply(path)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (path) => apply(path)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Apr 15 17:20:35 IDT 2015
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/notFoundPage.scala.html
                  HASH: ccd33f14f7d7d0b74c3fbd39e82d4a2cdb811058
                  MATRIX: 512->1|614->15|641->16|989->337|1004->343|1057->375
                  LINES: 19->1|22->1|23->2|33->12|33->12|33->12
                  -- GENERATED --
              */
          