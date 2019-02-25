package org.wecancodeit.userreviewsite;
import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.wecancodeit.userreviewsite.models.Category;
import org.wecancodeit.userreviewsite.models.Review;
import org.wecancodeit.userreviewsite.repositories.CategoryRepository;
import org.wecancodeit.userreviewsite.repositories.ReviewRepository;

@Service
public class Initializer implements CommandLineRunner {
	
	@Resource
	ReviewRepository reviewRepo;

	@Resource
	CategoryRepository categoryRepo;


	@Override
	public void run(String... args) throws Exception {
		Category category = categoryRepo.save(new Category("Amusement"));
		reviewRepo.save(new Review("test title", 0, "test image", "test author", "test content", category));
	}

}
