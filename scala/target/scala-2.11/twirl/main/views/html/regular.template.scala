
package views.html

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
object regular extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,Html,Html,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, body: Html, head: Html = null, ready: Html = views.html.ready.default()):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.90*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
		<meta name="language" content="English" />
		"""),_display_(/*7.4*/Html(com.newrelic.api.agent.NewRelic.getBrowserTimingHeader())),format.raw/*7.66*/("""
		"""),format.raw/*8.3*/("""<title>Takipi """),_display_(/*8.18*/if(title != "")/*8.33*/ {_display_(Seq[Any](format.raw/*8.35*/(""" """),format.raw/*8.36*/("""- """)))}),format.raw/*8.39*/(""" """),_display_(/*8.41*/title),format.raw/*8.46*/("""</title>
		<link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.53*/routes/*9.59*/.Assets.at("images/takipi.ico")),format.raw/*9.90*/("""" />
		<link rel="stylesheet" href='//fonts.googleapis.com/css?family=Nunito:400,700'  type="text/css" />
		<link rel="stylesheet" href='//fonts.googleapis.com/css?family=Open+Sans'  type="text/css" />
		<link rel="stylesheet" href="//fonts.googleapis.com/css?family=Exo+2:300,400,500,600,700" type="text/css" />
		<link rel="stylesheet" media="screen" href=""""),_display_(/*13.48*/routes/*13.54*/.Assets.at("stylesheets/main.min.css")),format.raw/*13.92*/("""" />
		<link rel="stylesheet" media="screen" href=""""),_display_(/*14.48*/routes/*14.54*/.Assets.at("stylesheets/takipiSiteRetina.min.css")),format.raw/*14.104*/("""" />
		<!--<link rel="stylesheet" media="screen" href=""""),_display_(/*15.52*/routes/*15.58*/.Assets.at("stylesheets/takipiMiniSignup.css")),format.raw/*15.104*/("""" />-->
		
		<script src="//cdn.optimizely.com/js/401960917.js"></script>
		<script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.0/jquery.min.js"></script>

		"""),_display_(/*20.4*/if(!globals.isDev)/*20.22*/ {_display_(Seq[Any](format.raw/*20.24*/("""
			"""),format.raw/*21.4*/("""<!-- Sentry start -->
			<script src="//cdn.ravenjs.com/1.1.16/jquery,native/raven.min.js"></script>
			<script>
				Raven.config('https://0ae9cd875e884ed2a7a407c356377d71@app.getsentry.com/28388', """),format.raw/*24.87*/("""{"""),format.raw/*24.88*/("""
				    """),format.raw/*25.9*/("""// we highly recommend restricting exceptions to a domain in order to filter out clutter
				    // whitelistUrls: ['takipi.com', '*.takipi.com']
				"""),format.raw/*27.5*/("""}"""),format.raw/*27.6*/(""").install();
			</script>
			<!-- Sentry end -->		
		""")))}),format.raw/*30.4*/("""

		"""),format.raw/*32.3*/("""<script src=""""),_display_(/*32.17*/routes/*32.23*/.Assets.at("javascripts/jquery.cookie.js")),format.raw/*32.65*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*33.17*/routes/*33.23*/.Assets.at("javascripts/jquery.base64.min.js")),format.raw/*33.69*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*34.17*/routes/*34.23*/.Assets.at("javascripts/main.min.js")),format.raw/*34.60*/("""" type="text/javascript"></script>
		<script type="text/javascript" src="//www.youtube.com/iframe_api"></script>

		"""),_display_(/*37.4*/head),format.raw/*37.8*/("""

		"""),_display_(/*39.4*/ready),format.raw/*39.9*/("""
		
		"""),format.raw/*41.3*/("""<script type="text/javascript">
		"""),_display_(/*42.4*/if(globals.isDev)/*42.21*/ {_display_(Seq[Any](format.raw/*42.23*/("""
			"""),format.raw/*43.4*/("""var _gas = _gas || [];
			var mixpanel = undefined;
		""")))}/*45.5*/else/*45.10*/{_display_(Seq[Any](format.raw/*45.11*/("""
			"""),format.raw/*46.4*/("""<!-- gas -->
			var _gas = _gas || [];
			
			gas_initialize();
			
			(function() """),format.raw/*51.16*/("""{"""),format.raw/*51.17*/("""
			"""),format.raw/*52.4*/("""var ga = document.createElement('script');
			ga.id = 'gas-script';
			ga.setAttribute('data-use-dcjs', 'false');
			ga.type = 'text/javascript';
			ga.async = true;
			ga.src = '//cdnjs.cloudflare.com/ajax/libs/gas/1.11.0/gas.min.js';
			var s = document.getElementsByTagName('script')[0];
			s.parentNode.insertBefore(ga, s);
			"""),format.raw/*60.4*/("""}"""),format.raw/*60.5*/(""")();

			<!-- mixpanel -->
			(function(e,b)"""),format.raw/*63.18*/("""{"""),format.raw/*63.19*/("""if(!b.__SV)"""),format.raw/*63.30*/("""{"""),format.raw/*63.31*/("""var a,f,i,g;window.mixpanel=b;a=e.createElement("script");a.type="text/javascript";a.async=!0;a.src=("https:"===e.location.protocol?"https:":"http:")+'//cdn.mxpnl.com/libs/mixpanel-2.2.min.js';f=e.getElementsByTagName("script")[0];f.parentNode.insertBefore(a,f);b._i=[];b.init=function(a,e,d)"""),format.raw/*63.323*/("""{"""),format.raw/*63.324*/("""function f(b,h)"""),format.raw/*63.339*/("""{"""),format.raw/*63.340*/("""var a=h.split(".");2==a.length&&(b=b[a[0]],h=a[1]);b[h]=function()"""),format.raw/*63.406*/("""{"""),format.raw/*63.407*/("""b.push([h].concat(Array.prototype.slice.call(arguments,0)))"""),format.raw/*63.466*/("""}"""),format.raw/*63.467*/("""}"""),format.raw/*63.468*/("""var c=b;"undefined"!==
			typeof d?c=b[d]=[]:d="mixpanel";c.people=c.people||[];c.toString=function(b)"""),format.raw/*64.80*/("""{"""),format.raw/*64.81*/("""var a="mixpanel";"mixpanel"!==d&&(a+="."+d);b||(a+=" (stub)");return a"""),format.raw/*64.151*/("""}"""),format.raw/*64.152*/(""";c.people.toString=function()"""),format.raw/*64.181*/("""{"""),format.raw/*64.182*/("""return c.toString(1)+".people (stub)""""),format.raw/*64.219*/("""}"""),format.raw/*64.220*/(""";i="disable track track_pageview track_links track_forms register register_once alias unregister identify name_tag set_config people.set people.set_once people.increment people.append people.track_charge people.clear_charges people.delete_user".split(" ");for(g=0;g<i.length;g++)f(c,i[g]);
			b._i.push([a,e,d])"""),format.raw/*65.22*/("""}"""),format.raw/*65.23*/(""";b.__SV=1.2"""),format.raw/*65.34*/("""}"""),format.raw/*65.35*/("""}"""),format.raw/*65.36*/(""")(document,window.mixpanel||[]);
			mp_site_default_init();

			<!-- zopim -->
			window.$zopim||(function(d,s)"""),format.raw/*69.33*/("""{"""),format.raw/*69.34*/("""var z=$zopim=function(c)"""),format.raw/*69.58*/("""{"""),format.raw/*69.59*/("""z._.push(c)"""),format.raw/*69.70*/("""}"""),format.raw/*69.71*/(""",$=z.s=
			d.createElement(s),e=d.getElementsByTagName(s)[0];z.set=function(o)"""),format.raw/*70.71*/("""{"""),format.raw/*70.72*/("""z.set.
			_.push(o)"""),format.raw/*71.13*/("""}"""),format.raw/*71.14*/(""";z._=[];z.set._=[];$.async=!0;$.setAttribute('charset','utf-8');
			$.src='//v2.zopim.com/?2BTCVZ1sM6Sg6NgR29msVfeAl2UPlmJR';z.t=+new Date;$.
			type='text/javascript';e.parentNode.insertBefore($,e)"""),format.raw/*73.57*/("""}"""),format.raw/*73.58*/(""")(document,'script');
			
			$zopim(function()
			"""),format.raw/*76.4*/("""{"""),format.raw/*76.5*/("""
				"""),format.raw/*77.5*/("""$zopim.livechat.badge.hide();
			"""),format.raw/*78.4*/("""}"""),format.raw/*78.5*/(""");
		""")))}),format.raw/*79.4*/("""
		"""),format.raw/*80.3*/("""</script>
	</head>
	<body onunload="">
		"""),_display_(/*83.4*/body),format.raw/*83.8*/("""

		"""),_display_(/*85.4*/if(!globals.isDev)/*85.22*/ {_display_(Seq[Any](format.raw/*85.24*/("""
			"""),format.raw/*86.4*/("""<!-- Adroll start -->
			<script type="text/javascript">
				adroll_adv_id = "RTHTY4IRUVAN5CPZ5YUQ46";
				adroll_pix_id = "UW2XQSYWXVA4VHGMKZD5WU";
				(function () """),format.raw/*90.18*/("""{"""),format.raw/*90.19*/("""
				"""),format.raw/*91.5*/("""var oldonload = window.onload;
				window.onload = function()"""),format.raw/*92.31*/("""{"""),format.raw/*92.32*/("""
				   """),format.raw/*93.8*/("""__adroll_loaded=true;
				   var scr = document.createElement("script");
				   var host = (("https:" == document.location.protocol) ? "https://s.adroll.com" : "http://a.adroll.com");
				   scr.setAttribute('async', 'true');
				   scr.type = "text/javascript";
				   scr.src = host + "/j/roundtrip.js";
				   ((document.getElementsByTagName('head') || [null])[0] ||
					document.getElementsByTagName('script')[0].parentNode).appendChild(scr);
				   if(oldonload)"""),format.raw/*101.21*/("""{"""),format.raw/*101.22*/("""oldonload()"""),format.raw/*101.33*/("""}"""),format.raw/*101.34*/("""}"""),format.raw/*101.35*/(""";
				"""),format.raw/*102.5*/("""}"""),format.raw/*102.6*/("""());
			</script>
			<!-- Adroll end -->
			<!-- Mouseflow start -->
			<script type="text/javascript">
			var _mfq = _mfq || [];
			(function() """),format.raw/*108.16*/("""{"""),format.raw/*108.17*/("""
				"""),format.raw/*109.5*/("""var mf = document.createElement("script"); mf.type = "text/javascript"; mf.async = true;
				mf.src = "//cdn.mouseflow.com/projects/186831bf-fa1b-49a1-a56f-90a1b97285e6.js";
				document.getElementsByTagName("head")[0].appendChild(mf);
			"""),format.raw/*112.4*/("""}"""),format.raw/*112.5*/(""")();
			</script>
			<!-- Mouseflow end -->
			
			<!--RETARGETING-->
			<!-- Google Code for Takipi Visitors -->
			<!-- Remarketing tags may not be associated with personally identifiable information or placed on pages related to sensitive categories. For instructions on adding this tag and more information on the above requirements, read the setup guide: google.com/ads/remarketingsetup -->
			<script type="text/javascript">
			/* <![CDATA[ */
				var google_conversion_id = 969471896;
				var google_conversion_label = "xszLCK-_k1oQmO-jzgM";
				var google_custom_params = window.google_tag_params;
				var google_remarketing_only = true;
			/* ]]> */
			</script>
			<script type="text/javascript" src="//www.googleadservices.com/pagead/conversion.js"></script>
			<noscript>
				<div style="display:inline;"><img height="1" width="1" style="border-style:none;" alt="" src="//googleads.g.doubleclick.net/pagead/viewthroughconversion/969471896/?value=1.00&amp;currency_code=USD&amp;label=xszLCK-_k1oQmO-jzgM&amp;guid=ON&amp;script=0"/></div>
			</noscript>
           <!-- facebook retargeting-->
            <script>(function() """),format.raw/*132.33*/("""{"""),format.raw/*132.34*/("""
              """),format.raw/*133.15*/("""var _fbq = window._fbq || (window._fbq = []);
              if (!_fbq.loaded) """),format.raw/*134.33*/("""{"""),format.raw/*134.34*/("""
                """),format.raw/*135.17*/("""var fbds = document.createElement('script');
                fbds.async = true;
                fbds.src = '//connect.facebook.net/en_US/fbds.js';
                var s = document.getElementsByTagName('script')[0];
                s.parentNode.insertBefore(fbds, s);
                _fbq.loaded = true;
              """),format.raw/*141.15*/("""}"""),format.raw/*141.16*/("""
              """),format.raw/*142.15*/("""_fbq.push(['addPixelId', '616379538459573']);
            """),format.raw/*143.13*/("""}"""),format.raw/*143.14*/(""")();
            window._fbq = window._fbq || [];
            window._fbq.push(['track', 'PixelInitialized', """),format.raw/*145.60*/("""{"""),format.raw/*145.61*/("""}"""),format.raw/*145.62*/("""]);
            </script>
            <noscript><img height="1" width="1" alt="" style="display:none" src="https://www.facebook.com/tr?id=616379538459573&amp;ev=PixelInitialized" /></noscript>
            <!-- Google Code for Remarketing tag -->
            <!-- Remarketing tags may not be associated with personally identifiable information or placed on pages related to sensitive categories. For instructions on adding this tag and more information on the above requirements, read the setup guide: google.com/ads/remarketingsetup -->
            <script type="text/javascript">
            /* <![CDATA[ */
                var google_conversion_id = 982905749;
                var google_conversion_label = "uPwCCLP14wQQlefX1AM";
                var google_custom_params = window.google_tag_params;
                var google_remarketing_only = true;
            /* ]]> */
            </script>
            <script type="text/javascript" src="//www.googleadservices.com/pagead/conversion.js">
            </script>
            <noscript>
                <div style="display:inline;">
                <img height="1" width="1" style="border-style:none;" alt="" src="//googleads.g.doubleclick.net/pagead/viewthroughconversion/982905749/?value=1.00&amp;currency_code=USD&amp;label=uPwCCLP14wQQlefX1AM&amp;guid=ON&amp;script=0"/>
                </div>
            </noscript>
		""")))}),format.raw/*165.4*/("""
	"""),_display_(/*166.3*/Html(com.newrelic.api.agent.NewRelic.getBrowserTimingFooter())),format.raw/*166.65*/("""
	"""),format.raw/*167.2*/("""</body>
