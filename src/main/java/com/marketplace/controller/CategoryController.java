package com.marketplace.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marketplace.entity.Category;
import com.marketplace.repository.CategoryRepository;

@RestController
@RequestMapping(value = "/marketplace/category")
public class CategoryController {

	@Autowired
	CategoryRepository categoryRepository;
	
	@GetMapping("/all")
	public List<Category> getCategories(){
		return categoryRepository.findAll();
	}
	
	@PostMapping("/add")
	public String saveArticle(@RequestBody Category category) {
		categoryRepository.save(category);
		return "Article " + category.getDescription() + " is added successfully";
	}
}
