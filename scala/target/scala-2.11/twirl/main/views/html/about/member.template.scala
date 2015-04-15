
package views.html.about

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
object member extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(cssClass:String, name:String, title:String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.46*/("""
"""),format.raw/*2.1*/("""<div class="memberHolder """),_display_(/*2.27*/cssClass),format.raw/*2.35*/("""">
	<div class="image"></div>
	<div class="name">"""),_display_(/*4.21*/name),format.raw/*4.25*/("""</div>
	<div class="title">"""),_display_(/*5.22*/title),format.raw/*5.27*/("""</div>
</div>"""))}
  }

  def render(cssClass:String,name:String,title:String): play.twirl.api.HtmlFormat.Appendable = apply(cssClass,name,title)

  def f:((String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (cssClass,name,title) => apply(cssClass,name,title)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Apr 15 17:20:36 IDT 2015
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/about/member.scala.html
                  HASH: 107c7f1d9d9e9346f8bf1dd93d7cd0ce92acb6aa
                  MATRIX: 526->1|658->45|685->46|737->72|765->80|841->130|865->134|919->162|944->167
                  LINES: 19->1|22->1|23->2|23->2|23->2|25->4|25->4|26->5|26->5
                  -- GENERATED --
              */
          