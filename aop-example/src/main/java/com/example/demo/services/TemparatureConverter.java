package com.example.demo.services;

import org.springframework.stereotype.Component;

import com.example.demo.ifaces.Converter;

@Component
public class TemparatureConverter implements Converter {

	@Override
	public double convert(double sourceValue) {
		
		return (sourceValue-32);
		
	}

}
