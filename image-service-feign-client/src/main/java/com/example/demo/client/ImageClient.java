package com.example.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name="IMAGES-SERVICE",fallback = ImageServiceConfiguration.class)
public interface ImageClient {

	
	
	@GetMapping(path = "/images/message/{id}")
	public String getInfo(@PathVariable("id") int id) ;
	
	
	@GetMapping(path = "/images/{id}")
	public String getImage(@PathVariable("id") int id) ;
		

}
