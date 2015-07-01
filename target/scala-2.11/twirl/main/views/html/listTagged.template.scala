
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
object listTagged extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Post],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(posts: List[Post], tag: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

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
"""))}
  }

  def render(posts:List[Post],tag:String): play.twirl.api.HtmlFormat.Appendable = apply(posts,tag)

  def f:((List[Post],String) => play.twirl.api.HtmlFormat.Appendable) = (posts,tag) => apply(posts,tag)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Jul 01 14:37:46 MSK 2015
                  SOURCE: C:/Lotus/admin/distr/OS/tmp/Downloads/zvenigorod/zvenigorod/app/views/listTagged.scala.html
                  HASH: 3a9222f6a21b70ecc53aab67709c9bd8a974ae08
                  MATRIX: 739->1|874->33|901->51|928->53|968->85|1006->86|1035->90|1063->110|1102->112|1133->117|1207->165|1230->168|1258->169|1288->182|1299->187|1337->188|1368->194|1396->214|1435->216|1468->223|1530->259|1553->262|1582->273|1595->278|1634->279|1668->286|1722->313|1746->316|1787->327|1821->331|1852->335|1909->366|1923->371|1936->375|1982->383|2016->391|2067->421|2103->427|2133->430|2171->438
                  LINES: 26->1|29->1|30->3|31->4|31->4|31->4|32->5|32->5|32->5|33->6|33->6|33->6|33->6|34->7|34->7|34->7|35->8|35->8|35->8|36->9|36->9|36->9|37->10|37->10|37->10|38->11|38->11|38->11|39->12|40->13|42->15|43->16|43->16|43->16|43->16|44->17|44->17|45->18|46->19|47->20
                  -- GENERATED --
              */
          