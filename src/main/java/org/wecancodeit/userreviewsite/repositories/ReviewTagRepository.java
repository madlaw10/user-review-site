package org.wecancodeit.userreviewsite.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.userreviewsite.models.ReviewTag;

public interface ReviewTagRepository extends CrudRepository<ReviewTag, Long> {
	
	ReviewTag findReviewTagsByTagsName(String tagsname);

}
