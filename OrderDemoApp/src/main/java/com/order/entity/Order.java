package com.order.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String productName;
	
	private long price;
	
	private int quantity;
	
	@OneToOne
	private User user;
}
