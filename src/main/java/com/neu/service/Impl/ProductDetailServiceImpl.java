package com.neu.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neu.entity.ProductDetail;
import com.neu.repository.ProductDetailRepository;
import com.neu.service.ProductDetailService;

@Service
public class ProductDetailServiceImpl implements ProductDetailService {

	
	@Autowired
	private ProductDetailRepository producDetailRepository;

	@Override
	public List<ProductDetail> getAllProductDetails() {
		
		return producDetailRepository.findAll();
	}

	@Override
	public ProductDetail getProductDetailByID(int id) {
		
		return producDetailRepository.findProductDetailById(id);
	}

	@Override
	public void createProductDetail(ProductDetail productDetail) {
		producDetailRepository.save(productDetail);
		
	}

	@Override
	public void updateProductDetail(ProductDetail productDetail) {
		producDetailRepository.save(productDetail);
		
	}

	@Override
	public void deleteProductDetail(int id) {
		producDetailRepository.deleteProductDetailById(id);
		
	}
	
	
	
}
