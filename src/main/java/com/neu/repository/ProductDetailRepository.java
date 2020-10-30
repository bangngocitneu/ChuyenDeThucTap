package com.neu.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import com.neu.entity.ProductDetail;

@Repository
public interface ProductDetailRepository extends JpaRepository<ProductDetail, Integer> {
	
	public List<ProductDetail> findAll();
	public ProductDetail findProductDetailById(int id);
	
	@Modifying
	@Transactional
	public void deleteProductDetailById(int id);

}
