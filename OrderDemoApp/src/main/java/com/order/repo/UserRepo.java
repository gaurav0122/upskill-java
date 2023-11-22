package com.order.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.order.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
