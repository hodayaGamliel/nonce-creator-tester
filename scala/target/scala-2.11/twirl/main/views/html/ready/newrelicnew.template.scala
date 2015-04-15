
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
object newrelicnew extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<link rel="stylesheet" href="assets/stylesheets/newrelic.css">
<script src="assets/javascripts/newrelic.js" type="text/javascript"></script>

<script type="text/javascript">
	$(function() """),format.raw/*5.15*/("""{"""),format.raw/*5.16*/("""
		"""),format.raw/*6.3*/("""initializeNavigationUserHolderElement();
		ModalManagerInst.initialize();
		initializeSocialPopups();

		initializeMiniSignupDialog(".subPageMiniSignupDialog", null, null, "<div>Free Trial</div><div>Java / Scala developers</div>", 
			""""),_display_(/*11.6*/globals/*11.13*/.LOGIN_PAGE),format.raw/*11.24*/("""",
			""""),_display_(/*12.6*/globals/*12.13*/.TAKIPI_APP_INDEX),format.raw/*12.30*/("""",
			""""),_display_(/*13.6*/globals/*13.13*/.SITE_ORIGIN),format.raw/*13.25*/("""",
			""""),_display_(/*14.6*/globals/*14.13*/.TAKIPI_APP),format.raw/*14.24*/("""");

		initializeMiniSignupDialog(".subPageMiniSignupDialogMiddle", null, "Get Takipi", "Java / Scala developers", 
			""""),_display_(/*17.6*/globals/*17.13*/.LOGIN_PAGE),format.raw/*17.24*/("""",
			""""),_display_(/*18.6*/globals/*18.13*/.TAKIPI_APP_INDEX),format.raw/*18.30*/("""",
			""""),_display_(/*19.6*/globals/*19.13*/.SITE_ORIGIN),format.raw/*19.25*/("""",
			""""),_display_(/*20.6*/globals/*20.13*/.TAKIPI_APP),format.raw/*20.24*/("""",
			"top");
	"""),format.raw/*22.2*/("""}"""),format.raw/*22.3*/(""");
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
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/ready/newrelicnew.scala.html
                  HASH: 33ea2c2b18664d5310d5bde1ebf7010c865f9e90
                  MATRIX: 592->0|807->188|835->189|864->192|1127->429|1143->436|1175->447|1209->455|1225->462|1263->479|1297->487|1313->494|1346->506|1380->514|1396->521|1428->532|1575->653|1591->660|1623->671|1657->679|1673->686|1711->703|1745->711|1761->718|1794->730|1828->738|1844->745|1876->756|1918->771|1946->772
                  LINES: 22->1|26->5|26->5|27->6|32->11|32->11|32->11|33->12|33->12|33->12|34->13|34->13|34->13|35->14|35->14|35->14|38->17|38->17|38->17|39->18|39->18|39->18|40->19|40->19|40->19|41->20|41->20|41->20|43->22|43->22
                  -- GENERATED --
              */
          