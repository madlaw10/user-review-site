package org.wecancodeit.userreviewsite.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Comment {
	@Id 
	@GeneratedValue
	private Long id;
	private String commentContent;

	@ManyToOne
	private Review review;
	
	public Comment() {}
	
	public Comment(String commentContent, Review review) {
		this.commentContent = commentContent;
		this.review = review;
	}

	public Long getId() {
		return id;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public Review getReview() {
		return review;
	}

	@Override
	public String toString() {
		return "Comment [commentContent=" + commentContent + "]";
	}
	
}
