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

/**
 * @author auto create
 * @version 
 */
public class ModifyScalingGroupRequest extends RpcAcsRequest<ModifyScalingGroupResponse> {
	
	public ModifyScalingGroupRequest() {
		super("Ess", "2014-08-28", "ModifyScalingGroup", "ess");
	}

	private Long resourceOwnerId;

	private String resourceOwnerAccount;

	private String scalingGroupName;

	private String scalingGroupId;

	private String ownerAccount;

	private String activeScalingConfigurationId;

	private Integer minSize;

	private Long ownerId;

	private Integer maxSize;

	private Integer defaultCooldown;

	private String removalPolicy1;

	private String removalPolicy2;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
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

	public String getScalingGroupName() {
		return this.scalingGroupName;
	}

	public void setScalingGroupName(String scalingGroupName) {
		this.scalingGroupName = scalingGroupName;
		if(scalingGroupName != null){
			putQueryParameter("ScalingGroupName", scalingGroupName);
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

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
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

	public Integer getMinSize() {
		return this.minSize;
	}

	public void setMinSize(Integer minSize) {
		this.minSize = minSize;
		if(minSize != null){
			putQueryParameter("MinSize", minSize.toString());
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

	public Integer getMaxSize() {
		return this.maxSize;
	}

	public void setMaxSize(Integer maxSize) {
		this.maxSize = maxSize;
		if(maxSize != null){
			putQueryParameter("MaxSize", maxSize.toString());
		}
	}

	public Integer getDefaultCooldown() {
		return this.defaultCooldown;
	}

	public void setDefaultCooldown(Integer defaultCooldown) {
		this.defaultCooldown = defaultCooldown;
		if(defaultCooldown != null){
			putQueryParameter("DefaultCooldown", defaultCooldown.toString());
		}
	}

	public String getRemovalPolicy1() {
		return this.removalPolicy1;
	}

	public void setRemovalPolicy1(String removalPolicy1) {
		this.removalPolicy1 = removalPolicy1;
		if(removalPolicy1 != null){
			putQueryParameter("RemovalPolicy.1", removalPolicy1);
		}
	}

	public String getRemovalPolicy2() {
		return this.removalPolicy2;
	}

	public void setRemovalPolicy2(String removalPolicy2) {
		this.removalPolicy2 = removalPolicy2;
		if(removalPolicy2 != null){
			putQueryParameter("RemovalPolicy.2", removalPolicy2);
		}
	}

	@Override
	public Class<ModifyScalingGroupResponse> getResponseClass() {
		return ModifyScalingGroupResponse.class;
	}

}
