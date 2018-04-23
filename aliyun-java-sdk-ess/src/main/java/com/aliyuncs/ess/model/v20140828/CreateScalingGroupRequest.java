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

/**
 * @author auto create
 * @version 
 */
public class CreateScalingGroupRequest extends RpcAcsRequest<CreateScalingGroupResponse> {
	
	public CreateScalingGroupRequest() {
		super("Ess", "2014-08-28", "CreateScalingGroup", "ess");
	}

	private String dBInstanceIds;

	private String loadBalancerIds;

	private String resourceOwnerAccount;

	private String scalingGroupName;

	private List<String> vSwitchIds;

	private String ownerAccount;

	private Integer minSize;

	private Long ownerId;

	private String vSwitchId;

	private Integer maxSize;

	private Integer defaultCooldown;

	private String removalPolicy1;

	private String removalPolicy2;

	public String getDBInstanceIds() {
		return this.dBInstanceIds;
	}

	public void setDBInstanceIds(String dBInstanceIds) {
		this.dBInstanceIds = dBInstanceIds;
		if(dBInstanceIds != null){
			putQueryParameter("DBInstanceIds", dBInstanceIds);
		}
	}

	public String getLoadBalancerIds() {
		return this.loadBalancerIds;
	}

	public void setLoadBalancerIds(String loadBalancerIds) {
		this.loadBalancerIds = loadBalancerIds;
		if(loadBalancerIds != null){
			putQueryParameter("LoadBalancerIds", loadBalancerIds);
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

	public List<String> getVSwitchIds() {
		return this.vSwitchIds;
	}

	public void setVSwitchIds(List<String> vSwitchIds) {
		this.vSwitchIds = vSwitchIds;	
		if (vSwitchIds != null) {
			for (int i = 0; i < vSwitchIds.size(); i++) {
				putQueryParameter("VSwitchIds." + (i + 1) , vSwitchIds.get(i));
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

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		if(vSwitchId != null){
			putQueryParameter("VSwitchId", vSwitchId);
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
	public Class<CreateScalingGroupResponse> getResponseClass() {
		return CreateScalingGroupResponse.class;
	}

}
