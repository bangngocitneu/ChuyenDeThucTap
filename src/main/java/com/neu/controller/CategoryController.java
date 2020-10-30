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

import com.neu.entity.Category;
import com.neu.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	@GetMapping(value="/getListCategory")
	public ResponseEntity <?>getList() {
		return new ResponseEntity<>(categoryService.getAllCategories(), HttpStatus.OK);
	}

	@GetMapping(value="/{id}")
	public Category getCategory(@PathVariable(name="id") int id) {
		return categoryService.getCategoryByID(id);
	}
	@PostMapping(value="/add")
	public void addCategory(@RequestBody Category category) {
		categoryService.createCategory(category);
	}
	@PutMapping(value="/update/{id}")
	public void updateCategory(@PathVariable(name="id") int id,@RequestBody Category category ) {
		category.setId(id);
		categoryService.updateCategory(category);
	}
	@DeleteMapping(value="/delete/{id}")
	public void deleteCategory(@PathVariable(name="id") int id) {
		categoryService.deleteCategory(id);
	}
	
}
