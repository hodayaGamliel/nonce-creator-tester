
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
object features extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*1.46*/routes/*1.52*/.Assets.at("stylesheets/features/features.css")),format.raw/*1.99*/(""""/>

<script src=""""),_display_(/*3.15*/routes/*3.21*/.Assets.at("javascripts/features/bootstrap-scrollspy.js")),format.raw/*3.78*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*4.15*/routes/*4.21*/.Assets.at("javascripts/features/jquery.textPlaceholder.js")),format.raw/*4.81*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*5.15*/routes/*5.21*/.Assets.at("javascripts/features/jquery.poshytip.js")),format.raw/*5.74*/("""" type="text/javascript"></script>

<script>
	$(document).ready(function()"""),format.raw/*8.30*/("""{"""),format.raw/*8.31*/("""
		
		"""),format.raw/*10.3*/("""$('.features-area .visual .link').click(function() """),format.raw/*10.54*/("""{"""),format.raw/*10.55*/("""
			"""),format.raw/*11.4*/("""$(this).hide();
			$('.features-area .visual .img-02').fadeIn();
		return false;
		"""),format.raw/*14.3*/("""}"""),format.raw/*14.4*/(""");
		
		$('[placeholder]').textPlaceholder();
		
		$('.analysis-form a.btn-submit').click(function() """),format.raw/*18.53*/("""{"""),format.raw/*18.54*/("""
			"""),format.raw/*19.4*/("""$.ajax("""),format.raw/*19.11*/("""{"""),format.raw/*19.12*/("""
				"""),format.raw/*20.5*/("""type: "POST",
				url: "https://app.takipi.com/app/notifyslowdownbeta",
				data: $('.analysis-form input.txt').val()"""),format.raw/*22.46*/("""}"""),format.raw/*22.47*/(""")
				.success(function(data)
				"""),format.raw/*24.5*/("""{"""),format.raw/*24.6*/("""
					"""),format.raw/*25.6*/("""if (data == "true") """),format.raw/*25.26*/("""{"""),format.raw/*25.27*/("""
						"""),format.raw/*26.7*/("""$('.input-div').hide();
						$('#learnMoreHeaderSpan').text("Done! We'll be in touch.");
					"""),format.raw/*28.6*/("""}"""),format.raw/*28.7*/("""
				"""),format.raw/*29.5*/("""}"""),format.raw/*29.6*/(""")
				.error(function(data)
				"""),format.raw/*31.5*/("""{"""),format.raw/*31.6*/("""
					"""),format.raw/*32.6*/("""console.log(data);
				"""),format.raw/*33.5*/("""}"""),format.raw/*33.6*/(""");
			
			return false;
		"""),format.raw/*36.3*/("""}"""),format.raw/*36.4*/(""");
		
		var $target = $('.features-area').find('.detect');
		
		if ($target.length > 0)
		"""),format.raw/*41.3*/("""{"""),format.raw/*41.4*/("""
			"""),format.raw/*42.4*/("""(function() """),format.raw/*42.16*/("""{"""),format.raw/*42.17*/("""
				"""),format.raw/*43.5*/("""setTimeout(function() """),format.raw/*43.27*/("""{"""),format.raw/*43.28*/("""
					"""),format.raw/*44.6*/("""var $bubble = $target.find('.bubble'),
						topOffset = $target.offset().top,
						allowAnimation = true;
					
					$(window).scroll(function() """),format.raw/*48.34*/("""{"""),format.raw/*48.35*/("""
						"""),format.raw/*49.7*/("""var tmp = $(window).scrollTop();
						
						if (tmp >= topOffset) """),format.raw/*51.29*/("""{"""),format.raw/*51.30*/("""
							"""),format.raw/*52.8*/("""if (allowAnimation) """),format.raw/*52.28*/("""{"""),format.raw/*52.29*/("""
								"""),format.raw/*53.9*/("""allowAnimation = false;
								$bubble.animate("""),format.raw/*54.25*/("""{"""),format.raw/*54.26*/("""
									"""),format.raw/*55.10*/("""'opacity': 1,
									'margin-bottom': 200
								"""),format.raw/*57.9*/("""}"""),format.raw/*57.10*/(""");
							"""),format.raw/*58.8*/("""}"""),format.raw/*58.9*/("""
						"""),format.raw/*59.7*/("""}"""),format.raw/*59.8*/("""
						"""),format.raw/*60.7*/("""else """),format.raw/*60.12*/("""{"""),format.raw/*60.13*/("""
							"""),format.raw/*61.8*/("""if (!allowAnimation) """),format.raw/*61.29*/("""{"""),format.raw/*61.30*/("""
								"""),format.raw/*62.9*/("""allowAnimation = true;
								$bubble.animate("""),format.raw/*63.25*/("""{"""),format.raw/*63.26*/("""
									"""),format.raw/*64.10*/("""'opacity': 0,
									'margin-bottom': 0
								"""),format.raw/*66.9*/("""}"""),format.raw/*66.10*/(""");
							"""),format.raw/*67.8*/("""}"""),format.raw/*67.9*/("""
						"""),format.raw/*68.7*/("""}"""),format.raw/*68.8*/("""
					"""),format.raw/*69.6*/("""}"""),format.raw/*69.7*/(""");
					
					$('.features-area').find('.visual').find('.img-02').hide();
				"""),format.raw/*72.5*/("""}"""),format.raw/*72.6*/(""", 400);
			"""),format.raw/*73.4*/("""}"""),format.raw/*73.5*/(""")();
		"""),format.raw/*74.3*/("""}"""),format.raw/*74.4*/("""
		
		"""),format.raw/*76.3*/("""$('.features-area').find('.monitoring-info').find('.item').each(function()"""),format.raw/*76.77*/("""{"""),format.raw/*76.78*/("""
			"""),format.raw/*77.4*/("""var alignHor = ($(this).is('.left')) ? 'left' : 'right';
			
			$(this).poshytip("""),format.raw/*79.21*/("""{"""),format.raw/*79.22*/("""
				"""),format.raw/*80.5*/("""className: 'monitor-tip',
				showOn: 'hover',
				alignTo: 'target',
				alignX: alignHor,
				alignY: 'center',
				offsetX: 20,
				keepInViewport: true,
				allowTipHover: true,
				content:function()"""),format.raw/*88.23*/("""{"""),format.raw/*88.24*/("""
					"""),format.raw/*89.6*/("""var tmp = $(this).find('.pop-info').clone();
					return tmp;
				"""),format.raw/*91.5*/("""}"""),format.raw/*91.6*/("""
			"""),format.raw/*92.4*/("""}"""),format.raw/*92.5*/(""");
		"""),format.raw/*93.3*/("""}"""),format.raw/*93.4*/(""");
		
		$('.tech-holder .video-area .play-btn').click(function()"""),format.raw/*95.59*/("""{"""),format.raw/*95.60*/("""
			"""),format.raw/*96.4*/("""$(this).hide();
			var scroll_pos_test = $('.tech-holder .video-area').offset().top;
			$('html, body').stop().animate("""),format.raw/*98.35*/("""{"""),format.raw/*98.36*/(""" 
				"""),format.raw/*99.5*/("""scrollTop: scroll_pos_test
			"""),format.raw/*100.4*/("""}"""),format.raw/*100.5*/(""", 600);
			$('.tech-holder .video-area .image').fadeOut(300, function()"""),format.raw/*101.64*/("""{"""),format.raw/*101.65*/("""
				"""),format.raw/*102.5*/("""$('.tech-holder .video-area video').show();
				$('.tech-holder .video-area video').get(0).play();
			"""),format.raw/*104.4*/("""}"""),format.raw/*104.5*/(""");
			return false
		"""),format.raw/*106.3*/("""}"""),format.raw/*106.4*/(""");
		
		var videoEl = document.getElementById("demo-video");
		
		if (videoEl)
		"""),format.raw/*111.3*/("""{"""),format.raw/*111.4*/("""
			"""),format.raw/*112.4*/("""var wasInView = false;
			
			var restartVideo = function() """),format.raw/*114.34*/("""{"""),format.raw/*114.35*/("""
				"""),format.raw/*115.5*/("""videoEl.load();
				videoEl.play();
			"""),format.raw/*117.4*/("""}"""),format.raw/*117.5*/(""";
			
			var checkPositionAndPlay = function()
			"""),format.raw/*120.4*/("""{"""),format.raw/*120.5*/("""
				"""),format.raw/*121.5*/("""if (wasInView)
				"""),format.raw/*122.5*/("""{"""),format.raw/*122.6*/("""
					"""),format.raw/*123.6*/("""return;
				"""),format.raw/*124.5*/("""}"""),format.raw/*124.6*/("""
				
				"""),format.raw/*126.5*/("""var windowScroll = $(window).scrollTop();
				var windowHeight = $(window).height();
				var movieOffset = $("#demo-video").offset();
				
				if (windowHeight + windowScroll > movieOffset.top)
				"""),format.raw/*131.5*/("""{"""),format.raw/*131.6*/("""
					"""),format.raw/*132.6*/("""wasInView = true;
					restartVideo();
				"""),format.raw/*134.5*/("""}"""),format.raw/*134.6*/("""
			"""),format.raw/*135.4*/("""}"""),format.raw/*135.5*/("""
			
			"""),format.raw/*137.4*/("""$(window).scroll(function() """),format.raw/*137.32*/("""{"""),format.raw/*137.33*/("""
				"""),format.raw/*138.5*/("""checkPositionAndPlay();
			"""),format.raw/*139.4*/("""}"""),format.raw/*139.5*/(""");
			
			videoEl.onended = restartVideo;
			videoEl.play();
		"""),format.raw/*143.3*/("""}"""),format.raw/*143.4*/("""
		
		"""),format.raw/*145.3*/("""var timeEl = $("#errorAnalysisTime");
		
		if (timeEl.length > 0)
		"""),format.raw/*148.3*/("""{"""),format.raw/*148.4*/("""
			"""),format.raw/*149.4*/("""var updateTime = function() """),format.raw/*149.32*/("""{"""),format.raw/*149.33*/("""
				"""),format.raw/*150.5*/("""var now = new Date()
				now.setTime(now.getTime() + (60 * 1000 * 10));
				var minutes = now.getMinutes();
				minutes = minutes < 10 ? "0" + minutes : minutes;
				var hours = now.getHours() > 12 ? now.getHours() % 12 : now.getHours();
				var ampm = now.getHours() > 11 ? "pm" : "am";
				timeEl.text(hours + ":" + minutes + ampm);
			"""),format.raw/*157.4*/("""}"""),format.raw/*157.5*/("""
			
			"""),format.raw/*159.4*/("""updateTime();
			
			setInterval(updateTime, 1000 * 60);
		"""),format.raw/*162.3*/("""}"""),format.raw/*162.4*/("""
	"""),format.raw/*163.2*/("""}"""),format.raw/*163.3*/(""");
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
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/head/features.scala.html
                  HASH: b772ed1c1728330c6562d309ce6ec3c9c6199e79
                  MATRIX: 588->0|659->45|673->51|740->98|785->117|799->123|876->180|951->229|965->235|1045->295|1120->344|1134->350|1207->403|1308->477|1336->478|1369->484|1448->535|1477->536|1508->540|1618->623|1646->624|1775->725|1804->726|1835->730|1870->737|1899->738|1931->743|2076->860|2105->861|2166->895|2194->896|2227->902|2275->922|2304->923|2338->930|2460->1025|2488->1026|2520->1031|2548->1032|2607->1064|2635->1065|2668->1071|2718->1094|2746->1095|2799->1121|2827->1122|2944->1212|2972->1213|3003->1217|3043->1229|3072->1230|3104->1235|3154->1257|3183->1258|3216->1264|3391->1411|3420->1412|3454->1419|3550->1487|3579->1488|3614->1496|3662->1516|3691->1517|3727->1526|3803->1574|3832->1575|3870->1585|3949->1637|3978->1638|4015->1648|4043->1649|4077->1656|4105->1657|4139->1664|4172->1669|4201->1670|4236->1678|4285->1699|4314->1700|4350->1709|4425->1756|4454->1757|4492->1767|4569->1817|4598->1818|4635->1828|4663->1829|4697->1836|4725->1837|4758->1843|4786->1844|4891->1922|4919->1923|4957->1934|4985->1935|5019->1942|5047->1943|5080->1949|5182->2023|5211->2024|5242->2028|5351->2109|5380->2110|5412->2115|5644->2319|5673->2320|5706->2326|5799->2392|5827->2393|5858->2397|5886->2398|5918->2403|5946->2404|6038->2468|6067->2469|6098->2473|6245->2592|6274->2593|6307->2599|6365->2629|6394->2630|6494->2701|6524->2702|6557->2707|6687->2809|6716->2810|6765->2831|6794->2832|6903->2913|6932->2914|6964->2918|7053->2978|7083->2979|7116->2984|7183->3023|7212->3024|7290->3074|7319->3075|7352->3080|7399->3099|7428->3100|7462->3106|7502->3118|7531->3119|7569->3129|7795->3327|7824->3328|7858->3334|7929->3377|7958->3378|7990->3382|8019->3383|8055->3391|8112->3419|8142->3420|8175->3425|8230->3452|8259->3453|8350->3516|8379->3517|8413->3523|8509->3591|8538->3592|8570->3596|8627->3624|8657->3625|8690->3630|9056->3968|9085->3969|9121->3977|9208->4036|9237->4037|9267->4039|9296->4040
                  LINES: 22->1|22->1|22->1|22->1|24->3|24->3|24->3|25->4|25->4|25->4|26->5|26->5|26->5|29->8|29->8|31->10|31->10|31->10|32->11|35->14|35->14|39->18|39->18|40->19|40->19|40->19|41->20|43->22|43->22|45->24|45->24|46->25|46->25|46->25|47->26|49->28|49->28|50->29|50->29|52->31|52->31|53->32|54->33|54->33|57->36|57->36|62->41|62->41|63->42|63->42|63->42|64->43|64->43|64->43|65->44|69->48|69->48|70->49|72->51|72->51|73->52|73->52|73->52|74->53|75->54|75->54|76->55|78->57|78->57|79->58|79->58|80->59|80->59|81->60|81->60|81->60|82->61|82->61|82->61|83->62|84->63|84->63|85->64|87->66|87->66|88->67|88->67|89->68|89->68|90->69|90->69|93->72|93->72|94->73|94->73|95->74|95->74|97->76|97->76|97->76|98->77|100->79|100->79|101->80|109->88|109->88|110->89|112->91|112->91|113->92|113->92|114->93|114->93|116->95|116->95|117->96|119->98|119->98|120->99|121->100|121->100|122->101|122->101|123->102|125->104|125->104|127->106|127->106|132->111|132->111|133->112|135->114|135->114|136->115|138->117|138->117|141->120|141->120|142->121|143->122|143->122|144->123|145->124|145->124|147->126|152->131|152->131|153->132|155->134|155->134|156->135|156->135|158->137|158->137|158->137|159->138|160->139|160->139|164->143|164->143|166->145|169->148|169->148|170->149|170->149|170->149|171->150|178->157|178->157|180->159|183->162|183->162|184->163|184->163
                  -- GENERATED --
              */
          