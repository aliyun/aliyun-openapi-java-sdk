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

package com.aliyuncs.alb.model.v20200616;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.alb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateLoadBalancerRequest extends RpcAcsRequest<CreateLoadBalancerResponse> {
	   

	private String loadBalancerEdition;

	private String clientToken;

	private ModificationProtectionConfig modificationProtectionConfig;

	private LoadBalancerBillingConfig loadBalancerBillingConfig;

	private Boolean deletionProtectionEnabled;

	private String resourceGroupId;

	private String loadBalancerName;

	private String addressType;

	private String addressAllocatedMode;

	private Boolean dryRun;

	private List<ZoneMappings> zoneMappings;

	private String vpcId;
	public CreateLoadBalancerRequest() {
		super("Alb", "2020-06-16", "CreateLoadBalancer", "alb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getLoadBalancerEdition() {
		return this.loadBalancerEdition;
	}

	public void setLoadBalancerEdition(String loadBalancerEdition) {
		this.loadBalancerEdition = loadBalancerEdition;
		if(loadBalancerEdition != null){
			putQueryParameter("LoadBalancerEdition", loadBalancerEdition);
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

	public ModificationProtectionConfig getModificationProtectionConfig() {
		return this.modificationProtectionConfig;
	}

	public void setModificationProtectionConfig(ModificationProtectionConfig modificationProtectionConfig) {
		this.modificationProtectionConfig = modificationProtectionConfig;	
		if (modificationProtectionConfig != null) {
			
				putQueryParameter("ModificationProtectionConfig.Reason" , modificationProtectionConfig.getReason());
				putQueryParameter("ModificationProtectionConfig.Status" , modificationProtectionConfig.getStatus());
		}	
	}

	public LoadBalancerBillingConfig getLoadBalancerBillingConfig() {
		return this.loadBalancerBillingConfig;
	}

	public void setLoadBalancerBillingConfig(LoadBalancerBillingConfig loadBalancerBillingConfig) {
		this.loadBalancerBillingConfig = loadBalancerBillingConfig;	
		if (loadBalancerBillingConfig != null) {
			
				putQueryParameter("LoadBalancerBillingConfig.PayType" , loadBalancerBillingConfig.getPayType());
		}	
	}

	public Boolean getDeletionProtectionEnabled() {
		return this.deletionProtectionEnabled;
	}

	public void setDeletionProtectionEnabled(Boolean deletionProtectionEnabled) {
		this.deletionProtectionEnabled = deletionProtectionEnabled;
		if(deletionProtectionEnabled != null){
			putQueryParameter("DeletionProtectionEnabled", deletionProtectionEnabled.toString());
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

	public String getLoadBalancerName() {
		return this.loadBalancerName;
	}

	public void setLoadBalancerName(String loadBalancerName) {
		this.loadBalancerName = loadBalancerName;
		if(loadBalancerName != null){
			putQueryParameter("LoadBalancerName", loadBalancerName);
		}
	}

	public String getAddressType() {
		return this.addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
		if(addressType != null){
			putQueryParameter("AddressType", addressType);
		}
	}

	public String getAddressAllocatedMode() {
		return this.addressAllocatedMode;
	}

	public void setAddressAllocatedMode(String addressAllocatedMode) {
		this.addressAllocatedMode = addressAllocatedMode;
		if(addressAllocatedMode != null){
			putQueryParameter("AddressAllocatedMode", addressAllocatedMode);
		}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
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
					
						putQueryParameter("ZoneMappings." + (depth1 + 1) + ".VSwitchId" , zoneMappings.get(depth1).getVSwitchId());
						putQueryParameter("ZoneMappings." + (depth1 + 1) + ".ZoneId" , zoneMappings.get(depth1).getZoneId());
				}
			}
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

	public static class ModificationProtectionConfig {

		private String reason;

		private String status;

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
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

	public static class ZoneMappings {

		private String vSwitchId;

		private String zoneId;

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
	}

	@Override
	public Class<CreateLoadBalancerResponse> getResponseClass() {
		return CreateLoadBalancerResponse.class;
	}

}
