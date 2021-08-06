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

package com.aliyuncs.ess.model.v20140828;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ess.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class EnableScalingGroupRequest extends RpcAcsRequest<EnableScalingGroupResponse> {
	   

	private Long resourceOwnerId;

	private String scalingGroupId;

	private String activeScalingConfigurationId;

	private String launchTemplateId;

	private String resourceOwnerAccount;

	private List<LaunchTemplateOverride> launchTemplateOverrides;

	private String ownerAccount;

	private Long ownerId;

	private String launchTemplateVersion;

	private List<String> instanceIds;

	private List<Integer> loadBalancerWeights;
	public EnableScalingGroupRequest() {
		super("Ess", "2014-08-28", "EnableScalingGroup", "ess");
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

	public String getScalingGroupId() {
		return this.scalingGroupId;
	}

	public void setScalingGroupId(String scalingGroupId) {
		this.scalingGroupId = scalingGroupId;
		if(scalingGroupId != null){
			putQueryParameter("ScalingGroupId", scalingGroupId);
		}
	}

	public String getActiveScalingConfigurationId() {
		return this.activeScalingConfigurationId;
	}

	public void setActiveScalingConfigurationId(String activeScalingConfigurationId) {
		this.activeScalingConfigurationId = activeScalingConfigurationId;
		if(activeScalingConfigurationId != null){
			putQueryParameter("ActiveScalingConfigurationId", activeScalingConfigurationId);
		}
	}

	public String getLaunchTemplateId() {
		return this.launchTemplateId;
	}

	public void setLaunchTemplateId(String launchTemplateId) {
		this.launchTemplateId = launchTemplateId;
		if(launchTemplateId != null){
			putQueryParameter("LaunchTemplateId", launchTemplateId);
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

	public List<LaunchTemplateOverride> getLaunchTemplateOverrides() {
		return this.launchTemplateOverrides;
	}

	public void setLaunchTemplateOverrides(List<LaunchTemplateOverride> launchTemplateOverrides) {
		this.launchTemplateOverrides = launchTemplateOverrides;	
		if (launchTemplateOverrides != null) {
			for (int depth1 = 0; depth1 < launchTemplateOverrides.size(); depth1++) {
				putQueryParameter("LaunchTemplateOverride." + (depth1 + 1) + ".WeightedCapacity" , launchTemplateOverrides.get(depth1).getWeightedCapacity());
				putQueryParameter("LaunchTemplateOverride." + (depth1 + 1) + ".InstanceType" , launchTemplateOverrides.get(depth1).getInstanceType());
			}
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

	public String getLaunchTemplateVersion() {
		return this.launchTemplateVersion;
	}

	public void setLaunchTemplateVersion(String launchTemplateVersion) {
		this.launchTemplateVersion = launchTemplateVersion;
		if(launchTemplateVersion != null){
			putQueryParameter("LaunchTemplateVersion", launchTemplateVersion);
		}
	}

	public List<String> getInstanceIds() {
		return this.instanceIds;
	}

	public void setInstanceIds(List<String> instanceIds) {
		this.instanceIds = instanceIds;	
		if (instanceIds != null) {
			for (int i = 0; i < instanceIds.size(); i++) {
				putQueryParameter("InstanceId." + (i + 1) , instanceIds.get(i));
			}
		}	
	}

	public List<Integer> getLoadBalancerWeights() {
		return this.loadBalancerWeights;
	}

	public void setLoadBalancerWeights(List<Integer> loadBalancerWeights) {
		this.loadBalancerWeights = loadBalancerWeights;	
		if (loadBalancerWeights != null) {
			for (int i = 0; i < loadBalancerWeights.size(); i++) {
				putQueryParameter("LoadBalancerWeight." + (i + 1) , loadBalancerWeights.get(i));
			}
		}	
	}

	public static class LaunchTemplateOverride {

		private Integer weightedCapacity;

		private String instanceType;

		public Integer getWeightedCapacity() {
			return this.weightedCapacity;
		}

		public void setWeightedCapacity(Integer weightedCapacity) {
			this.weightedCapacity = weightedCapacity;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}
	}

	@Override
	public Class<EnableScalingGroupResponse> getResponseClass() {
		return EnableScalingGroupResponse.class;
	}

}
