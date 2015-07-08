// @SOURCE:C:/Lotus/admin/distr/OS/tmp/Downloads/zvenigorod/zvenigorod/conf/routes
// @HASH:ab68d9cd9b06b12d11ef50f1f52aa20605575404
// @DATE:Wed Jul 08 14:19:02 MSK 2015


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

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


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:7
private[this] lazy val controllers_Application_restricted1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("restricted"))))
private[this] lazy val controllers_Application_restricted1_invoker = createInvoker(
controllers.Application.restricted,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "restricted", Nil,"GET", """""", Routes.prefix + """restricted"""))
        

// @LINE:8
private[this] lazy val controllers_Application_jsRoutes2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/javascript/routes.js"))))
private[this] lazy val controllers_Application_jsRoutes2_invoker = createInvoker(
controllers.Application.jsRoutes,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "jsRoutes", Nil,"GET", """""", Routes.prefix + """assets/javascript/routes.js"""))
        

// @LINE:13
private[this] lazy val controllers_Application_admin3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin"))))
private[this] lazy val controllers_Application_admin3_invoker = createInvoker(
controllers.Application.admin(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "admin", Nil,"GET", """Admin page""", Routes.prefix + """admin"""))
        

// @LINE:15
private[this] lazy val controllers_AdminsPosts_create4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/posts/new"))))
private[this] lazy val controllers_AdminsPosts_create4_invoker = createInvoker(
controllers.AdminsPosts.create(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminsPosts", "create", Nil,"GET", """ Add post""", Routes.prefix + """admin/posts/new"""))
        

// @LINE:16
private[this] lazy val controllers_AdminsPosts_save5_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/posts"))))
private[this] lazy val controllers_AdminsPosts_save5_invoker = createInvoker(
controllers.AdminsPosts.save(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminsPosts", "save", Nil,"POST", """""", Routes.prefix + """admin/posts"""))
        

// @LINE:19
private[this] lazy val controllers_AdminsPosts_edit6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/posts/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_AdminsPosts_edit6_invoker = createInvoker(
controllers.AdminsPosts.edit(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminsPosts", "edit", Seq(classOf[Long]),"GET", """ Edit existing post""", Routes.prefix + """admin/posts/$id<[^/]+>"""))
        

// @LINE:20
private[this] lazy val controllers_AdminsPosts_update7_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/posts/"))))
private[this] lazy val controllers_AdminsPosts_update7_invoker = createInvoker(
controllers.AdminsPosts.update(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminsPosts", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """admin/posts/"""))
        

// @LINE:23
private[this] lazy val controllers_AdminsPosts_delete8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/posts/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
private[this] lazy val controllers_AdminsPosts_delete8_invoker = createInvoker(
controllers.AdminsPosts.delete(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AdminsPosts", "delete", Seq(classOf[Long]),"GET", """ Delete existing post
POST        /admin/posts/               controllers.AdminsPosts.delete(id : Long)""", Routes.prefix + """admin/posts/$id<[^/]+>/delete"""))
        

// @LINE:25
private[this] lazy val controllers_Application_show9_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("posts/"),DynamicPart("id", """[0-9]+""",false))))
private[this] lazy val controllers_Application_show9_invoker = createInvoker(
controllers.Application.show(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "show", Seq(classOf[Long]),"GET", """From yabe:""", Routes.prefix + """posts/$id<[0-9]+>"""))
        

// @LINE:26
private[this] lazy val controllers_Application_listTagged10_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("posts/"),DynamicPart("tag", """[^/]+""",true))))
private[this] lazy val controllers_Application_listTagged10_invoker = createInvoker(
controllers.Application.listTagged(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "listTagged", Seq(classOf[String]),"GET", """""", Routes.prefix + """posts/$tag<[^/]+>"""))
        

// @LINE:27
private[this] lazy val controllers_Application_postComment11_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("posts/"),DynamicPart("id", """[^/]+""",true),StaticPart("/comments"))))
private[this] lazy val controllers_Application_postComment11_invoker = createInvoker(
controllers.Application.postComment(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "postComment", Seq(classOf[Long], classOf[String]),"POST", """""", Routes.prefix + """posts/$id<[^/]+>/comments"""))
        

// @LINE:31
private[this] lazy val controllers_Application_profile12_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("profile"))))
private[this] lazy val controllers_Application_profile12_invoker = createInvoker(
controllers.Application.profile,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "profile", Nil,"GET", """""", Routes.prefix + """profile"""))
        

// @LINE:33
private[this] lazy val controllers_Application_login13_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
private[this] lazy val controllers_Application_login13_invoker = createInvoker(
controllers.Application.login,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "login", Nil,"GET", """""", Routes.prefix + """login"""))
        

// @LINE:34
private[this] lazy val controllers_Application_doLogin14_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
private[this] lazy val controllers_Application_doLogin14_invoker = createInvoker(
controllers.Application.doLogin,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "doLogin", Nil,"POST", """""", Routes.prefix + """login"""))
        

// @LINE:36
private[this] lazy val com_feth_play_module_pa_controllers_Authenticate_logout15_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
private[this] lazy val com_feth_play_module_pa_controllers_Authenticate_logout15_invoker = createInvoker(
com.feth.play.module.pa.controllers.Authenticate.logout,
HandlerDef(this.getClass.getClassLoader, "", "com.feth.play.module.pa.controllers.Authenticate", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
        

// @LINE:37
private[this] lazy val com_feth_play_module_pa_controllers_Authenticate_authenticate16_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("authenticate/"),DynamicPart("provider", """[^/]+""",true))))
private[this] lazy val com_feth_play_module_pa_controllers_Authenticate_authenticate16_invoker = createInvoker(
com.feth.play.module.pa.controllers.Authenticate.authenticate(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "com.feth.play.module.pa.controllers.Authenticate", "authenticate", Seq(classOf[String]),"GET", """""", Routes.prefix + """authenticate/$provider<[^/]+>"""))
        

// @LINE:39
private[this] lazy val controllers_Application_signup17_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
private[this] lazy val controllers_Application_signup17_invoker = createInvoker(
controllers.Application.signup,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "signup", Nil,"GET", """""", Routes.prefix + """signup"""))
        

// @LINE:40
private[this] lazy val controllers_Application_doSignup18_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
private[this] lazy val controllers_Application_doSignup18_invoker = createInvoker(
controllers.Application.doSignup,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "doSignup", Nil,"POST", """""", Routes.prefix + """signup"""))
        

// @LINE:42
private[this] lazy val controllers_Signup_unverified19_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/unverified"))))
private[this] lazy val controllers_Signup_unverified19_invoker = createInvoker(
controllers.Signup.unverified,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "unverified", Nil,"GET", """""", Routes.prefix + """accounts/unverified"""))
        

// @LINE:43
private[this] lazy val controllers_Signup_oAuthDenied20_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("authenticate/"),DynamicPart("provider", """[^/]+""",true),StaticPart("/denied"))))
private[this] lazy val controllers_Signup_oAuthDenied20_invoker = createInvoker(
controllers.Signup.oAuthDenied(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "oAuthDenied", Seq(classOf[String]),"GET", """""", Routes.prefix + """authenticate/$provider<[^/]+>/denied"""))
        

// @LINE:45
private[this] lazy val controllers_Signup_verify21_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/verify/"),DynamicPart("token", """[^/]+""",true))))
private[this] lazy val controllers_Signup_verify21_invoker = createInvoker(
controllers.Signup.verify(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "verify", Seq(classOf[String]),"GET", """""", Routes.prefix + """accounts/verify/$token<[^/]+>"""))
        

// @LINE:46
private[this] lazy val controllers_Signup_exists22_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/exists"))))
private[this] lazy val controllers_Signup_exists22_invoker = createInvoker(
controllers.Signup.exists,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "exists", Nil,"GET", """""", Routes.prefix + """accounts/exists"""))
        

// @LINE:48
private[this] lazy val controllers_Signup_resetPassword23_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/password/reset/"),DynamicPart("token", """[^/]+""",true))))
private[this] lazy val controllers_Signup_resetPassword23_invoker = createInvoker(
controllers.Signup.resetPassword(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "resetPassword", Seq(classOf[String]),"GET", """""", Routes.prefix + """accounts/password/reset/$token<[^/]+>"""))
        

// @LINE:49
private[this] lazy val controllers_Signup_doResetPassword24_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/password/reset"))))
private[this] lazy val controllers_Signup_doResetPassword24_invoker = createInvoker(
controllers.Signup.doResetPassword,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "doResetPassword", Nil,"POST", """""", Routes.prefix + """accounts/password/reset"""))
        

// @LINE:51
private[this] lazy val controllers_Account_changePassword25_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/password/change"))))
private[this] lazy val controllers_Account_changePassword25_invoker = createInvoker(
controllers.Account.changePassword,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Account", "changePassword", Nil,"GET", """""", Routes.prefix + """accounts/password/change"""))
        

// @LINE:52
private[this] lazy val controllers_Account_doChangePassword26_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/password/change"))))
private[this] lazy val controllers_Account_doChangePassword26_invoker = createInvoker(
controllers.Account.doChangePassword,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Account", "doChangePassword", Nil,"POST", """""", Routes.prefix + """accounts/password/change"""))
        

// @LINE:54
private[this] lazy val controllers_Account_verifyEmail27_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/verify"))))
private[this] lazy val controllers_Account_verifyEmail27_invoker = createInvoker(
controllers.Account.verifyEmail,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Account", "verifyEmail", Nil,"GET", """""", Routes.prefix + """accounts/verify"""))
        

// @LINE:56
private[this] lazy val controllers_Account_link28_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/add"))))
private[this] lazy val controllers_Account_link28_invoker = createInvoker(
controllers.Account.link,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Account", "link", Nil,"GET", """""", Routes.prefix + """accounts/add"""))
        

// @LINE:58
private[this] lazy val controllers_Account_askLink29_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/link"))))
private[this] lazy val controllers_Account_askLink29_invoker = createInvoker(
controllers.Account.askLink,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Account", "askLink", Nil,"GET", """""", Routes.prefix + """accounts/link"""))
        

// @LINE:59
private[this] lazy val controllers_Account_doLink30_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/link"))))
private[this] lazy val controllers_Account_doLink30_invoker = createInvoker(
controllers.Account.doLink,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Account", "doLink", Nil,"POST", """""", Routes.prefix + """accounts/link"""))
        

// @LINE:61
private[this] lazy val controllers_Account_askMerge31_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/merge"))))
private[this] lazy val controllers_Account_askMerge31_invoker = createInvoker(
controllers.Account.askMerge,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Account", "askMerge", Nil,"GET", """""", Routes.prefix + """accounts/merge"""))
        

// @LINE:62
private[this] lazy val controllers_Account_doMerge32_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/merge"))))
private[this] lazy val controllers_Account_doMerge32_invoker = createInvoker(
controllers.Account.doMerge,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Account", "doMerge", Nil,"POST", """""", Routes.prefix + """accounts/merge"""))
        

// @LINE:64
private[this] lazy val controllers_Signup_forgotPassword33_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login/password/forgot"))))
private[this] lazy val controllers_Signup_forgotPassword33_invoker = createInvoker(
controllers.Signup.forgotPassword(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "forgotPassword", Seq(classOf[String]),"GET", """""", Routes.prefix + """login/password/forgot"""))
        

// @LINE:65
private[this] lazy val controllers_Signup_doForgotPassword34_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login/password/forgot"))))
private[this] lazy val controllers_Signup_doForgotPassword34_invoker = createInvoker(
controllers.Signup.doForgotPassword,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "doForgotPassword", Nil,"POST", """""", Routes.prefix + """login/password/forgot"""))
        

// @LINE:69
private[this] lazy val controllers_Assets_at35_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at35_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path
GET     /assets/images/*file        controllers.CdnAssets.redirImage(path="images/", file)""", Routes.prefix + """assets/$file<.+>"""))
        

