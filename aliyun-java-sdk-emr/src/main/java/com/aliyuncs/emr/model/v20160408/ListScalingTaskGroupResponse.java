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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.ListScalingTaskGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListScalingTaskGroupResponse extends AcsResponse {

	private String requestId;

	private List<Group> groupList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Group> getGroupList() {
		return this.groupList;
	}

	public void setGroupList(List<Group> groupList) {
		this.groupList = groupList;
	}

	public static class Group {

		private String scalingGroupId;

		private String hostGroupId;

		private Integer minSize;

		private Integer maxSize;

		private Integer defaultCooldown;

		private String activeRuleCategory;

		private String status;

		private String payType;

		private String dataDiskCategory;

		private Integer dataDiskSize;

		private Integer dataDiskCount;

		private String sysDiskCategory;

		private Integer sysDiskSize;

		private Integer cpuCount;

		private Integer memSize;

		private String spotStrategy;

		private List<SpotPriceLimit> spotPriceLimits;

		private List<ScalingRule> scalingRuleList;

		private List<String> instanceTypeList;

		private ScalingConfig scalingConfig;

		public String getScalingGroupId() {
			return this.scalingGroupId;
		}

		public void setScalingGroupId(String scalingGroupId) {
			this.scalingGroupId = scalingGroupId;
		}

		public String getHostGroupId() {
			return this.hostGroupId;
		}

		public void setHostGroupId(String hostGroupId) {
			this.hostGroupId = hostGroupId;
		}

		public Integer getMinSize() {
			return this.minSize;
		}

		public void setMinSize(Integer minSize) {
			this.minSize = minSize;
		}

		public Integer getMaxSize() {
			return this.maxSize;
		}

		public void setMaxSize(Integer maxSize) {
			this.maxSize = maxSize;
		}

		public Integer getDefaultCooldown() {
			return this.defaultCooldown;
		}

		public void setDefaultCooldown(Integer defaultCooldown) {
			this.defaultCooldown = defaultCooldown;
		}

		public String getActiveRuleCategory() {
			return this.activeRuleCategory;
		}

		public void setActiveRuleCategory(String activeRuleCategory) {
			this.activeRuleCategory = activeRuleCategory;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getPayType() {
			return this.payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
		}

		public String getDataDiskCategory() {
			return this.dataDiskCategory;
		}

		public void setDataDiskCategory(String dataDiskCategory) {
			this.dataDiskCategory = dataDiskCategory;
		}

		public Integer getDataDiskSize() {
			return this.dataDiskSize;
		}

		public void setDataDiskSize(Integer dataDiskSize) {
			this.dataDiskSize = dataDiskSize;
		}

		public Integer getDataDiskCount() {
			return this.dataDiskCount;
		}

		public void setDataDiskCount(Integer dataDiskCount) {
			this.dataDiskCount = dataDiskCount;
		}

		public String getSysDiskCategory() {
			return this.sysDiskCategory;
		}

		public void setSysDiskCategory(String sysDiskCategory) {
			this.sysDiskCategory = sysDiskCategory;
		}

		public Integer getSysDiskSize() {
			return this.sysDiskSize;
		}

		public void setSysDiskSize(Integer sysDiskSize) {
			this.sysDiskSize = sysDiskSize;
		}

		public Integer getCpuCount() {
			return this.cpuCount;
		}

		public void setCpuCount(Integer cpuCount) {
			this.cpuCount = cpuCount;
		}

		public Integer getMemSize() {
			return this.memSize;
		}

		public void setMemSize(Integer memSize) {
			this.memSize = memSize;
		}

		public String getSpotStrategy() {
			return this.spotStrategy;
		}

		public void setSpotStrategy(String spotStrategy) {
			this.spotStrategy = spotStrategy;
		}

		public List<SpotPriceLimit> getSpotPriceLimits() {
			return this.spotPriceLimits;
		}

		public void setSpotPriceLimits(List<SpotPriceLimit> spotPriceLimits) {
			this.spotPriceLimits = spotPriceLimits;
		}

		public List<ScalingRule> getScalingRuleList() {
			return this.scalingRuleList;
		}

		public void setScalingRuleList(List<ScalingRule> scalingRuleList) {
			this.scalingRuleList = scalingRuleList;
		}

		public List<String> getInstanceTypeList() {
			return this.instanceTypeList;
		}

		public void setInstanceTypeList(List<String> instanceTypeList) {
			this.instanceTypeList = instanceTypeList;
		}

		public ScalingConfig getScalingConfig() {
			return this.scalingConfig;
		}

		public void setScalingConfig(ScalingConfig scalingConfig) {
			this.scalingConfig = scalingConfig;
		}

		public static class SpotPriceLimit {

			private String instanceType;

			private Float priceLimit;

			public String getInstanceType() {
				return this.instanceType;
			}

			public void setInstanceType(String instanceType) {
				this.instanceType = instanceType;
			}

			public Float getPriceLimit() {
				return this.priceLimit;
			}

			public void setPriceLimit(Float priceLimit) {
				this.priceLimit = priceLimit;
			}
		}

		public static class ScalingRule {

			private String id;

			private String ruleCategory;

			private String ruleName;

			private String adjustmentType;

			private Integer adjustmentValue;

			private Integer cooldown;

			private String status;

			private String launchTime;

			private Integer launchExpirationTime;

			private String recurrenceType;

			private String recurrenceValue;

			private String recurrenceEndTime;

			private SchedulerTrigger schedulerTrigger;

			private CloudWatchTrigger cloudWatchTrigger;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getRuleCategory() {
				return this.ruleCategory;
			}

			public void setRuleCategory(String ruleCategory) {
				this.ruleCategory = ruleCategory;
			}

			public String getRuleName() {
				return this.ruleName;
			}

			public void setRuleName(String ruleName) {
				this.ruleName = ruleName;
			}

			public String getAdjustmentType() {
				return this.adjustmentType;
			}

			public void setAdjustmentType(String adjustmentType) {
				this.adjustmentType = adjustmentType;
			}

			public Integer getAdjustmentValue() {
				return this.adjustmentValue;
			}

			public void setAdjustmentValue(Integer adjustmentValue) {
				this.adjustmentValue = adjustmentValue;
			}

			public Integer getCooldown() {
				return this.cooldown;
			}

			public void setCooldown(Integer cooldown) {
				this.cooldown = cooldown;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getLaunchTime() {
				return this.launchTime;
			}

			public void setLaunchTime(String launchTime) {
				this.launchTime = launchTime;
			}

			public Integer getLaunchExpirationTime() {
				return this.launchExpirationTime;
			}

			public void setLaunchExpirationTime(Integer launchExpirationTime) {
				this.launchExpirationTime = launchExpirationTime;
			}

			public String getRecurrenceType() {
				return this.recurrenceType;
			}

			public void setRecurrenceType(String recurrenceType) {
				this.recurrenceType = recurrenceType;
			}

			public String getRecurrenceValue() {
				return this.recurrenceValue;
			}

			public void setRecurrenceValue(String recurrenceValue) {
				this.recurrenceValue = recurrenceValue;
			}

			public String getRecurrenceEndTime() {
				return this.recurrenceEndTime;
			}

			public void setRecurrenceEndTime(String recurrenceEndTime) {
				this.recurrenceEndTime = recurrenceEndTime;
			}

			public SchedulerTrigger getSchedulerTrigger() {
				return this.schedulerTrigger;
			}

			public void setSchedulerTrigger(SchedulerTrigger schedulerTrigger) {
				this.schedulerTrigger = schedulerTrigger;
			}

			public CloudWatchTrigger getCloudWatchTrigger() {
				return this.cloudWatchTrigger;
			}

			public void setCloudWatchTrigger(CloudWatchTrigger cloudWatchTrigger) {
				this.cloudWatchTrigger = cloudWatchTrigger;
			}

			public static class SchedulerTrigger {

				private Long launchTime;

				private Integer launchExpirationTime;

				private String recurrenceType;

				private String recurrenceValue;

				private Long recurrenceEndTime;

				public Long getLaunchTime() {
					return this.launchTime;
				}

				public void setLaunchTime(Long launchTime) {
					this.launchTime = launchTime;
				}

				public Integer getLaunchExpirationTime() {
					return this.launchExpirationTime;
				}

				public void setLaunchExpirationTime(Integer launchExpirationTime) {
					this.launchExpirationTime = launchExpirationTime;
				}

				public String getRecurrenceType() {
					return this.recurrenceType;
				}

				public void setRecurrenceType(String recurrenceType) {
					this.recurrenceType = recurrenceType;
				}

				public String getRecurrenceValue() {
					return this.recurrenceValue;
				}

				public void setRecurrenceValue(String recurrenceValue) {
					this.recurrenceValue = recurrenceValue;
				}

				public Long getRecurrenceEndTime() {
					return this.recurrenceEndTime;
				}

				public void setRecurrenceEndTime(Long recurrenceEndTime) {
					this.recurrenceEndTime = recurrenceEndTime;
				}
			}

			public static class CloudWatchTrigger {

				private String metricName;

				private Integer period;

				private String statistics;

				private String comparisonOperator;

				private String threshold;

				private String evaluationCount;

				private String unit;

				private String metricDisplayName;

				public String getMetricName() {
					return this.metricName;
				}

				public void setMetricName(String metricName) {
					this.metricName = metricName;
				}

				public Integer getPeriod() {
					return this.period;
				}

				public void setPeriod(Integer period) {
					this.period = period;
				}

				public String getStatistics() {
					return this.statistics;
				}

				public void setStatistics(String statistics) {
					this.statistics = statistics;
				}

				public String getComparisonOperator() {
					return this.comparisonOperator;
				}

				public void setComparisonOperator(String comparisonOperator) {
					this.comparisonOperator = comparisonOperator;
				}

				public String getThreshold() {
					return this.threshold;
				}

				public void setThreshold(String threshold) {
					this.threshold = threshold;
				}

				public String getEvaluationCount() {
					return this.evaluationCount;
				}

				public void setEvaluationCount(String evaluationCount) {
					this.evaluationCount = evaluationCount;
				}

				public String getUnit() {
					return this.unit;
				}

				public void setUnit(String unit) {
					this.unit = unit;
				}

				public String getMetricDisplayName() {
					return this.metricDisplayName;
				}

				public void setMetricDisplayName(String metricDisplayName) {
					this.metricDisplayName = metricDisplayName;
				}
			}
		}

		public static class ScalingConfig {

			private String payType;

			private String dataDiskCategory;

			private Integer dataDiskSize;

			private Integer dataDiskCount;

			private String sysDiskCategory;

			private Integer sysDiskSize;

			private Integer cpuCount;

			private Integer memSize;

			private String spotStrategy;

			private List<SpotPriceLimit3> spotPriceLimits2;

			private List<String> instanceTypeList1;

			public String getPayType() {
				return this.payType;
			}

			public void setPayType(String payType) {
				this.payType = payType;
			}

			public String getDataDiskCategory() {
				return this.dataDiskCategory;
			}

			public void setDataDiskCategory(String dataDiskCategory) {
				this.dataDiskCategory = dataDiskCategory;
			}

			public Integer getDataDiskSize() {
				return this.dataDiskSize;
			}

			public void setDataDiskSize(Integer dataDiskSize) {
				this.dataDiskSize = dataDiskSize;
			}

			public Integer getDataDiskCount() {
				return this.dataDiskCount;
			}

			public void setDataDiskCount(Integer dataDiskCount) {
				this.dataDiskCount = dataDiskCount;
			}

			public String getSysDiskCategory() {
				return this.sysDiskCategory;
			}

			public void setSysDiskCategory(String sysDiskCategory) {
				this.sysDiskCategory = sysDiskCategory;
			}

			public Integer getSysDiskSize() {
				return this.sysDiskSize;
			}

			public void setSysDiskSize(Integer sysDiskSize) {
				this.sysDiskSize = sysDiskSize;
			}

			public Integer getCpuCount() {
				return this.cpuCount;
			}

			public void setCpuCount(Integer cpuCount) {
				this.cpuCount = cpuCount;
			}

			public Integer getMemSize() {
				return this.memSize;
			}

			public void setMemSize(Integer memSize) {
				this.memSize = memSize;
			}

			public String getSpotStrategy() {
				return this.spotStrategy;
			}

			public void setSpotStrategy(String spotStrategy) {
				this.spotStrategy = spotStrategy;
			}

			public List<SpotPriceLimit3> getSpotPriceLimits2() {
				return this.spotPriceLimits2;
			}

			public void setSpotPriceLimits2(List<SpotPriceLimit3> spotPriceLimits2) {
				this.spotPriceLimits2 = spotPriceLimits2;
			}

			public List<String> getInstanceTypeList1() {
				return this.instanceTypeList1;
			}

			public void setInstanceTypeList1(List<String> instanceTypeList1) {
				this.instanceTypeList1 = instanceTypeList1;
			}

			public static class SpotPriceLimit3 {

				private String instanceType;

				private Float priceLimit;

				public String getInstanceType() {
					return this.instanceType;
				}

				public void setInstanceType(String instanceType) {
					this.instanceType = instanceType;
				}

				public Float getPriceLimit() {
					return this.priceLimit;
				}

				public void setPriceLimit(Float priceLimit) {
					this.priceLimit = priceLimit;
				}
			}
		}
	}

	@Override
	public ListScalingTaskGroupResponse getInstance(UnmarshallerContext context) {
		return	ListScalingTaskGroupResponseUnmarshaller.unmarshall(this, context);
	}
}
