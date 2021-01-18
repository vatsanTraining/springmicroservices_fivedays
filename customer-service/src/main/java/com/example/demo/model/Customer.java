package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer {

	
	private int id;
	private String customerName;
	private String email;
	
	@Autowired
	private Address billingAddress;
	
}
