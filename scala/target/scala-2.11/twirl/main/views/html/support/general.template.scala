
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
object general extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<ul category="general" class="qna selected">
	<li>
		<div class="title">How Takipi works</div>
		<div class="line">
			Takipi installs a daemon process and a JVM <a href="http://www.takipiblog.com/2014/01/07/double-agent-java-vs-native-agents/" class="link" target="_blank">agent library</a> on your servers. These two components work in tandem to log and send data to Takipi's analysis servers. Together they detect events (such as exceptions or logged errors) happening within your app and automatically create the code needed to log and collect the data you'll need to debug these errors in production.
		</div>
	</li>
	<li>
		<div class="title">Compatibility</div>
		<div class="subTitle">Supported Operating systems</div>
		<div class="line">- All major Linux distributions.</div>
		<div class="line">- Windows 7, 8 and Windows Server.</div>
		<div class="line">- Mac OS X.</div>
	</li>
	<li>
		<div class="subTitle">Supported JVMs and languages</div>
		<div class="line">Takipi supports all JVM based languages including Java, Scala, Clojure, Groovy, JRuby, Jython, ...</div>
		<div class="line">Takipi requires a 64bit Oracle / OpenJDK JRE version 6, 7 or 8 (32bit JVMs are not supported).</div>
	</li>
</ul>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Apr 15 17:20:38 IDT 2015
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/support/general.scala.html
                  HASH: 1e588efcec2318c670a916c55e7406f231ab9e07
                  MATRIX: 590->0
                  LINES: 22->1
                  -- GENERATED --
              */
          