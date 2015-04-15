
package views.html.head

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

Seq[Any](format.raw/*1.1*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*1.46*/routes/*1.52*/.Assets.at("stylesheets/pricing/pricing.css")),format.raw/*1.97*/(""""/>

<script>
	$(document).ready(function()"""),format.raw/*4.30*/("""{"""),format.raw/*4.31*/("""
		"""),format.raw/*5.3*/("""$('.plans-area .btn-switch').click (function()"""),format.raw/*5.49*/("""{"""),format.raw/*5.50*/("""
			"""),format.raw/*6.4*/("""$(this).toggleClass('on');
			if ($(this).hasClass('on')) """),format.raw/*7.32*/("""{"""),format.raw/*7.33*/("""
				"""),format.raw/*8.5*/("""$('.plans-area .box .price .num-1').countTo("""),format.raw/*8.49*/("""{"""),format.raw/*8.50*/("""
					"""),format.raw/*9.6*/("""from: 59,
					to: 49,
					speed: 250,
				"""),format.raw/*12.5*/("""}"""),format.raw/*12.6*/(""");
				$('.plans-area .box .price .num-2').countTo("""),format.raw/*13.49*/("""{"""),format.raw/*13.50*/("""
					"""),format.raw/*14.6*/("""from: 85,
					to: 69,
					speed: 250,
				"""),format.raw/*17.5*/("""}"""),format.raw/*17.6*/(""");
				
				$(".planInterval").text("yearly");
			"""),format.raw/*20.4*/("""}"""),format.raw/*20.5*/("""
			"""),format.raw/*21.4*/("""else """),format.raw/*21.9*/("""{"""),format.raw/*21.10*/("""
				"""),format.raw/*22.5*/("""$('.plans-area .box .price .num-1').countTo("""),format.raw/*22.49*/("""{"""),format.raw/*22.50*/("""
					"""),format.raw/*23.6*/("""from: 49,
					to: 59,
					speed: 250,
				"""),format.raw/*26.5*/("""}"""),format.raw/*26.6*/(""");
				$('.plans-area .box .price .num-2').countTo("""),format.raw/*27.49*/("""{"""),format.raw/*27.50*/("""
					"""),format.raw/*28.6*/("""from: 69,
					to: 85,
					speed: 250,
				"""),format.raw/*31.5*/("""}"""),format.raw/*31.6*/(""");
				
				$(".planInterval").text("monthly");
			"""),format.raw/*34.4*/("""}"""),format.raw/*34.5*/("""
			"""),format.raw/*35.4*/("""return false;
		"""),format.raw/*36.3*/("""}"""),format.raw/*36.4*/(""");
	"""),format.raw/*37.2*/("""}"""),format.raw/*37.3*/(""");

	$(window).load(function()"""),format.raw/*39.27*/("""{"""),format.raw/*39.28*/("""
		"""),format.raw/*40.3*/("""$('[data-equal-height]').make_children_equal_height();
		$(window).resize(function() """),format.raw/*41.31*/("""{"""),format.raw/*41.32*/(""" 
			"""),format.raw/*42.4*/("""$('[data-equal-height]').make_children_equal_height()
		"""),format.raw/*43.3*/("""}"""),format.raw/*43.4*/(""");
	"""),format.raw/*44.2*/("""}"""),format.raw/*44.3*/(""");
</script>
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Apr 15 17:20:37 IDT 2015
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/head/pricing.scala.html
                  HASH: 1e50b91e172801c2e65d98e57bde894a03304253
                  MATRIX: 587->0|658->45|672->51|737->96|807->139|835->140|864->143|937->189|965->190|995->194|1080->252|1108->253|1139->258|1210->302|1238->303|1270->309|1341->353|1369->354|1448->405|1477->406|1510->412|1581->456|1609->457|1686->507|1714->508|1745->512|1777->517|1806->518|1838->523|1910->567|1939->568|1972->574|2043->618|2071->619|2150->670|2179->671|2212->677|2283->721|2311->722|2389->773|2417->774|2448->778|2491->794|2519->795|2550->799|2578->800|2636->830|2665->831|2695->834|2808->919|2837->920|2869->925|2952->981|2980->982|3011->986|3039->987
                  LINES: 22->1|22->1|22->1|22->1|25->4|25->4|26->5|26->5|26->5|27->6|28->7|28->7|29->8|29->8|29->8|30->9|33->12|33->12|34->13|34->13|35->14|38->17|38->17|41->20|41->20|42->21|42->21|42->21|43->22|43->22|43->22|44->23|47->26|47->26|48->27|48->27|49->28|52->31|52->31|55->34|55->34|56->35|57->36|57->36|58->37|58->37|60->39|60->39|61->40|62->41|62->41|63->42|64->43|64->43|65->44|65->44
                  -- GENERATED --
              */
          