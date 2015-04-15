
package views.html.ready

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
object indexnew extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<link rel="stylesheet" href="assets/stylesheets/indexnew.css">
<script src="assets/javascripts/indexnew.js" type="text/javascript"></script>

<script type="text/javascript">
	$(function() """),format.raw/*5.15*/("""{"""),format.raw/*5.16*/("""
		"""),format.raw/*6.3*/("""if ($.cookie("takipiIsLoggedIn"))
		"""),format.raw/*7.3*/("""{"""),format.raw/*7.4*/("""
			"""),format.raw/*8.4*/("""location.href = "https://app.takipi.com/";
		"""),format.raw/*9.3*/("""}"""),format.raw/*9.4*/("""
				
		"""),format.raw/*11.3*/("""initializeNavigationUserHolderElement();
		ModalManagerInst.initialize();
		initializeSocialPopups();

		initializeBareMiniSignupDialog(".indexHeaderMiniSignup", null,
			""""),_display_(/*16.6*/globals/*16.13*/.LOGIN_PAGE),format.raw/*16.24*/("""",
			""""),_display_(/*17.6*/globals/*17.13*/.TAKIPI_APP_INDEX),format.raw/*17.30*/("""",
			""""),_display_(/*18.6*/globals/*18.13*/.SITE_ORIGIN),format.raw/*18.25*/("""",
			""""),_display_(/*19.6*/globals/*19.13*/.TAKIPI_APP),format.raw/*19.24*/("""");

		initializeBareMiniSignupDialog(".indexFooterMiniSignup", null,
			""""),_display_(/*22.6*/globals/*22.13*/.LOGIN_PAGE),format.raw/*22.24*/("""",
			""""),_display_(/*23.6*/globals/*23.13*/.TAKIPI_APP_INDEX),format.raw/*23.30*/("""",
			""""),_display_(/*24.6*/globals/*24.13*/.SITE_ORIGIN),format.raw/*24.25*/("""",
			""""),_display_(/*25.6*/globals/*25.13*/.TAKIPI_APP),format.raw/*25.24*/("""");
	"""),format.raw/*26.2*/("""}"""),format.raw/*26.3*/(""");
</script>
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Apr 15 17:20:38 IDT 2015
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/ready/indexnew.scala.html
                  HASH: 3cd515804f14763e7c1b5a6b83d3e459d01ee350
                  MATRIX: 589->0|804->188|832->189|861->192|923->228|950->229|980->233|1051->278|1078->279|1113->287|1312->460|1328->467|1360->478|1394->486|1410->493|1448->510|1482->518|1498->525|1531->537|1565->545|1581->552|1613->563|1714->638|1730->645|1762->656|1796->664|1812->671|1850->688|1884->696|1900->703|1933->715|1967->723|1983->730|2015->741|2047->746|2075->747
                  LINES: 22->1|26->5|26->5|27->6|28->7|28->7|29->8|30->9|30->9|32->11|37->16|37->16|37->16|38->17|38->17|38->17|39->18|39->18|39->18|40->19|40->19|40->19|43->22|43->22|43->22|44->23|44->23|44->23|45->24|45->24|45->24|46->25|46->25|46->25|47->26|47->26
                  -- GENERATED --
              */
          