package models;

import java.util.*;

import javax.persistence.*;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Model;

//import play.db.ebean.*;

@Entity
@Table(name = "jos_content")
public class Post extends AppModel {

	@Id
	public Long id;

	public String title;
	public Date postedAt;

	@Lob
	@Basic(fetch = FetchType.EAGER)
	public String content;

	@ManyToOne
	public User author;

	public String htmlPreview;
	public boolean IsPhoto;

	@OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
	public List<Comment> comments = new ArrayList<Comment>();

	@ManyToMany(cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
	public Set<Tag> tags = new TreeSet<Tag>();

	public static Model.Finder<Long, Post> find = new Model.Finder(Long.class,
			Post.class);

	public Post addComment(String author_name, String author_email,
			String content) {
		User commenter = User.findByEmail(author_email);
		Comment newComment;
		if (commenter != null) {
			newComment = new Comment(this, commenter, content);
		} else {
			// commenter = new User(author_email, "", author.name);
			commenter = new User();
			commenter.save();
			newComment = new Comment(this, commenter, content);
		}
		newComment.save();
		this.comments.add(newComment);
		this.save();
		return this;
	}

	public Post(String title, User author, String content) {
		// this.comments = new ArrayList<Comment>();
		// this.tags = new TreeSet<Tag>();
		this.author = author;
		this.title = title;
		this.content = content;
		this.postedAt = new Date();
	}

	public Post previous() {
		List<Post> result = Post.find.orderBy("postedAt desc").where()
				.lt("postedAt", postedAt).findList();
		if (result.size() > 0)
			return result.get(0);
		return null;
	}

	public Post next() {
		List<Post> result = Post.find.orderBy("postedAt asc").where()
				.gt("postedAt", postedAt).findList();
		if (result.size() > 0)
			return result.get(0);
		return null;
	}

	public Post tagItWith(String name) {
		tags.add(Tag.findOrCreateByName(name));
//		this.saveManyToManyAssociations("tags");
		Ebean.saveManyToManyAssociations(this, "tags");
		return this;
	}

	public static List<Post> findTaggedWith(String... tags) {
		// String sql =
		// "select distinct p from Post p join p.tags as t where t.name in (:tags) group by p.id, p.author, p.title, p.content, p.postedAt having count(t.id) = :size";
		return Post.find.where().in("tags.name", tags).findList();
		/*
		 * RawSql rawsql = RawSqlBuilder.parse(sql).create();
		 * com.avaje.ebean.Query<Post> sqlquery = Ebean.find(Post.class);
		 * sqlquery.setRawSql(rawsql); return sqlquery.findList();
		 */
	}

	public String getContent() {
		return content;
	}

	public void setContent(String bod) {
		this.content = bod;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String t) {
		this.title = t;
	}

	public Boolean getIsPhoto() {
		return IsPhoto;
	}

	public void setIsPhoto(Boolean t) {
		this.IsPhoto = t;
	}
	public String getHtmlPreview() {
		return htmlPreview;
	}

	public void setHtmlPreview(String t) {
		this.htmlPreview = t;
	}
	public User getAuthor() {
		return author;
	}

	public void setAuthor(User user) {
		this.author = user;
	}

	public Date getCreationDate() {
		return postedAt;
	}

	public void setCreationDate(Date creationDate) {
		this.postedAt = creationDate;
	}

}
