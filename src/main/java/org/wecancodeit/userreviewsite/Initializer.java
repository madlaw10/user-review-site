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

		ReviewTag tag1 = reviewTagRepo.save(new ReviewTag("puke"));
		ReviewTag tag2 = reviewTagRepo.save(new ReviewTag("fight"));
		ReviewTag tag3 = reviewTagRepo.save(new ReviewTag("banks"));
		ReviewTag tag4 = reviewTagRepo.save(new ReviewTag("gold"));
		ReviewTag tag5 = reviewTagRepo.save(new ReviewTag("test"));
		ReviewTag tag6 = reviewTagRepo.save(new ReviewTag("test"));
		ReviewTag tag7 = reviewTagRepo.save(new ReviewTag("test"));
		Category categoryOne = categoryRepo.save(new Category("Amusement & Entertainment"));		
		Review reviewZero = reviewRepo.save(new Review("Swimming with Humans", 3, "https://i.imgur.com/EbyUSRX.png", "Ecco", "Disgusting!", categoryOne, tag1, tag2));
		Review reviewOne = reviewRepo.save(new Review("Riding a Roller Coaster", 1, "https://uccexpress.ie/wp-content/uploads/2018/10/jogging.jpg", 
				"AnthonyLam", "It's the scariest damn thing in the world.  I not only threw up, but I pooped my pants, I'll review those in another post.  " + 
						"The embarrasement of getting sick on myself was bad enough, I had to finish the ride covered in bodily fluids.  Would not recommend." + 
						" consequuntur assumenda debitis velit!", 
						categoryOne, tag1));
		Review reviewTwo = reviewRepo.save(new Review("Fight Club", 5, "https://uccexpress.ie/wp-content/uploads/2018/10/jogging.jpg", 
				"ty_durden", "The first rule of Fight Club is: You do not talk about Fight Club.  The Second Rul of Fight Club is: you DO NOT talk about Fight Club!" + 
						"  Third rule of Fight Club: Someone yells 'stop!', goes limp, or taps out the fight is over.  Fourth rule:  Only two guys to a fight." + 
						" I highly recommend it if you have dissociative identity disorder.", 
						categoryOne, tag2));
		
		Category categoryTwo = categoryRepo.save(new Category("Financial"));
		Review reviewThree = reviewRepo.save(new Review("Opening a Bank Account", 3, "https://uccexpress.ie/wp-content/uploads/2018/10/jogging.jpg", 
				"M_Scott_DunMifflin", "If you ever wanted to feel like an adult, this is where it's at.  Just give the bank money and they will put it in their vault and hold it for you." + 
						" They sometimes have candy that you can eat while you are waiting.  You can even go online if you want to open an account, if you do the online route, you can eat anything you want!" 
						, 
						categoryTwo, tag3));
		Review reviewFour = reviewRepo.save(new Review("Burying Your Gold", 5, "https://uccexpress.ie/wp-content/uploads/2018/10/jogging.jpg", 
				"madlaw10", "Burying your gold is great exercise and if you die before you did it back up, you left treasure for somebody else." + 
						"  I should mention I am burying the gold because the mob is looking for it, which is just quite exciting in itself.",
						categoryTwo, tag4));
		
		Category categoryThree = categoryRepo.save(new Category("Health & Wellbeing"));
		Review reviewFive = reviewRepo.save(new Review("Jogging", 3, "https://uccexpress.ie/wp-content/uploads/2018/10/jogging.jpg", 
				"madlaw10", "The endorphins are cool and all, but at what cost. Prepare yourself to be bored out of your skull \r\n" + 
						"the entire time. Create a playlist to distract yourself, or self-administer a lobotomy so you just don't care.", 
						categoryThree, tag5));
		Review reviewSix = reviewRepo.save(new Review("Flossing", 1, "https://images.medicaldaily.com/sites/medicaldaily.com/files/styles/headline/public/2015/06/27/flossing.jpg", 
				"madlaw10", "Did it one time and my gums were spewing blood like a geyser. I'm never flossing again.", 
						categoryThree, tag6));
		
		Category categoryFour = categoryRepo.save(new Category("Legal"));
		Review reviewSeven = reviewRepo.save(new Review("Recouping Your Safety Deposit", 5, "https://uccexpress.ie/wp-content/uploads/2018/10/jogging.jpg", 
				"madlaw10", "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Beatae cupiditate tempore deserunt odit" + 
						" provident dolore architecto eius et quia temporibus harum ratione quisquam excepturi totam repellat," + 
						" consequuntur assumenda debitis velit!", 
						categoryFour, tag7));
		Review reviewFifteen = reviewRepo.save(new Review("Getting Divorced", 5, "https://uccexpress.ie/wp-content/uploads/2018/10/jogging.jpg", 
				"madlaw10", "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Beatae cupiditate tempore deserunt odit" + 
						" provident dolore architecto eius et quia temporibus harum ratione quisquam excepturi totam repellat," + 
						" consequuntur assumenda debitis velit!", 
						categoryFour, tag3));
		
		Category categoryFive = categoryRepo.save(new Category("Life-Threatening"));
		Review reviewEight = reviewRepo.save(new Review("Skydiving", 0, "https://www.skydivelongisland.com/images/article/Skydive-Tracking.jpg", 
				"madlaw10", "AHHHHHHHHHHHHHHHHHHHHH", 
						categoryFive, tag2));
		Review reviewNine = reviewRepo.save(new Review("Foregoing Vaccinations", 0, "https://www.skydivelongisland.com/images/article/Skydive-Tracking.jpg", 
				"madlaw10", "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Beatae cupiditate tempore deserunt odit" + 
						" provident dolore architecto eius et quia temporibus harum ratione quisquam excepturi totam repellat," + 
						" consequuntur assumenda debitis velit!",
						categoryFive, tag1));
		
		Category categorySix = categoryRepo.save(new Category("Professional"));
		Review reviewTen = reviewRepo.save(new Review("Getting Fired", 1, "https://uccexpress.ie/wp-content/uploads/2018/10/jogging.jpg", 
				"madlaw10", "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Beatae cupiditate tempore deserunt odit" + 
						" provident dolore architecto eius et quia temporibus harum ratione quisquam excepturi totam repellat," + 
						" consequuntur assumenda debitis velit!", 
						categorySix, tag2));
		Review reviewEleven = reviewRepo.save(new Review("Quitting", 5, "https://uccexpress.ie/wp-content/uploads/2018/10/jogging.jpg", 
				"madlaw10", "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Beatae cupiditate tempore deserunt odit" + 
						" provident dolore architecto eius et quia temporibus harum ratione quisquam excepturi totam repellat," + 
						" consequuntur assumenda debitis velit!", 
						categorySix, tag3));
		Review reviewTwelve = reviewRepo.save(new Review("Negotiating a Raise", 3, "https://uccexpress.ie/wp-content/uploads/2018/10/jogging.jpg", 
				"madlaw10", "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Beatae cupiditate tempore deserunt odit" + 
						" provident dolore architecto eius et quia temporibus harum ratione quisquam excepturi totam repellat," + 
						" consequuntur assumenda debitis velit!", 
						categorySix, tag3));
		
		Category categorySeven = categoryRepo.save(new Category("Vehicular"));
		Review reviewThirteen = reviewRepo.save(new Review("Sitting in Traffic", 1, "https://uccexpress.ie/wp-content/uploads/2018/10/jogging.jpg", 
				"madlaw10", "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Beatae cupiditate tempore deserunt odit" + 
						" provident dolore architecto eius et quia temporibus harum ratione quisquam excepturi totam repellat," + 
						" consequuntur assumenda debitis velit!", 
						categorySeven, tag3));
		Review reviewFourteen = reviewRepo.save(new Review("Receiving a Speeding Ticket", 1, "https://uccexpress.ie/wp-content/uploads/2018/10/jogging.jpg", 
				"madlaw10", "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Beatae cupiditate tempore deserunt odit" + 
						" provident dolore architecto eius et quia temporibus harum ratione quisquam excepturi totam repellat," + 
						" consequuntur assumenda debitis velit!", 
						categorySeven, tag3));
		
