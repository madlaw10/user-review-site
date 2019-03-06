package org.wecancodeit.userreviewsite.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.wecancodeit.userreviewsite.models.Comment;
import org.wecancodeit.userreviewsite.repositories.CategoryRepository;
import org.wecancodeit.userreviewsite.repositories.CommentRepository;
import org.wecancodeit.userreviewsite.repositories.ReviewRepository;

@Controller
public class HomeController {

	@Resource
	CategoryRepository categoryRepo;

	@Resource
	ReviewRepository reviewRepo;
	
	@Resource CommentRepository commentRepo;

	@GetMapping("/")
	public String getCategories(Model model) {
		model.addAttribute("categories", categoryRepo.findAll());
		model.addAttribute("reviews", reviewRepo.findAll());
		model.addAttribute("topReviews", reviewRepo.OrderByRatingDesc());
		return "home";
	}

	@GetMapping("/category/{type}")
	public String getCategory(@PathVariable String type, Model model) {
		model.addAttribute("category", categoryRepo.findCategoryByType(type));
		return "category";
	}

}
