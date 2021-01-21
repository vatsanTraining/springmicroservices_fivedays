package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component

public class Review {

	
	private int id;
	private String reviewedBy;
	private double rating;
	public Review() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getReviewedBy() {
		return reviewedBy;
	}
	public void setReviewedBy(String reviewedBy) {
		this.reviewedBy = reviewedBy;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Review [id=" + id + ", reviewedBy=" + reviewedBy + ", rating=" + rating + "]";
	}
	
	
}
