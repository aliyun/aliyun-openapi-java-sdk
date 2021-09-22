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

package com.aliyuncs.dypnsapi.model.v20170525;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dypnsapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CheckServiceLinkedRoleForDeletingRequest extends RpcAcsRequest<CheckServiceLinkedRoleForDeletingResponse> {
	   

	private Long resourceOwnerId;

	private String deletionTaskId;

	private String accountId;

	private String serviceName;

	private String resourceOwnerAccount;

	private Long ownerId;

	private String sPIRegionId;

	private String roleArn;
	public CheckServiceLinkedRoleForDeletingRequest() {
		super("Dypnsapi", "2017-05-25", "CheckServiceLinkedRoleForDeleting");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
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

	public String getAccountId() {
		return this.accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
		if(accountId != null){
			putQueryParameter("AccountId", accountId);
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

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
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
