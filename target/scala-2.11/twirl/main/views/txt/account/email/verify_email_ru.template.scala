
package views.txt.account.email

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object verify_email_ru_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.txt._
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

class verify_email_ru extends BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply/*1.2*/(verificationUrl: String, token: String, name: String, email: String):play.twirl.api.TxtFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.71*/("""Hey """),_display_(/*1.76*/name),format.raw/*1.80*/(""", 


чтобы подтвердить твой E-Mail-адрес проследуйте, по следующий ссылке:

"""),_display_(/*6.2*/verificationUrl),format.raw/*6.17*/("""

"""),format.raw/*8.1*/("""Удачи,
твоя PlayAuthenticate-Team"""))
      }
    }
  }

  def render(verificationUrl:String,token:String,name:String,email:String): play.twirl.api.TxtFormat.Appendable = apply(verificationUrl,token,name,email)

  def f:((String,String,String,String) => play.twirl.api.TxtFormat.Appendable) = (verificationUrl,token,name,email) => apply(verificationUrl,token,name,email)

  def ref: this.type = this

}


}

/**/
object verify_email_ru extends verify_email_ru_Scope0.verify_email_ru
              /*
                  -- GENERATED --
                  DATE: Sun Mar 06 13:58:46 MSK 2016
                  SOURCE: C:/j/2015_10/zvenigorod/app/views/account/email/verify_email_ru.scala.txt
                  HASH: 86d9288158f36d3de9cbc44e8e775692614c184e
                  MATRIX: 794->1|957->70|988->75|1012->79|1114->156|1149->171|1177->173
                  LINES: 27->1|32->1|32->1|32->1|37->6|37->6|39->8
                  -- GENERATED --
              */
          