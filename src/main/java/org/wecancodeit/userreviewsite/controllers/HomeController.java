package org.wecancodeit.userreviewsite.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.wecancodeit.userreviewsite.models.Review;
import org.wecancodeit.userreviewsite.repositories.ReviewRepository;

@Controller
public class HomeController {
	
	ReviewRepository reviewRepo;

	@GetMapping("/")
	public String home() {
		return "home";
	}

	@GetMapping("/reviews") // list each review in HTML via th:each="person : ${people}"
	public String getReviews(Model model) {
		model.addAttribute("reviews", reviewRepo.findAll());
		return "review"; 
	}

	@GetMapping("/reviews/add")
	public String getReviewForm() {	
		return "writeareview";
	
	}
	
	@PostMapping("/reviews/add")
	public String addReview(String title, int rating, String imageURL, String author, String category, String content) {
		reviewRepo.save(new Review(title, rating, imageURL, author,  content, content));
		return "redirect:/reviews/" + title;
	}
		
	@GetMapping("/reviews/{title}")	
	public String getReview(@PathVariable String title, Model model) {
		model.addAttribute("review", reviewRepo.findReviewByTitle(title));
		return "verifyreview";		
	}
	
	
	
	

}
