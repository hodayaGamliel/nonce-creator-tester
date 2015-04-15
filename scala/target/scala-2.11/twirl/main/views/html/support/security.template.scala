
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
object security extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<div category="security" class="qna selected">
	<ul>
		<li>
			<div class="q">How are you able to display my code within Takipi?</div>
			<div class="a">
				Takipi gathers source code in one of two ways: (a) if you deployed your .jar files with source code attached, it will gather that. This is recommended if you're using a language such as Scala or Clojure and want to see your code in its original form. (b) If no source code is attached, Takipi will decompile the bytecode into a Java representation.
			</div>
		</li>
		<li>
			<div class="q">How are my code and data protected?</div>
			<div class="a">
				Source code and exception data are encrypted using your secret 256 bit AES key before they are sent to Takipi, and can only be decrypted within your web browser using your secret key. <a class="blue underlinelink" href=""""),_display_(/*12.226*/routes/*12.232*/.BlueSite.security),format.raw/*12.250*/("""">Click here</a> to learn more about Takipi's security model.
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
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/support/security.scala.html
                  HASH: 373428cadca44c8d6d960625754371153dea3f5c
                  MATRIX: 591->0|1455->836|1471->842|1511->860
                  LINES: 22->1|33->12|33->12|33->12
                  -- GENERATED --
              */
          