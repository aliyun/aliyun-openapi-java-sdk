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

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.emr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateScalingTaskGroupRequest extends RpcAcsRequest<CreateScalingTaskGroupResponse> {
	
	public CreateScalingTaskGroupRequest() {
		super("Emr", "2016-04-08", "CreateScalingTaskGroup", "emr");
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Long resourceOwnerId;

	private String dataDiskCategory;

	private String clusterId;

	private Integer minSize;

	private String spotStrategy;

	private Integer dataDiskSize;

	private List<SpotPriceLimits> spotPriceLimitss;

	private List<ScalingRule> scalingRules;

	private String activeRuleCategory;

	private Integer maxSize;

	private Integer dataDiskCount;

	private Integer defaultCooldown;

	private String payType;

	private List<String> instanceTypeLists;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getDataDiskCategory() {
		return this.dataDiskCategory;
	}

	public void setDataDiskCategory(String dataDiskCategory) {
		this.dataDiskCategory = dataDiskCategory;
		if(dataDiskCategory != null){
			putQueryParameter("DataDiskCategory", dataDiskCategory);
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
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

	public String getSpotStrategy() {
		return this.spotStrategy;
	}

	public void setSpotStrategy(String spotStrategy) {
		this.spotStrategy = spotStrategy;
		if(spotStrategy != null){
			putQueryParameter("SpotStrategy", spotStrategy);
		}
	}

	public Integer getDataDiskSize() {
		return this.dataDiskSize;
	}

	public void setDataDiskSize(Integer dataDiskSize) {
		this.dataDiskSize = dataDiskSize;
		if(dataDiskSize != null){
			putQueryParameter("DataDiskSize", dataDiskSize.toString());
		}
	}

	public List<SpotPriceLimits> getSpotPriceLimitss() {
		return this.spotPriceLimitss;
	}

	public void setSpotPriceLimitss(List<SpotPriceLimits> spotPriceLimitss) {
		this.spotPriceLimitss = spotPriceLimitss;	
		if (spotPriceLimitss != null) {
			for (int depth1 = 0; depth1 < spotPriceLimitss.size(); depth1++) {
				putQueryParameter("SpotPriceLimits." + (depth1 + 1) + ".InstanceType" , spotPriceLimitss.get(depth1).getInstanceType());
				putQueryParameter("SpotPriceLimits." + (depth1 + 1) + ".PriceLimit" , spotPriceLimitss.get(depth1).getPriceLimit());
			}
		}	
	}

	public List<ScalingRule> getScalingRules() {
		return this.scalingRules;
	}

	public void setScalingRules(List<ScalingRule> scalingRules) {
		this.scalingRules = scalingRules;	
		if (scalingRules != null) {
			for (int depth1 = 0; depth1 < scalingRules.size(); depth1++) {
				putQueryParameter("ScalingRule." + (depth1 + 1) + ".LaunchTime" , scalingRules.get(depth1).getLaunchTime());
				putQueryParameter("ScalingRule." + (depth1 + 1) + ".RuleCategory" , scalingRules.get(depth1).getRuleCategory());
				putQueryParameter("ScalingRule." + (depth1 + 1) + ".AdjustmentValue" , scalingRules.get(depth1).getAdjustmentValue());
				if (scalingRules.get(depth1).getSchedulerTriggers() != null) {
					for (int depth2 = 0; depth2 < scalingRules.get(depth1).getSchedulerTriggers().size(); depth2++) {
						putQueryParameter("ScalingRule." + (depth1 + 1) + ".SchedulerTrigger." + (depth2 + 1) + ".LaunchTime" , scalingRules.get(depth1).getSchedulerTriggers().get(depth2).getLaunchTime());
						putQueryParameter("ScalingRule." + (depth1 + 1) + ".SchedulerTrigger." + (depth2 + 1) + ".LaunchExpirationTime" , scalingRules.get(depth1).getSchedulerTriggers().get(depth2).getLaunchExpirationTime());
						putQueryParameter("ScalingRule." + (depth1 + 1) + ".SchedulerTrigger." + (depth2 + 1) + ".RecurrenceValue" , scalingRules.get(depth1).getSchedulerTriggers().get(depth2).getRecurrenceValue());
						putQueryParameter("ScalingRule." + (depth1 + 1) + ".SchedulerTrigger." + (depth2 + 1) + ".RecurrenceEndTime" , scalingRules.get(depth1).getSchedulerTriggers().get(depth2).getRecurrenceEndTime());
						putQueryParameter("ScalingRule." + (depth1 + 1) + ".SchedulerTrigger." + (depth2 + 1) + ".RecurrenceType" , scalingRules.get(depth1).getSchedulerTriggers().get(depth2).getRecurrenceType());
					}
				}
				putQueryParameter("ScalingRule." + (depth1 + 1) + ".AdjustmentType" , scalingRules.get(depth1).getAdjustmentType());
				putQueryParameter("ScalingRule." + (depth1 + 1) + ".Cooldown" , scalingRules.get(depth1).getCooldown());
				putQueryParameter("ScalingRule." + (depth1 + 1) + ".RuleName" , scalingRules.get(depth1).getRuleName());
				putQueryParameter("ScalingRule." + (depth1 + 1) + ".LaunchExpirationTime" , scalingRules.get(depth1).getLaunchExpirationTime());
				putQueryParameter("ScalingRule." + (depth1 + 1) + ".RecurrenceValue" , scalingRules.get(depth1).getRecurrenceValue());
				putQueryParameter("ScalingRule." + (depth1 + 1) + ".RecurrenceEndTime" , scalingRules.get(depth1).getRecurrenceEndTime());
				if (scalingRules.get(depth1).getCloudWatchTriggers() != null) {
					for (int depth2 = 0; depth2 < scalingRules.get(depth1).getCloudWatchTriggers().size(); depth2++) {
						putQueryParameter("ScalingRule." + (depth1 + 1) + ".CloudWatchTrigger." + (depth2 + 1) + ".Period" , scalingRules.get(depth1).getCloudWatchTriggers().get(depth2).getPeriod());
						putQueryParameter("ScalingRule." + (depth1 + 1) + ".CloudWatchTrigger." + (depth2 + 1) + ".EvaluationCount" , scalingRules.get(depth1).getCloudWatchTriggers().get(depth2).getEvaluationCount());
						putQueryParameter("ScalingRule." + (depth1 + 1) + ".CloudWatchTrigger." + (depth2 + 1) + ".Threshold" , scalingRules.get(depth1).getCloudWatchTriggers().get(depth2).getThreshold());
						putQueryParameter("ScalingRule." + (depth1 + 1) + ".CloudWatchTrigger." + (depth2 + 1) + ".MetricName" , scalingRules.get(depth1).getCloudWatchTriggers().get(depth2).getMetricName());
						putQueryParameter("ScalingRule." + (depth1 + 1) + ".CloudWatchTrigger." + (depth2 + 1) + ".ComparisonOperator" , scalingRules.get(depth1).getCloudWatchTriggers().get(depth2).getComparisonOperator());
						putQueryParameter("ScalingRule." + (depth1 + 1) + ".CloudWatchTrigger." + (depth2 + 1) + ".Statistics" , scalingRules.get(depth1).getCloudWatchTriggers().get(depth2).getStatistics());
					}
				}
				putQueryParameter("ScalingRule." + (depth1 + 1) + ".RecurrenceType" , scalingRules.get(depth1).getRecurrenceType());
			}
		}	
	}

	public String getActiveRuleCategory() {
		return this.activeRuleCategory;
	}

	public void setActiveRuleCategory(String activeRuleCategory) {
		this.activeRuleCategory = activeRuleCategory;
		if(activeRuleCategory != null){
			putQueryParameter("ActiveRuleCategory", activeRuleCategory);
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

	public Integer getDataDiskCount() {
		return this.dataDiskCount;
	}

	public void setDataDiskCount(Integer dataDiskCount) {
		this.dataDiskCount = dataDiskCount;
		if(dataDiskCount != null){
			putQueryParameter("DataDiskCount", dataDiskCount.toString());
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

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
		if(payType != null){
			putQueryParameter("PayType", payType);
		}
	}

	public List<String> getInstanceTypeLists() {
		return this.instanceTypeLists;
	}

	public void setInstanceTypeLists(List<String> instanceTypeLists) {
		this.instanceTypeLists = instanceTypeLists;	
		if (instanceTypeLists != null) {
			for (int i = 0; i < instanceTypeLists.size(); i++) {
				putQueryParameter("InstanceTypeList." + (i + 1) , instanceTypeLists.get(i));
			}
		}	
	}

	public static class SpotPriceLimits {

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

		private String launchTime;

		private String ruleCategory;

		private Integer adjustmentValue;

		private List<SchedulerTrigger> schedulerTriggers;

		private String adjustmentType;

		private Integer cooldown;

		private String ruleName;

		private Integer launchExpirationTime;

		private String recurrenceValue;

		private String recurrenceEndTime;

		private List<CloudWatchTrigger> cloudWatchTriggers;

		private String recurrenceType;

		public String getLaunchTime() {
			return this.launchTime;
		}

		public void setLaunchTime(String launchTime) {
			this.launchTime = launchTime;
		}

		public String getRuleCategory() {
			return this.ruleCategory;
		}

		public void setRuleCategory(String ruleCategory) {
			this.ruleCategory = ruleCategory;
		}

		public Integer getAdjustmentValue() {
			return this.adjustmentValue;
		}

		public void setAdjustmentValue(Integer adjustmentValue) {
			this.adjustmentValue = adjustmentValue;
		}

		public List<SchedulerTrigger> getSchedulerTriggers() {
			return this.schedulerTriggers;
		}

		public void setSchedulerTriggers(List<SchedulerTrigger> schedulerTriggers) {
			this.schedulerTriggers = schedulerTriggers;
		}

		public String getAdjustmentType() {
			return this.adjustmentType;
		}

		public void setAdjustmentType(String adjustmentType) {
			this.adjustmentType = adjustmentType;
		}

		public Integer getCooldown() {
			return this.cooldown;
		}

		public void setCooldown(Integer cooldown) {
			this.cooldown = cooldown;
		}

		public String getRuleName() {
			return this.ruleName;
		}

		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}

		public Integer getLaunchExpirationTime() {
			return this.launchExpirationTime;
		}

		public void setLaunchExpirationTime(Integer launchExpirationTime) {
			this.launchExpirationTime = launchExpirationTime;
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

		public List<CloudWatchTrigger> getCloudWatchTriggers() {
			return this.cloudWatchTriggers;
		}

		public void setCloudWatchTriggers(List<CloudWatchTrigger> cloudWatchTriggers) {
			this.cloudWatchTriggers = cloudWatchTriggers;
		}

		public String getRecurrenceType() {
			return this.recurrenceType;
		}

		public void setRecurrenceType(String recurrenceType) {
			this.recurrenceType = recurrenceType;
		}

		public static class SchedulerTrigger {

			private String launchTime;

			private Integer launchExpirationTime;

			private String recurrenceValue;

			private String recurrenceEndTime;

			private String recurrenceType;

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

			public String getRecurrenceType() {
				return this.recurrenceType;
			}

			public void setRecurrenceType(String recurrenceType) {
				this.recurrenceType = recurrenceType;
			}
		}

		public static class CloudWatchTrigger {

			private Integer period;

			private String evaluationCount;

			private String threshold;

			private String metricName;

			private String comparisonOperator;

			private String statistics;

			public Integer getPeriod() {
				return this.period;
			}

			public void setPeriod(Integer period) {
				this.period = period;
			}

			public String getEvaluationCount() {
				return this.evaluationCount;
			}

			public void setEvaluationCount(String evaluationCount) {
				this.evaluationCount = evaluationCount;
			}

			public String getThreshold() {
				return this.threshold;
			}

			public void setThreshold(String threshold) {
				this.threshold = threshold;
			}

			public String getMetricName() {
				return this.metricName;
			}

			public void setMetricName(String metricName) {
				this.metricName = metricName;
			}

			public String getComparisonOperator() {
				return this.comparisonOperator;
			}

			public void setComparisonOperator(String comparisonOperator) {
				this.comparisonOperator = comparisonOperator;
			}

			public String getStatistics() {
				return this.statistics;
			}

			public void setStatistics(String statistics) {
				this.statistics = statistics;
			}
		}
	}

	@Override
	public Class<CreateScalingTaskGroupResponse> getResponseClass() {
		return CreateScalingTaskGroupResponse.class;
	}

}
