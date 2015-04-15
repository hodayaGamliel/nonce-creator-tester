
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
object ui extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<div category="interface" class="qna selected">
	<ul>
		<li>
			<div class="q">Which exceptions do you track?</div>
			<div class="a">
				Takipi tracks all exceptions thrown anywhere in your app and by any thread that passes through your code. This includes both checked and unchecked,  caught and uncaught exceptions. You can configure which packages to debug using the 'Servers' dialog.
				There are probably some exceptions you'd want to ignore.
				We don't track StackOverflow and OutOfMemory errors yet.
			</div>
		</li>
		<li>
			<div class="q">How does Takipi group exceptions in my code?</div>
			<div class="a">
				Takipi groups exceptions based on locations within your code who threw an exception (either explicitly or not) or made a call into a Java or external library who in turn threw an exception. This means that if you have different locations in your code making calls into a Java or external API (usually in different app contexts) which can throw exceptions, they will be grouped into different events.
			</div>
		</li>
		<li>
			<div class="q">What kinds of notifications do you send?</div>
			<div class="a">
				When a new RuntimeException (such as NullPointerException or ClassCastException) or a breakpoint are hit for the first time, we will send you an email with the event summary - code location, previous methods and values of the variables triggering the event. We also send a daily digest email which reports how many events happened across your servers today, highlighting events that are new.
			</div>
		</li>
		<li>
			<div class="q">How do I set a breakpoint?</div>
			<div class="a">
				Simply click the gutter to the left of the source code line where you'd like to place it, just like you would in Eclipse or IntelliJ. If you want to place it in a different class click the "New Breakpoint" button in the Events panel. You can specify a condition for the breakpoint (e.g. "(state != null) || (list.size() &gt; 100))" in the Condition box. You can also specify the name of an object field you'd like Takipi to provide you with a history of its values when the breakpoint is hit by specifying the variable and field name (e.g. "this.active" or "ad.originURL").
			</div>
		</li>
		<li>
			<div class="q">How do I remove a breakpoint?</div>
			<div class="a">
				You can either unfollow like you would any event or click on it in the source gutter and click "Remove".
			</div>
		</li>
		<li>
			<div class="q">How can I tell if the same exception was recorded before and when?</div>
			<div class="a">
				Takipi measures the number of times an exception is thrown and periodically takes a "deep" sample of that event including live and historical variable values. When you open an event by clicking on it in the Events panel you can use the "Previous hits" selector to browse between the samples collected for it across multiple machines within that installation.
			</div>
		</li>
		<li>
			<div class="q">Which calls do track for performance?</div>
			<div class="a">
				Takipi benchmarks all outgoing calls from your JVM to external DBs, OS and native library calls. This is regarldess of which framework or languuage you use. Takipi also benchmarks synchronized blocks and methods. If Takipi detects a noticeable slowdown in the call's performance, it will collect and display the variable data leading to that call.
			</div>
		</li>
	</ul>
</div>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Apr 15 17:20:39 IDT 2015
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/support/ui.scala.html
                  HASH: 8f42d12e8a410cf9ce2ada9e63904b7dd6ab3840
                  MATRIX: 585->0
                  LINES: 22->1
                  -- GENERATED --
              */
          