
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object listTagged_Scope0 {
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

class listTagged extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Post],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(posts: List[Post], tag: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.34*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Posts tagged with " + tag)/*4.34*/{_display_(Seq[Any](format.raw/*4.35*/("""
  """),_display_(/*5.4*/if(posts.length > 1)/*5.24*/ {_display_(Seq[Any](format.raw/*5.26*/("""
    """),format.raw/*6.5*/("""<h3>There are posts.length posts tagged with + """),_display_(/*6.53*/tag),format.raw/*6.56*/(""" """),format.raw/*6.57*/("""</h3>    
  """)))}/*7.4*/else/*7.9*/{_display_(Seq[Any](format.raw/*7.10*/("""
    """),_display_(/*8.6*/if(posts.length > 0)/*8.26*/ {_display_(Seq[Any](format.raw/*8.28*/("""
      """),format.raw/*9.7*/("""<h3> There is 1 post tagged with + """),_display_(/*9.43*/tag),format.raw/*9.46*/("""</h3>
    """)))}/*10.6*/else/*10.11*/{_display_(Seq[Any](format.raw/*10.12*/("""
      """),format.raw/*11.7*/("""<h3>No post tagged with + """),_display_(/*11.34*/tag),format.raw/*11.37*/("""</h3>
    """)))}),format.raw/*12.6*/("""
  """)))}),format.raw/*13.4*/("""

  """),format.raw/*15.3*/("""<div class="older-posts">
    """),_display_(/*16.6*/posts/*16.11*/.map/*16.15*/{post =>_display_(Seq[Any](format.raw/*16.23*/("""
      """),_display_(/*17.8*/display(post, mode = "teaser")),format.raw/*17.38*/("""
    """)))}),format.raw/*18.6*/("""
  """),format.raw/*19.3*/("""</div>
""")))}),format.raw/*20.2*/("""
"""))
      }
    }
  }

  def render(posts:List[Post],tag:String): play.twirl.api.HtmlFormat.Appendable = apply(posts,tag)

  def f:((List[Post],String) => play.twirl.api.HtmlFormat.Appendable) = (posts,tag) => apply(posts,tag)

  def ref: this.type = this

}


}

/**/
object listTagged extends listTagged_Scope0.listTagged
              /*
                  -- GENERATED --
                  DATE: Sun Mar 06 01:05:17 MSK 2016
                  SOURCE: C:/j/2015_10/zvenigorod/app/views/listTagged.scala.html
                  HASH: c19bf0019374114eff524dd8e4a8e0c89ef20784
                  MATRIX: 766->1|908->33|935->51|962->53|1002->85|1040->86|1069->90|1097->110|1136->112|1167->117|1241->165|1264->168|1292->169|1322->182|1333->187|1371->188|1402->194|1430->214|1469->216|1502->223|1564->259|1587->262|1616->273|1629->278|1668->279|1702->286|1756->313|1780->316|1821->327|1855->331|1886->335|1943->366|1957->371|1970->375|2016->383|2050->391|2101->421|2137->427|2167->430|2205->438
                  LINES: 27->1|32->1|33->3|34->4|34->4|34->4|35->5|35->5|35->5|36->6|36->6|36->6|36->6|37->7|37->7|37->7|38->8|38->8|38->8|39->9|39->9|39->9|40->10|40->10|40->10|41->11|41->11|41->11|42->12|43->13|45->15|46->16|46->16|46->16|46->16|47->17|47->17|48->18|49->19|50->20
                  -- GENERATED --
              */
          