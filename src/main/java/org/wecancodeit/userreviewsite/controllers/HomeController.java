package org.wecancodeit.userreviewsite.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.wecancodeit.userreviewsite.repositories.CategoryRepository;

@Controller
public class HomeController {
	
//	@Resource
//	CategoryRepository categoryRepo;

	@GetMapping("/")
	public String getCategories(Model model) {
//		model.addAttribute("categories", categoryRepo.findAll());
		return "home";
	}

	@GetMapping("/experience") 
	public String getReviews(Model model) {
		return "experience";
	}
	
	@GetMapping("/{tag}")
	public String getCategory(@PathVariable String tag, Model model) {
//		model.addAttribute("category", categoryRepo.findCategoryByTag(tag));
		return "category";
	}
	
	
}
