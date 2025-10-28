package com.example.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.db.DatabaseConnection;

@Repository
public class ProductRepository {

	private DatabaseConnection db;

	public ProductRepository(DatabaseConnection db) {
		this.db = db;
	}

	public void saveProduct(String product) {
		db.addProduct(product);
	}

	public List<String> itemsList() {
		return db.getPurchasedItems();
		
	}

	

}
