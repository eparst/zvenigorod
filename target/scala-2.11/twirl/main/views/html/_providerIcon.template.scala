
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
object _providerIcon extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(providerKey: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.23*/("""
 """),format.raw/*2.2*/("""<img alt=""""),_display_(/*2.13*/providerKey),format.raw/*2.24*/(""" """),format.raw/*2.25*/("""icon" title=""""),_display_(/*2.39*/providerKey),format.raw/*2.50*/("""" src=""""),_display_(/*2.58*/routes/*2.64*/.Assets.at("icons/"+providerKey+"-24x24.png")),format.raw/*2.109*/("""">"""))}
  }

  def render(providerKey:String): play.twirl.api.HtmlFormat.Appendable = apply(providerKey)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (providerKey) => apply(providerKey)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Jul 08 10:18:07 MSK 2015
                  SOURCE: C:/Lotus/admin/distr/OS/tmp/Downloads/zvenigorod/zvenigorod/app/views/_providerIcon.scala.html
                  HASH: d6252bd8a1459d41d382399854fe81d00f040277
                  MATRIX: 731->1|840->22|868->24|905->35|936->46|964->47|1004->61|1035->72|1069->80|1083->86|1149->131
                  LINES: 26->1|29->1|30->2|30->2|30->2|30->2|30->2|30->2|30->2|30->2|30->2
                  -- GENERATED --
              */
          