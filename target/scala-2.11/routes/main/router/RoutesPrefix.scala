
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Lotus/admin/distr/OS/tmp/Downloads/zvenigorod/zvenigorod/conf/routes
// @DATE:Thu Aug 13 12:42:56 MSK 2015


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
