
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
object pricing extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<script type="text/javascript">
	$(function() """),format.raw/*2.15*/("""{"""),format.raw/*2.16*/("""
		"""),format.raw/*3.3*/("""if (window.mixpanel)
		"""),format.raw/*4.3*/("""{"""),format.raw/*4.4*/("""
			"""),format.raw/*5.4*/("""mp_site_pricing_init();
		"""),format.raw/*6.3*/("""}"""),format.raw/*6.4*/("""
		
		"""),format.raw/*8.3*/("""initializeNavigationUserHolderElement();
		ModalManagerInst.initialize();
		initializeSocialPopups();
		
		initializeMiniSignupDialog(".subPageMiniSignupDialog", ".headerMiniSignup", null, null, 
			""""),_display_(/*13.6*/globals/*13.13*/.LOGIN_PAGE),format.raw/*13.24*/("""",
			""""),_display_(/*14.6*/globals/*14.13*/.TAKIPI_APP_INDEX),format.raw/*14.30*/("""",
			""""),_display_(/*15.6*/globals/*15.13*/.SITE_ORIGIN),format.raw/*15.25*/("""",
			""""),_display_(/*16.6*/globals/*16.13*/.TAKIPI_APP),format.raw/*16.24*/("""");
	"""),format.raw/*17.2*/("""}"""),format.raw/*17.3*/(""");
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
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/ready/pricing.scala.html
                  HASH: 799a0c97da5661cd6a34664860ca1d49b1737548
                  MATRIX: 588->0|661->46|689->47|718->50|767->73|794->74|824->78|876->104|903->105|935->111|1162->312|1178->319|1210->330|1244->338|1260->345|1298->362|1332->370|1348->377|1381->389|1415->397|1431->404|1463->415|1495->420|1523->421
                  LINES: 22->1|23->2|23->2|24->3|25->4|25->4|26->5|27->6|27->6|29->8|34->13|34->13|34->13|35->14|35->14|35->14|36->15|36->15|36->15|37->16|37->16|37->16|38->17|38->17
                  -- GENERATED --
              */
          