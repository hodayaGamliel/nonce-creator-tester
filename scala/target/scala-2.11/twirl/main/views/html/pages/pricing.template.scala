
package views.html.pages

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

Seq[Any](format.raw/*1.1*/("""<div class="backgroundFiller"></div>
<div id="pricingMain" class="subPageMain siteCentered">
	<div class="heading">
		<h1>Pricing</h1>
		<div class="headerMiniSignup"></div>
	</div>
	<div class="content styled">
		<div class="pricing-area">
			<div class="intro">
				<p>Takipi is priced per server. Install Takipi on each of your servers, and monitor an unlimited number of JVMs per machine.</p>
				<p>Start your free trial and get an unlimited number of servers for 30 days. <b>Keep one server free for good.</b></p>
			</div><!-- / intro -->
			<div class="plans-area">
				<h2>&nbsp;</h2>
				<div class="top-bar">
					<span class="txt">Annual subscription</span>
					<a class="btn-switch on" href="#">switch</a>
					<span class="txt">Month-to-month</span>
				</div><!-- / top-bar -->
				<div class="holder" data-equal-height='.inner'>
					<div class="box">
						<div class="inner">
							<div class="top">
								<h3><span class="wrap">Basic <span class="small planInterval">yearly</span></span></h3>
								<span class="price">
									<span class="small">$</span>
									<span class="num num-1">49</span>
									<span class="sep"> /</span>Per Server / Mo
								</span>
							</div>
							<ul class="list">
								<li>For dev/testing environments</li>
								<li>Up to 5 servers</li>
								<li>10-day data retention</li>
							</ul>
							<a class="btn-start" href=""""),_display_(/*36.36*/globals/*36.43*/.TAKIPI_CREATE_ACCOUNT),format.raw/*36.65*/("""" target="_blank">Start free trial</a>
						</div>
					</div><!-- / box -->
					<div class="box">
						<div class="inner">
							<div class="top">
								<span class="popular">
									Most Popular
									<img src="assets/images/pricing/img-006.png" alt="image">
								</span>
								<h3><span class="wrap">Standard <span class="small planInterval">yearly</span></span></h3>
								<span class="price">
									<span class="small">$</span>
									<span class="num num-2">69</span>
									<span class="sep"> /</span>Per Server / Mo
								</span>
							</div>
							<ul class="list">
								<li>For production environments</li>
								<li>Unlimited JVMs</li>
								<li>1-year data retention</li>
								<li>Unlimited docker containers</li>
								<li>Need more than 15 servers? <a href=""""),_display_(/*58.50*/globals/*58.57*/.HELLO_MAILTO),format.raw/*58.70*/("""">Contact us</a></li>
							</ul>
							<a class="btn-start" href=""""),_display_(/*60.36*/globals/*60.43*/.TAKIPI_CREATE_ACCOUNT),format.raw/*60.65*/("""" target="_blank">Start free trial</a>
						</div>
					</div><!-- / box -->
					<div class="box">
						<div class="inner">
							<div class="top">
								<h3 class="large"><span class="wrap">Enterprise</span></h3>
							</div>
							<ul class="list">
								<li>For production environments</li>
								<li>Unlimited JVMs</li>
								<li>Unlimited data retention</li>
								<li>Unlimited docker containers</li>
								<li>Keep data on-premises</li>
								<li>Optimal performance: 1% overhead</li>
								<li>Advanced security (VPN + admin control)</li>
								<li>Premium support</li>
							</ul>
							<a class="btn-start" href=""""),_display_(/*78.36*/globals/*78.43*/.HELLO_MAILTO),format.raw/*78.56*/("""">Contact us</a>
						</div>
					</div><!-- / box -->
				</div><!-- / holder -->
			</div><!-- / plans-area -->
			<h2>All packages include:</h2>
			<div class="info-area" data-equal-height='.inner'>
				<div class="box">
					<div class="inner">
						<div class="img">
							<img src="assets/images/pricing/img-001.png" alt="image">
						</div>
						<h3>Unlimited number of users</h3>
						<p>Developers, DevOps and QA teams can stay in sync and up to date. Personal settings and view configuration.</p>
					</div><!-- / inner -->
				</div><!-- / box -->
				<div class="box">
					<div class="inner">
						<div class="img">
							<img src="assets/images/pricing/img-002.png" alt="image">
						</div>
						<h3>Unlimited number of events</h3>
						<p>We're here to make sure 100% of your production problems are tracked.</p>
					</div><!-- / inner -->
				</div><!-- / box -->
				<div class="box">
					<div class="inner">
						<div class="img">
							<img src="assets/images/pricing/img-003.png" alt="image">
						</div>
						<h3>New Relic, Jira integration</h3>
						<p>Your workflow just got better.</p>
					</div><!-- / inner -->
				</div><!-- / box -->
				<div class="box">
					<div class="inner">
						<div class="img">
							<img src="assets/images/pricing/img-004.png" alt="image">
						</div>
						<h3>Powerful alerting</h3>
						<p>Know when production code breaks and when new problems occur.</p>
					</div><!-- / inner -->
				</div><!-- / box -->
			</div><!-- / holder -->
			<h2>Standard / Enterprise packages also include:</h2>
			<ul class="info-list">
				<li><span class="holder">Full user management: Set permissions, restrict access by IP address.</span></li>
				<li><span class="holder">Automatic updates for the new capabilities: Next release includes performance monitoring.</span></li>
				<li><span class="holder">Monitor 3rd-party libraries: Detect errors involving 3rd-party and open-source projects (Elasticsearch, Hadoop, Spark, Kafka, Akka, Play).</span></li>
				<li><span class="holder">Cross-machine analytics: Get error analysis across different machines (Takipi must be installed on both machines).</span></li>
				<li><span class="holder">Advanced security settings: Exclude selected fields or classes (won't be tracked by Takipi). Generate secret keys locally.</span></li>
			</ul><!-- / info-list -->
			<h2 class="color-1">FAQ</h2>
			<div class="faq-area">
				<div class="col">
					<h3>Does Takipi offer volume discount rates?</h3>
					<p>Yes, please contact sales for volume pricing.</p>
					<h3>How does Takipi define a server?</h3>
					<p>A server is either a physical machine or a virtualized instance running an individual copy of an operating system. We identify servers by their unique host name.</p>
					<h3>How are Docker containers priced?</h3>
					<p>We charge per server. You can deploy an unlimited number of Docker containers in each server. We do not charge per Docker container.</p>
					<h3>What if I want to cancel my subscription?</h3>
					<p>You can cancel your subscription at any time. Your credit card will not be charged on the following billing cycle and your subscription will not be renewed upon expiration. If you decide to cancel your annual subscription, you will be charged a cancellation fee of 2x your monthly payment and your service will continue until the end of your next billing period. For example, if your monthly bill is $400, your cancellation fee would be $800.</p>
					<h3>If I'm on an annual subscription and decide to switch to a month-to-month plan, is there a cancellation fee?</h3>
					<p>Yes, the downgrade fee is 2x your monthly payment.</p>
				</div><!-- / col -->
				<div class="col">
					<h3>If I'm on a month-to-month plan and decide to switch to an annual subscription, is there a cancellation fee?</h3>
					<p>No.</p>
					<h3>How does the subscription plan work?</h3>
					<p>Annual server billing: Takipi will charge your credit card each month for 12 months. You can upgrade the subscription at any time and charges will adjust with the next monthly bill. Your subscription will be renewed automatically at the end of the year unless you change your subscription. If you cancel the service or downgrade to fewer servers during your commitment year, you will be charged a fee of 2x your monthly payment. For example, if your monthly bill is $1,000/mo., your cancellation fee would be $2,000. If you're on an annual subscription, a cancellation fee equal to 2x your monthly payment will be applied.</p>
					<p>Monthly server billing (cancel anytime): Takipi will charge your credit card each month. You can change your subscription at any time and charges will adjust with your next monthly bill. You can cancel the service at any time. Your subscription will be renewed automatically each month unless you change your subscription.</p>
					<h3>What if I want to cancel entirely?</h3>
					<p>Yes, we understand. If you decide to unplug Takipi entirely, please cancel before your next billing period. You will not be charged for the following month of service.</p>
				</div><!-- / col -->
			</div><!-- / faq-area -->
		</div><!-- / pricing-area -->
	</div>
</div>
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Apr 15 17:20:38 IDT 2015
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/pages/pricing.scala.html
                  HASH: 8ebbfe3b7de81c60d761ccd83f4ef87869fc46fa
                  MATRIX: 588->0|2014->1399|2030->1406|2073->1428|2914->2242|2930->2249|2964->2262|3061->2332|3077->2339|3120->2361|3797->3011|3813->3018|3847->3031
                  LINES: 22->1|57->36|57->36|57->36|79->58|79->58|79->58|81->60|81->60|81->60|99->78|99->78|99->78
                  -- GENERATED --
              */
          