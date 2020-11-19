package com.imricki.message.rabbitmq.publisher;

import java.util.UUID;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.imricki.message.rabbitmq.config.MessagingConfig;
import com.imricki.message.rabbitmq.dto.Order;
import com.imricki.message.rabbitmq.dto.OrderStatus;

@RestController
@RequestMapping("/order")
public class OrderPublisher {
	
	
	@Autowired
	private RabbitTemplate template;

	@PostMapping(value = "/{restaurantName}",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String bookOrder(@RequestBody Order order, @PathVariable String restaurantName) {
		
		order.setOrderID(UUID.randomUUID().toString());
		
		//this call would point to another micro-service
		
		OrderStatus orderStatus = new OrderStatus(order,"PROCESS","ORDER WAS PLACED,OK IN " + restaurantName);
		
		//maping key and exchange to binded queue in config class
		template.convertAndSend(MessagingConfig.EXCHANGE,MessagingConfig.ROUTING_KEY,orderStatus);
		return "Succes!";
		
		
	}
}
