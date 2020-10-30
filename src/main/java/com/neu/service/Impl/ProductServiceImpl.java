package com.neu.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neu.entity.Product;
import com.neu.repository.ProductRepository;
import com.neu.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	@Override
	public Product getProductByID(int id) {
		return productRepository.findProductById(id);
	}

	@Override
	public void createProduct(Product product) {
		productRepository.save(product);

	}

	@Override
	public void updateProduct(Product product) {
		productRepository.save(product);

	}

	@Override
	public void deleteProduct(int id) {
		productRepository.deleteProductById(id);

	}

}
