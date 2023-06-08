package com.ecommerce.order.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.order.Entity.OrderEntity;

@Repository
public interface OrderDao extends JpaRepository<OrderEntity,Long>{

}
