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
public class CreateScalingRuleRequest extends RpcAcsRequest<CreateScalingRuleResponse> {
	
	public CreateScalingRuleRequest() {
		super("Emr", "2016-04-08", "CreateScalingRule", "emr");
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String launchTime;

	private Long resourceOwnerId;

	private String ruleCategory;

	private Integer adjustmentValue;

	private String adjustmentType;

	private String ruleName;

	private String clusterId;

	private Integer launchExpirationTime;

	private String recurrenceValue;

	private String recurrenceEndTime;

	private List<CloudWatchTrigger> cloudWatchTriggers;

	private String hostGroupId;

	private List<SchedulerTrigger> schedulerTriggers;

	private Integer cooldown;

	private String recurrenceType;

	public String getLaunchTime() {
		return this.launchTime;
	}

	public void setLaunchTime(String launchTime) {
		this.launchTime = launchTime;
		if(launchTime != null){
			putQueryParameter("LaunchTime", launchTime);
		}
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

	public String getRuleCategory() {
		return this.ruleCategory;
	}

	public void setRuleCategory(String ruleCategory) {
		this.ruleCategory = ruleCategory;
		if(ruleCategory != null){
			putQueryParameter("RuleCategory", ruleCategory);
		}
	}

	public Integer getAdjustmentValue() {
		return this.adjustmentValue;
	}

	public void setAdjustmentValue(Integer adjustmentValue) {
		this.adjustmentValue = adjustmentValue;
		if(adjustmentValue != null){
			putQueryParameter("AdjustmentValue", adjustmentValue.toString());
		}
	}

	public String getAdjustmentType() {
		return this.adjustmentType;
	}

	public void setAdjustmentType(String adjustmentType) {
		this.adjustmentType = adjustmentType;
		if(adjustmentType != null){
			putQueryParameter("AdjustmentType", adjustmentType);
		}
	}

	public String getRuleName() {
		return this.ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
		if(ruleName != null){
			putQueryParameter("RuleName", ruleName);
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

	public Integer getLaunchExpirationTime() {
		return this.launchExpirationTime;
	}

	public void setLaunchExpirationTime(Integer launchExpirationTime) {
		this.launchExpirationTime = launchExpirationTime;
		if(launchExpirationTime != null){
			putQueryParameter("LaunchExpirationTime", launchExpirationTime.toString());
		}
	}

	public String getRecurrenceValue() {
		return this.recurrenceValue;
	}

	public void setRecurrenceValue(String recurrenceValue) {
		this.recurrenceValue = recurrenceValue;
		if(recurrenceValue != null){
			putQueryParameter("RecurrenceValue", recurrenceValue);
		}
	}

	public String getRecurrenceEndTime() {
		return this.recurrenceEndTime;
	}

	public void setRecurrenceEndTime(String recurrenceEndTime) {
		this.recurrenceEndTime = recurrenceEndTime;
		if(recurrenceEndTime != null){
			putQueryParameter("RecurrenceEndTime", recurrenceEndTime);
		}
	}

	public List<CloudWatchTrigger> getCloudWatchTriggers() {
		return this.cloudWatchTriggers;
	}

	public void setCloudWatchTriggers(List<CloudWatchTrigger> cloudWatchTriggers) {
		this.cloudWatchTriggers = cloudWatchTriggers;	
		if (cloudWatchTriggers != null) {
			for (int depth1 = 0; depth1 < cloudWatchTriggers.size(); depth1++) {
				putQueryParameter("CloudWatchTrigger." + (depth1 + 1) + ".Period" , cloudWatchTriggers.get(depth1).getPeriod());
				putQueryParameter("CloudWatchTrigger." + (depth1 + 1) + ".EvaluationCount" , cloudWatchTriggers.get(depth1).getEvaluationCount());
				putQueryParameter("CloudWatchTrigger." + (depth1 + 1) + ".Threshold" , cloudWatchTriggers.get(depth1).getThreshold());
				putQueryParameter("CloudWatchTrigger." + (depth1 + 1) + ".MetricName" , cloudWatchTriggers.get(depth1).getMetricName());
				putQueryParameter("CloudWatchTrigger." + (depth1 + 1) + ".ComparisonOperator" , cloudWatchTriggers.get(depth1).getComparisonOperator());
				putQueryParameter("CloudWatchTrigger." + (depth1 + 1) + ".Statistics" , cloudWatchTriggers.get(depth1).getStatistics());
			}
		}	
	}

	public String getHostGroupId() {
		return this.hostGroupId;
	}

	public void setHostGroupId(String hostGroupId) {
		this.hostGroupId = hostGroupId;
		if(hostGroupId != null){
			putQueryParameter("HostGroupId", hostGroupId);
		}
	}

	public List<SchedulerTrigger> getSchedulerTriggers() {
		return this.schedulerTriggers;
	}

	public void setSchedulerTriggers(List<SchedulerTrigger> schedulerTriggers) {
		this.schedulerTriggers = schedulerTriggers;	
		if (schedulerTriggers != null) {
			for (int depth1 = 0; depth1 < schedulerTriggers.size(); depth1++) {
				putQueryParameter("SchedulerTrigger." + (depth1 + 1) + ".LaunchTime" , schedulerTriggers.get(depth1).getLaunchTime());
				putQueryParameter("SchedulerTrigger." + (depth1 + 1) + ".LaunchExpirationTime" , schedulerTriggers.get(depth1).getLaunchExpirationTime());
				putQueryParameter("SchedulerTrigger." + (depth1 + 1) + ".RecurrenceValue" , schedulerTriggers.get(depth1).getRecurrenceValue());
				putQueryParameter("SchedulerTrigger." + (depth1 + 1) + ".RecurrenceEndTime" , schedulerTriggers.get(depth1).getRecurrenceEndTime());
				putQueryParameter("SchedulerTrigger." + (depth1 + 1) + ".RecurrenceType" , schedulerTriggers.get(depth1).getRecurrenceType());
			}
		}	
	}

	public Integer getCooldown() {
		return this.cooldown;
	}

	public void setCooldown(Integer cooldown) {
		this.cooldown = cooldown;
		if(cooldown != null){
			putQueryParameter("Cooldown", cooldown.toString());
		}
	}

	public String getRecurrenceType() {
		return this.recurrenceType;
	}

	public void setRecurrenceType(String recurrenceType) {
		this.recurrenceType = recurrenceType;
		if(recurrenceType != null){
			putQueryParameter("RecurrenceType", recurrenceType);
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

	@Override
	public Class<CreateScalingRuleResponse> getResponseClass() {
		return CreateScalingRuleResponse.class;
	}

}
