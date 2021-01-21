package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@RestController
public class ImageClientController {

	
	
	@Autowired
	private RestTemplate template;


	 String baseURL = "http://IMAGES-SERVICE/images/";
	
	 @GetMapping(path = "/client/images/{id}")
	 
	 @HystrixCommand(fallbackMethod = "getImageFallBack",
	  commandProperties = @HystrixProperty(name ="execution.isolation.thread.timeoutInMilliseconds",value = "4000"))
	public String  getImage(@PathVariable("id") int id) {
		
		
	      String reqURL = baseURL+id;
	      
	    return this.template.getForObject(reqURL, String.class);  
		
	}

	
		public String  getImageFallBack(int id) {  
			
			String imageRef = "{'id':0,'imageRef':'images/default.jpg','defaultimage' 'sample'}";
			
			return imageRef;
		}

		
		@GetMapping(path = "/client/images/message/{id}")
		@HystrixCommand(fallbackMethod = "getInfoFallBack")
		public String getInfo(@PathVariable("id") int id)  {
			
		String reqURL = baseURL+"message/"+id;
		System.out.println("================"+reqURL);
	    return this.template.getForObject(reqURL, String.class);  

			}
			
		
		public String getInfoFallBack(int id ) {
			
			return "Fall Back Message -------";
		}
}
