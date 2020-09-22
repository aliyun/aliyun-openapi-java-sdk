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
import com.aliyuncs.emr.transform.v20160408.DescribeScalingGroupInstanceV2ResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeScalingGroupInstanceV2Response extends AcsResponse {

	private String requestId;

	private String hostGroupId;

	private String scalingGroupId;

	private Integer minSize;

	private Integer maxSize;

	private Integer defaultCooldown;

	private String activeRuleCategory;

	private Boolean withGrace;

	private Long timeoutWithGrace;

	private String multiAvailablePolicy;

	private String multiAvailablePolicyParam;

	private List<ScalingRule> scalingRuleList;

	private ScalingConfig scalingConfig;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getHostGroupId() {
		return this.hostGroupId;
	}

	public void setHostGroupId(String hostGroupId) {
		this.hostGroupId = hostGroupId;
	}

	public String getScalingGroupId() {
		return this.scalingGroupId;
	}

	public void setScalingGroupId(String scalingGroupId) {
		this.scalingGroupId = scalingGroupId;
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

	public Boolean getWithGrace() {
		return this.withGrace;
	}

	public void setWithGrace(Boolean withGrace) {
		this.withGrace = withGrace;
	}

	public Long getTimeoutWithGrace() {
		return this.timeoutWithGrace;
	}

	public void setTimeoutWithGrace(Long timeoutWithGrace) {
		this.timeoutWithGrace = timeoutWithGrace;
	}

	public String getMultiAvailablePolicy() {
		return this.multiAvailablePolicy;
	}

	public void setMultiAvailablePolicy(String multiAvailablePolicy) {
		this.multiAvailablePolicy = multiAvailablePolicy;
	}

	public String getMultiAvailablePolicyParam() {
		return this.multiAvailablePolicyParam;
	}

	public void setMultiAvailablePolicyParam(String multiAvailablePolicyParam) {
		this.multiAvailablePolicyParam = multiAvailablePolicyParam;
	}

	public List<ScalingRule> getScalingRuleList() {
		return this.scalingRuleList;
	}

	public void setScalingRuleList(List<ScalingRule> scalingRuleList) {
		this.scalingRuleList = scalingRuleList;
	}

	public ScalingConfig getScalingConfig() {
		return this.scalingConfig;
	}

	public void setScalingConfig(ScalingConfig scalingConfig) {
		this.scalingConfig = scalingConfig;
	}

	public static class ScalingRule {

		private String ruleCategory;

		private String essScalingRuleId;

		private Long scalingGroupId;

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

		private Boolean withGrace;

		private Long timeoutWithGrace;

		private SchedulerTrigger schedulerTrigger;

		private CloudWatchTrigger cloudWatchTrigger;

		public String getRuleCategory() {
			return this.ruleCategory;
		}

		public void setRuleCategory(String ruleCategory) {
			this.ruleCategory = ruleCategory;
		}

		public String getEssScalingRuleId() {
			return this.essScalingRuleId;
		}

		public void setEssScalingRuleId(String essScalingRuleId) {
			this.essScalingRuleId = essScalingRuleId;
		}

		public Long getScalingGroupId() {
			return this.scalingGroupId;
		}

		public void setScalingGroupId(Long scalingGroupId) {
			this.scalingGroupId = scalingGroupId;
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

		public Boolean getWithGrace() {
			return this.withGrace;
		}

		public void setWithGrace(Boolean withGrace) {
			this.withGrace = withGrace;
		}

		public Long getTimeoutWithGrace() {
			return this.timeoutWithGrace;
		}

		public void setTimeoutWithGrace(Long timeoutWithGrace) {
			this.timeoutWithGrace = timeoutWithGrace;
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

		private String spotStrategy;

		private String payType;

		private String dataDiskCategory;

		private Integer dataDiskSize;

		private Integer dataDiskCount;

		private String sysDiskCategory;

		private Integer sysDiskSize;

		private List<SpotPriceLimit> spotPriceLimits;

		private List<String> instanceTypeList;

		public String getSpotStrategy() {
			return this.spotStrategy;
		}

		public void setSpotStrategy(String spotStrategy) {
			this.spotStrategy = spotStrategy;
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

		public List<SpotPriceLimit> getSpotPriceLimits() {
			return this.spotPriceLimits;
		}

		public void setSpotPriceLimits(List<SpotPriceLimit> spotPriceLimits) {
			this.spotPriceLimits = spotPriceLimits;
		}

		public List<String> getInstanceTypeList() {
			return this.instanceTypeList;
		}

		public void setInstanceTypeList(List<String> instanceTypeList) {
			this.instanceTypeList = instanceTypeList;
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
	}

	@Override
	public DescribeScalingGroupInstanceV2Response getInstance(UnmarshallerContext context) {
		return	DescribeScalingGroupInstanceV2ResponseUnmarshaller.unmarshall(this, context);
	}
}
