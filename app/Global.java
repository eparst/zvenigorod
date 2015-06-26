import java.util.Arrays;
import java.util.List;
import java.util.Map;

import models.Comment;
import models.Post;
import models.SecurityRole;
import models.Tag;
import models.User;

import com.avaje.ebean.Ebean;
import com.feth.play.module.pa.PlayAuthenticate;
import com.feth.play.module.pa.PlayAuthenticate.Resolver;
import com.feth.play.module.pa.exceptions.AccessDeniedException;
import com.feth.play.module.pa.exceptions.AuthException;

import controllers.routes;
import play.Application;
import play.GlobalSettings;
import play.Logger;
import play.libs.Yaml;
import play.mvc.Call;

public class Global extends GlobalSettings {
	String initialFile = "initial-data.yml"; //"zvenigorod.yml";
	public void onStart(Application app) {
		
		PlayAuthenticate.setResolver(new Resolver() {

			@Override
			public Call login() {
				// Your login page
				return routes.Application.login();
			}

			@Override
			public Call afterAuth() {
				// The user will be redirected to this page after authentication
				// if no original URL was saved
				return routes.Application.index();
			}

			@Override
			public Call afterLogout() {
				return routes.Application.index();
			}

			@Override
			public Call auth(final String provider) {
				// You can provide your own authentication implementation,
				// however the default should be sufficient for most cases
				return com.feth.play.module.pa.controllers.routes.Authenticate
						.authenticate(provider);
			}

			@Override
			public Call askMerge() {
				return routes.Account.askMerge();
			}

			@Override
			public Call askLink() {
				return routes.Account.askLink();
			}

			@Override
			public Call onException(final AuthException e) {
				if (e instanceof AccessDeniedException) {
					return routes.Signup
							.oAuthDenied(((AccessDeniedException) e)
									.getProviderKey());
				}

				// more custom problem handling here...
				return super.onException(e);
			}
		});

		initialData();
	}

	private void initialData() {
		if (Post.find.findRowCount() == 0){ // from me
		if (SecurityRole.find.findRowCount() == 0) {
			for (final String roleName : Arrays
					.asList(controllers.Application.USER_ROLE)) {
				final SecurityRole role = new SecurityRole();
				role.roleName = roleName;
				role.save();
			}
	// from yabe:
	if(Ebean.find(User.class).findRowCount() == 0) {
        Logger.debug("Read " + initialFile + " file.");

				Map<String, List<Object>> all = (Map<String, List<Object>>)Yaml.load(initialFile);

        if(Ebean.find(User.class).findRowCount() == 0) {
          Logger.debug("Loading users from " + initialFile);
  				Ebean.save(all.get("users"));
        }

        if(Ebean.find(Tag.class).findRowCount() == 0) {
          Logger.debug("Loading tags from " + initialFile);
  				Ebean.save(all.get("tags"));
        }

        if(Ebean.find(Post.class).findRowCount() == 0) {
          Logger.debug("Loading posts from " + initialFile);
				  Ebean.save(all.get("posts"));
          
          for(Object post: all.get("posts")) {
            Logger.debug("Inserting posts-tags from " + initialFile);
            Ebean.saveManyToManyAssociations(post, "tags");
          }
        }


        if(Ebean.find(Comment.class).findRowCount() == 0) {
          Logger.debug("Loading comments from " + initialFile);
				  Ebean.save(all.get("comments"));
        }
			}
	// :end from yabe
		}
	}
	}
}