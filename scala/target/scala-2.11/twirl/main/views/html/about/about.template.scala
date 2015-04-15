
package views.html.about

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
import scala.util.Random
/**/
object about extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*3.1*/("""<div class="backgroundFiller"></div>
<div id="aboutUsMain" class="subPageMain siteCentered">
	<div class="content styled">
		<div class="header">
			<div class="title">About Us</div>
		</div>
		<div class="coFoundersBox aboutBox">
			<code class="boxHeader">
				takipi.add(<span class="value">"Founders"</span>);
			</code>
			<div class="coFoundersList1">
				"""),_display_(/*14.6*/cofounder(
					"tal",
					"tal.weiss@takipi.com",
					"http://il.linkedin.com/in/talws",
					null,
					null,
					"Tal Weiss",
					"CEO",
					"Tal is the CEO at Takipi, responsible for overseeing the company's strategy and operations. Previously, Tal was co-founder and CEO at VisualTao, a Sequoia backed start-up which was acquired by Autodesk in 2009. Following the acquisition, Tal served as the Director responsible for product management, development and social marketing for Autodesk's flagship web and mobile product line used by millions of professional users worldwide. Prior to co-founding VisualTao Tal served as a software architect at IAI Space Industries focusing on real-time satellite tracking systems.")),format.raw/*22.584*/("""
				
				"""),_display_(/*24.6*/cofounder(
					"iris",
					"iris.shoor@takipi.com",
					"http://www.linkedin.com/in/irisshoor",
					"http://twitter.com/IrisShoor",
					"http://www.startupmoon.com/",
					"Iris Shoor",
					"VP Product & Marketing",
					"Iris is the VP of Product and Marketing at Takipi, responsible for designing and marketing the company's innovative technology. Previously, Iris was co-founder and VP Product at VisualTao, acquired by Autodesk in 2009. Following the acquisition, Iris served as the product line manager for Autodesk's flagship web and mobile product line - bringing it from zero to 10M users in less than two years. Iris holds a B.Arch Cum Laude from the Bezalel Academy of Art and Design in Jerusalem.")),format.raw/*32.494*/("""
			"""),format.raw/*33.4*/("""</div>
			<div class="coFoundersList2">
				"""),_display_(/*35.6*/{
					val chen = 
						cofounder(
							"chen",
							"chen.harel@takipi.com",
							"http://www.linkedin.com/in/chenh",
							"http://twitter.com/chenharel",
							null,
							"Chen Harel",
							"Co-Founder",
							"Chen is a cloud architect at Takipi focusing on scalability and availability. Previously, Chen was a team lead at Autodesk, where he led the development of the company's flagship cloud backend infrastructure. Prior to that Chen was a software engineer at VisualTao. Chen has a B.Sc in Computer Science and Management from Tel-Aviv University.")
					
					val niv = 
						cofounder(
							"niv",
							"niv@takipi.com",
							"http://www.linkedin.com/in/nivst",
							"http://twitter.com/nivstein",
							null,
							"Niv Steingarten",
							"VP R&D",
							"Niv is VP of R&D at Takipi, responsible for making software magic happen. Previously, Niv was principal developer at Autodesk, where he led the development of the company's flagship mobile iOS and Android apps. Prior to that, Niv was employee no. 1 at VisualTao. Niv has a B.Sc Magna Cum Laude in Computer Science from Tel-Aviv University.")
					
					val dor = 
						cofounder(
							"dor",
							"dor.levi@takipi.com",
							"http://www.linkedin.com/in/dorlevi",
							null,
							null,
							"Dor Levi",
							"Co-Founder",
							"Dor is a senior algorithms developer at Takipi focusing on graph theory. Previously, dor was principal developer at Autodesk, where he led the development of the company's flagship 3D mobile engine. Prior to that Dor was employee no. 2 at VisualTao. Dor holds a B.Sc Magna Cum Laude in Computer Science from Tel-Aviv University.")
					
					HtmlFormat.fill(Random.shuffle(List(chen, dor, niv)))
				}),format.raw/*70.6*/("""
			"""),format.raw/*71.4*/("""</div>
		</div>
		<div class="teamBox aboutBox">
			<code class="boxHeader">
				takipi.add(<span class="value">"Kick-ass team"</span>);
			</code>
			<div class="teamMembersList">
				<div class="subList">
					"""),_display_(/*79.7*/member("alex",		"Alex Zhitnitsky", "")),format.raw/*79.45*/("""
					"""),_display_(/*80.7*/member("cassandra","Cassandra Salisbury", "")),format.raw/*80.52*/("""
					"""),_display_(/*81.7*/member("david",	"David Levanon", "")),format.raw/*81.43*/("""
					"""),_display_(/*82.7*/member("guy",		"Guy Isacar", "")),format.raw/*82.39*/("""
					"""),_display_(/*83.7*/member("hen",		"Hen Amar", "")),format.raw/*83.37*/("""
					"""),_display_(/*84.7*/member("moshe",	"Moshe Tsur", "")),format.raw/*84.40*/("""
					"""),_display_(/*85.7*/member("ohad",		"Ohad Almog", "")),format.raw/*85.40*/("""
					"""),format.raw/*86.6*/("""<div class="subListDecoration"></div>
				</div>
				<div class="subList">
					"""),_display_(/*89.7*/member("ophir",	"Ophir Primat", "")),format.raw/*89.42*/("""
					"""),_display_(/*90.7*/member("shimi",	"Shimi Bernholtz", "")),format.raw/*90.45*/("""
					"""),_display_(/*91.7*/member("sivan",	"Sivan Franko", "")),format.raw/*91.42*/("""
					"""),_display_(/*92.7*/member("steve",	"Steve Reyes", "")),format.raw/*92.41*/("""
					"""),_display_(/*93.7*/member("tzofia",	"Tzofia Shiftan", "")),format.raw/*93.45*/("""
					"""),_display_(/*94.7*/member("yuri",		"Yuri Klayman", "")),format.raw/*94.42*/("""
					"""),format.raw/*95.6*/("""<a class="jobsLink" href=""""),_display_(/*95.33*/routes/*95.39*/.Application.jobs),format.raw/*95.56*/("""">"""),_display_(/*95.59*/member("you", "You", "Join Our Team")),format.raw/*95.96*/("""</a>
					<div class="subListDecoration"></div>
				</div>
			</div>
		</div>
		<div class="investoresBox aboutBox">
			<code class="boxHeader">
				takipi.add(<span class="value">"World-class investors"</span>);
			</code>
			<div class="investoresList">
				"""),_display_(/*105.6*/member("venky", "Venky Ganesan", "Menlo Ventures")),format.raw/*105.56*/("""
				"""),_display_(/*106.6*/member("avery", "Avery More", "Menlo Ventures")),format.raw/*106.53*/("""
				"""),format.raw/*107.5*/("""<a href="http://www.menloventures.com/" target="_blank"><div class="menloIcon"></div></a>
			</div>
		</div>
	</div>
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
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/about/about.scala.html
                  HASH: 7e169084e774706eeb97b717806256724c05a540
                  MATRIX: 610->27|999->390|1748->1117|1785->1128|2522->1843|2553->1847|2624->1892|4385->3633|4416->3637|4655->3850|4714->3888|4747->3895|4813->3940|4846->3947|4903->3983|4936->3990|4989->4022|5022->4029|5073->4059|5106->4066|5160->4099|5193->4106|5247->4139|5280->4145|5387->4226|5443->4261|5476->4268|5535->4306|5568->4313|5624->4348|5657->4355|5712->4389|5745->4396|5804->4434|5837->4441|5893->4476|5926->4482|5980->4509|5995->4515|6033->4532|6063->4535|6121->4572|6409->4833|6481->4883|6514->4889|6583->4936|6616->4941
                  LINES: 22->3|33->14|41->22|43->24|51->32|52->33|54->35|89->70|90->71|98->79|98->79|99->80|99->80|100->81|100->81|101->82|101->82|102->83|102->83|103->84|103->84|104->85|104->85|105->86|108->89|108->89|109->90|109->90|110->91|110->91|111->92|111->92|112->93|112->93|113->94|113->94|114->95|114->95|114->95|114->95|114->95|114->95|124->105|124->105|125->106|125->106|126->107
                  -- GENERATED --
              */
          