package com.demo.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.demo.model.Info;
import com.demo.model.User;

@Component
public class Data {

	List<User> list;
	List<Info> info;
	
	public List<User> getUserData() {
		list = new ArrayList<>();
		list.add(new User("user1", "pass1"));
		list.add(new User("user2", "pass2"));
		list.add(new User("user3", "pass3"));
		list.add(new User("user4", "pass4"));
		list.add(new User("user5", "pass5"));
		
		return list;
	}
	public List<Info> getInfoData() {
		info = new ArrayList<>();
		info.add(new Info(12, "MAH", "Pune", "India"));
		info.add(new Info(13, "Goa", "Mumbai", "India"));
		info.add(new Info(14, "UTT", "Delhi", "India"));
		info.add(new Info(15, "KOL", "Pak", "India"));
		info.add(new Info(16, "ANN", "URD", "India"));
		return info;
	}
	
}
