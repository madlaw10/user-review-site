package org.wecancodeit.userreviewsite.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Review {

	@Id 
	@GeneratedValue
	private Long id;
	private String title;
	private int rating;
	private String imageURL;
	private String author;
	@Lob
	private String content;
	@ManyToOne
	private Category category;
	@ManyToMany
	private Collection<ReviewTag> reviewTags;
	@OneToMany(mappedBy="review")
	private Collection<Comment> comments;

	// default constructor
	public Review() {
	}

	public Review(String title, int rating, String imageURL, String author, String content, Category category) {
		this.title = title;
		this.rating = rating;
		this.imageURL = imageURL;
		this.author = author;
		this.content = content;
		this.category = category;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public int getRating() {
		return rating;
	}

	public String getImageURL() {
		return imageURL;
	}

	public String getAuthor() {
		return author;
	}

	public String getContent() {
		return content;
	}
	
	public Category getCategory() {
		return category;
	}
  
	public Collection<ReviewTag> getReviewTags() {
		return reviewTags;
	}
  
//  	public Collection<Comment> getComment() {
//		return comments;
//	}

	public void edit(String newReview) {
		this.content = newReview;
	}
  
	@Override
	public String toString() {
		return "Title: " + this.getTitle() + "; Rating (out of five): " + this.getRating() + "; User: "
				+ this.getAuthor() + "; Category: " + this.getCategory().getType() + "; Review:" + this.getContent();
  }
}
