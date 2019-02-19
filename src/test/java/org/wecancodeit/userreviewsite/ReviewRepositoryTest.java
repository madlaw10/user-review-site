package org.wecancodeit.userreviewsite;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReviewRepositoryTest {

	ReviewRepository underTest;
	Review testReview;

	@Before
	public void setup() {
		underTest = new ReviewRepository();
		testReview = new Review(123, "title", 0, "author", null, "category", "content");
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

	@Test
	public void shouldBeAbleToFindOneReview() {
		underTest.addReview(testReview);
		Review foundReview = underTest.findReview(testReview.getId());
		Assert.assertEquals(testReview, foundReview);
		
	}

}
