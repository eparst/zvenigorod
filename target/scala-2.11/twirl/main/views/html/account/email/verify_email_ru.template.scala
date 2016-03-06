
package views.html.account.email

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object verify_email_ru_Scope0 {
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

class verify_email_ru extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(verificationUrl: String, token: String, name: String, email: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.71*/("""
"""),format.raw/*2.1*/("""Привет """),_display_(/*2.9*/name),format.raw/*2.13*/(""",
<br />
<br />
<p>
	чтобы подтвердить твой E-Mail-адрес проследуй, <a href=""""),_display_(/*6.59*/verificationUrl),format.raw/*6.74*/("""">по следующий ссылке:</a>.
</p>
<br />
<p>
	Удачи,<br /> 
	<i>твоя PlayAuthenticate-Team</i>
</p>"""))
      }
    }
  }

  def render(verificationUrl:String,token:String,name:String,email:String): play.twirl.api.HtmlFormat.Appendable = apply(verificationUrl,token,name,email)

  def f:((String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (verificationUrl,token,name,email) => apply(verificationUrl,token,name,email)

  def ref: this.type = this

}


}

/**/
object verify_email_ru extends verify_email_ru_Scope0.verify_email_ru
              /*
                  -- GENERATED --
                  DATE: Sun Mar 06 13:58:46 MSK 2016
                  SOURCE: C:/j/2015_10/zvenigorod/app/views/account/email/verify_email_ru.scala.html
                  HASH: dd69518da73f3a1d365a5d1eb24e9dcbba06c539
                  MATRIX: 800->1|964->70|991->71|1024->79|1048->83|1152->161|1187->176
                  LINES: 27->1|32->1|33->2|33->2|33->2|37->6|37->6
                  -- GENERATED --
              */
          