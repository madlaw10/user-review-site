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
		Category categoryOne = categoryRepo.save(new Category("Health & Wellbeing"));
		reviewRepo.save(new Review("Jogging", 3, "https://uccexpress.ie/wp-content/uploads/2018/10/jogging.jpg", 
				"madlaw10", "The endorphins are cool and all, but at what cost. Prepare yourself to be bored out of your skull \r\n" + 
						"the entire time. Create a playlist to distract yourself, or self-administer a lobotomy so you just don't care.", 
						categoryOne));
		reviewRepo.save(new Review("Flossing", 1, "https://images.medicaldaily.com/sites/medicaldaily.com/files/styles/headline/public/2015/06/27/flossing.jpg", 
				"madlaw10", "Did it one time and my gums were spewing blood like a geyser. I'm never flossing again.", 
						categoryOne));
		Category categoryTwo = categoryRepo.save(new Category("Life-Threatening"));
		reviewRepo.save(new Review("Sky Diving", 0, "https://www.skydivelongisland.com/images/article/Skydive-Tracking.jpg", 
				"madlaw10", "AHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH"
						+ "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", 
						categoryTwo));
	}
	

}
