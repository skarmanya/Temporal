package com.clone.workflow.temporal;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="paymentproxy", url="http://127.0.0.1:9002")
public interface PaymentProxy {
	@GetMapping("/payment/{id}")
	public String confirmPayment(@PathVariable String id);
}
