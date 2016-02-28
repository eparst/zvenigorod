
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
         """),_display_(/*33.11*/if(user != null)/*33.27*/{_display_(Seq[Any](format.raw/*33.28*/("""
    """),_display_(/*34.6*/form(routes.Application.postComment(post.id, randomID))/*34.61*/ {_display_(Seq[Any](format.raw/*34.63*/("""
      """),format.raw/*35.7*/("""<fieldset>
      """),_display_(/*36.8*/if(user.isAdmin)/*36.24*/{_display_(Seq[Any](format.raw/*36.25*/("""<a href=""""),_display_(/*36.35*/routes/*36.41*/.AdminsPosts.edit(post.id)),format.raw/*36.67*/("""">edit</a></br>
        <p> <a href=""""),_display_(/*37.23*/routes/*37.29*/.AdminsPosts.delete(post.id)),format.raw/*37.57*/(""""> !delete!</a></p>""")))}),format.raw/*37.77*/("""
        """),format.raw/*38.9*/("""<legend>Post a comment</legend>
"""),format.raw/*48.3*/("""        """),_display_(/*48.12*/textarea(
            commentForm("content"),
            '_label -> "Comment:"
          )),format.raw/*51.12*/("""
          """),format.raw/*59.14*/("""
          """),format.raw/*60.11*/("""<p>
            <input type="submit" value="Send" />
          </p>
      </fieldset>
      			""")))}),format.raw/*64.11*/("""
      			""")))}/*65.11*/else/*65.15*/{_display_(Seq[Any](format.raw/*65.16*/("""
      		"""),format.raw/*66.59*/("""
          """)))}),format.raw/*67.12*/("""
    """)))}),format.raw/*68.6*/("""
    """),format.raw/*69.5*/("""<script type="text/javascript" charset="utf-8">
      $(function() """),format.raw/*70.20*/("""{"""),format.raw/*70.21*/("""
        """),format.raw/*71.9*/("""$('form').click(function() """),format.raw/*71.36*/("""{"""),format.raw/*71.37*/("""
          """),format.raw/*72.11*/("""$('form').expose("""),format.raw/*72.28*/("""{"""),format.raw/*72.29*/("""api: true"""),format.raw/*72.38*/("""}"""),format.raw/*72.39*/(""").load();
        """),format.raw/*73.9*/("""}"""),format.raw/*73.10*/(""");
        
        if($('form .errors').size()) """),format.raw/*75.38*/("""{"""),format.raw/*75.39*/("""
          """),format.raw/*76.11*/("""alert("Screwd\n");
          $('form').expose("""),format.raw/*77.28*/("""{"""),format.raw/*77.29*/("""api: true, loadSpeed: 0"""),format.raw/*77.52*/("""}"""),format.raw/*77.53*/(""").load();
          $('form input[type=text]').get(0).focus();
        """),format.raw/*79.9*/("""}"""),format.raw/*79.10*/("""
      """),format.raw/*80.7*/("""}"""),format.raw/*80.8*/(""");
    </script>
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
                  DATE: Sun Feb 28 19:50:58 MSK 2016
                  SOURCE: C:/j/2015_10/zvenigorod/app/views/show.scala.html
                  HASH: fb9051a70e94b120ba9abe29275d862dc33e7bb8
                  MATRIX: 780->1|1076->84|1103->207|1137->215|1195->275|1230->284|1291->404|1319->406|1344->422|1383->423|1412->859|1444->865|1482->894|1522->896|1556->903|1603->923|1617->928|1653->943|1693->953|1730->964|1779->992|1818->1004|1872->1049|1920->1059|1958->1070|1983->1086|2022->1087|2054->1093|2118->1148|2158->1150|2192->1157|2236->1175|2261->1191|2300->1192|2337->1202|2352->1208|2399->1234|2464->1272|2479->1278|2528->1306|2579->1326|2615->1335|2674->1578|2710->1587|2822->1678|2861->2020|2900->2031|3027->2127|3057->2138|3070->2142|3109->2143|3146->2202|3189->2214|3225->2220|3257->2225|3352->2292|3381->2293|3417->2302|3472->2329|3501->2330|3540->2341|3585->2358|3614->2359|3651->2368|3680->2369|3725->2387|3754->2388|3831->2437|3860->2438|3899->2449|3973->2495|4002->2496|4053->2519|4082->2520|4180->2591|4209->2592|4243->2599|4271->2600|4319->2618|4347->2619
                  LINES: 27->1|34->1|35->5|35->5|36->6|37->7|38->9|39->10|39->10|39->10|40->26|41->27|41->27|41->27|42->28|42->28|42->28|42->28|43->29|45->31|45->31|46->32|46->32|46->32|47->33|47->33|47->33|48->34|48->34|48->34|49->35|50->36|50->36|50->36|50->36|50->36|50->36|51->37|51->37|51->37|51->37|52->38|53->48|53->48|56->51|57->59|58->60|62->64|63->65|63->65|63->65|64->66|65->67|66->68|67->69|68->70|68->70|69->71|69->71|69->71|70->72|70->72|70->72|70->72|70->72|71->73|71->73|73->75|73->75|74->76|75->77|75->77|75->77|75->77|77->79|77->79|78->80|78->80|80->82|81->83
                  -- GENERATED --
              */
          