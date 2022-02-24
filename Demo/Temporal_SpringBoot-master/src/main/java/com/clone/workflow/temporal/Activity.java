package com.clone.workflow.temporal;

import io.temporal.activity.ActivityInterface;
import io.temporal.activity.ActivityMethod;

@ActivityInterface
public interface Activity {

	@ActivityMethod
	void placeOrder();

//	@ActivityMethod
//	boolean setOrderDelivered();
	
//	@ActivityMethod
//	String setPaymentDone(String id);
	
	@ActivityMethod
	void callMakeCart();
}
