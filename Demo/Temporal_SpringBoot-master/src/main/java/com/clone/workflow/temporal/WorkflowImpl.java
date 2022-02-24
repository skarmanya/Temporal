package com.clone.workflow.temporal;

import java.time.Duration;
import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Autowired;

import com.clone.model.CartPojo;
import com.clone.workflow.service.OrderDetails;

import io.temporal.activity.ActivityOptions;
import io.temporal.common.RetryOptions;
import io.temporal.workflow.Workflow;

public class WorkflowImpl implements WorkFlow {
	

	private final RetryOptions retryoptions = RetryOptions.newBuilder()
			.setInitialInterval(Duration.ofSeconds(1))
//			.setMaximumInterval(Duration.ofSeconds(10))
			.setBackoffCoefficient(1)
//			.setMaximumAttempts(5)
			.build();
	
	private final ActivityOptions options = ActivityOptions.newBuilder()
			.setStartToCloseTimeout(Duration.ofSeconds(10))
			.setRetryOptions(retryoptions).build();

	private final Activity activity = Workflow.newActivityStub(Activity.class, options);

	OrderDetails orderDetails = new OrderDetails();

	public boolean isPaymentDone = false;

	@Override
	public CartPojo startApprovalWorkflow(String workflowId, CartPojo cartDetails) {
		
		//Activity-1
		activity.placeOrder();

		//Activity-2
		 activity.callMakeCart();
		
//		if(responseFromPaymentService.length() > 0) {
//			isPaymentDone = true;
//		}

		
		//Workflow.await(() -> isPaymentDone);
		//System.out.println("***** Please wait till we confirm delivery status");
		
//		isOrderDelivered = activity.setOrderDelivered();
//		Workflow.await(() -> isOrderDelivered);
		
		cartDetails.setPaymentStatus("Payment Received");
		
		return cartDetails;
		

	}
	
	


}
