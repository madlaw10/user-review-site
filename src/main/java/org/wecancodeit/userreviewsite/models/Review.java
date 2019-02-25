package org.wecancodeit.userreviewsite.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;


@Entity
public class Review {
@Id //currently points to title as primary key
@GeneratedValue
	private Long id;
	private String title;
	private int rating;
	private String imageURL;
	private String author;
	private String category; //probably change this to Class??
	@Lob //allows for content greater than 255 characters
	private String content;
	//default contructor
	public Review() {	
	}
	public Review(String title, int rating, String imageURL, String author, String category, String content) {
		this.title = title;
		this.rating = rating;
		this.imageURL = imageURL;
		this.author = author;
		this.category = category;
		this.content = content;
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

	public String getCategory() {
		return category;
	}

	public String getContent() {
		return content;
	}

	public void edit(String newReview) {
		this.content = newReview;
	}
	
	@Override
	public String toString() {
		return "Title: " + this.getTitle() + "; Rating (out of five): " + this.getRating() + "; User: " + this.getAuthor() + "; Tags: "
				+ this.getCategory() + "; Review:" + this.getContent();
	}
}