//		reviewTagRepo.save(new ReviewTag("thrilling", reviewOne, reviewEight, reviewEleven));
//		reviewTagRepo.save(new ReviewTag("free", reviewThree, reviewFour, reviewFive, reviewNine, reviewTen, reviewEleven, reviewTwelve, reviewFifteen));
//		reviewTagRepo.save(new ReviewTag("boring", reviewThree, reviewFive, reviewSix, reviewSeven, reviewThirteen));
//		reviewTagRepo.save(new ReviewTag("fun", reviewOne));
//		reviewTagRepo.save(new ReviewTag("time-consuming", reviewTwo, reviewFour, reviewFive, reviewSeven, reviewThirteen, reviewFifteen));
//		reviewTagRepo.save(new ReviewTag("expensive", reviewFourteen, reviewFifteen));
//		reviewTagRepo.save(new ReviewTag("stressful", reviewTwelve, reviewFourteen, reviewFifteen));
		//create review
		Review reviewDusting = reviewRepo.save(new Review("Crop Dusting", 5, "https://uccexpress.ie/wp-content/uploads/2018/10/jogging.jpg", "mateofrito", "Passing by somebody, or " +
				" a group of people is fun and exciting.  I would highly recommend!", categorySeven, tag1));
		
		//create review tag
		ReviewTag tag10 = reviewTagRepo.save(new ReviewTag("silentbutdeadly"));
//		//create tag reference to the review
////		reviewDusting.getReviewTags().add(tag1);
//		reviewDusting.addTag(tag1);
//		//add reference in the tag
////		tag1.getReviews().add(reviewDusting);
//		//add the sumbitch to the repo
//		reviewRepo.save(reviewDusting);
		
		ReviewTag tag = reviewTagRepo.save(new ReviewTag("silentbutdeadly"));
		reviewRepo.save(new Review("Crop Dusting", 5, "https://uccexpress.ie/wp-content/uploads/2018/10/jogging.jpg",
				"mateofrito",
				"Passing by somebody, or " + " a group of people is fun and exciting.  I would highly recommend!",
				categoryOne, tag));
		
	
		
		
		
		

	}

}
