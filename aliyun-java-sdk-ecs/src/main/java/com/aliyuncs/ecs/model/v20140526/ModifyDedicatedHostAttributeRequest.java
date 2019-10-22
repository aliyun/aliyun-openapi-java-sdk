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
public class ModifyDedicatedHostAttributeRequest extends RpcAcsRequest<ModifyDedicatedHostAttributeResponse> {
	   

	private Long resourceOwnerId;

	private String description;

	private String actionOnMaintenance;

	private String dedicatedHostName;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String dedicatedHostId;

	private Long ownerId;

	private Integer networkAttributesSlbUdpTimeout;

	private String autoPlacement;

	private Integer networkAttributesUdpTimeout;
	public ModifyDedicatedHostAttributeRequest() {
		super("Ecs", "2014-05-26", "ModifyDedicatedHostAttribute", "ecs");
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getActionOnMaintenance() {
		return this.actionOnMaintenance;
	}

	public void setActionOnMaintenance(String actionOnMaintenance) {
		this.actionOnMaintenance = actionOnMaintenance;
		if(actionOnMaintenance != null){
			putQueryParameter("ActionOnMaintenance", actionOnMaintenance);
		}
	}

	public String getDedicatedHostName() {
		return this.dedicatedHostName;
	}

	public void setDedicatedHostName(String dedicatedHostName) {
		this.dedicatedHostName = dedicatedHostName;
		if(dedicatedHostName != null){
			putQueryParameter("DedicatedHostName", dedicatedHostName);
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

	public String getDedicatedHostId() {
		return this.dedicatedHostId;
	}

	public void setDedicatedHostId(String dedicatedHostId) {
		this.dedicatedHostId = dedicatedHostId;
		if(dedicatedHostId != null){
			putQueryParameter("DedicatedHostId", dedicatedHostId);
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

	public Integer getNetworkAttributesSlbUdpTimeout() {
		return this.networkAttributesSlbUdpTimeout;
	}

	public void setNetworkAttributesSlbUdpTimeout(Integer networkAttributesSlbUdpTimeout) {
		this.networkAttributesSlbUdpTimeout = networkAttributesSlbUdpTimeout;
		if(networkAttributesSlbUdpTimeout != null){
			putQueryParameter("NetworkAttributes.SlbUdpTimeout", networkAttributesSlbUdpTimeout.toString());
		}
	}

	public String getAutoPlacement() {
		return this.autoPlacement;
	}

	public void setAutoPlacement(String autoPlacement) {
		this.autoPlacement = autoPlacement;
		if(autoPlacement != null){
			putQueryParameter("AutoPlacement", autoPlacement);
		}
	}

	public Integer getNetworkAttributesUdpTimeout() {
		return this.networkAttributesUdpTimeout;
	}

	public void setNetworkAttributesUdpTimeout(Integer networkAttributesUdpTimeout) {
		this.networkAttributesUdpTimeout = networkAttributesUdpTimeout;
		if(networkAttributesUdpTimeout != null){
			putQueryParameter("NetworkAttributes.UdpTimeout", networkAttributesUdpTimeout.toString());
		}
	}

	@Override
	public Class<ModifyDedicatedHostAttributeResponse> getResponseClass() {
		return ModifyDedicatedHostAttributeResponse.class;
	}

}
