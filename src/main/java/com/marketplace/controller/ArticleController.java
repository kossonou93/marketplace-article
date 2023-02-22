package com.marketplace.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marketplace.entity.Article;
import com.marketplace.repository.ArticleRepository;

@RestController
@RequestMapping(value = "/marketplace/article")
public class ArticleController {
	
	@Autowired
	ArticleRepository articleRepository;
	
	@GetMapping("/all")
	public List<Article> getArticles(){
		return articleRepository.findAll();
	}
	
	@PostMapping("/add")
	public String saveArticle(@RequestBody Article article) {
		articleRepository.save(article);
		return "Article " + article.getDesignation() + " is added successfully";
	}

}
