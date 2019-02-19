package org.wecancodeit.userreviewsite;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReviewTest {
	Review underTest;

	@Before
	public void setup() {
		underTest = new Review(1, "title", 0, "author", null, "category", "content");
	}

	@Test
	public void testEditReviewContent() {
		String newReview = "edited content";
		underTest.edit(newReview);

		Assert.assertEquals("edited content", underTest.getContent());

	}
}
