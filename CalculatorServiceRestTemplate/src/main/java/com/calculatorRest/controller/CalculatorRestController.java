package com.calculatorRest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.calculatorRest.client.CalculatorClient;

@RestController
public class CalculatorRestController {

	@Autowired
	private CalculatorClient calculatorClient;
	
	@GetMapping("/add")
	public int additionTwoNumbers(@RequestParam("no1") int no1, @RequestParam("no2") int no2) {
		return calculatorClient.addNumbers(no1, no2);
	}
	
	@GetMapping("/sub")
	public int subtractionTwoNumbers(@RequestParam("no1") int no1, @RequestParam("no2") int no2) {
		return calculatorClient.subNumbers(no1, no2);
	}
	
	@GetMapping("/mul")
	public int MultiplicationTwoNumbers(@RequestParam("no1") int no1, @RequestParam("no2") int no2) {
		return calculatorClient.mulNumbers(no1, no2);
	}
	
	@GetMapping("/div")
	public double DivisionTwoNumbers(@RequestParam("no1") int no1, @RequestParam("no2") int no2) {
		return calculatorClient.divNumbers(no1, no2);
	}
	
	@GetMapping("/sqrt")
	public double SquateRootOfANumber(@RequestParam("no") int no) {
		return calculatorClient.squareRootNumbers(no);
	}
	
}
