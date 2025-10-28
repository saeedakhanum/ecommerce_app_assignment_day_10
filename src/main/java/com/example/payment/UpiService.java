package com.example.payment;

import org.springframework.stereotype.Component;

@Component
public class UpiService implements PaymentService {

	@Override
	public void pay(String message) {

		System.out.println("UPI payment mode : " + message);

	}

}
