// @SOURCE:C:/Lotus/admin/distr/OS/tmp/Downloads/zvenigorod/zvenigorod/conf/routes
// @HASH:ab68d9cd9b06b12d11ef50f1f52aa20605575404
// @DATE:Wed Jul 08 11:38:17 MSK 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:37
// @LINE:36
package com.feth.play.module.pa.controllers {

// @LINE:37
// @LINE:36
class ReverseAuthenticate {


// @LINE:36
def logout(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                        

// @LINE:37
def authenticate(provider:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "authenticate/" + implicitly[PathBindable[String]].unbind("provider", dynamicString(provider)))
}
                        

}
                          
}
                  

// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:65
// @LINE:64
// @LINE:62
// @LINE:61
// @LINE:59
// @LINE:58
// @LINE:56
// @LINE:54
// @LINE:52
// @LINE:51
// @LINE:49
// @LINE:48
// @LINE:46
// @LINE:45
// @LINE:43
// @LINE:42
// @LINE:40
// @LINE:39
// @LINE:34
// @LINE:33
// @LINE:31
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:13
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
class ReverseAssets {


// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
def at(file:String): Call = {
   (file: @unchecked) match {
// @LINE:69
case (file)  =>
  implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
  Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
                                         
   }
}
                                                

}
                          

// @LINE:74
class ReverseWebJarAssets {


// @LINE:74
def at(file:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "webjars/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:73
class ReverseRemoteAssets {


// @LINE:73
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:15
class ReverseAdminsPosts {


// @LINE:23
def delete(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "admin/posts/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                        

// @LINE:15
def create(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "admin/posts/new")
}
                        

// @LINE:19
def edit(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "admin/posts/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:20
def update(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "admin/posts/" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
}
                        

// @LINE:16
def save(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "admin/posts")
}
                        

}
                          

// @LINE:40
// @LINE:39
// @LINE:34
// @LINE:33
// @LINE:31
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:13
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:26
def listTagged(tag:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "posts/" + implicitly[PathBindable[String]].unbind("tag", dynamicString(tag)))
}
                        

// @LINE:27
def postComment(id:Long, randomID:String): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "posts/" + implicitly[PathBindable[Long]].unbind("id", id) + "/comments" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("randomID", randomID)))))
}
                        

// @LINE:40
def doSignup(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "signup")
}
                        

// @LINE:25
def show(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "posts/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:13
def admin(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "admin")
}
                        

// @LINE:31
def profile(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "profile")
}
                        

// @LINE:8
def jsRoutes(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "assets/javascript/routes.js")
}
                        

// @LINE:39
def signup(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "signup")
}
                        

// @LINE:34
def doLogin(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                        

// @LINE:7
def restricted(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "restricted")
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

// @LINE:33
def login(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                        

}
                          

// @LINE:65
// @LINE:64
// @LINE:49
// @LINE:48
// @LINE:46
// @LINE:45
// @LINE:43
// @LINE:42
class ReverseSignup {


// @LINE:46
def exists(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "accounts/exists")
}
                        

// @LINE:45
def verify(token:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "accounts/verify/" + implicitly[PathBindable[String]].unbind("token", dynamicString(token)))
}
                        

// @LINE:42
def unverified(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "accounts/unverified")
}
                        

// @LINE:43
def oAuthDenied(provider:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "authenticate/" + implicitly[PathBindable[String]].unbind("provider", dynamicString(provider)) + "/denied")
}
                        

// @LINE:48
def resetPassword(token:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "accounts/password/reset/" + implicitly[PathBindable[String]].unbind("token", dynamicString(token)))
}
                        

// @LINE:49
def doResetPassword(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "accounts/password/reset")
}
                        

// @LINE:65
def doForgotPassword(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "login/password/forgot")
}
                        

// @LINE:64
def forgotPassword(email:String = ""): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "login/password/forgot" + queryString(List(if(email == "") None else Some(implicitly[QueryStringBindable[String]].unbind("email", email)))))
}
                        

}
                          

// @LINE:62
// @LINE:61
// @LINE:59
// @LINE:58
// @LINE:56
// @LINE:54
// @LINE:52
// @LINE:51
class ReverseAccount {


// @LINE:61
def askMerge(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "accounts/merge")
}
                        

// @LINE:62
def doMerge(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "accounts/merge")
}
                        

