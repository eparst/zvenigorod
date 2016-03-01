
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
  """),format.raw/*6.10*/("""
  """),format.raw/*7.3*/("""<div class="post-metadata">
  """),format.raw/*9.74*/("""
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
    """),format.raw/*33.44*/("""
        """),format.raw/*34.54*/("""
       """),_display_(/*35.9*/Html(CdnAssets.changeImageUrl(post.content).replace("\n", "<br>"))),format.raw/*35.75*/("""
    """),format.raw/*36.15*/("""
  """)))}),format.raw/*37.4*/("""
"""),format.raw/*38.1*/("""</div>
"""),format.raw/*62.4*/("""
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
                  DATE: Wed Mar 02 01:02:10 MSK 2016
                  SOURCE: C:/j/2015_10/zvenigorod/app/views/display.scala.html
                  HASH: 38836cad20577c3a6d84221fc1239e9b2570122d
                  MATRIX: 761->1|897->42|925->44|969->62|1024->97|1056->201|1085->204|1142->385|1174->391|1203->411|1243->413|1277->420|1365->481|1689->784|1723->791|1754->805|1767->810|1806->811|1840->818|1901->852|1932->874|1972->876|2011->887|2057->906|2070->910|2088->919|2134->927|2175->940|2212->950|2227->956|2281->989|2311->992|2323->995|2349->1000|2405->1025|2446->1035|2480->1042|2522->1054|2555->1060|2591->1070|2618->1088|2657->1089|2689->1094|2748->1164|2785->1218|2820->1227|2907->1293|2940->1308|2974->1312|3002->1313|3036->2046
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->6|36->7|37->9|38->10|38->10|38->10|39->11|41->13|46->18|47->19|48->20|48->20|48->20|49->21|50->22|50->22|50->22|51->23|52->24|52->24|52->24|52->24|53->25|53->25|53->25|53->25|53->25|53->25|53->25|54->26|55->27|56->28|57->29|58->30|59->31|59->31|59->31|60->32|61->33|62->34|63->35|63->35|64->36|65->37|66->38|67->62
                  -- GENERATED --
              */
          