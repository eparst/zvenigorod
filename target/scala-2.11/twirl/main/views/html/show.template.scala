
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
"""),format.raw/*26.13*/("""
    """),_display_(/*27.6*/if(flash.contains("success"))/*27.35*/ {_display_(Seq[Any](format.raw/*27.37*/("""
      """),format.raw/*28.7*/("""<p class="success">"""),_display_(/*28.27*/flash/*28.32*/.get("success")),format.raw/*28.47*/("""</p>
    """)))}),format.raw/*29.6*/("""
    
    """),_display_(/*31.6*/display(post, mode = "full")),format.raw/*31.34*/("""
          """),_display_(/*32.12*/defining(Application.getLocalUser(session()))/*32.57*/ { user =>_display_(Seq[Any](format.raw/*32.67*/("""
         """),_display_(/*33.11*/if(user.isAdmin)/*33.27*/{_display_(Seq[Any](format.raw/*33.50*/("""
    """),_display_(/*34.6*/form(routes.Application.postComment(post.id, randomID))/*34.61*/ {_display_(Seq[Any](format.raw/*34.63*/("""
    """),format.raw/*51.14*/(""" 
          """),format.raw/*63.20*/("""
      			""")))}),format.raw/*64.11*/("""
      			""")))}/*65.11*/else/*65.15*/{_display_(Seq[Any](format.raw/*65.16*/("""
      		"""),format.raw/*66.59*/("""
          """)))}),format.raw/*67.12*/("""
    """)))}),format.raw/*68.6*/("""
   """),format.raw/*81.16*/("""
""")))}),format.raw/*82.2*/("""
"""),format.raw/*83.1*/("""</div> <!-- container --> 
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
                  DATE: Tue Mar 01 23:58:03 MSK 2016
                  SOURCE: C:/j/2015_10/zvenigorod/app/views/show.scala.html
                  HASH: 9e43c35d720c0e4e98826533e361cc90e0967e54
                  MATRIX: 780->1|1076->84|1103->207|1137->215|1195->275|1230->284|1291->404|1319->406|1344->422|1383->423|1412->859|1444->865|1482->894|1522->896|1556->903|1603->923|1617->928|1653->943|1693->953|1730->964|1779->992|1818->1004|1872->1049|1920->1059|1958->1070|1983->1086|2022->1109|2054->1115|2118->1170|2158->1172|2191->1699|2231->2138|2273->2149|2303->2160|2316->2164|2355->2165|2392->2224|2435->2236|2471->2242|2503->2642|2535->2644|2563->2645
                  LINES: 27->1|34->1|35->5|35->5|36->6|37->7|38->9|39->10|39->10|39->10|40->26|41->27|41->27|41->27|42->28|42->28|42->28|42->28|43->29|45->31|45->31|46->32|46->32|46->32|47->33|47->33|47->33|48->34|48->34|48->34|49->51|50->63|51->64|52->65|52->65|52->65|53->66|54->67|55->68|56->81|57->82|58->83
                  -- GENERATED --
              */
          