
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
object schedule_demo extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<div id="blueSiteIndexMain">
    <section class="form-header">
        <div class="slimSiteCentered">
            <h1>Cut your debugging time<br/>by up to 80%</h1>
        </div>
    </section>
   
   
    <section class="schedule-form">
        <div class="slimSiteCentered">
            <form action="https://app.takipi.com/app/requestdemo" method="post">
               <input type="hidden" name="source" value="schedule-demo-popup" />
               <input type="hidden" name="user_timezone" />
                <p class="description">
                    <strong>Find out how.</strong><br/>
                    Schedule a call with one of our
                    performance engineers. 
                </p>
                <label>Email Address
                    <input type="email" name="email" value="" required/>
                </label>
                <label>Name
                    <input type="text" name="name" value="" required/>
                </label>
                <label>Company
                    <input type="text" name="company" value="" />
                </label>
                <label>Phone Number
                    <input type="text" name="phone" value="" />
                </label>
                <button type="submit">Submit &gt;&gt;</button>
                <div class="thanks">
                    <strong>Thanks,</strong><br/>
                    we will be in touch soon...
                </div>
            </form>
        </div>
    </section> 
    
    <section class="statistics">
        <div class="slimSiteCentered">
           <p>On average, dev teams who use Takipi see:</p>
            <ul>
                <li><strong>90%</strong> fewer critical bugs in production</li>
                <li><strong>95%</strong> reduction in the detect - fix - deploy cycle for production errors</li>
                <li><strong>70%</strong> reduction in the amount of log files needed</li>
            </ul>
        </div>
    </section>
    
    <section class="quotes no-background">
        <div class="slimSiteCentered">
            <blockquote>
			    <p>“I can see all my exceptions in a clear, visual way.<br/>
                   This helped me find issues with 3rd party code I previously didn't see.<br/>
			       On top of that, installation was smooth and easy!”</p>
			    <footer>
			        <cite>hp</cite>
			    </footer>
			</blockquote>
            <blockquote>
			    <p>“Takipi is one of the great new Java miracle<br />
                   technologies to appear on the scene”</p>
			    <footer>
			        <cite>InfoQ</cite>
			    </footer>
			</blockquote>
        </div>
    </section>
</div>
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Apr 15 17:20:36 IDT 2015
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/bluesite/pages/schedule_demo.scala.html
                  HASH: 83be30a52b31b977e463e9656a7a60b57a9aef27
                  MATRIX: 603->0
                  LINES: 22->1
                  -- GENERATED --
              */
          