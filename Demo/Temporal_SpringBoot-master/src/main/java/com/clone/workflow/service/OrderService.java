package com.clone.workflow.service;

import java.time.Duration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clone.model.CartPojo;
import com.clone.workflow.temporal.WorkFlow;

import io.temporal.client.WorkflowClient;
import io.temporal.client.WorkflowOptions;
import io.temporal.serviceclient.WorkflowServiceStubs;

@Service
public class OrderService {

	@Autowired
	WorkflowServiceStubs workflowServiceStubs;

	@Autowired
	WorkflowClient workflowClient;
	
	@Autowired
	OrderDetails orderDetails;

	public CartPojo placeOrder(String workflowId, CartPojo cartDetails) {
		WorkFlow workflow = createWorkFlowConnection(workflowId);
		//WorkflowClient.start(workflow::startApprovalWorkflow, workflowId, cartDetails);
		
		return workflow.startApprovalWorkflow(workflowId, cartDetails);
	}


	public WorkFlow createWorkFlowConnection(String id) {
		WorkflowOptions options = WorkflowOptions.newBuilder()
				.setTaskQueue(WorkFlow.QUEUE_NAME)
				.setWorkflowId("Order_" + id)
//				.setWorkflowTaskTimeout(Duration.ofSeconds(10))
//				.setWorkflowExecutionTimeout(Duration.ofSeconds(10))
				.build();
		
		return workflowClient.newWorkflowStub(WorkFlow.class, options);
	}

}
