
package views.html.head

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
object scala extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<!--<script src=""""),_display_(/*1.19*/routes/*1.25*/.Assets.at("javascripts/takipiReleaseOutside.min.js")),format.raw/*1.78*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*2.15*/routes/*2.21*/.Assets.at("javascripts/bubblesUtil.min.js")),format.raw/*2.65*/("""" type="text/javascript"></script>-->"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Apr 15 17:20:37 IDT 2015
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/head/scala.scala.html
                  HASH: 9fe2009fc2a182f4036d96163832789dd72f60f8
                  MATRIX: 585->0|629->18|643->24|716->77|791->126|805->132|869->176
                  LINES: 22->1|22->1|22->1|22->1|23->2|23->2|23->2
                  -- GENERATED --
              */
          