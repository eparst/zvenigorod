
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
        <div class="jumbotron" >
        </div> <!-- jumbotron --> 
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
      			"""),format.raw/*66.10*/("""<p>Posting only for regestered users.... </p>
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
                  DATE: Tue Feb 23 01:16:04 MSK 2016
                  SOURCE: C:/j/2015_10/zvenigorod/app/views/show.scala.html
                  HASH: 7c084fc585a8c15f5bf09aadc39b7dba0f1e1aae
                  MATRIX: 780->1|1076->84|1103->207|1137->215|1263->400|1291->402|1316->418|1355->419|1384->855|1416->861|1454->890|1494->892|1528->899|1575->919|1589->924|1625->939|1665->949|1702->960|1751->988|1790->1000|1844->1045|1892->1055|1930->1066|1955->1082|1994->1083|2026->1089|2090->1144|2130->1146|2164->1153|2208->1171|2233->1187|2272->1188|2309->1198|2324->1204|2371->1230|2436->1268|2451->1274|2500->1302|2551->1322|2587->1331|2646->1574|2682->1583|2794->1674|2833->2016|2872->2027|2999->2123|3029->2134|3042->2138|3081->2139|3119->2149|3207->2206|3243->2212|3275->2217|3370->2284|3399->2285|3435->2294|3490->2321|3519->2322|3558->2333|3603->2350|3632->2351|3669->2360|3698->2361|3743->2379|3772->2380|3849->2429|3878->2430|3917->2441|3991->2487|4020->2488|4071->2511|4100->2512|4198->2583|4227->2584|4261->2591|4289->2592|4337->2610|4365->2611
                  LINES: 27->1|34->1|35->5|35->5|38->9|39->10|39->10|39->10|40->26|41->27|41->27|41->27|42->28|42->28|42->28|42->28|43->29|45->31|45->31|46->32|46->32|46->32|47->33|47->33|47->33|48->34|48->34|48->34|49->35|50->36|50->36|50->36|50->36|50->36|50->36|51->37|51->37|51->37|51->37|52->38|53->48|53->48|56->51|57->59|58->60|62->64|63->65|63->65|63->65|64->66|65->67|66->68|67->69|68->70|68->70|69->71|69->71|69->71|70->72|70->72|70->72|70->72|70->72|71->73|71->73|73->75|73->75|74->76|75->77|75->77|75->77|75->77|77->79|77->79|78->80|78->80|80->82|81->83
                  -- GENERATED --
              */
          