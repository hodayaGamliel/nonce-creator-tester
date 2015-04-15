
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
object default extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<script type="text/javascript">
	$(function() """),format.raw/*2.15*/("""{"""),format.raw/*2.16*/("""
		"""),format.raw/*3.3*/("""initializeNavigationUserHolderElement();
		ModalManagerInst.initialize();
		initializeSocialPopups();
		
		initializeMiniSignupDialog(".subPageMiniSignupDialog", ".headerMiniSignup", null, null, 
			""""),_display_(/*8.6*/globals/*8.13*/.LOGIN_PAGE),format.raw/*8.24*/("""",
			""""),_display_(/*9.6*/globals/*9.13*/.TAKIPI_APP_INDEX),format.raw/*9.30*/("""",
			""""),_display_(/*10.6*/globals/*10.13*/.SITE_ORIGIN),format.raw/*10.25*/("""",
			""""),_display_(/*11.6*/globals/*11.13*/.TAKIPI_APP),format.raw/*11.24*/("""");
	"""),format.raw/*12.2*/("""}"""),format.raw/*12.3*/(""");
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
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/ready/default.scala.html
                  HASH: a9fcff4d80b4ac02827708e809df7cd5365968be
                  MATRIX: 588->0|661->46|689->47|718->50|944->251|959->258|990->269|1023->277|1038->284|1075->301|1109->309|1125->316|1158->328|1192->336|1208->343|1240->354|1272->359|1300->360
                  LINES: 22->1|23->2|23->2|24->3|29->8|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|32->11|32->11|32->11|33->12|33->12
                  -- GENERATED --
              */
          