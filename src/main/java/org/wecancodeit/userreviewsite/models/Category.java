package org.wecancodeit.userreviewsite.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {
	
	@Id
	@GeneratedValue
	private Long id;
	private String category;

	@OneToMany(
			cascade = CascadeType.ALL,
			orphanRemoval = true
			)
	private List<Review> reviews = new ArrayList<>();

	// Default constructor
	public Category() {
	}

	public Category(String category) {
		this.category = category; // to lower case??
	}

	public Long getId() {
		return id;
	}
	
	public String getCategory() {
		return category;
	}

	public List<Review> getReviews() {
		return reviews;
	}


}
