// @SOURCE:/Users/takipimbp1/Projects/takipi/test/nonce/scala/conf/routes
// @HASH:56954c7c812a0076fc54783ec78ee11fd88ad9b8
// @DATE:Wed Apr 15 19:19:58 IDT 2015


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:4
private[this] lazy val controllers_BlueSite_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_BlueSite_index0_invoker = createInvoker(
controllers.BlueSite.index,
HandlerDef(this.getClass.getClassLoader, "", "controllers.BlueSite", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:5
private[this] lazy val controllers_BlueSite_index1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("freeserver"))))
private[this] lazy val controllers_BlueSite_index1_invoker = createInvoker(
controllers.BlueSite.index,
HandlerDef(this.getClass.getClassLoader, "", "controllers.BlueSite", "index", Nil,"GET", """""", Routes.prefix + """freeserver"""))
        

// @LINE:6
private[this] lazy val controllers_BlueSite_product2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("product"))))
private[this] lazy val controllers_BlueSite_product2_invoker = createInvoker(
controllers.BlueSite.product,
HandlerDef(this.getClass.getClassLoader, "", "controllers.BlueSite", "product", Nil,"GET", """""", Routes.prefix + """product"""))
        

// @LINE:7
private[this] lazy val controllers_BlueSite_features3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("features"))))
private[this] lazy val controllers_BlueSite_features3_invoker = createInvoker(
controllers.BlueSite.features,
HandlerDef(this.getClass.getClassLoader, "", "controllers.BlueSite", "features", Nil,"GET", """""", Routes.prefix + """features"""))
        

// @LINE:8
private[this] lazy val controllers_BlueSite_howitworks4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("how-it-works"))))
private[this] lazy val controllers_BlueSite_howitworks4_invoker = createInvoker(
controllers.BlueSite.howitworks,
HandlerDef(this.getClass.getClassLoader, "", "controllers.BlueSite", "howitworks", Nil,"GET", """""", Routes.prefix + """how-it-works"""))
        

// @LINE:9
private[this] lazy val controllers_BlueSite_security5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("security"))))
private[this] lazy val controllers_BlueSite_security5_invoker = createInvoker(
controllers.BlueSite.security,
HandlerDef(this.getClass.getClassLoader, "", "controllers.BlueSite", "security", Nil,"GET", """""", Routes.prefix + """security"""))
        

// @LINE:10
private[this] lazy val controllers_BlueSite_whytakipi6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("why-takipi"))))
private[this] lazy val controllers_BlueSite_whytakipi6_invoker = createInvoker(
controllers.BlueSite.whytakipi,
HandlerDef(this.getClass.getClassLoader, "", "controllers.BlueSite", "whytakipi", Nil,"GET", """""", Routes.prefix + """why-takipi"""))
        

// @LINE:11
private[this] lazy val controllers_BlueSite_pricing7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("pricing"))))
private[this] lazy val controllers_BlueSite_pricing7_invoker = createInvoker(
controllers.BlueSite.pricing,
HandlerDef(this.getClass.getClassLoader, "", "controllers.BlueSite", "pricing", Nil,"GET", """""", Routes.prefix + """pricing"""))
        

// @LINE:12
private[this] lazy val controllers_BlueSite_scala8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("scala"))))
private[this] lazy val controllers_BlueSite_scala8_invoker = createInvoker(
controllers.BlueSite.scala,
HandlerDef(this.getClass.getClassLoader, "", "controllers.BlueSite", "scala", Nil,"GET", """""", Routes.prefix + """scala"""))
        

// @LINE:13
private[this] lazy val controllers_BlueSite_debug_less9_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("debug-less"))))
private[this] lazy val controllers_BlueSite_debug_less9_invoker = createInvoker(
controllers.BlueSite.debug_less,
HandlerDef(this.getClass.getClassLoader, "", "controllers.BlueSite", "debug_less", Nil,"GET", """""", Routes.prefix + """debug-less"""))
        

// @LINE:14
private[this] lazy val controllers_BlueSite_beautiful_exceptions10_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("beautiful-exceptions"))))
private[this] lazy val controllers_BlueSite_beautiful_exceptions10_invoker = createInvoker(
controllers.BlueSite.beautiful_exceptions,
HandlerDef(this.getClass.getClassLoader, "", "controllers.BlueSite", "beautiful_exceptions", Nil,"GET", """""", Routes.prefix + """beautiful-exceptions"""))
        

