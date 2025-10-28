package com.example.db;

import java.util.ArrayList;
import java.util.List;

public class DatabaseConnection {
	List<String> products;

	public void init() {
		products = new ArrayList<>();
		System.out.println("Database Connected");
	}

	public void addProduct(String product) {
		products.add(product);
	}

	public List<String> getPurchasedItems() {
		return products;
	}

	public void cleanup() {
		System.out.println("Database disconnected");
	}

}
