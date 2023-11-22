package com.order.mapper;

import org.springframework.stereotype.Component;

import com.order.dto.UserDto;
import com.order.entity.User;
import com.order.model.PostUser;

@Component
public class UserMapper {
	
	public User postUsertoUser(PostUser postUser) {
		return User.builder()
					.name(postUser.getName())
					.build();
		
	}
	
	public UserDto UsertoUserDto(User user) {
		return UserDto.builder()
					.name(user.getName())
					.id(user.getId())
					.build();
		
	}
	
}
