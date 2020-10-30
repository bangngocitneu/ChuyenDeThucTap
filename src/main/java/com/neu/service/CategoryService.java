package com.neu.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;

import com.neu.entity.Category;


public interface CategoryService {

	public List<Category> getAllCategories();
	public Category getCategoryByID(int id);
	public void createCategory(Category category);
	public void updateCategory(Category category);
	
	@Modifying
	@Transactional
	public void deleteCategory(int id);
}
