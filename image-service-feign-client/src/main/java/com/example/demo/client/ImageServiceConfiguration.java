package com.example.demo.client;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ImageServiceConfiguration implements ImageClient{

	
	@Override
	public String getInfo(int id) {
		
		log.info("Default Get info called");
		return "Default Message from Feign";
	}

	@Override
	public String getImage(int id) {

		log.info("Default get Image called");
		return "Default Image -Taj Mahal";
	}
	
}
