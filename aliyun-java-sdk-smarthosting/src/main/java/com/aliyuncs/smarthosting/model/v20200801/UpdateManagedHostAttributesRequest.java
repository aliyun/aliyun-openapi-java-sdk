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

package com.aliyuncs.smarthosting.model.v20200801;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.smarthosting.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateManagedHostAttributesRequest extends RpcAcsRequest<UpdateManagedHostAttributesResponse> {
	   

	private Long resourceOwnerId;

	private String mode;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String managedHostId;

	private Long ownerId;

	private String managedHostName;
	public UpdateManagedHostAttributesRequest() {
		super("SmartHosting", "2020-08-01", "UpdateManagedHostAttributes", "SmartHosting");
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

	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
		if(mode != null){
			putQueryParameter("Mode", mode);
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

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getManagedHostId() {
		return this.managedHostId;
	}

	public void setManagedHostId(String managedHostId) {
		this.managedHostId = managedHostId;
		if(managedHostId != null){
			putQueryParameter("ManagedHostId", managedHostId);
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

	public String getManagedHostName() {
		return this.managedHostName;
	}

	public void setManagedHostName(String managedHostName) {
		this.managedHostName = managedHostName;
		if(managedHostName != null){
			putQueryParameter("ManagedHostName", managedHostName);
		}
	}

	@Override
	public Class<UpdateManagedHostAttributesResponse> getResponseClass() {
		return UpdateManagedHostAttributesResponse.class;
	}

}
