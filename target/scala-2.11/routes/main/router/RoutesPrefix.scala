
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/j/2015_10/zvenigorod/conf/routes
// @DATE:Sun Mar 06 13:40:56 MSK 2016


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
