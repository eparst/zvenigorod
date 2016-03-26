package controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import models.Post;
import models.User;
import play.Logger;
import play.Play;
import play.Routes;
import play.data.Form;
import play.mvc.*;
import play.mvc.Http.Request;
import play.mvc.Http.Session;
import providers.MyUsernamePasswordAuthProvider;
import providers.MyUsernamePasswordAuthProvider.MyLogin;
import providers.MyUsernamePasswordAuthProvider.MySignup;
import views.html.*;
import be.objectify.deadbolt.java.actions.Group;
import be.objectify.deadbolt.java.actions.Restrict;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.ExpressionList;
import com.feth.play.module.pa.PlayAuthenticate;
import com.feth.play.module.pa.providers.password.UsernamePasswordAuthProvider;
import com.feth.play.module.pa.user.AuthUser;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.util.*;

import javasape.*;
import javax.imageio.ImageIO;

import models.*;

//import com.octo.captcha.service.image.ImageCaptchaService;

public class Application extends Controller {
	static Form<CommentForm> commentForm = Form.form(CommentForm.class); // Me
																			// Add
	public static final String FLASH_MESSAGE_KEY = "message";
	public static final String FLASH_ERROR_KEY = "error";
	public static final String USER_ROLE = "user";
	public static final String ADMIN_ROLE = "admin";
/*	private static String sapeUser = Play.application().configuration().getString("sapeUser");
	private static String sapeHost = Play.application().configuration().getString("sapeHost");
*/
	// @Restrict(@Group(Application.USER_ROLE))
	public static Result index() {
//		response().setContentType("text/html; Windows-1251");
//		Post frontPost = Post.find.orderBy("postedAt desc").findList().get(0);
		Post frontPost = Post.find.byId((long) 95);
		// List<Post> olderPosts =
		// Post.find.orderBy("postedAt").findList().subList(1, 4);
		List<Post> newerPosts = Post.find.orderBy("postedAt desc").findList();//30.07 .subList(0, 4);

//		Sape.getSape().getPageLinks(request.getRequestURI(), request.getCookies()).render();
		Sape.getSape().debug = true;
//		SapePageLinks pageLinks = Sape.getSape().getPageLinks("/", null);
//		Logger.debug(pageLinks.render());
		return ok(index.render(frontPost, newerPosts, Sape.getSape())); // , sape?


	}

	// MyBEgin
	public static Result show(Long id) {
		Post post = Post.find.byId(id);

		/* Iterate through ManyToMany association */
		Iterator<Tag> iterator = post.tags.iterator();
		while (iterator.hasNext()){
			Tag tag = iterator.next();
			System.out.printf("Tag: %s\n", tag.name);
		}
		String randomID = UUID.randomUUID().toString();
		return ok(show.render(post, commentForm, randomID, Sape.getSape()));
	}

	/*
	 * public static Result captcha(String randomID) { try{
	 * ByteArrayOutputStream baos = new ByteArrayOutputStream();
	 * ImageCaptchaService service = Captcha.getService(); BufferedImage image =
	 * service.getImageChallengeForID(randomID); ImageIO.write(image, "jpg",
	 * baos); return ok(baos.toByteArray()).as("image/jpeg"); }
	 * catch(IOException e) { System.out.printf("Captcha Creation failed\n");
	 * return notFound(); } }
	 */
	public static Result postComment(Long postId, String randomID) {
		Form<CommentForm> filled = commentForm.bindFromRequest();
		Post post = Post.find.byId(postId);

		if (filled.hasErrors()) {
			return badRequest(show.render(post, commentForm, randomID, Sape.getSape()));
		} else {
			CommentForm comment = filled.get();
			// post.addComment(comment.name, comment.email, comment.content);
			post.addComment(Application.getLocalUser(session()).name,
					Application.getLocalUser(session()).email, comment.content);
			// session().clear();
			flash("success", "Thanks for posting");
			return show(postId);
		}
	}

	public static Result listTagged(String tag) {
		List<Post> posts = Post.findTaggedWith(tag);
		return ok(listTagged.render(posts, tag));
	}

	// MyEnd
	public static User getLocalUser(final Session session) {
		final AuthUser currentAuthUser = PlayAuthenticate.getUser(session);
		final User localUser = User.findByAuthUserIdentity(currentAuthUser);
		return localUser;
	}

