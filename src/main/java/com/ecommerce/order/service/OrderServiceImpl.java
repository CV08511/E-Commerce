package com.ecommerce.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.order.Entity.OrderEntity;
import com.ecommerce.order.dao.OrderDao;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderDao orderDao;
	@Override
	public OrderEntity createOrder(OrderEntity orderEntity) {
		// TODO Auto-generated method stub
		OrderEntity saveOrder=orderDao.save(orderEntity);
		return saveOrder;
	}

	@Override
	public OrderEntity getOrderById(Long OrderId) {
		// TODO Auto-generated method stub
		return orderDao.getOne(OrderId);
	}

	@Override
	public List<OrderEntity> getAllOrder() {
		// TODO Auto-generated method stub
		return orderDao.findAll();
	}

	@Override
	public OrderEntity updateOrder(OrderEntity orderEntity) {
		// TODO Auto-generated method stub
		orderDao.save(orderEntity);
		return orderEntity;
	}

	@Override
	public void deleteOrder(Long id) {
		// TODO Auto-generated method stub
		OrderEntity entity = orderDao.getOne(id);
		orderDao.delete(entity);
		
	}

}
