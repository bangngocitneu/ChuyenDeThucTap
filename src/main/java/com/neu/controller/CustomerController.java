package com.neu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neu.entity.Customer;
import com.neu.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping(value="/getListCustomer")
	public ResponseEntity <?>getList() {
		return new ResponseEntity<>(customerService.getAllCustomers(),HttpStatus.OK);
	}

	@GetMapping(value="/{id}")
	public Customer getCustomer(@PathVariable(name="id") int id) {
		return customerService.getCustomerByID(id);
	}
	@PostMapping(value="/add")
	public void addCustomer(@RequestBody Customer customer) {
		customerService.createCustomer(customer);
	}
	@PutMapping(value="/update/{id}")
	public void updateCustomer(@PathVariable(name="id") int id,@RequestBody Customer customer ) {
		customer.setId(id);
		customerService.updateCustomer(customer);
	}
	@DeleteMapping(value="/delete/{id}")
	public void deleteCustomer(@PathVariable(name="id") int id) {
		customerService.deleteCustomer(id);;
	}
}
