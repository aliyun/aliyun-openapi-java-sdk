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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.DescribeScalingRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeScalingRuleResponse extends AcsResponse {

	private String requestId;

	private String id;

	private String gmtCreate;

	private String gmtModified;

	private String ruleName;

	private String ruleCategory;

	private String adjustmentType;

	private Integer adjustmentValue;

	private Integer cooldown;

	private String status;

	private Boolean withGrace;

	private Long timeoutWithGrace;

	private SchedulerTrigger schedulerTrigger;

	private CloudWatchTrigger cloudWatchTrigger;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}

	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getGmtModified() {
		return this.gmtModified;
	}

	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getRuleName() {
		return this.ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public String getRuleCategory() {
		return this.ruleCategory;
	}

	public void setRuleCategory(String ruleCategory) {
		this.ruleCategory = ruleCategory;
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

	@Override
	public DescribeScalingRuleResponse getInstance(UnmarshallerContext context) {
		return	DescribeScalingRuleResponseUnmarshaller.unmarshall(this, context);
	}
}
