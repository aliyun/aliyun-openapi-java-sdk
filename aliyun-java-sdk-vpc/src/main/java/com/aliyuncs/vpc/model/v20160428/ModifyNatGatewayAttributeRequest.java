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

package com.aliyuncs.vpc.model.v20160428;

import com.aliyuncs.RpcAcsRequest;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyNatGatewayAttributeRequest extends RpcAcsRequest<ModifyNatGatewayAttributeResponse> {
	   

	private Long resourceOwnerId;

	private String description;

	@SerializedName("logDelivery")
	private LogDelivery logDelivery;

	private Boolean icmpReplyEnabled;

	private String natGatewayId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private Boolean enableSessionLog;

	private String name;

	private String eipBindMode;
	public ModifyNatGatewayAttributeRequest() {
		super("Vpc", "2016-04-28", "ModifyNatGatewayAttribute", "vpc");
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

	public LogDelivery getLogDelivery() {
		return this.logDelivery;
	}

	public void setLogDelivery(LogDelivery logDelivery) {
		this.logDelivery = logDelivery;	
		if (logDelivery != null) {
			putQueryParameter("LogDelivery" , new Gson().toJson(logDelivery));
		}	
	}

	public Boolean getIcmpReplyEnabled() {
		return this.icmpReplyEnabled;
	}

	public void setIcmpReplyEnabled(Boolean icmpReplyEnabled) {
		this.icmpReplyEnabled = icmpReplyEnabled;
		if(icmpReplyEnabled != null){
			putQueryParameter("IcmpReplyEnabled", icmpReplyEnabled.toString());
		}
	}

	public String getNatGatewayId() {
		return this.natGatewayId;
	}

	public void setNatGatewayId(String natGatewayId) {
		this.natGatewayId = natGatewayId;
		if(natGatewayId != null){
			putQueryParameter("NatGatewayId", natGatewayId);
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

	public Boolean getEnableSessionLog() {
		return this.enableSessionLog;
	}

	public void setEnableSessionLog(Boolean enableSessionLog) {
		this.enableSessionLog = enableSessionLog;
		if(enableSessionLog != null){
			putQueryParameter("EnableSessionLog", enableSessionLog.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getEipBindMode() {
		return this.eipBindMode;
	}

	public void setEipBindMode(String eipBindMode) {
		this.eipBindMode = eipBindMode;
		if(eipBindMode != null){
			putQueryParameter("EipBindMode", eipBindMode);
		}
	}

	public static class LogDelivery {

		@SerializedName("LogDeliveryType")
		private String logDeliveryType;

		@SerializedName("LogDestination")
		private String logDestination;

		public String getLogDeliveryType() {
			return this.logDeliveryType;
		}

		public void setLogDeliveryType(String logDeliveryType) {
			this.logDeliveryType = logDeliveryType;
		}

		public String getLogDestination() {
			return this.logDestination;
		}

		public void setLogDestination(String logDestination) {
			this.logDestination = logDestination;
		}
	}

	@Override
	public Class<ModifyNatGatewayAttributeResponse> getResponseClass() {
		return ModifyNatGatewayAttributeResponse.class;
	}

}
