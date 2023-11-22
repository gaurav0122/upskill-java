package com.order.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostOrder {

	private String productName;
	
	private long price;
	
	private int quantity;
}
