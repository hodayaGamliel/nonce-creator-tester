
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
object header extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Boolean,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(isLandingPage: Boolean = false):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.34*/("""
"""),format.raw/*2.1*/("""<div id="header">
	<div class="navigationHolder">
    """),_display_(/*4.6*/if(!isLandingPage)/*4.24*/ {_display_(Seq[Any](format.raw/*4.26*/("""
		"""),format.raw/*5.3*/("""<div class="userHolder">
			<a id="navigation-create-accoun" href=""""),_display_(/*6.44*/globals/*6.51*/.TAKIPI_CREATE_ACCOUNT),format.raw/*6.73*/("""" class="signup navBtn">Sign up</a>
			<a id="navigation-login" href=""""),_display_(/*7.36*/globals/*7.43*/.TAKIPI_APP),format.raw/*7.54*/("""" class="login navText">Login</a>
		</div>
    """)))}),format.raw/*9.6*/("""
		"""),format.raw/*10.3*/("""<a class="takipilogo" href=""""),_display_(/*10.32*/routes/*10.38*/.BlueSite.index),format.raw/*10.53*/("""">Takipi</a>
    """),_display_(/*11.6*/if(!isLandingPage)/*11.24*/ {_display_(Seq[Any](format.raw/*11.26*/("""
		"""),format.raw/*12.3*/("""<ul id="nav">
			<li><a id="navigation-product" href=""""),_display_(/*13.42*/routes/*13.48*/.BlueSite.product),format.raw/*13.65*/("""" class="underlinelink">Product</a></li>
			<li><a id="navigation-how-it-works" href=""""),_display_(/*14.47*/routes/*14.53*/.BlueSite.howitworks),format.raw/*14.73*/("""" class="underlinelink">How it Works</a></li>
			<li>
			    <span id="navigation-solution" class="underlinelink">Solutions</span>
			    <ul class="sub-menu">
			        <li>
			            <span class="navigation-section">Role</span>
			            <ul>
			                <li><a id="navigation-why-takipi-developer" href=""""),_display_(/*21.71*/routes/*21.77*/.BlueSite.whytakipi),format.raw/*21.96*/("""#developer">Developer</a></li>
			                <li><a id="navigation-why-takipi-devops" href=""""),_display_(/*22.68*/routes/*22.74*/.BlueSite.whytakipi),format.raw/*22.93*/("""#devops">Devops</a></li>
			                <li><a id="navigation-why-takipi-engineering-manager" href=""""),_display_(/*23.81*/routes/*23.87*/.BlueSite.whytakipi),format.raw/*23.106*/("""#engineering-manager">Engineering Manager</a></li>
			                <li><a id="navigation-why-takipi-executive" href=""""),_display_(/*24.71*/routes/*24.77*/.BlueSite.whytakipi),format.raw/*24.96*/("""#executive">Executive</a></li>
			            </ul>
			         </li>
			        <li>
			            <span class="navigation-section">Technology</span>
			            <ul>
			                <li><a href=""""),_display_(/*30.34*/routes/*30.40*/.BlueSite.scala),format.raw/*30.55*/("""">Scala</a></li>
			                <li><a href=""""),_display_(/*31.34*/routes/*31.40*/.Application.newrelicnew),format.raw/*31.64*/("""">New Relic</a></li>
			            </ul>
			         </li>
			    </ul>
			</li>
			<li><a id="navigation-pricing" href=""""),_display_(/*36.42*/routes/*36.48*/.BlueSite.pricing),format.raw/*36.65*/("""" class="underlinelink">Pricing</a></li>
			<li>
			    <span id="navigation-company" class="underlinelink">Company</span>
			    <ul class="sub-menu">
			        <li><a id="navigation-about" href=""""),_display_(/*40.48*/routes/*40.54*/.Application.about),format.raw/*40.72*/("""" class="underlinelink">About Us</a></li>
                    <li><a id="navigation-blog" href=""""),_display_(/*41.56*/globals/*41.63*/.TAKIPI_BLOG),format.raw/*41.75*/("""" class="underlinelink" target="_blank">Blog</a></li>
                    <li><a id="navigation-monsters" href=""""),_display_(/*42.60*/routes/*42.66*/.Application.monsters),format.raw/*42.87*/("""" class="underlinelink">Monsters</a></li>
			    </ul>
			</li>
            <li><a id="navigation-support" href=""""),_display_(/*45.51*/globals/*45.58*/.TAKIPI_SUPPORT_SITE),format.raw/*45.78*/("""" class="underlinelink">Docs</a></li>
		</ul>
    """)))}),format.raw/*47.6*/("""
	"""),format.raw/*48.2*/("""</div>
</div>
"""))}
  }

  def render(isLandingPage:Boolean): play.twirl.api.HtmlFormat.Appendable = apply(isLandingPage)

  def f:((Boolean) => play.twirl.api.HtmlFormat.Appendable) = (isLandingPage) => apply(isLandingPage)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Apr 15 17:20:35 IDT 2015
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/header.scala.html
                  HASH: 480c890adc213372daa57dd735555892242b3f70
                  MATRIX: 507->1|627->33|654->34|734->89|760->107|799->109|828->112|922->180|937->187|979->209|1076->280|1091->287|1122->298|1199->346|1229->349|1285->378|1300->384|1336->399|1380->417|1407->435|1447->437|1477->440|1559->495|1574->501|1612->518|1726->605|1741->611|1782->631|2135->957|2150->963|2190->982|2315->1080|2330->1086|2370->1105|2502->1210|2517->1216|2558->1235|2706->1356|2721->1362|2761->1381|2993->1586|3008->1592|3044->1607|3121->1657|3136->1663|3181->1687|3331->1810|3346->1816|3384->1833|3610->2032|3625->2038|3664->2056|3788->2153|3804->2160|3837->2172|3977->2285|3992->2291|4034->2312|4175->2426|4191->2433|4232->2453|4313->2504|4342->2506
                  LINES: 19->1|22->1|23->2|25->4|25->4|25->4|26->5|27->6|27->6|27->6|28->7|28->7|28->7|30->9|31->10|31->10|31->10|31->10|32->11|32->11|32->11|33->12|34->13|34->13|34->13|35->14|35->14|35->14|42->21|42->21|42->21|43->22|43->22|43->22|44->23|44->23|44->23|45->24|45->24|45->24|51->30|51->30|51->30|52->31|52->31|52->31|57->36|57->36|57->36|61->40|61->40|61->40|62->41|62->41|62->41|63->42|63->42|63->42|66->45|66->45|66->45|68->47|69->48
                  -- GENERATED --
              */
          