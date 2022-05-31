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

package com.aliyuncs.cloudesl.model.v20200201;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudesl.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CheckServiceLinkedRoleForDeletingRequest extends RpcAcsRequest<CheckServiceLinkedRoleForDeletingResponse> {
	   

	private String extraParams;

	private String deletionTaskId;

	private String serviceName;

	private Long ownerId;

	private String sPIRegionId;

	private String roleArn;
	public CheckServiceLinkedRoleForDeletingRequest() {
		super("cloudesl", "2020-02-01", "CheckServiceLinkedRoleForDeleting");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getExtraParams() {
		return this.extraParams;
	}

	public void setExtraParams(String extraParams) {
		this.extraParams = extraParams;
		if(extraParams != null){
			putBodyParameter("ExtraParams", extraParams);
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getSPIRegionId() {
		return this.sPIRegionId;
	}

	public void setSPIRegionId(String sPIRegionId) {
		this.sPIRegionId = sPIRegionId;
		if(sPIRegionId != null){
			putQueryParameter("SPIRegionId", sPIRegionId);
		}
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

	@Override
	public Class<CheckServiceLinkedRoleForDeletingResponse> getResponseClass() {
		return CheckServiceLinkedRoleForDeletingResponse.class;
	}

}
