
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
object security extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<div id="blueSiteSecurityMain">
	<div class="security-page">
		<article class="intro">
			<div class="container">
				<div class="holder">
					<h1>Security</h1>
					<p>Takipi employs multiple levels of encryption and administration to ensure that you have complete visibility and control over how data is collected and managed.</p>
					<nav class="nav-links">
						<ul>
							<li><a href="#auth-security">Two-factor authentication and data encryption</a></li>
							<li><a href="#user-controls">User controls</a></li>
							<li><a href="#data-collection">Error data collection</a></li>
							<li><a href="#code-analysis">Code analysis</a></li>
							<li><a href="#pii">Personal identifiable information filtering</a></li>
							<li><a href="#firewall">Firewall friendly</a></li>
							<li><a href="#on-premise">On-premises storage</a></li>
						</ul>
					</nav><!-- nav-links -->
				</div>
			</div>
		</article><!-- intro -->
		<section class="description container">
			<ol class="list">
				<li id="auth-security">
					<strong>Two factor authentication and data encryption -</strong> When you install Takipi, you privately generate a 256-bit AES encryption key that is kept behind your firewall. All code and variable data collected by Takipi is encrypted before it leaves your machine. Data is only sent to and stored by Takipi in its privately encrypted form. Decryption of error data from your servers only happens behind your firewall using your private key.
					<div class="img"><img src="assets/images/bluesite/img-0001.png" alt="#" width="679" height="340" ></div>
				</li>
				<li id="user-controls">
					<strong>User controls -</strong> The team management console gives you control over which team members have access to the service. You can also control the IP addresses from which they are allowed to access the service.
				</li>
				<li id="data-collection">
					<strong>Error data collection -</strong> Takipi only collects code and variable data that is directly related to an error which occurred within your application. While Takipi collects analytics for 100% of all errors in your application, debugging data is only collected for a configured number of samples.
				</li>
				<li id="code-analysis">
					<strong>Code analysis -</strong> When you load new bytecode into your JVM (identified by its unique binary signature), it is locally converted into an abstract graph which cannot be reverse engineered or executed. This is the only code-related information that is used by Takipi's hosted analysis engine to correlate events and orchestrate data collection across your cluster.
				</li>
				<li id="pii">
					<strong>Personally identifiable information filtering -</strong> Takipi automatically employs a set of customizable filters to redact personally identifiable and business-sensitive information before it leaves your local production machine. You can fully control the variable patterns, classes, and fields for which information is never collected.
					<div class="img img-2"><img src="assets/images/bluesite/img-0002.png" alt="#"></div>
				</li>
				<li id="firewall">
					<strong>Firewall friendly -</strong> Takipi's collector process only communicates with the hosted analysis engine using outbound HTTPS port 443 to a set of fixed IP addresses. Takipi does not require opening a port in your firewall for incoming communications.
				</li>
			</ol><!-- list -->
		</section><!-- description -->
		<section id="on-premise" class="storage">
			<div class="container">
				<div class="holder">
					<div class="headline">
						<h2>On-premises storage</h2>
						<p>Control where collected error variable and code data is stored, either in the cloud or on-premises.</p>
					</div>
					<p>In the on-premises configuration, code and variable information collected for errors on your machines is transmitted by the local collector process to a server which resides behind your firewall. This server does not communicate with, nor does it require network access to, Takipi's hosted analysis engine, which is only responsible for correlating events across nodes and alerting on errors.</p>
					<p>Whenever you are alerted about a new error or open an existing one from your dashboard, code and variable information for that error is pulled directly from the on-premises server without ever leaving your domain.</p>
					<div class="tabs-storage">
						<ul class="nav-tabs">
							<li><a href="#tab-01">Detect</a></li>
							<li><a href="#tab-02">Alert</a></li>
							<li><a href="#tab-03">Fix</a></li>
						</ul><!-- nav-tabs -->
						<div class="content-tabs">
							<div id="tab-01">
								<img src="assets/images/bluesite/img-0003.png" alt="#" width="583" height="359" preventResize >
							</div>
							<div id="tab-02">
								<img src="assets/images/bluesite/img-0004.png" alt="#" width="583" height="359" preventResize >
							</div>
							<div id="tab-03">
								<img src="assets/images/bluesite/img-0005.png" alt="#" width="583" height="359" preventResize >
							</div>
						</div>
					</div><!-- tabs-storage -->
					<div class="link-holder">
						<a href=""""),_display_(/*74.17*/globals/*74.24*/.SECURITY_WHITEPAPER),format.raw/*74.44*/("""" class="link-download" target="_blank"><strong>Click here</strong> to download the complete Security white paper.</a>
					</div><!-- / link-holder -->
				</div>
			</div><!-- container -->
		</section><!-- storage -->
		<section class="ask-question">
			<header class="headline">
				<div class="container">
					<h3><strong>Other questions?</strong> We're here to help. Use the live chat or email us at <a href=""""),_display_(/*82.107*/globals/*82.114*/.HELLO_MAILTO),format.raw/*82.127*/("""">"""),_display_(/*82.130*/globals/*82.137*/.HELLO_MAIL),format.raw/*82.148*/("""</a></h3>
				</div>
			</header><!-- headline -->
		</section>
	</div><!-- security-page -->
</div>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Apr 15 17:20:37 IDT 2015
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/bluesite/pages/security.scala.html
                  HASH: 503c7ac76a26895b2484aa985e71aa718c567388
                  MATRIX: 598->0|5776->5151|5792->5158|5833->5178|6278->5595|6295->5602|6330->5615|6361->5618|6378->5625|6411->5636
                  LINES: 22->1|95->74|95->74|95->74|103->82|103->82|103->82|103->82|103->82|103->82
                  -- GENERATED --
              */
          