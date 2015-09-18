
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
        """),_display_(/*8.10*/Messages("Реклама: ")),format.raw/*8.31*/(""" 
"""),_display_(/*9.2*/sape/*9.6*/.getPageLinks(request.uri,request.cookies).render(3)),format.raw/*9.58*/("""
"""),_display_(/*10.2*/main(post.title)/*10.18*/{_display_(Seq[Any](format.raw/*10.19*/("""
"""),format.raw/*11.1*/("""<!--   <ul id="pagination">
      """),_display_(/*12.8*/if(!Option(post previous).isEmpty)/*12.42*/ {_display_(Seq[Any](format.raw/*12.44*/("""
        """),format.raw/*13.9*/("""<li id="previous">
          <a href=""""),_display_(/*14.21*/routes/*14.27*/.Application.show(post.previous.id)),format.raw/*14.62*/("""">
            """),_display_(/*15.14*/post/*15.18*/.previous.title),format.raw/*15.33*/("""
          """),format.raw/*16.11*/("""</a>
         <li>
        """)))}),format.raw/*18.10*/("""
      """),_display_(/*19.8*/if(!Option(post next).isEmpty)/*19.38*/ {_display_(Seq[Any](format.raw/*19.40*/("""
        """),format.raw/*20.9*/("""<li id="next">
          <a href=""""),_display_(/*21.21*/routes/*21.27*/.Application.show(post.next.id)),format.raw/*21.58*/("""">
            """),_display_(/*22.14*/post/*22.18*/.next.title),format.raw/*22.29*/("""
          """),format.raw/*23.11*/("""</a>
         <li>
        """)))}),format.raw/*25.10*/("""
    """),format.raw/*26.5*/("""</ul> -->
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
            <input type="submit" value="��������� �����������" />
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
                  DATE: Thu Sep 17 13:28:31 UTC 2015
                  SOURCE: /home/play/zvenigorod/app/views/show.scala.html
                  HASH: 0d3f60bb12e39b3493a50335944c6facf6f3258f
                  MATRIX: 780->1|1076->84|1103->207|1137->215|1264->316|1305->337|1333->340|1344->344|1416->396|1444->398|1469->414|1508->415|1536->416|1597->451|1640->485|1680->487|1716->496|1782->535|1797->541|1853->576|1896->592|1909->596|1945->611|1984->622|2043->650|2077->658|2116->688|2156->690|2192->699|2254->734|2269->740|2321->771|2364->787|2377->791|2409->802|2448->813|2507->841|2539->846|2580->861|2618->890|2658->892|2692->899|2739->919|2753->924|2789->939|2829->949|2866->960|2915->988|2954->1000|3008->1045|3056->1055|3094->1066|3119->1082|3158->1083|3190->1089|3254->1144|3294->1146|3328->1153|3372->1171|3397->1187|3436->1188|3473->1198|3488->1204|3535->1230|3600->1268|3615->1274|3664->1302|3715->1322|3751->1331|3810->1574|3846->1583|3958->1674|3997->2016|4036->2027|4180->2140|4210->2151|4223->2155|4262->2156|4300->2166|4388->2223|4424->2229|4456->2234|4551->2301|4580->2302|4616->2311|4671->2338|4700->2339|4739->2350|4784->2367|4813->2368|4850->2377|4879->2378|4924->2396|4953->2397|5030->2446|5059->2447|5098->2458|5172->2504|5201->2505|5252->2528|5281->2529|5379->2600|5408->2601|5442->2608|5470->2609|5518->2627|5546->2628
                  LINES: 27->1|34->1|35->5|35->5|38->8|38->8|39->9|39->9|39->9|40->10|40->10|40->10|41->11|42->12|42->12|42->12|43->13|44->14|44->14|44->14|45->15|45->15|45->15|46->16|48->18|49->19|49->19|49->19|50->20|51->21|51->21|51->21|52->22|52->22|52->22|53->23|55->25|56->26|57->27|57->27|57->27|58->28|58->28|58->28|58->28|59->29|61->31|61->31|62->32|62->32|62->32|63->33|63->33|63->33|64->34|64->34|64->34|65->35|66->36|66->36|66->36|66->36|66->36|66->36|67->37|67->37|67->37|67->37|68->38|69->48|69->48|72->51|73->59|74->60|78->64|79->65|79->65|79->65|80->66|81->67|82->68|83->69|84->70|84->70|85->71|85->71|85->71|86->72|86->72|86->72|86->72|86->72|87->73|87->73|89->75|89->75|90->76|91->77|91->77|91->77|91->77|93->79|93->79|94->80|94->80|96->82|97->83
                  -- GENERATED --
              */
          