	@Restrict(@Group(Application.USER_ROLE))
	public static Result restricted() {
		final User localUser = getLocalUser(session());
		return ok(restricted.render(localUser));
	}
	@Restrict(@Group(Application.USER_ROLE))
	public static Result profile() {
		final User localUser = getLocalUser(session());
		return ok(profile.render(localUser));
	}

	public static Result login() {
		return ok(login.render(MyUsernamePasswordAuthProvider.LOGIN_FORM));
	}

	public static Result doLogin() {
		com.feth.play.module.pa.controllers.Authenticate.noCache(response());
		final Form<MyLogin> filledForm = MyUsernamePasswordAuthProvider.LOGIN_FORM
				.bindFromRequest();
		if (filledForm.hasErrors()) {
			// User did not fill everything properly
			return badRequest(login.render(filledForm));
		} else {
			// Everything was filled
			return UsernamePasswordAuthProvider.handleLogin(ctx());
		}
	}

	public static Result signup() {
		return ok(signup.render(MyUsernamePasswordAuthProvider.SIGNUP_FORM));
	}

	public static Result jsRoutes() {
		return ok(
				Routes.javascriptRouter("jsRoutes",
						controllers.routes.javascript.Signup.forgotPassword()))
				.as("text/javascript");
	}

	public static Result doSignup() {
		com.feth.play.module.pa.controllers.Authenticate.noCache(response());
		final Form<MySignup> filledForm = MyUsernamePasswordAuthProvider.SIGNUP_FORM
				.bindFromRequest();
		if (filledForm.hasErrors()) {
			// User did not fill everything properly
			return badRequest(signup.render(filledForm));
		} else {
			// Everything was filled
			// do something with your part of the form before handling the user
			// signup
			return UsernamePasswordAuthProvider.handleSignup(ctx());
		}
	}

	public static String formatTimestamp(final long t) {
		return new SimpleDateFormat("yyyy-dd-MM HH:mm:ss").format(new Date(t));
	}

	// @Security.Authenticated(Secured.class)
	@Restrict(@Group(Application.ADMIN_ROLE))
	public static Result admin() {
		final User localUser = getLocalUser(session());
		// User localUser = getLocalUser(session());
		try {
			List<Post> posts = Post.find.where().eq("author_id", localUser.id)
					.findList();// eq("author", localUser.id)
			List<Post> postAll = null;
			if (localUser.isAdmin) {
				postAll = Post.find.all();
			}
			;
			return ok(admin.render(postAll, posts, localUser));
		} catch (Exception e) {
			return ok(admin.render(null, null, localUser));

		} /*
		 * List<Blog> blogs = Blog.findByUser(localUser.getRid().toString());
		 * 
		 * Map<Blog, List<Post>> groupByBlog = posts .stream().collect(
		 * Collectors.groupingBy(p -> p.getBlog()));
		 * 
		 * //TODO stream blogs.forEach(b -> { if (!groupByBlog.containsKey(b)) {
		 * groupByBlog.put(b, new ArrayList<Post>()); } });
		 */

		//
		// User localUser = getLocalUser(session());
		// return
		// ok(admin.render(Blog.findByUser(localUser.getRid().toString()),
		// localUser));
	}
	public static Result photo(){
		 User localUser = getLocalUser(session());
		try {
			List<Post> posts = Post.find.where().eq("is_photo", true).findList();
			return ok(photo.render( posts, localUser));
		} catch (Exception e) {
			return ok(photo.render(null, localUser));

		}
	}
	@Restrict(@Group(Application.ADMIN_ROLE))
	public static Result users(){
		 User localUser = getLocalUser(session());
		try {
			List<User> users = User.find.all();
			return ok(allusers.render( users, localUser));
		} catch (Exception e) {
			return ok(allusers.render(null, localUser));

		}
	}
	public static Result getIp(){
		 String headerValue = request().getHeader(("X-FORWARDED-FOR"));

		    if (headerValue == null) {  
		    	headerValue = request().remoteAddress();  
		    } else {
		    	headerValue = headerValue.split(",")[0].trim();
		    }

			return ok(ip.render( request().getHeader(("X-FORWARDED-FOR")) + " " + headerValue));

		}
}