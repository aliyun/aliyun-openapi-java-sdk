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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CallbackLinkefabricFabricConfigtaskRequest extends RpcAcsRequest<CallbackLinkefabricFabricConfigtaskResponse> {
	   

	private String resultMessage;

	private Long taskId;

	private Boolean isSuccess;
	public CallbackLinkefabricFabricConfigtaskRequest() {
		super("SOFA", "2019-08-15", "CallbackLinkefabricFabricConfigtask", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
		if(resultMessage != null){
			putBodyParameter("ResultMessage", resultMessage);
		}
	}

	public Long getTaskId() {
		return this.taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
		if(taskId != null){
			putBodyParameter("TaskId", taskId.toString());
		}
	}

	public Boolean getIsSuccess() {
		return this.isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
		if(isSuccess != null){
			putBodyParameter("IsSuccess", isSuccess.toString());
		}
	}

	@Override
	public Class<CallbackLinkefabricFabricConfigtaskResponse> getResponseClass() {
		return CallbackLinkefabricFabricConfigtaskResponse.class;
	}

}
