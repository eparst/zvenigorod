
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/j/2015_10/zvenigorod/conf/routes
// @DATE:Sun Mar 06 01:00:16 MSK 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:36
package com.feth.play.module.pa.controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:36
  class ReverseAuthenticate(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:36
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.feth.play.module.pa.controllers.Authenticate.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:37
    def authenticate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.feth.play.module.pa.controllers.Authenticate.authenticate",
      """
        function(provider) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("provider", encodeURIComponent(provider))})
        }
      """
    )
  
  }


}