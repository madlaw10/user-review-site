package org.wecancodeit.userreviewsite;

import java.util.Collection;
import java.util.HashMap;

public class ReviewRepository {
	
	private HashMap<Integer, Review> reviews = new HashMap<Integer, Review>();

	public Collection<Review> getReviews() {
		return reviews.values(); 
		// Q: Do we need a toString() in Review class if not a console application?
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
