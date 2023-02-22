package com.marketplace.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Article")
public class Article {
	
	@Id
	private Long id;
	private String designation;
	private String description;
	private String quantity;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Article(String designation, String description, String quantity) {
		super();
		this.designation = designation;
		this.description = description;
		this.quantity = quantity;
	}

}