// @LINE:54
def verifyEmail(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "accounts/verify")
}
                        

// @LINE:58
def askLink(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "accounts/link")
}
                        

// @LINE:59
def doLink(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "accounts/link")
}
                        

// @LINE:51
def changePassword(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "accounts/password/change")
}
                        

// @LINE:56
def link(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "accounts/add")
}
                        

// @LINE:52
def doChangePassword(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "accounts/password/change")
}
                        

}
                          
}
                  


// @LINE:37
// @LINE:36
package com.feth.play.module.pa.controllers.javascript {
import ReverseRouteContext.empty

// @LINE:37
// @LINE:36
class ReverseAuthenticate {


// @LINE:36
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "com.feth.play.module.pa.controllers.Authenticate.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:37
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "com.feth.play.module.pa.controllers.Authenticate.authenticate",
   """
      function(provider) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("provider", encodeURIComponent(provider))})
      }
   """
)
                        

}
              
}
        

// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:65
// @LINE:64
// @LINE:62
// @LINE:61
// @LINE:59
// @LINE:58
// @LINE:56
// @LINE:54
// @LINE:52
// @LINE:51
// @LINE:49
// @LINE:48
// @LINE:46
// @LINE:45
// @LINE:43
// @LINE:42
// @LINE:40
// @LINE:39
// @LINE:34
// @LINE:33
// @LINE:31
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:13
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
class ReverseAssets {


// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "photo/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "images/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "img/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      }
   """
)
                        

}
              

// @LINE:74
class ReverseWebJarAssets {


// @LINE:74
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WebJarAssets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "webjars/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:73
class ReverseRemoteAssets {


// @LINE:73
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RemoteAssets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:15
class ReverseAdminsPosts {


// @LINE:23
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AdminsPosts.delete",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/posts/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:15
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AdminsPosts.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/posts/new"})
      }
   """
)
                        

// @LINE:19
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AdminsPosts.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/posts/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:20
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AdminsPosts.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/posts/" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:16
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AdminsPosts.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/posts"})
      }
   """
)
                        

}
              

// @LINE:40
// @LINE:39
// @LINE:34
// @LINE:33
// @LINE:31
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:13
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:26
def listTagged : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.listTagged",
   """
      function(tag) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "posts/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("tag", encodeURIComponent(tag))})
      }
   """
)
                        

// @LINE:27
def postComment : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.postComment",
   """
      function(id,randomID) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "posts/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/comments" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("randomID", randomID)])})
      }
   """
)
                        

// @LINE:40
def doSignup : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.doSignup",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        

// @LINE:25
def show : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.show",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "posts/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:13
def admin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.admin",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin"})
      }
   """
)
                        

// @LINE:31
def profile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.profile",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile"})
      }
   """
)
                        

// @LINE:8
def jsRoutes : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.jsRoutes",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/javascript/routes.js"})
      }
   """
)
                        

// @LINE:39
def signup : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.signup",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        

// @LINE:34
def doLogin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.doLogin",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:7
def restricted : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.restricted",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "restricted"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:33
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

}
              

// @LINE:65
// @LINE:64
// @LINE:49
// @LINE:48
// @LINE:46
// @LINE:45
// @LINE:43
// @LINE:42
class ReverseSignup {


// @LINE:46
def exists : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.exists",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/exists"})
      }
   """
)
                        

// @LINE:45
def verify : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.verify",
   """
      function(token) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/verify/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token))})
      }
   """
)
                        

// @LINE:42
def unverified : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.unverified",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/unverified"})
      }
   """
)
                        

// @LINE:43
def oAuthDenied : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.oAuthDenied",
   """
      function(provider) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("provider", encodeURIComponent(provider)) + "/denied"})
      }
   """
)
                        

// @LINE:48
def resetPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.resetPassword",
   """
      function(token) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/password/reset/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token))})
      }
   """
)
                        

// @LINE:49
def doResetPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.doResetPassword",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/password/reset"})
      }
   """
)
                        

// @LINE:65
def doForgotPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.doForgotPassword",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login/password/forgot"})
      }
   """
)
                        

// @LINE:64
def forgotPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.forgotPassword",
   """
      function(email) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login/password/forgot" + _qS([(email == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email))])})
      }
   """
)
                        

}
              

