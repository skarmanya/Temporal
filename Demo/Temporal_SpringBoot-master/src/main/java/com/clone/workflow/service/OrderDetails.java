package com.clone.workflow.service;

import java.util.LinkedHashMap;

import org.springframework.stereotype.Service;

import com.clone.model.CartPojo;

@Service
public class OrderDetails {
	public static LinkedHashMap<String, String> orderRepo = new LinkedHashMap<String, String>();
	
	
//	
//	public OrderDetails() {
//		LinkedHashMap<String, String> orderDetails = new LinkedHashMap<String, String>();
//		this.orderRepo = orderDetails;
//	}
//	
//	public LinkedHashMap<String, String> getOrderRepo() {
//		return orderRepo;
//	}
//
	public void setOrderRepo(LinkedHashMap<String, String> orderRepo) {
		this.orderRepo = orderRepo;
	}

	public void setOrderStatus (CartPojo cartDetails, String orderStatus) { // workflow
		LinkedHashMap<String, String> orderDetails = new LinkedHashMap<String, String>();
		orderDetails.put("productName",cartDetails.getProductName());
		orderDetails.put("productId",cartDetails.getProductId());
		orderDetails.put("unitPrice",cartDetails.getUnitPrice());
		orderDetails.put("quantity",cartDetails.getQuantity());
		setOrderRepo(orderDetails);
	}


	

	
}
