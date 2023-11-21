package com.credit.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.credit.exception.NotValidCreditCard;

@RestControllerAdvice
public class GlobalExceptionHandler {

	
	@ExceptionHandler(value = NotValidCreditCard.class)
	public ResponseEntity<?> notValidCreditCard(NotValidCreditCard exception){
		return new ResponseEntity<>(exception.getMessage(),HttpStatus.EXPECTATION_FAILED);
	}
	
}
