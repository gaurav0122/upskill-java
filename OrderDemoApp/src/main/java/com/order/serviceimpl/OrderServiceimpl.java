package com.order.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.entity.Order;
import com.order.entity.User;
import com.order.mapper.OrderMapper;
import com.order.model.PostOrder;
import com.order.repo.OrderRepo;
import com.order.service.OrderService;
import com.order.service.UserService;

@Service
public class OrderServiceimpl implements OrderService{

	@Autowired
	private OrderRepo orderRepo;
	
	@Autowired
	private OrderMapper mapper;
	
	@Autowired
	private UserService service;
	
	@Override
	public Order postOrder(PostOrder order, int id) {
		Order orderset = mapper.postOrdertoOrder(order);
		User user = service.getUser(id);
		orderset.setUser(user);

		return orderRepo.save(orderset);
	}

}
