/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.fnf.model.v20190315;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.fnf.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class StartExecutionRequest extends RpcAcsRequest<StartExecutionResponse> {
	   

	private String callbackFnFTaskToken;

	private String executionName;

	private String input;

	private String flowName;
	public StartExecutionRequest() {
		super("fnf", "2019-03-15", "StartExecution", "fnf");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCallbackFnFTaskToken() {
		return this.callbackFnFTaskToken;
	}

	public void setCallbackFnFTaskToken(String callbackFnFTaskToken) {
		this.callbackFnFTaskToken = callbackFnFTaskToken;
		if(callbackFnFTaskToken != null){
			putBodyParameter("CallbackFnFTaskToken", callbackFnFTaskToken);
		}
	}

	public String getExecutionName() {
		return this.executionName;
	}

	public void setExecutionName(String executionName) {
		this.executionName = executionName;
		if(executionName != null){
			putBodyParameter("ExecutionName", executionName);
		}
	}

	public String getInput() {
		return this.input;
	}

	public void setInput(String input) {
		this.input = input;
		if(input != null){
			putBodyParameter("Input", input);
		}
	}

	public String getFlowName() {
		return this.flowName;
	}

	public void setFlowName(String flowName) {
		this.flowName = flowName;
		if(flowName != null){
			putBodyParameter("FlowName", flowName);
		}
	}

	@Override
	public Class<StartExecutionResponse> getResponseClass() {
		return StartExecutionResponse.class;
	}

}
