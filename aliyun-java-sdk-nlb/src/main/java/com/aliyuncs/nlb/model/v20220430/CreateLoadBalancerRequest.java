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

package com.aliyuncs.nlb.model.v20220430;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.nlb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateLoadBalancerRequest extends RpcAcsRequest<CreateLoadBalancerResponse> {
	   

	private String clientToken;

	private ModificationProtectionConfig modificationProtectionConfig;

	private LoadBalancerBillingConfig loadBalancerBillingConfig;

	private DeletionProtectionConfig deletionProtectionConfig;

	private String addressIpVersion;

	private String resourceGroupId;

	private String loadBalancerName;

	private String addressType;

	private List<Tag> tags;

	private String bandwidthPackageId;

	private Boolean dryRun;

	private List<ZoneMappings> zoneMappings;

	private String loadBalancerType;

	private String vpcId;
	public CreateLoadBalancerRequest() {
		super("Nlb", "2022-04-30", "CreateLoadBalancer", "nlb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putBodyParameter("ClientToken", clientToken);
		}
	}

	public ModificationProtectionConfig getModificationProtectionConfig() {
		return this.modificationProtectionConfig;
	}

	public void setModificationProtectionConfig(ModificationProtectionConfig modificationProtectionConfig) {
		this.modificationProtectionConfig = modificationProtectionConfig;	
		if (modificationProtectionConfig != null) {
			
				putBodyParameter("ModificationProtectionConfig.Status" , modificationProtectionConfig.getStatus());
				putBodyParameter("ModificationProtectionConfig.Reason" , modificationProtectionConfig.getReason());
		}	
	}

	public LoadBalancerBillingConfig getLoadBalancerBillingConfig() {
		return this.loadBalancerBillingConfig;
	}

	public void setLoadBalancerBillingConfig(LoadBalancerBillingConfig loadBalancerBillingConfig) {
		this.loadBalancerBillingConfig = loadBalancerBillingConfig;	
		if (loadBalancerBillingConfig != null) {
			
				putBodyParameter("LoadBalancerBillingConfig.PayType" , loadBalancerBillingConfig.getPayType());
		}	
	}

	public DeletionProtectionConfig getDeletionProtectionConfig() {
		return this.deletionProtectionConfig;
	}

	public void setDeletionProtectionConfig(DeletionProtectionConfig deletionProtectionConfig) {
		this.deletionProtectionConfig = deletionProtectionConfig;	
		if (deletionProtectionConfig != null) {
			
				putBodyParameter("DeletionProtectionConfig.Enabled" , deletionProtectionConfig.getEnabled());
				putBodyParameter("DeletionProtectionConfig.Reason" , deletionProtectionConfig.getReason());
		}	
	}

	public String getAddressIpVersion() {
		return this.addressIpVersion;
	}

	public void setAddressIpVersion(String addressIpVersion) {
		this.addressIpVersion = addressIpVersion;
		if(addressIpVersion != null){
			putBodyParameter("AddressIpVersion", addressIpVersion);
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putBodyParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public String getLoadBalancerName() {
		return this.loadBalancerName;
	}

	public void setLoadBalancerName(String loadBalancerName) {
		this.loadBalancerName = loadBalancerName;
		if(loadBalancerName != null){
			putBodyParameter("LoadBalancerName", loadBalancerName);
		}
	}

	public String getAddressType() {
		return this.addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
		if(addressType != null){
			putBodyParameter("AddressType", addressType);
		}
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putBodyParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
				putBodyParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
			}
		}	
	}

	public String getBandwidthPackageId() {
		return this.bandwidthPackageId;
	}

	public void setBandwidthPackageId(String bandwidthPackageId) {
		this.bandwidthPackageId = bandwidthPackageId;
		if(bandwidthPackageId != null){
			putBodyParameter("BandwidthPackageId", bandwidthPackageId);
		}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putBodyParameter("DryRun", dryRun.toString());
		}
	}

	public List<ZoneMappings> getZoneMappings() {
		return this.zoneMappings;
	}

	public void setZoneMappings(List<ZoneMappings> zoneMappings) {
		this.zoneMappings = zoneMappings;	
		if (zoneMappings != null) {
			for (int depth1 = 0; depth1 < zoneMappings.size(); depth1++) {
				if (zoneMappings.get(depth1) != null) {
					
						putBodyParameter("ZoneMappings." + (depth1 + 1) + ".VSwitchId" , zoneMappings.get(depth1).getVSwitchId());
						putBodyParameter("ZoneMappings." + (depth1 + 1) + ".ZoneId" , zoneMappings.get(depth1).getZoneId());
						putBodyParameter("ZoneMappings." + (depth1 + 1) + ".PrivateIPv4Address" , zoneMappings.get(depth1).getPrivateIPv4Address());
						putBodyParameter("ZoneMappings." + (depth1 + 1) + ".AllocationId" , zoneMappings.get(depth1).getAllocationId());
				}
			}
		}	
	}

	public String getLoadBalancerType() {
		return this.loadBalancerType;
	}

	public void setLoadBalancerType(String loadBalancerType) {
		this.loadBalancerType = loadBalancerType;
		if(loadBalancerType != null){
			putBodyParameter("LoadBalancerType", loadBalancerType);
		}
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putBodyParameter("VpcId", vpcId);
		}
	}

	public static class ModificationProtectionConfig {

		private String status;

		private String reason;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}
	}

	public static class LoadBalancerBillingConfig {

		private String payType;

		public String getPayType() {
			return this.payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
		}
	}

	public static class DeletionProtectionConfig {

		private Boolean enabled;

		private String reason;

		public Boolean getEnabled() {
			return this.enabled;
		}

		public void setEnabled(Boolean enabled) {
			this.enabled = enabled;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
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

	public static class ZoneMappings {

		private String vSwitchId;

		private String zoneId;

		private String privateIPv4Address;

		private String allocationId;

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getPrivateIPv4Address() {
			return this.privateIPv4Address;
		}

		public void setPrivateIPv4Address(String privateIPv4Address) {
			this.privateIPv4Address = privateIPv4Address;
		}

		public String getAllocationId() {
			return this.allocationId;
		}

		public void setAllocationId(String allocationId) {
			this.allocationId = allocationId;
		}
	}

	@Override
	public Class<CreateLoadBalancerResponse> getResponseClass() {
		return CreateLoadBalancerResponse.class;
	}

}
