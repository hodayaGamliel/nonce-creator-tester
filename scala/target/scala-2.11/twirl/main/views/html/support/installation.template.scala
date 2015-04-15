
package views.html.support

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
object installation extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<ul category="installation" class="qna">
	<li>
		<div class="title">Installation</div>
		<div class="line">Installing Takipi is simple. Here are the 3 steps you need to follow:</div>
		<ul class="internal decimal">
			<li>
				<div class="line"><a href="https://app.takipi.com/account.html" class="link" target="_blank"><b>Create your account.</b></a></div>
			</li>
			<li>
				<div class="line"><b>Install Takipi</b> using one of the available installers:</div>
				<ul class="internal square">
					<li><a href="javascript: void(0)" class="installer link main" installer="linux">Linux:</a> <a href="javascript: void(0)" class="installer link" installer="linux" type="wget">Wget</a> / <a href="javascript: void(0)" class="installer link" installer="linux" type="curl">cURL</a> <a href="javascript: void(0)" class="installer" installer="linux" type="movie"></a></li>
					<li><a href="javascript: void(0)" class="installer link main" installer="windows">Windows</a> <a href="javascript: void(0)" class="installer" installer="windows" type="movie"></a></li>
					<li><a href="javascript: void(0)" class="installer link main" installer="osx">Mac OS X</a> <a href="javascript: void(0)" class="installer" installer="osx" type="movie"></a></li>
					<li><a href="javascript: void(0)" class="installer link main" installer="advanced">Advanced:</a> <a href="javascript: void(0)" class="installer link" installer="advanced" sub="apt-get">apt-get</a> / <a href="javascript: void(0)" class="installer link" installer="advanced" type="yum">yum</a> / <a href="javascript: void(0)" class="installer link" installer="advanced" type="chef">Chef</a></li>
				</ul>
				<div class="line"><b>Note</b>: root / admin permissions are required to install Takipi on a target machine.</div>
			</li>
			<li>
				<div class="line"><a href="javascript: void(0)" class="link connecting"><b>Connect Takipi</b> to your JVMs</a></div>
			</li>
			<li>
				<div class="line"><b>Test the installation</b> - head back to <a href="https://app.takipi.com" class="link" target="_blank">app.takipi.com</a> and <b>click "Test now"</b>.</div>
				<div class="testConnection"></div>
				<div class="line">If the connecting process was successful you should get a "monitoring" message next to your JVM.</div>
				<div class="line">Click "next" and you're done.</div>
			</li>
			<li>
				<div class="line"><b>Throw an exception</b>.</div>
			</li>
			<li>
				<div class="line">The exception will appear in your Takipi dashboard. <a href="//www.youtube.com/watch?v="""),_display_(/*32.111*/globals/*32.118*/.DEMO_VIDEO),format.raw/*32.129*/("""" class="link" target="_blank">Click here to learn more</a>.</div>
			</li>
		</ul>
	</li>
</ul>
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Apr 15 17:20:38 IDT 2015
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/support/installation.scala.html
                  HASH: 9c1407732d2f878ad11f306b24e6b7b8cf44b96d
                  MATRIX: 595->0|3149->2526|3166->2533|3199->2544
                  LINES: 22->1|53->32|53->32|53->32
                  -- GENERATED --
              */
          