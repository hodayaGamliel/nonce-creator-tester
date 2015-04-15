
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
object body extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Html,Boolean,Boolean,Boolean,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(content: Html, skipInstall: Boolean = false, showInstallWizard: Boolean = false, isLandingPage: Boolean = false):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.115*/("""
"""),format.raw/*2.1*/("""<div id="wrapper" """),_display_(/*2.20*/if(isLandingPage)/*2.37*/{_display_(Seq[Any](format.raw/*2.38*/("""class="landing"""")))}),format.raw/*2.54*/(""">
	"""),_display_(/*3.3*/header(isLandingPage)),format.raw/*3.24*/("""
	"""),_display_(/*4.3*/content),format.raw/*4.10*/("""
	"""),_display_(/*5.3*/if(!skipInstall)/*5.19*/ {_display_(Seq[Any](format.raw/*5.21*/("""
		"""),_display_(/*6.4*/bluesite/*6.12*/.install(showInstallWizard)),format.raw/*6.39*/("""
	""")))}),format.raw/*7.3*/("""
	"""),_display_(/*8.3*/footer(!isLandingPage, isLandingPage)),format.raw/*8.40*/("""
"""),format.raw/*9.1*/("""</div>"""))}
  }

  def render(content:Html,skipInstall:Boolean,showInstallWizard:Boolean,isLandingPage:Boolean): play.twirl.api.HtmlFormat.Appendable = apply(content,skipInstall,showInstallWizard,isLandingPage)

  def f:((Html,Boolean,Boolean,Boolean) => play.twirl.api.HtmlFormat.Appendable) = (content,skipInstall,showInstallWizard,isLandingPage) => apply(content,skipInstall,showInstallWizard,isLandingPage)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Apr 15 17:20:36 IDT 2015
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/bluesite/body.scala.html
                  HASH: 8001317587918f92d2cc1d18b2d9bb7e8df54ce4
                  MATRIX: 535->1|737->114|764->115|809->134|834->151|872->152|918->168|947->172|988->193|1016->196|1043->203|1071->206|1095->222|1134->224|1163->228|1179->236|1226->263|1258->266|1286->269|1343->306|1370->307
                  LINES: 19->1|22->1|23->2|23->2|23->2|23->2|23->2|24->3|24->3|25->4|25->4|26->5|26->5|26->5|27->6|27->6|27->6|28->7|29->8|29->8|30->9
                  -- GENERATED --
              */
          