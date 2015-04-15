
package views.html.bluesite.pages

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

Seq[Any](format.raw/*1.1*/("""<div id="blueSitePricingMain">
	<div class="pricing-title">
		<header class="holder">
			<h1>Pricing</h1>
		</header>
	</div>
	<div class="pricing-main">
		<div class="pricing">
			<header class="top">
				<p>Takipi is priced per server, with no limitation on the number of JVMs for each server. <br>Share Takipi with your whole team - no limits on the number of users. <br>See the complete <a href=""""),_display_(/*10.200*/routes/*10.206*/.BlueSite.product),format.raw/*10.223*/("""">features list</a>.</p>
			</header>
			<div class="items">
				<div class="item">
					<header>
						<h3>Lite</h3>
						<strong>1 server</strong>
					</header>
					<h4>Free</h4>
					<ul>
						<li>Unlimited JVMs per server</li>
						<li>Unlimited number of users</li>
					</ul>
					<ul class="no-space">
						<li>10 error analyses per month</li>
					</ul>
					<a href=""""),_display_(/*26.16*/globals/*26.23*/.TAKIPI_CREATE_ACCOUNT),format.raw/*26.45*/("""" class="call-to-action">Start a 21-day Pro trial</a>
				</div>
				<div class="item item-pro">
					<header>
						<h3>Pro</h3>
						<strong>1 - 20 servers</strong>
					</header>
					<h4>$69/month per server</h4>
                    <em class="subttl">Yearly plan or $85 month-to-month</em>
					<ul>
						<li>Unlimited JVMs per server</li>
						<li>Unlimited number of users</li>
						<li>Unlimited error analyses</li>
						<li>Personal information filtering</li>
						<li>Distributed debugging</li>
					</ul>
					<ul>
						<li>3 month data retention</li>
						<li>Premier support</li>
					</ul>
					<a href=""""),_display_(/*46.16*/globals/*46.23*/.TAKIPI_CREATE_ACCOUNT),format.raw/*46.45*/("""" class="call-to-action">Start a 21-day Pro trial</a>
				</div>
				<div class="item item-enterprise">
					<header>
						<h3>Enterprise</h3>
						<strong>Over 20 servers</strong>
					</header>
					<h4>Contact us
                    </h4>
					<em class="subttl">1-800-324-3053 Or <a href=""""),_display_(/*55.53*/globals/*55.60*/.HELLO_MAILTO),format.raw/*55.73*/("""">Email us</a></em>
					<ul>
						<li>Unlimited JVMs per server</li>
						<li>Unlimited number of users</li>
						<li>Unlimited error analyses</li>
						<li>Personal information filtering</li>
						<li>Distributed debugging</li>
					</ul>
					<ul>
						<li>Unlimited data retention</li>
						<li>24/7 support</li>
						<li>On-premises option</li>
					</ul>
					<a href=""""),_display_(/*68.16*/routes/*68.22*/.BlueSite.for_enterprises),format.raw/*68.47*/("""" class="call-to-action">Contact us</a>
				</div>
			</div><!-- items -->
			<h2>Questions? Requests? Check out our FAQ or contact us directly.</h2>
			<div class="buttons">
				<a href="#" class="btn btn-faq">Read our FAQ</a><a href=""""),_display_(/*73.63*/globals/*73.70*/.HELLO_MAILTO),format.raw/*73.83*/("""" class="btn btn-email">Email us</a><a href="#" class="btn btn-chat">Live chat</a><a href="#" class="btn btn-call" data-number="1-800-324-3053">Call us</a>
			</div><!-- buttons -->
			<div class="faq-block">
				<h3>FAQ</h3>
				<ul class="col">
					<li>
						<h4>Does Takipi offer volume discount rates? </h4>
						<p>Yes, please contact sales for volume pricing.</p>
					</li>
					<li>
						<h4>How does Takipi define a server?</h4>
						<p>A server is either a physical machine or a VM instance running an individual copy of an operating system. We recognize servers by their unique host name.</p>
					</li>
					<li>
						<h4>How do you price Docker Containers?</h4>
						<p>We charge per server, you can deploy an unlimited amount of Docker Containers in each server.  We do not charge per Docker Container.</p>
					</li>
					<li>
						<h4>What if I want to cancel my subscription?</h4>
						<p>You can cancel your subscription anytime. Your credit card will not be charged at the next billing cycle and your subscription will not renew upon expiration. If you decide to cancel your annual subscription you will pay a cancellation fee of 2 months your monthly payment and the service will continue until the end of your next billing period. For example, if your monthly bill is $500, your cancellation fee would be $1000. </p>
					</li>
					<li>
						<h4>If I'm on an Annual Plan and decide to change to a Month to Month Plan, is there a penalty fee? </h4>
						<p>Yes, the downgrade fee is 2x your monthly payment.</p>
					</li>
				</ul>
				<ul class="col">
					<li>
						<h4>If I'm on a Month to Month Plan and decide to change to an Annual Plan, is there a cancellation fee? </h4>
						<p>No.</p>
					</li>
					<li>
						<h4>How does the subscription plan work?</h4>
						<p><b>Annual server billing</b>. Takipi will charge your credit card each month for 12 months. You can increase the license at any time and charges will adjust with the next monthly bill. Your account will automatically renew at the end of the year unless you change your subscription. If you cancel the service or downgrade to fewer hosts during your commitment year, you will be charged a penalty equal to 2 months of service. For example, if your monthly bill is $1,000/mo., your cancellation fee would be $2,000. If you're on an Annual Plan, a cancellation penalty equal to 2-month's of service will be applied.</p>
						<p><b>Monthly server Billing</b> (cancel anytime). Takipi will charge your credit card each month. You can change the license anytime and your billing will adjust with your next monthly bill. You can cancel the service anytime. Your account will automatically renew each month unless you change your subscription.</p>
					</li>
					<li>
						<h4>What if I want to cancel entirely?</h4>
						<p>Yes, we understand. If you decide to unplug Takipi entirely, please cancel before your next billing period. You will not be charged for the next month of service.</p>
					</li>
				</ul>
			</div>
		</div><!-- pricing -->
	</div>
    """),_display_(/*117.6*/bluesite/*117.14*/.pages.scheduler_popup()),format.raw/*117.38*/("""
"""),format.raw/*118.1*/("""</div>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Apr 15 17:20:36 IDT 2015
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/bluesite/pages/pricing.scala.html
                  HASH: d669f9c994e1a3108470217241e3efd8ced26b55
                  MATRIX: 597->0|1026->401|1042->407|1081->424|1491->807|1507->814|1550->836|2204->1463|2220->1470|2263->1492|2586->1788|2602->1795|2636->1808|3047->2192|3062->2198|3108->2223|3372->2460|3388->2467|3422->2480|6518->5549|6536->5557|6582->5581|6611->5582
                  LINES: 22->1|31->10|31->10|31->10|47->26|47->26|47->26|67->46|67->46|67->46|76->55|76->55|76->55|89->68|89->68|89->68|94->73|94->73|94->73|138->117|138->117|138->117|139->118
                  -- GENERATED --
              */
          