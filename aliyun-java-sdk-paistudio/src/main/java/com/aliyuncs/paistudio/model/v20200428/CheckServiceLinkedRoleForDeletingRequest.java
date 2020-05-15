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

package com.aliyuncs.paistudio.model.v20200428;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.paistudio.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CheckServiceLinkedRoleForDeletingRequest extends RpcAcsRequest<CheckServiceLinkedRoleForDeletingResponse> {
	   

	private String roleArn;

	private String deletionTaskId;

	private String serviceName;
	public CheckServiceLinkedRoleForDeletingRequest() {
		super("PaiStudio", "2020-04-28", "CheckServiceLinkedRoleForDeleting", "pai");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRoleArn() {
		return this.roleArn;
	}

	public void setRoleArn(String roleArn) {
		this.roleArn = roleArn;
		if(roleArn != null){
			putQueryParameter("RoleArn", roleArn);
		}
	}

	public String getDeletionTaskId() {
		return this.deletionTaskId;
	}

	public void setDeletionTaskId(String deletionTaskId) {
		this.deletionTaskId = deletionTaskId;
		if(deletionTaskId != null){
			putQueryParameter("DeletionTaskId", deletionTaskId);
		}
	}

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
		if(serviceName != null){
			putQueryParameter("ServiceName", serviceName);
		}
	}

	@Override
	public Class<CheckServiceLinkedRoleForDeletingResponse> getResponseClass() {
		return CheckServiceLinkedRoleForDeletingResponse.class;
	}

}
