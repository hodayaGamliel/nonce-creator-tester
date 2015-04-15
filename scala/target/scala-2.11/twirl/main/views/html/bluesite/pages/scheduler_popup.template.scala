
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
object scheduler_popup extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Boolean,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(useTimeout: Boolean = true):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.30*/("""
"""),format.raw/*2.1*/("""<section id="scheduler-popup-overlay" """),_display_(/*2.40*/if(!useTimeout)/*2.55*/{_display_(Seq[Any](format.raw/*2.56*/("""class="scroll-end"""")))}),format.raw/*2.75*/(""">
    <aside id="scheduler-popup">
        <h1>Spending too much time debugging?</h1>
        <p>Schedule a 1:1 call with one of our performance engineers<br/>to see how you can boost your dev team.</p>
        <a class="button" href=""""),_display_(/*6.34*/routes/*6.40*/.BlueSite.schedule_demo),format.raw/*6.63*/("""">Make it happen</a>
        <a class="close" href="#close">&times;</a>
    </aside>
</section>"""))}
  }

  def render(useTimeout:Boolean): play.twirl.api.HtmlFormat.Appendable = apply(useTimeout)

  def f:((Boolean) => play.twirl.api.HtmlFormat.Appendable) = (useTimeout) => apply(useTimeout)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Apr 15 17:20:37 IDT 2015
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/bluesite/pages/scheduler_popup.scala.html
                  HASH: 655eafb1a0513325c276f9a99d532ef03da74533
                  MATRIX: 531->1|647->29|674->30|739->69|762->84|800->85|849->104|1111->340|1125->346|1168->369
                  LINES: 19->1|22->1|23->2|23->2|23->2|23->2|23->2|27->6|27->6|27->6
                  -- GENERATED --
              */
          