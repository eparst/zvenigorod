
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/j/2015_10/zvenigorod/conf/routes
// @DATE:Mon Mar 21 02:13:13 MSK 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:69
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:69
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
          }
        
        }
      """
    )
  
    // @LINE:75
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:73
  class ReverseWebJarAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:73
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WebJarAssets.at",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "webjars/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:15
  class ReverseAdminsPosts(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminsPosts.delete",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/posts/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
        }
      """
    )
  
    // @LINE:15
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminsPosts.create",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/posts/new"})
        }
      """
    )
  
    // @LINE:19
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminsPosts.edit",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/posts/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:20
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminsPosts.update",
      """
        function(id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/posts/" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id)])})
        }
      """
    )
  
    // @LINE:16
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminsPosts.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/posts"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def listTagged: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.listTagged",
      """
        function(tag) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "posts/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("tag", encodeURIComponent(tag))})
        }
      """
    )
  
    // @LINE:27
    def postComment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.postComment",
      """
        function(id,randomID) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "posts/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/comments" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("randomID", randomID)])})
        }
      """
    )
  
    // @LINE:40
    def doSignup: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.doSignup",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
    // @LINE:25
    def show: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.show",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "posts/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:13
    def admin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.admin",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin"})
        }
      """
    )
  
    // @LINE:31
    def profile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.profile",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile"})
        }
      """
    )
  
    // @LINE:8
    def jsRoutes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.jsRoutes",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/javascript/routes.js"})
        }
      """
    )
  
    // @LINE:39
    def signup: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.signup",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
    // @LINE:79
    def getIp: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getIp",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ip"})
        }
      """
    )
  
    // @LINE:34
    def doLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.doLogin",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:78
    def users: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.users",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
        }
      """
    )
  
    // @LINE:77
    def photo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.photo",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "photo"})
        }
      """
    )
  
    // @LINE:7
    def restricted: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.restricted",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "restricted"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:33
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:42
  class ReverseSignup(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:46
    def exists: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Signup.exists",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/exists"})
        }
      """
    )
  
    // @LINE:45
    def verify: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Signup.verify",
      """
        function(token) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/verify/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token))})
        }
      """
    )
  
    // @LINE:42
    def unverified: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Signup.unverified",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/unverified"})
        }
      """
    )
  
    // @LINE:43
    def oAuthDenied: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Signup.oAuthDenied",
      """
        function(provider) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("provider", encodeURIComponent(provider)) + "/denied"})
        }
      """
    )
  
    // @LINE:48
    def resetPassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Signup.resetPassword",
      """
        function(token) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/password/reset/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token))})
        }
      """
    )
  
    // @LINE:49
    def doResetPassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Signup.doResetPassword",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/password/reset"})
        }
      """
    )
  
    // @LINE:65
    def doForgotPassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Signup.doForgotPassword",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login/password/forgot"})
        }
      """
    )
  
    // @LINE:64
    def forgotPassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Signup.forgotPassword",
      """
        function(email) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login/password/forgot" + _qS([(email == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email))])})
        }
      """
    )
  
  }

  // @LINE:51
  class ReverseAccount(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:61
    def askMerge: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.askMerge",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/merge"})
        }
      """
    )
  
    // @LINE:62
    def doMerge: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.doMerge",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/merge"})
        }
      """
    )
  
    // @LINE:54
    def verifyEmail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.verifyEmail",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/verify"})
        }
      """
    )
  
    // @LINE:58
    def askLink: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.askLink",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/link"})
        }
      """
    )
  
    // @LINE:59
    def doLink: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.doLink",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/link"})
        }
      """
    )
  
    // @LINE:51
    def changePassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.changePassword",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/password/change"})
        }
      """
    )
  
    // @LINE:56
    def link: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.link",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/add"})
        }
      """
    )
  
    // @LINE:52
    def doChangePassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.doChangePassword",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/password/change"})
        }
      """
    )
  
  }


}