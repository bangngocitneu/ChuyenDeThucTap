package com.neu.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;

import com.neu.entity.Customer;

public interface CustomerService {

	public List<Customer> getAllCustomers();
	public Customer getCustomerByID(int id);
	public void createCustomer(Customer customer);
	public void updateCustomer(Customer customer);
	
	@Modifying
	@Transactional
	public void deleteCustomer(int id);
}
