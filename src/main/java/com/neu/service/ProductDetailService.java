package com.neu.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;


import com.neu.entity.ProductDetail;

public interface ProductDetailService {
	public List<ProductDetail> getAllProductDetails();
	public ProductDetail getProductDetailByID(int id);
	public void createProductDetail(ProductDetail productDetail);
	public void updateProductDetail(ProductDetail productDetail);
	
	@Modifying
	@Transactional
	public void deleteProductDetail(int id);

}
