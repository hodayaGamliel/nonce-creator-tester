
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
object featuresreorder extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<div class="backgroundFiller"></div>
<div id="featuresMain" class="subPageMain">
	<div class="slimSiteCentered">
		<div class="heading">
			<h1>Features</h1>
			<div class="headerMiniSignup"></div>
		</div>
	</div>
	<div class="features-area">
		<div class="fix" id="fix">
			<div class="container">
				<header class="headline">
					<h2>Here's the real magic:<br/>See what caused each bug. Fix it in minutes</h2>
					<p>Get immediate resolution by connecting developers with production errors.</p>
				</header><!-- / headline -->
				<div class="holder">
					<video width="665" height="296" class="alignright" poster="assets/images/features/rec1.gif" autoplay loop>
						<source src="assets/videos/features/vid-features-01.mp4" type="video/mp4">
					</video>
					<div class="description">
						<p>Alerting is not enough. Takipi provides DevOps and engineers the information they need to fix bugs. Get the source code and variable values behind each error - right as if you were there.</p>
						<ul class="list color-1">
							<li>See all the variables across the stack, without logging a single line.</li>
							<li>View the root cause in your code - even across machines.</li>
							<li>Access multiple reproductions for each error.</li>
							<li>Collaborate effortlessly between developers, DevOps and QA.</li>
						</ul>
					</div>
				</div><!-- / holder -->
			</div><!-- / container -->
		</div><!-- / fix -->
		<div class="colored detect" id="detect">
			<div class="container">
				<header class="headline">
					<h2>See which errors really impact your application</h2>
					<p>Takipi is built for environments where millions of errors happen every day.</p>
					<p>We'll tell you which ones really matter.</p>
				</header><!-- / headline -->
				<div class="holder">
					<img class="alignright" src="assets/images/features/img-features-02.png" alt="image">
					<div class="description">
						<p>Complete visibility to see which errors:</p>
						<ul class="list">
							<li class="ico ico-01">Come from code that was recently modified.</li>
							<li class="ico ico-02">Are new or increasing in rate.</li>
							<li class="ico ico-03">Keep happening even after marked as "resolved".</li>
						</ul>
					</div>
				</div><!-- / holder -->
				<div class="bubble bubble-1">
					<span class="tbl">
						<span class="tbl-cell"><span class="marked">Marked as resolved</span><br>3 days ago</span>
					</span>
				</div>
				<div class="bubble bubble-2">
					<span class="tbl">
						<span class="tbl-cell">Last 24 hr<span class="sep"><span class="up">270%</span></span></span>
					</span>
				</div>
			</div><!-- / container -->
		</div><!-- / detect -->
		<div class="errors" id="errors">
			<div class="container">
				<header class="headline">
					<h2>Code breaks<br/>Get actionable insights once it happens</h2>
					<p>Takipi automatically detects 100% of errors in high-scale production code.</p>
				</header>
				<div class="errors-holder">
					<div class="errors-block">
						<div class="top">
							<h3>Errors</h3>
							<p>Instantly see all uncaught and caught exceptions,<br>log and HTTP errors anywhere in your application.</p>
						</div>
						<img class="img" src="assets/images/features/img-features-01.png" alt="image">
						<div class="bottom">
							<div class="holder">
								<h3>Slowdowns</h3>
								<p>See performance of all Java / Scala code.<br>No anotations or configuration needed.</p>
							</div>
						</div>
					</div><!-- / errors-block -->
				</div><!-- / errors-holder -->
			</div><!-- / container -->
		</div><!-- / errors -->
		<div class="integrate colored" id="integrate">
			<div class="container">
				<header class="headline">
					<h2>Get new data from your log files<br/>Solve bugs much faster</h2>
					<p>Make your log files smarter. Empower your Jira and New Relic.</p>
				</header><!-- / headline -->
				<div class="holder">
					<div class="visual">
						<img class="img-01" src="assets/images/features/img-features-05.png" alt="image">
						<img class="img-02" src="assets/images/features/img-features-06.png" alt="image">
						<a class="link" href="#">Try<br>Me</a>
					</div>
					<div class="description">
						<div class="note">
							<p>One of Takipi's biggest time-savers is log integration.<br>Next to each error in your log you'll find a link to the<br>code and variables which caused it. This reduces the back and forth<br>between engineers and DevOps and time to resolution.<br>Zero configuration needed. Supports Logback, Log4j, SLF4J, and more.</p>
						</div>
						<ul class="logos">
							<li><a href="https://www.atlassian.com/software/jira" target="_blank"><img src="assets/images/features/ico-features-03.png" alt="image"></a></li>
							<li><a href="http://newrelic.com/plugins/takipi/156" target="_blank"><img src="assets/images/features/ico-features-04.png" alt="image"></a></li>
						</ul>
						<ul class="links">
							<li><a href=""""),_display_(/*106.22*/routes/*106.28*/.Application.logs),format.raw/*106.45*/("""" target="_blank">Takipi log links</a></li>
							<li><a href=""""),_display_(/*107.22*/routes/*107.28*/.Application.newrelicnew),format.raw/*107.52*/("""" target="_blank">Takipi for New Relic</a></li>
						</ul>
					</div>
				</div>
			</div><!-- / container -->
		</div><!-- / integrate -->
		<div class="performance" id="performance">
			<div class="container">
				<header class="headline">
					<h2>Created for extreme performance restrictions<br/>Max 3% CPU</h2>
					<p>Takipi is built from the ground up to continuously run in high-scale environments.</p>
				</header><!-- / headline -->
				<div class="holder">
					<img class="alignright" src="assets/images/features/img-features-04.gif" alt="image">
					<div class="description">
						<ul class="list">
							<li>High-performance sampling tracks all errors in your application with low CPU and throughput overhead. Smart algorithms control when error data is collected.</li>
							<li>CPU overhead is throttled at 3%. Since data is only collected for errors, Takipi does not consume material network bandwidth or disk space.</li>
							<li>No overhead to the JVM heap or GC time.</li>
						</ul>
						<a class="more" href=""""),_display_(/*127.30*/globals/*127.37*/.TAKIPI_SUPPORT_SITE),format.raw/*127.57*/("""/performance-overhead/" target="_blank">Learn More</a>
					</div>
				</div><!-- / holder -->
			</div><!-- / container -->
		</div><!-- / configuration -->
		<div class="up-running" id="signup">
			<div class="container">
				<header class="headline">
					<h2>Up and running in 5 minutes</h2>
					<p>Easy to try out. Simple to deploy.</p>
				</header>
				<ul class="feature-list">
					<li>Chef and Puppet automation.</li>
					<li>No need to add annotations, API calls or dependencies to your applications.</li>
					<li>Takipi runs at a JVM level and supports Java, Scala, Groovy and Clojure applications.</li>
				</ul>
			</div>
		</div><!-- / up-running -->
	</div><!-- / features-area -->
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
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/pages/featuresreorder.scala.html
                  HASH: 7b1a898a13c49d11ac98820a5fbac9286ab278a4
                  MATRIX: 596->0|5594->4970|5610->4976|5649->4993|5742->5058|5758->5064|5804->5088|6875->6131|6892->6138|6934->6158
                  LINES: 22->1|127->106|127->106|127->106|128->107|128->107|128->107|148->127|148->127|148->127
                  -- GENERATED --
              */
          