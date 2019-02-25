package org.wecancodeit.userreviewsite.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.wecancodeit.userreviewsite.models.Category;
import org.wecancodeit.userreviewsite.models.Review;
import org.wecancodeit.userreviewsite.repositories.ReviewRepository;

@Controller
public class HomeController {

	@Resource
	ReviewRepository reviewRepo;

	@GetMapping("/")
	public String home() {
		return "home";
	}

	@GetMapping("/experience") 
	public String getReviews(Model model) {
		return "experience";
	}
	
	@GetMapping("/{category}")
	public String getCategory(@PathVariable String category, Model model) {
		model.addAttribute("category", new Category(category).getReviews());
		return "category";
	}
	
	@GetMapping("/reviews/add")
	public String getReviewForm() {
		return "reviews-add";
	}

	@PostMapping("/reviews/add")
	public String addReview(String title, int rating, String imageURL, String author, String category, String content) {
		reviewRepo.save(new Review(title, rating, imageURL, author, category, content));
		return "redirect:/reviews/" + title;
	}

	@GetMapping("/reviews/{title}")
	public String getReview(@PathVariable String title, Model model) {
		model.addAttribute("review", reviewRepo.findReviewByTitle(title));
		return "reviews-verify";
	}

}
