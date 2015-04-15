
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
object sourceattach extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<div class="backgroundFiller"></div>
			<div id="sourceAttachMain" class="subPageMain siteCentered">
				<div class="heading">
					<h1>Viewing Scala Code</h1>
					<a id="mainCreateAccountBtn" class="createAccountBtn" href=""""),_display_(/*5.67*/globals/*5.74*/.TAKIPI_CREATE_ACCOUNT),format.raw/*5.96*/("""">Create your account</a>
				</div>
				<div class="content styled">
					<p>When you open an event such as an exception or breakpoint Takipi overlays the run-time variable data on your code. Takipi displays a Java decompilation of your application's bytecode. This is fine if you're using Java. If you're using Scala, Ruby, Groovy or any non-Java language, you'll preferably want to see you source code in its original form. This can also be nice if you're writing in Java and want to see code comments or are using a code weaver (such as AspectJ) which adds a lot of synthetic code.</p>
					<p>This is pretty easy to do and requires a minor customization to your usual build steps. Below is a simple guide showing what to tweak if you're using Eclipse  InelliJ, Maven or Ant to add source files to your .jars. We've also created sample projects for each of these, available on GitHub: <a class="blue underlinelink" href="https://github.com/takipi/attach-source-samples" target="_blank">https://github.com/takipi/attach-source-samples</a>.</p>
					<p>&nbsp;</p>
					<h3>Play Framework</h3>
					<p>Takipi automatically supports displaying Scala source code compiled on your server by the Play framework. You're good to go!</p>
					<p>&nbsp;</p>
					<h3>SBT</h3>
					<p>You can add your sources to your jar with SBT, by adding this line to your <b>build.sbt</b> file (you may adjust the path to fit yours):</p>
					<p><i>
					&nbsp;&nbsp;&nbsp;&nbsp;unmanagedResourceDirectories in Compile &lt;+= baseDirectory( _ / "src" )</i></p>
					<p>You may add more than one directory by adding several lines, e.g.:</p>
					<p><i>
					&nbsp;&nbsp;&nbsp;&nbsp;unmanagedResourceDirectories in Compile &lt;+= baseDirectory( _ / "src" )<br />
					&nbsp;&nbsp;&nbsp;&nbsp;unmanagedResourceDirectories in Compile &lt;+= baseDirectory( _ / "app" )</i></p>
					<p>For example:</p>
					<p><i>
					&nbsp;&nbsp;&nbsp;&nbsp;name := "hello"<br />
					&nbsp;&nbsp;&nbsp;&nbsp;version := "1.0"<br />
					&nbsp;&nbsp;&nbsp;&nbsp;scalaVersion := "2.9.2"<br />
					&nbsp;&nbsp;&nbsp;&nbsp;resolvers += "twitter-repo" at "http://maven.twttr.com"<br />
					&nbsp;&nbsp;&nbsp;&nbsp;libraryDependencies ++= Seq("com.twitter" % "finagle-core" ...<br />
					&nbsp;&nbsp;&nbsp;&nbsp;unmanagedResourceDirectories in Compile &lt;+= baseDirectory( _ / "src" )<br />
					&nbsp;&nbsp;&nbsp;&nbsp;unmanagedResourceDirectories in Compile &lt;+= baseDirectory( _ / "app" )</i></p>
					<p>&nbsp;</p>
					<h3>Ant</h3>
					<p>In the project's <b>build.xml</b> file, make sure the javac tag contains the following attributes:</p>
					<p><i>
					&nbsp;&nbsp;&nbsp;&nbsp;debug="true"<br />
					&nbsp;&nbsp;&nbsp;&nbsp;debuglevel="source,lines,vars"</i></p>
					<p>Furthermore, in your jar tag add <i>&lt;fileset dir="src" /&gt;</i> to include the source files.</p>
					<p>Here's a sample Ant <a class="blue underlinelink" href="https://raw.github.com/takipi/attach-source-samples/master/ant/build.xml" target="_blank">build.xml</a> file</p>
					<p>&nbsp;</p>
					<h3>Maven</h3>
					<p>In order to package your source files add the following resources to your build tag:</p>
					<p><i>
					&nbsp;&nbsp;&nbsp;&nbsp;&lt;resources&gt;<br />
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&lt;resource&gt;<br/>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&lt;directory&gt;$"""),format.raw/*45.96*/("""{"""),format.raw/*45.97*/("""project.build.sourceDirectory"""),format.raw/*45.126*/("""}"""),format.raw/*45.127*/("""&lt;/directory&gt;<br/>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&lt;/resource&gt;<br/>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&lt;resource&gt;<br />
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&lt;directory&gt;$"""),format.raw/*48.96*/("""{"""),format.raw/*48.97*/("""basedir"""),format.raw/*48.104*/("""}"""),format.raw/*48.105*/("""/src/main/resources&lt;/directory&gt;<br/>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&lt;/resource&gt;<br/>
					&nbsp;&nbsp;&nbsp;&nbsp;&lt;/resources&gt;</i></p>
					<p>Here's a sample Maven <a class="blue underlinelink" href="https://raw.github.com/takipi/attach-source-samples/master/maven/pom.xml" target="_blank">pom.xml</a> file</p>
					<p>&nbsp;</p>
					<h3>Eclipse</h3>
					<p>1. Right click your project and select Export -&gt; JAR file.</p>
					<p>2. In the export window select "Export Java source files and resources".</p>
					<div class="guide eclipse"></div>
					<p>&nbsp;</p>
					<h3>IntelliJ</h3>
					<p>1. Open File | Project Structure (<img class="intellijicon"></img>) dialog.</p>
					<p>2. Pick your Scala project's .jar file from the artifacts list.</p>
					<p>3. Click the green plus button and select your 'src' folder.</p>
					<p>4. Build the project.</p>
					<div class="guide intellij1"></div>
					<p>Here's how to create a new jar in IntelliJ -</p>
					<p>1. Click the green plus and add a JAR artifact.</p>
					<p>2. Drag the compile output from the "Available elements" list to the JAR on the left.</p>
					<p>3. Add your source folder as described above.</p>
					<div class="guide intellij2"></div>
					<p>&nbsp;</p>
					<h3>Source folders</h3>
					<p>You can also simply place a directory with your source code on the machine on which Takipi runs, and add the following startup argument to your JVM:</p>
					<p><i>
					&nbsp;&nbsp;&nbsp;&nbsp;-Dtakipi.sources.path=/your/source/dir/here</i></p>
					<p>For example:</p>
					<p><i>
					&nbsp;&nbsp;&nbsp;&nbsp;java <b>-Dtakipi.sources.path=/opt/my-app/src</b> -jar myApp.jar</i></p>
					<p>You may specify multiple directories, by separating the paths using ';' (Windows), or ':' (Linux):</p>
					<p><i>
					&nbsp;&nbsp;&nbsp;&nbsp;java <b>-Dtakipi.sources.path=/opt/my-app/src</b>:<b>/opt/another-app/src/main/scala</b> -jar myApp.jar</i></p>
					<p>&nbsp;</p>
					<p>If you have any questions or run into issues, let us know at <a class="blue underlinelink" href="mailto:info@takipi.com" target="_blank">info@takipi.com</a>, we're here to help.</p>
				</div>
			</div>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Apr 15 17:20:38 IDT 2015
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/pages/sourceattach.scala.html
                  HASH: c89e4b07db864c6f0cc86d077556634199a315fb
                  MATRIX: 593->0|845->226|860->233|902->255|4323->3648|4352->3649|4410->3678|4440->3679|4739->3950|4768->3951|4804->3958|4834->3959
                  LINES: 22->1|26->5|26->5|26->5|66->45|66->45|66->45|66->45|69->48|69->48|69->48|69->48
                  -- GENERATED --
              */
          