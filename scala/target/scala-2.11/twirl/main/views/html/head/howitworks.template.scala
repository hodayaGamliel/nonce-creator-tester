
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
object howitworks extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*1.46*/routes/*1.52*/.Assets.at("stylesheets/howitworks/howitworks.css")),format.raw/*1.103*/(""""/>

<script src=""""),_display_(/*3.15*/routes/*3.21*/.Assets.at("javascripts/howitworks/bootstrap-scrollspy.js")),format.raw/*3.80*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*4.15*/routes/*4.21*/.Assets.at("javascripts/howitworks/jquery.textPlaceholder.js")),format.raw/*4.83*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*5.15*/routes/*5.21*/.Assets.at("javascripts/howitworks/jquery.poshytip.js")),format.raw/*5.76*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*6.15*/routes/*6.21*/.Assets.at("javascripts/howitworks/jquery-ui-tabs.js")),format.raw/*6.75*/("""" type="text/javascript"></script>

<script>
	$(document).ready(function()"""),format.raw/*9.30*/("""{"""),format.raw/*9.31*/("""
		"""),format.raw/*10.3*/("""var activeOffset;
		$('.about .info-tabs').tabs("""),format.raw/*11.31*/("""{"""),format.raw/*11.32*/("""
			"""),format.raw/*12.4*/("""show: """),format.raw/*12.10*/("""{"""),format.raw/*12.11*/("""
				"""),format.raw/*13.5*/("""effect: "fade",
				duration: 800
			"""),format.raw/*15.4*/("""}"""),format.raw/*15.5*/(""",
			create: function(event, ui)"""),format.raw/*16.31*/("""{"""),format.raw/*16.32*/("""
				"""),format.raw/*17.5*/("""$('<li class="rule"/>').prependTo($('.about .nav-tabs'));
				$('.about .nav-tabs li').each(function()"""),format.raw/*18.45*/("""{"""),format.raw/*18.46*/("""
					"""),format.raw/*19.6*/("""var this_ =$(this);
					if(this_.hasClass('ui-state-active'))"""),format.raw/*20.43*/("""{"""),format.raw/*20.44*/("""
						"""),format.raw/*21.7*/("""activeOffset = this_.position().left;
					"""),format.raw/*22.6*/("""}"""),format.raw/*22.7*/(""";
				"""),format.raw/*23.5*/("""}"""),format.raw/*23.6*/(""");
			"""),format.raw/*24.4*/("""}"""),format.raw/*24.5*/(""",
			activate:function(event,ui)"""),format.raw/*25.31*/("""{"""),format.raw/*25.32*/("""
				"""),format.raw/*26.5*/("""$('.about .nav-tabs li').each(function()"""),format.raw/*26.45*/("""{"""),format.raw/*26.46*/("""
					"""),format.raw/*27.6*/("""var this_ =$(this);
					if(this_.hasClass('ui-state-active'))"""),format.raw/*28.43*/("""{"""),format.raw/*28.44*/("""
						"""),format.raw/*29.7*/("""activeOffset = this_.position().left;
					"""),format.raw/*30.6*/("""}"""),format.raw/*30.7*/(""";
				"""),format.raw/*31.5*/("""}"""),format.raw/*31.6*/(""");
				console.log(activeOffset);
			"""),format.raw/*33.4*/("""}"""),format.raw/*33.5*/("""
		"""),format.raw/*34.3*/("""}"""),format.raw/*34.4*/(""");
		$('.about .nav-tabs li').each(function()"""),format.raw/*35.43*/("""{"""),format.raw/*35.44*/("""
			"""),format.raw/*36.4*/("""var this_ =$(this),
				offset_ = this_.position().left,
				rule_ = this_.siblings('.rule'),
				index_ = this_.index();
			if(offset_ == 0)"""),format.raw/*40.20*/("""{"""),format.raw/*40.21*/("""
				"""),format.raw/*41.5*/("""this_.addClass('first')
			"""),format.raw/*42.4*/("""}"""),format.raw/*42.5*/(""";
			if(offset_ == 0)"""),format.raw/*43.20*/("""{"""),format.raw/*43.21*/("""
				"""),format.raw/*44.5*/("""rule_.addClass('left');
			"""),format.raw/*45.4*/("""}"""),format.raw/*45.5*/(""";
			this_.click(function()"""),format.raw/*46.26*/("""{"""),format.raw/*46.27*/("""
				"""),format.raw/*47.5*/("""rule_.css("""),format.raw/*47.15*/("""{"""),format.raw/*47.16*/("""
					"""),format.raw/*48.6*/("""left: offset_ 
				"""),format.raw/*49.5*/("""}"""),format.raw/*49.6*/(""");
				if(offset_ == 0)"""),format.raw/*50.21*/("""{"""),format.raw/*50.22*/("""
					"""),format.raw/*51.6*/("""rule_.removeClass('right').addClass('left');
				"""),format.raw/*52.5*/("""}"""),format.raw/*52.6*/("""else if(this_.is(':last-child'))"""),format.raw/*52.38*/("""{"""),format.raw/*52.39*/("""
					"""),format.raw/*53.6*/("""rule_.removeClass('left').addClass('right');
				"""),format.raw/*54.5*/("""}"""),format.raw/*54.6*/("""else"""),format.raw/*54.10*/("""{"""),format.raw/*54.11*/("""
					"""),format.raw/*55.6*/("""rule_.removeClass('left').removeClass('right');
				"""),format.raw/*56.5*/("""}"""),format.raw/*56.6*/(""";
			"""),format.raw/*57.4*/("""}"""),format.raw/*57.5*/(""");
			
		"""),format.raw/*59.3*/("""}"""),format.raw/*59.4*/(""");
		
		$('.about .info-tabs .descr').append('<span class="line"></span>');
		
		$('.about .info-tabs .descr-list').each(function()"""),format.raw/*63.53*/("""{"""),format.raw/*63.54*/("""
			"""),format.raw/*64.4*/("""var i=0;
			$(this).find('.descr').each(function()"""),format.raw/*65.42*/("""{"""),format.raw/*65.43*/("""
				"""),format.raw/*66.5*/("""i++
				var this_ = $(this);
				$('<span class="num">' + i + '.</span>').prependTo(this_);
			"""),format.raw/*69.4*/("""}"""),format.raw/*69.5*/(""");
		"""),format.raw/*70.3*/("""}"""),format.raw/*70.4*/(""");
	"""),format.raw/*71.2*/("""}"""),format.raw/*71.3*/(""");
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
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/head/howitworks.scala.html
                  HASH: 46310c28e6aa6a77b48f3ffe4cc91f0a9ba15ad2
                  MATRIX: 590->0|661->45|675->51|747->102|792->121|806->127|885->186|960->235|974->241|1056->303|1131->352|1145->358|1220->413|1295->462|1309->468|1383->522|1484->596|1512->597|1542->600|1618->648|1647->649|1678->653|1712->659|1741->660|1773->665|1837->702|1865->703|1925->735|1954->736|1986->741|2116->843|2145->844|2178->850|2268->912|2297->913|2331->920|2401->963|2429->964|2462->970|2490->971|2523->977|2551->978|2611->1010|2640->1011|2672->1016|2740->1056|2769->1057|2802->1063|2892->1125|2921->1126|2955->1133|3025->1176|3053->1177|3086->1183|3114->1184|3178->1221|3206->1222|3236->1225|3264->1226|3337->1271|3366->1272|3397->1276|3566->1417|3595->1418|3627->1423|3681->1450|3709->1451|3758->1472|3787->1473|3819->1478|3873->1505|3901->1506|3956->1533|3985->1534|4017->1539|4055->1549|4084->1550|4117->1556|4163->1575|4191->1576|4242->1599|4271->1600|4304->1606|4380->1655|4408->1656|4468->1688|4497->1689|4530->1695|4606->1744|4634->1745|4666->1749|4695->1750|4728->1756|4807->1808|4835->1809|4867->1814|4895->1815|4931->1824|4959->1825|5118->1956|5147->1957|5178->1961|5256->2011|5285->2012|5317->2017|5439->2112|5467->2113|5499->2118|5527->2119|5558->2123|5586->2124
                  LINES: 22->1|22->1|22->1|22->1|24->3|24->3|24->3|25->4|25->4|25->4|26->5|26->5|26->5|27->6|27->6|27->6|30->9|30->9|31->10|32->11|32->11|33->12|33->12|33->12|34->13|36->15|36->15|37->16|37->16|38->17|39->18|39->18|40->19|41->20|41->20|42->21|43->22|43->22|44->23|44->23|45->24|45->24|46->25|46->25|47->26|47->26|47->26|48->27|49->28|49->28|50->29|51->30|51->30|52->31|52->31|54->33|54->33|55->34|55->34|56->35|56->35|57->36|61->40|61->40|62->41|63->42|63->42|64->43|64->43|65->44|66->45|66->45|67->46|67->46|68->47|68->47|68->47|69->48|70->49|70->49|71->50|71->50|72->51|73->52|73->52|73->52|73->52|74->53|75->54|75->54|75->54|75->54|76->55|77->56|77->56|78->57|78->57|80->59|80->59|84->63|84->63|85->64|86->65|86->65|87->66|90->69|90->69|91->70|91->70|92->71|92->71
                  -- GENERATED --
              */
          