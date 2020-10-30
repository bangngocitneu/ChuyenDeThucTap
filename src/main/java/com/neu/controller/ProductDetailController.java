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
import com.neu.entity.ProductDetail;
import com.neu.service.ProductDetailService;

@RestController
@RequestMapping("/productType")
public class ProductDetailController {

	@Autowired
	private ProductDetailService productDetailService;
	
	@GetMapping(value="/getListProductDetail")
	public ResponseEntity <?>getList() {
		return new ResponseEntity<>(productDetailService.getAllProductDetails(),HttpStatus.OK);
	}
		
	@GetMapping(value="/{id}")
	public Product getProductDetail(@PathVariable(name="id") int id) {
		return productDetailService.getProductDetailByID(id);
	}
	@PostMapping(value="/add")
	public void addProductDetail(@RequestBody ProductDetail productDetail) {
		productDetailService.createProductDetail(productDetail);;;
	}
		@PutMapping(value="/update/{id}")
		public void updateProductDetail(@PathVariable(name="id") int id,@RequestBody ProductDetail productDetail ) {
			productDetail.setId(id);
			productDetailService.updateProductDetail(productDetail);
		}
		@DeleteMapping(value="/delete/{id}")
		public void deleteProductDetail(@PathVariable(name="id") int id) {
			productDetailService.getProductDetailByID(id);
		}
	
}
