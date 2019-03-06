package org.wecancodeit.userreviewsite;


import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.wecancodeit.userreviewsite.models.Category;
import org.wecancodeit.userreviewsite.models.Review;
import org.wecancodeit.userreviewsite.models.ReviewTag;
import org.wecancodeit.userreviewsite.repositories.CategoryRepository;
import org.wecancodeit.userreviewsite.repositories.ReviewRepository;
import org.wecancodeit.userreviewsite.repositories.ReviewTagRepository;

@Service
public class Initializer implements CommandLineRunner {
	
	@Resource
	ReviewRepository reviewRepo;

	@Resource
	CategoryRepository categoryRepo;
	
	@Resource
	ReviewTagRepository reviewTagRepo;


	@Override
	public void run(String... args) throws Exception {
		ReviewTag tagZero = reviewTagRepo.save(new ReviewTag("silent but deadly"));
		ReviewTag tagOne = reviewTagRepo.save(new ReviewTag("thrilling"));
		ReviewTag tagTwo = reviewTagRepo.save(new ReviewTag("free"));
		ReviewTag tagThree = reviewTagRepo.save(new ReviewTag("boring"));
		ReviewTag tagFour = reviewTagRepo.save(new ReviewTag("time-consuming"));
		ReviewTag tagFive = reviewTagRepo.save(new ReviewTag("expensive"));
		ReviewTag tagSix = reviewTagRepo.save(new ReviewTag("stressful"));
		ReviewTag tagSeven = reviewTagRepo.save(new ReviewTag("gross"));
		
		Category categoryOne = categoryRepo.save(new Category("Amusement & Entertainment"));
		reviewRepo.save(new Review("Riding a Roller Coaster", 5, "https://uccexpress.ie/wp-content/uploads/2018/10/jogging.jpg", 
				"madlaw10", "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Beatae cupiditate tempore deserunt odit" + 
						" provident dolore architecto eius et quia temporibus harum ratione quisquam excepturi totam repellat," + 
						" consequuntur assumenda debitis velit!", 
						categoryOne, tagOne));
		reviewRepo.save(new Review("Going to a Music Festival", 2, "https://uccexpress.ie/wp-content/uploads/2018/10/jogging.jpg", 
				"madlaw10", "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Beatae cupiditate tempore deserunt odit" + 
						" provident dolore architecto eius et quia temporibus harum ratione quisquam excepturi totam repellat," + 
						" consequuntur assumenda debitis velit!", 
						categoryOne, tagFive));
		reviewRepo.save(new Review("Crop Dusting", 5, "https://uccexpress.ie/wp-content/uploads/2018/10/jogging.jpg",
				"mateofrito",
				"Passing by somebody, or " + " a group of people is fun and exciting.  I would highly recommend!",
				categoryOne, tagZero, tagTwo));
		
		Category categoryTwo = categoryRepo.save(new Category("Financial"));
		reviewRepo.save(new Review("Opening a Bank Account", 3, "https://uccexpress.ie/wp-content/uploads/2018/10/jogging.jpg", 
				"madlaw10", "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Beatae cupiditate tempore deserunt odit" + 
						" provident dolore architecto eius et quia temporibus harum ratione quisquam excepturi totam repellat," + 
						" consequuntur assumenda debitis velit!", 
						categoryTwo, tagTwo, tagThree));
		reviewRepo.save(new Review("Burying Your Gold", 5, "https://uccexpress.ie/wp-content/uploads/2018/10/jogging.jpg", 
				"madlaw10", "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Beatae cupiditate tempore deserunt odit" + 
						" provident dolore architecto eius et quia temporibus harum ratione quisquam excepturi totam repellat," + 
						" consequuntur assumenda debitis velit!", 
						categoryTwo, tagTwo, tagFour));
		
		Category categoryThree = categoryRepo.save(new Category("Health & Wellbeing"));
		reviewRepo.save(new Review("Jogging", 3, "https://uccexpress.ie/wp-content/uploads/2018/10/jogging.jpg", 
				"madlaw10", "The endorphins are cool and all, but at what cost. Prepare yourself to be bored out of your skull \r\n" + 
						"the entire time. Create a playlist to distract yourself, or self-administer a lobotomy so you just don't care.", 
						categoryThree, tagTwo, tagThree));
		reviewRepo.save(new Review("Flossing", 1, "https://images.medicaldaily.com/sites/medicaldaily.com/files/styles/headline/public/2015/06/27/flossing.jpg", 
				"madlaw10", "Did it one time and my gums were spewing blood like a geyser. I'm never flossing again.", 
						categoryThree, tagThree, tagSeven));
		
		Category categoryFour = categoryRepo.save(new Category("Legal"));
		reviewRepo.save(new Review("Recouping Your Safety Deposit", 5, "https://uccexpress.ie/wp-content/uploads/2018/10/jogging.jpg", 
				"madlaw10", "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Beatae cupiditate tempore deserunt odit" + 
						" provident dolore architecto eius et quia temporibus harum ratione quisquam excepturi totam repellat," + 
						" consequuntur assumenda debitis velit!", 
						categoryFour, tagFour, tagSix));
		reviewRepo.save(new Review("Getting Divorced", 5, "https://uccexpress.ie/wp-content/uploads/2018/10/jogging.jpg", 
				"madlaw10", "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Beatae cupiditate tempore deserunt odit" + 
						" provident dolore architecto eius et quia temporibus harum ratione quisquam excepturi totam repellat," + 
						" consequuntur assumenda debitis velit!", 
						categoryFour, tagFour, tagFive, tagSix));
		
		Category categoryFive = categoryRepo.save(new Category("Life-Threatening"));
		reviewRepo.save(new Review("Skydiving", 0, "https://www.skydivelongisland.com/images/article/Skydive-Tracking.jpg", 
				"madlaw10", "AHHHHHHHHHHHHHHH", 
						categoryFive, tagOne));
		reviewRepo.save(new Review("Foregoing Vaccinations", 0, "https://www.skydivelongisland.com/images/article/Skydive-Tracking.jpg", 
				"madlaw10", "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Beatae cupiditate tempore deserunt odit" + 
						" provident dolore architecto eius et quia temporibus harum ratione quisquam excepturi totam repellat," + 
						" consequuntur assumenda debitis velit!",
						categoryFive, tagTwo));
		
		Category categorySix = categoryRepo.save(new Category("Professional"));
		reviewRepo.save(new Review("Getting Fired", 1, "https://uccexpress.ie/wp-content/uploads/2018/10/jogging.jpg", 
				"madlaw10", "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Beatae cupiditate tempore deserunt odit" + 
						" provident dolore architecto eius et quia temporibus harum ratione quisquam excepturi totam repellat," + 
						" consequuntur assumenda debitis velit!", 
						categorySix, tagSix));
		reviewRepo.save(new Review("Quitting", 5, "https://uccexpress.ie/wp-content/uploads/2018/10/jogging.jpg", 
				"madlaw10", "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Beatae cupiditate tempore deserunt odit" + 
						" provident dolore architecto eius et quia temporibus harum ratione quisquam excepturi totam repellat," + 
						" consequuntur assumenda debitis velit!", 
						categorySix, tagOne));
		reviewRepo.save(new Review("Negotiating a Raise", 3, "https://uccexpress.ie/wp-content/uploads/2018/10/jogging.jpg", 
				"madlaw10", "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Beatae cupiditate tempore deserunt odit" + 
						" provident dolore architecto eius et quia temporibus harum ratione quisquam excepturi totam repellat," + 
						" consequuntur assumenda debitis velit!", 
						categorySix, tagSix));
		
		Category categorySeven = categoryRepo.save(new Category("Vehicular"));
		reviewRepo.save(new Review("Sitting in Traffic", 1, "https://uccexpress.ie/wp-content/uploads/2018/10/jogging.jpg", 
				"madlaw10", "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Beatae cupiditate tempore deserunt odit" + 
						" provident dolore architecto eius et quia temporibus harum ratione quisquam excepturi totam repellat," + 
						" consequuntur assumenda debitis velit!", 
						categorySeven, tagTwo, tagThree, tagFour));
		reviewRepo.save(new Review("Receiving a Speeding Ticket", 1, "https://uccexpress.ie/wp-content/uploads/2018/10/jogging.jpg", 
				"madlaw10", "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Beatae cupiditate tempore deserunt odit" + 
						" provident dolore architecto eius et quia temporibus harum ratione quisquam excepturi totam repellat," + 
						" consequuntur assumenda debitis velit!", 
						categorySeven, tagSix));
		

		

		
		
	
		
		
		
		
	}
	

}
