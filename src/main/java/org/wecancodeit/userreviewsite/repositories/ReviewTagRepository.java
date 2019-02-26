package org.wecancodeit.userreviewsite.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.userreviewsite.models.ReviewTags;

public interface ReviewTagRepository extends CrudRepository<ReviewTags, Long> {
	
	ReviewTags findReviewTagsByTagsName(String tagsname);

}
