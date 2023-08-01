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

package com.aliyuncs.bpstudio.model.v20210931;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ExecuteOperationASyncRequest extends RpcAcsRequest<ExecuteOperationASyncResponse> {
	   

	private String resourceGroupId;

	private String serviceType;

	private String attributes;

	private String applicationId;

	private String operation;
	public ExecuteOperationASyncRequest() {
		super("BPStudio", "2021-09-31", "ExecuteOperationASync", "bpstudio");
		setMethod(MethodType.POST);
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putBodyParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public String getServiceType() {
		return this.serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
		if(serviceType != null){
			putBodyParameter("ServiceType", serviceType);
		}
	}

	public String getAttributes() {
		return this.attributes;
	}

	public void setAttributes(String attributes) {
		this.attributes = attributes;
		if(attributes != null){
			putBodyParameter("Attributes", attributes);
		}
	}

	public String getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
		if(applicationId != null){
			putBodyParameter("ApplicationId", applicationId);
		}
	}

	public String getOperation() {
		return this.operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
		if(operation != null){
			putBodyParameter("Operation", operation);
		}
	}

	@Override
	public Class<ExecuteOperationASyncResponse> getResponseClass() {
		return ExecuteOperationASyncResponse.class;
	}

}
