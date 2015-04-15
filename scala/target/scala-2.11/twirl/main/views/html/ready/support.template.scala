
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
object support extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<script type="text/javascript">
	$(function() """),format.raw/*2.15*/("""{"""),format.raw/*2.16*/("""
		"""),format.raw/*3.3*/("""initializeNavigationUserHolderElement();
		ModalManagerInst.initialize();
		initializeSocialPopups();
		initializeFaq();
		initSelectCodeElement();
		initShowZopim();
		
		initializeMiniSignupDialog(".subPageMiniSignupDialog", ".headerMiniSignup", null, null,  
			""""),_display_(/*11.6*/globals/*11.13*/.LOGIN_PAGE),format.raw/*11.24*/("""",
			""""),_display_(/*12.6*/globals/*12.13*/.TAKIPI_APP_INDEX),format.raw/*12.30*/("""",
			""""),_display_(/*13.6*/globals/*13.13*/.SITE_ORIGIN),format.raw/*13.25*/("""",
			""""),_display_(/*14.6*/globals/*14.13*/.TAKIPI_APP),format.raw/*14.24*/("""");
	"""),format.raw/*15.2*/("""}"""),format.raw/*15.3*/(""");
</script>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Apr 15 17:20:38 IDT 2015
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/ready/support.scala.html
                  HASH: 8d6f033a7fff4db6821bd6de185e0f821ceca87c
                  MATRIX: 588->0|661->46|689->47|718->50|1011->317|1027->324|1059->335|1093->343|1109->350|1147->367|1181->375|1197->382|1230->394|1264->402|1280->409|1312->420|1344->425|1372->426
                  LINES: 22->1|23->2|23->2|24->3|32->11|32->11|32->11|33->12|33->12|33->12|34->13|34->13|34->13|35->14|35->14|35->14|36->15|36->15
                  -- GENERATED --
              */
          