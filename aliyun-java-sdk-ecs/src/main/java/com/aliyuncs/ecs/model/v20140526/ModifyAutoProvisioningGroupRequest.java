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
public class ModifyAutoProvisioningGroupRequest extends RpcAcsRequest<ModifyAutoProvisioningGroupResponse> {
	   

	private Long resourceOwnerId;

	private Boolean terminateInstancesWithExpiration;

	private String defaultTargetCapacityType;

	private String excessCapacityTerminationPolicy;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String autoProvisioningGroupId;

	private String payAsYouGoTargetCapacity;

	private String totalTargetCapacity;

	private String spotTargetCapacity;

	private Float maxSpotPrice;

	private String autoProvisioningGroupName;
	public ModifyAutoProvisioningGroupRequest() {
		super("Ecs", "2014-05-26", "ModifyAutoProvisioningGroup", "ecs");
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

	public Boolean getTerminateInstancesWithExpiration() {
		return this.terminateInstancesWithExpiration;
	}

	public void setTerminateInstancesWithExpiration(Boolean terminateInstancesWithExpiration) {
		this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
		if(terminateInstancesWithExpiration != null){
			putQueryParameter("TerminateInstancesWithExpiration", terminateInstancesWithExpiration.toString());
		}
	}

	public String getDefaultTargetCapacityType() {
		return this.defaultTargetCapacityType;
	}

	public void setDefaultTargetCapacityType(String defaultTargetCapacityType) {
		this.defaultTargetCapacityType = defaultTargetCapacityType;
		if(defaultTargetCapacityType != null){
			putQueryParameter("DefaultTargetCapacityType", defaultTargetCapacityType);
		}
	}

	public String getExcessCapacityTerminationPolicy() {
		return this.excessCapacityTerminationPolicy;
	}

	public void setExcessCapacityTerminationPolicy(String excessCapacityTerminationPolicy) {
		this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
		if(excessCapacityTerminationPolicy != null){
			putQueryParameter("ExcessCapacityTerminationPolicy", excessCapacityTerminationPolicy);
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

	public String getAutoProvisioningGroupId() {
		return this.autoProvisioningGroupId;
	}

	public void setAutoProvisioningGroupId(String autoProvisioningGroupId) {
		this.autoProvisioningGroupId = autoProvisioningGroupId;
		if(autoProvisioningGroupId != null){
			putQueryParameter("AutoProvisioningGroupId", autoProvisioningGroupId);
		}
	}

	public String getPayAsYouGoTargetCapacity() {
		return this.payAsYouGoTargetCapacity;
	}

	public void setPayAsYouGoTargetCapacity(String payAsYouGoTargetCapacity) {
		this.payAsYouGoTargetCapacity = payAsYouGoTargetCapacity;
		if(payAsYouGoTargetCapacity != null){
			putQueryParameter("PayAsYouGoTargetCapacity", payAsYouGoTargetCapacity);
		}
	}

	public String getTotalTargetCapacity() {
		return this.totalTargetCapacity;
	}

	public void setTotalTargetCapacity(String totalTargetCapacity) {
		this.totalTargetCapacity = totalTargetCapacity;
		if(totalTargetCapacity != null){
			putQueryParameter("TotalTargetCapacity", totalTargetCapacity);
		}
	}

	public String getSpotTargetCapacity() {
		return this.spotTargetCapacity;
	}

	public void setSpotTargetCapacity(String spotTargetCapacity) {
		this.spotTargetCapacity = spotTargetCapacity;
		if(spotTargetCapacity != null){
			putQueryParameter("SpotTargetCapacity", spotTargetCapacity);
		}
	}

	public Float getMaxSpotPrice() {
		return this.maxSpotPrice;
	}

	public void setMaxSpotPrice(Float maxSpotPrice) {
		this.maxSpotPrice = maxSpotPrice;
		if(maxSpotPrice != null){
			putQueryParameter("MaxSpotPrice", maxSpotPrice.toString());
		}
	}

	public String getAutoProvisioningGroupName() {
		return this.autoProvisioningGroupName;
	}

	public void setAutoProvisioningGroupName(String autoProvisioningGroupName) {
		this.autoProvisioningGroupName = autoProvisioningGroupName;
		if(autoProvisioningGroupName != null){
			putQueryParameter("AutoProvisioningGroupName", autoProvisioningGroupName);
		}
	}

	@Override
	public Class<ModifyAutoProvisioningGroupResponse> getResponseClass() {
		return ModifyAutoProvisioningGroupResponse.class;
	}

}
