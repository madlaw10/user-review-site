package org.wecancodeit.userreviewsite.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.userreviewsite.models.Category;
import org.wecancodeit.userreviewsite.models.Review;
import org.wecancodeit.userreviewsite.repositories.CategoryRepository;
import org.wecancodeit.userreviewsite.repositories.ReviewRepository;

@Controller
@RequestMapping("/reviews")
public class ReviewsController {

	@Resource
	ReviewRepository reviewRepo;

	@Resource
	CategoryRepository categoryRepo;

	@GetMapping("/add")
	public String getReviewForm() {
		return "reviews-add";
	}

	@PostMapping("/add")
	public String addReview(String title, int rating, String imageURL, String author, String content, String tag) {
		Category category = categoryRepo.findCategoryByTag(tag);
		if (category == null) {
			category = categoryRepo.save(new Category(tag));
		} 
		reviewRepo.save(new Review(title, rating, imageURL, author, content, category));
		return "redirect:/reviews/" + title;
	}

	@GetMapping("/{title}")
	public String getReview(@PathVariable String title, Model model) {
		model.addAttribute("review", reviewRepo.findReviewByTitle(title));
		return "reviews-verify";
	}

}
