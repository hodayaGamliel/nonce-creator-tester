
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
object jobs extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<script type="text/javascript">
	$(function() """),format.raw/*2.15*/("""{"""),format.raw/*2.16*/("""
		"""),format.raw/*3.3*/("""initializeNavigationUserHolderElement();
		ModalManagerInst.initialize();
		initializeSocialPopups();
		initializeJobs();

		initializeMiniSignupDialog(".subPageMiniSignupDialog", null, null, null, 
			""""),_display_(/*9.6*/globals/*9.13*/.LOGIN_PAGE),format.raw/*9.24*/("""",
			""""),_display_(/*10.6*/globals/*10.13*/.TAKIPI_APP_INDEX),format.raw/*10.30*/("""",
			""""),_display_(/*11.6*/globals/*11.13*/.SITE_ORIGIN),format.raw/*11.25*/("""",
			""""),_display_(/*12.6*/globals/*12.13*/.TAKIPI_APP),format.raw/*12.24*/("""");
	"""),format.raw/*13.2*/("""}"""),format.raw/*13.3*/(""");
</script>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Apr 15 17:20:38 IDT 2015
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/ready/jobs.scala.html
                  HASH: 59f9c86aefcdacd988cf95c389113e5cd25776cf
                  MATRIX: 585->0|658->46|686->47|715->50|944->254|959->261|990->272|1024->280|1040->287|1078->304|1112->312|1128->319|1161->331|1195->339|1211->346|1243->357|1275->362|1303->363
                  LINES: 22->1|23->2|23->2|24->3|30->9|30->9|30->9|31->10|31->10|31->10|32->11|32->11|32->11|33->12|33->12|33->12|34->13|34->13
                  -- GENERATED --
              */
          