// @LINE:15
private[this] lazy val controllers_BlueSite_schedule_demo11_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("schedule-demo"))))
private[this] lazy val controllers_BlueSite_schedule_demo11_invoker = createInvoker(
controllers.BlueSite.schedule_demo,
HandlerDef(this.getClass.getClassLoader, "", "controllers.BlueSite", "schedule_demo", Nil,"GET", """""", Routes.prefix + """schedule-demo"""))
        

// @LINE:16
private[this] lazy val controllers_BlueSite_for_enterprises12_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("for-enterprises"))))
private[this] lazy val controllers_BlueSite_for_enterprises12_invoker = createInvoker(
controllers.BlueSite.for_enterprises,
HandlerDef(this.getClass.getClassLoader, "", "controllers.BlueSite", "for_enterprises", Nil,"GET", """""", Routes.prefix + """for-enterprises"""))
        

// @LINE:17
private[this] lazy val controllers_BlueSite_spark13_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("spark"))))
private[this] lazy val controllers_BlueSite_spark13_invoker = createInvoker(
controllers.BlueSite.spark,
HandlerDef(this.getClass.getClassLoader, "", "controllers.BlueSite", "spark", Nil,"GET", """""", Routes.prefix + """spark"""))
        

// @LINE:18
private[this] lazy val controllers_BlueSite_no_log_management14_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("no-log-management"))))
private[this] lazy val controllers_BlueSite_no_log_management14_invoker = createInvoker(
controllers.BlueSite.no_log_management,
HandlerDef(this.getClass.getClassLoader, "", "controllers.BlueSite", "no_log_management", Nil,"GET", """""", Routes.prefix + """no-log-management"""))
        

