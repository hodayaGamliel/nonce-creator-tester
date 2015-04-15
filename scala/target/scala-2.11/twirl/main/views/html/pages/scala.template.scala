
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
object scala extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<div id="scalaMainWrapper">
	<div id="scalaMain" class="mainPageMain siteCentered">
		<div class="heading">
			<h1>Takipi for Scala</h1>
			<h2>Writing in Scala is great. Takipi makes debugging it in production just as fun.</h2>
			<div class="createAccountZone">
				<a id="mainCreateAccountBtn" class="createAccount" href=""""),_display_(/*7.63*/globals/*7.70*/.TAKIPI_CREATE_ACCOUNT),format.raw/*7.92*/(""""></a>
				<div class="noCredit">Free trial, no credit card required</div>
			</div>
			<div class="scalaMonster"></div>
			<div class="scalaInfographic"></div>
		</div>
	</div>
</div>
<div id="scalaContent" class="mainPageContent">
	<div class="contentSection section1">
		<div class="sectionContent siteCentered">
			<div class="header">
				<h1>1</h1>
				<h4>Deployed new code? Takipi tells when it creates exceptions, errors or slowdowns.</h4>
			</div>
			<div class="timeline img"></div>
		</div>
	</div>
	<div class="contentSection section2">
		<div class="sectionContent siteCentered">
			<div class="header">
				<h1>2</h1>
				<h4>Know what broke. See which errors are new, involve updated code or increased in rate.</h4>
			</div>
			<div class="bg img"></div>
			<div class="exceptions img"></div>
		</div>
	</div>
	<div class="contentSection section3">
		<div class="sectionContent siteCentered">
			<div class="header">
				<h1>3</h1>
				<h4>Understand why. Get the exact code and variable state for each error as if you were there.</h4>
			</div>
			<div id="bubblesHolder">
				<div class="mainImg"></div>
				<div class="bubble codeTreeBubble">
					<div class="bubbleContent">
						<span class="baseText">All the functions and &#955;s leading to the error (live and completed)</span>
						<a class="expandBubble" href="javascript: void(0)"></a>
						<span class="animationPart infoText">Takipi shows you the function calls in which values causing the exception were set.</span>
						<span class="animationPart metro"></span>
						<span class="animationPart method method1"></span>
						<span class="animationPart method method2"></span>
						<span class="animationPart method method3"></span>
						<span class="animationPart method method4"></span>
						<span class="animationPart method method5"></span>
						<span class="animationPart method method6"></span>
						<span class="animationPart method method7"></span>
						<span class="animationPart arrow1"></span>
						<span class="animationPart arrow2"></span>
					</div>
				</div>
				<div class="bubble varBubble">
					<div class="bubbleContent">
						<span class="baseText">Variable values</span>
						<a class="expandBubble" href="javascript: void(0)"></a>
						<span class="animationPart infoText">Takipi collects the relevant values of variables and objects at moment of event, so you don't have to stare at log stack traces and guess which values were there.</span>
						<span class="animationPart highlight"></span>
						<span class="animationPart arrows"></span>
						<span class="animationPart codeText"></span>
					</div>
				</div>
				<div class="bubble threadBubble">
					<div class="bubbleContent">
						<span class="baseText">Multithreading info</span>
						<a class="expandBubble" href="javascript: void(0)"></a>
						<span class="animationPart infoText">Takipi tells you where values causing an exception were set - even if an object was modified across multiple threads.</span>
						<span class="animationPart threadsHeader"></span>
						<span class="animationPart thread1">
							<span class="animationPart threadContent">
								<span class="animationPart threadStart"></span>
								<span class="animationPart threadImg"></span>
							</span>
						</span>
						<span class="animationPart thread2">
							<span class="animationPart threadContent">
								<span class="animationPart threadStart"></span>
								<span class="animationPart threadImg"></span>
							</span>
						</span>
						<span class="animationPart thread3">
							<span class="animationPart threadContent">
								<span class="animationPart threadStart"></span>
								<span class="animationPart threadImg"></span>
							</span>
						</span>
					</div>
				</div>
				<div class="bubble historyBubble">
					<div class="bubbleContent">
						<span class="baseText">Variable history</span>
						<a class="expandBubble" href="javascript: void(0)"></a>
						<span class="animationPart infoText">Takipi's historical debugger automatically logs the values of variables causing an exception for you, so you can easily see how they got their values.</span>
						<span class="animationPart metro"></span>
						<span class="animationPart value value1"></span>
						<span class="animationPart value value2"></span>
						<span class="animationPart value value3"></span>
						<span class="animationPart arrow"></span>
					</div>
				</div>
			</div>
		</div>
	</div>	"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Apr 15 17:20:38 IDT 2015
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/pages/scala.scala.html
                  HASH: 1f3fbec2536075ebd6fc17363b527e843766e04a
                  MATRIX: 586->0|938->326|953->333|995->355
                  LINES: 22->1|28->7|28->7|28->7
                  -- GENERATED --
              */
          