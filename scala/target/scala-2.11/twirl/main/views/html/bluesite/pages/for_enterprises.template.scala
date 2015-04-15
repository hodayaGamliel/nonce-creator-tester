
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
object for_enterprises extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<div id="blueSiteIndexMain" class="for-enterprises">
    <section class="form-header">
        <div class="slimSiteCentered">
            <h1>Schedule a call with one of our<br/>performance engineers to learn:</h1>
        </div>
    </section>
    
    <section class="schedule-form">
        <div class="slimSiteCentered">
            <form action="https://app.takipi.com/app/requestdemo" method="post">
               <input type="hidden" name="source" value="takipi-for-enterprise" />
               <input type="hidden" name="user_timezone" />
                <p class="description">
                    <strong>Find out how to boost your dev team</strong>
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
            <ul>
                <li>How other enterprises use Takipi to help them reduce<br/>critical bugs by 90% </li>
                <li>About the on-premises solution for enterprises</li>
                <li>How to use Takipi to track code errors at deployed<br/>solutions at customers sites</li>
                <li>How to cut the amount of log files you use by 70% </li>
            </ul>
            <p class="marked">
                Takipi on-premises can be set up in 15 minutes.<br/>
                Deploy it and get new insights into your production code today.  
            </p>
        </div>
    </section>
    
<section class="trusted">
        <div class="slimSiteCentered">
            <div class="logos">
                Trusted by: <img src="/assets/images/bluesite/landing-for-enterprises-trusted.png" />
            </div>
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
</div>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Apr 15 17:20:36 IDT 2015
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/bluesite/pages/for_enterprises.scala.html
                  HASH: b9846bc8e766f00307b37cc734a87b0963da33ed
                  MATRIX: 605->0
                  LINES: 22->1
                  -- GENERATED --
              */
          