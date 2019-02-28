package org.wecancodeit.userreviewsite.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.wecancodeit.userreviewsite.repositories.CategoryRepository;
import org.wecancodeit.userreviewsite.repositories.ReviewRepository;

@Controller
public class HomeController {
	
	@Resource
	CategoryRepository categoryRepo;
	
	@Resource
	ReviewRepository reviewRepo;

	@GetMapping("/")
	public String getCategories(Model model) {
		model.addAttribute("categories", categoryRepo.findAll());
		return "home";
	}

	@GetMapping("/experience") 
	public String getReviews(Model model) {
		return "experience";
	}
	
	@GetMapping("/{type}")
	public String getCategory(@PathVariable String type, Model model) {
		model.addAttribute("category", categoryRepo.findCategoryByType(type));
		return "category";
	}
	
	@GetMapping("/review/{title}")
	public String getReview(@PathVariable String title, Model model) {
		model.addAttribute("review", reviewRepo.findReviewByTitle(title));
		return "review-single";
	}
	
	
}
