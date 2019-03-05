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
	
	@ManyToMany(mappedBy="reviewTags")
	private Collection<Review> reviews;
	
	
	public ReviewTag() {}
	
	public ReviewTag(String tagName){
		this.tagName = tagName;
			
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






