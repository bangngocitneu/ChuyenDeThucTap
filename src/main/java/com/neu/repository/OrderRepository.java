package com.neu.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import com.neu.entity.Order;


@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{

	public List<Order> findAll();
	public Order findOrderById(int id);
	
	@Modifying
	@Transactional
	public void deleteOrderById(int id);
}
