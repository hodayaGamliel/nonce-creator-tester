
package views.html.pages

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
object jobs extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<div class="backgroundFiller new"></div>
<div id="jobsMain" class="subPageMain siteCentered">
	<div class="heading">
		<h1>Jobs</h1>
		<div class="headerMiniSignup"></div>
	</div>
	<div class="content newStyled">
		<div class="internalHeader">
			<h3>Monster Career Opportunities</h3>
			<div class="monsters"></div>
			<div class="jedi"></div>
		</div>
		<div class="jobsSection">
			<div class="internal">
				<div class="jobsColumn">
                    <div class="job">
                        <div class="jobDesc">
                            <p>Takipi tells companies when and why their software breaks in production. Our product gives developers never before seen insight into their code - helping engineering teams understand which problems they need to work on, and what's actually causing them. With Takipi, companies can ship products more rapidly and with more confidence, and developers can spend their time shipping code instead of fixing it.</p>
                            <p>Backed by Menlo Ventures and founded by a team of experienced entrepreneurs, we're here to change how developers debug and fix their software at scale, and have fun doing it!</p>
                        </div>
                        <br/>
                        <h3>Customer Success Manager (San-Francisco / U.S - remote)</h3>
                        <div class="jobDesc">
                            <p>We’re looking for someone to join our Customer Success team. As part of this role, you’ll be working deeply in two domains:</p>
                            <p>Pre-sale: With users during the trial period of the product, guiding and supporting them and making sure they successfully evaluate the product.</p>
                            <p>Post-sale: With customers, serving as a key point of contact, making sure they are trained, successfully utilize all the features in the product, and understand the value of Takipi.</p>
                            <p>This is a rare opportunity to experience the best of both worlds: a technical role working with developers and engineers, as well as a business role managing customer relationships and pre-sales activities. In addition, you will be working closely with the product team helping to shape the product and its marketing, as well as the engineering team solving customer problems. This is a true startup position, wearing multiple hats and being able to really move the needle.</p>
                        </div>
                        <div class="requirements">
                            <h4>Key requirements</h4>
                            <ul>
                                <li><div>Technical degree with 3+ years experience as a developer or in a technical support role.</div></li>
                                <li><div>Good knowledge of Java and other JVM languages.</div></li>
                                <li><div>Good knowledge of Java platforms like Tomcat, Weblogic, JBoss, eclipse and more.</div></li>
                                <li><div>Good knowledge of Linux</div></li>
                                <li><div>Experience working with customers and/or sales.</div></li>
                                <li><div>Excellent communication skills via email and phone.</div></li>
                            </ul>
                            <br/>
                            <h4>Preferred skills</h4>
                            <ul>
                                <li><div>Able to quickly understand and interpret customer problems and navigate complex organizations.</div></li>
                                <li><div>Ability to work independently with little oversight.</div></li>
                                <li><div>Effective at communicating clearly to technical and business audiences.</div></li>
                                <li><div>Start up experience</div></li>
                                <li><div>Ability to manage a heavy workload well and to be well organized.</div></li>
                                <li><div>Collaborates easily across teams or disciplines to solve problems.</div></li>
                            </ul>
                        </div>
                        <p>Remote candidates in the US will also be considered.</p>
                        <br/>
                        <p><strong>Contact</strong> <a href="mailto:ohad.almog@takipi.com" class="underlinelink">ohad.almog@takipi.com</a></p>
                    </div>
                    
                    <div class="job">
                        <h3>Full-stack Engineer (Tel-Aviv)</h3>
                        <div class="jobDesc">
                            <p>We're looking for an experienced developer to help us build the app across the  stack all the way from server code analysis algorithms to Linux C++ code to  advanced JavaScript.</p>
                        </div>
                        <div class="requirements">
                            <h4>Requirements</h4>
                            <ul>
                                <li><div>3+ years programming experience</div></li>
                                <li><div>Strong skills and love for OO</div></li>
                                <li><div>Experience in Java/C++ -- a big plus</div></li>
                                <li><div>Graduate of a major university or technical unit in the IDF</div></li>
                                <li><div>People person, creative, up-to-date with recent technologies.</div></li>
                            </ul>
                        </div>
                        <p><strong>Contact</strong> <a href="mailto:tamar.etzyon@takipi.com" class="underlinelink">tamar.etzyon@takipi.com</a></p>
                    </div>
				</div><!-- Here as a reminder how to add jobs -->
				<div class="contactUsHolder">
					<a href="mailto:jobs@takipi.com" class="contactUs"><span class="main">Contact us</span><span class="mail">jobs@takipi.com</span></a>
				</div>
				<div class="officeImages" office="sf"></div>
				<div class="officeImages" office="tlv"></div>
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
                  DATE: Wed Apr 15 17:20:38 IDT 2015
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/pages/jobs.scala.html
                  HASH: 380e9ca4afc2a9205f63f4fa5842915ace9b7fe3
                  MATRIX: 585->0
                  LINES: 22->1
                  -- GENERATED --
              */
          