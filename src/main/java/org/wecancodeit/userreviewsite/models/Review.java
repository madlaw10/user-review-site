package org.wecancodeit.userreviewsite.models;

import java.util.Date;

public class Review {

	private int id;
	private String title;
	private int rating;
	private String author;
	private Date date; // look into this
	private String category;
	private String content;
	// need image property probably a String

	public Review(int id, String title, int rating, String author, Date date, String category, String content) {
		this.id = id; // automatic - system generated
		this.title = title;
		this.rating = rating;
		this.author = author;
		this.date = date; // automatic - system generated
		this.category = category;
		this.content = content;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public int getRating() {
		return rating;
	}

	public String getAuthor() {
		return author;
	}

	public Date getDate() {
		return date;
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
		return "Title: " + this.getTitle() + "; rating (out of five): " + this.getRating() + "; author: " + this.getAuthor() + "; date: " + this.getDate() + "; category: "
				+ this.getCategory() + "; content:" + this.getContent();
	}

}
