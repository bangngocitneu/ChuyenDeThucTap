package com.neu.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neu.entity.Order;
import com.neu.repository.OrderRepository;
import com.neu.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public List<Order> getAllOrders() {
		return orderRepository.findAll();
	}

	@Override
	public Order getOrderById(int id) {
		return orderRepository.findOrderById(id);
	}

	@Override
	public void createOrder(Order order) {
		orderRepository.save(order);
	}

	@Override
	public void updateOrder(Order order) {
		orderRepository.save(order);

	}

	@Override
	public void deleteOrder(int id) {
		orderRepository.deleteById(id);

	}

}
