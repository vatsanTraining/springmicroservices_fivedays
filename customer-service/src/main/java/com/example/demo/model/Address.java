package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Address {

	
	private String addressLine1;
	private String addressLine2;
	private String city;
	private long pincode;
	
	
}
