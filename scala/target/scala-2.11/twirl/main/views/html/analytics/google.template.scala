
package views.html.analytics

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
object google extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<script type="text/javascript">
var _gas = _gas || [];

(function() """),format.raw/*4.13*/("""{"""),format.raw/*4.14*/("""
"""),format.raw/*5.1*/("""var ga = document.createElement('script');
ga.id = 'gas-script';
ga.setAttribute('data-use-dcjs', 'false');
ga.type = 'text/javascript';
ga.async = true;
ga.src = '//cdnjs.cloudflare.com/ajax/libs/gas/1.11.0/gas.min.js';
var s = document.getElementsByTagName('script')[0];
s.parentNode.insertBefore(ga, s);
"""),format.raw/*13.1*/("""}"""),format.raw/*13.2*/(""")();
</script>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Apr 15 17:20:36 IDT 2015
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/analytics/google.scala.html
                  HASH: 8ca1ecf392e8bf9c2b4b425b3203da7b2a845c41
                  MATRIX: 591->0|686->68|714->69|741->70|1075->377|1103->378
                  LINES: 22->1|25->4|25->4|26->5|34->13|34->13
                  -- GENERATED --
              */
          