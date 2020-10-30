package com.neu.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import com.neu.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	public List<Customer> findAll();
	public Customer findCustomerById(int id);
	
	@Modifying
	@Transactional
	public void deleteCustomerById(int id);
}
