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
	private String userName;
	
	public Comment(String commentContent, String userName, Review review) {
		this.commentContent = commentContent;
		this.userName = userName;
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

	public String getUserName() {
		return userName;
	}

	@Override
	public String toString() {
		return "Comment [commentContent=" + commentContent + ", userName=" + userName + "]";
	}
	
}
