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
import com.aliyuncs.ess.transform.v20140828.DescribeScalingRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeScalingRulesResponse extends AcsResponse {

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private String requestId;

	private List<ScalingRule> scalingRules;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ScalingRule> getScalingRules() {
		return this.scalingRules;
	}

	public void setScalingRules(List<ScalingRule> scalingRules) {
		this.scalingRules = scalingRules;
	}

	public static class ScalingRule {

		private String scalingRuleId;

		private String scalingGroupId;

		private String scalingRuleName;

		private Integer cooldown;

		private Integer minAdjustmentMagnitude;

		private String adjustmentType;

		private Integer adjustmentValue;

		private Integer minSize;

		private Integer maxSize;

		private String scalingRuleAri;

		private String scalingRuleType;

		private Integer estimatedInstanceWarmup;

		private String metricName;

		private Float targetValue;

		private Boolean disableScaleIn;

		private String predictiveScalingMode;

		private String predictiveValueBehavior;

		private Integer predictiveValueBuffer;

		private Integer predictiveTaskBufferTime;

		private Integer initialMaxSize;

		private List<Alarm> alarms;

		private List<StepAdjustment> stepAdjustments;

		public String getScalingRuleId() {
			return this.scalingRuleId;
		}

		public void setScalingRuleId(String scalingRuleId) {
			this.scalingRuleId = scalingRuleId;
		}

		public String getScalingGroupId() {
			return this.scalingGroupId;
		}

		public void setScalingGroupId(String scalingGroupId) {
			this.scalingGroupId = scalingGroupId;
		}

		public String getScalingRuleName() {
			return this.scalingRuleName;
		}

		public void setScalingRuleName(String scalingRuleName) {
			this.scalingRuleName = scalingRuleName;
		}

		public Integer getCooldown() {
			return this.cooldown;
		}

		public void setCooldown(Integer cooldown) {
			this.cooldown = cooldown;
		}

		public Integer getMinAdjustmentMagnitude() {
			return this.minAdjustmentMagnitude;
		}

		public void setMinAdjustmentMagnitude(Integer minAdjustmentMagnitude) {
			this.minAdjustmentMagnitude = minAdjustmentMagnitude;
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

		public String getScalingRuleAri() {
			return this.scalingRuleAri;
		}

		public void setScalingRuleAri(String scalingRuleAri) {
			this.scalingRuleAri = scalingRuleAri;
		}

		public String getScalingRuleType() {
			return this.scalingRuleType;
		}

		public void setScalingRuleType(String scalingRuleType) {
			this.scalingRuleType = scalingRuleType;
		}

		public Integer getEstimatedInstanceWarmup() {
			return this.estimatedInstanceWarmup;
		}

		public void setEstimatedInstanceWarmup(Integer estimatedInstanceWarmup) {
			this.estimatedInstanceWarmup = estimatedInstanceWarmup;
		}

		public String getMetricName() {
			return this.metricName;
		}

		public void setMetricName(String metricName) {
			this.metricName = metricName;
		}

		public Float getTargetValue() {
			return this.targetValue;
		}

		public void setTargetValue(Float targetValue) {
			this.targetValue = targetValue;
		}

		public Boolean getDisableScaleIn() {
			return this.disableScaleIn;
		}

		public void setDisableScaleIn(Boolean disableScaleIn) {
			this.disableScaleIn = disableScaleIn;
		}

		public String getPredictiveScalingMode() {
			return this.predictiveScalingMode;
		}

		public void setPredictiveScalingMode(String predictiveScalingMode) {
			this.predictiveScalingMode = predictiveScalingMode;
		}

		public String getPredictiveValueBehavior() {
			return this.predictiveValueBehavior;
		}

		public void setPredictiveValueBehavior(String predictiveValueBehavior) {
			this.predictiveValueBehavior = predictiveValueBehavior;
		}

		public Integer getPredictiveValueBuffer() {
			return this.predictiveValueBuffer;
		}

		public void setPredictiveValueBuffer(Integer predictiveValueBuffer) {
			this.predictiveValueBuffer = predictiveValueBuffer;
		}

		public Integer getPredictiveTaskBufferTime() {
			return this.predictiveTaskBufferTime;
		}

		public void setPredictiveTaskBufferTime(Integer predictiveTaskBufferTime) {
			this.predictiveTaskBufferTime = predictiveTaskBufferTime;
		}

		public Integer getInitialMaxSize() {
			return this.initialMaxSize;
		}

		public void setInitialMaxSize(Integer initialMaxSize) {
			this.initialMaxSize = initialMaxSize;
		}

		public List<Alarm> getAlarms() {
			return this.alarms;
		}

		public void setAlarms(List<Alarm> alarms) {
			this.alarms = alarms;
		}

		public List<StepAdjustment> getStepAdjustments() {
			return this.stepAdjustments;
		}

		public void setStepAdjustments(List<StepAdjustment> stepAdjustments) {
			this.stepAdjustments = stepAdjustments;
		}

		public static class Alarm {

			private String alarmTaskName;

			private String alarmTaskId;

			private String comparisonOperator;

			private String statistics;

			private String metricName;

			private Float threshold;

			private Integer evaluationCount;

			private List<Dimension> dimensions;

			public String getAlarmTaskName() {
				return this.alarmTaskName;
			}

			public void setAlarmTaskName(String alarmTaskName) {
				this.alarmTaskName = alarmTaskName;
			}

			public String getAlarmTaskId() {
				return this.alarmTaskId;
			}

			public void setAlarmTaskId(String alarmTaskId) {
				this.alarmTaskId = alarmTaskId;
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

			public String getMetricName() {
				return this.metricName;
			}

			public void setMetricName(String metricName) {
				this.metricName = metricName;
			}

			public Float getThreshold() {
				return this.threshold;
			}

			public void setThreshold(Float threshold) {
				this.threshold = threshold;
			}

			public Integer getEvaluationCount() {
				return this.evaluationCount;
			}

			public void setEvaluationCount(Integer evaluationCount) {
				this.evaluationCount = evaluationCount;
			}

			public List<Dimension> getDimensions() {
				return this.dimensions;
			}

			public void setDimensions(List<Dimension> dimensions) {
				this.dimensions = dimensions;
			}

			public static class Dimension {

				private String dimensionKey;

				private String dimensionValue;

				public String getDimensionKey() {
					return this.dimensionKey;
				}

				public void setDimensionKey(String dimensionKey) {
					this.dimensionKey = dimensionKey;
				}

				public String getDimensionValue() {
					return this.dimensionValue;
				}

				public void setDimensionValue(String dimensionValue) {
					this.dimensionValue = dimensionValue;
				}
			}
		}

		public static class StepAdjustment {

			private Float metricIntervalLowerBound;

			private Float metricIntervalUpperBound;

			private Integer scalingAdjustment;

			public Float getMetricIntervalLowerBound() {
				return this.metricIntervalLowerBound;
			}

			public void setMetricIntervalLowerBound(Float metricIntervalLowerBound) {
				this.metricIntervalLowerBound = metricIntervalLowerBound;
			}

			public Float getMetricIntervalUpperBound() {
				return this.metricIntervalUpperBound;
			}

			public void setMetricIntervalUpperBound(Float metricIntervalUpperBound) {
				this.metricIntervalUpperBound = metricIntervalUpperBound;
			}

			public Integer getScalingAdjustment() {
				return this.scalingAdjustment;
			}

			public void setScalingAdjustment(Integer scalingAdjustment) {
				this.scalingAdjustment = scalingAdjustment;
			}
		}
	}

	@Override
	public DescribeScalingRulesResponse getInstance(UnmarshallerContext context) {
		return	DescribeScalingRulesResponseUnmarshaller.unmarshall(this, context);
	}
}
