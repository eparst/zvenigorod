package controllers;

import com.feth.play.module.pa.PlayAuthenticate;

import play.Logger;
//import com.octo.captcha.service.image.ImageCaptchaService;

public class CommentForm {
	public String content;
/*	public String name = Application.getLocalUser(session().mail);
  public String email;
  public String randomID;
  public String code;
  */
  public String validate()  {
//    ImageCaptchaService service = Captcha.getService ();
	    if(!content.isEmpty()){
//    if(!name.isEmpty() && !email.isEmpty() && !content.isEmpty() && service.validateResponseForID (randomID, code))
  //  	Logger.debug("commentForm: succes");
      return null;
    }else{      
//      Logger.debug("commentForm: failed - name=" + name + " - email=" + email + " content=" + content);
      return "failed";
    }
  }
}
