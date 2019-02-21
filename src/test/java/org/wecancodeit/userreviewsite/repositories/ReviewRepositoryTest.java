package org.wecancodeit.userreviewsite.repositories;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.wecancodeit.userreviewsite.models.Review;

public class ReviewRepositoryTest {

	ReviewRepository underTest;
	Review testReview;

	@Before
	public void setup() {
		underTest = new ReviewRepository(new ArrayList<Review>());
		testReview = new Review("title", 0, "imageURL", "author","category", "content");
	}

	@Test
	public void shouldBeAbleToAddOneReview() {
		int reviewsCountBeforeAdding = underTest.getCount();
		underTest.addReview(testReview);
		int reviewsCountAfterAdding = underTest.getCount();
		Assert.assertEquals(reviewsCountBeforeAdding + 1, reviewsCountAfterAdding);
	}

	@Test
	public void shouldBeAbleToRemoveOneReview() {
		underTest.addReview(testReview);
		int reviewsCountBeforeRemoving = underTest.getCount();
		underTest.removeReview(testReview);
		int reviewsCountAfterRemoving = underTest.getCount();
		Assert.assertEquals(reviewsCountBeforeRemoving - 1, reviewsCountAfterRemoving);
	}

}
