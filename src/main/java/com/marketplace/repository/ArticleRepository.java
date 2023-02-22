package com.marketplace.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.marketplace.entity.Article;

public interface ArticleRepository extends MongoRepository<Article, Long>{

}
