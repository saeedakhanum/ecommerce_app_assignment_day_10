package com.example.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.config.AppConfig;
import com.example.controller.ProductController;

public class ProductMain {
	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
		ProductController bean = context.getBean(ProductController.class);
		bean.purchaseProduct("Samsung");
		bean.getListOfItemsPurchased();
	}
}
