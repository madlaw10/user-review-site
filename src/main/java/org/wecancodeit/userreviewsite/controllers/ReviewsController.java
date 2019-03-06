package org.wecancodeit.userreviewsite.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.userreviewsite.models.Category;
import org.wecancodeit.userreviewsite.models.Comment;
import org.wecancodeit.userreviewsite.models.Review;
import org.wecancodeit.userreviewsite.models.ReviewTag;
import org.wecancodeit.userreviewsite.repositories.CategoryRepository;
import org.wecancodeit.userreviewsite.repositories.CommentRepository;
import org.wecancodeit.userreviewsite.repositories.ReviewRepository;
import org.wecancodeit.userreviewsite.repositories.ReviewTagRepository;

@Controller
@RequestMapping("/reviews")
public class ReviewsController {

	@Resource
	ReviewRepository reviewRepo;

	@Resource
	CategoryRepository categoryRepo;
	
	@Resource
	ReviewTagRepository reviewTagRepo;
	
	@Resource
	CommentRepository commentRepo;

	@GetMapping("/all")
	public String getReviewsall(String review, Model model) {
		model.addAttribute("reviews", reviewRepo.findAll());
		return "reviews-all";
	}
	@GetMapping("/add")
	public String getReviewForm(String tag, Model model) {
		model.addAttribute("categories", categoryRepo.findAll());
		return "reviews-add";
	}

	@PostMapping("/add")
	public String addReview(String title, int rating, String imageURL, String author, String content, String type, String tag){
		Category category = categoryRepo.findCategoryByType(type);
		ReviewTag tagName = reviewTagRepo.save(new ReviewTag(tag));
		if (category == null) {
			category = categoryRepo.save(new Category(type));
		} 
		if (imageURL.isEmpty()) {
			imageURL = "https://picsum.photos/200/300/?blur";
		}
		Review newReview = reviewRepo.save(new Review(title, rating, imageURL, author, content, category, tagName));
		
		
		//my mess
		
//		Long id = newReview.getId();
//		Review foundReview = reviewRepo.findById(id).get();
//		
//		foundReview.addTag(reviewTagRepo.save(new ReviewTag(tag)));
//		reviewRepo.save(foundReview);
//		
		
		//the new variable is so we can pass an ID as the name of the page
		return "redirect:/reviews/" + newReview.getId();
	}
	
	@PostMapping("/{id}/add")
	public String addTagToReview(@PathVariable Long id, String tag) {
		Review foundReview = reviewRepo.findById(id).get();
		foundReview.addTag(reviewTagRepo.save(new ReviewTag(tag)));
		reviewRepo.save(foundReview);
		return "redirect:/reviews/" + id;
	}


	@GetMapping("/{id}")
	public String getReview(@PathVariable Long id,  Model model) {
		Review foundReview = reviewRepo.findById(id).get();
		model.addAttribute("review", foundReview);
		Category foundCategory = foundReview.getCategory();
		model.addAttribute("reviewsbycategory", foundCategory.getReviews());
    return "reviews-verify";
	}
	@GetMapping("/review/{id}")
	public String getSingleReview(@PathVariable Long id, Model model) {
		model.addAttribute("review", reviewRepo.findById(id).get());
		return "review-single";
	}
	@PostMapping("/review/{id}")
	public String addComment(@PathVariable Long id, String commentContent) {
		commentRepo.save(new Comment(commentContent, reviewRepo.findById(id).get()));
		return "redirect:/reviews/review/{id}";
	}
	

}
