package com.neu.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.neu.entity.Category;
import com.neu.repository.CategoryRepository;
import com.neu.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public List<Category> getAllCategories() {
		return categoryRepository.findAll();
	}

	@Override
	public Category getCategoryByID(int id) {
		return categoryRepository.findCategoryById(id);
	}

	@Override
	public void createCategory(Category category) {
		categoryRepository.save(category);

	}

	@Override
	public void updateCategory(Category category) {
		categoryRepository.save(category);

	}

	@Override
	public void deleteCategory(int id) {
		categoryRepository.deleteCategoryById(id);;

	}

}
