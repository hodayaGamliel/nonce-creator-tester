
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
object body extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Html,Boolean,Boolean,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(content: Html, skipFooter: Boolean = false, skipInstall: Boolean = false):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.76*/("""
"""),format.raw/*2.1*/("""<div id="wrapper">
	"""),_display_(/*3.3*/header()),format.raw/*3.11*/("""
	"""),_display_(/*4.3*/content),format.raw/*4.10*/("""
	"""),_display_(/*5.3*/if(!skipInstall)/*5.19*/ {_display_(Seq[Any](format.raw/*5.21*/("""
		"""),_display_(/*6.4*/install()),format.raw/*6.13*/("""
	""")))}),format.raw/*7.3*/("""
	"""),_display_(/*8.3*/if(!skipFooter)/*8.18*/ {_display_(Seq[Any](format.raw/*8.20*/("""
		"""),_display_(/*9.4*/footer(true)),format.raw/*9.16*/("""
	""")))}),format.raw/*10.3*/("""
"""),format.raw/*11.1*/("""</div>"""))}
  }

  def render(content:Html,skipFooter:Boolean,skipInstall:Boolean): play.twirl.api.HtmlFormat.Appendable = apply(content,skipFooter,skipInstall)

  def f:((Html,Boolean,Boolean) => play.twirl.api.HtmlFormat.Appendable) = (content,skipFooter,skipInstall) => apply(content,skipFooter,skipInstall)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Apr 15 17:20:35 IDT 2015
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/body.scala.html
                  HASH: a79fc487cc5d5e774ac1f9dbec088d22a74157b9
                  MATRIX: 518->1|680->75|707->76|753->97|781->105|809->108|836->115|864->118|888->134|927->136|956->140|985->149|1017->152|1045->155|1068->170|1107->172|1136->176|1168->188|1201->191|1229->192
                  LINES: 19->1|22->1|23->2|24->3|24->3|25->4|25->4|26->5|26->5|26->5|27->6|27->6|28->7|29->8|29->8|29->8|30->9|30->9|31->10|32->11
                  -- GENERATED --
              */
          