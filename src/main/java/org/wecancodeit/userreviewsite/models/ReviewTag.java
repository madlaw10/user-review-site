package org.wecancodeit.userreviewsite.models;

import java.util.Arrays;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class ReviewTag {
	
	@Id
	@GeneratedValue
	private Long id;
	private String tagName;
	
	@ManyToMany
	private Collection<Review> reviews;
	
	
	public ReviewTag() {}
	
	public ReviewTag(String tagName, Review ...reviews){
		this.tagName = tagName;
		this.reviews = Arrays.asList(reviews);
			
	}

	public Long getId() {
		return id;
	}

	public String getTagName() {
		return tagName;
	}
	
	public Collection<Review> getReviews() {
		return reviews;
	}
	
}






