package com.calculatorRest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorRestController {

	@GetMapping("/add")
	public int additionTwoNumbers(@RequestParam("no1") int no1, @RequestParam("no1") int no2) {
		return no1+no2;
	}
	
	@GetMapping("/add")
	public int subtractionTwoNumbers(@RequestParam("no1") int no1, @RequestParam("no1") int no2) {
		return no1+no2;
	}
	
	@GetMapping("/add")
	public int MultiplicationTwoNumbers(@RequestParam("no1") int no1, @RequestParam("no1") int no2) {
		return no1+no2;
	}
	
	@GetMapping("/add")
	public int DivisionTwoNumbers(@RequestParam("no1") int no1, @RequestParam("no1") int no2) {
		return no1+no2;
	}
	
	@GetMapping("/add")
	public double SquateRootOfANumber(@RequestParam("no") int no1) {
		return Math.sqrt(no1);
	}
	
}