// @LINE:70
private[this] lazy val controllers_Assets_at36_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("photo/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at36_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """photo/$file<.+>"""))
        

// @LINE:71
private[this] lazy val controllers_Assets_at37_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("images/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at37_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """images/$file<.+>"""))
        

// @LINE:72
private[this] lazy val controllers_Assets_at38_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("img/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at38_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """img/$file<.+>"""))
        

// @LINE:73
private[this] lazy val controllers_RemoteAssets_at39_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_RemoteAssets_at39_invoker = createInvoker(
controllers.RemoteAssets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RemoteAssets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """assets/$file<.+>"""))
        

// @LINE:74
private[this] lazy val controllers_WebJarAssets_at40_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("webjars/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_WebJarAssets_at40_invoker = createInvoker(
controllers.WebJarAssets.at(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.WebJarAssets", "at", Seq(classOf[String]),"GET", """""", Routes.prefix + """webjars/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """restricted""","""controllers.Application.restricted"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/javascript/routes.js""","""controllers.Application.jsRoutes"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin""","""controllers.Application.admin()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/posts/new""","""controllers.AdminsPosts.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/posts""","""controllers.AdminsPosts.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/posts/$id<[^/]+>""","""controllers.AdminsPosts.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/posts/""","""controllers.AdminsPosts.update(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/posts/$id<[^/]+>/delete""","""controllers.AdminsPosts.delete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """posts/$id<[0-9]+>""","""controllers.Application.show(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """posts/$tag<[^/]+>""","""controllers.Application.listTagged(tag:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """posts/$id<[^/]+>/comments""","""controllers.Application.postComment(id:Long, randomID:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """profile""","""controllers.Application.profile"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.doLogin"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""com.feth.play.module.pa.controllers.Authenticate.logout"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """authenticate/$provider<[^/]+>""","""com.feth.play.module.pa.controllers.Authenticate.authenticate(provider:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.Application.signup"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.Application.doSignup"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/unverified""","""controllers.Signup.unverified"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """authenticate/$provider<[^/]+>/denied""","""controllers.Signup.oAuthDenied(provider:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/verify/$token<[^/]+>""","""controllers.Signup.verify(token:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/exists""","""controllers.Signup.exists"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/password/reset/$token<[^/]+>""","""controllers.Signup.resetPassword(token:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/password/reset""","""controllers.Signup.doResetPassword"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/password/change""","""controllers.Account.changePassword"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/password/change""","""controllers.Account.doChangePassword"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/verify""","""controllers.Account.verifyEmail"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/add""","""controllers.Account.link"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/link""","""controllers.Account.askLink"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/link""","""controllers.Account.doLink"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/merge""","""controllers.Account.askMerge"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/merge""","""controllers.Account.doMerge"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login/password/forgot""","""controllers.Signup.forgotPassword(email:String ?= "")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login/password/forgot""","""controllers.Signup.doForgotPassword"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """photo/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """images/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """img/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.RemoteAssets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """webjars/$file<.+>""","""controllers.WebJarAssets.at(file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index)
   }
}
        

// @LINE:7
case controllers_Application_restricted1_route(params) => {
   call { 
        controllers_Application_restricted1_invoker.call(controllers.Application.restricted)
   }
}
        

// @LINE:8
case controllers_Application_jsRoutes2_route(params) => {
   call { 
        controllers_Application_jsRoutes2_invoker.call(controllers.Application.jsRoutes)
   }
}
        

// @LINE:13
case controllers_Application_admin3_route(params) => {
   call { 
        controllers_Application_admin3_invoker.call(controllers.Application.admin())
   }
}
        

// @LINE:15
case controllers_AdminsPosts_create4_route(params) => {
   call { 
        controllers_AdminsPosts_create4_invoker.call(controllers.AdminsPosts.create())
   }
}
        

// @LINE:16
case controllers_AdminsPosts_save5_route(params) => {
   call { 
        controllers_AdminsPosts_save5_invoker.call(controllers.AdminsPosts.save())
   }
}
        

// @LINE:19
case controllers_AdminsPosts_edit6_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminsPosts_edit6_invoker.call(controllers.AdminsPosts.edit(id))
   }
}
        

// @LINE:20
case controllers_AdminsPosts_update7_route(params) => {
   call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_AdminsPosts_update7_invoker.call(controllers.AdminsPosts.update(id))
   }
}
        

// @LINE:23
case controllers_AdminsPosts_delete8_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminsPosts_delete8_invoker.call(controllers.AdminsPosts.delete(id))
   }
}
        

// @LINE:25
case controllers_Application_show9_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_show9_invoker.call(controllers.Application.show(id))
   }
}
        

// @LINE:26
case controllers_Application_listTagged10_route(params) => {
   call(params.fromPath[String]("tag", None)) { (tag) =>
        controllers_Application_listTagged10_invoker.call(controllers.Application.listTagged(tag))
   }
}
        

// @LINE:27
case controllers_Application_postComment11_route(params) => {
   call(params.fromPath[Long]("id", None), params.fromQuery[String]("randomID", None)) { (id, randomID) =>
        controllers_Application_postComment11_invoker.call(controllers.Application.postComment(id, randomID))
   }
}
        

// @LINE:31
case controllers_Application_profile12_route(params) => {
   call { 
        controllers_Application_profile12_invoker.call(controllers.Application.profile)
   }
}
        

// @LINE:33
case controllers_Application_login13_route(params) => {
   call { 
        controllers_Application_login13_invoker.call(controllers.Application.login)
   }
}
        

// @LINE:34
case controllers_Application_doLogin14_route(params) => {
   call { 
        controllers_Application_doLogin14_invoker.call(controllers.Application.doLogin)
   }
}
        

// @LINE:36
case com_feth_play_module_pa_controllers_Authenticate_logout15_route(params) => {
   call { 
        com_feth_play_module_pa_controllers_Authenticate_logout15_invoker.call(com.feth.play.module.pa.controllers.Authenticate.logout)
   }
}
        

// @LINE:37
case com_feth_play_module_pa_controllers_Authenticate_authenticate16_route(params) => {
   call(params.fromPath[String]("provider", None)) { (provider) =>
        com_feth_play_module_pa_controllers_Authenticate_authenticate16_invoker.call(com.feth.play.module.pa.controllers.Authenticate.authenticate(provider))
   }
}
        

// @LINE:39
case controllers_Application_signup17_route(params) => {
   call { 
        controllers_Application_signup17_invoker.call(controllers.Application.signup)
   }
}
        

// @LINE:40
case controllers_Application_doSignup18_route(params) => {
   call { 
        controllers_Application_doSignup18_invoker.call(controllers.Application.doSignup)
   }
}
        

// @LINE:42
case controllers_Signup_unverified19_route(params) => {
   call { 
        controllers_Signup_unverified19_invoker.call(controllers.Signup.unverified)
   }
}
        

// @LINE:43
case controllers_Signup_oAuthDenied20_route(params) => {
   call(params.fromPath[String]("provider", None)) { (provider) =>
        controllers_Signup_oAuthDenied20_invoker.call(controllers.Signup.oAuthDenied(provider))
   }
}
        

// @LINE:45
case controllers_Signup_verify21_route(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        controllers_Signup_verify21_invoker.call(controllers.Signup.verify(token))
   }
}
        

// @LINE:46
case controllers_Signup_exists22_route(params) => {
   call { 
        controllers_Signup_exists22_invoker.call(controllers.Signup.exists)
   }
}
        

// @LINE:48
case controllers_Signup_resetPassword23_route(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        controllers_Signup_resetPassword23_invoker.call(controllers.Signup.resetPassword(token))
   }
}
        

// @LINE:49
case controllers_Signup_doResetPassword24_route(params) => {
   call { 
        controllers_Signup_doResetPassword24_invoker.call(controllers.Signup.doResetPassword)
   }
}
        

// @LINE:51
case controllers_Account_changePassword25_route(params) => {
   call { 
        controllers_Account_changePassword25_invoker.call(controllers.Account.changePassword)
   }
}
        

// @LINE:52
case controllers_Account_doChangePassword26_route(params) => {
   call { 
        controllers_Account_doChangePassword26_invoker.call(controllers.Account.doChangePassword)
   }
}
        

// @LINE:54
case controllers_Account_verifyEmail27_route(params) => {
   call { 
        controllers_Account_verifyEmail27_invoker.call(controllers.Account.verifyEmail)
   }
}
        

// @LINE:56
case controllers_Account_link28_route(params) => {
   call { 
        controllers_Account_link28_invoker.call(controllers.Account.link)
   }
}
        

// @LINE:58
case controllers_Account_askLink29_route(params) => {
   call { 
        controllers_Account_askLink29_invoker.call(controllers.Account.askLink)
   }
}
        

// @LINE:59
case controllers_Account_doLink30_route(params) => {
   call { 
        controllers_Account_doLink30_invoker.call(controllers.Account.doLink)
   }
}
        

// @LINE:61
case controllers_Account_askMerge31_route(params) => {
   call { 
        controllers_Account_askMerge31_invoker.call(controllers.Account.askMerge)
   }
}
        

// @LINE:62
case controllers_Account_doMerge32_route(params) => {
   call { 
        controllers_Account_doMerge32_invoker.call(controllers.Account.doMerge)
   }
}
        

// @LINE:64
case controllers_Signup_forgotPassword33_route(params) => {
   call(params.fromQuery[String]("email", Some(""))) { (email) =>
        controllers_Signup_forgotPassword33_invoker.call(controllers.Signup.forgotPassword(email))
   }
}
        

// @LINE:65
case controllers_Signup_doForgotPassword34_route(params) => {
   call { 
        controllers_Signup_doForgotPassword34_invoker.call(controllers.Signup.doForgotPassword)
   }
}
        

// @LINE:69
case controllers_Assets_at35_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at35_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:70
case controllers_Assets_at36_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at36_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:71
case controllers_Assets_at37_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at37_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:72
case controllers_Assets_at38_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at38_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:73
case controllers_RemoteAssets_at39_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_RemoteAssets_at39_invoker.call(controllers.RemoteAssets.at(path, file))
   }
}
        

// @LINE:74
case controllers_WebJarAssets_at40_route(params) => {
   call(params.fromPath[String]("file", None)) { (file) =>
        controllers_WebJarAssets_at40_invoker.call(controllers.WebJarAssets.at(file))
   }
}
        
}

}
     