
package views.html.bluesite

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
object head extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<link rel="stylesheet" href="assets/stylesheets/indexnew.css">
<link rel="stylesheet" media="screen" href=""""),_display_(/*2.46*/routes/*2.52*/.Assets.at("stylesheets/bluesite/bluesite-all.min.css")),format.raw/*2.107*/(""""/>
<!-- Windows don't handle css concatenation
<link rel="stylesheet" media="screen" href=""""),_display_(/*4.46*/routes/*4.52*/.Assets.at("stylesheets/bluesite/jquery.fancybox.css")),format.raw/*4.106*/(""""/> 
<link rel="stylesheet" media="screen" href=""""),_display_(/*5.46*/routes/*5.52*/.Assets.at("stylesheets/bluesite/bluesite.css")),format.raw/*5.99*/(""""/> -->
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Apr 15 17:20:36 IDT 2015
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/bluesite/head.scala.html
                  HASH: dc79b17c4c80477479bc5af659f1455efdadbb0c
                  MATRIX: 588->0|722->108|736->114|812->169|931->262|945->268|1020->322|1096->372|1110->378|1177->425
                  LINES: 22->1|23->2|23->2|23->2|25->4|25->4|25->4|26->5|26->5|26->5
                  -- GENERATED --
              */
          