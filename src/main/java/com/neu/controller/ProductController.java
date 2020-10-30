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

import com.neu.entity.Product;
import com.neu.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping(value="/getListProduct")
	public ResponseEntity <?>getList() {
		return new ResponseEntity<>(productService.getAllProducts(),HttpStatus.OK);
	}

	@GetMapping(value="/{id}")
	public Product getProduct(@PathVariable(name="id") int id) {
		return productService.getProductByID(id);
	}
	@PostMapping(value="/add")
	public void addProduct(@RequestBody Product product) {
		productService.createProduct(product);;
	}
	@PutMapping(value="/update/{id}")
	public void updateProduct(@PathVariable(name="id") int id,@RequestBody Product product ) {
		product.setId(id);
		productService.updateProduct(product);;
	}
	@DeleteMapping(value="/delete/{id}")
	public void deleteProduct(@PathVariable(name="id") int id) {
		productService.deleteProduct(id);;
	}
}
