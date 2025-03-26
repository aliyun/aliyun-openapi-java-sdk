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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ess.transform.v20140828.DescribeScalingInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeScalingInstancesResponse extends AcsResponse {

	private String requestId;

	private Integer pageSize;

	private Integer pageNumber;

	private Integer totalSpotCount;

	private Integer totalCount;

	private List<ScalingInstance> scalingInstances;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getTotalSpotCount() {
		return this.totalSpotCount;
	}

	public void setTotalSpotCount(Integer totalSpotCount) {
		this.totalSpotCount = totalSpotCount;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<ScalingInstance> getScalingInstances() {
		return this.scalingInstances;
	}

	public void setScalingInstances(List<ScalingInstance> scalingInstances) {
		this.scalingInstances = scalingInstances;
	}

	public static class ScalingInstance {

		private String creationTime;

		private Integer loadBalancerWeight;

		private String launchTemplateId;

		private String instanceId;

		private String spotStrategy;

		private String launchTemplateVersion;

		private String healthStatus;

		private String scalingGroupId;

		private String warmupState;

		private String lifecycleState;

		private String creationType;

		private String zoneId;

		private String scalingConfigurationId;

		private Boolean entrusted;

		private Integer weightedCapacity;

		private String createdTime;

		private String scalingActivityId;

		private String instanceType;

		private String scalingInstanceId;

		private String privateIpAddress;

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public Integer getLoadBalancerWeight() {
			return this.loadBalancerWeight;
		}

		public void setLoadBalancerWeight(Integer loadBalancerWeight) {
			this.loadBalancerWeight = loadBalancerWeight;
		}

		public String getLaunchTemplateId() {
			return this.launchTemplateId;
		}

		public void setLaunchTemplateId(String launchTemplateId) {
			this.launchTemplateId = launchTemplateId;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getSpotStrategy() {
			return this.spotStrategy;
		}

		public void setSpotStrategy(String spotStrategy) {
			this.spotStrategy = spotStrategy;
		}

		public String getLaunchTemplateVersion() {
			return this.launchTemplateVersion;
		}

		public void setLaunchTemplateVersion(String launchTemplateVersion) {
			this.launchTemplateVersion = launchTemplateVersion;
		}

		public String getHealthStatus() {
			return this.healthStatus;
		}

		public void setHealthStatus(String healthStatus) {
			this.healthStatus = healthStatus;
		}

		public String getScalingGroupId() {
			return this.scalingGroupId;
		}

		public void setScalingGroupId(String scalingGroupId) {
			this.scalingGroupId = scalingGroupId;
		}

		public String getWarmupState() {
			return this.warmupState;
		}

		public void setWarmupState(String warmupState) {
			this.warmupState = warmupState;
		}

		public String getLifecycleState() {
			return this.lifecycleState;
		}

		public void setLifecycleState(String lifecycleState) {
			this.lifecycleState = lifecycleState;
		}

		public String getCreationType() {
			return this.creationType;
		}

		public void setCreationType(String creationType) {
			this.creationType = creationType;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getScalingConfigurationId() {
			return this.scalingConfigurationId;
		}

		public void setScalingConfigurationId(String scalingConfigurationId) {
			this.scalingConfigurationId = scalingConfigurationId;
		}

		public Boolean getEntrusted() {
			return this.entrusted;
		}

		public void setEntrusted(Boolean entrusted) {
			this.entrusted = entrusted;
		}

		public Integer getWeightedCapacity() {
			return this.weightedCapacity;
		}

		public void setWeightedCapacity(Integer weightedCapacity) {
			this.weightedCapacity = weightedCapacity;
		}

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}

		public String getScalingActivityId() {
			return this.scalingActivityId;
		}

		public void setScalingActivityId(String scalingActivityId) {
			this.scalingActivityId = scalingActivityId;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getScalingInstanceId() {
			return this.scalingInstanceId;
		}

		public void setScalingInstanceId(String scalingInstanceId) {
			this.scalingInstanceId = scalingInstanceId;
		}

		public String getPrivateIpAddress() {
			return this.privateIpAddress;
		}

		public void setPrivateIpAddress(String privateIpAddress) {
			this.privateIpAddress = privateIpAddress;
		}
	}

	@Override
	public DescribeScalingInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeScalingInstancesResponseUnmarshaller.unmarshall(this, context);
	}
}
