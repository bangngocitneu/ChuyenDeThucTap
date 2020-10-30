package com.neu.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;

import com.neu.entity.Order;

public interface OrderService {
	
	public List<Order> getAllOrders();
	public Order getOrderById(int id);
	public void createOrder(Order order);
	public void updateOrder(Order order);
	
	@Modifying
	@Transactional
	public void deleteOrder(int id);
	
	

}
