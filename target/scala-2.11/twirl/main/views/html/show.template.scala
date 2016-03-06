
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object show_Scope0 {
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

class show extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Post,Form[CommentForm],String,javasape.Sape,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(post: Post, commentForm: Form[CommentForm], randomID: String, sape: javasape.Sape):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import be.objectify.deadbolt.java.views.html._
import be.objectify.deadbolt.core.utils.TemplateUtils._

Seq[Any](format.raw/*1.85*/("""
"""),format.raw/*5.1*/("""        """),format.raw/*5.9*/("""<div class="container">
       """),format.raw/*6.37*/("""
        """),format.raw/*7.9*/("""</div> <!-- jumbotron --> 
       """),format.raw/*9.60*/("""
"""),_display_(/*10.2*/main(post.title)/*10.18*/{_display_(Seq[Any](format.raw/*10.19*/("""
  """),_display_(/*11.4*/if(flash.contains("success"))/*11.33*/ {_display_(Seq[Any](format.raw/*11.35*/("""
      """),format.raw/*12.7*/("""<p class="success">"""),_display_(/*12.27*/flash/*12.32*/.get("success")),format.raw/*12.47*/("""</p>
    """)))}),format.raw/*13.6*/("""
    
    """),_display_(/*15.6*/display(post, mode = "full")),format.raw/*15.34*/("""
         
""")))}),format.raw/*17.2*/("""
"""),format.raw/*18.1*/("""</div> <!-- container --> 
"""))
      }
    }
  }

  def render(post:Post,commentForm:Form[CommentForm],randomID:String,sape:javasape.Sape): play.twirl.api.HtmlFormat.Appendable = apply(post,commentForm,randomID,sape)

  def f:((Post,Form[CommentForm],String,javasape.Sape) => play.twirl.api.HtmlFormat.Appendable) = (post,commentForm,randomID,sape) => apply(post,commentForm,randomID,sape)

  def ref: this.type = this

}


}

/**/
object show extends show_Scope0.show
              /*
                  -- GENERATED --
                  DATE: Sun Mar 06 13:40:57 MSK 2016
                  SOURCE: C:/j/2015_10/zvenigorod/app/views/show.scala.html
                  HASH: 89292e8b49aa53f6feadee4ee134d3202fdf75f6
                  MATRIX: 780->1|1076->84|1103->207|1137->215|1195->275|1230->284|1291->404|1319->406|1344->422|1383->423|1413->427|1451->456|1491->458|1525->465|1572->485|1586->490|1622->505|1662->515|1699->526|1748->554|1790->566|1818->567
                  LINES: 27->1|34->1|35->5|35->5|36->6|37->7|38->9|39->10|39->10|39->10|40->11|40->11|40->11|41->12|41->12|41->12|41->12|42->13|44->15|44->15|46->17|47->18
                  -- GENERATED --
              */
          