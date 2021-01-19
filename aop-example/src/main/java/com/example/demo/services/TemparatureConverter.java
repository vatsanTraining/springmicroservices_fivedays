package com.example.demo.services;

import com.example.demo.ifaces.Converter;

public class TemparatureConverter implements Converter {

	@Override
	public double convert(double sourceValue) {
		
		return (sourceValue-32)* (5/9);
		
	}

}
