package controllers;

import models.Post;
import models.User;
import play.Logger;
import play.data.Form;
import play.mvc.*;
import util.TextUtils;
import views.html.*;

import java.util.Date;

import be.objectify.deadbolt.java.actions.Group;
import be.objectify.deadbolt.java.actions.Restrict;
import static play.data.Form.*;

/**
 * Created by dru on 14.01.2015.
 */

// @Security.Authenticated(Secured.class)
@Restrict(@Group(Application.USER_ROLE))
public class AdminsPosts extends Controller {

	public static final int TRUNCATED_MEDIUM_CHAR_COUNT = 150;

	/**
	 * Display the 'edit form' of a existing Post.
	 *
	 * @param postId
	 *            Id of the blog post to edit
	 */
	public static Result edit(Long postId) {
		Form<Post> blogpostForm = form(Post.class).fill(Post.find.byId(postId));
		return ok(editpost.render(postId, blogpostForm));
	}

	/**
	 * Handle the 'edit form' submission
	 *
	 * @param postId_
	 *            Id of the blog post to edit
	 */
	public static Result update(Long postId) {
		Form<Post> blogpostForm = form(Post.class).bindFromRequest();
		if (blogpostForm.hasErrors()) {
			return badRequest(editpost.render(postId, blogpostForm));
		}
		Post postFromForm = blogpostForm.get();
		Post toUpdate = Post.find.byId(postId);
		toUpdate.setContent(postFromForm.getContent());
		toUpdate.setTitle(postFromForm.getTitle());
		if (postFromForm.getHtmlPreview() == null) {
			toUpdate.setHtmlPreview(TextUtils.generateTruncateHtmlPreview(
					toUpdate.getContent(), TRUNCATED_MEDIUM_CHAR_COUNT));
		} else {
			toUpdate.setHtmlPreview(postFromForm.getHtmlPreview());
		}
		// toUpdate.setHeader(postFromForm.getHeader());
		toUpdate.save();
		// Post.change(postId, postFromForm.title, postFromForm.content);
		flash("success", "Post has been updated");
		/**
		 * you can use
		 * redirect(routes.Application.viewPost(blogPost.save().getRid
		 * ().toString())); and if you use @With(LocalUser.class) it preferred
		 * way. Only one plus of my solution - avoiding Post.findById query TODO
		 * only on create
		 */
		return redirect(routes.Application.admin());
	}

	public static Result delete(Long postId) {
		Post toDelete = Post.find.byId(postId);
		toDelete.delete();

		flash("success", "Post has been deleted");
		return redirect(routes.Application.admin());
	}

	/**
	 * Display the 'new blog post form'.
	 */
	public static Result create() {
		Form<Post> blogpostForm = form(Post.class);
		return ok(createpost.render(blogpostForm));
	}

	/**
	 * Handle the 'new blog post form' submission
	 */
	public static Result save() {
		// TODO formatters issue
		Form<Post> blogpostForm = form(Post.class).bindFromRequest();//
		if (blogpostForm.hasErrors()) {
			return badRequest(createpost.render(blogpostForm));
		}
		Post blogPost = blogpostForm.get();
		if (blogPost.getHtmlPreview() == null) {
			blogPost.setHtmlPreview(TextUtils.generateTruncateHtmlPreview(
					blogPost.getContent(), TRUNCATED_MEDIUM_CHAR_COUNT));
		}
		User localUser = Application.getLocalUser(session());
		// Logger.debug("qqqqq localUser.name= " + localUser.name);
		blogPost.setCreationDate(new Date());
		blogPost.setAuthor(localUser);
		/*
		 * blogPost.setContent(blogPost.content);
		 * blogPost.setTitle(blogPost.title);
		 */
		// Blog blog = Blog.findByName(blogName_);
		// blogPost.setBlog(blog);
		blogPost.save();
		flash("success", "Post has been created");
		return redirect(routes.Application.admin());

	}
}
