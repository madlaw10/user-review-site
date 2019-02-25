package org.wecancodeit.userreviewsite.models;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.wecancodeit.userreviewsite.models.Review;

public class ReviewTest {

	Review underTest;

	@Before
	public void setup() {
//		underTest = new Review("title", 0, "imageURL", "author", "category", "content");
	}

	@Test
	public void testEditReviewContent() {
		String newReview = "edited content";
		underTest.edit(newReview);

		Assert.assertEquals("edited content", underTest.getContent());

	}
}
