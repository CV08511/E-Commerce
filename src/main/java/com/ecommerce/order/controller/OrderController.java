package com.ecommerce.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.order.Entity.OrderEntity;
import com.ecommerce.order.service.OrderService;


@RestController
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping("/create")
    public OrderEntity createProduct(@RequestBody OrderEntity orderEntity)
    {
		return this.orderService.createOrder(orderEntity);
    }

	@GetMapping("/getOrder")
	public List<OrderEntity> getOrder()
	{
		return this.orderService.getAllOrder();
	}
	
	@GetMapping("/getOrder/{orderId}")
	public OrderEntity getOrderId(@PathVariable Long orderId)
	{
		return this.orderService.getOrderById(orderId);
	}
	
	@PutMapping("/Order")
	public OrderEntity updateOrder(@RequestBody OrderEntity orderEntity)
	{
		return this.orderService.updateOrder(orderEntity);
	}
	
	public ResponseEntity<HttpStatus> deleteProduct(@PathVariable Long orderId)
	{
		try {
			this.orderService.deleteOrder(orderId);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
