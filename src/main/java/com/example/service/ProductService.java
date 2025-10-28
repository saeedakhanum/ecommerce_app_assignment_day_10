package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.payment.PaymentService;
import com.example.repository.ProductRepository;

@Service
public class ProductService {

	private ProductRepository productRepository;

	private PaymentService paymentService;

	public ProductService(ProductRepository productRepository,
			@Qualifier("debitCardService") PaymentService paymentService) {
		this.productRepository = productRepository;
		this.paymentService = paymentService;
	}

	public void purchaseProduct(String product) {
		paymentService.pay("Transaction is successful");
		productRepository.saveProduct(product);
	}

	public List<String> puchasedItemsList() {
		return productRepository.itemsList();
	}

}
