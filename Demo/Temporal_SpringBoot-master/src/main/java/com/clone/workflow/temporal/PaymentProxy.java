package com.clone.workflow.temporal;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="paymentproxy", url="172.20.203.72:9002")
public interface PaymentProxy {
	@GetMapping("/payment/{id}")
	public String confirmPayment(@PathVariable String id);
}
