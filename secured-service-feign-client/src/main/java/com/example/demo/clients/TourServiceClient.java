package com.example.demo.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.config.FeignSecurityConfig;

@FeignClient(name = "secured-tour-client",url ="http://localhost:6060/api/v1/tours",configuration = FeignSecurityConfig.class )
public interface TourServiceClient {

	
	@GetMapping(path = "/")
	public String getAll() ;
}
