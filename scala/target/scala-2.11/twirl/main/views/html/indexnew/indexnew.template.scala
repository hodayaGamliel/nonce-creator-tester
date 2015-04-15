
package views.html.indexnew

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
object indexnew extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<div class="innterWrapper">
		<section class="top-area">
			<div class="container">
				<h1>No One Likes Surprises in Production</h1>
				<p class="miniTitle">Cut down the ‘detect-fix-deploy’ cycle to minutes</p>
				<p class="miniTitle">Have zero critical server errors</p>
				<p class="miniTitle">Slash debugging time </p>
				<div class="start-form">
					<div class="indexHeaderMiniSignup" createdin="header"></div>
					<p class="info">Solve your first bug by <span id="errorAnalysisTime">5:38pm</span> </p>
					<p class="info">Java / Scala developers</p>
				</div>
			</div><!-- container -->
			<img src="assets/images/index/img-04.png" alt="#" class="img">
		</section><!-- top-area -->
		<section class="counters">
			<div class="container">
				<div class="box">
					<strong class="ttl">Unique errors tracked</strong>
					<div id="timer-01" class="timer" data-speed="1000" data-refresh-interval="10"></div>
				</div>
				<div class="box">
					<strong class="ttl">Servers in play</strong>
					<div id="timer-02" class="timer" data-speed="1000" data-refresh-interval="10"></div>
				</div>
			</div><!-- container -->
		</section><!-- counters -->
		<section class="info-container">
			<div class="container">
				<h2>Production environments generate hundreds of unique errors a day. <br />Takipi tells you which ones to tackle first.</h2>
				<div class="animation">
					<div class="asteroid appear">
						<span class="asteroid-bg"></span>
						<img src="assets/images/index/img-05.png" alt="#">
						<strong class="caption bubble1">A new deployment <br />breaks your code</strong>
					</div><!-- asteroid -->
					<div class="asteroid asteroid-2 appear">
						<span class="asteroid-bg"></span>
						<img src="assets/images/index/img-06.png" alt="#">
						<strong class="caption bubble2">Error rate increased</strong>
					</div><!-- asteroid-2 -->
					<div class="asteroid asteroid-3 appear">
						<span class="asteroid-bg"></span>
						<img src="assets/images/index/img-07.png" alt="#">
						<strong class="caption">3rd party changes <br />affect you</strong>
					</div><!-- asteroid-3 -->
					<div class="asteroid asteroid-4 appear">
						<span class="asteroid-bg"></span>
						<img src="assets/images/index/img-08.png" alt="#">
						<strong class="caption">A resolved error returns</strong>
					</div><!-- asteroid-4 -->
				</div><!-- animation -->
				<h2>See live recordings of the code and state which caused the error. <br />Debugging at scale finally made easy.</h2>
				<div id="tabs-01" class="tabs">
					<ul class="nav-tabs">
						<li class="active"><a data-toggle="tab" href="#tab-01">GenerateCampaign.handleCampaign</a></li>
						<li class="ico-2"><a data-toggle="tab" href="#tab-02">MoviesInserter.generateCampaign</a></li>
						<li class="ico-3"><a data-toggle="tab" href="#tab-03">GenerateCampaignServlet.work</a></li>
						<li class="ico-4"><a data-toggle="tab" href="#tab-04">AuthenticatedResourceServlet.authenticateGet</a></li>
						<li class="ico-5"><a data-toggle="tab" href="#tab-05">DefaultHttpServlet.doGet</a></li>
					</ul>
					<div>
						<div id="tab-01" class="tab">
							<h3>GenerateCampaign.handleCampaign</h3>
							<div class="code">
								<img src="assets/images/index/img-09.png" alt="#">
								<img src="assets/images/index/img-10.png" alt="#" class="hint">
								<img src="assets/images/index/img-11.png" alt="#" class="hint hint-2 item-2">
								<img src="assets/images/index/img-12.png" alt="#" class="hint hint-3 item-3">
							</div>
						</div><!-- tab-01 -->
						<div id="tab-02" class="tab">
							<h3>MoviesInserter.generateCampaign</h3>
							<div class="code">
								<img src="assets/images/index/img-13.png" alt="#">
								<img src="assets/images/index/img-11.png" alt="#" class="hint hint-4">
								<img src="assets/images/index/img-12.png" alt="#" class="hint hint-5 item-2">
							</div>
						</div><!-- tab-02 -->
						<div id="tab-03" class="tab">
							<h3>GenerateCampaignServlet.work</h3>
							<div class="code">
								<img src="assets/images/index/img-001.png" alt="#">
								<img src="assets/images/index/img-002.png" alt="#" class="hint hint-6">
								<img src="assets/images/index/img-003.png" alt="#" class="hint hint-7 item-2">
								<img src="assets/images/index/img-004.png" alt="#" class="hint hint-8 item-3">
							</div>
						</div><!-- tab-03 -->
						<div id="tab-04" class="tab">
							<h3>AuthenticatedResourceServlet.authenticateGet</h3>
							<div class="code">
								<img src="assets/images/index/img-005.png" alt="#">
								<img src="assets/images/index/img-003.png" alt="#" class="hint hint-9">
								<img src="assets/images/index/img-007.png" alt="#" class="hint hint-10 item-2">
							</div>
						</div><!-- tab-04 -->
						<div id="tab-05" class="tab">
							<h3>DefaultHttpServlet.doGet</h3>
							<div class="code">
								<img src="assets/images/index/img-008.png" alt="#">
								<img src="assets/images/index/img-003.png" alt="#" class="hint hint-11">
								<img src="assets/images/index/img-009.png" alt="#" class="hint hint-12 item-2">
								<img src="assets/images/index/img-010.png" alt="#" class="hint hint-13 item-3">
							</div>
						</div><!-- tab-05 -->
					</div>
				</div><!-- tabs -->
			</div><!-- container -->
		</section><!-- info-container -->
		<div class="stack-area infix">
			<div class="video-player">
				<video id="demo-video" poster="assets/images/index/img03.jpg"> 
					<source src="assets/videos/index/demo.mp4" type="video/mp4"><!-- codecs="avc1.42E01E, mp4a.40.2" -->
				</video><!-- / video-bg -->
			</div><!-- / video-player -->
		</div><!-- /stack-area -->
		<div class="about-inf container">
			<section class="post">
				<img src="assets/images/index/img01.png" alt="image description">
				<h3>What’s Takipi's overhead? Practically zero</h3>
				<p>Built for production. Takipi was designed for scale and has a maximum overhead of 3% CPU. Unlike profilers, Takipi is built to run continuously on your server.</p>
				<a href=""""),_display_(/*122.15*/globals/*122.22*/.TAKIPI_SUPPORT_SITE),format.raw/*122.42*/("""/performance-overhead/" class="more">Learn more. </a>
			</section>
			<section class="post alignleft">
				<img src="assets/images/index/img02.png" alt="image description">
				<h3>Security</h3>
				<p>Source code and data are secure. Only code structure is uploaded to the cloud and not the data itself. Your data is encrypted using your private 256-bit AES key.</p>
				<a href=""""),_display_(/*128.15*/globals/*128.22*/.TAKIPI_SUPPORT_SITE),format.raw/*128.42*/("""/security/" class="more">Learn more.</a>
			</section>
		</div>
		<div class="bottom-area style02">
			<div class="start-form">
				<form action="#">
					<h2>Get started</h2>
					<label for="lbl-002">Takipi is a Java agent, installs in minutes. No code annotations or configurations.<br /> Keep one server with full capabilities free for good.</label>
					<div class="indexFooterMiniSignup" createdin="footer"></div>
				</form>
				<div class="notes">
					<p>Java / Scala developers</p>
				</div>
			</div>
		</div><!-- /bottom-area -->
	</div><!-- /innerWrapper -->
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Apr 15 17:20:37 IDT 2015
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/indexnew/indexnew.scala.html
                  HASH: 7dac98a2b4e64c2e8957142793e61574e0457f55
                  MATRIX: 592->0|6679->6059|6696->6066|6738->6086|7149->6469|7166->6476|7208->6496
                  LINES: 22->1|143->122|143->122|143->122|149->128|149->128|149->128
                  -- GENERATED --
              */
          