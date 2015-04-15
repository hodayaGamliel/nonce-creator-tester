// @SOURCE:/Users/takipimbp1/Projects/takipi/test/nonce/scala/conf/routes
// @HASH:56954c7c812a0076fc54783ec78ee11fd88ad9b8
// @DATE:Wed Apr 15 19:19:58 IDT 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:82
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:74
// @LINE:71
// @LINE:69
// @LINE:68
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:58
// @LINE:56
// @LINE:55
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
// @LINE:4
package controllers {

// @LINE:71
// @LINE:48
// @LINE:47
// @LINE:46
class ReverseFeatures {


// @LINE:47
def performance(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "features/performance")
}
                        

// @LINE:48
def security(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "features/security")
}
                        

// @LINE:71
// @LINE:46
def redirect(link:String): Call = {
   (link: @unchecked) match {
// @LINE:46
case (link) if link == "" =>
  implicit val _rrc = new ReverseRouteContext(Map(("link", "")))
  Call("GET", _prefix + { _defaultPrefix } + "features/main")
                                         
// @LINE:71
case (link)  =>
  import ReverseRouteContext.empty
  Call("GET", _prefix + { _defaultPrefix } + implicitly[PathBindable[String]].unbind("link", link))
                                         
   }
}
                                                

}
                          

// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:74
class ReverseAssets {


// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:74
def at(file:String): Call = {
   (file: @unchecked) match {
// @LINE:74
case (file)  =>
  implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
  Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
                                         
// @LINE:76
case (file) if file == "sitemap.xml" =>
  implicit val _rrc = new ReverseRouteContext(Map(("path", "/public"), ("file", "sitemap.xml")))
  Call("GET", _prefix + { _defaultPrefix } + "sitemap.xml")
                                         
// @LINE:77
case (file) if file == "robots.xml" =>
  implicit val _rrc = new ReverseRouteContext(Map(("path", "/public"), ("file", "robots.xml")))
  Call("GET", _prefix + { _defaultPrefix } + "robots.txt")
                                         
// @LINE:78
case (file) if file == "BingSiteAuth.xml" =>
  implicit val _rrc = new ReverseRouteContext(Map(("path", "/public"), ("file", "BingSiteAuth.xml")))
  Call("GET", _prefix + { _defaultPrefix } + "BingSiteAuth.xml")
                                         
// @LINE:79
case (file) if file == "google6df9a992524a32e3.html" =>
  implicit val _rrc = new ReverseRouteContext(Map(("path", "/public"), ("file", "google6df9a992524a32e3.html")))
  Call("GET", _prefix + { _defaultPrefix } + "google6df9a992524a32e3.html")
                                         
   }
}
                                                

}
                          

// @LINE:55
class ReverseNonce1 {


// @LINE:55
def ThrowExcep(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "Nonce1")
}
                        

}
                          

// @LINE:56
class ReverseSupport {


// @LINE:56
def main(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "faq")
}
                        

}
                          

// @LINE:82
// @LINE:69
// @LINE:68
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:58
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
class ReverseApplication {


// @LINE:36
// @LINE:35
def adtech(): Call = {
   () match {
// @LINE:35
case ()  =>
  import ReverseRouteContext.empty
  Call("GET", _prefix + { _defaultPrefix } + "ad-tech")
                                         
   }
}
                                                

// @LINE:58
def blog(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "blog")
}
                        

// @LINE:24
// @LINE:23
def start(): Call = {
   () match {
// @LINE:23
case ()  =>
  import ReverseRouteContext.empty
  Call("GET", _prefix + { _defaultPrefix } + "start")
                                         
   }
}
                                                

// @LINE:22
def ping(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "ping")
}
                        

// @LINE:41
def privacy(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "privacy")
}
                        

// @LINE:30
def newrelic(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "newrelicold")
}
                        

// @LINE:38
def sneakybug(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "the-sneaky-bug")
}
                        

// @LINE:34
def careers(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "careers")
}
                        

// @LINE:27
def about(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "about")
}
                        

// @LINE:82
def redirectHtml(link:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + implicitly[PathBindable[String]].unbind("link", link))
}
                        

