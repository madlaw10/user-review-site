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
	//@ManyToOne
	private Review reviewToComment;
	private String userName;
	
	public Comment(String commentContent, String userName, Review reviewToComment) {
		this.commentContent = commentContent;
		this.userName = userName;
		this.reviewToComment = reviewToComment;
	}

	public Long getId() {
		return id;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public Review getReviewToComment() {
		return reviewToComment;
	}

	public String getUserName() {
		return userName;
	}

	@Override
	public String toString() {
		return "Comment [commentContent=" + commentContent + ", userName=" + userName + "]";
	}
	
}
