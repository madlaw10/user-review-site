package org.wecancodeit.userreviewsite.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.userreviewsite.models.Review;

@Repository
public interface ReviewRepository extends CrudRepository<Review, Long> {
	
	Review findReviewByTitle(String title);

	Review findReviewByCategory(String category);
	
	List<Review> OrderByRatingDesc();
}
