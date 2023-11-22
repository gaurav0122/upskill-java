package com.employee.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandler {

	
	@org.springframework.web.bind.annotation.ExceptionHandler(value = RuntimeException.class)
	public ResponseEntity<?> handleRuntimeException(RuntimeException e){
		return new ResponseEntity<>(e.getMessage(),HttpStatus.EXPECTATION_FAILED);
	}
}
