name := "SitePlay"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala, SbtWeb).disablePlugins(sbt.plugins.JUnitXmlReportPlugin)

// XXX This makes sure the sbt-web plugins run in dev mode as well.
// For some reason it breaks the production (activator start) version. It works if this line is commented out
pipelineStages in Assets := Seq(uglify, concat, cssCompress, gzip)

// This is sbt-web plugins for
pipelineStages := Seq(uglify, concat, cssCompress, gzip)

// LESS
LessKeys.compress in Assets := true

includeFilter in (Assets, LessKeys.less) := "*.less"

// UGLIFY
// This makes uglify concatenates the javascript files found in assets/javascripts/* to javscripts/main.min.js
// https://github.com/sbt/sbt-uglify/issues/2
UglifyKeys.uglifyOps := { js =>
  Seq((js.sortBy(_._2), "javascripts/main.min.js"))
}

// CONCAT (Still doesn't take takipiSiteRetina because of less/css folders problem)
Concat.groups := Seq(
  "stylesheets/main.css" -> group(Seq("stylesheets/navCore.css", "stylesheets/siteCore.css", "stylesheets/takipiMiniSignup.css")),
  "stylesheets/bluesite/bluesite-all.css" -> group(Seq("stylesheets/bluesite/jquery.fancybox.css", "stylesheets/bluesite/bluesite.css"))
)

// Compression means not all js lines are breakpointable (it optimizes them).
// We should probably configure a better compression using the options
// UglifyKeys.compress := false
// UglifyKeys.compressOptions := Seq(unsafe)

scalaVersion := "2.11.1"

libraryDependencies += "com.newrelic.agent.java" % "newrelic-api" % "3.10.0"

libraryDependencies += "com.newrelic.agent.java" % "newrelic-agent" % "3.10.0"

libraryDependencies += "net.sourceforge.htmlunit" % "htmlunit" % "2.15" % "test"

testOptions in Test += Tests.Argument(TestFrameworks.Specs2, "junitxml", "console")

libraryDependencies ++= Seq(
  cache,
  ws
)

unmanagedResourceDirectories in Compile <+= baseDirectory( _ / "app" )

doc in Compile <<= target.map(_ / "none")
