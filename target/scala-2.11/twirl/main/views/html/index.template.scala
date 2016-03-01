
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Post,List[Post],javasape.Sape,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(front: Post, older: List[Post], sape: javasape.Sape):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.55*/("""
"""),_display_(/*2.2*/main(Messages("playauthenticate.index.title"))/*2.48*/ {_display_(Seq[Any](format.raw/*2.50*/("""
      """),format.raw/*3.7*/("""<!-- Main jumbotron for a primary marketing message or call to action -->
      <qmain>
      </qmain>
    """),format.raw/*8.15*/("""
     """),format.raw/*11.17*/("""
		"""),_display_(/*12.4*/Html(front.getContent)),format.raw/*12.26*/("""
      """),format.raw/*13.7*/("""<!-- Example row of columns -->
      <div class="row">
     """),format.raw/*15.42*/("""
     """),format.raw/*27.17*/("""
      """),format.raw/*28.7*/("""</div>
       <!-- from yabe -->
       """),format.raw/*58.16*/("""
  """)))}),format.raw/*59.4*/("""
    
"""))
      }
    }
  }

  def render(front:Post,older:List[Post],sape:javasape.Sape): play.twirl.api.HtmlFormat.Appendable = apply(front,older,sape)

  def f:((Post,List[Post],javasape.Sape) => play.twirl.api.HtmlFormat.Appendable) = (front,older,sape) => apply(front,older,sape)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Wed Mar 02 01:02:10 MSK 2016
                  SOURCE: C:/j/2015_10/zvenigorod/app/views/index.scala.html
                  HASH: 3b402bf5373b42293dfb1f0e5937ef443cbdd636
                  MATRIX: 768->1|916->54|944->57|998->103|1037->105|1071->113|1208->322|1243->431|1274->436|1317->458|1352->466|1443->565|1478->1131|1513->1139|1583->2054|1618->2059
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|37->8|38->11|39->12|39->12|40->13|42->15|43->27|44->28|46->58|47->59
                  -- GENERATED --
              */
          