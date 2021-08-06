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
public class DescribeScalingInstancesRequest extends RpcAcsRequest<DescribeScalingInstancesResponse> {
	   

	private Long resourceOwnerId;

	private String scalingGroupId;

	private String lifecycleState;

	private String creationType;

	private Integer pageNumber;

	private Integer pageSize;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String scalingActivityId;

	private String scalingConfigurationId;

	private List<String> instanceIds;

	private String healthStatus;
	public DescribeScalingInstancesRequest() {
		super("Ess", "2014-08-28", "DescribeScalingInstances", "ess");
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

	public String getLifecycleState() {
		return this.lifecycleState;
	}

	public void setLifecycleState(String lifecycleState) {
		this.lifecycleState = lifecycleState;
		if(lifecycleState != null){
			putQueryParameter("LifecycleState", lifecycleState);
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

	public String getScalingActivityId() {
		return this.scalingActivityId;
	}

	public void setScalingActivityId(String scalingActivityId) {
		this.scalingActivityId = scalingActivityId;
		if(scalingActivityId != null){
			putQueryParameter("ScalingActivityId", scalingActivityId);
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

	public String getHealthStatus() {
		return this.healthStatus;
	}

	public void setHealthStatus(String healthStatus) {
		this.healthStatus = healthStatus;
		if(healthStatus != null){
			putQueryParameter("HealthStatus", healthStatus);
		}
	}

	@Override
	public Class<DescribeScalingInstancesResponse> getResponseClass() {
		return DescribeScalingInstancesResponse.class;
	}

}
