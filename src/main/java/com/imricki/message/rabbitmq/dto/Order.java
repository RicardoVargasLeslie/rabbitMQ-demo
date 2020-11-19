package com.imricki.message.rabbitmq.dto;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Order {

	public Order() {
	}
	
	private String orderID;
	private String name;
	private int quantity;
	private double price;
}
