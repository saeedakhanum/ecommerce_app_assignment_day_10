package com.example.controller;

import java.util.List;

import org.springframework.stereotype.Controller;

import com.example.service.ProductService;

@Controller
public class ProductController {

	private ProductService productService;

	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	public void purchaseProduct(String product) {
		productService.purchaseProduct(product);
		System.out.println("Product purchased successfully");
	}

	public void getListOfItemsPurchased() {
		List<String> itemsPurchased = productService.puchasedItemsList();
		System.out.println("List of items purchased : " + itemsPurchased);
	}
}
