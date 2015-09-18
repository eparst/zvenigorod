
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/play/zvenigorod/conf/routes
// @DATE:Thu Sep 17 13:28:59 UTC 2015


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