// @LINE:37
def ci(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "continuous-integration")
}
                        

// @LINE:69
// @LINE:68
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
def redirectS3(folder:String, link:String): Call = {
   (folder: @unchecked, link: @unchecked) match {
// @LINE:61
case (folder, link) if folder == "email" =>
  implicit val _rrc = new ReverseRouteContext(Map(("folder", "email")))
  Call("GET", _prefix + { _defaultPrefix } + "email/" + implicitly[PathBindable[String]].unbind("link", link))
                                         
// @LINE:62
case (folder, link) if folder == "email_sigs" =>
  implicit val _rrc = new ReverseRouteContext(Map(("folder", "email_sigs")))
  Call("GET", _prefix + { _defaultPrefix } + "email_sigs/" + implicitly[PathBindable[String]].unbind("link", link))
                                         
// @LINE:63
case (folder, link) if folder == "pub" =>
  implicit val _rrc = new ReverseRouteContext(Map(("folder", "pub")))
  Call("GET", _prefix + { _defaultPrefix } + "pub/" + implicitly[PathBindable[String]].unbind("link", link))
                                         
// @LINE:64
case (folder, link) if folder == "velocity" =>
  implicit val _rrc = new ReverseRouteContext(Map(("folder", "velocity")))
  Call("GET", _prefix + { _defaultPrefix } + "velocity/" + implicitly[PathBindable[String]].unbind("link", link))
                                         
// @LINE:65
case (folder, link) if folder == "vid" =>
  implicit val _rrc = new ReverseRouteContext(Map(("folder", "vid")))
  Call("GET", _prefix + { _defaultPrefix } + "vid/" + implicitly[PathBindable[String]].unbind("link", link))
                                         
// @LINE:68
case (folder, link) if folder == "images" =>
  implicit val _rrc = new ReverseRouteContext(Map(("folder", "images")))
  Call("GET", _prefix + { _defaultPrefix } + "images/" + implicitly[PathBindable[String]].unbind("link", link))
                                         
// @LINE:69
case (folder, link) if folder == "img" =>
  implicit val _rrc = new ReverseRouteContext(Map(("folder", "img")))
  Call("GET", _prefix + { _defaultPrefix } + "img/" + implicitly[PathBindable[String]].unbind("link", link))
                                         
   }
}
                                                

// @LINE:29
def sourceattach(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "sourceattach")
}
                        

// @LINE:43
def tos(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "tos")
}
                        

// @LINE:42
def privacypolicy(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "privacy-policy")
}
                        

// @LINE:25
def monsters(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "monsters")
}
                        

// @LINE:40
def terms(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "terms")
}
                        

// @LINE:28
def aboutus(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "aboutus")
}
                        

// @LINE:32
def logs(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "logs")
}
                        

// @LINE:31
def newrelicnew(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "newrelic")
}
                        

// @LINE:33
def jobs(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "jobs")
}
                        

}
                          

// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
// @LINE:4
class ReverseBlueSite {


// @LINE:13
def debug_less(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "debug-less")
}
                        

// @LINE:10
def whytakipi(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "why-takipi")
}
                        

// @LINE:12
def scala(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "scala")
}
                        

// @LINE:8
def howitworks(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "how-it-works")
}
                        

// @LINE:14
def beautiful_exceptions(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "beautiful-exceptions")
}
                        

// @LINE:17
def spark(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "spark")
}
                        

// @LINE:9
def security(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "security")
}
                        

// @LINE:6
def product(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "product")
}
                        

// @LINE:15
def schedule_demo(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "schedule-demo")
}
                        

// @LINE:18
def no_log_management(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "no-log-management")
}
                        

// @LINE:11
def pricing(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "pricing")
}
                        

// @LINE:16
def for_enterprises(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "for-enterprises")
}
                        

// @LINE:5
// @LINE:4
def index(): Call = {
   () match {
// @LINE:4
case ()  =>
  import ReverseRouteContext.empty
  Call("GET", _prefix)
                                         
   }
}
                                                

// @LINE:7
def features(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "features")
}
                        

}
                          

// @LINE:20
class ReverseIndex {


// @LINE:20
def space(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "index-space")
}
                        

}
                          

