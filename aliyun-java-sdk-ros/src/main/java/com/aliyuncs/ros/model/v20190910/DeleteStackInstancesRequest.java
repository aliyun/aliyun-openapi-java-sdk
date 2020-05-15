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

package com.aliyuncs.ros.model.v20190910;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import java.util.Map;
import com.google.gson.Gson;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ros.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteStackInstancesRequest extends RpcAcsRequest<DeleteStackInstancesResponse> {
	   

	private String clientToken;

	private Boolean retainStacks;

	private String stackGroupName;

	private String operationDescription;

	private Map<Object,Object> operationPreferences;

	private List<Object> regionIds;

	private List<Object> accountIds;
	public DeleteStackInstancesRequest() {
		super("ROS", "2019-09-10", "DeleteStackInstances", "ROS");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public Boolean getRetainStacks() {
		return this.retainStacks;
	}

	public void setRetainStacks(Boolean retainStacks) {
		this.retainStacks = retainStacks;
		if(retainStacks != null){
			putQueryParameter("RetainStacks", retainStacks.toString());
		}
	}

	public String getStackGroupName() {
		return this.stackGroupName;
	}

	public void setStackGroupName(String stackGroupName) {
		this.stackGroupName = stackGroupName;
		if(stackGroupName != null){
			putQueryParameter("StackGroupName", stackGroupName);
		}
	}

	public String getOperationDescription() {
		return this.operationDescription;
	}

	public void setOperationDescription(String operationDescription) {
		this.operationDescription = operationDescription;
		if(operationDescription != null){
			putQueryParameter("OperationDescription", operationDescription);
		}
	}

	public Map<Object,Object> getOperationPreferences() {
		return this.operationPreferences;
	}

	public void setOperationPreferences(Map<Object,Object> operationPreferences) {
		this.operationPreferences = operationPreferences;
		if(operationPreferences != null){
			putQueryParameter("OperationPreferences", new Gson().toJson(operationPreferences));
		}
	}

	public List<Object> getRegionIds() {
		return this.regionIds;
	}

	public void setRegionIds(List<Object> regionIds) {
		this.regionIds = regionIds;
		if(regionIds != null){
			putQueryParameter("RegionIds", new Gson().toJson(regionIds));
		}
	}

	public List<Object> getAccountIds() {
		return this.accountIds;
	}

	public void setAccountIds(List<Object> accountIds) {
		this.accountIds = accountIds;
		if(accountIds != null){
			putQueryParameter("AccountIds", new Gson().toJson(accountIds));
		}
	}

	@Override
	public Class<DeleteStackInstancesResponse> getResponseClass() {
		return DeleteStackInstancesResponse.class;
	}

}
