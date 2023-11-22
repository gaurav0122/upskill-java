package com.order.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.mapper.UserMapper;
import com.order.model.PostUser;
import com.order.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private UserMapper mapper;
	
	
	@PostMapping
	public ResponseEntity<?> postuser(@RequestBody PostUser postUser){
		
		return new ResponseEntity<>(mapper.UsertoUserDto( userService.adduser(postUser)), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getuser(@PathVariable int id){
		
		return new ResponseEntity<>(mapper.UsertoUserDto( userService.getUser(id)), HttpStatus.OK);
	}
}
