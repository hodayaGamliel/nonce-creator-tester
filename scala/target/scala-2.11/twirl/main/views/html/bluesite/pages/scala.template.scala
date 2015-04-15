
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
object scala extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<div id="blueSiteIndexMain" class="scala-page">
	<section class="takipi-for-scala">
		<div class="slimSiteCentered">
			<div class="descr">
				<h1>Takipi for Scala</h1>
				<p>Takipi tells you when and why Scala code breaks in production.</p>
				<p><hr /></p>
				<div class="form-container">
                   <p class="form-text">A JVM tool built specifically for Scala and Akka.<br/>
Know when critical errors are introduced into production.<br/>
Fix errors in high-scale data processing and message based systems.</p>
                    <div class="start-form takipiMiniSignupForm" createdin="header">
                        <form action="#">
                            <div class="row">
                                <input class="text emailInput" type="email" placeholder="Email address">
                                <input class="btn-submit createStubAccountBtn" type="submit" value="Start using Takipi &gt;&gt;">
                            </div>
                            <div class="errorLabel">User already exists <a class="loginLink" href=""""),_display_(/*18.101*/globals/*18.108*/.LOGIN_PAGE),format.raw/*18.119*/("""">Log in</a></div>
                            <p class="sub-note">Java / Scala</p>
                        </form>
                    </div>
				</div>
			</div>
		</div>
	</section><!-- /takipi-for-scala -->
    <section class="typesafe">
        <img src="assets/images/220_typesafe.png" alt="typeface logo" width="104" height="24" />Typesafe calls Takipi one of the most exciting Scala developer tools today <a href="http://typesafe.com/blog/Introducing-Takipi-God-Mode-in-Production-Scala-Code" target="_blank">Read more >></a>
    </section><!-- /typesafe -->
    <section class="production-info">
		<div class="slimSiteCentered">
			<div class="headline">
				<h2 class="marked">see the cause - CODE AND VARIABLES</h2>
				<p>Takipi detects caught and uncaught exceptions, actor and log errors in Scala and Akka applications<br/> and shows you the code and variable state that caused them - right as if you were there.</p>
			</div>
			<div class="production-area">
				<div class="col-left">
					<div class="history-box">
						<strong class="ttl">NullPointerException</strong>
						<p>CampaignBuilder pickPublisher</p>
						<ul class="list">
							<li><img src="assets/images/bluesite/ico01.png" alt="image">First seen Dec 17</li>
							<li><img src="assets/images/bluesite/ico02.png" alt="image">26 times</li>
						</ul>
						<div class="error-block">
							<a class="select open-link" href="#">
								<ul class="num">
									<li class="num-01">4</li>
									<li class="num-02">2</li>
								</ul>
								<span class="text">Dec 18, 11:32 am</span>
							</a>
							<ul class="error-list">
								<li><a href="#"><em class="date">Dec 18, 11:33 am</em><span class="txt">na.dallas.dc02.campaign-builder-02</span></a></li>
								<li><a href="#"><em class="date">Dec 18, 11:32 am</em><span class="txt">na.dallas.dc01.campaign-builder-02</span></a></li>
								<li><a href="#"><em class="date">Dec 17, 3:11 pm</em><span class="txt">na.dallas.dc01.campaign-builder-02</span></a></li>
								<li><a href="#"><em class="date">Dec 17, 11:33 am</em><span class="txt">na.boston.dc01.campaign-builder-02</span></a></li>
								<li><a href="#"><em class="date">Dec 17, 11:33 am</em><span class="txt">na.boston.dc01.campaign-builder-02</span></a></li>
							</ul>
							<div class="info-link info-link-01">
								<a href="#">Error history</a>
								<div class="box">
									<p>See multiple instances of the error at different times and from different machines.</p>
								</div>
								<a href="#" class="hotspot"></a>
							</div>
						</div><!-- / error-block -->
					</div><!-- / history-box -->
					<ul class="nav-list">
						<li class="style-05">CampaignBuilder pickPublisher</li>
						<li class="style-05">CampaignBuilder buildCampaign</li>
						<li class="style-05">CampaignRoute campaignRoute λ-1</li>
						<li class="style-01 style-05">
							<a class="open-link" href="#">na.dallas.dc01.campaign-builder-02</a>
							<div class="info-link info-link-02">
								<a href="#">Unified stacks</a>
								<div class="box">
									<p>If an error involves calls across multiple machines over HTTP / REST, Takipi shows the unified call stack - complete with code and variables for each machine.</p>
								</div>
								<a href="#" class="hotspot"></a>
							</div>
						</li>
						<li class="style-04 color-02">BidRequestTask.execute</li>
						<li class="style-04 color-02">TaskExecutor.execute</li>
						<li class="style-02 style-04 color-02">
							<a class="open-link" href="#">QueueTasksFetcher.run</a>
							<div class="info-link info-link-03">
								<a href="#">Reproduce errors</a>
								<div class="box">
									<p>Get the values passed into your code to reproduce every production error.</p>
								</div>
								<a href="#" class="hotspot"></a>
							</div>
						</li>
						<li class="style-03 style-04 color-02">na.california.dc02.ad-bidder-11</li>
					</ul><!-- / nav-list -->
				</div><!-- / col-left -->
				<div class="col-right">
					<div class="wrap-01">
						<div class="info-holder">
							<strong class="subtitle">CampaignBuilder pickPublisher</strong>
							<div class="code-block">
								<span class="line"><span class="color-1">def</span> pickPublisher(<span class="info-block">
                                        <a class="link" href="#">publisher</a>
                                        <span class="holder">
                                            <strong class="sub-head">publisher</strong>
                                            <span class="list-item"><span class="left">minPrice</span><span class="right">0.2</span></span>
                                            <span class="list-item"><span class="left">maxPrice</span><span class="right">0.7</span></span>
                                            <span class="list-item">...</span>
                                        </span>
                                    </span><span class="color-1">:</span>Publisher)<span class="color-1">:</span>Boolean
								    <span class="color-1">=</span> """),format.raw/*111.44*/("""{"""),format.raw/*111.45*/("""
                                """),format.raw/*112.33*/("""</span>
                               
                                <span class="line"><span class="spaces spaces-02"></span><span class="color-1">val</span>
                                    <span class="info-block info-block-02">
                                        <a class="link" href="#">allowance</a>
                                        <span class="holder">0.8</span>
                                    </span>
                                    <span class="color-1">=</span>

                                    <span class="info-block">
                                        <a class="link" href="#">publisher</a>
                                        <span class="holder">
                                            <strong class="sub-head">publisher</strong>
                                            <span class="list-item"><span class="left">minPrice</span><span class="right">0.2</span></span>
                                            <span class="list-item"><span class="left">maxPrice</span><span class="right">0.7</span></span>
                                            <span class="list-item">...</span>
                                        </span>
                                    </span>.getAllowance
                                </span>
                                 <span class="line"></span>
                                <span class="line highlight flame"><span class="spaces spaces-02"></span>
                                    <span class="color-1">return</span> ((<span class="info-block info-block-02">
                                        <a class="link" href="#">bidPrice</a>
                                        <span class="holder">null</span>
                                    </span>.minimum()
                                    <span class="color-1">&gt;=</span> 
                                    <span class="var">
                                        <span class="info-block info-block-02">
                                            <a class="link open-link" href="#">allowance</a>
                                            <span class="var-holder">0.8</span><span class="info-link info-link-04">
                                            <a href="#">Hover over variables</a>
                                            <span class="box">to see their value when the error occurred. Takipi automatically reconstructs the code leading to the error within the JVM.</span>
                                            <a href="#" class="hotspot"></a>
                                       </span></span></span>) 
                                    <span class="color-1">&amp;&amp;</span>
                                </span>
                                <span class="line"><span class="spaces spaces-02"></span><span class="spaces spaces-03"></span>(<span class="info-block info-block-02">
									<a class="link" href="#">bidPrice</a>
									<span class="holder">null</span>
								</span>.maximum() <span class="color-1">&lt;=</span> 
                                    <span class="info-block info-block-02">
                                        <a class="link" href="#">allowance</a>
                                        <span class="holder">0.8</span>
                                    </span>))</span>
                                <span class="line"> &#125;</span>
                                          
                                       
								<div class="values">
									<a class="sub-head open-link" href="#">Recorded variables</a>
									<ul class="list">
										<li class="caret">
											<a href="#">
												<span class="left">this</span>
												<span class="right">CampaignB...</span>
											</a>
											<ul>
												<li>
													<a href="#">
														<span class="left">bidPrice</span>
														<span class="right">null</span>
													</a>
												</li>
												<li>
													<a href="#">
														<span class="left">transactionId</span>
														<span class="right">"WEsdkjcv2...</span>
													</a>
												</li>
												<li>
													<a href="#">
														<span class="left">hostId</span>
														<span class="right">"127.0.0.1"</span>
													</a>
												</li>
											</ul>
										</li>
										<li>
											<a href="#">
												<span class="left">allowance</span>
												<span class="right">0.8</span>
											</a>
										</li>
										<li class="caret">
											<a href="#">
												<span class="left">publisher</span>
												<span class="right">Publisher</span>
											</a>
											<ul class="drop-open">
												<li>
													<a href="#">
														<span class="left">minPrice</span>
														<span class="right">0.2</span>
													</a>
												</li>
												<li>
													<a href="#">
														<span class="left">maxPrice</span>
														<span class="right">0.7</span>
													</a>
												</li>
												<li>
													<a href="#">
														<span class="left">currency</span>
														<span class="right">$ (USD)</span>
													</a>
												</li>
												<li>
													<a href="#">
														<span class="left">name</span>
														<span class="right">"P&amp;G"</span>
													</a>
												</li>
											</ul>
										</li>
									</ul>
									<div class="info-link info-link-05">
										<a href="#">See object values</a>
										<div class="box">
											<p>across the entire call stack, 5 levels into the heap.</p>
										</div>
										<a href="#" class="hotspot"></a>
									</div>
								</div><!-- / values -->
							</div><!-- / code-block -->
						</div><!-- / info-holder -->
						<div class="info-holder">
							<strong class="subtitle">CampaignBuilder buildCampaign</strong>
							<div class="code-block">
                                <span class="line"><span class="spaces spaces-01"></span><span class="color-1">def</span> buildCampaign<span class="color-1">:</span>JSONObject <span class="color-1">=</span> """),format.raw/*240.208*/("""{"""),format.raw/*240.209*/("""</span><!-- / line -->
                                <span class="line"><span class="spaces spaces-05"></span><span class="color-1">val</span> 
                                    <span class="info-block">
                                        <a class="link" href="#">publishers</a>
                                        <span class="holder">
                                            <strong class="sub-head">publishers</strong>
                                            <span class="list-item"><span class="left">0</span><span class="right">AdPublisher</span></span>
                                            <span class="list-item"><span class="left">1</span><span class="right">BidPublisher</span></span>
                                        </span>
                                    </span>
                                    <span class="color-1">=</span> fetchLivePublishers
                                </span><!-- / line -->
                               <span class="line"><span class="spaces spaces-05"></span><span class="color-1">val</span> 
                                    <span class="info-block">
                                        <a class="link" href="#">publisher</a>
                                        <span class="holder">
                                            <strong class="sub-head">publisher</strong>
                                            <span class="list-item"><span class="left">minPrice</span><span class="right">0.2</span></span>
                                            <span class="list-item"><span class="left">maxPrice</span><span class="right">0.7</span></span>
                                            <span class="list-item">...</span>
                                        </span>
                                    </span>
                                    <span class="color-1">=</span> Random.shuffle(<span class="info-block">
                                        <a class="link" href="#">publishers</a>
                                        <span class="holder">
                                            <strong class="sub-head">publishers</strong>
                                            <span class="list-item"><span class="left">0</span><span class="right">AdPublisher</span></span>
                                            <span class="list-item"><span class="left">1</span><span class="right">BidPublisher</span></span>
                                        </span>
                                    </span>).filter(pickPublisher _)
                                </span><!-- / line -->
                                <span class="line"><span class="spaces spaces-05"></span>publisher <span class="color-1">match</span> """),format.raw/*271.135*/("""{"""),format.raw/*271.136*/("""</span><!-- / line -->
                                <span class="line"><span class="spaces spaces-02"></span><span class="color-1">case</span> Publisher <span class="color-1">=&gt;</span>  """),format.raw/*272.170*/("""{"""),format.raw/*272.171*/("""</span><!-- / line -->
                                <span class="line"><span class="spaces spaces-03"></span>log!(INFO<span class="color-1">,</span> <span class="color-2">"publisher selected"</span>)</span><!-- / line -->
                                <span class="line"><span class="spaces spaces-03"></span>internalCreateCampaign publisher</span><!-- / line -->
                                <span class="line"><span class="spaces spaces-02"></span>"""),format.raw/*275.90*/("""}"""),format.raw/*275.91*/("""</span><!-- / line -->
                                <span class="line"><span class="spaces spaces-02"></span><span class="color-1">case</span> _ <span class="color-1">=&gt;</span> 
                                    log!(ERROR<span class="color-1">,</span> <span class="color-2">"no publisher found"</span>)
                                </span><!-- / line -->
                                <span class="line"><span class="spaces spaces-05"></span>"""),format.raw/*279.90*/("""}"""),format.raw/*279.91*/("""</span><!-- / line -->
                                <span class="line"><span class="spaces spaces-01"></span>"""),format.raw/*280.90*/("""}"""),format.raw/*280.91*/("""</span><!-- / line -->
							</div><!-- / code-block -->
						</div><!-- / info-holder -->
                                
						<div class="info-holder">
							<strong class="subtitle">CampaignRoute campaignRoute λ-1</strong>
							<div class="code-block">
                                <span class="line"><span class="spaces spaces-01"></span><span class="color-1">val</span> campaignRoute<span class="color-1"> = </span>  &#123;</span><!-- / line -->
                                <span class="line"><span class="spaces spaces-05"></span>(path(<span class="color-2">"campaign"</span>) & get) &#123;</span><!-- / line -->
                                <span class="line"><span class="spaces spaces-02"></span>parameters(<span class="color-2">"transactionId"</span>!)  &#123; 
                                    <span class="info-block info-block-05">
                                        <a class="link" href="#">transactionId</a>
                                        <span class="holder">TRAN-2015-X4k12s</span>
                                    </span>
                                    <span class="color-1">=&gt;</span>
                                </span><!-- / line -->
                                <span class="line"><span class="spaces spaces-03"></span><span class="color-1">val</span> contentType<span class="color-1"> = </span> headerValue("""),format.raw/*296.179*/("""{"""),format.raw/*296.180*/("""</span><!-- / line -->      
							</div><!-- / code-block -->
						</div><!-- / info-holder -->
					</div><!-- / wrap-01 -->
					<div class="wrap-02">
						<div class="inner">
							<div class="info-holder open">
								<!--strong class="subtitle">BidRequestTask.execute</strong-->
								<div class="code-block">
									<!--span class="line"><span class="color-1">public static void</span> execute() &#123;</span>
									<span class="line"><span class="spaces spaces-01"></span><span class="color-1">try</span> &#123;</span><!-- / line -->
									<span class="line highlight"><span class="spaces spaces-02"></span>InputStream
									<span class="info-block invert">
										<a class="link" href="#">is</a>
										<span class="holder">
											<strong class="sub-head">is</strong>
											<span class="list-item"><span class="left">length</span><span class="right">2048</span></span>
											<span class="list-item"><span class="left">buffer</span><span class="right">byte[]</span></span>
										</span>
									</span>
									<span class="color-1">=</span>connection
									<span class="color-1">.</span>getInputStream();</span><!-- / line -->
									<span class="line"><span class="spaces spaces-02"></span>parseResponse(
									<span class="info-block invert">
										<a class="link" href="#">is</a>
										<span class="holder">
											<strong class="sub-head">is</strong>
											<span class="list-item"><span class="left">length</span><span class="right">2048</span></span>
											<span class="list-item"><span class="left">buffer</span><span class="right">byte[]</span></span>
										</span>
									</span>
									);</span><!-- / line -->
									<span class="line"><span class="spaces spaces-01"></span>"""),format.raw/*328.67*/("""}"""),format.raw/*328.68*/(""" """),format.raw/*328.69*/("""<span class="color-1">catch</span> (Exception e) """),format.raw/*328.118*/("""{"""),format.raw/*328.119*/("""</span><!-- / line -->
									<span class="line"><span class="spaces spaces-02"></span>logger<span class="color-1">.</span>error(<span class="color-2">"Problem with bid request "</span> <span class="color-1">+</span> urlStr, e);</span><!-- / line -->
									<span class="line"><span class="spaces spaces-01"></span>"""),format.raw/*330.67*/("""}"""),format.raw/*330.68*/("""</span><!-- / line -->
									<span class="line">"""),format.raw/*331.29*/("""}"""),format.raw/*331.30*/("""</span><!-- / line -->
								</div><!-- / code-block -->
							</div><!-- / info-holder -->
							<div class="info-holder">
								<strong class="subtitle">TaskExecutor.execute</strong>
								<div class="code-block">
									<span class="line"><span class="color-1">public static void</span> execute(Task 
									<span class="info-block">
										<a class="link" href="#">task</a>
										<span class="holder">
											<strong class="sub-head">task</strong>
											<span class="list-item"><span class="left">taskId</span><span class="right">7412</span></span>
											<span class="list-item"><span class="left">queue</span><span class="right">"prod1"</span></span>
											<span class="list-item">...</span>
										</span>
									</span>
									) """),format.raw/*347.12*/("""{"""),format.raw/*347.13*/("""</span><!-- / line -->
									<span class="line"><span class="spaces spaces-01"></span><span class="color-1">if</span> (
									<span class="info-block alignleft">
										<a class="link" href="#">task</a>
										<span class="holder">
											<strong class="sub-head">task</strong>
											<span class="list-item"><span class="left">taskId</span><span class="right">7412</span></span>
											<span class="list-item"><span class="left">queue</span><span class="right">"prod1"</span></span>
											<span class="list-item">...</span>
										</span>
									</span>
									.shouldExecuteNow()) """),format.raw/*358.31*/("""{"""),format.raw/*358.32*/("""</span><!-- / line -->
									<span class="line highlight">
									<span class="spaces spaces-02"></span><span class="info-block alignleft">
										<a class="link" href="#">task</a>
										<span class="holder">
											<strong class="sub-head">task</strong>
											<span class="list-item"><span class="left">taskId</span><span class="right">7412</span></span>
											<span class="list-item"><span class="left">queue</span><span class="right">"prod1"</span></span>
											<span class="list-item">...</span>
										</span>
									</span>
									<span class="color-1">.</span>execute();</span><!-- / line -->
									<span class="line"><span class="spaces spaces-01"></span>"""),format.raw/*370.67*/("""}"""),format.raw/*370.68*/(""" """),format.raw/*370.69*/("""<span class="color-1">else</span> """),format.raw/*370.103*/("""{"""),format.raw/*370.104*/("""</span><!-- / line -->
									<span class="line"><span class="spaces spaces-02"></span>asyncExecutor.execute(task);</span><!-- / line -->
									<span class="line"><span class="spaces spaces-01"></span>"""),format.raw/*372.67*/("""}"""),format.raw/*372.68*/("""</span><!-- / line -->
									<span class="line">"""),format.raw/*373.29*/("""}"""),format.raw/*373.30*/("""</span><!-- / line -->
								</div><!-- / code-block -->
							</div><!-- / info-holder -->
							<div class="info-holder">
								<strong class="subtitle">QueueTasksFetcher.run</strong>
								<div class="code-block">
									<span class="line"><span class="color-1">public void</span> run() <span class="color-1">throws</span> InterruptedException """),format.raw/*379.133*/("""{"""),format.raw/*379.134*/("""</span><!-- / line -->
									<span class="line"><span class="spaces spaces-01"></span><span class="color-1">while</span> (<span class="color-1">!</span>
									<span class="info-block">
										<span class="info-block info-block-02">
											<a class="link" href="#">shouldStop</a>
											<span class="holder">false</span>
										</span>
									</span>
									) """),format.raw/*387.12*/("""{"""),format.raw/*387.13*/("""</span><!-- / line -->
									<span class="line"><span class="spaces spaces-02"></span>Message 
									<span class="info-block">
										<a class="link" href="#">message</a>
										<span class="holder big">
											<strong class="sub-head">message</strong>
											<span class="list-item"><span class="left">msgId</span><span class="right">"54947df8-0e9e"</span></span>
											<span class="list-item"><span class="left">taskId</span><span class="right">7412</span></span>
										</span>
									</span>
									<span class="color-1">=</span>
									<span class="info-block">
										<a class="link" href="#">queue</a>
										<span class="holder big">
											<strong class="sub-head">queue</strong>
											<span class="list-item"><span class="left">length</span><span class="right">140</span></span>
											<span class="list-item"><span class="left">top</span><span class="right">BidRequestTask</span></span>
										</span>
									</span>
									<span class="color-1">.</span>fetchNextMessage();</span><!-- / line -->
									<span class="line"><span class="spaces spaces-02"></span>Task
									<span class="info-block alignleft">
										<a class="link" href="#">task</a>
										<span class="holder">
											<strong class="sub-head">task</strong>
											<span class="list-item"><span class="left">taskId</span><span class="right">7412</span></span>
											<span class="list-item"><span class="left">queue</span><span class="right">"prod1"</span></span>
											<span class="list-item">...</span>
										</span>
									</span>
									<span class="color-1">=</span> TaskFactory<span class="color-1">.</span>messageToTask(
									<span class="info-block">
										<a class="link" href="#">message</a>
										<span class="holder big">
											<strong class="sub-head">message</strong>
											<span class="list-item"><span class="left">msgId</span><span class="right">"54947df8-0e9e"</span></span>
											<span class="list-item"><span class="left">taskId</span><span class="right">7412</span></span>
										</span>
									</span>
									);</span><!-- / line -->
									<span class="line highlight"><span class="spaces spaces-02"></span>TaskExecutor<span class="color-1">.</span>execute(
									<span class="info-block alignleft">
										<a class="link" href="#">task</a>
										<span class="holder">
											<strong class="sub-head">task</strong>
											<span class="list-item"><span class="left">taskId</span><span class="right">7412</span></span>
											<span class="list-item"><span class="left">queue</span><span class="right">"prod1"</span></span>
											<span class="list-item">...</span>
										</span>
									</span>
									);</span><!-- / line -->
									<span class="line"><span class="spaces spaces-01"></span>"""),format.raw/*438.67*/("""}"""),format.raw/*438.68*/("""</span><!-- / line -->
									<span class="line">"""),format.raw/*439.29*/("""}"""),format.raw/*439.30*/("""</span><!-- / line -->
									<span class="line"></span><!-- / line -->
									<span class="line"></span><!-- / line -->
									<span class="line"></span><!-- / line -->
									<div class="values">
										<a class="sub-head open-link" href="#">Recorded variables</a>
										<ul class="list">
											<li class="caret">
												<a href="#">
													<span class="left">this</span>
													<span class="right">QueueTasksFetcher</span>
												</a>
												<ul>
													<li>
														<a href="#">
															<span class="left">shouldStop</span>
															<span class="right">false</span>
														</a>
													</li>
												</ul>
											</li>
											<li>
												<a href="#">
													<span class="left">queue</span>
													<span class="right">MessageQueue</span>
												</a>
											</li>
											<li>
												<a href="#">
													<span class="left">message</span>
													<span class="right">Message</span>
												</a>
												<ul>
													<li>
														<a href="#">
															<span class="left">messageId</span>
															<span class="right">"jqkdi1Adccsj..."</span>
														</a>
													</li>
													<li class="caret">
														<a href="#">
															<span class="left">dataMD5</span>
															<span class="right">"a1d716b46a.."</span>
														</a>
													</li>
													<li>
														<a href="#">
															<span class="left">data</span>
															<span class="right">"XXa1flakc201.."</span>
														</a>
													</li>
												</ul>
											</li>
											<li>
												<a href="#">
													<span class="left">task</span>
													<span class="right">BidRequestTask</span>
												</a>
											</li>
										</ul>
									</div><!-- / values -->
								</div><!-- / code-block -->
							</div><!-- / info-holder -->
						</div>
					</div><!-- / wrap-02 -->
				</div><!-- / col-right -->
			</div><!-- / production-area -->
		</div>
	</section><!-- /production-info -->
    <section class="production-info">
        <div class="slimSiteCentered">
            <div class="headline">
                <h2 class="marked">focus on the errors that matter</h2>
                <p>Real-time analytics let you cut through the noise and get to the errors that you need to fix.</p>
            </div>
            <div class="focus-on">
                <ul class="tabs-nav">
                    <li><a href="#new-errors-tab">New errors</a></li>
                    <li><a href="#volume-rate-tab">Volume &amp; rate</a></li>
                    <li><a href="#filters-tab">Filters</a></li>
                    <li><a href="#share-tab">Share</a></li>
                    <li><a href="#jira-tab">Jira</a></li>
                </ul>
                <div class="tabarea">
                    <div class="tab" id="new-errors-tab">
                        <div class="badge"><img src="assets/images/bluesite/img-focus-on01.png" alt="image description" width="214" height="214"></div>
                        <img src="assets/images/bluesite/img-focus-on001.png" alt="image description" width="970" height="481" class="image">
                    </div>
                    <div class="tab" id="volume-rate-tab">
                        <div class="badge"><img src="assets/images/bluesite/img-focus-on02.png" alt="image description" width="214" height="214"></div>
                        <img src="assets/images/bluesite/img-focus-on002.png" alt="image description" width="970" height="481" class="image">
                    </div>
                    <div class="tab" id="filters-tab">
                        <img src="assets/images/bluesite/img-focus-on004.png" alt="image description" width="970" height="481" class="image">
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
                                <span class="notes">Filter errors by server, app, code entry point and location.</span>
                            </form>
                        </div><!-- / form-popup -->
                    </div>
                    <div class="tab" id="share-tab">
                        <img src="assets/images/bluesite/img-focus-on003.png" alt="image description" width="970" height="481">
                        <div class="info-popup info-popup-02">
                            <strong class="subtitle"><img src="assets/images/bluesite/ico15.png" alt="image" width="16" height="25" preventResize>Share with teammates</strong>
                            <p class="txt">This just started happening in prod1 after today's release.<br><a class="sampleTaleLink" href=""""),_display_(/*562.140*/globals/*562.147*/.SAMPLE_TALE),format.raw/*562.159*/("""" target="_blank">http//app.takipi.com/event=UzYyOTUjMUzlzE</a></p>
                            <div class="holder">
                                <span class="left">To:</span>
                                <ul class="tags">
                                    <li>Danny R (developer)<a class="close" href="#">close</a></li>
                                    <li>Connie H (developer)<a class="close" href="#">close</a></li>
                                    <li>Stan M (Eng manager)<a class="close" href="#">close</a></li>
                                </ul>
                            </div>
                            <span class="notes">Share errors between DevOps, engineers and QA with one click.</span>
                        </div><!-- / info-popup -->
                    </div>
                    <div class="tab" id="jira-tab">
                        <img src="assets/images/bluesite/img-focus-on005.png" alt="image description" width="970" height="481">
                        <div class="info-popup">
                            <strong class="subtitle"><img src="assets/images/bluesite/ico14.png" alt="image" width="21" height="27" preventResize>Create JIRA issue</strong>
                            <p>NullPointerException at CampaignBuilder.selectPublisher</p>
                            <p class="txt">Click here to see code and variable state -<br><a class="sampleTaleLink" href=""""),_display_(/*579.124*/globals/*579.131*/.SAMPLE_TALE),format.raw/*579.143*/("""" target="_blank">http//app.takipi.com/event=UzYyOTUjMUzlzE</a></p>
                            <span class="notes">Open a JIRA issue for an error with the code and variable state that caused it.</span>
                        </div><!-- / info-popup -->
                    </div>
                </div>
            </div><!-- focus-on -->
        </div>
    </section><!-- /production-info -->
	<section class="built-for-info">
		<div class="slimSiteCentered">
			<div class="headline">
				<h2 class="marked">Built for high scale Akka<br/>and Scala applications.</h2>
				<p>See the accurate variable state that led to an error <a class="marked" href=""""),_display_(/*591.86*/routes/*591.92*/.BlueSite.howitworks),format.raw/*591.112*/("""">even at high scale</a>.<br/>Beautiful support for Scala code and call stacks.<br/>No need to upload log files or add API calls into your code.</p>
			</div>
		</div>
	</section><!-- /built-for-info -->
    <section class="installation">
        <div class="container">
            <header class="headline">
                <h2>Installs in minutes</h2>
                <p>Install a simple java agent. No code changes, annotations, or build configurations needed.</p>
            </header><!-- headline -->
            <div class="tabs-install">
                <ul class="nav-tabs">
                    <li><a href="#tab01">Linux</a></li>
                    <li><a href="#tab02">OS X</a></li>
                    <li><a href="#tab03">Windows</a></li>
                    <li><a href="#tab04">Chef / Puppet</a></li>
                </ul><!-- nav-tabs -->
                <div class="content-tabs">
                    <div id="tab01">
                        <div id="tabs-1" class="sub-tabs">
                            <ul class="nav">
                                <li><a href="#tab-1">Wget</a></li>
                                <li><a href="#tab-2">cURL</a></li>
                                <li><a href="#tab-3">DEB</a></li>
                                <li><a href="#tab-4">RPM</a></li>
                            </ul>
                            <div id="tab-1">
                                <code>wget -O - -o /dev/null http://get.takipi.com | sudo bash /dev/stdin -i --sk=&#60;installation key&#62;</code>
                            </div>
                            <div id="tab-2">
                                <code>curl -s /dev/null http://get.takipi.com | sudo bash /dev/stdin -i --sk=&#60;installation key&#62;</code>
                            </div>
                            <div id="tab-3">
                                <code>sudo dpkg -i &#60;path-to-deb&#62;</code>
                                <code>sudo /opt/takipi/etc/takipi-setup-package &#60;installation key&#62;</code>
                            </div>
                            <div id="tab-4">
                                <code>sudo rpm -i &#60;path-to-rpm&#62;</code>
                                <code>sudo /opt/takipi/etc/takipi-setup-package &#60;installation key&#62;</code>
                            </div>
                        </div>
                        <div class="btn-area btn-start">
                            <a href="#start-area" class="btn">Start</a>
                        </div>
                    </div><!-- tab01 -->
                    <div id="tab02">
                        <div class="download btn-start">
                            <a href="#start-area" class="btn">Download</a>
                            <p>the takipi.dmg installer for OS X.</p>
                        </div>
                    </div><!-- tab02 -->
                    <div id="tab03">
                        <div class="download btn-start">
                            <a href="#start-area" class="btn">Download</a>
                            <p>the takipi.msi installer for Windows.</p>
                        </div>
                    </div><!-- tab03 -->
                    <div id="tab04">
                        <div id="tabs-2" class="sub-tabs">
                            <ul class="nav">
                                <li><a href="#tab-5">Chef</a></li>
                                <li><a href="#tab-6">Puppet</a></li>
                            </ul>
                            <div id="tab-5">
                                <p>Our Chef cookbook:</p>
                                <code>git clone <a href="https://github.com/takipi-cookbooks/takipi" target="_blank">https://github.com/takipi-cookbooks/takipi</a></code>
                            </div>
                            <div id="tab-6">
                                <p>Our Puppet module:</p>
                                <code>git clone <a href="https://github.com/takipi/takipi-puppet" target="_blank">https://github.com/takipi/takipi-puppet</a></code>
                            </div>
                        </div>
                        <div class="btn-area">
                            <a href="#start-area" class="btn btn-start">Start</a>
                        </div>
                    </div><!-- tab04 -->
                </div><!-- content-tabs -->
            </div><!-- tabs-install -->
        </div><!-- container -->
    </section><!-- installation -->
	<section class="start-area bottom-form" id="start-area">
		<div class="start-form takipiMiniSignupForm" createdin="footer">
			<form action="#">
				<div class="row">
					<input class="text emailInput" type="email" placeholder="Email address">
					<input class="btn-submit createStubAccountBtn" type="submit" value="Start using Takipi &#62;&#62;" >
				</div>
				<div class="errorLabel">User already exists <a class="loginLink" href=""""),_display_(/*678.77*/globals/*678.84*/.LOGIN_PAGE),format.raw/*678.95*/("""">Log in</a></div>
				<p>Java / Scala developers</p>
			</form>
		</div><!-- end start-form -->
	</section><!-- end start-area -->
    """),_display_(/*683.6*/bluesite/*683.14*/.pages.scheduler_popup()),format.raw/*683.38*/("""
"""),format.raw/*684.1*/("""</div>
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Apr 15 17:20:36 IDT 2015
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/bluesite/pages/scala.scala.html
                  HASH: 51672e04b63032be55a220bdd9526df43e8089eb
                  MATRIX: 595->0|1691->1068|1708->1075|1741->1086|6846->6162|6876->6163|6938->6196|13143->12371|13174->12372|15952->15120|15983->15121|16205->15313|16236->15314|16723->15772|16753->15773|17238->16229|17268->16230|17409->16342|17439->16343|18850->17724|18881->17725|20688->19503|20718->19504|20748->19505|20827->19554|20858->19555|21206->19874|21236->19875|21316->19926|21346->19927|22156->20708|22186->20709|22834->21328|22864->21329|23597->22033|23627->22034|23657->22035|23721->22069|23752->22070|23987->22276|24017->22277|24097->22328|24127->22329|24514->22686|24545->22687|24957->23070|24987->23071|27871->25926|27901->25927|27981->25978|28011->25979|33927->31866|33945->31873|33980->31885|35425->33301|35443->33308|35478->33320|36162->33976|36178->33982|36221->34002|41191->38944|41208->38951|41241->38962|41405->39099|41423->39107|41469->39131|41498->39132
                  LINES: 22->1|39->18|39->18|39->18|132->111|132->111|133->112|261->240|261->240|292->271|292->271|293->272|293->272|296->275|296->275|300->279|300->279|301->280|301->280|317->296|317->296|349->328|349->328|349->328|349->328|349->328|351->330|351->330|352->331|352->331|368->347|368->347|379->358|379->358|391->370|391->370|391->370|391->370|391->370|393->372|393->372|394->373|394->373|400->379|400->379|408->387|408->387|459->438|459->438|460->439|460->439|583->562|583->562|583->562|600->579|600->579|600->579|612->591|612->591|612->591|699->678|699->678|699->678|704->683|704->683|704->683|705->684
                  -- GENERATED --
              */
          