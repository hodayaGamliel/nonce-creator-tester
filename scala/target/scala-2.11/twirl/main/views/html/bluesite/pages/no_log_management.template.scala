
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
object no_log_management extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<div id="blueSiteIndexMain">
    <section class="tired-of-log-files">
        <div class="slimSiteCentered">
            <img src="/assets/images/bluesite/no-log-management-sign.png" height="206" />
            <h1>Getting tired of log files?</h1>
            <h2>A new way to troubleshoot in production.</h2>
            
            <p class="description">Takipi works at the JVM level to show you the exact code and variable state for each error, 
            right as if you were there when it happened. Takipi doesn’t rely on parsing log files, 
            so you can reduce the CPU / IO overhead of writing to logs significantly, and gain more error 
            visibility at the same time.</p>
            
            <h3>No more sifting through log files. No more struggling to reproduce bugs.</h3>
            
            <div class="actions">
                <a class="button-big" href=""""),_display_(/*16.46*/globals/*16.53*/.TAKIPI_CREATE_ACCOUNT),format.raw/*16.75*/("""">Start using Takipi &gt;&gt;</a>
                <a class="button" href=""""),_display_(/*17.42*/routes/*17.48*/.BlueSite.product),format.raw/*17.65*/("""">Learn more</a>
                <a class="button" href=""""),_display_(/*18.42*/routes/*18.48*/.BlueSite.schedule_demo),format.raw/*18.71*/("""">Schedule a demo</a>
            </div>
            <br/>
            <img src="/assets/images/bluesite/no-log-management-logos.png" height="36" />
        </div>
    </section>
    
    <section class="no-logs supported">
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
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/bluesite/pages/no_log_management.scala.html
                  HASH: fa565b2fe65858a54e5aaaf2be4a75b685318803
                  MATRIX: 607->0|1536->902|1552->909|1595->931|1697->1006|1712->1012|1750->1029|1835->1087|1850->1093|1894->1116
                  LINES: 22->1|37->16|37->16|37->16|38->17|38->17|38->17|39->18|39->18|39->18
                  -- GENERATED --
              */
          