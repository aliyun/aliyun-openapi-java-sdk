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
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateNatGatewayRequest extends RpcAcsRequest<CreateNatGatewayResponse> {
	   

	private Long resourceOwnerId;

	private String ipv4Prefix;

	private String networkType;

	private String spec;

	private Boolean icmpReplyEnabled;

	private List<Tag> tags;

	private Long ownerId;

	private String vSwitchId;

	private String natIp;

	private String internetChargeType;

	private String name;

	private Boolean privateLinkEnabled;

	private String pricingCycle;

	private String clientToken;

	private Boolean securityProtectionEnabled;

	private String description;

	private String duration;

	private String natType;

	private String instanceChargeType;

	private Boolean autoPay;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String vpcId;

	private String eipBindMode;

	@SerializedName("accessMode")
	private AccessMode accessMode;
	public CreateNatGatewayRequest() {
		super("Vpc", "2016-04-28", "CreateNatGateway", "vpc");
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

	public String getIpv4Prefix() {
		return this.ipv4Prefix;
	}

	public void setIpv4Prefix(String ipv4Prefix) {
		this.ipv4Prefix = ipv4Prefix;
		if(ipv4Prefix != null){
			putQueryParameter("Ipv4Prefix", ipv4Prefix);
		}
	}

	public String getNetworkType() {
		return this.networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
		if(networkType != null){
			putQueryParameter("NetworkType", networkType);
		}
	}

	public String getSpec() {
		return this.spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
		if(spec != null){
			putQueryParameter("Spec", spec);
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

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
			}
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

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		if(vSwitchId != null){
			putQueryParameter("VSwitchId", vSwitchId);
		}
	}

	public String getNatIp() {
		return this.natIp;
	}

	public void setNatIp(String natIp) {
		this.natIp = natIp;
		if(natIp != null){
			putQueryParameter("NatIp", natIp);
		}
	}

	public String getInternetChargeType() {
		return this.internetChargeType;
	}

	public void setInternetChargeType(String internetChargeType) {
		this.internetChargeType = internetChargeType;
		if(internetChargeType != null){
			putQueryParameter("InternetChargeType", internetChargeType);
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

	public Boolean getPrivateLinkEnabled() {
		return this.privateLinkEnabled;
	}

	public void setPrivateLinkEnabled(Boolean privateLinkEnabled) {
		this.privateLinkEnabled = privateLinkEnabled;
		if(privateLinkEnabled != null){
			putQueryParameter("PrivateLinkEnabled", privateLinkEnabled.toString());
		}
	}

	public String getPricingCycle() {
		return this.pricingCycle;
	}

	public void setPricingCycle(String pricingCycle) {
		this.pricingCycle = pricingCycle;
		if(pricingCycle != null){
			putQueryParameter("PricingCycle", pricingCycle);
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

	public Boolean getSecurityProtectionEnabled() {
		return this.securityProtectionEnabled;
	}

	public void setSecurityProtectionEnabled(Boolean securityProtectionEnabled) {
		this.securityProtectionEnabled = securityProtectionEnabled;
		if(securityProtectionEnabled != null){
			putQueryParameter("SecurityProtectionEnabled", securityProtectionEnabled.toString());
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

	public String getDuration() {
		return this.duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
		if(duration != null){
			putQueryParameter("Duration", duration);
		}
	}

	public String getNatType() {
		return this.natType;
	}

	public void setNatType(String natType) {
		this.natType = natType;
		if(natType != null){
			putQueryParameter("NatType", natType);
		}
	}

	public String getInstanceChargeType() {
		return this.instanceChargeType;
	}

	public void setInstanceChargeType(String instanceChargeType) {
		this.instanceChargeType = instanceChargeType;
		if(instanceChargeType != null){
			putQueryParameter("InstanceChargeType", instanceChargeType);
		}
	}

	public Boolean getAutoPay() {
		return this.autoPay;
	}

	public void setAutoPay(Boolean autoPay) {
		this.autoPay = autoPay;
		if(autoPay != null){
			putQueryParameter("AutoPay", autoPay.toString());
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

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putQueryParameter("VpcId", vpcId);
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

	public AccessMode getAccessMode() {
		return this.accessMode;
	}

	public void setAccessMode(AccessMode accessMode) {
		this.accessMode = accessMode;	
		if (accessMode != null) {
			putQueryParameter("AccessMode" , new Gson().toJson(accessMode));
		}	
	}

	public static class Tag {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	public static class AccessMode {

		@SerializedName("ModeValue")
		private String modeValue;

		@SerializedName("TunnelType")
		private String tunnelType;

		public String getModeValue() {
			return this.modeValue;
		}

		public void setModeValue(String modeValue) {
			this.modeValue = modeValue;
		}

		public String getTunnelType() {
			return this.tunnelType;
		}

		public void setTunnelType(String tunnelType) {
			this.tunnelType = tunnelType;
		}
	}

	@Override
	public Class<CreateNatGatewayResponse> getResponseClass() {
		return CreateNatGatewayResponse.class;
	}

}
