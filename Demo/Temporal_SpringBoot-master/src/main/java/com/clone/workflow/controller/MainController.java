package com.clone.workflow.controller;

import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.clone.model.CartPojo;
import com.clone.workflow.service.OrderService;

@RestController
public class MainController {

	@Autowired
	OrderService orderService;
	

	@PostMapping("/startWorkflow")
	public CartPojo createOrder(@RequestParam("id") String id, @RequestBody CartPojo cartDetails) {
	
	long start_time = System.currentTimeMillis();
				
	 CartPojo cp = orderService.placeOrder(id, cartDetails);
	 
	 long end_time = System.currentTimeMillis();

	 System.out.println("Time taken for flow " + String.valueOf(end_time-start_time) );
	 
	 return cp;
		//return orderDetails.orderRepo;
	}

}
