package com.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.data.Data;
import com.demo.model.Info;
import com.demo.model.User;

@RestController
@RequestMapping("/api")
public class DemoController {
	
	private List<User> list;
	private List<Info> info;
	private Data data;
	
//	@Autowired
	public DemoController(Data data) {
		this.data = data;
		list = data.getUserData();
		info = data.getInfoData();
	
	}

	@GetMapping("/hello")
	public ResponseEntity<?> demoApi(){
		
		return new ResponseEntity<>("Hello World !!", HttpStatus.OK);
	}
	
	@PostMapping("/authenticate")
	public ResponseEntity<?> userAuthenticate(@RequestBody User user){
//		User u = new User("user","pass");
//		
//		User y = User.builder()
//				.username("u")
//				.build();
//		
//		User u = new User();
//		u.setUsername(null);
//		u.setPassword(null);
//		boolean check = u.getUsername().equals(user.getUsername()) 
//				&& u.getPassword().equals(user.getPassword());
//		if(check) {
//			return ResponseEntity.ok("valid user");
//		}
				
		boolean check = list.stream().filter(u->u.getUsername().equals(user.getUsername()) 
				&& u.getPassword().equals(user.getPassword()))
				.findFirst().isPresent();
		
		if(check) {
			return ResponseEntity.ok("valid user");
		}
		

		return new ResponseEntity<>("Invalid User",HttpStatus.UNAUTHORIZED);
		
	}
	
	@GetMapping("/info/{zip}")
	public ResponseEntity<?> getInfo(@PathVariable("zip") long zipCode){
		
		
		Optional<Info> op= info.stream().filter(e->e.getZip()==zipCode).findFirst();
		if(op.isPresent()) {
			return ResponseEntity.ok(op.get());
		}
		return new ResponseEntity<>("Not found",HttpStatus.NOT_FOUND);
	}
	
	
	
	
}
