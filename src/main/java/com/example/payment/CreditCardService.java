package com.example.payment;

import org.springframework.stereotype.Component;

@Component
public class CreditCardService implements PaymentService {

	@Override
	public void pay(String message) {
		System.out.println("Credit card payment mode : " + message);

	}

}
