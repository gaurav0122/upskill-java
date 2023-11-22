package com.order.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.entity.User;
import com.order.mapper.UserMapper;
import com.order.model.PostUser;
import com.order.repo.UserRepo;
import com.order.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepo repo;
	
	@Autowired
	private UserMapper mapper;
	
	@Override
	public User adduser(PostUser postUser) {
		return repo.save(mapper.postUsertoUser(postUser));
	}

	@Override
	public User getUser(int id) {
		return repo.findById(id).orElseThrow(()-> new RuntimeException("User not found with these id"));
	}

	
}
