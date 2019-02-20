package org.wecancodeit.userreviewsite.repositories;

import java.util.Collection;
import java.util.HashMap;

import org.wecancodeit.userreviewsite.models.Review;

public class ReviewRepository {
	
	private HashMap<Integer, Review> reviews = new HashMap<Integer, Review>();

	public Collection<Review> getReviews() {
		return reviews.values(); 
	}

	public ReviewRepository(HashMap<Integer, Review> reviews) {
		this.reviews = reviews;
	}

	public int getCount() {
		return reviews.size();
	}

	public void addReview(Review review) {
		reviews.put(review.getId(), review);
	}

	public void removeReview(Review review) {
		reviews.remove(review.getId());	
	}

	public Review findReview(int id) {
		return reviews.get(id);
	}

}
