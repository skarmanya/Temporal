package com.clone.workflow.temporal;

import com.clone.model.CartPojo;

import io.temporal.workflow.WorkflowInterface;
import io.temporal.workflow.WorkflowMethod;

@WorkflowInterface
public interface WorkFlow {

	public static final String QUEUE_NAME = "Customer_Order";

	@WorkflowMethod
	CartPojo startApprovalWorkflow(String workFlowId, CartPojo cartDetails);

}
