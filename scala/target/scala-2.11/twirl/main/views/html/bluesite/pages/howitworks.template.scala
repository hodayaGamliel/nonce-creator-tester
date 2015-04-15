
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
object howitworks extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<div id="blueSiteHowItWorksMain">
	<section class="about">
		<header class="top container">
			<h1>How it works</h1>
			<p>Takipi supports all JVM-based languages, and does not require code changes or build configurations to use.</p>
			<p>To begin, install the Takipi daemon process on the target machine. You can then monitor a target application by adding a standard <i>-agentlib</i>
  			parameter to its list of JVM arguments. The agent library detects all caught and uncaught exceptions, HTTP and log errors from the JVM, without needing to access log files.</p>
		</header><!-- end top -->
		<div class="about-diagram">
			<figure class="container">
				<ul class="labels">
					<li class="label-001"><span><em>APP1</em></span></li>
					<li class="label-002"><span><em>JVM</em></span></li>
					<li class="label-003"><span><em>AGENT</em></span></li>
					<li class="label-004"><span><em>APP2</em></span></li>
					<li class="label-005"><span><em>JVM</em></span></li>
					<li class="label-006"><span><em>AGENT</em></span></li>
					<li class="label-007"><span><em>DAEMON</em></span></li>
					<li class="label-008"><span><em>STORAGE</em></span></li>
					<li class="label-009"><span><em>ANALYSIS ENGINE</em></span></li>
				</ul><!-- end labels -->
				<ul class="popups">
					<li class="popup-001">
						<a href="#">1</a>
						<div class="box">
							<i class="ico ico-001">&nbsp;</i>
							<p>Takipi uses a combination of JVMTI, bytecode and machine code instrumentation to detect and react to events at the processor level, without affecting execution of code even under extreme performance conditions.</p>
						</div><!-- end box -->
					</li>
					<li class="popup-002">
						<a href="#">2</a>
						<div class="box">
							<i class="ico ico-002">&nbsp;</i>
							<p>The daemon process collects data from the java agents and communicates with Takipi's central analysis engine which correlates events across your cluster and alerts on errors.</p>
						</div><!-- end box -->
					</li>
					<li class="popup-003">
						<a href="#">3</a>
						<div class="box">
							<i class="ico ico-003">&nbsp;</i>
							<p>All code and variable data collected on your machines is redacted for personally identifiable information, and encrypted using a private AES encryption key before leaving your machine.</p>
						</div><!-- end box -->
					</li>
					<li class="popup-004">
						<a href="#">4</a>
						<div class="box">
							<i class="ico ico-004">&nbsp;</i>
							<p>All communications with Takipi's central analysis engine are made over outbound HTTPS using port 443.</p>
						</div><!-- end box -->
					</li>
					<li class="popup-005">
						<a href="#">5</a>
						<div class="box">
							<i class="ico ico-005">&nbsp;</i>
							<p>Open the dashboard to get a bird's eye view of all errors in your cluster and drill into those that matter the most. Get complete control over which errors you are alerted about.</p>
						</div><!-- end box -->
					</li>
					<li class="popup-006">
						<a href="#">6</a>
						<div class="box">
							<i class="ico ico-006">&nbsp;</i>
							<p>Takipi offers two modes for storing encrypted code and variable data collected on your server. Data can either be stored in the cloud (Pro), or stored and retrieved from an on-premises server (Enterprise).</p>
						</div><!-- end box -->
					</li>
				</ul><!-- end popups -->
				<img src="assets/images/bluesite/img-001.png" width="920" height="466" alt="image">
			</figure>
		</div><!-- end about-diagram -->
		<div id="performance" class="cols container">
			<div class="col">
				<p><strong>Capped CPU overhead (&lt; 3%)</strong> - Takipi employs self-throttling at the JVM level, combined with continuous guidance provided by the central code analysis engine to limit the number of error snapshots taken. This ensures CPU usage by the agent is kept under a 3% threshold.</p>
				<p><strong>Dynamic throttling</strong> - Since Takipi only reacts to errors, it does not affect normal code execution. Even if a transaction is experiencing a high degree of failures (expected or unexpected), Takipi's agent will reduce the number of snapshots to ensure no impact to throughput.</p>
				<p><strong>No reliance on logs</strong> - The agent collects statistics on exceptions and error logging directly from the JVM, regardless of how events are eventually logged to disk. As such, Takipi does not access or upload log files from your machine.</p>
			</div><!-- end col -->
			<div class="col">
				<p><strong>Network overhead (&lt; 50Mb per hour)</strong> - Error information captured by the JVM agent is placed into shared memory and sent for storage by the daemon process. The size of debugging samples is capped at 50Mb per hour (only aggregate error statistics will continue to be collected).</p>
				<p><strong>No GC overhead</strong> - Takipi runs at the native JVM level and does not allocate Java objects at run-time. Collected information is placed directly in shared memory outside of the managed heap. These ensure that no overhead is added to your application's garbage collection (GC) time.</p>
				<p><strong>No dependency on Takipi</strong> - The java agent is not dependent on the availability of Takipi's central analysis service or the local collector process. If at any time these become unavailable, the agent enters a dormant state with no effect on the execution of code within the JVM.</p>
				<p class="bottom"><a href=""""),_display_(/*79.33*/routes/*79.39*/.BlueSite.security),format.raw/*79.57*/(""""><i class="ico-lock">&nbsp;</i>Click here</a> to learn more about data security in Takipi.</p>
			</div><!-- end col -->
		</div><!-- end cols -->
	</section><!-- end about -->
    """),_display_(/*83.6*/bluesite/*83.14*/.pages.scheduler_popup()),format.raw/*83.38*/("""
"""),format.raw/*84.1*/("""</div>
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Apr 15 17:20:36 IDT 2015
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/bluesite/pages/howitworks.scala.html
                  HASH: 8728d48767fbd4bbf45dc34a267f6e3c5f9debea
                  MATRIX: 600->0|6089->5462|6104->5468|6143->5486|6352->5669|6369->5677|6414->5701|6442->5702
                  LINES: 22->1|100->79|100->79|100->79|104->83|104->83|104->83|105->84
                  -- GENERATED --
              */
          