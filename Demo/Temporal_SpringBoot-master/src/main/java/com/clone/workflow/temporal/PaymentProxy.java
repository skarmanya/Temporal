package com.clone.workflow.temporal;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="paymentproxy", url="http://a8ccd7d8ea4c943a880b6daecaa0ad51-1315015244.us-east-1.elb.amazonaws.com:9002")
public interface PaymentProxy {
	@GetMapping("/payment/{id}")
	public String confirmPayment(@PathVariable String id);
}
