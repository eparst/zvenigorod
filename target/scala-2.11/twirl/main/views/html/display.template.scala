
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
object display extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[models.Post,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(post: models.Post, mode: String ="full"):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.43*/("""

"""),format.raw/*3.1*/("""<div class="post """),_display_(/*3.19*/{if(mode == "teaser") mode else ""}),format.raw/*3.54*/("""">
  <h2 class="post-title">
    <a href=""""),_display_(/*5.15*/routes/*5.21*/.Application.show(post.id)),format.raw/*5.47*/("""">"""),_display_(/*5.50*/post/*5.54*/.title),format.raw/*5.60*/("""</a>
  </h2>
  <div class="post-metadata">
    <span class="post-author">"""),_display_(/*8.32*/User/*8.36*/.findById(post.author.id).firstName),format.raw/*8.71*/("""</span>
    <span class="post-date"> """),_display_(/*9.31*/post/*9.35*/.postedAt.format("dd MMM yy")),format.raw/*9.64*/(""" """),format.raw/*9.65*/("""</span>
    """),_display_(/*10.6*/if( mode != "full" )/*10.26*/ {_display_(Seq[Any](format.raw/*10.28*/("""
      """),format.raw/*11.7*/("""<span class="post-comments">
        &nbsp;|&nbsp; 
        """),_display_(/*13.10*/{
          val comments=Comment.findByPost(post.id); 
          {if(comments.size>0) comments.size else "no"} + " comment" + {if(comments.size>1) {"s"} else ""} + 
          {if(comments.size >0) {", " + " latest by " + 
            User.findByEmail(comments.head.author.email).name }else ""}
        }),format.raw/*18.10*/("""
      """),format.raw/*19.7*/("""</span>
    """)))}/*20.7*/else/*20.12*/{_display_(Seq[Any](format.raw/*20.13*/("""
      """),format.raw/*21.7*/("""<span class="post-tags">
        """),_display_(/*22.10*/if(!post.tags.isEmpty)/*22.32*/ {_display_(Seq[Any](format.raw/*22.34*/("""
          """),format.raw/*23.11*/("""-Tagged
          """),_display_(/*24.12*/post/*24.16*/.tags.map/*24.25*/{ tag =>_display_(Seq[Any](format.raw/*24.33*/("""
            """),format.raw/*25.13*/("""<a href=""""),_display_(/*25.23*/routes/*25.29*/.Application.listTagged(tag.name)),format.raw/*25.62*/("""">"""),_display_(/*25.65*/tag/*25.68*/.name),format.raw/*25.73*/("""</a>         
          """)))}),format.raw/*26.12*/("""
        """)))}),format.raw/*27.10*/("""
      """),format.raw/*28.7*/("""</span>
   """)))}),format.raw/*29.5*/("""   
  """),format.raw/*30.3*/("""</div>
  """),_display_(/*31.4*/if(mode!="teaser")/*31.22*/{_display_(Seq[Any](format.raw/*31.23*/("""
    """),format.raw/*32.5*/("""<div class="post-content">
      <div class="about">Detail: </div>
        """),format.raw/*34.54*/("""
       """),_display_(/*35.9*/Html(CdnAssets.changeImageUrl(post.content).replace("\n", "<br>"))),format.raw/*35.75*/("""
    """),format.raw/*36.5*/("""</div>
  """)))}),format.raw/*37.4*/("""
"""),format.raw/*38.1*/("""</div>
"""),_display_(/*39.2*/if(mode=="full")/*39.18*/{_display_(Seq[Any](format.raw/*39.19*/("""
  """),format.raw/*40.3*/("""<div class="comments">
    <h3>
       """),_display_(/*42.9*/{val comments=Comment.findByPost(post.id); 
       {if(comments.size>0) comments.size else "no"} + " comment" + {if(comments.size>1) {"s"} else ""} 
       }),format.raw/*44.9*/(""" 
    """),format.raw/*45.5*/("""</h3>
    """),_display_(/*46.6*/{Comment.findByPost(post.id).map{comment =>
      <div class="comment">
        <div class="comment-metadata">
          <span class="comment-author">by {User.findByEmail(comment.author.email).name},</span>
          <span class="comment-date">
            {comment.postedAt.format("dd MMM yy")}
          </span>
        </div>
        <div class="comment-content">
          <div class="about">Detail: </div>
            {comment.content}
        </div>
      </div>
    }}),format.raw/*59.7*/("""
  """),format.raw/*60.3*/("""</div>
""")))}),format.raw/*61.2*/("""
"""))}
  }

  def render(post:models.Post,mode:String): play.twirl.api.HtmlFormat.Appendable = apply(post,mode)

  def f:((models.Post,String) => play.twirl.api.HtmlFormat.Appendable) = (post,mode) => apply(post,mode)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jun 30 16:53:11 MSK 2015
                  SOURCE: C:/Lotus/admin/distr/OS/tmp/Downloads/zvenigorod/zvenigorod/app/views/display.scala.html
                  HASH: b751dcd5a3c01cf4cee44ee2da3c258dade1d8c4
                  MATRIX: 737->1|866->42|894->44|938->62|993->97|1062->140|1076->146|1122->172|1151->175|1163->179|1189->185|1289->259|1301->263|1356->298|1420->336|1432->340|1481->369|1509->370|1548->383|1577->403|1617->405|1651->412|1739->473|2063->776|2097->783|2128->797|2141->802|2180->803|2214->810|2275->844|2306->866|2346->868|2385->879|2431->898|2444->902|2462->911|2508->919|2549->932|2586->942|2601->948|2655->981|2685->984|2697->987|2723->992|2779->1017|2820->1027|2854->1034|2896->1046|2929->1052|2965->1062|2992->1080|3031->1081|3063->1086|3166->1206|3201->1215|3288->1281|3320->1286|3360->1296|3388->1297|3422->1305|3447->1321|3486->1322|3516->1325|3582->1365|3759->1522|3792->1528|3829->1539|4324->2014|4354->2017|4392->2025
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|33->5|33->5|33->5|36->8|36->8|36->8|37->9|37->9|37->9|37->9|38->10|38->10|38->10|39->11|41->13|46->18|47->19|48->20|48->20|48->20|49->21|50->22|50->22|50->22|51->23|52->24|52->24|52->24|52->24|53->25|53->25|53->25|53->25|53->25|53->25|53->25|54->26|55->27|56->28|57->29|58->30|59->31|59->31|59->31|60->32|62->34|63->35|63->35|64->36|65->37|66->38|67->39|67->39|67->39|68->40|70->42|72->44|73->45|74->46|87->59|88->60|89->61
                  -- GENERATED --
              */
          