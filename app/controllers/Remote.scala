package controllers

import org.joda.time.DateTimeZone
import org.joda.time.format.DateTimeFormat
import org.joda.time.format.DateTimeFormatter
import play.api.Play
import play.api.Play.current
import play.api.mvc.Action
import play.api.mvc.AnyContent
import play.api.mvc.Call
import play.api.mvc.Controller
import play.api.mvc.SimpleResult
import java.util.Date
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import scala.concurrent.duration._
import scala.concurrent.Future

trait Remote extends Controller {

  private val timeZoneCode = "GMT"

  private val df: DateTimeFormatter =
    DateTimeFormat.forPattern("EEE, dd MMM yyyy HH:mm:ss '"+timeZoneCode+"'").withLocale(java.util.Locale.ENGLISH).withZone(DateTimeZone.forID(timeZoneCode))

  type ResultWithHeaders = SimpleResult { def withHeaders(headers: (String, String)*): SimpleResult }

//  def at(path: String, file: String): Action[AnyContent] = Action { request =>
  def at(path: String, file: String): Action[AnyContent] = Action.async { request =>
    val action = Assets.at(path, file)
/*    val result = action.apply(request)
    val resultWithHeaders = result.asInstanceOf[ResultWithHeaders]
    resultWithHeaders.withHeaders(DATE -> df.print((new Date).getTime))*/
    action.apply(request).map( result => {
      val resultWithHeaders = result.asInstanceOf[ResultWithHeaders]
      resultWithHeaders.withHeaders(DATE -> df.print((new Date).getTime))
    })
  }

  def url(file: String) = {
    Play.configuration.getString("cdn-url") match {
      case Some(contentUrl) => "http://zv-cdn.appspot.com/static/zv/" + call(file).url
      case None => "http://zv-cdn.appspot.com/static/zv/" +  call(file)
    }

  }

  def call(file: String): Call
}