// @LINE:53
// @LINE:52
// @LINE:51
class ReverseFeaturesReorder {


// @LINE:53
def performance(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "features-reorder/performance")
}
                        

// @LINE:51
def main(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "features-reorder")
}
                        

// @LINE:52
def redirect(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("link", "")))
   Call("GET", _prefix + { _defaultPrefix } + "features-reorder/main")
}
                        

}
                          
}
                  


// @LINE:82
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:74
// @LINE:71
// @LINE:69
// @LINE:68
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:58
// @LINE:56
// @LINE:55
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
// @LINE:4
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:71
// @LINE:48
// @LINE:47
// @LINE:46
class ReverseFeatures {


// @LINE:47
def performance : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Features.performance",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "features/performance"})
      }
   """
)
                        

// @LINE:48
def security : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Features.security",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "features/security"})
      }
   """
)
                        

// @LINE:71
// @LINE:46
def redirect : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Features.redirect",
   """
      function(link) {
      if (link == """ + implicitly[JavascriptLitteral[String]].to("") + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "features/main"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("link", link)})
      }
      }
   """
)
                        

}
              

// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:74
class ReverseAssets {


// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:74
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      if (file == """ + implicitly[JavascriptLitteral[String]].to("sitemap.xml") + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sitemap.xml"})
      }
      if (file == """ + implicitly[JavascriptLitteral[String]].to("robots.xml") + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "robots.txt"})
      }
      if (file == """ + implicitly[JavascriptLitteral[String]].to("BingSiteAuth.xml") + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "BingSiteAuth.xml"})
      }
      if (file == """ + implicitly[JavascriptLitteral[String]].to("google6df9a992524a32e3.html") + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "google6df9a992524a32e3.html"})
      }
      }
   """
)
                        

}
              

// @LINE:55
class ReverseNonce1 {


// @LINE:55
def ThrowExcep : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Nonce1.ThrowExcep",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Nonce1"})
      }
   """
)
                        

}
              

// @LINE:56
class ReverseSupport {


// @LINE:56
def main : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Nonce1.ThrowExcep1",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "faq"})
      }
   """
)
                        

}
              

// @LINE:82
// @LINE:69
// @LINE:68
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:58
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
class ReverseApplication {


// @LINE:36
// @LINE:35
def adtech : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.adtech",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ad-tech"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ad-tech/free-server"})
      }
      }
   """
)
                        

// @LINE:58
def blog : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.blog",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "blog"})
      }
   """
)
                        

// @LINE:24
// @LINE:23
def start : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.start",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "start"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "starting"})
      }
      }
   """
)
                        

// @LINE:22
def ping : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.ping",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ping"})
      }
   """
)
                        

// @LINE:41
def privacy : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.privacy",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "privacy"})
      }
   """
)
                        

// @LINE:30
def newrelic : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.newrelic",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "newrelicold"})
      }
   """
)
                        

// @LINE:38
def sneakybug : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.sneakybug",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "the-sneaky-bug"})
      }
   """
)
                        

// @LINE:34
def careers : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.careers",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "careers"})
      }
   """
)
                        

// @LINE:27
def about : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.about",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "about"})
      }
   """
)
                        

// @LINE:82
def redirectHtml : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.redirectHtml",
   """
      function(link) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("link", link)})
      }
   """
)
                        

// @LINE:37
def ci : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.ci",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "continuous-integration"})
      }
   """
)
                        

// @LINE:69
// @LINE:68
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
def redirectS3 : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.redirectS3",
   """
      function(folder, link) {
      if (folder == """ + implicitly[JavascriptLitteral[String]].to("email") + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "email/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("link", link)})
      }
      if (folder == """ + implicitly[JavascriptLitteral[String]].to("email_sigs") + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "email_sigs/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("link", link)})
      }
      if (folder == """ + implicitly[JavascriptLitteral[String]].to("pub") + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pub/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("link", link)})
      }
      if (folder == """ + implicitly[JavascriptLitteral[String]].to("velocity") + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "velocity/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("link", link)})
      }
      if (folder == """ + implicitly[JavascriptLitteral[String]].to("vid") + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "vid/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("link", link)})
      }
      if (folder == """ + implicitly[JavascriptLitteral[String]].to("images") + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "images/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("link", link)})
      }
      if (folder == """ + implicitly[JavascriptLitteral[String]].to("img") + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "img/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("link", link)})
      }
      }
   """
)
                        

// @LINE:29
def sourceattach : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.sourceattach",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sourceattach"})
      }
   """
)
                        