// @LINE:62
// @LINE:61
// @LINE:59
// @LINE:58
// @LINE:56
// @LINE:54
// @LINE:52
// @LINE:51
class ReverseAccount {


// @LINE:61
def askMerge : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.askMerge",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/merge"})
      }
   """
)
                        

// @LINE:62
def doMerge : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.doMerge",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/merge"})
      }
   """
)
                        

// @LINE:54
def verifyEmail : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.verifyEmail",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/verify"})
      }
   """
)
                        

// @LINE:58
def askLink : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.askLink",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/link"})
      }
   """
)
                        

// @LINE:59
def doLink : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.doLink",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/link"})
      }
   """
)
                        

// @LINE:51
def changePassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.changePassword",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/password/change"})
      }
   """
)
                        

// @LINE:56
def link : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.link",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/add"})
      }
   """
)
                        

// @LINE:52
def doChangePassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.doChangePassword",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/password/change"})
      }
   """
)
                        

}
              
}
        


// @LINE:37
// @LINE:36
package com.feth.play.module.pa.controllers.ref {


// @LINE:37
// @LINE:36
class ReverseAuthenticate {


// @LINE:36
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   com.feth.play.module.pa.controllers.Authenticate.logout(), HandlerDef(this.getClass.getClassLoader, "", "com.feth.play.module.pa.controllers.Authenticate", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:37
def authenticate(provider:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   com.feth.play.module.pa.controllers.Authenticate.authenticate(provider), HandlerDef(this.getClass.getClassLoader, "", "com.feth.play.module.pa.controllers.Authenticate", "authenticate", Seq(classOf[String]), "GET", """""", _prefix + """authenticate/$provider<[^/]+>""")
)
                      

}
                          
}
        

// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:65
// @LINE:64
// @LINE:62
// @LINE:61
// @LINE:59
// @LINE:58
// @LINE:56
// @LINE:54
// @LINE:52
// @LINE:51
// @LINE:49
// @LINE:48
// @LINE:46
// @LINE:45
// @LINE:43
// @LINE:42
// @LINE:40
// @LINE:39
// @LINE:34
// @LINE:33
// @LINE:31
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:13
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
class ReverseAssets {


// @LINE:69
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path
GET     /assets/images/*file        controllers.CdnAssets.redirImage(path="images/", file)""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:74
class ReverseWebJarAssets {


// @LINE:74
def at(file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WebJarAssets.at(file), HandlerDef(this.getClass.getClassLoader, "", "controllers.WebJarAssets", "at", Seq(classOf[String]), "GET", """""", _prefix + """webjars/$file<.+>""")
)
                      

}
                          

// @LINE:73
class ReverseRemoteAssets {


// @LINE:73
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RemoteAssets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.RemoteAssets", "at", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:15
class ReverseAdminsPosts {


// @LINE:23
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AdminsPosts.delete(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminsPosts", "delete", Seq(classOf[Long]), "GET", """ Delete existing post
POST        /admin/posts/               controllers.AdminsPosts.delete(id : Long)""", _prefix + """admin/posts/$id<[^/]+>/delete""")
)
                      

// @LINE:15
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AdminsPosts.create(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminsPosts", "create", Seq(), "GET", """ Add post""", _prefix + """admin/posts/new""")
)
                      

// @LINE:19
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AdminsPosts.edit(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminsPosts", "edit", Seq(classOf[Long]), "GET", """ Edit existing post""", _prefix + """admin/posts/$id<[^/]+>""")
)
                      

// @LINE:20
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AdminsPosts.update(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminsPosts", "update", Seq(classOf[Long]), "POST", """""", _prefix + """admin/posts/""")
)
                      

// @LINE:16
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AdminsPosts.save(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminsPosts", "save", Seq(), "POST", """""", _prefix + """admin/posts""")
)
                      

}
                          

// @LINE:40
// @LINE:39
// @LINE:34
// @LINE:33
// @LINE:31
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:13
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:26
def listTagged(tag:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.listTagged(tag), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "listTagged", Seq(classOf[String]), "GET", """""", _prefix + """posts/$tag<[^/]+>""")
)
                      

// @LINE:27
def postComment(id:Long, randomID:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.postComment(id, randomID), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "postComment", Seq(classOf[Long], classOf[String]), "POST", """""", _prefix + """posts/$id<[^/]+>/comments""")
)
                      

// @LINE:40
def doSignup(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.doSignup(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "doSignup", Seq(), "POST", """""", _prefix + """signup""")
)
                      

// @LINE:25
def show(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.show(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "show", Seq(classOf[Long]), "GET", """From yabe:""", _prefix + """posts/$id<[0-9]+>""")
)
                      

// @LINE:13
def admin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.admin(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "admin", Seq(), "GET", """Admin page""", _prefix + """admin""")
)
                      

// @LINE:31
def profile(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.profile(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "profile", Seq(), "GET", """""", _prefix + """profile""")
)
                      

// @LINE:8
def jsRoutes(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.jsRoutes(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "jsRoutes", Seq(), "GET", """""", _prefix + """assets/javascript/routes.js""")
)
                      

// @LINE:39
def signup(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.signup(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "signup", Seq(), "GET", """""", _prefix + """signup""")
)
                      

// @LINE:34
def doLogin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.doLogin(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "doLogin", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:7
def restricted(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.restricted(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "restricted", Seq(), "GET", """""", _prefix + """restricted""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:33
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "login", Seq(), "GET", """""", _prefix + """login""")
)
                      

}
                          

// @LINE:65
// @LINE:64
// @LINE:49
// @LINE:48
// @LINE:46
// @LINE:45
// @LINE:43
// @LINE:42
class ReverseSignup {


// @LINE:46
def exists(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.exists(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "exists", Seq(), "GET", """""", _prefix + """accounts/exists""")
)
                      

// @LINE:45
def verify(token:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.verify(token), HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "verify", Seq(classOf[String]), "GET", """""", _prefix + """accounts/verify/$token<[^/]+>""")
)
                      

// @LINE:42
def unverified(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.unverified(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "unverified", Seq(), "GET", """""", _prefix + """accounts/unverified""")
)
                      

// @LINE:43
def oAuthDenied(provider:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.oAuthDenied(provider), HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "oAuthDenied", Seq(classOf[String]), "GET", """""", _prefix + """authenticate/$provider<[^/]+>/denied""")
)
                      

// @LINE:48
def resetPassword(token:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.resetPassword(token), HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "resetPassword", Seq(classOf[String]), "GET", """""", _prefix + """accounts/password/reset/$token<[^/]+>""")
)
                      

// @LINE:49
def doResetPassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.doResetPassword(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "doResetPassword", Seq(), "POST", """""", _prefix + """accounts/password/reset""")
)
                      

// @LINE:65
def doForgotPassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.doForgotPassword(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "doForgotPassword", Seq(), "POST", """""", _prefix + """login/password/forgot""")
)
                      

// @LINE:64
def forgotPassword(email:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.forgotPassword(email), HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "forgotPassword", Seq(classOf[String]), "GET", """""", _prefix + """login/password/forgot""")
)
                      

}
                          

// @LINE:62
// @LINE:61
// @LINE:59
// @LINE:58
// @LINE:56
// @LINE:54
// @LINE:52
// @LINE:51
class ReverseAccount {


// @LINE:61
def askMerge(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.askMerge(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Account", "askMerge", Seq(), "GET", """""", _prefix + """accounts/merge""")
)
                      

// @LINE:62
def doMerge(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.doMerge(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Account", "doMerge", Seq(), "POST", """""", _prefix + """accounts/merge""")
)
                      

// @LINE:54
def verifyEmail(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.verifyEmail(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Account", "verifyEmail", Seq(), "GET", """""", _prefix + """accounts/verify""")
)
                      

// @LINE:58
def askLink(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.askLink(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Account", "askLink", Seq(), "GET", """""", _prefix + """accounts/link""")
)
                      

// @LINE:59
def doLink(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.doLink(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Account", "doLink", Seq(), "POST", """""", _prefix + """accounts/link""")
)
                      

// @LINE:51
def changePassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.changePassword(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Account", "changePassword", Seq(), "GET", """""", _prefix + """accounts/password/change""")
)
                      

// @LINE:56
def link(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.link(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Account", "link", Seq(), "GET", """""", _prefix + """accounts/add""")
)
                      

// @LINE:52
def doChangePassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.doChangePassword(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Account", "doChangePassword", Seq(), "POST", """""", _prefix + """accounts/password/change""")
)
                      

}
                          
}
        
    