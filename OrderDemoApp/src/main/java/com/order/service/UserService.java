package com.order.service;

import com.order.entity.User;
import com.order.model.PostUser;

public interface UserService {

	User adduser(PostUser postUser);

	User getUser(int id);

}
