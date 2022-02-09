package com.clone.workflow.controller;

import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.clone.model.CartPojo;
import com.clone.workflow.service.OrderDetails;
import com.clone.workflow.service.OrderService;

@RestController
public class MainController {

	@Autowired
	OrderService orderService;
	
	@Autowired
	OrderDetails orderDetails;
	

	@PostMapping("/startWorkflow")
	public LinkedHashMap<String, String> createOrder(@RequestParam("id") String id, @RequestBody CartPojo cartDetails) {
	orderService.placeOrder(id, cartDetails);
		return orderDetails.orderRepo;
	}

}
