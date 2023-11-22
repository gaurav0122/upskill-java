package com.order.dto;

import javax.persistence.OneToOne;

import com.order.entity.Order;
import com.order.entity.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {
private int id;
	
	private String productName;
	
	private long price;
	
	private int quantity;
	
	private String username;
}
