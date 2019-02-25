package org.wecancodeit.userreviewsite.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.userreviewsite.models.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {

	Category findCategoryByTag(String tag);

}
