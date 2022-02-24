package com.clone.workflow.temporal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class ActivityImpl implements Activity {

	@Override
	public void placeOrder() {
		//System.out.println("***** Order has been placed");
		return;
	}

//	@Override
//	public boolean setOrderDelivered() {
//		System.out.println("***** Order Delivered");
//		return true;
//	}
//	
	@Autowired
	private PaymentProxy paymentProxy;
	
//	@Override
//	public String setPaymentDone(String id) {
//		String resp = "";
//		//resp = paymentProxy.confirmPayment(id);
//		//System.out.println("***** "+resp);
//		return resp;
//	}
	
	@Override
	public void callMakeCart() {
		
		
	}

}
