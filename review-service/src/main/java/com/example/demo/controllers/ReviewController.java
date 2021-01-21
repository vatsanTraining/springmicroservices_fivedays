package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Review;

@RestController
public class ReviewController {

	
	
	
	@Autowired
	private Review review;
	
	
	
	@GetMapping(path = "/api/v1/reviews/{id}")
	public Review getReviewById(@PathVariable("id") int id) {
		
		
	     if(id  <=5) {
	    	 
	    	 this.review.setId(102);
	    	 this.review.setReviewedBy("Manish");
	    	 this.review.setRating(4.5);
	     } else {
	    	 
	    	 
	    	 this.review.setId(103);
	    	 this.review.setReviewedBy("Harish");
	    	 this.review.setRating(4.2);
	     }
		
	     return this.review;
	}
}
