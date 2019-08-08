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
import com.aliyuncs.ecs.transform.v20140526.DescribeFleetsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeFleetsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<Fleet> fleets;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<Fleet> getFleets() {
		return this.fleets;
	}

	public void setFleets(List<Fleet> fleets) {
		this.fleets = fleets;
	}

	public static class Fleet {

		private String fleetId;

		private String fleetName;

		private String fleetType;

		private String status;

		private String state;

		private String regionId;

		private String validFrom;

		private String validUntil;

		private String excessCapacityTerminationPolicy;

		private Float maxSpotPrice;

		private String launchTemplateId;

		private String launchTemplateVersion;

		private Boolean terminateInstances;

		private Boolean terminateInstancesWithExpiration;

		private String creationTime;

		private List<LaunchTemplateConfig> launchTemplateConfigs;

		private SpotOptions spotOptions;

		private OnDemandOptions onDemandOptions;

		private TargetCapacitySpecification targetCapacitySpecification;

		public String getFleetId() {
			return this.fleetId;
		}

		public void setFleetId(String fleetId) {
			this.fleetId = fleetId;
		}

		public String getFleetName() {
			return this.fleetName;
		}

		public void setFleetName(String fleetName) {
			this.fleetName = fleetName;
		}

		public String getFleetType() {
			return this.fleetType;
		}

		public void setFleetType(String fleetType) {
			this.fleetType = fleetType;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getBizRegionId() {
			return this.regionId;
		}

		public void setBizRegionId(String regionId) {
			this.regionId = regionId;
		}

		/**
		 * @deprecated use getBizRegionId instead of this.
		 */
		@Deprecated
		public String getRegionId() {
			return this.regionId;
		}

		/**
		 * @deprecated use setBizRegionId instead of this.
		 */
		@Deprecated
		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getValidFrom() {
			return this.validFrom;
		}

		public void setValidFrom(String validFrom) {
			this.validFrom = validFrom;
		}

		public String getValidUntil() {
			return this.validUntil;
		}

		public void setValidUntil(String validUntil) {
			this.validUntil = validUntil;
		}

		public String getExcessCapacityTerminationPolicy() {
			return this.excessCapacityTerminationPolicy;
		}

		public void setExcessCapacityTerminationPolicy(String excessCapacityTerminationPolicy) {
			this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
		}

		public Float getMaxSpotPrice() {
			return this.maxSpotPrice;
		}

		public void setMaxSpotPrice(Float maxSpotPrice) {
			this.maxSpotPrice = maxSpotPrice;
		}

		public String getLaunchTemplateId() {
			return this.launchTemplateId;
		}

		public void setLaunchTemplateId(String launchTemplateId) {
			this.launchTemplateId = launchTemplateId;
		}

		public String getLaunchTemplateVersion() {
			return this.launchTemplateVersion;
		}

		public void setLaunchTemplateVersion(String launchTemplateVersion) {
			this.launchTemplateVersion = launchTemplateVersion;
		}

		public Boolean getTerminateInstances() {
			return this.terminateInstances;
		}

		public void setTerminateInstances(Boolean terminateInstances) {
			this.terminateInstances = terminateInstances;
		}

		public Boolean getTerminateInstancesWithExpiration() {
			return this.terminateInstancesWithExpiration;
		}

		public void setTerminateInstancesWithExpiration(Boolean terminateInstancesWithExpiration) {
			this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
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

		public OnDemandOptions getOnDemandOptions() {
			return this.onDemandOptions;
		}

		public void setOnDemandOptions(OnDemandOptions onDemandOptions) {
			this.onDemandOptions = onDemandOptions;
		}

		public TargetCapacitySpecification getTargetCapacitySpecification() {
			return this.targetCapacitySpecification;
		}

		public void setTargetCapacitySpecification(TargetCapacitySpecification targetCapacitySpecification) {
			this.targetCapacitySpecification = targetCapacitySpecification;
		}

		public static class LaunchTemplateConfig {

			private String instanceType;

			private Float maxPrice;

			private String vSWitchId;

			private Float weightedCapacity;

			private Float priority;

			public String getInstanceType() {
				return this.instanceType;
			}

			public void setInstanceType(String instanceType) {
				this.instanceType = instanceType;
			}

			public Float getMaxPrice() {
				return this.maxPrice;
			}

			public void setMaxPrice(Float maxPrice) {
				this.maxPrice = maxPrice;
			}

			public String getVSWitchId() {
				return this.vSWitchId;
			}

			public void setVSWitchId(String vSWitchId) {
				this.vSWitchId = vSWitchId;
			}

			public Float getWeightedCapacity() {
				return this.weightedCapacity;
			}

			public void setWeightedCapacity(Float weightedCapacity) {
				this.weightedCapacity = weightedCapacity;
			}

			public Float getPriority() {
				return this.priority;
			}

			public void setPriority(Float priority) {
				this.priority = priority;
			}
		}

		public static class SpotOptions {

			private String allocationStrategy;

			private String instanceInterruptionBehavior;

			private Integer instancePoolsToUseCount;

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

			public Integer getInstancePoolsToUseCount() {
				return this.instancePoolsToUseCount;
			}

			public void setInstancePoolsToUseCount(Integer instancePoolsToUseCount) {
				this.instancePoolsToUseCount = instancePoolsToUseCount;
			}
		}

		public static class OnDemandOptions {

			private String allocationStrategy;

			public String getAllocationStrategy() {
				return this.allocationStrategy;
			}

			public void setAllocationStrategy(String allocationStrategy) {
				this.allocationStrategy = allocationStrategy;
			}
		}

		public static class TargetCapacitySpecification {

			private Float totalTargetCapacity;

			private Float onDemandTargetCapacity;

			private Float spotTargetCapacity;

			private String defaultTargetCapacityType;

			private Boolean fillGapWithOnDemand;

			public Float getTotalTargetCapacity() {
				return this.totalTargetCapacity;
			}

			public void setTotalTargetCapacity(Float totalTargetCapacity) {
				this.totalTargetCapacity = totalTargetCapacity;
			}

			public Float getOnDemandTargetCapacity() {
				return this.onDemandTargetCapacity;
			}

			public void setOnDemandTargetCapacity(Float onDemandTargetCapacity) {
				this.onDemandTargetCapacity = onDemandTargetCapacity;
			}

			public Float getSpotTargetCapacity() {
				return this.spotTargetCapacity;
			}

			public void setSpotTargetCapacity(Float spotTargetCapacity) {
				this.spotTargetCapacity = spotTargetCapacity;
			}

			public String getDefaultTargetCapacityType() {
				return this.defaultTargetCapacityType;
			}

			public void setDefaultTargetCapacityType(String defaultTargetCapacityType) {
				this.defaultTargetCapacityType = defaultTargetCapacityType;
			}

			public Boolean getFillGapWithOnDemand() {
				return this.fillGapWithOnDemand;
			}

			public void setFillGapWithOnDemand(Boolean fillGapWithOnDemand) {
				this.fillGapWithOnDemand = fillGapWithOnDemand;
			}
		}
	}

	@Override
	public DescribeFleetsResponse getInstance(UnmarshallerContext context) {
		return	DescribeFleetsResponseUnmarshaller.unmarshall(this, context);
	}
}