</html>
"""))}
  }

  def render(title:String,body:Html,head:Html,ready:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,body,head,ready)

  def f:((String,Html,Html,Html) => play.twirl.api.HtmlFormat.Appendable) = (title,body,head,ready) => apply(title,body,head,ready)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Apr 15 17:20:36 IDT 2015
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/regular.scala.html
                  HASH: bb471a4704a7af9b75f184509603c066f3fe3905
                  MATRIX: 522->1|698->89|725->90|900->240|982->302|1011->305|1052->320|1075->335|1114->337|1142->338|1175->341|1203->343|1228->348|1315->409|1329->415|1380->446|1767->806|1782->812|1841->850|1920->902|1935->908|2007->958|2090->1014|2105->1020|2173->1066|2362->1229|2389->1247|2429->1249|2460->1253|2686->1452|2715->1453|2751->1462|2928->1612|2956->1613|3040->1667|3071->1671|3112->1685|3127->1691|3190->1733|3268->1784|3283->1790|3350->1836|3428->1887|3443->1893|3501->1930|3644->2047|3668->2051|3699->2056|3724->2061|3757->2067|3818->2102|3844->2119|3884->2121|3915->2125|3988->2181|4001->2186|4040->2187|4071->2191|4182->2274|4211->2275|4242->2279|4600->2610|4628->2611|4700->2655|4729->2656|4768->2667|4797->2668|5118->2960|5148->2961|5192->2976|5222->2977|5317->3043|5347->3044|5435->3103|5465->3104|5495->3105|5625->3207|5654->3208|5753->3278|5783->3279|5841->3308|5871->3309|5937->3346|5967->3347|6306->3658|6335->3659|6374->3670|6403->3671|6432->3672|6571->3783|6600->3784|6652->3808|6681->3809|6720->3820|6749->3821|6855->3899|6884->3900|6931->3919|6960->3920|7186->4118|7215->4119|7292->4169|7320->4170|7352->4175|7412->4208|7440->4209|7476->4215|7506->4218|7574->4260|7598->4264|7629->4269|7656->4287|7696->4289|7727->4293|7921->4459|7950->4460|7982->4465|8071->4526|8100->4527|8135->4535|8632->5003|8662->5004|8702->5015|8732->5016|8762->5017|8796->5023|8825->5024|8999->5169|9029->5170|9062->5175|9329->5414|9358->5415|10523->6551|10553->6552|10597->6567|10704->6645|10734->6646|10780->6663|11126->6980|11156->6981|11200->6996|11287->7054|11317->7055|11455->7164|11485->7165|11515->7166|12924->8544|12954->8547|13038->8609|13068->8611
                  LINES: 19->1|22->1|23->2|28->7|28->7|29->8|29->8|29->8|29->8|29->8|29->8|29->8|29->8|30->9|30->9|30->9|34->13|34->13|34->13|35->14|35->14|35->14|36->15|36->15|36->15|41->20|41->20|41->20|42->21|45->24|45->24|46->25|48->27|48->27|51->30|53->32|53->32|53->32|53->32|54->33|54->33|54->33|55->34|55->34|55->34|58->37|58->37|60->39|60->39|62->41|63->42|63->42|63->42|64->43|66->45|66->45|66->45|67->46|72->51|72->51|73->52|81->60|81->60|84->63|84->63|84->63|84->63|84->63|84->63|84->63|84->63|84->63|84->63|84->63|84->63|84->63|85->64|85->64|85->64|85->64|85->64|85->64|85->64|85->64|86->65|86->65|86->65|86->65|86->65|90->69|90->69|90->69|90->69|90->69|90->69|91->70|91->70|92->71|92->71|94->73|94->73|97->76|97->76|98->77|99->78|99->78|100->79|101->80|104->83|104->83|106->85|106->85|106->85|107->86|111->90|111->90|112->91|113->92|113->92|114->93|122->101|122->101|122->101|122->101|122->101|123->102|123->102|129->108|129->108|130->109|133->112|133->112|153->132|153->132|154->133|155->134|155->134|156->135|162->141|162->141|163->142|164->143|164->143|166->145|166->145|166->145|186->165|187->166|187->166|188->167
                  -- GENERATED --
              */
          