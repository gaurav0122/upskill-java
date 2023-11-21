package com.credit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.credit.service.CreditService;

@RestController
@RequestMapping("/api")
public class CreditController {

	
	private CreditService creditService;
	
	@Autowired
	public CreditController(CreditService creditService) {
		this.creditService = creditService;
	}



	@GetMapping("/validate/{cardnumber}")
	public ResponseEntity<?> validateCreditCard(@PathVariable String cardnumber){
		
		return new ResponseEntity<>(creditService.validateCreditcard(cardnumber), HttpStatus.OK);
	}
	
	
	
	
}
