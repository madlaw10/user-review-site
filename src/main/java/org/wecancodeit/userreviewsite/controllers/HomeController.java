package org.wecancodeit.userreviewsite.controllers;

import java.util.Date;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.wecancodeit.userreviewsite.models.Review;
import org.wecancodeit.userreviewsite.repositories.ReviewRepository;

@Controller
public class HomeController {
	
	private HashMap<Integer, Review> reviews = new HashMap<Integer, Review>();
	private ReviewRepository repository = new ReviewRepository(reviews);

	@GetMapping("/")
	public String home() {
		return "home";
	}

	@GetMapping("/reviews") // list each review in HTML via th:each="person : ${people}"
	public String getReviews(Model model) {
		model.addAttribute("reviews", repository.getReviews());
		return "reviews"; 
	}

	@GetMapping("/reviews/add")
	public String getReviewForm() {	
		return "reviews/add";
	
	}
	
	@PostMapping("/reviews/add")
	public String addReview(int id, String title, int rating, String author, Date date, String category, String content) {
		repository.addReview(new Review(id, title, rating, author, date, category, content));
		return "redirect:/reviews/verify";
	}
	
	@GetMapping("/reviews/verify")	
	public String getReview() {
		return "reviews/verify";		
		
	}
	
	
	
	

}
