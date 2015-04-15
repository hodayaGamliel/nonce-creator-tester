
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
object debug_less extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<div id="blueSiteIndexMain">
    <section class="takipi-preview">
        <div class="slimSiteCentered">
            <h1>Solve complex server errors in minutes.</h1>
            <h2>Debug less, Develop more.</h2>
            <p class="description">Takipi is a new technology that allows you <br/>to see EXACTLY what led to each error.</p>
            <div class="form-container">
                <div class="start-form takipiMiniSignupForm" createdin="header">
                    <form action="#">
                        <div class="row">
                            <input class="text emailInput" type="email" placeholder="Email address">
                            <input class="btn-submit createStubAccountBtn" type="submit" value="Start using Takipi &gt;&gt;">
                        </div>
                        <div class="errorLabel">User already exists <a class="loginLink" href=""""),_display_(/*14.97*/globals/*14.104*/.LOGIN_PAGE),format.raw/*14.115*/("""">Log in</a></div>
                        <p class="sub-note">Java / Scala</p>
                    </form>
                </div>
            </div>
            <img src="/assets/images/bluesite/landing-1-monster.png" class="monster">
        </div>
    </section>
    
    <section class="quotes">
        <div class="slimSiteCentered">
            <img src="/assets/images/bluesite/landing-1-quote-logos.png" class="logos">
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
    
    <section class="features">
        <div class="slimSiteCentered">
            <ul>
                <li>
                    <img src="/assets/images/bluesite/landing-1-feature-1.png" width="140">
                    <div>Installs in minutes</div>
                </li>
                <li>
                    <img src="/assets/images/bluesite/landing-1-feature-2.png" width="140">
                    <div>See your server errors like you’ve<br/>
                         never seen them before</div>
                </li>
                <li>
                    <img src="/assets/images/bluesite/landing-1-feature-3.png" width="140">
                    <div>Built for production</div>
                </li>
            </ul>
        </div>
    </section>
    
    <section class="tshirt-promo">
        <div class="slimSiteCentered">
            <div class="description">
               Start your FREE trial and get a cool Java T-shirt
               <a class="btn-submit" href=""""),_display_(/*68.45*/globals/*68.52*/.TAKIPI_CREATE_ACCOUNT),format.raw/*68.74*/("""">Start using Takipi &gt;&gt;</a> 
            </div>
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
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/bluesite/pages/debug_less.scala.html
                  HASH: 482a91af52caef17074f87071bd8b8163ca144cc
                  MATRIX: 600->0|1522->895|1539->902|1572->913|3606->2920|3622->2927|3665->2949
                  LINES: 22->1|35->14|35->14|35->14|89->68|89->68|89->68
                  -- GENERATED --
              */
          