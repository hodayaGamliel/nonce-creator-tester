
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
object running extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<div category="running" class="qna selected">
	<ul>
		<li>
			<div class="q">How do I know if Takipi is running?</div>
			<div class="a">
				You can see the number of servers and processes connected to Takipi on the top bar at app.takipi.com. A grey indication means that no machines are connected to Takipi. A yellow indication means that machines running Takipi's daemon are connected to Takipi, but no running application processes are connected. A green indication means running application processes are connected to Takipi.
			</div>
		</li>
		<li>
			<div class="q">What happens when I deploy new versions of my code?</div>
			<div class="a">
				We automatically detect deployments - no need to update or configure Takipi. Takipi fully supports continuous integration - when new code is loaded into your app Takipi automatically analyzes it.
			</div>
		</li>
		<li>
			<div class="q">Can I use Takipi with multiple processes running on the same server?</div>
			<div class="a">
				Absolutely! Takipi knows how to balance multiple processes and to make sure that together they do not exceed  the CPU/RAM performance overhead you set for that installation.
			</div>
		</li>
		<li>
			<div class="q multiProcess">I'm running multiple processes on the same machine. How can I tell which one threw an exception?</div>
			<div class="a">
				For each recorded sample shown in the previous hits selector we display the origin process's PID. If you want to assign a more logical name to that process you can pass an argument to your process within your process startup script in the following manner:
				class="indent">-Dtakipi.name=myApp
				The selected name ("myApp") will now appear in the previous hits selector whenever an exception or breakpoint are hit within that process.
			</div>
		</li>
		<li>
			<div class="q">Can I switch Takipi on/off?</div>
			<div class="a">
				Yes. Simply run the takipi-start / takipi-stop script to shutdown or restart Takipi on your server at any time.
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
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/support/running.scala.html
                  HASH: 25ad5997a7f058733329fea58cf24589fd7c4677
                  MATRIX: 590->0
                  LINES: 22->1
                  -- GENERATED --
              */
          