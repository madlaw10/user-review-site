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
		ReviewTag tagTest = reviewTagRepo.save(new ReviewTag("testing"));
		Category categoryOne = categoryRepo.save(new Category("Amusement & Entertainment"));
		Review reviewOne = reviewRepo.save(new Review("Riding a Roller Coaster", 5, "https://uccexpress.ie/wp-content/uploads/2018/10/jogging.jpg", 
				"madlaw10", "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Beatae cupiditate tempore deserunt odit" + 
						" provident dolore architecto eius et quia temporibus harum ratione quisquam excepturi totam repellat," + 
						" consequuntur assumenda debitis velit!", 
						categoryOne, tagTest));
		Review reviewTwo = reviewRepo.save(new Review("Going to a Music Festival", 2, "https://uccexpress.ie/wp-content/uploads/2018/10/jogging.jpg", 
				"madlaw10", "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Beatae cupiditate tempore deserunt odit" + 
						" provident dolore architecto eius et quia temporibus harum ratione quisquam excepturi totam repellat," + 
						" consequuntur assumenda debitis velit!", 
						categoryOne, tagTest));
		
		Category categoryTwo = categoryRepo.save(new Category("Financial"));
		Review reviewThree = reviewRepo.save(new Review("Opening a Bank Account", 3, "https://uccexpress.ie/wp-content/uploads/2018/10/jogging.jpg", 
				"madlaw10", "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Beatae cupiditate tempore deserunt odit" + 
						" provident dolore architecto eius et quia temporibus harum ratione quisquam excepturi totam repellat," + 
						" consequuntur assumenda debitis velit!", 
						categoryTwo, tagTest));
		Review reviewFour = reviewRepo.save(new Review("Burying Your Gold", 5, "https://uccexpress.ie/wp-content/uploads/2018/10/jogging.jpg", 
				"madlaw10", "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Beatae cupiditate tempore deserunt odit" + 
						" provident dolore architecto eius et quia temporibus harum ratione quisquam excepturi totam repellat," + 
						" consequuntur assumenda debitis velit!", 
						categoryTwo, tagTest));
		
		Category categoryThree = categoryRepo.save(new Category("Health & Wellbeing"));
		Review reviewFive = reviewRepo.save(new Review("Jogging", 3, "https://uccexpress.ie/wp-content/uploads/2018/10/jogging.jpg", 
				"madlaw10", "The endorphins are cool and all, but at what cost. Prepare yourself to be bored out of your skull \r\n" + 
						"the entire time. Create a playlist to distract yourself, or self-administer a lobotomy so you just don't care.", 
						categoryThree, tagTest));
		Review reviewSix = reviewRepo.save(new Review("Flossing", 1, "https://images.medicaldaily.com/sites/medicaldaily.com/files/styles/headline/public/2015/06/27/flossing.jpg", 
				"madlaw10", "Did it one time and my gums were spewing blood like a geyser. I'm never flossing again.", 
						categoryThree, tagTest));
		
		Category categoryFour = categoryRepo.save(new Category("Legal"));
		Review reviewSeven = reviewRepo.save(new Review("Recouping Your Safety Deposit", 5, "https://uccexpress.ie/wp-content/uploads/2018/10/jogging.jpg", 
				"madlaw10", "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Beatae cupiditate tempore deserunt odit" + 
						" provident dolore architecto eius et quia temporibus harum ratione quisquam excepturi totam repellat," + 
						" consequuntur assumenda debitis velit!", 
						categoryFour, tagTest));
		Review reviewFifteen = reviewRepo.save(new Review("Getting Divorced", 5, "https://uccexpress.ie/wp-content/uploads/2018/10/jogging.jpg", 
				"madlaw10", "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Beatae cupiditate tempore deserunt odit" + 
						" provident dolore architecto eius et quia temporibus harum ratione quisquam excepturi totam repellat," + 
						" consequuntur assumenda debitis velit!", 
						categoryFour, tagTest));
		
		Category categoryFive = categoryRepo.save(new Category("Life-Threatening"));
		Review reviewEight = reviewRepo.save(new Review("Skydiving", 0, "https://www.skydivelongisland.com/images/article/Skydive-Tracking.jpg", 
				"madlaw10", "AHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH"
						+ "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH"
						+ "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", 
						categoryFive, tagTest));
		Review reviewNine = reviewRepo.save(new Review("Foregoing Vaccinations", 0, "https://www.skydivelongisland.com/images/article/Skydive-Tracking.jpg", 
				"madlaw10", "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Beatae cupiditate tempore deserunt odit" + 
						" provident dolore architecto eius et quia temporibus harum ratione quisquam excepturi totam repellat," + 
						" consequuntur assumenda debitis velit!",
						categoryFive, tagTest));
		
		Category categorySix = categoryRepo.save(new Category("Professional"));
		Review reviewTen = reviewRepo.save(new Review("Getting Fired", 1, "https://uccexpress.ie/wp-content/uploads/2018/10/jogging.jpg", 
				"madlaw10", "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Beatae cupiditate tempore deserunt odit" + 
						" provident dolore architecto eius et quia temporibus harum ratione quisquam excepturi totam repellat," + 
						" consequuntur assumenda debitis velit!", 
						categorySix, tagTest));
		Review reviewEleven = reviewRepo.save(new Review("Quitting", 5, "https://uccexpress.ie/wp-content/uploads/2018/10/jogging.jpg", 
				"madlaw10", "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Beatae cupiditate tempore deserunt odit" + 
						" provident dolore architecto eius et quia temporibus harum ratione quisquam excepturi totam repellat," + 
						" consequuntur assumenda debitis velit!", 
						categorySix, tagTest));
		Review reviewTwelve = reviewRepo.save(new Review("Negotiating a Raise", 3, "https://uccexpress.ie/wp-content/uploads/2018/10/jogging.jpg", 
				"madlaw10", "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Beatae cupiditate tempore deserunt odit" + 
						" provident dolore architecto eius et quia temporibus harum ratione quisquam excepturi totam repellat," + 
						" consequuntur assumenda debitis velit!", 
						categorySix, tagTest));
		
		Category categorySeven = categoryRepo.save(new Category("Vehicular"));
		Review reviewThirteen = reviewRepo.save(new Review("Sitting in Traffic", 1, "https://uccexpress.ie/wp-content/uploads/2018/10/jogging.jpg", 
				"madlaw10", "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Beatae cupiditate tempore deserunt odit" + 
						" provident dolore architecto eius et quia temporibus harum ratione quisquam excepturi totam repellat," + 
						" consequuntur assumenda debitis velit!", 
						categorySeven, tagTest));
		Review reviewFourteen = reviewRepo.save(new Review("Receiving a Speeding Ticket", 1, "https://uccexpress.ie/wp-content/uploads/2018/10/jogging.jpg", 
				"madlaw10", "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Beatae cupiditate tempore deserunt odit" + 
						" provident dolore architecto eius et quia temporibus harum ratione quisquam excepturi totam repellat," + 
						" consequuntur assumenda debitis velit!", 
						categorySeven, tagTest));
		