// @LINE:43
def tos : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.tos",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tos"})
      }
   """
)
                        

// @LINE:42
def privacypolicy : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.privacypolicy",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "privacy-policy"})
      }
   """
)
                        

// @LINE:25
def monsters : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.monsters",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "monsters"})
      }
   """
)
                        

// @LINE:40
def terms : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.terms",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "terms"})
      }
   """
)
                        

// @LINE:28
def aboutus : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.aboutus",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "aboutus"})
      }
   """
)
                        

// @LINE:32
def logs : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logs",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logs"})
      }
   """
)
                        

// @LINE:31
def newrelicnew : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.newrelicnew",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "newrelic"})
      }
   """
)
                        

// @LINE:33
def jobs : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.jobs",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "jobs"})
      }
   """
)
                        

}
              

// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
// @LINE:4
class ReverseBlueSite {


// @LINE:13
def debug_less : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BlueSite.debug_less",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "debug-less"})
      }
   """
)
                        

// @LINE:10
def whytakipi : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BlueSite.whytakipi",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "why-takipi"})
      }
   """
)
                        

// @LINE:12
def scala : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BlueSite.scala",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "scala"})
      }
   """
)
                        

// @LINE:8
def howitworks : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BlueSite.howitworks",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "how-it-works"})
      }
   """
)
                        

// @LINE:14
def beautiful_exceptions : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BlueSite.beautiful_exceptions",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "beautiful-exceptions"})
      }
   """
)
                        

// @LINE:17
def spark : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BlueSite.spark",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "spark"})
      }
   """
)
                        

// @LINE:9
def security : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BlueSite.security",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "security"})
      }
   """
)
                        

// @LINE:6
def product : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BlueSite.product",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "product"})
      }
   """
)
                        

// @LINE:15
def schedule_demo : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BlueSite.schedule_demo",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "schedule-demo"})
      }
   """
)
                        

// @LINE:18
def no_log_management : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BlueSite.no_log_management",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "no-log-management"})
      }
   """
)
                        

// @LINE:11
def pricing : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BlueSite.pricing",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pricing"})
      }
   """
)
                        

// @LINE:16
def for_enterprises : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BlueSite.for_enterprises",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "for-enterprises"})
      }
   """
)
                        

// @LINE:5
// @LINE:4
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BlueSite.index",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "freeserver"})
      }
      }
   """
)
                        

// @LINE:7
def features : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BlueSite.features",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "features"})
      }
   """
)
                        

}
              

// @LINE:20
class ReverseIndex {


// @LINE:20
def space : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Index.space",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "index-space"})
      }
   """
)
                        

}
              

// @LINE:53
// @LINE:52
// @LINE:51
class ReverseFeaturesReorder {


// @LINE:53
def performance : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FeaturesReorder.performance",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "features-reorder/performance"})
      }
   """
)
                        

// @LINE:51
def main : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FeaturesReorder.main",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "features-reorder"})
      }
   """
)
                        

// @LINE:52
def redirect : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FeaturesReorder.redirect",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "features-reorder/main"})
      }
   """
)
                        

}
              
}
        


