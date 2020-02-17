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
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeScalingInstancesRequest extends RpcAcsRequest<DescribeScalingInstancesResponse> {
	   

	private Long resourceOwnerId;

	private String creationType;

	private String instanceId1;

	private String instanceId3;

	private String instanceId2;

	private String instanceId5;

	private String instanceId4;

	private String instanceId7;

	private String instanceId6;

	private String instanceId9;

	private String instanceId8;

	private Long ownerId;

	private String scalingConfigurationId;

	private String healthStatus;

	private String instanceId10;

	private String instanceId12;

	private String instanceId11;

	private String scalingGroupId;

	private String lifecycleState;

	private Integer pageNumber;

	private Integer pageSize;

	private String instanceId20;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String instanceId18;

	private String instanceId17;

	private String instanceId19;

	private String instanceId14;

	private String instanceId13;

	private String instanceId16;

	private String instanceId15;
	public DescribeScalingInstancesRequest() {
		super("Ess", "2014-08-28", "DescribeScalingInstances", "ess");
		setMethod(MethodType.POST);
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

	public String getCreationType() {
		return this.creationType;
	}

	public void setCreationType(String creationType) {
		this.creationType = creationType;
		if(creationType != null){
			putQueryParameter("CreationType", creationType);
		}
	}

	public String getInstanceId1() {
		return this.instanceId1;
	}

	public void setInstanceId1(String instanceId1) {
		this.instanceId1 = instanceId1;
		if(instanceId1 != null){
			putQueryParameter("InstanceId.1", instanceId1);
		}
	}

	public String getInstanceId3() {
		return this.instanceId3;
	}

	public void setInstanceId3(String instanceId3) {
		this.instanceId3 = instanceId3;
		if(instanceId3 != null){
			putQueryParameter("InstanceId.3", instanceId3);
		}
	}

	public String getInstanceId2() {
		return this.instanceId2;
	}

	public void setInstanceId2(String instanceId2) {
		this.instanceId2 = instanceId2;
		if(instanceId2 != null){
			putQueryParameter("InstanceId.2", instanceId2);
		}
	}

	public String getInstanceId5() {
		return this.instanceId5;
	}

	public void setInstanceId5(String instanceId5) {
		this.instanceId5 = instanceId5;
		if(instanceId5 != null){
			putQueryParameter("InstanceId.5", instanceId5);
		}
	}

	public String getInstanceId4() {
		return this.instanceId4;
	}

	public void setInstanceId4(String instanceId4) {
		this.instanceId4 = instanceId4;
		if(instanceId4 != null){
			putQueryParameter("InstanceId.4", instanceId4);
		}
	}

	public String getInstanceId7() {
		return this.instanceId7;
	}

	public void setInstanceId7(String instanceId7) {
		this.instanceId7 = instanceId7;
		if(instanceId7 != null){
			putQueryParameter("InstanceId.7", instanceId7);
		}
	}

	public String getInstanceId6() {
		return this.instanceId6;
	}

	public void setInstanceId6(String instanceId6) {
		this.instanceId6 = instanceId6;
		if(instanceId6 != null){
			putQueryParameter("InstanceId.6", instanceId6);
		}
	}

	public String getInstanceId9() {
		return this.instanceId9;
	}

	public void setInstanceId9(String instanceId9) {
		this.instanceId9 = instanceId9;
		if(instanceId9 != null){
			putQueryParameter("InstanceId.9", instanceId9);
		}
	}

	public String getInstanceId8() {
		return this.instanceId8;
	}

	public void setInstanceId8(String instanceId8) {
		this.instanceId8 = instanceId8;
		if(instanceId8 != null){
			putQueryParameter("InstanceId.8", instanceId8);
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

	public String getScalingConfigurationId() {
		return this.scalingConfigurationId;
	}

	public void setScalingConfigurationId(String scalingConfigurationId) {
		this.scalingConfigurationId = scalingConfigurationId;
		if(scalingConfigurationId != null){
			putQueryParameter("ScalingConfigurationId", scalingConfigurationId);
		}
	}

	public String getHealthStatus() {
		return this.healthStatus;
	}

	public void setHealthStatus(String healthStatus) {
		this.healthStatus = healthStatus;
		if(healthStatus != null){
			putQueryParameter("HealthStatus", healthStatus);
		}
	}

	public String getInstanceId10() {
		return this.instanceId10;
	}

	public void setInstanceId10(String instanceId10) {
		this.instanceId10 = instanceId10;
		if(instanceId10 != null){
			putQueryParameter("InstanceId.10", instanceId10);
		}
	}

	public String getInstanceId12() {
		return this.instanceId12;
	}

	public void setInstanceId12(String instanceId12) {
		this.instanceId12 = instanceId12;
		if(instanceId12 != null){
			putQueryParameter("InstanceId.12", instanceId12);
		}
	}

	public String getInstanceId11() {
		return this.instanceId11;
	}

	public void setInstanceId11(String instanceId11) {
		this.instanceId11 = instanceId11;
		if(instanceId11 != null){
			putQueryParameter("InstanceId.11", instanceId11);
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

	public String getLifecycleState() {
		return this.lifecycleState;
	}

	public void setLifecycleState(String lifecycleState) {
		this.lifecycleState = lifecycleState;
		if(lifecycleState != null){
			putQueryParameter("LifecycleState", lifecycleState);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getInstanceId20() {
		return this.instanceId20;
	}

	public void setInstanceId20(String instanceId20) {
		this.instanceId20 = instanceId20;
		if(instanceId20 != null){
			putQueryParameter("InstanceId.20", instanceId20);
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

	public String getInstanceId18() {
		return this.instanceId18;
	}

	public void setInstanceId18(String instanceId18) {
		this.instanceId18 = instanceId18;
		if(instanceId18 != null){
			putQueryParameter("InstanceId.18", instanceId18);
		}
	}

	public String getInstanceId17() {
		return this.instanceId17;
	}

	public void setInstanceId17(String instanceId17) {
		this.instanceId17 = instanceId17;
		if(instanceId17 != null){
			putQueryParameter("InstanceId.17", instanceId17);
		}
	}

	public String getInstanceId19() {
		return this.instanceId19;
	}

	public void setInstanceId19(String instanceId19) {
		this.instanceId19 = instanceId19;
		if(instanceId19 != null){
			putQueryParameter("InstanceId.19", instanceId19);
		}
	}

	public String getInstanceId14() {
		return this.instanceId14;
	}

	public void setInstanceId14(String instanceId14) {
		this.instanceId14 = instanceId14;
		if(instanceId14 != null){
			putQueryParameter("InstanceId.14", instanceId14);
		}
	}

	public String getInstanceId13() {
		return this.instanceId13;
	}

	public void setInstanceId13(String instanceId13) {
		this.instanceId13 = instanceId13;
		if(instanceId13 != null){
			putQueryParameter("InstanceId.13", instanceId13);
		}
	}

	public String getInstanceId16() {
		return this.instanceId16;
	}

	public void setInstanceId16(String instanceId16) {
		this.instanceId16 = instanceId16;
		if(instanceId16 != null){
			putQueryParameter("InstanceId.16", instanceId16);
		}
	}

	public String getInstanceId15() {
		return this.instanceId15;
	}

	public void setInstanceId15(String instanceId15) {
		this.instanceId15 = instanceId15;
		if(instanceId15 != null){
			putQueryParameter("InstanceId.15", instanceId15);
		}
	}

	@Override
	public Class<DescribeScalingInstancesResponse> getResponseClass() {
		return DescribeScalingInstancesResponse.class;
	}

}
