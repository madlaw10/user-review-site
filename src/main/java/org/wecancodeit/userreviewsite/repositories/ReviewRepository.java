package org.wecancodeit.userreviewsite.repositories;


import java.util.List;
import org.wecancodeit.userreviewsite.models.Review;

public class ReviewRepository {
	
	private List<Review> reviews;
	
	public ReviewRepository(List<Review> reviews) {
		this.reviews = reviews;
	}	

	public List<Review> getReviews() {
		return reviews; 
	}

	public int getCount() {
		return reviews.size();
	}

	public void addReview(Review review) {
		reviews.add(review);
	}

	public void removeReview(Review review) {
		reviews.remove(review);	
	}

}