// @LINE:82
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:74
// @LINE:71
// @LINE:69
// @LINE:68
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:58
// @LINE:56
// @LINE:55
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
// @LINE:4
package controllers.ref {


// @LINE:71
// @LINE:48
// @LINE:47
// @LINE:46
class ReverseFeatures {


// @LINE:47
def performance(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Features.performance(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Features", "performance", Seq(), "GET", """""", _prefix + """features/performance""")
)
                      

// @LINE:48
def security(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Features.security(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Features", "security", Seq(), "GET", """""", _prefix + """features/security""")
)
                      

// @LINE:46
def redirect(link:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Features.redirect(link), HandlerDef(this.getClass.getClassLoader, "", "controllers.Features", "redirect", Seq(classOf[String]), "GET", """ Features""", _prefix + """features/main""")
)
                      

}
                          

// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:74
class ReverseAssets {


// @LINE:74
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:55
class ReverseNonce1 {


// @LINE:55
def ThrowExcep(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Nonce1.ThrowExcep(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Nonce1", "ThrowExcep", Seq(), "GET", """""", _prefix + """Nonce1""")
)
                      

}
                          

// @LINE:56
class ReverseSupport {


// @LINE:56
def main(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Nonce1.ThrowExcep1(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Support", "main", Seq(), "GET", """""", _prefix + """faq""")
)
                      

}
                          

// @LINE:82
// @LINE:69
// @LINE:68
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:58
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
class ReverseApplication {


// @LINE:35
def adtech(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.adtech(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "adtech", Seq(), "GET", """""", _prefix + """ad-tech""")
)
                      

// @LINE:58
def blog(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.blog(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "blog", Seq(), "GET", """""", _prefix + """blog""")
)
                      

// @LINE:23
def start(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.start(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "start", Seq(), "GET", """""", _prefix + """start""")
)
                      

// @LINE:22
def ping(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.ping(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "ping", Seq(), "GET", """""", _prefix + """ping""")
)
                      

// @LINE:41
def privacy(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.privacy(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "privacy", Seq(), "GET", """""", _prefix + """privacy""")
)
                      

// @LINE:30
def newrelic(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.newrelic(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "newrelic", Seq(), "GET", """""", _prefix + """newrelicold""")
)
                      

// @LINE:38
def sneakybug(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.sneakybug(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "sneakybug", Seq(), "GET", """""", _prefix + """the-sneaky-bug""")
)
                      

// @LINE:34
def careers(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.careers(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "careers", Seq(), "GET", """""", _prefix + """careers""")
)
                      

// @LINE:27
def about(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.about(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "about", Seq(), "GET", """ GET	/scala								controllers.Application.scala""", _prefix + """about""")
)
                      

// @LINE:82
def redirectHtml(link:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.redirectHtml(link), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "redirectHtml", Seq(classOf[String]), "GET", """ Backward compatible - Redirects .html to the new links""", _prefix + """$link<[\w-]*\.html>""")
)
                      

// @LINE:37
def ci(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.ci(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "ci", Seq(), "GET", """""", _prefix + """continuous-integration""")
)
                      

// @LINE:61
def redirectS3(folder:String, link:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.redirectS3(folder, link), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "redirectS3", Seq(classOf[String], classOf[String]), "GET", """ Redirecting to old S3 bucket of www.takipi.com""", _prefix + """email/$link<.+>""")
)
                      

// @LINE:29
def sourceattach(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.sourceattach(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "sourceattach", Seq(), "GET", """""", _prefix + """sourceattach""")
)
                      

// @LINE:43
def tos(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.tos(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "tos", Seq(), "GET", """""", _prefix + """tos""")
)
                      

// @LINE:42
def privacypolicy(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.privacypolicy(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "privacypolicy", Seq(), "GET", """""", _prefix + """privacy-policy""")
)
                      

// @LINE:25
def monsters(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.monsters(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "monsters", Seq(), "GET", """""", _prefix + """monsters""")
)
                      

// @LINE:40
def terms(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.terms(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "terms", Seq(), "GET", """""", _prefix + """terms""")
)
                      

// @LINE:28
def aboutus(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.aboutus(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "aboutus", Seq(), "GET", """""", _prefix + """aboutus""")
)
                      

// @LINE:32
def logs(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logs(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "logs", Seq(), "GET", """""", _prefix + """logs""")
)
                      

// @LINE:31
def newrelicnew(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.newrelicnew(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "newrelicnew", Seq(), "GET", """""", _prefix + """newrelic""")
)
                      

// @LINE:33
def jobs(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.jobs(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "jobs", Seq(), "GET", """""", _prefix + """jobs""")
)
                      

}
                          

// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
// @LINE:4
class ReverseBlueSite {


// @LINE:13
def debug_less(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BlueSite.debug_less(), HandlerDef(this.getClass.getClassLoader, "", "controllers.BlueSite", "debug_less", Seq(), "GET", """""", _prefix + """debug-less""")
)
                      

// @LINE:10
def whytakipi(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BlueSite.whytakipi(), HandlerDef(this.getClass.getClassLoader, "", "controllers.BlueSite", "whytakipi", Seq(), "GET", """""", _prefix + """why-takipi""")
)
                      

// @LINE:12
def scala(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BlueSite.scala(), HandlerDef(this.getClass.getClassLoader, "", "controllers.BlueSite", "scala", Seq(), "GET", """""", _prefix + """scala""")
)
                      

// @LINE:8
def howitworks(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BlueSite.howitworks(), HandlerDef(this.getClass.getClassLoader, "", "controllers.BlueSite", "howitworks", Seq(), "GET", """""", _prefix + """how-it-works""")
)
                      

// @LINE:14
def beautiful_exceptions(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BlueSite.beautiful_exceptions(), HandlerDef(this.getClass.getClassLoader, "", "controllers.BlueSite", "beautiful_exceptions", Seq(), "GET", """""", _prefix + """beautiful-exceptions""")
)
                      

// @LINE:17
def spark(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BlueSite.spark(), HandlerDef(this.getClass.getClassLoader, "", "controllers.BlueSite", "spark", Seq(), "GET", """""", _prefix + """spark""")
)
                      

// @LINE:9
def security(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BlueSite.security(), HandlerDef(this.getClass.getClassLoader, "", "controllers.BlueSite", "security", Seq(), "GET", """""", _prefix + """security""")
)
                      

// @LINE:6
def product(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BlueSite.product(), HandlerDef(this.getClass.getClassLoader, "", "controllers.BlueSite", "product", Seq(), "GET", """""", _prefix + """product""")
)
                      

// @LINE:15
def schedule_demo(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BlueSite.schedule_demo(), HandlerDef(this.getClass.getClassLoader, "", "controllers.BlueSite", "schedule_demo", Seq(), "GET", """""", _prefix + """schedule-demo""")
)
                      

// @LINE:18
def no_log_management(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BlueSite.no_log_management(), HandlerDef(this.getClass.getClassLoader, "", "controllers.BlueSite", "no_log_management", Seq(), "GET", """""", _prefix + """no-log-management""")
)
                      

// @LINE:11
def pricing(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BlueSite.pricing(), HandlerDef(this.getClass.getClassLoader, "", "controllers.BlueSite", "pricing", Seq(), "GET", """""", _prefix + """pricing""")
)
                      

// @LINE:16
def for_enterprises(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BlueSite.for_enterprises(), HandlerDef(this.getClass.getClassLoader, "", "controllers.BlueSite", "for_enterprises", Seq(), "GET", """""", _prefix + """for-enterprises""")
)
                      

// @LINE:4
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BlueSite.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.BlueSite", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:7
def features(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BlueSite.features(), HandlerDef(this.getClass.getClassLoader, "", "controllers.BlueSite", "features", Seq(), "GET", """""", _prefix + """features""")
)
                      

}
                          

// @LINE:20
class ReverseIndex {


// @LINE:20
def space(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Index.space(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Index", "space", Seq(), "GET", """""", _prefix + """index-space""")
)
                      

}
                          

// @LINE:53
// @LINE:52
// @LINE:51
class ReverseFeaturesReorder {


// @LINE:53
def performance(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FeaturesReorder.performance(), HandlerDef(this.getClass.getClassLoader, "", "controllers.FeaturesReorder", "performance", Seq(), "GET", """""", _prefix + """features-reorder/performance""")
)
                      

// @LINE:51
def main(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FeaturesReorder.main(), HandlerDef(this.getClass.getClassLoader, "", "controllers.FeaturesReorder", "main", Seq(), "GET", """ Features - reorder""", _prefix + """features-reorder""")
)
                      

// @LINE:52
def redirect(link:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FeaturesReorder.redirect(link), HandlerDef(this.getClass.getClassLoader, "", "controllers.FeaturesReorder", "redirect", Seq(classOf[String]), "GET", """""", _prefix + """features-reorder/main""")
)
                      

}
                          
}
        
    