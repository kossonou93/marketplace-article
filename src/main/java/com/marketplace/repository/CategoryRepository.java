package com.marketplace.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.marketplace.entity.Category;

public interface CategoryRepository extends MongoRepository<Category, Long>{

}
