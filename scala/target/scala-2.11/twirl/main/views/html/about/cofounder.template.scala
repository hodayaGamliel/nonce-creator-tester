
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
object cofounder extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template8[String,String,String,String,String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(cssClass:String, mail:String, linkedin:String, twitter:String, blog:String, name:String, title:String, about:String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.119*/("""
"""),format.raw/*2.1*/("""<div class="coFounderHolder """),_display_(/*2.30*/cssClass),format.raw/*2.38*/("""">
	<div class="imageArea">
		<div class="image"></div>
		<div class="social">
			<a class="mail" href="mailto:"""),_display_(/*6.34*/mail),format.raw/*6.38*/(""""></a>
			<a class="linkedin" href=""""),_display_(/*7.31*/linkedin),format.raw/*7.39*/("""" target="_blank"></a>
			<a class="twitter" href=""""),_display_(/*8.30*/twitter),format.raw/*8.37*/("""" target="_blank"></a>
			<a class="blog" href=""""),_display_(/*9.27*/blog),format.raw/*9.31*/("""" target="_blank"></a>
		</div>
	</div>
	<div class="about">
		<div class="aboutHeader">"""),_display_(/*13.29*/name),format.raw/*13.33*/(""" """),format.raw/*13.34*/("""<span class="seperator">//</span> """),_display_(/*13.69*/title),format.raw/*13.74*/("""</div>
		<div class="text">
			"""),_display_(/*15.5*/about),format.raw/*15.10*/("""
		"""),format.raw/*16.3*/("""</div>
	</div>
</div>"""))}
  }

  def render(cssClass:String,mail:String,linkedin:String,twitter:String,blog:String,name:String,title:String,about:String): play.twirl.api.HtmlFormat.Appendable = apply(cssClass,mail,linkedin,twitter,blog,name,title,about)

  def f:((String,String,String,String,String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (cssClass,mail,linkedin,twitter,blog,name,title,about) => apply(cssClass,mail,linkedin,twitter,blog,name,title,about)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Apr 15 17:20:36 IDT 2015
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/about/cofounder.scala.html
                  HASH: e8ce0779452e896731af45d05c39dc5b4311c24d
                  MATRIX: 564->1|770->118|797->119|852->148|880->156|1018->268|1042->272|1105->309|1133->317|1211->369|1238->376|1313->425|1337->429|1453->518|1478->522|1507->523|1569->558|1595->563|1653->595|1679->600|1709->603
                  LINES: 19->1|22->1|23->2|23->2|23->2|27->6|27->6|28->7|28->7|29->8|29->8|30->9|30->9|34->13|34->13|34->13|34->13|34->13|36->15|36->15|37->16
                  -- GENERATED --
              */
          