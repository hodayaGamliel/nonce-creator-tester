
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
object howitworks extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<div id="howItWorksMain" class="about">
	<div class="top container">
		<div class="holder">
			<h2>What is Takipi?</h2>
			<p>Takipi uses a Java agent connected to a secure cloud to detect and analyze errors in your code.<br>Takipi's installation consists of two components: a daemon process and a Java agent library. Together they detect events (such as exceptions or logged errors) happening within your app. Takipi's agent library is loaded as part of the JVM's start-up process and is used to detect low-level signals from the JVM. Takipi's agent doesn't interrupt other Java agents (for example, New Relic, AppDynamics, etc).</p>
		</div><!-- / holder -->
	</div><!-- / top -->
	<div class="tab-holder">
		<div class="container">
			<div class="info-tabs">
				<div class="nav-holder">
					<ul class="nav-tabs">
						<li><a href="#tab-01"><span>Installation</span></a></li>
						<li><a href="#tab-02"><span>At Run Time</span></a></li>
						<li><a href="#tab-03"><span>Accessing Data</span></a></li>
					</ul><!-- / nav-tabs -->
				</div><!-- / nav-holder -->
				<div class="tabarea">
					<div id="tab-01" class="tab">
						<div class="text">
							<h2>Installation and Initial Analysis</h2>
							<p>Takipi's installation includes a daemon (service) and a Java native agent.<br>Once installation is complete, Takipi will start analyzing your code for the first time.<br>This one-time process only happens during the first setup and can take up to 20 minutes. Takipi won't repeat this process when you deploy new versions.</p>
						</div><!-- / text -->
						<div class="holder">
							<img class="img img-01" src="assets/images/howitworks/img-howitworks-01.png" alt="image">
							<ul class="descr-list">
								<li class="descr descr-01">
									<strong class="subtitle">Java agent</strong>
								</li>
								<li class="descr descr-02">
									<strong class="subtitle">Daemon process</strong>
									<p>Controls the agents and manages the connection to Takipi's cloud.</p>
								</li>
								<li class="descr descr-03">
									<strong class="subtitle">Code anonymization</strong>
									<p>During the initial analysis, the code is anonymized to create the abstract data flow graph. Only the code structure is sent to the cloud.</p>
								</li>
								<li class="descr descr-04">
									<strong class="subtitle">Takipi's cloud</strong>
								</li>
							</ul><!-- / descr-list -->
						</div><!-- / holder -->
					</div><!-- / tab-01 -->
					<div id="tab-02" class="tab">
						<div class="text">
							<h2>At Run Time</h2>
							<p>When exceptions happen:</p>
						</div><!-- / text -->
						<div class="holder">
							<img class="img img-02" src="assets/images/howitworks/img-howitworks-02.png" alt="image">
							<ul class="descr-list">
								<li class="descr descr-05">
									<strong class="subtitle">Java agent</strong>
									<p>Detects errors in real-time.</p>
								</li>
								<li class="descr descr-06">
									<strong class="subtitle">Daemon process</strong>
									<p>Encrypts error data before sending it to Takipi's cloud.</p>
								</li>
								<li class="descr descr-07">
									<strong class="subtitle">Takipi's cloud</strong>
									<p>Uses graph analysis algorithms on the abstract data flow graphs to decide which code and data caused the error.</p>
								</li>
							</ul><!-- / descr-list -->
						</div><!-- / holder -->
					</div><!-- / tab-02 -->
					<div id="tab-03" class="tab">
						<div class="text">
							<h2>Accessing Data in Your Browser</h2>
							<p>When you log in to Takipi to view error analysis:</p>
						</div><!-- / text -->
						<div class="holder">
							<img class="img img-03" src="assets/images/howitworks/img-howitworks-03.png" alt="image">
							<ul class="descr-list">
								<li class="descr descr-08">
									<strong class="subtitle">Daemon process</strong>
									<p>Only the relevant source code is sent to Takipi's cloud encrypted using the 256-bit AES key you received during the installation.</p>
								</li>
								<li class="descr descr-09">
									<strong class="subtitle">Takipi's cloud</strong>
									<p>Source code and data are stored encrypted. No one but the user can access or view them - not even Takipi administrators.</p>
								</li>
								<li class="descr descr-10">
									<strong class="subtitle">Your browser</strong>
									<p>Data from Takipi's cloud is decrypted in your browser using your unique 256-bit AES key. You can restrict access based on IP address or email.</p>
								</li>
							</ul><!-- / descr-list -->
						</div><!-- / holder -->
					</div><!-- / tab-03 -->
				</div><!-- / tabarea -->
			</div><!-- / info-tabs -->
		</div><!-- / container -->
	</div><!-- / tab-holder -->
	<div class="text-area container">
		<div class="holder">
			<h2>How do we keep your data secure?</h2>
			<p>Takipi encrypts source code and variable data using a strong 256-bit AES key privately generated for you during the installation. Code and variable data collected on your machines is uploaded to Takipi's cloud only in its encrypted, private form. This ensures that it can only be viewed by you and your team using your private encryption key, and that it cannot be accessed by anyone else (including Takipi administrators).<br>To offload work from the local server in order to efficiently analyze errors, Takipi converts bytecode loaded by the application into an abstract data flow graph which is analyzed in the cloud. The graph structure does not contain symbols, values or operators. This conversion process which runs on your machine includes removing all jar, package, class, field, method, and variable names, as well as all logical and numeric operators, number and string constants, and code attributes. The resulting code graph cannot be executed or reverse-engineered.</p>
			<a class="more" href=""""),_display_(/*98.27*/globals/*98.34*/.TAKIPI_SUPPORT_SITE),format.raw/*98.54*/("""/security/" target="_blank">Learn more</a>
			<h2>How do we maintain a low overhead?</h2>
			<ul class="list">
				<li>CPU: Under 3%</li>
				<li>RAM: Under 5%</li>
				<li>Network: Up to a 100KB/Minute</li>
				<li>No reliance on Takipi's availability</li>
				<li>No effect on Garbage Collection</li>
				<li>Disk Space: A few MB per JVM</li>
			</ul>
			<p><strong>CPU Overhead:</strong> Takipi's agents were designed with strict CPU consumption limitations in mind. Every action is monitored and measured to guarantee minimal effect on the server's load. This is done by focusing on the important data and utilizing CPU throttling. Takipi maintains a 3% limit even if you run multiple JVMs on the same server. In addition, all the heavy-lifting and the complex algorithms are performed in Takipi's cloud, leaving the agents to merely follow simple instructions.</p>
			<p><strong>RAM overhead:</strong> The Takipi installed components use a small pre-allocated block of memory during their continuous operation. This design ensures that the memory consumption of these two components will not increase uncontrollably, and remain virtually unnoticed.</p>
			<p><strong>Network overhead:</strong> Takipi turns the bytecode loaded into your server into an abstract graph structure and then uploads it to the cloud for further analysis. The majority of this activity takes place immediately after the installation is completed. After this initial step, the ongoing graph upload is differential and includes only new or changed code that Takipi has not yet seen. Inbound communication to the daemon process is negligible and is limited to directives for the agents and sparse requests for encrypted source code segments.</p>
			<a class="more" href=""""),_display_(/*111.27*/globals/*111.34*/.TAKIPI_SUPPORT_SITE),format.raw/*111.54*/("""/performance-overhead/" target="_blank">Learn more</a>
		</div>
	</div><!-- / text-area -->
</div><!-- / about -->
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Apr 15 17:20:38 IDT 2015
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/pages/howitworks.scala.html
                  HASH: 1f9c20aa2955f7008f4fd67e7427da8f6367e8db
                  MATRIX: 591->0|6519->5901|6535->5908|6576->5928|8354->7678|8371->7685|8413->7705
                  LINES: 22->1|119->98|119->98|119->98|132->111|132->111|132->111
                  -- GENERATED --
              */
          