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

/**
 * @author auto create
 * @version 
 */
public class StopExecutionRequest extends RpcAcsRequest<StopExecutionResponse> {
	
	public StopExecutionRequest() {
		super("fnf", "2019-03-15", "StopExecution", "fnf");
		setMethod(MethodType.POST);
	}

	private String executionName;

	private String requestId;

	private String cause;

	private String flowName;

	private String error;

	public String getExecutionName() {
		return this.executionName;
	}

	public void setExecutionName(String executionName) {
		this.executionName = executionName;
		if(executionName != null){
			putQueryParameter("ExecutionName", executionName);
		}
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
		if(requestId != null){
			putQueryParameter("RequestId", requestId);
		}
	}

	public String getCause() {
		return this.cause;
	}

	public void setCause(String cause) {
		this.cause = cause;
		if(cause != null){
			putQueryParameter("Cause", cause);
		}
	}

	public String getFlowName() {
		return this.flowName;
	}

	public void setFlowName(String flowName) {
		this.flowName = flowName;
		if(flowName != null){
			putQueryParameter("FlowName", flowName);
		}
	}

	public String getError() {
		return this.error;
	}

	public void setError(String error) {
		this.error = error;
		if(error != null){
			putQueryParameter("Error", error);
		}
	}

	@Override
	public Class<StopExecutionResponse> getResponseClass() {
		return StopExecutionResponse.class;
	}

}
