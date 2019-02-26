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
	private String tag;

	@OneToMany(mappedBy="category")
	private Collection<Review> reviews;

	// Default constructor
	public Category() {
	}

	public Category(String tag) {
		this.tag = tag; 
	}

	public Long getId() {
		return id;
	}
	
	public String getTag() {
		return tag;
	}

	public Collection<Review> getReviews() {
		return reviews;
	}
	
	public String toString() {
		return this.getTag() + " " + this.getReviews();
		
	}


}
