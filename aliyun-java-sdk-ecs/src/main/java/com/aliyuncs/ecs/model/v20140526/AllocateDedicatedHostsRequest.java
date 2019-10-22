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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AllocateDedicatedHostsRequest extends RpcAcsRequest<AllocateDedicatedHostsResponse> {
	   

	private Long resourceOwnerId;

	private String clientToken;

	private String description;

	private String resourceGroupId;

	private String actionOnMaintenance;

	private List<Tag> tags;

	private String dedicatedHostType;

	private Integer autoRenewPeriod;

	private Integer period;

	private Integer quantity;

	private String dedicatedHostName;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String autoReleaseTime;

	private Long ownerId;

	private String periodUnit;

	private Boolean autoRenew;

	private Integer networkAttributesSlbUdpTimeout;

	private String zoneId;

	private String autoPlacement;

	private String chargeType;

	private Integer networkAttributesUdpTimeout;
	public AllocateDedicatedHostsRequest() {
		super("Ecs", "2014-05-26", "AllocateDedicatedHosts", "ecs");
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

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
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

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
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

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
			}
		}	
	}

	public String getDedicatedHostType() {
		return this.dedicatedHostType;
	}

	public void setDedicatedHostType(String dedicatedHostType) {
		this.dedicatedHostType = dedicatedHostType;
		if(dedicatedHostType != null){
			putQueryParameter("DedicatedHostType", dedicatedHostType);
		}
	}

	public Integer getAutoRenewPeriod() {
		return this.autoRenewPeriod;
	}

	public void setAutoRenewPeriod(Integer autoRenewPeriod) {
		this.autoRenewPeriod = autoRenewPeriod;
		if(autoRenewPeriod != null){
			putQueryParameter("AutoRenewPeriod", autoRenewPeriod.toString());
		}
	}

	public Integer getPeriod() {
		return this.period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
		if(period != null){
			putQueryParameter("Period", period.toString());
		}
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
		if(quantity != null){
			putQueryParameter("Quantity", quantity.toString());
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

	public String getAutoReleaseTime() {
		return this.autoReleaseTime;
	}

	public void setAutoReleaseTime(String autoReleaseTime) {
		this.autoReleaseTime = autoReleaseTime;
		if(autoReleaseTime != null){
			putQueryParameter("AutoReleaseTime", autoReleaseTime);
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

	public String getPeriodUnit() {
		return this.periodUnit;
	}

	public void setPeriodUnit(String periodUnit) {
		this.periodUnit = periodUnit;
		if(periodUnit != null){
			putQueryParameter("PeriodUnit", periodUnit);
		}
	}

	public Boolean getAutoRenew() {
		return this.autoRenew;
	}

	public void setAutoRenew(Boolean autoRenew) {
		this.autoRenew = autoRenew;
		if(autoRenew != null){
			putQueryParameter("AutoRenew", autoRenew.toString());
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

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("ZoneId", zoneId);
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

	public String getChargeType() {
		return this.chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
		if(chargeType != null){
			putQueryParameter("ChargeType", chargeType);
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

	public static class Tag {

		private String key;

		private String value;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	@Override
	public Class<AllocateDedicatedHostsResponse> getResponseClass() {
		return AllocateDedicatedHostsResponse.class;
	}

}
