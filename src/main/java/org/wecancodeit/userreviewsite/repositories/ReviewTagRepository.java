package org.wecancodeit.userreviewsite.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.userreviewsite.models.ReviewTag;

@Repository
public interface ReviewTagRepository extends CrudRepository<ReviewTag, Long> {
	
	ReviewTag findReviewTagByTagName(String tagName);

}
