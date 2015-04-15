
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
object beautiful_exceptions extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<div id="blueSiteIndexMain">
    <section class="beautiful-exceptions">
        <div class="slimSiteCentered">
            <h1>Your exceptions have never been so beautiful</h1>
            
            <div class="left-side">
                <ul>
                    <li>Track All errors, Know which ones really affect your users.</li>
                    <li>See all the code and variable values that led to each error.</li>
                    <li>Squash monster bugs</li>
                </ul>
                <a class="btn-submit" href=""""),_display_(/*12.46*/globals/*12.53*/.TAKIPI_CREATE_ACCOUNT),format.raw/*12.75*/("""">Start using Takipi &gt;&gt;</a>
                <img src="/assets/images/bluesite/beautiful-exceptions-logos.png" class="logos"/>
            </div>
            <div class="video-container">
                <a href="https://www.youtube.com/watch?v=U7t-FRvxqJ4" target="_blank" fancy-width="854" fancy-height="510" class="fancybox">Play video</a>
            </div>
        </div>
    </section>
    
    <section class="supported">
        <div class="slimSiteCentered">
            <ul>
                <li class="legend">Supports:</li>
                <li>Java</li>
                <li>Scala</li>
                <li>CI (Chef/Puppet/Salt)</li>
                <li>Docker</li>
                <li>New Relic</li>
                <li>Hadoop</li>
                <li>Spark</li>
                <li>JIRA</li>
                <li>Heroku</li>
            </ul>
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
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/bluesite/pages/beautiful_exceptions.scala.html
                  HASH: 87a059d167b77f45686fe8a36e57197adf40e0e1
                  MATRIX: 610->0|1179->542|1195->549|1238->571
                  LINES: 22->1|33->12|33->12|33->12
                  -- GENERATED --
              */
          