
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
object newrelic extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<div class="backgroundFiller"></div>
<div id="newRelicMain" class="subPageMain siteCentered">
	<div class="heading">
		<h1>Takipi for New Relic</h1>
		<div class="headerMiniSignup"></div>
	</div>
	<div class="content styled">
		<div class="padded">
			<div class="contentSection">
				<div class="newRelicImg"></div>
				<span class="newRelicHeader">Analyze and debug exceptions - directly from New Relic</span>
			</div>
			<div class="contentSection main">
				<span class="text">See all exceptions (caught or uncaught) and logged errors in your code right from your New Relic dashboard.</span>
				<span class="text hover1">Use each exception's link to jump directly into the source code and actual variable state which caused it.</span>
				<span class="text hover2">See stats for logged errors, caught and uncaught exceptions that happen in your code.</span>
				<div class="img"></div>
			</div>
			<div class="contentSection secondary">
				<span class="text">View any new exceptions or logged errors in your code. Jump from each one straight to debug mode.</span>
				<div class="img"></div>
			</div>
			<div class="contentSection installation">
				<h3>Installation</h3>
				<p><span class="text">To start using Takipi with New Relic, simply <a class="blue underlinelink" href=""""),_display_(/*25.109*/globals/*25.116*/.TAKIPI_CREATE_ACCOUNT),format.raw/*25.138*/("""" target="_blank">install Takipi</a> on a server which reports to New Relic. Exception and error data will be added automatically.</span></p>
				<p><span class="text">You can turn reporting off directly from Takipi's Settings screen.</span></p>
				<p><span class="text">For more information check out our page on New Relic - <a class="blue underlinelink" href="http://www.newrelic.com/">here</a>.</span></p>
			</div>
		</div>
		<div class="contentSection learnmore">
			<div class="padded">
				<p><span class="header" id="learnMoreHeaderSpan">Want to learn more?</span></p>
				<div class="input-div">
					<input id="newRelicSubscriber" class="email" type="text" placeholder="Email" />
					<a href="javascript: void(0)" class="submit" id="notifyNewRelicSubscribe"></a>
				</div>
			</div>
		</div>
	</div>
</div>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Apr 15 17:20:38 IDT 2015
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/pages/newrelic.scala.html
                  HASH: 2c09dbe993b3a419647a0662d0bc6d56a9f808de
                  MATRIX: 589->0|1906->1289|1923->1296|1967->1318
                  LINES: 22->1|46->25|46->25|46->25
                  -- GENERATED --
              */
          