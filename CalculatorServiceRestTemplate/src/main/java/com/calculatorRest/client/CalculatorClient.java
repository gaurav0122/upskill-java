package com.calculatorRest.client;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CalculatorClient {

	@Autowired
	private RestTemplate restTemplate;

	public int addNumbers(int no1, int no2) {

		Map<String, String> map = new HashMap<>();
		map.put("no1", String.valueOf(no1));
		map.put("no2", String.valueOf(no2));
//		System.out.println(no1+" "+no2);
		String uri = "http://localhost:8082/cal/add?no1={no1}&no2={no2}";
		return restTemplate.exchange(uri, HttpMethod.GET, null, Integer.class, map).getBody();
	}

	public int subNumbers(int no1, int no2) {

		Map<String, String> map = new HashMap<>();
		map.put("no1", String.valueOf(no1));
		map.put("no2", String.valueOf(no2));
//		System.out.println(no1+" "+no2);
		String uri = "http://localhost:8082/cal/sub?no1={no1}&no2={no2}";
		return restTemplate.exchange(uri, HttpMethod.GET, null, Integer.class, map).getBody();
	}

	public double squareRootNumbers(int no) {
		Map<String, String> map = new HashMap<>();
		map.put("no", String.valueOf(no));
//		System.out.println(no1+" "+no2);
		String uri = "http://localhost:8082/cal/sqrt?no={no}";
		return restTemplate.exchange(uri, HttpMethod.GET, null, Double.class, map).getBody();
	}

	public double divNumbers(int no1, int no2) {
		Map<String, String> map = new HashMap<>();
		map.put("no1", String.valueOf(no1));
		map.put("no2", String.valueOf(no2));
//		System.out.println(no1+" "+no2);
		String uri = "http://localhost:8082/cal/div?no1={no1}&no2={no2}";
		return restTemplate.exchange(uri, HttpMethod.GET, null, Double.class, map).getBody();
	}

	public int mulNumbers(int no1, int no2) {
		Map<String, String> map = new HashMap<>();
		map.put("no1", String.valueOf(no1));
		map.put("no2", String.valueOf(no2));
//		System.out.println(no1+" "+no2);
		String uri = "http://localhost:8082/cal/mul?no1={no1}&no2={no2}";
		return restTemplate.exchange(uri, HttpMethod.GET, null, Integer.class, map).getBody();
	}
	
	

}
