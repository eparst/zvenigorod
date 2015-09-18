
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object comments_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class comments extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Post,List[Comment],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(post: Post, comments: List[Comment]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.39*/("""

"""))
      }
    }
  }

  def render(post:Post,comments:List[Comment]): play.twirl.api.HtmlFormat.Appendable = apply(post,comments)

  def f:((Post,List[Comment]) => play.twirl.api.HtmlFormat.Appendable) = (post,comments) => apply(post,comments)

  def ref: this.type = this

}


}

/**/
object comments extends comments_Scope0.comments
              /*
                  -- GENERATED --
                  DATE: Thu Sep 17 13:28:41 UTC 2015
                  SOURCE: /home/play/zvenigorod/app/views/comments.scala.html
                  HASH: ed4388be92b51eb20bc3d0e4169debc5457395a0
                  MATRIX: 763->1|895->38
                  LINES: 27->1|32->1
                  -- GENERATED --
              */
          