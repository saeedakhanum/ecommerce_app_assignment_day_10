package com.example.payment;

import org.springframework.stereotype.Component;

@Component
public class DebitCardService implements PaymentService {

	@Override
	public void pay(String message) {
		System.out.println("Debit card mode : " + message);
	}

}
