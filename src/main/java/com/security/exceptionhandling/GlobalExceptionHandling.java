package com.security.exceptionhandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.security.entity.ProductEntity;
import com.security.exception.ProductNotFoundException;

@RestControllerAdvice
public class GlobalExceptionHandling {
	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<Object> productException(ProductNotFoundException pnfe) {
		return new ResponseEntity<Object>(pnfe, HttpStatus.BAD_REQUEST);
	}
	
//	@ExceptionHandler(ProductNotFoundException.class)
//	public String productException() {
//		return "hello";
//	}
	
}
