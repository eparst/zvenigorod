
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Lotus/admin/distr/OS/tmp/Downloads/zvenigorod/zvenigorod/conf/routes
// @DATE:Thu Aug 13 12:42:56 MSK 2015

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:36
package com.feth.play.module.pa.controllers {

  // @LINE:36
  class ReverseAuthenticate(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
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