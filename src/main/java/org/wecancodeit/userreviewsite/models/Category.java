package org.wecancodeit.userreviewsite.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {
	
	@Id
	@GeneratedValue
	private Long id;
	private String type;

	@OneToMany(mappedBy="category")
	private Collection<Review> reviews;

	// Default constructor
	public Category() {
	}

	public Category(String type) {
		this.type = type; 
	}

	public Long getId() {
		return id;
	}
	
	public String getType() {
		return type;
	}

	public Collection<Review> getReviews() {
		return reviews;
	}
	
	public String toString() {
		return this.getType() + " " + this.getReviews();
		
	}


}
