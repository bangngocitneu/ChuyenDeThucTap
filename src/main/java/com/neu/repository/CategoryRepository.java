package com.neu.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import com.neu.entity.Category;



@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

	public List<Category> findAll();
	public Category findCategoryById(int id);
	
	@Modifying
	@Transactional
	public void deleteCategoryById(int id);
}
