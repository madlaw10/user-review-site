package org.wecancodeit.userreviewsite;

import java.util.Date;

public class Review {
	private int id;
	private String title;
	private Date date; //look into this
	private String category;
	private String content;
	//need image property probabaly a String
	
	
	public Review(int id, String title, Date date, String category, String content) {
		//system generated
		this.id = id;
		this.title = title;
		//system generated
		this.date = date;
		this.category = category;
		this.content = content;
		
	}
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
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
	

}
