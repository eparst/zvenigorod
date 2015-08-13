
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object display_Scope0 {
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

class display extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[models.Post,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(post: models.Post, mode: String ="full"):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


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
"""))
      }
    }
  }

  def render(post:models.Post,mode:String): play.twirl.api.HtmlFormat.Appendable = apply(post,mode)

  def f:((models.Post,String) => play.twirl.api.HtmlFormat.Appendable) = (post,mode) => apply(post,mode)

  def ref: this.type = this

}


}

/**/
object display extends display_Scope0.display
              /*
                  -- GENERATED --
                  DATE: Wed Aug 12 16:48:52 MSK 2015
                  SOURCE: C:/Lotus/admin/distr/OS/tmp/Downloads/zvenigorod/zvenigorod/app/views/display.scala.html
                  HASH: 23f0b046de45671a6be74d2a1aea2d858b94a446
                  MATRIX: 761->1|897->42|925->44|969->62|1024->97|1093->140|1107->146|1153->172|1182->175|1194->179|1220->185|1320->259|1332->263|1387->298|1451->336|1463->340|1512->369|1540->370|1579->383|1608->403|1648->405|1682->412|1770->473|2094->776|2128->783|2159->797|2172->802|2211->803|2245->810|2306->844|2337->866|2377->868|2416->879|2462->898|2475->902|2493->911|2539->919|2580->932|2617->942|2632->948|2686->981|2716->984|2728->987|2754->992|2810->1017|2851->1027|2885->1034|2927->1046|2960->1052|2996->1062|3023->1080|3062->1081|3094->1086|3197->1206|3232->1215|3319->1281|3351->1286|3391->1296|3419->1297|3453->1305|3478->1321|3517->1322|3547->1325|3613->1365|3790->1522|3823->1528|3860->1539|4355->2014|4385->2017|4423->2025
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|36->5|36->5|36->5|36->5|36->5|39->8|39->8|39->8|40->9|40->9|40->9|40->9|41->10|41->10|41->10|42->11|44->13|49->18|50->19|51->20|51->20|51->20|52->21|53->22|53->22|53->22|54->23|55->24|55->24|55->24|55->24|56->25|56->25|56->25|56->25|56->25|56->25|56->25|57->26|58->27|59->28|60->29|61->30|62->31|62->31|62->31|63->32|65->34|66->35|66->35|67->36|68->37|69->38|70->39|70->39|70->39|71->40|73->42|75->44|76->45|77->46|90->59|91->60|92->61
                  -- GENERATED --
              */
          