package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component(value = "lankaTour")
public class Tour {

	
	private int id;
	private String tourName;
	private double cost;
	
	
	public Tour() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tour(int id, String tourName, double cost) {
		super();
		this.id = id;
		this.tourName = tourName;
		this.cost = cost;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTourName() {
		return tourName;
	}
	public void setTourName(String tourName) {
		this.tourName = tourName;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Tour [id=" + id + ", tourName=" + tourName + ", cost=" + cost + "]";
	}
	
	
}
