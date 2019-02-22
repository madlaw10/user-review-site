package org.wecancodeit.userreviewsite.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {
	@Id
	private Long id;
	@OneToMany(targetEntity=Review.class)
	private List<Review> reviews;
	private String category;
	
	//Default constructor
	public Category() {
		
	}
	public Category(String category, List<Review> reviews) {
		this.category = category;
		this.reviews = reviews;
	}
	public Long getId() {
		return id;
	}
	public List<Review> getReviews() {
		return reviews;
	}
	public String getCategory() {
		return category;
	}
	
}
