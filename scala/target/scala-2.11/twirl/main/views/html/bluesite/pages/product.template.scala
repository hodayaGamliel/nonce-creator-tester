
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
object product extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<div id="blueSiteFeaturesMain">
	<div class="features">
		<div class="top-block">
			<div class="holder">
				<h1>Fix Critical Errors</h1>
				<p>Detect errors in production at the JVM level.<br/>Get the code and variable state you need to fix them.</p>
			</div>
		</div>
		<section class="section error" id="error-analysis">
			<div class="container">
				<div class="block">
					<div class="headline slim">
						<h2>Error analysis</h2>
					</div>
					<p>Takipi detects all caught and uncaught exceptions, HTTP and log errors, and shows the code and variable state that caused them.</p>
				</div><!-- / block -->
				<div class="error-tab">
					<div class="nav-holder">
						<ul class="nav-tabs">
							<li class="active">
								<a href="#tab-01" class="fat"><span>Analyze -</span> See variables and object values across the call stack.</a>
							</li>
							<li>
								<a href="#tab-02"><span>Reproduce -</span> Get the values passed into your code to reproduce every error in production.</a>
							</li>
							<li>
								<a href="#tab-03"><span>Distributed calls -</span> For errors involving calls across machines over HTTP, see the unified call stack with code and variables for each machine.</a>
							</li>
						</ul><!-- / nav-tabs -->
					</div><!-- / nav-holder  -->
					<div class="tabarea">
						<div class="tab" id="tab-01">
							<img src="assets/images/bluesite/img01.png" alt="image" width="608" height="345" >
						</div>
						<div class="tab" id="tab-02">
							<img src="assets/images/bluesite/img02.png" alt="image" width="608" height="331" >
						</div>
						<div class="tab" id="tab-03">
							<img src="assets/images/bluesite/img03.png" alt="image" width="608" height="331" >
						</div>
					</div><!-- / tabarea -->
				</div><!-- / error-tab -->
				<div class="btn-holder">
					<a class="btn" href=""""),_display_(/*44.28*/globals/*44.35*/.SAMPLE_TALE),format.raw/*44.47*/("""" target="_blank">View sample error</a>
					<a href="https://www.youtube.com/watch?v=U7t-FRvxqJ4" target="_blank" fancy-width="854" fancy-height="510" class="btn fancybox">Product video</a>
				</div>
			</div><!-- / container -->
		</section><!-- / section error -->
		<section class="section deployment" id="continuous-deployment">
			<div class="container">
				<div class="block">
					<div class="headline">
						<h2>Continuous Deployment</h2>
						<p>Know when code breaks</p>
					</div>
					<p>Takipi automatically detects code deployments and tells you when they introduce new errors.</p>
					<ul class="list">
						<li>See if new errors are introduced after a release.</li>
						<li>See which errors have increased, or are no longer happening.</li>
						<li>Mark an error as Resolved and get notified if it happens again in production.</li>
					</ul>
				</div><!-- / block -->
				<img class="alignright" src="assets/images/bluesite/img04.png" alt="image" width="634" height="278" >
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
		</section><!-- / section deployment -->
		<section class="section dashboard" id="engineering-dashboard">
			<div class="container">
				<div class="block">
					<div class="headline">
						<h2>Cut through the noise</h2>
						<p>Focus on the errors that matter</p>
					</div>
					<p>Powerful filtering and alerting capabilities let you cut through the noise and get to the errors that impact users the most.</p>
					<ul class="list">
						<li>See across applications, servers, and code components.</li>
						<li>Create your own views and alerting rules to zoom in on the errors that matter to you.</li>
						<li>Archive unimportant or known errors with one click.</li>
					</ul>
				</div><!-- / block -->
			</div><!-- / container -->
			<div class="img-holder first">
				<div class="hover-targets">
					<a class="app" href="#app" data-class="first">App</a>
					<a class="category" href="#category" data-class="second">Category</a>
					<a class="type" href="#type" data-class="third">Type</a>
				</div>
				<div class="img img-01">
					<img src="assets/images/bluesite/img05.png" alt="image" width="568" height="497" >
					<div class="form-popup">
						<form action="#">
							<div class="top">
								<input class="txt" type="text" placeholder="ad">
							</div>
							<ul class="switch">
								<li><a href="#">All</a></li>
								<li><a href="#">None</a></li>
							</ul>
							<div class="row">
								<input id="chk-01" type="checkbox">
								<label for="chk-01">ad-bidder</label>
							</div>
							<div class="row">
								<input id="chk-02" type="checkbox">
								<label for="chk-02">ad-currency-converter</label>
							</div>
							<div class="row">
								<input id="chk-03" type="checkbox" checked>
								<label for="chk-03">ad-campaign-builder</label>
							</div>
						</form>
					</div><!-- / form-popup -->
				</div>
				<div class="img img-02">
					<img src="assets/images/bluesite/img06.png" alt="image" width="568" height="497">
					<div class="form-popup">
						<form action="#">
							<div class="top">
								<input class="txt" type="text" placeholder="ad">
							</div>
							<ul class="switch">
								<li><a href="#">All</a></li>
								<li><a href="#">None</a></li>
							</ul>
							<div class="row">
								<input id="chk-04" type="checkbox">
								<label for="chk-04">JVM Exceptions</label>
							</div>
							<div class="row">
								<input id="chk-05" type="checkbox">
								<label for="chk-05">Amazon SDK</label>
							</div>
							<div class="row">
								<input id="chk-06" type="checkbox" checked>
								<label for="chk-06">IO Exceptions</label>
							</div>
						</form>
					</div><!-- / form-popup -->
				</div>
				<div class="img img-03">
					<img src="assets/images/bluesite/img07.png" alt="image" width="568" height="497">
					<div class="form-popup">
						<form action="#">
							<div class="top">
								<input class="txt" type="text" placeholder="ad">
							</div>
							<ul class="switch">
								<li><a href="#">All</a></li>
								<li><a href="#">None</a></li>
							</ul>
							<div class="row">
								<input id="chk-07" type="checkbox" checked>
								<label for="chk-07">Uncaught exceptions</label>
							</div>
							<div class="row">
								<input id="chk-08" type="checkbox">
								<label for="chk-08">Caught exceptions</label>
							</div>
							<div class="row">
								<input id="chk-09" type="checkbox">
								<label for="chk-09">Logged errors</label>
							</div>
						</form>
					</div><!-- / form-popup -->
				</div>
			</div><!-- / img-holder -->
		</section><!-- / section dashboard -->
		<section class="section developers" id="workflow">
			<div class="container">
				<div class="block">
					<div class="headline">
						<h2>Work together. Fix faster.</h2>
					</div>
					<p>Share the information needed to fix critical production errors between DevOps, engineers, and QA with one click.</p>
					<ul class="list">
						<li item="item-03" class="item-opener">Open a JIRA issue for an error in staging or production with a link to the code and variable state that led to it.</li>
						<li item="item-01" class="item-opener">Help your developers see which code caused production problem in one click.</li>
						<li>Capture each error you produce. No need to reproduce bugs.</li>
					</ul>
				</div><!-- / block -->
				<div class="items">
					<div class="item item-01" item="item-01" data-appear-top-offset="-400">
						<a href="#" class="img active">
							<img src="assets/images/bluesite/img08.png" alt="image">
						</a>
						<strong class="ttl">DevOps</strong>
						<div class="info-popup info-popup-02 left">
							<strong class="subtitle"><img src="assets/images/bluesite/ico15.png" alt="image" width="16" height="25" preventResize>Share with teammates</strong>
							<p class="txt">This just started happening in prod1 after today's release.<br><a href=""""),_display_(/*198.96*/globals/*198.103*/.SAMPLE_TALE),format.raw/*198.115*/("""" target="_blank">http//app.takipi.com/event=UzYyOTUjMUzlzE</a></p>
							<div class="holder">
								<span class="left">To:</span>
								<ul class="tags">
									<li>Danny R (developer)<a class="close" href="#">close</a></li>
									<li>Connie H (developer)<a class="close" href="#">close</a></li>
									<li>Stan M (Eng manager)<a class="close" href="#">close</a></li>
								</ul>
							</div>
						</div><!-- / info-popup -->
					</div>
					<div class="item item-02">
						<a href="#" class="img disabled">
							<img src="assets/images/bluesite/img09.png" alt="image">
						</a>
						<strong class="ttl">Developers</strong>
					</div>
					<div class="item item-03" item="item-03" data-appear-top-offset="-400">
						<a href="#" class="img active">
							<img src="assets/images/bluesite/img10.png" alt="image">
						</a>
						<strong class="ttl">QA</strong>
						<div class="info-popup right">
							<strong class="subtitle"><img src="assets/images/bluesite/ico14.png" alt="image" width="21" height="27" preventResize>Create JIRA issue</strong>
							<p>NullPointerException at CampaignBuilder.selectPublisher</p>
							<p class="txt">Click here to see code and variable state -<br><a href=""""),_display_(/*223.80*/globals/*223.87*/.SAMPLE_TALE),format.raw/*223.99*/("""" target="_blank">http//app.takipi.com/event=UzYyOTUjMUzlzE</a></p>
						</div><!-- / info-popup -->
					</div>
				</div><!-- / items -->
			</div><!-- / container -->
		</section><!-- / section developers -->
		<section class="section logs" id="smarter-logs">
			<div class="container">
				<div class="block">
					<div class="headline">
						<h2>Smarter logs</h2>
					</div>
					<p>Takipi links log errors to the code and variable state that caused them. So instead of seeing just a single error line in the log to troubleshoot, get the complete story that led to it.</p>
					<p>Supports Logback, Log4j, SLF4J, and more.</p>
					<p class="integration">Integrates with:<br/>
                        <img height="29" src="assets/images/bluesite/integration-logos.png" data-at2x="assets/images/bluesite/integration-logos&commat;2x.png" alt="Splunk / logstash / sumologic / loggly" />
                    </p>
				</div><!-- / block -->
				<div class="visual">
					<div class="img img-01">
					    <a href="#smarter-logs" class="click-here">click here</a>
						<img src="assets/images/bluesite/img11.png" alt="image" width="456" height="249" >
					</div>
					<div class="img img-02">
						<img src="assets/images/bluesite/img12.png" alt="image" width="488" height="264" >
					</div>
					<a class="link" href="#">Click here<span class="circle"></span></a>
				</div><!-- / visual -->
			</div><!-- / container -->
		</section><!-- / section logs -->
		<section class="section language" id="frameworks">
			<div class="container">
				<div class="block">
					<div class="headline">
						<h2>Works with your language and frameworks</h2>
					</div>
					<p>Takipi's Java agent runs at the JVM level and supports any JVM programming language, container, or framework.</p>
					<p><a href=""""),_display_(/*260.19*/routes/*260.25*/.BlueSite.howitworks),format.raw/*260.45*/("""">Click here</a> to learn more about how Takipi works.</p>
				</div><!-- / block -->
				<ul class="lang">
					<li><img src="assets/images/bluesite/logo-01.png" alt="#" width="133" height="69" ></li>
					<li><img src="assets/images/bluesite/logo-02.png" alt="#" width="86" height="61" ></li>
					<li><img src="assets/images/bluesite/logo-03.png" alt="#" width="56" height="65" ></li>
					<li><img src="assets/images/bluesite/logo-04.png" alt="#" width="116" height="70" ></li>
					<li><img src="assets/images/bluesite/logo-05.png" alt="#" width="81" height="62" ></li>
					<li><img src="assets/images/bluesite/logo-06.png" alt="#" width="152" height="70" ></li>
					<li><img src="assets/images/bluesite/logo-07.png" alt="#" width="108" height="70" ></li>
					<li><img src="assets/images/bluesite/logo-08.png" alt="#" width="108" height="70" ></li>
				</ul>
			</div><!-- / container -->
		</section><!-- / section language -->
		<section class="section debugger" id="production-debugger">
			<div class="container">
				<div class="block">
					<div class="headline">
						<h2>Meet your new production debugger</h2>
					</div>
					<p>Modern software development requires a new developer toolbox.</p>
					<ul class="list">
						<li>APM tools let you profile code performance.</li>
						<li class="ico-2">Log analyzers help you make sense of your logs.</li>
						<li class="ico-3">Takipi lets you detect and debug code in production.</li>
					</ul>
					<p>Takipi seamlessly integrates with <a href=""""),_display_(/*286.53*/routes/*286.59*/.Application.newrelicnew),format.raw/*286.83*/("""" target="_blank">New Relic</a> and log analyzers for a powerful production debugging experience.</p>
				</div><!-- / block -->
				<div class="img">
					<img src="assets/images/bluesite/img-12.png" alt="#" width="489" height="354">
				</div>
			</div><!-- / container -->
		</section><!-- / section debugger -->
	</div><!-- / features  -->
    """),_display_(/*294.6*/bluesite/*294.14*/.pages.scheduler_popup(false)),format.raw/*294.43*/("""
"""),format.raw/*295.1*/("""</div>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Apr 15 17:20:36 IDT 2015
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/bluesite/pages/product.scala.html
                  HASH: c8312fe356a5b1c537000e84681d709c67774225
                  MATRIX: 597->0|2484->1860|2500->1867|2533->1879|8896->8214|8914->8221|8949->8233|10203->9459|10220->9466|10254->9478|12086->11282|12102->11288|12144->11308|13689->12825|13705->12831|13751->12855|14127->13204|14145->13212|14196->13241|14225->13242
                  LINES: 22->1|65->44|65->44|65->44|219->198|219->198|219->198|244->223|244->223|244->223|281->260|281->260|281->260|307->286|307->286|307->286|315->294|315->294|315->294|316->295
                  -- GENERATED --
              */
          