
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
object aboutus extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<script type="text/javascript">
	$(function() """),format.raw/*2.15*/("""{"""),format.raw/*2.16*/("""
		"""),format.raw/*3.3*/("""initializeNavigationUserHolderElement();
		ModalManagerInst.initialize();
		initializeSocialPopups();
		initializeAboutUs();
		
		initializeMiniSignupDialog(".subPageMiniSignupDialog", ".headerMiniSignup", null, null, 
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
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/ready/aboutus.scala.html
                  HASH: 7f3e79e5a6e68124d9ecf91ce28b367ce760f73b
                  MATRIX: 588->0|661->46|689->47|718->50|967->274|982->281|1013->292|1047->300|1063->307|1101->324|1135->332|1151->339|1184->351|1218->359|1234->366|1266->377|1298->382|1326->383
                  LINES: 22->1|23->2|23->2|24->3|30->9|30->9|30->9|31->10|31->10|31->10|32->11|32->11|32->11|33->12|33->12|33->12|34->13|34->13
                  -- GENERATED --
              */
          