package com.example.demo.utils;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.example.demo.model.ErrorMessage;

@ControllerAdvice
public class ExceptionAdvice {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorMessage> handleException(Exception exception, WebRequest request){
		
		
		ErrorMessage message = new ErrorMessage(exception.getMessage(),LocalDateTime.now());
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(message);
		
		
	}
}