//		reviewTagRepo.save(new ReviewTag("thrilling", reviewOne, reviewEight, reviewEleven));
//		reviewTagRepo.save(new ReviewTag("free", reviewThree, reviewFour, reviewFive, reviewNine, reviewTen, reviewEleven, reviewTwelve, reviewFifteen));
//		reviewTagRepo.save(new ReviewTag("boring", reviewThree, reviewFive, reviewSix, reviewSeven, reviewThirteen));
//		reviewTagRepo.save(new ReviewTag("fun", reviewOne));
//		reviewTagRepo.save(new ReviewTag("time-consuming", reviewTwo, reviewFour, reviewFive, reviewSeven, reviewThirteen, reviewFifteen));
//		reviewTagRepo.save(new ReviewTag("expensive", reviewFourteen, reviewFifteen));
//		reviewTagRepo.save(new ReviewTag("stressful", reviewTwelve, reviewFourteen, reviewFifteen));
		//create review
		Review reviewDusting = reviewRepo.save(new Review("Crop Dusting", 5, "https://uccexpress.ie/wp-content/uploads/2018/10/jogging.jpg", "mateofrito", "Passing by somebody, or " +
				" a group of people is fun and exciting.  I would highly recommend!", categorySeven, tagTest));
		
		//create review tag
		ReviewTag tag1 = reviewTagRepo.save(new ReviewTag("silentbutdeadly"));
		//create tag reference to the review
//		reviewDusting.getReviewTags().add(tag1);
		reviewDusting.addTag(tag1);
		//add reference in the tag
//		tag1.getReviews().add(reviewDusting);
		//add the sumbitch to the repo
		reviewRepo.save(reviewDusting);
		
	
		
		
		
		
	}
	

}
