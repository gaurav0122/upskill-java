package com.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.dto.OrderDto;
import com.order.mapper.OrderMapper;
import com.order.model.PostOrder;
import com.order.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderMapper mapper;
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping("/{uid}")
	public ResponseEntity<?> postorder(@RequestBody PostOrder order,@PathVariable("uid") int id ) {
		return new ResponseEntity<>(mapper.ordertoOrderDto(orderService.postOrder(order,id)),HttpStatus.OK);
	}
	
	
	
	
	
}
