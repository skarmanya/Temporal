package com.sapient.payment.proxy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentProxyController {
	
	
	@GetMapping("/payment/{id}")
	public String confirmPayment(@PathVariable String id) {
		//System.out.println("Payment Processing..... ");
		return "Payment done for Order_" + id;
	}

}
