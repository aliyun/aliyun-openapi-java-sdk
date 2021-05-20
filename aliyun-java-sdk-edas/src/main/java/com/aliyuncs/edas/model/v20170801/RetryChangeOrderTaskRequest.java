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

package com.aliyuncs.edas.model.v20170801;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.edas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RetryChangeOrderTaskRequest extends RoaAcsRequest<RetryChangeOrderTaskResponse> {
	   

	private Boolean retryStatus;

	private String taskId;
	public RetryChangeOrderTaskRequest() {
		super("Edas", "2017-08-01", "RetryChangeOrderTask", "Edas");
		setUriPattern("/pop/v5/changeorder/task_retry");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getRetryStatus() {
		return this.retryStatus;
	}

	public void setRetryStatus(Boolean retryStatus) {
		this.retryStatus = retryStatus;
		if(retryStatus != null){
			putQueryParameter("RetryStatus", retryStatus.toString());
		}
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
		if(taskId != null){
			putQueryParameter("TaskId", taskId);
		}
	}

	@Override
	public Class<RetryChangeOrderTaskResponse> getResponseClass() {
		return RetryChangeOrderTaskResponse.class;
	}

}
