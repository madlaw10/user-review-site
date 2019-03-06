package org.wecancodeit.userreviewsite.models;

import java.util.Arrays;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Lob;
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
	@ManyToMany//(mappedBy="reviews")
	private Collection<ReviewTag> reviewTags;
//	@JoinTable(name = "review_tags",
//			  joinColumns = {@JoinColumn(name = "review_id", referencedColumnName = "id")},
//			  inverseJoinColumns = {@JoinColumn(name = "tag_id}", referencedColumnName = "id")})
	@OneToMany(mappedBy="review")
	private Collection<Comment> comments;

	// default constructor
	public Review() {
	}

	public Review(String title, int rating, String imageURL, String author, String content, Category category, ReviewTag ...reviewTags) {
		this.title = title;
		this.rating = rating;
		this.imageURL = imageURL;
		this.author = author;
		this.content = content;
		this.category = category;

		this.reviewTags = Arrays.asList(reviewTags);

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
  
  	public Collection<Comment> getComments() {
		return comments;
	}

	public void edit(String newReview) {
		this.content = newReview;
	}
	
	public void addTag(ReviewTag tagToAdd) {
		reviewTags.add(tagToAdd);
	}
  
	@Override
	public String toString() {
		return "Title: " + this.getTitle() + "; Rating (out of five): " + this.getRating() + "; User: "
				+ this.getAuthor() + "; Category: " + this.getCategory().getType() + "; Review:" + this.getContent() + "; Tags: "+ this.getReviewTags();
  }
}
