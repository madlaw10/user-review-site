package org.wecancodeit.userreviewsite.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.userreviewsite.models.Review;

public interface ReviewRepository extends CrudRepository<Review, Long> {

	Review findReviewByTitle(String title);

}
