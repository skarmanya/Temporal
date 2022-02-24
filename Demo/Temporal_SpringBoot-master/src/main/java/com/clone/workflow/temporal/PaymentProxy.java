package com.clone.workflow.temporal;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name="wiremock", url="http://wiremock:8080")
public interface PaymentProxy {
	@PostMapping("/items/cart")
	public String makeCart();
}
