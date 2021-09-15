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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeAutoProvisioningGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAutoProvisioningGroupsResponse extends AcsResponse {

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private Integer totalCount;

	private List<AutoProvisioningGroup> autoProvisioningGroups;

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<AutoProvisioningGroup> getAutoProvisioningGroups() {
		return this.autoProvisioningGroups;
	}

	public void setAutoProvisioningGroups(List<AutoProvisioningGroup> autoProvisioningGroups) {
		this.autoProvisioningGroups = autoProvisioningGroups;
	}

	public static class AutoProvisioningGroup {

		private String creationTime;

		private String autoProvisioningGroupName;

		private String status;

		private Boolean terminateInstances;

		private Float maxSpotPrice;

		private String state;

		private String launchTemplateId;

		private String validFrom;

		private String launchTemplateVersion;

		private Boolean terminateInstancesWithExpiration;

		private String regionId;

		private String validUntil;

		private String autoProvisioningGroupType;

		private String autoProvisioningGroupId;

		private String excessCapacityTerminationPolicy;

		private List<LaunchTemplateConfig> launchTemplateConfigs;

		private SpotOptions spotOptions;

		private PayAsYouGoOptions payAsYouGoOptions;

		private TargetCapacitySpecification targetCapacitySpecification;

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getAutoProvisioningGroupName() {
			return this.autoProvisioningGroupName;
		}

		public void setAutoProvisioningGroupName(String autoProvisioningGroupName) {
			this.autoProvisioningGroupName = autoProvisioningGroupName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Boolean getTerminateInstances() {
			return this.terminateInstances;
		}

		public void setTerminateInstances(Boolean terminateInstances) {
			this.terminateInstances = terminateInstances;
		}

		public Float getMaxSpotPrice() {
			return this.maxSpotPrice;
		}

		public void setMaxSpotPrice(Float maxSpotPrice) {
			this.maxSpotPrice = maxSpotPrice;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getLaunchTemplateId() {
			return this.launchTemplateId;
		}

		public void setLaunchTemplateId(String launchTemplateId) {
			this.launchTemplateId = launchTemplateId;
		}

		public String getValidFrom() {
			return this.validFrom;
		}

		public void setValidFrom(String validFrom) {
			this.validFrom = validFrom;
		}

		public String getLaunchTemplateVersion() {
			return this.launchTemplateVersion;
		}

		public void setLaunchTemplateVersion(String launchTemplateVersion) {
			this.launchTemplateVersion = launchTemplateVersion;
		}

		public Boolean getTerminateInstancesWithExpiration() {
			return this.terminateInstancesWithExpiration;
		}

		public void setTerminateInstancesWithExpiration(Boolean terminateInstancesWithExpiration) {
			this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getValidUntil() {
			return this.validUntil;
		}

		public void setValidUntil(String validUntil) {
			this.validUntil = validUntil;
		}

		public String getAutoProvisioningGroupType() {
			return this.autoProvisioningGroupType;
		}

		public void setAutoProvisioningGroupType(String autoProvisioningGroupType) {
			this.autoProvisioningGroupType = autoProvisioningGroupType;
		}

		public String getAutoProvisioningGroupId() {
			return this.autoProvisioningGroupId;
		}

		public void setAutoProvisioningGroupId(String autoProvisioningGroupId) {
			this.autoProvisioningGroupId = autoProvisioningGroupId;
		}

		public String getExcessCapacityTerminationPolicy() {
			return this.excessCapacityTerminationPolicy;
		}

		public void setExcessCapacityTerminationPolicy(String excessCapacityTerminationPolicy) {
			this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
		}

		public List<LaunchTemplateConfig> getLaunchTemplateConfigs() {
			return this.launchTemplateConfigs;
		}

		public void setLaunchTemplateConfigs(List<LaunchTemplateConfig> launchTemplateConfigs) {
			this.launchTemplateConfigs = launchTemplateConfigs;
		}

		public SpotOptions getSpotOptions() {
			return this.spotOptions;
		}

		public void setSpotOptions(SpotOptions spotOptions) {
			this.spotOptions = spotOptions;
		}

		public PayAsYouGoOptions getPayAsYouGoOptions() {
			return this.payAsYouGoOptions;
		}

		public void setPayAsYouGoOptions(PayAsYouGoOptions payAsYouGoOptions) {
			this.payAsYouGoOptions = payAsYouGoOptions;
		}

		public TargetCapacitySpecification getTargetCapacitySpecification() {
			return this.targetCapacitySpecification;
		}

		public void setTargetCapacitySpecification(TargetCapacitySpecification targetCapacitySpecification) {
			this.targetCapacitySpecification = targetCapacitySpecification;
		}

		public static class LaunchTemplateConfig {

			private Float maxPrice;

			private Float priority;

			private String vSwitchId;

			private Float weightedCapacity;

			private String instanceType;

			public Float getMaxPrice() {
				return this.maxPrice;
			}

			public void setMaxPrice(Float maxPrice) {
				this.maxPrice = maxPrice;
			}

			public Float getPriority() {
				return this.priority;
			}

			public void setPriority(Float priority) {
				this.priority = priority;
			}

			public String getVSwitchId() {
				return this.vSwitchId;
			}

			public void setVSwitchId(String vSwitchId) {
				this.vSwitchId = vSwitchId;
			}

			public Float getWeightedCapacity() {
				return this.weightedCapacity;
			}

			public void setWeightedCapacity(Float weightedCapacity) {
				this.weightedCapacity = weightedCapacity;
			}

			public String getInstanceType() {
				return this.instanceType;
			}

			public void setInstanceType(String instanceType) {
				this.instanceType = instanceType;
			}
		}

		public static class SpotOptions {

			private Integer instancePoolsToUseCount;

			private String allocationStrategy;

			private String instanceInterruptionBehavior;

			public Integer getInstancePoolsToUseCount() {
				return this.instancePoolsToUseCount;
			}

			public void setInstancePoolsToUseCount(Integer instancePoolsToUseCount) {
				this.instancePoolsToUseCount = instancePoolsToUseCount;
			}

			public String getAllocationStrategy() {
				return this.allocationStrategy;
			}

			public void setAllocationStrategy(String allocationStrategy) {
				this.allocationStrategy = allocationStrategy;
			}

			public String getInstanceInterruptionBehavior() {
				return this.instanceInterruptionBehavior;
			}

			public void setInstanceInterruptionBehavior(String instanceInterruptionBehavior) {
				this.instanceInterruptionBehavior = instanceInterruptionBehavior;
			}
		}

		public static class PayAsYouGoOptions {

			private String allocationStrategy;

			public String getAllocationStrategy() {
				return this.allocationStrategy;
			}

			public void setAllocationStrategy(String allocationStrategy) {
				this.allocationStrategy = allocationStrategy;
			}
		}

		public static class TargetCapacitySpecification {

			private Float spotTargetCapacity;

			private Float payAsYouGoTargetCapacity;

			private String defaultTargetCapacityType;

			private Float totalTargetCapacity;

			public Float getSpotTargetCapacity() {
				return this.spotTargetCapacity;
			}

			public void setSpotTargetCapacity(Float spotTargetCapacity) {
				this.spotTargetCapacity = spotTargetCapacity;
			}

			public Float getPayAsYouGoTargetCapacity() {
				return this.payAsYouGoTargetCapacity;
			}

			public void setPayAsYouGoTargetCapacity(Float payAsYouGoTargetCapacity) {
				this.payAsYouGoTargetCapacity = payAsYouGoTargetCapacity;
			}

			public String getDefaultTargetCapacityType() {
				return this.defaultTargetCapacityType;
			}

			public void setDefaultTargetCapacityType(String defaultTargetCapacityType) {
				this.defaultTargetCapacityType = defaultTargetCapacityType;
			}

			public Float getTotalTargetCapacity() {
				return this.totalTargetCapacity;
			}

			public void setTotalTargetCapacity(Float totalTargetCapacity) {
				this.totalTargetCapacity = totalTargetCapacity;
			}
		}
	}

	@Override
	public DescribeAutoProvisioningGroupsResponse getInstance(UnmarshallerContext context) {
		return	DescribeAutoProvisioningGroupsResponseUnmarshaller.unmarshall(this, context);
	}
}
