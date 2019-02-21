package org.wecancodeit.userreviewsite.models;

public class Review {

	private String title;
	private int rating;
	private String imageURL;
	private String author;
	private String category;
	private String content;

	public Review(String title, int rating, String imageURL, String author, String category, String content) {
		this.title = title;
		this.rating = rating;
		this.imageURL = imageURL;
		this.author = author;
		this.category = category;
		this.content = content;
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
		return "Title: " + this.getTitle() + "; rating (out of five): " + this.getRating() + "; author: " + this.getAuthor() + ", category: "
				+ this.getCategory() + "; content:" + this.getContent();
	}

}
