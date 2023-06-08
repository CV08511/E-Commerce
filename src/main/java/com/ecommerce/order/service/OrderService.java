package com.ecommerce.order.service;

import java.util.List;
import com.ecommerce.order.Entity.OrderEntity;

public interface OrderService {
	
	OrderEntity createOrder(OrderEntity orderEntity);
	OrderEntity getOrderById(Long OrderId);
	List<OrderEntity> getAllOrder();
	OrderEntity updateOrder(OrderEntity orderEntity);
	 void deleteOrder(Long id);
	

}
