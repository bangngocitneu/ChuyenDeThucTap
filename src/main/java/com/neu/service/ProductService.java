package com.neu.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;

import com.neu.entity.Product;



public interface ProductService{

	public List<Product> getAllProducts();
	public Product getProductByID(int id);
	public void createProduct(Product product);
	public void updateProduct(Product product);
	
	@Modifying
	@Transactional
	public void deleteProduct(int id);
}
