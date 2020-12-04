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

package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyDedicatedHostClusterAttributeRequest extends RpcAcsRequest<ModifyDedicatedHostClusterAttributeResponse> {
	   

	private String dedicatedHostClusterName;

	private Long resourceOwnerId;

	private String description;

	private String dedicatedHostClusterId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;
	public ModifyDedicatedHostClusterAttributeRequest() {
		super("Ecs", "2014-05-26", "ModifyDedicatedHostClusterAttribute");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDedicatedHostClusterName() {
		return this.dedicatedHostClusterName;
	}

	public void setDedicatedHostClusterName(String dedicatedHostClusterName) {
		this.dedicatedHostClusterName = dedicatedHostClusterName;
		if(dedicatedHostClusterName != null){
			putQueryParameter("DedicatedHostClusterName", dedicatedHostClusterName);
		}
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getDedicatedHostClusterId() {
		return this.dedicatedHostClusterId;
	}

	public void setDedicatedHostClusterId(String dedicatedHostClusterId) {
		this.dedicatedHostClusterId = dedicatedHostClusterId;
		if(dedicatedHostClusterId != null){
			putQueryParameter("DedicatedHostClusterId", dedicatedHostClusterId);
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	@Override
	public Class<ModifyDedicatedHostClusterAttributeResponse> getResponseClass() {
		return ModifyDedicatedHostClusterAttributeResponse.class;
	}

}
