package com.example.demo.client;

import org.springframework.stereotype.Component;

@Component
public class ImageServiceConfiguration implements ImageClient{

	
	@Override
	public String getInfo(int id) {
		
		return "Default Message from Feign";
	}

	@Override
	public String getImage(int id) {

		return "Default Image -Taj Mahal";
	}
	
}
