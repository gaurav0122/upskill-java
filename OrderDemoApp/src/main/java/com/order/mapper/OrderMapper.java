package com.order.mapper;

import com.order.dto.OrderDto;
import com.order.dto.UserDto;
import com.order.entity.Order;
import com.order.entity.User;
import com.order.model.PostOrder;
import com.order.model.PostUser;

public class OrderMapper {
	public Order postOrdertoOrder(PostOrder postOrder) {
		return Order.builder()
					.price(postOrder.getPrice())
					.productName(postOrder.getProductName())
					.quantity(postOrder.getQuantity())
					.build();
		
	}
	
	public OrderDto ordertoOrderDto(Order order) {
		return OrderDto.builder()
					.id(order.getId())
					.price(order.getPrice())
					.productName(order.getProductName())
					.quantity(order.getQuantity())
					.username(order.getUser().getName())
					.build();
		
	}
}
