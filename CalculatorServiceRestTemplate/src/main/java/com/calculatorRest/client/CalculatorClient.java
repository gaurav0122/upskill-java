package com.calculatorRest.client;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CalculatorClient {

	
	@Autowired
	private RestTemplate restTemplate;
	
	public int addNumbers(int no1,int no2) {
		Map<String,String> map = Collections.singletonMap(String.valueOf(no1), String.valueOf(no2));
		String uri = "http://localhost:8081/cal/add?no1:{no1}&no2:{no2}";
		return restTemplate.exchange(uri, HttpMethod.GET, null, Integer.class, map).getBody();
	}
}