// @LINE:20
private[this] lazy val controllers_Index_space15_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("index-space"))))
private[this] lazy val controllers_Index_space15_invoker = createInvoker(
controllers.Index.space,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Index", "space", Nil,"GET", """""", Routes.prefix + """index-space"""))
        

// @LINE:22
private[this] lazy val controllers_Application_ping16_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ping"))))
private[this] lazy val controllers_Application_ping16_invoker = createInvoker(
controllers.Application.ping,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "ping", Nil,"GET", """""", Routes.prefix + """ping"""))
        

// @LINE:23
private[this] lazy val controllers_Application_start17_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("start"))))
private[this] lazy val controllers_Application_start17_invoker = createInvoker(
controllers.Application.start,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "start", Nil,"GET", """""", Routes.prefix + """start"""))
        

// @LINE:24
private[this] lazy val controllers_Application_start18_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("starting"))))
private[this] lazy val controllers_Application_start18_invoker = createInvoker(
controllers.Application.start,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "start", Nil,"GET", """""", Routes.prefix + """starting"""))
        

// @LINE:25
private[this] lazy val controllers_Application_monsters19_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("monsters"))))
private[this] lazy val controllers_Application_monsters19_invoker = createInvoker(
controllers.Application.monsters,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "monsters", Nil,"GET", """""", Routes.prefix + """monsters"""))
        

// @LINE:27
private[this] lazy val controllers_Application_about20_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("about"))))
private[this] lazy val controllers_Application_about20_invoker = createInvoker(
controllers.Application.about,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "about", Nil,"GET", """ GET	/scala								controllers.Application.scala""", Routes.prefix + """about"""))
        

// @LINE:28
private[this] lazy val controllers_Application_aboutus21_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("aboutus"))))
private[this] lazy val controllers_Application_aboutus21_invoker = createInvoker(
controllers.Application.aboutus,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "aboutus", Nil,"GET", """""", Routes.prefix + """aboutus"""))
        

// @LINE:29
private[this] lazy val controllers_Application_sourceattach22_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("sourceattach"))))
private[this] lazy val controllers_Application_sourceattach22_invoker = createInvoker(
controllers.Application.sourceattach,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "sourceattach", Nil,"GET", """""", Routes.prefix + """sourceattach"""))
        

// @LINE:30
private[this] lazy val controllers_Application_newrelic23_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("newrelicold"))))
private[this] lazy val controllers_Application_newrelic23_invoker = createInvoker(
controllers.Application.newrelic,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "newrelic", Nil,"GET", """""", Routes.prefix + """newrelicold"""))
        

// @LINE:31
private[this] lazy val controllers_Application_newrelicnew24_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("newrelic"))))
private[this] lazy val controllers_Application_newrelicnew24_invoker = createInvoker(
controllers.Application.newrelicnew,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "newrelicnew", Nil,"GET", """""", Routes.prefix + """newrelic"""))
        

// @LINE:32
private[this] lazy val controllers_Application_logs25_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logs"))))
private[this] lazy val controllers_Application_logs25_invoker = createInvoker(
controllers.Application.logs,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "logs", Nil,"GET", """""", Routes.prefix + """logs"""))
        

// @LINE:33
private[this] lazy val controllers_Application_jobs26_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("jobs"))))
private[this] lazy val controllers_Application_jobs26_invoker = createInvoker(
controllers.Application.jobs,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "jobs", Nil,"GET", """""", Routes.prefix + """jobs"""))
        

// @LINE:34
private[this] lazy val controllers_Application_careers27_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("careers"))))
private[this] lazy val controllers_Application_careers27_invoker = createInvoker(
controllers.Application.careers,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "careers", Nil,"GET", """""", Routes.prefix + """careers"""))
        

// @LINE:35
private[this] lazy val controllers_Application_adtech28_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ad-tech"))))
private[this] lazy val controllers_Application_adtech28_invoker = createInvoker(
controllers.Application.adtech,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "adtech", Nil,"GET", """""", Routes.prefix + """ad-tech"""))
        

// @LINE:36
private[this] lazy val controllers_Application_adtech29_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ad-tech/free-server"))))
private[this] lazy val controllers_Application_adtech29_invoker = createInvoker(
controllers.Application.adtech,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "adtech", Nil,"GET", """""", Routes.prefix + """ad-tech/free-server"""))
        

// @LINE:37
private[this] lazy val controllers_Application_ci30_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("continuous-integration"))))
private[this] lazy val controllers_Application_ci30_invoker = createInvoker(
controllers.Application.ci,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "ci", Nil,"GET", """""", Routes.prefix + """continuous-integration"""))
        

// @LINE:38
private[this] lazy val controllers_Application_sneakybug31_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("the-sneaky-bug"))))
private[this] lazy val controllers_Application_sneakybug31_invoker = createInvoker(
controllers.Application.sneakybug,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "sneakybug", Nil,"GET", """""", Routes.prefix + """the-sneaky-bug"""))
        

// @LINE:40
private[this] lazy val controllers_Application_terms32_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("terms"))))
private[this] lazy val controllers_Application_terms32_invoker = createInvoker(
controllers.Application.terms,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "terms", Nil,"GET", """""", Routes.prefix + """terms"""))
        

// @LINE:41
private[this] lazy val controllers_Application_privacy33_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("privacy"))))
private[this] lazy val controllers_Application_privacy33_invoker = createInvoker(
controllers.Application.privacy,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "privacy", Nil,"GET", """""", Routes.prefix + """privacy"""))
        

// @LINE:42
private[this] lazy val controllers_Application_privacypolicy34_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("privacy-policy"))))
private[this] lazy val controllers_Application_privacypolicy34_invoker = createInvoker(
controllers.Application.privacypolicy,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "privacypolicy", Nil,"GET", """""", Routes.prefix + """privacy-policy"""))
        

// @LINE:43
private[this] lazy val controllers_Application_tos35_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tos"))))
private[this] lazy val controllers_Application_tos35_invoker = createInvoker(
controllers.Application.tos,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "tos", Nil,"GET", """""", Routes.prefix + """tos"""))
        

// @LINE:46
private[this] lazy val controllers_Features_redirect36_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("features/main"))))
private[this] lazy val controllers_Features_redirect36_invoker = createInvoker(
controllers.Features.redirect(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Features", "redirect", Seq(classOf[String]),"GET", """ Features""", Routes.prefix + """features/main"""))
        

// @LINE:47
private[this] lazy val controllers_Features_performance37_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("features/performance"))))
private[this] lazy val controllers_Features_performance37_invoker = createInvoker(
controllers.Features.performance,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Features", "performance", Nil,"GET", """""", Routes.prefix + """features/performance"""))
        

// @LINE:48
private[this] lazy val controllers_Features_security38_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("features/security"))))
private[this] lazy val controllers_Features_security38_invoker = createInvoker(
controllers.Features.security,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Features", "security", Nil,"GET", """""", Routes.prefix + """features/security"""))
        

// @LINE:51
private[this] lazy val controllers_FeaturesReorder_main39_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("features-reorder"))))
private[this] lazy val controllers_FeaturesReorder_main39_invoker = createInvoker(
controllers.FeaturesReorder.main,
HandlerDef(this.getClass.getClassLoader, "", "controllers.FeaturesReorder", "main", Nil,"GET", """ Features - reorder""", Routes.prefix + """features-reorder"""))
        

// @LINE:52
private[this] lazy val controllers_FeaturesReorder_redirect40_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("features-reorder/main"))))
private[this] lazy val controllers_FeaturesReorder_redirect40_invoker = createInvoker(
controllers.FeaturesReorder.redirect(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FeaturesReorder", "redirect", Seq(classOf[String]),"GET", """""", Routes.prefix + """features-reorder/main"""))
        

// @LINE:53
private[this] lazy val controllers_FeaturesReorder_performance41_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("features-reorder/performance"))))
private[this] lazy val controllers_FeaturesReorder_performance41_invoker = createInvoker(
controllers.FeaturesReorder.performance,
HandlerDef(this.getClass.getClassLoader, "", "controllers.FeaturesReorder", "performance", Nil,"GET", """""", Routes.prefix + """features-reorder/performance"""))
        

// @LINE:55
private[this] lazy val controllers_Nonce1_ThrowExcep42_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Nonce1"))))
private[this] lazy val controllers_Nonce1_ThrowExcep42_invoker = createInvoker(
controllers.Nonce1.ThrowExcep,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Nonce1", "ThrowExcep", Nil,"GET", """""", Routes.prefix + """Nonce1"""))
        

// @LINE:56
private[this] lazy val controllers_Support_main43_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("faq"))))
private[this] lazy val controllers_Support_main43_invoker = createInvoker(
controllers.Nonce1.ThrowExcep1,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Support", "main", Nil,"GET", """""", Routes.prefix + """faq"""))
        

// @LINE:58
private[this] lazy val controllers_Application_blog44_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("blog"))))
private[this] lazy val controllers_Application_blog44_invoker = createInvoker(
controllers.Application.blog,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "blog", Nil,"GET", """""", Routes.prefix + """blog"""))
        

// @LINE:61
private[this] lazy val controllers_Application_redirectS345_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("email/"),DynamicPart("link", """.+""",false))))
private[this] lazy val controllers_Application_redirectS345_invoker = createInvoker(
controllers.Application.redirectS3(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "redirectS3", Seq(classOf[String], classOf[String]),"GET", """ Redirecting to old S3 bucket of www.takipi.com""", Routes.prefix + """email/$link<.+>"""))
        

// @LINE:62
private[this] lazy val controllers_Application_redirectS346_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("email_sigs/"),DynamicPart("link", """.+""",false))))
private[this] lazy val controllers_Application_redirectS346_invoker = createInvoker(
controllers.Application.redirectS3(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "redirectS3", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """email_sigs/$link<.+>"""))
        

// @LINE:63
private[this] lazy val controllers_Application_redirectS347_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("pub/"),DynamicPart("link", """.+""",false))))
private[this] lazy val controllers_Application_redirectS347_invoker = createInvoker(
controllers.Application.redirectS3(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "redirectS3", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """pub/$link<.+>"""))
        

// @LINE:64
private[this] lazy val controllers_Application_redirectS348_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("velocity/"),DynamicPart("link", """.+""",false))))
private[this] lazy val controllers_Application_redirectS348_invoker = createInvoker(
controllers.Application.redirectS3(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "redirectS3", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """velocity/$link<.+>"""))
        

// @LINE:65
private[this] lazy val controllers_Application_redirectS349_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("vid/"),DynamicPart("link", """.+""",false))))
private[this] lazy val controllers_Application_redirectS349_invoker = createInvoker(
controllers.Application.redirectS3(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "redirectS3", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """vid/$link<.+>"""))
        

// @LINE:68
private[this] lazy val controllers_Application_redirectS350_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("images/"),DynamicPart("link", """.+""",false))))
private[this] lazy val controllers_Application_redirectS350_invoker = createInvoker(
controllers.Application.redirectS3(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "redirectS3", Seq(classOf[String], classOf[String]),"GET", """ CCC: Not to be confused with /assets/images""", Routes.prefix + """images/$link<.+>"""))
        

// @LINE:69
private[this] lazy val controllers_Application_redirectS351_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("img/"),DynamicPart("link", """.+""",false))))
private[this] lazy val controllers_Application_redirectS351_invoker = createInvoker(
controllers.Application.redirectS3(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "redirectS3", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """img/$link<.+>"""))
        

// @LINE:71
private[this] lazy val controllers_Features_redirect52_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),DynamicPart("link", """features.html\w*""",false))))
private[this] lazy val controllers_Features_redirect52_invoker = createInvoker(
controllers.Features.redirect(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Features", "redirect", Seq(classOf[String]),"GET", """""", Routes.prefix + """$link<features.html\w*>"""))
        

// @LINE:74
private[this] lazy val controllers_Assets_at53_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at53_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        

// @LINE:76
private[this] lazy val controllers_Assets_at54_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("sitemap.xml"))))
private[this] lazy val controllers_Assets_at54_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """sitemap.xml"""))
        

// @LINE:77
private[this] lazy val controllers_Assets_at55_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("robots.txt"))))
private[this] lazy val controllers_Assets_at55_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """robots.txt"""))
        

// @LINE:78
private[this] lazy val controllers_Assets_at56_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("BingSiteAuth.xml"))))
private[this] lazy val controllers_Assets_at56_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """BingSiteAuth.xml"""))
        

// @LINE:79
private[this] lazy val controllers_Assets_at57_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("google6df9a992524a32e3.html"))))
private[this] lazy val controllers_Assets_at57_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """google6df9a992524a32e3.html"""))
        

// @LINE:82
private[this] lazy val controllers_Application_redirectHtml58_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),DynamicPart("link", """[\w-]*\.html""",false))))
private[this] lazy val controllers_Application_redirectHtml58_invoker = createInvoker(
controllers.Application.redirectHtml(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "redirectHtml", Seq(classOf[String]),"GET", """ Backward compatible - Redirects .html to the new links""", Routes.prefix + """$link<[\w-]*\.html>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.BlueSite.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """freeserver""","""controllers.BlueSite.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """product""","""controllers.BlueSite.product"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """features""","""controllers.BlueSite.features"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """how-it-works""","""controllers.BlueSite.howitworks"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """security""","""controllers.BlueSite.security"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """why-takipi""","""controllers.BlueSite.whytakipi"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """pricing""","""controllers.BlueSite.pricing"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """scala""","""controllers.BlueSite.scala"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """debug-less""","""controllers.BlueSite.debug_less"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """beautiful-exceptions""","""controllers.BlueSite.beautiful_exceptions"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """schedule-demo""","""controllers.BlueSite.schedule_demo"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """for-enterprises""","""controllers.BlueSite.for_enterprises"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """spark""","""controllers.BlueSite.spark"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """no-log-management""","""controllers.BlueSite.no_log_management"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """index-space""","""controllers.Index.space"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ping""","""controllers.Application.ping"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """start""","""controllers.Application.start"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """starting""","""controllers.Application.start"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """monsters""","""controllers.Application.monsters"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """about""","""controllers.Application.about"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """aboutus""","""controllers.Application.aboutus"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sourceattach""","""controllers.Application.sourceattach"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """newrelicold""","""controllers.Application.newrelic"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """newrelic""","""controllers.Application.newrelicnew"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logs""","""controllers.Application.logs"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """jobs""","""controllers.Application.jobs"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """careers""","""controllers.Application.careers"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ad-tech""","""controllers.Application.adtech"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ad-tech/free-server""","""controllers.Application.adtech"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """continuous-integration""","""controllers.Application.ci"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """the-sneaky-bug""","""controllers.Application.sneakybug"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """terms""","""controllers.Application.terms"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """privacy""","""controllers.Application.privacy"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """privacy-policy""","""controllers.Application.privacypolicy"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tos""","""controllers.Application.tos"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """features/main""","""controllers.Features.redirect(link:String = "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """features/performance""","""controllers.Features.performance"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """features/security""","""controllers.Features.security"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """features-reorder""","""controllers.FeaturesReorder.main"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """features-reorder/main""","""controllers.FeaturesReorder.redirect(link:String = "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """features-reorder/performance""","""controllers.FeaturesReorder.performance"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Nonce1""","""controllers.Nonce1.ThrowExcep"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """faq""","""controllers.Nonce1.ThrowExcep1"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """blog""","""controllers.Application.blog"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """email/$link<.+>""","""controllers.Application.redirectS3(folder:String = "email", link:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """email_sigs/$link<.+>""","""controllers.Application.redirectS3(folder:String = "email_sigs", link:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """pub/$link<.+>""","""controllers.Application.redirectS3(folder:String = "pub", link:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """velocity/$link<.+>""","""controllers.Application.redirectS3(folder:String = "velocity", link:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """vid/$link<.+>""","""controllers.Application.redirectS3(folder:String = "vid", link:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """images/$link<.+>""","""controllers.Application.redirectS3(folder:String = "images", link:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """img/$link<.+>""","""controllers.Application.redirectS3(folder:String = "img", link:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """$link<features.html\w*>""","""controllers.Features.redirect(link:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sitemap.xml""","""controllers.Assets.at(path:String = "/public", file:String = "sitemap.xml")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """robots.txt""","""controllers.Assets.at(path:String = "/public", file:String = "robots.xml")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """BingSiteAuth.xml""","""controllers.Assets.at(path:String = "/public", file:String = "BingSiteAuth.xml")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """google6df9a992524a32e3.html""","""controllers.Assets.at(path:String = "/public", file:String = "google6df9a992524a32e3.html")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """$link<[\w-]*\.html>""","""controllers.Application.redirectHtml(link:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:4
case controllers_BlueSite_index0_route(params) => {
   call { 
        controllers_BlueSite_index0_invoker.call(controllers.BlueSite.index)
   }
}
        

// @LINE:5
case controllers_BlueSite_index1_route(params) => {
   call { 
        controllers_BlueSite_index1_invoker.call(controllers.BlueSite.index)
   }
}
        

// @LINE:6
case controllers_BlueSite_product2_route(params) => {
   call { 
        controllers_BlueSite_product2_invoker.call(controllers.BlueSite.product)
   }
}
        

// @LINE:7
case controllers_BlueSite_features3_route(params) => {
   call { 
        controllers_BlueSite_features3_invoker.call(controllers.BlueSite.features)
   }
}
        

// @LINE:8
case controllers_BlueSite_howitworks4_route(params) => {
   call { 
        controllers_BlueSite_howitworks4_invoker.call(controllers.BlueSite.howitworks)
   }
}
        

// @LINE:9
case controllers_BlueSite_security5_route(params) => {
   call { 
        controllers_BlueSite_security5_invoker.call(controllers.BlueSite.security)
   }
}
        

// @LINE:10
case controllers_BlueSite_whytakipi6_route(params) => {
   call { 
        controllers_BlueSite_whytakipi6_invoker.call(controllers.BlueSite.whytakipi)
   }
}
        

// @LINE:11
case controllers_BlueSite_pricing7_route(params) => {
   call { 
        controllers_BlueSite_pricing7_invoker.call(controllers.BlueSite.pricing)
   }
}
        

// @LINE:12
case controllers_BlueSite_scala8_route(params) => {
   call { 
        controllers_BlueSite_scala8_invoker.call(controllers.BlueSite.scala)
   }
}
        

// @LINE:13
case controllers_BlueSite_debug_less9_route(params) => {
   call { 
        controllers_BlueSite_debug_less9_invoker.call(controllers.BlueSite.debug_less)
   }
}
        

// @LINE:14
case controllers_BlueSite_beautiful_exceptions10_route(params) => {
   call { 
        controllers_BlueSite_beautiful_exceptions10_invoker.call(controllers.BlueSite.beautiful_exceptions)
   }
}
        

// @LINE:15
case controllers_BlueSite_schedule_demo11_route(params) => {
   call { 
        controllers_BlueSite_schedule_demo11_invoker.call(controllers.BlueSite.schedule_demo)
   }
}
        

// @LINE:16
case controllers_BlueSite_for_enterprises12_route(params) => {
   call { 
        controllers_BlueSite_for_enterprises12_invoker.call(controllers.BlueSite.for_enterprises)
   }
}
        

// @LINE:17
case controllers_BlueSite_spark13_route(params) => {
   call { 
        controllers_BlueSite_spark13_invoker.call(controllers.BlueSite.spark)
   }
}
        

// @LINE:18
case controllers_BlueSite_no_log_management14_route(params) => {
   call { 
        controllers_BlueSite_no_log_management14_invoker.call(controllers.BlueSite.no_log_management)
   }
}
        

// @LINE:20
case controllers_Index_space15_route(params) => {
   call { 
        controllers_Index_space15_invoker.call(controllers.Index.space)
   }
}
        

// @LINE:22
case controllers_Application_ping16_route(params) => {
   call { 
        controllers_Application_ping16_invoker.call(controllers.Application.ping)
   }
}
        

// @LINE:23
case controllers_Application_start17_route(params) => {
   call { 
        controllers_Application_start17_invoker.call(controllers.Application.start)
   }
}
        

// @LINE:24
case controllers_Application_start18_route(params) => {
   call { 
        controllers_Application_start18_invoker.call(controllers.Application.start)
   }
}
        

// @LINE:25
case controllers_Application_monsters19_route(params) => {
   call { 
        controllers_Application_monsters19_invoker.call(controllers.Application.monsters)
   }
}
        

// @LINE:27
case controllers_Application_about20_route(params) => {
   call { 
        controllers_Application_about20_invoker.call(controllers.Application.about)
   }
}
        

// @LINE:28
case controllers_Application_aboutus21_route(params) => {
   call { 
        controllers_Application_aboutus21_invoker.call(controllers.Application.aboutus)
   }
}
        

// @LINE:29
case controllers_Application_sourceattach22_route(params) => {
   call { 
        controllers_Application_sourceattach22_invoker.call(controllers.Application.sourceattach)
   }
}
        

// @LINE:30
case controllers_Application_newrelic23_route(params) => {
   call { 
        controllers_Application_newrelic23_invoker.call(controllers.Application.newrelic)
   }
}
        

// @LINE:31
case controllers_Application_newrelicnew24_route(params) => {
   call { 
        controllers_Application_newrelicnew24_invoker.call(controllers.Application.newrelicnew)
   }
}
        

// @LINE:32
case controllers_Application_logs25_route(params) => {
   call { 
        controllers_Application_logs25_invoker.call(controllers.Application.logs)
   }
}
        

// @LINE:33
case controllers_Application_jobs26_route(params) => {
   call { 
        controllers_Application_jobs26_invoker.call(controllers.Application.jobs)
   }
}
        

// @LINE:34
case controllers_Application_careers27_route(params) => {
   call { 
        controllers_Application_careers27_invoker.call(controllers.Application.careers)
   }
}
        

// @LINE:35
case controllers_Application_adtech28_route(params) => {
   call { 
        controllers_Application_adtech28_invoker.call(controllers.Application.adtech)
   }
}
        

// @LINE:36
case controllers_Application_adtech29_route(params) => {
   call { 
        controllers_Application_adtech29_invoker.call(controllers.Application.adtech)
   }
}
        

// @LINE:37
case controllers_Application_ci30_route(params) => {
   call { 
        controllers_Application_ci30_invoker.call(controllers.Application.ci)
   }
}
        

// @LINE:38
case controllers_Application_sneakybug31_route(params) => {
   call { 
        controllers_Application_sneakybug31_invoker.call(controllers.Application.sneakybug)
   }
}
        

// @LINE:40
case controllers_Application_terms32_route(params) => {
   call { 
        controllers_Application_terms32_invoker.call(controllers.Application.terms)
   }
}
        

// @LINE:41
case controllers_Application_privacy33_route(params) => {
   call { 
        controllers_Application_privacy33_invoker.call(controllers.Application.privacy)
   }
}
        

// @LINE:42
case controllers_Application_privacypolicy34_route(params) => {
   call { 
        controllers_Application_privacypolicy34_invoker.call(controllers.Application.privacypolicy)
   }
}
        

// @LINE:43
case controllers_Application_tos35_route(params) => {
   call { 
        controllers_Application_tos35_invoker.call(controllers.Application.tos)
   }
}
        

// @LINE:46
case controllers_Features_redirect36_route(params) => {
   call(Param[String]("link", Right(""))) { (link) =>
        controllers_Features_redirect36_invoker.call(controllers.Features.redirect(link))
   }
}
        

// @LINE:47
case controllers_Features_performance37_route(params) => {
   call { 
        controllers_Features_performance37_invoker.call(controllers.Features.performance)
   }
}
        

// @LINE:48
case controllers_Features_security38_route(params) => {
   call { 
        controllers_Features_security38_invoker.call(controllers.Features.security)
   }
}
        

// @LINE:51
case controllers_FeaturesReorder_main39_route(params) => {
   call { 
        controllers_FeaturesReorder_main39_invoker.call(controllers.FeaturesReorder.main)
   }
}
        

// @LINE:52
case controllers_FeaturesReorder_redirect40_route(params) => {
   call(Param[String]("link", Right(""))) { (link) =>
        controllers_FeaturesReorder_redirect40_invoker.call(controllers.FeaturesReorder.redirect(link))
   }
}
        

// @LINE:53
case controllers_FeaturesReorder_performance41_route(params) => {
   call { 
        controllers_FeaturesReorder_performance41_invoker.call(controllers.FeaturesReorder.performance)
   }
}
        

// @LINE:55
case controllers_Nonce1_ThrowExcep42_route(params) => {
   call { 
        controllers_Nonce1_ThrowExcep42_invoker.call(controllers.Nonce1.ThrowExcep)
   }
}
        

// @LINE:56
case controllers_Support_main43_route(params) => {
   call { 
        controllers_Support_main43_invoker.call(controllers.Nonce1.ThrowExcep1)
   }
}
        

// @LINE:58
case controllers_Application_blog44_route(params) => {
   call { 
        controllers_Application_blog44_invoker.call(controllers.Application.blog)
   }
}
        

// @LINE:61
case controllers_Application_redirectS345_route(params) => {
   call(Param[String]("folder", Right("email")), params.fromPath[String]("link", None)) { (folder, link) =>
        controllers_Application_redirectS345_invoker.call(controllers.Application.redirectS3(folder, link))
   }
}
        

// @LINE:62
case controllers_Application_redirectS346_route(params) => {
   call(Param[String]("folder", Right("email_sigs")), params.fromPath[String]("link", None)) { (folder, link) =>
        controllers_Application_redirectS346_invoker.call(controllers.Application.redirectS3(folder, link))
   }
}
        

// @LINE:63
case controllers_Application_redirectS347_route(params) => {
   call(Param[String]("folder", Right("pub")), params.fromPath[String]("link", None)) { (folder, link) =>
        controllers_Application_redirectS347_invoker.call(controllers.Application.redirectS3(folder, link))
   }
}
        

// @LINE:64
case controllers_Application_redirectS348_route(params) => {
   call(Param[String]("folder", Right("velocity")), params.fromPath[String]("link", None)) { (folder, link) =>
        controllers_Application_redirectS348_invoker.call(controllers.Application.redirectS3(folder, link))
   }
}
        

// @LINE:65
case controllers_Application_redirectS349_route(params) => {
   call(Param[String]("folder", Right("vid")), params.fromPath[String]("link", None)) { (folder, link) =>
        controllers_Application_redirectS349_invoker.call(controllers.Application.redirectS3(folder, link))
   }
}
        

// @LINE:68
case controllers_Application_redirectS350_route(params) => {
   call(Param[String]("folder", Right("images")), params.fromPath[String]("link", None)) { (folder, link) =>
        controllers_Application_redirectS350_invoker.call(controllers.Application.redirectS3(folder, link))
   }
}
        

// @LINE:69
case controllers_Application_redirectS351_route(params) => {
   call(Param[String]("folder", Right("img")), params.fromPath[String]("link", None)) { (folder, link) =>
        controllers_Application_redirectS351_invoker.call(controllers.Application.redirectS3(folder, link))
   }
}
        

// @LINE:71
case controllers_Features_redirect52_route(params) => {
   call(params.fromPath[String]("link", None)) { (link) =>
        controllers_Features_redirect52_invoker.call(controllers.Features.redirect(link))
   }
}
        

// @LINE:74
case controllers_Assets_at53_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at53_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:76
case controllers_Assets_at54_route(params) => {
   call(Param[String]("path", Right("/public")), Param[String]("file", Right("sitemap.xml"))) { (path, file) =>
        controllers_Assets_at54_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:77
case controllers_Assets_at55_route(params) => {
   call(Param[String]("path", Right("/public")), Param[String]("file", Right("robots.xml"))) { (path, file) =>
        controllers_Assets_at55_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:78
case controllers_Assets_at56_route(params) => {
   call(Param[String]("path", Right("/public")), Param[String]("file", Right("BingSiteAuth.xml"))) { (path, file) =>
        controllers_Assets_at56_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:79
case controllers_Assets_at57_route(params) => {
   call(Param[String]("path", Right("/public")), Param[String]("file", Right("google6df9a992524a32e3.html"))) { (path, file) =>
        controllers_Assets_at57_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:82
case controllers_Application_redirectHtml58_route(params) => {
   call(params.fromPath[String]("link", None)) { (link) =>
        controllers_Application_redirectHtml58_invoker.call(controllers.Application.redirectHtml(link))
   }
}
        
}

}
     