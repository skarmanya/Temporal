package com.clone.workflow.config;

import java.time.Duration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.clone.workflow.temporal.ActivityImpl;

import io.temporal.client.WorkflowClient;
import io.temporal.client.WorkflowClientOptions;
import io.temporal.serviceclient.WorkflowServiceStubs;
import io.temporal.serviceclient.WorkflowServiceStubsOptions;
import io.temporal.worker.WorkerFactory;
import io.temporal.worker.WorkerFactoryOptions;

@Component
@Configuration
public class TemporalConfig {

	private String temporalServiceAddress = "172.20.161.103:7233";

	private String temporalNamespace = "default";

	@Bean
	public WorkflowServiceStubs workflowServiceStubs() {
		return WorkflowServiceStubs
				.newInstance(WorkflowServiceStubsOptions.newBuilder().setTarget(temporalServiceAddress).build());
	}

	@Bean
	public WorkflowClient workflowClient(WorkflowServiceStubs workflowServiceStubs) {
		return WorkflowClient.newInstance(workflowServiceStubs,
				WorkflowClientOptions.newBuilder().setNamespace(temporalNamespace).build());
	}

	@Bean
	public WorkerFactory workerFactory(WorkflowClient workflowClient) {
		
		WorkerFactoryOptions factoryOptions = 
				WorkerFactoryOptions.newBuilder()
//				.setMaxWorkflowThreadCount(10000)
//				.setWorkflowCacheSize(6000)
//				.setWorkflowHostLocalPollThreadCount(10)
			.build();
				
		return WorkerFactory.newInstance(workflowClient,factoryOptions);
	}

	@Bean
	public ActivityImpl SignUpActivity() {
		return new ActivityImpl();
	}

}
