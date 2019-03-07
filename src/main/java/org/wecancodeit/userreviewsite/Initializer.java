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

		ReviewTag tagZero = reviewTagRepo.save(new ReviewTag("gross"));
		ReviewTag tagOne = reviewTagRepo.save(new ReviewTag("dangerous"));
		ReviewTag tagTwo = reviewTagRepo.save(new ReviewTag("expensive"));
		ReviewTag tagThree = reviewTagRepo.save(new ReviewTag("silent but deadly"));
		ReviewTag tagFour = reviewTagRepo.save(new ReviewTag("stressful"));
		ReviewTag tagFive = reviewTagRepo.save(new ReviewTag("free"));
		ReviewTag tagSix = reviewTagRepo.save(new ReviewTag("boring"));
		ReviewTag tagSeven = reviewTagRepo.save(new ReviewTag("thrilling"));
		ReviewTag tagEight = reviewTagRepo.save(new ReviewTag("time-consuming"));

		Category categoryOne = categoryRepo.save(new Category("Amusement & Entertainment"));
		Category categoryTwo = categoryRepo.save(new Category("Financial"));
		Category categoryThree = categoryRepo.save(new Category("Health & Wellness"));
		Category categoryFour = categoryRepo.save(new Category("Legal"));
		Category categoryFive = categoryRepo.save(new Category("Life-Threatening"));
		Category categorySix = categoryRepo.save(new Category("Professional"));
		Category categorySeven = categoryRepo.save(new Category("Vehicular"));

		reviewRepo.save(new Review("Swimming with Humans", 3, "https://i.imgur.com/EbyUSRX.png", "Ecco",
				"Disgusting! Get him off of me!", categoryOne, tagZero, tagThree, tagEight));

		reviewRepo.save(new Review("Riding a Roller Coaster", 1,
				"https://upload.wikimedia.org/wikipedia/commons/6/65/Luna_Park_Melbourne_scenic_railway.jpg",
				"AnthonyLam",
				"It's the scariest damn thing in the world.  I not only threw up, but I pooped my pants, I'll review those in another post.  "
						+ "The embarrasement of getting sick on myself was bad enough, I had to finish the ride covered in bodily fluids.  Would not recommend."
						+ " consequuntur assumenda debitis velit!",
				categoryOne, tagZero, tagSeven));

		reviewRepo.save(new Review("Fight Club", 5,
				"https://media.defense.gov/2009/May/21/158632/-1/-1/0/090521-M-1283D-184.jpg", "ty_durden",
				"The first rule of Fight Club is: You do not talk about Fight Club.  The Second Rul of Fight Club is: you DO NOT talk about Fight Club!"
						+ "  Third rule of Fight Club: Someone yells 'stop!', goes limp, or taps out the fight is over.  Fourth rule:  Only two guys to a fight."
						+ " I highly recommend it if you have dissociative identity disorder.",
				categoryOne, tagOne, tagSeven, tagFive));

		reviewRepo.save(new Review("Crop Dusting", 5,
				"https://upload.wikimedia.org/wikipedia/en/9/91/FireIce_Aerial_Drop.JPG", "mateofrito",
				"Passing by somebody, or " + " a group of people is fun and exciting.  I would highly recommend!",
				categoryOne, tagZero, tagThree, tagFive, tagSeven));

		reviewRepo.save(new Review("Opening a Bank Account", 3,
				"https://upload.wikimedia.org/wikipedia/commons/8/83/Toronto-Dominion_Bank_Branch%2C_London%2C_Ontario_%2821826616832%29.jpg",
				"M_Scott_DunMifflin",
				"If you ever wanted to feel like an adult, this is where it's at.  Just give the bank money and they will put it in their vault and hold it for you."
						+ " They sometimes have candy that you can eat while you are waiting.  You can even go online if you want to open an account, if you do the online route, you can eat anything you want!",
				categoryTwo, tagFive, tagSix));

		reviewRepo.save(new Review("Burying Your Gold", 4,
				"https://upload.wikimedia.org/wikipedia/en/e/e4/SteinbeckGrave.jpg", "madlaw10",
				"Burying your gold is great exercise and if you die before you did it back up, you left treasure for somebody else."
						+ "  I should mention I am burying the gold because the mob is looking for it, which is just quite exciting in itself.",
				categoryTwo, tagFive, tagSeven, tagEight));

		reviewRepo.save(new Review("Jogging", 3, "https://uccexpress.ie/wp-content/uploads/2018/10/jogging.jpg",
				"madlaw10",
				"The endorphins are cool and all, but at what cost. Prepare yourself to be bored out of your skull \r\n"
						+ "the entire time. Create a playlist to distract yourself, or self-administer a lobotomy so you just don't care.",
				categoryThree, tagFive, tagSix));

		reviewRepo.save(new Review("Flossing", 1,
				"https://upload.wikimedia.org/wikipedia/commons/a/aa/Dental_flossing_9344.JPG", "madlaw10",
				"Did it one time and my gums were spewing blood like a geyser. I'm never flossing again.",
				categoryThree, tagZero, tagSix));

		reviewRepo.save(new Review("Recouping Your Safety Deposit", 5,
				"https://c1.staticflickr.com/4/3207/5802137177_860cb4bf70_b.jpg", "madlaw10",
				"Lorem ipsum dolor sit, amet consectetur adipisicing elit. Beatae cupiditate tempore deserunt odit"
						+ " provident dolore architecto eius et quia temporibus harum ratione quisquam excepturi totam repellat,"
						+ " consequuntur assumenda debitis velit!",
				categoryFour, tagEight));

		reviewRepo.save(new Review("Getting Divorced", 5,
				"https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/Pictures_Not_Yet_Available.svg/1138px-Pictures_Not_Yet_Available.svg.png",
				"madlaw10",
				"Lorem ipsum dolor sit, amet consectetur adipisicing elit. Beatae cupiditate tempore deserunt odit"
						+ " provident dolore architecto eius et quia temporibus harum ratione quisquam excepturi totam repellat,"
						+ " consequuntur assumenda debitis velit!",
				categoryFour, tagTwo, tagFour, tagEight));

		reviewRepo.save(new Review("Skydiving", 0,
				"https://upload.wikimedia.org/wikipedia/en/e/eb/Spaceball_jump_over_Skydive_35.jpg", "madlaw10",
				"AHHHHHHHHHHHHHHH", categoryFive, tagOne, tagSeven));

		reviewRepo.save(new Review("Foregoing Vaccinations", 0,
				"https://upload.wikimedia.org/wikipedia/commons/4/4a/%22_15_-_ITALY_-_Oli_essenziali_puri_naturali_e_fragranze_ipoallergeniche_-_Pure_natural_essential_oils_and_hypoallergenic_fragrances.JPG",
				"madlaw10", "Oh shit, I'm dying.", categoryFive, tagOne, tagFive));

		reviewRepo.save(new Review("Getting Fired", 1,
				"https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/Pictures_Not_Yet_Available.svg/1138px-Pictures_Not_Yet_Available.svg.png",
				"madlaw10",
				"Lorem ipsum dolor sit, amet consectetur adipisicing elit. Beatae cupiditate tempore deserunt odit"
						+ " provident dolore architecto eius et quia temporibus harum ratione quisquam excepturi totam repellat,"
						+ " consequuntur assumenda debitis velit!",
				categorySix, tagFour));

		reviewRepo.save(new Review("Quitting", 5,
				"https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/Pictures_Not_Yet_Available.svg/1138px-Pictures_Not_Yet_Available.svg.png",
				"madlaw10",
				"Lorem ipsum dolor sit, amet consectetur adipisicing elit. Beatae cupiditate tempore deserunt odit"
						+ " provident dolore architecto eius et quia temporibus harum ratione quisquam excepturi totam repellat,"
						+ " consequuntur assumenda debitis velit!",
				categorySix, tagFour, tagSeven));

		reviewRepo.save(new Review("Negotiating a Raise", 3,
				"https://cdn.pixabay.com/photo/2018/02/14/10/28/business-3152586_960_720.jpg", "madlaw10",
				"Lorem ipsum dolor sit, amet consectetur adipisicing elit. Beatae cupiditate tempore deserunt odit"
						+ " provident dolore architecto eius et quia temporibus harum ratione quisquam excepturi totam repellat,"
						+ " consequuntur assumenda debitis velit!",
				categorySix, tagFour));

		reviewRepo.save(new Review("Sitting in Traffic", 1,
				"https://upload.wikimedia.org/wikipedia/commons/7/72/Bangkok_traffic_by_g-hat.jpg", "madlaw10",
				"Lorem ipsum dolor sit, amet consectetur adipisicing elit. Beatae cupiditate tempore deserunt odit"
						+ " provident dolore architecto eius et quia temporibus harum ratione quisquam excepturi totam repellat,"
						+ " consequuntur assumenda debitis velit!",
				categorySeven, tagEight));

		reviewRepo.save(new Review("Receiving a Speeding Ticket", 1,
				"https://c1.staticflickr.com/4/3145/3076290635_2923b35e3a_b.jpg", "madlaw10",
				"Lorem ipsum dolor sit, amet consectetur adipisicing elit. Beatae cupiditate tempore deserunt odit"
						+ " provident dolore architecto eius et quia temporibus harum ratione quisquam excepturi totam repellat,"
						+ " consequuntur assumenda debitis velit!",
				categorySeven, tagEight, tagFour));

	}

}
