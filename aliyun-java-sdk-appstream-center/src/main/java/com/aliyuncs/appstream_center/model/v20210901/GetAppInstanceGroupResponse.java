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

package com.aliyuncs.appstream_center.model.v20210901;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.appstream_center.transform.v20210901.GetAppInstanceGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAppInstanceGroupResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageSize;

	private Integer pageNumber;

	private AppInstanceGroupModels appInstanceGroupModels;

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

	public AppInstanceGroupModels getAppInstanceGroupModels() {
		return this.appInstanceGroupModels;
	}

	public void setAppInstanceGroupModels(AppInstanceGroupModels appInstanceGroupModels) {
		this.appInstanceGroupModels = appInstanceGroupModels;
	}

	public static class AppInstanceGroupModels {

		private String appCenterImageId;

		private String aliyunImageId;

		private String regionId;

		private String productType;

		private String appInstanceType;

		private String appInstanceGroupId;

		private String cpu;

		private String gpu;

		private Long memory;

		private Integer amount;

		private Integer minAmount;

		private Integer maxAmount;

		private String chargeType;

		private String gmtCreate;

		private String status;

		private String specId;

		private String sessionTimeout;

		private String appInstanceGroupName;

		private String expiredTime;

		private String osType;

		private String appCenterImageName;

		private String resourceStatus;

		private String appPolicyId;

		private List<AppsItem> apps;

		private List<Node> nodePool;

		private OtaInfo otaInfo;

		public String getAppCenterImageId() {
			return this.appCenterImageId;
		}

		public void setAppCenterImageId(String appCenterImageId) {
			this.appCenterImageId = appCenterImageId;
		}

		public String getAliyunImageId() {
			return this.aliyunImageId;
		}

		public void setAliyunImageId(String aliyunImageId) {
			this.aliyunImageId = aliyunImageId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getProductType() {
			return this.productType;
		}

		public void setProductType(String productType) {
			this.productType = productType;
		}

		public String getAppInstanceType() {
			return this.appInstanceType;
		}

		public void setAppInstanceType(String appInstanceType) {
			this.appInstanceType = appInstanceType;
		}

		public String getAppInstanceGroupId() {
			return this.appInstanceGroupId;
		}

		public void setAppInstanceGroupId(String appInstanceGroupId) {
			this.appInstanceGroupId = appInstanceGroupId;
		}

		public String getCpu() {
			return this.cpu;
		}

		public void setCpu(String cpu) {
			this.cpu = cpu;
		}

		public String getGpu() {
			return this.gpu;
		}

		public void setGpu(String gpu) {
			this.gpu = gpu;
		}

		public Long getMemory() {
			return this.memory;
		}

		public void setMemory(Long memory) {
			this.memory = memory;
		}

		public Integer getAmount() {
			return this.amount;
		}

		public void setAmount(Integer amount) {
			this.amount = amount;
		}

		public Integer getMinAmount() {
			return this.minAmount;
		}

		public void setMinAmount(Integer minAmount) {
			this.minAmount = minAmount;
		}

		public Integer getMaxAmount() {
			return this.maxAmount;
		}

		public void setMaxAmount(Integer maxAmount) {
			this.maxAmount = maxAmount;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getSpecId() {
			return this.specId;
		}

		public void setSpecId(String specId) {
			this.specId = specId;
		}

		public String getSessionTimeout() {
			return this.sessionTimeout;
		}

		public void setSessionTimeout(String sessionTimeout) {
			this.sessionTimeout = sessionTimeout;
		}

		public String getAppInstanceGroupName() {
			return this.appInstanceGroupName;
		}

		public void setAppInstanceGroupName(String appInstanceGroupName) {
			this.appInstanceGroupName = appInstanceGroupName;
		}

		public String getExpiredTime() {
			return this.expiredTime;
		}

		public void setExpiredTime(String expiredTime) {
			this.expiredTime = expiredTime;
		}

		public String getOsType() {
			return this.osType;
		}

		public void setOsType(String osType) {
			this.osType = osType;
		}

		public String getAppCenterImageName() {
			return this.appCenterImageName;
		}

		public void setAppCenterImageName(String appCenterImageName) {
			this.appCenterImageName = appCenterImageName;
		}

		public String getResourceStatus() {
			return this.resourceStatus;
		}

		public void setResourceStatus(String resourceStatus) {
			this.resourceStatus = resourceStatus;
		}

		public String getAppPolicyId() {
			return this.appPolicyId;
		}

		public void setAppPolicyId(String appPolicyId) {
			this.appPolicyId = appPolicyId;
		}

		public List<AppsItem> getApps() {
			return this.apps;
		}

		public void setApps(List<AppsItem> apps) {
			this.apps = apps;
		}

		public List<Node> getNodePool() {
			return this.nodePool;
		}

		public void setNodePool(List<Node> nodePool) {
			this.nodePool = nodePool;
		}

		public OtaInfo getOtaInfo() {
			return this.otaInfo;
		}

		public void setOtaInfo(OtaInfo otaInfo) {
			this.otaInfo = otaInfo;
		}

		public static class AppsItem {

			private String appId;

			private String appName;

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

			public String getAppName() {
				return this.appName;
			}

			public void setAppName(String appName) {
				this.appName = appName;
			}
		}

		public static class Node {

			private String nodePoolId;

			private String nodeInstanceType;

			private Integer nodeAmount;

			private Integer nodeUsed;

			private Integer nodeCapacity;

			private Integer scalingNodeAmount;

			private Integer scalingNodeUsed;

			private String strategyType;

			private Integer amount;

			private Integer maxScalingAmount;

			private Integer scalingStep;

			private String scalingUsageThreshold;

			private Integer scalingDownAfterIdleMinutes;

			private String strategyDisableDate;

			private String strategyEnableDate;

			private Boolean warmUp;

			private String nodeTypeName;

			private List<RecurrenceSchedule> recurrenceSchedules;

			public String getNodePoolId() {
				return this.nodePoolId;
			}

			public void setNodePoolId(String nodePoolId) {
				this.nodePoolId = nodePoolId;
			}

			public String getNodeInstanceType() {
				return this.nodeInstanceType;
			}

			public void setNodeInstanceType(String nodeInstanceType) {
				this.nodeInstanceType = nodeInstanceType;
			}

			public Integer getNodeAmount() {
				return this.nodeAmount;
			}

			public void setNodeAmount(Integer nodeAmount) {
				this.nodeAmount = nodeAmount;
			}

			public Integer getNodeUsed() {
				return this.nodeUsed;
			}

			public void setNodeUsed(Integer nodeUsed) {
				this.nodeUsed = nodeUsed;
			}

			public Integer getNodeCapacity() {
				return this.nodeCapacity;
			}

			public void setNodeCapacity(Integer nodeCapacity) {
				this.nodeCapacity = nodeCapacity;
			}

			public Integer getScalingNodeAmount() {
				return this.scalingNodeAmount;
			}

			public void setScalingNodeAmount(Integer scalingNodeAmount) {
				this.scalingNodeAmount = scalingNodeAmount;
			}

			public Integer getScalingNodeUsed() {
				return this.scalingNodeUsed;
			}

			public void setScalingNodeUsed(Integer scalingNodeUsed) {
				this.scalingNodeUsed = scalingNodeUsed;
			}

			public String getStrategyType() {
				return this.strategyType;
			}

			public void setStrategyType(String strategyType) {
				this.strategyType = strategyType;
			}

			public Integer getAmount() {
				return this.amount;
			}

			public void setAmount(Integer amount) {
				this.amount = amount;
			}

			public Integer getMaxScalingAmount() {
				return this.maxScalingAmount;
			}

			public void setMaxScalingAmount(Integer maxScalingAmount) {
				this.maxScalingAmount = maxScalingAmount;
			}

			public Integer getScalingStep() {
				return this.scalingStep;
			}

			public void setScalingStep(Integer scalingStep) {
				this.scalingStep = scalingStep;
			}

			public String getScalingUsageThreshold() {
				return this.scalingUsageThreshold;
			}

			public void setScalingUsageThreshold(String scalingUsageThreshold) {
				this.scalingUsageThreshold = scalingUsageThreshold;
			}

			public Integer getScalingDownAfterIdleMinutes() {
				return this.scalingDownAfterIdleMinutes;
			}

			public void setScalingDownAfterIdleMinutes(Integer scalingDownAfterIdleMinutes) {
				this.scalingDownAfterIdleMinutes = scalingDownAfterIdleMinutes;
			}

			public String getStrategyDisableDate() {
				return this.strategyDisableDate;
			}

			public void setStrategyDisableDate(String strategyDisableDate) {
				this.strategyDisableDate = strategyDisableDate;
			}

			public String getStrategyEnableDate() {
				return this.strategyEnableDate;
			}

			public void setStrategyEnableDate(String strategyEnableDate) {
				this.strategyEnableDate = strategyEnableDate;
			}

			public Boolean getWarmUp() {
				return this.warmUp;
			}

			public void setWarmUp(Boolean warmUp) {
				this.warmUp = warmUp;
			}

			public String getNodeTypeName() {
				return this.nodeTypeName;
			}

			public void setNodeTypeName(String nodeTypeName) {
				this.nodeTypeName = nodeTypeName;
			}

			public List<RecurrenceSchedule> getRecurrenceSchedules() {
				return this.recurrenceSchedules;
			}

			public void setRecurrenceSchedules(List<RecurrenceSchedule> recurrenceSchedules) {
				this.recurrenceSchedules = recurrenceSchedules;
			}

			public static class RecurrenceSchedule {

				private String recurrenceType;

				private List<TimerPeriod> timerPeriods;

				private List<Integer> recurrenceValues;

				public String getRecurrenceType() {
					return this.recurrenceType;
				}

				public void setRecurrenceType(String recurrenceType) {
					this.recurrenceType = recurrenceType;
				}

				public List<TimerPeriod> getTimerPeriods() {
					return this.timerPeriods;
				}

				public void setTimerPeriods(List<TimerPeriod> timerPeriods) {
					this.timerPeriods = timerPeriods;
				}

				public List<Integer> getRecurrenceValues() {
					return this.recurrenceValues;
				}

				public void setRecurrenceValues(List<Integer> recurrenceValues) {
					this.recurrenceValues = recurrenceValues;
				}

				public static class TimerPeriod {

					private Integer amount;

					private String endTime;

					private String startTime;

					public Integer getAmount() {
						return this.amount;
					}

					public void setAmount(Integer amount) {
						this.amount = amount;
					}

					public String getEndTime() {
						return this.endTime;
					}

					public void setEndTime(String endTime) {
						this.endTime = endTime;
					}

					public String getStartTime() {
						return this.startTime;
					}

					public void setStartTime(String startTime) {
						this.startTime = startTime;
					}
				}
			}
		}

		public static class OtaInfo {

			private String otaVersion;

			private String newOtaVersion;

			private String taskId;

			public String getOtaVersion() {
				return this.otaVersion;
			}

			public void setOtaVersion(String otaVersion) {
				this.otaVersion = otaVersion;
			}

			public String getNewOtaVersion() {
				return this.newOtaVersion;
			}

			public void setNewOtaVersion(String newOtaVersion) {
				this.newOtaVersion = newOtaVersion;
			}

			public String getTaskId() {
				return this.taskId;
			}

			public void setTaskId(String taskId) {
				this.taskId = taskId;
			}
		}
	}

	@Override
	public GetAppInstanceGroupResponse getInstance(UnmarshallerContext context) {
		return	GetAppInstanceGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
