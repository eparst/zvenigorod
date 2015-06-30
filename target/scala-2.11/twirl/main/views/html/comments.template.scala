
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object comments extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Post,List[Comment],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(post: Post, comments: List[Comment]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.39*/("""

"""))}
  }

  def render(post:Post,comments:List[Comment]): play.twirl.api.HtmlFormat.Appendable = apply(post,comments)

  def f:((Post,List[Comment]) => play.twirl.api.HtmlFormat.Appendable) = (post,comments) => apply(post,comments)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jun 30 16:53:11 MSK 2015
                  SOURCE: C:/Lotus/admin/distr/OS/tmp/Downloads/zvenigorod/zvenigorod/app/views/comments.scala.html
                  HASH: 1624836b6ca94f71fadd4058da1581b31fb91828
                  MATRIX: 738->1|863->38
                  LINES: 26->1|29->1
                  -- GENERATED --
              */
          