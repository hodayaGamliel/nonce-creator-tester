
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
object footer extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Boolean,Boolean,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(topBoarder: Boolean, isLandingPage: Boolean = false):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.55*/("""

"""),format.raw/*3.1*/("""<div id="footer"  """),_display_(/*3.20*/if(!topBoarder)/*3.35*/ {_display_(Seq[Any](format.raw/*3.37*/("""
	"""),format.raw/*4.2*/("""style="border-top:none;"
	""")))}),format.raw/*5.3*/(""">
	"""),_display_(/*6.3*/if( !isLandingPage )/*6.23*/{_display_(Seq[Any](format.raw/*6.24*/("""
	"""),format.raw/*7.2*/("""<div class="footerHolder slimSiteCentered">
		<div class="footerController">
			<div class="blocksHolder">
				<div class="block">
					<h3>Product</h3>
					<ul>
						<li><a id="footer-product-how-it-works" class="underlinelink" href=""""),_display_(/*13.76*/routes/*13.82*/.BlueSite.howitworks),format.raw/*13.102*/("""">How it Works</a></li>
						<li><a id="footer-product-product-error-analysis" class="underlinelink" href=""""),_display_(/*14.86*/routes/*14.92*/.BlueSite.product),format.raw/*14.109*/("""#error-analysis">Error Analysis</a></li>
						<li><a id="footer-product-product-detection-priority" class="underlinelink" href=""""),_display_(/*15.90*/routes/*15.96*/.BlueSite.product),format.raw/*15.113*/("""#engineering-dashboard">Detection and priority</a></li>
						<li><a id="footer-product-product-workflow-integration" class="underlinelink" href=""""),_display_(/*16.92*/routes/*16.98*/.BlueSite.product),format.raw/*16.115*/("""#workflow">Workflow Integration</a></li>
						<li><a id="footer-product-logs" class="underlinelink" href=""""),_display_(/*17.68*/routes/*17.74*/.BlueSite.product),format.raw/*17.91*/("""#smarter-logs">Smarter Logs</a></li>
						<li><a id="footer-product-security" class="underlinelink" href=""""),_display_(/*18.72*/routes/*18.78*/.BlueSite.security),format.raw/*18.96*/("""">Security</a></li>
						<li><a id="footer-product-features-performance" class="underlinelink" href=""""),_display_(/*19.84*/routes/*19.90*/.BlueSite.howitworks),format.raw/*19.110*/("""#performance">Performance</a></li>
					</ul>
				</div>
				<div class="block">
					<h3>Solutions</h3>
					<ul>
						<li><a id="footer-solutions-role-developer" class="underlinelink" href=""""),_display_(/*25.80*/routes/*25.86*/.BlueSite.whytakipi),format.raw/*25.105*/("""#developer">Developer</a></li>
						<li><a id="footer-solutions-role-devops" class="underlinelink" href=""""),_display_(/*26.77*/routes/*26.83*/.BlueSite.whytakipi),format.raw/*26.102*/("""#devops">DevOps</a></li>
						<li><a id="footer-solutions-role-engineering-manager" class="underlinelink" href=""""),_display_(/*27.90*/routes/*27.96*/.BlueSite.whytakipi),format.raw/*27.115*/("""#engineering-manager">Engineering Manager</a></li>
						<li><a id="footer-solutions-role-executive" class="underlinelink" href=""""),_display_(/*28.80*/routes/*28.86*/.BlueSite.whytakipi),format.raw/*28.105*/("""#executive">Executive</a></li>
						<li><a id="footer-solutions-technology-scala" class="underlinelink" href=""""),_display_(/*29.82*/routes/*29.88*/.BlueSite.scala),format.raw/*29.103*/("""">Scala</a></li>
						<li><a id="footer-solutions-technology-newrelic" class="underlinelink" href=""""),_display_(/*30.85*/routes/*30.91*/.Application.newrelicnew),format.raw/*30.115*/("""">New Relic</a></li>
					</ul>
				</div>
				<div class="block">
					<h3>Company</h3>
					<ul>
						<li><a id="footer-company-aboutus" class="underlinelink" href=""""),_display_(/*36.71*/routes/*36.77*/.Application.about),format.raw/*36.95*/("""">About Us</a></li>
						<li><a id="footer-company-blog" class="underlinelink" href=""""),_display_(/*37.68*/globals/*37.75*/.TAKIPI_BLOG),format.raw/*37.87*/("""" target="_blank">Blog</a></li>
						<li><a id="footer-company-jobs" class="underlinelink" href=""""),_display_(/*38.68*/routes/*38.74*/.Application.jobs),format.raw/*38.91*/("""">Jobs</a></li>
						<li><a id="footer-company-monsters" class="underlinelink" href=""""),_display_(/*39.72*/routes/*39.78*/.Application.monsters),format.raw/*39.99*/("""">Monsters</a></li>
					</ul>
				</div>
				<div class="block">
					<h3>Help</h3>
					<ul>
						<li><a id="footer-help-docs" class="underlinelink" href=""""),_display_(/*45.65*/globals/*45.72*/.TAKIPI_SUPPORT_SITE),format.raw/*45.92*/("""" target="_blank">Docs</a></li>
						<li><a id="footer-help-installation" class="underlinelink" href=""""),_display_(/*46.73*/globals/*46.80*/.TAKIPI_SUPPORT_SITE),format.raw/*46.100*/("""/installation" target="_blank">Installation</a></li>
						<li><a id="footer-help-connecting-tapiki" class="underlinelink" href=""""),_display_(/*47.78*/globals/*47.85*/.TAKIPI_SUPPORT_SITE),format.raw/*47.105*/("""/connecting-takipi" target="_blank">Connecting Takipi</a></li>
						<li><a id="footer-help-schedule-demo" class="underlinelink" href=""""),_display_(/*48.74*/routes/*48.80*/.BlueSite.schedule_demo),format.raw/*48.103*/("""">Schedule a demo</a></li>
						<li><a id="footer-help-mail" class="underlinelink" href=""""),_display_(/*49.65*/globals/*49.72*/.HELLO_MAILTO),format.raw/*49.85*/("""">"""),_display_(/*49.88*/globals/*49.95*/.HELLO_MAIL),format.raw/*49.106*/("""</a></li>
						<li><a id="footer-help-tos" class="underlinelink" href=""""),_display_(/*50.64*/routes/*50.70*/.Application.terms),format.raw/*50.88*/("""" target="_blank">Terms of service</a></li>
					</ul>
				</div>
				<div class="block">
					<h3>Who said developers aren't social?</h3>
					<ul class="socialList">
						<li><a id="footer-social-facebook" href="http://www.facebook.com/takipi" class="facebook" target="_blank"></a></li>
						<li><a id="footer-social-twitter" href="http://www.twitter.com/takipid" class="twitter" target="_blank"></a></li>
						<li><a id="footer-social-dog" href="javascript: void(0)" class="dog"></a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
    """)))}),format.raw/*64.6*/("""
	"""),format.raw/*65.2*/("""<div class="footerBottom">
		<ul>
			<li>By Takipi, Inc. 2015</li>
			<li>Contact us: <a class="underlinelink" href=""""),_display_(/*68.52*/globals/*68.59*/.HELLO_MAILTO),format.raw/*68.72*/("""">"""),_display_(/*68.75*/globals/*68.82*/.HELLO_MAIL),format.raw/*68.93*/("""</a></li>
			<li>1-800-324-3053</li>
		</ul>
	</div>
</div>
<div id="dogPopup" class="socialPopup">
	<a class="socialPopupClose" href="javascript: void(0)"></a>
	<div class="socialPopupHolder">
		<div class="socialPopupHeader"></div>
		<img src=""""),_display_(/*77.14*/routes/*77.20*/.Assets.at("images/takipi-dogs.jpg")),format.raw/*77.56*/("""" alt="Taki and Kipi" width="476" height="315"/>
	</div>
</div>
<div id="youtubePopup">
	<iframe id="ytPlayer" width="640" height="420" src="//www.youtube.com/embed/"""),_display_(/*81.79*/globals/*81.86*/.DEMO_VIDEO),format.raw/*81.97*/("""?vq=hd720&enablejsapi=1&origin="""),_display_(/*81.129*/globals/*81.136*/.SITE_ORIGIN),format.raw/*81.148*/("""" frameborder="0" allowfullscreen></iframe>
</div>
<div id="screenshotsPopup">
	<a class="close" href="javascript: void(0)"></a>
</div>
<div id="officeImagePopup">
	<a class="close" href="javascript: void(0)"></a>
</div>
"""))}
  }

  def render(topBoarder:Boolean,isLandingPage:Boolean): play.twirl.api.HtmlFormat.Appendable = apply(topBoarder,isLandingPage)

  def f:((Boolean,Boolean) => play.twirl.api.HtmlFormat.Appendable) = (topBoarder,isLandingPage) => apply(topBoarder,isLandingPage)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Apr 15 17:20:35 IDT 2015
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/footer.scala.html
                  HASH: c6e348400d861d1289cb09af6d2576a1b2ddd497
                  MATRIX: 515->1|656->54|684->56|729->75|752->90|791->92|819->94|875->121|904->125|932->145|970->146|998->148|1263->386|1278->392|1320->412|1456->521|1471->527|1510->544|1667->674|1682->680|1721->697|1895->844|1910->850|1949->867|2084->975|2099->981|2137->998|2272->1106|2287->1112|2326->1130|2456->1233|2471->1239|2513->1259|2734->1453|2749->1459|2790->1478|2924->1585|2939->1591|2980->1610|3121->1724|3136->1730|3177->1749|3334->1879|3349->1885|3390->1904|3529->2016|3544->2022|3581->2037|3709->2138|3724->2144|3770->2168|3966->2337|3981->2343|4020->2361|4134->2448|4150->2455|4183->2467|4309->2566|4324->2572|4362->2589|4476->2676|4491->2682|4533->2703|4719->2862|4735->2869|4776->2889|4907->2993|4923->3000|4965->3020|5122->3150|5138->3157|5180->3177|5343->3313|5358->3319|5403->3342|5521->3433|5537->3440|5571->3453|5601->3456|5617->3463|5650->3474|5750->3547|5765->3553|5804->3571|6383->4120|6412->4122|6557->4240|6573->4247|6607->4260|6637->4263|6653->4270|6685->4281|6959->4528|6974->4534|7031->4570|7224->4736|7240->4743|7272->4754|7332->4786|7349->4793|7383->4805
                  LINES: 19->1|22->1|24->3|24->3|24->3|24->3|25->4|26->5|27->6|27->6|27->6|28->7|34->13|34->13|34->13|35->14|35->14|35->14|36->15|36->15|36->15|37->16|37->16|37->16|38->17|38->17|38->17|39->18|39->18|39->18|40->19|40->19|40->19|46->25|46->25|46->25|47->26|47->26|47->26|48->27|48->27|48->27|49->28|49->28|49->28|50->29|50->29|50->29|51->30|51->30|51->30|57->36|57->36|57->36|58->37|58->37|58->37|59->38|59->38|59->38|60->39|60->39|60->39|66->45|66->45|66->45|67->46|67->46|67->46|68->47|68->47|68->47|69->48|69->48|69->48|70->49|70->49|70->49|70->49|70->49|70->49|71->50|71->50|71->50|85->64|86->65|89->68|89->68|89->68|89->68|89->68|89->68|98->77|98->77|98->77|102->81|102->81|102->81|102->81|102->81|102->81
                  -- GENERATED --
              */
          