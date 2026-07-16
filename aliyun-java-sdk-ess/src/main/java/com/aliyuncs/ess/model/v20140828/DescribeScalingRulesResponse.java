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

	private String requestId;

	private Integer pageSize;

	private Integer pageNumber;

	private List<ScalingRule> scalingRules;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

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

	public List<ScalingRule> getScalingRules() {
		return this.scalingRules;
	}

	public void setScalingRules(List<ScalingRule> scalingRules) {
		this.scalingRules = scalingRules;
	}

	public static class ScalingRule {

		private Integer cooldown;

		private String predictiveValueBehavior;

		private String metricType;

		private String scalingRuleAri;

		private String metricName;

		private String scalingRuleName;

		private Integer scaleOutEvaluationCount;

		private Integer initialMaxSize;

		private String scalingRuleType;

		private Integer estimatedInstanceWarmup;

		private Integer predictiveTaskBufferTime;

		private Integer predictiveValueBuffer;

		private Float targetValue;

		private String scalingGroupId;

		private String scalingRuleId;

		private Integer minAdjustmentMagnitude;

		private Boolean disableScaleIn;

		private Integer maxSize;

		private String adjustmentType;

		private Integer minSize;

		private Integer adjustmentValue;

		private String hybridMonitorNamespace;

		private String predictiveScalingMode;

		private Integer scaleInEvaluationCount;

		private List<StepAdjustment> stepAdjustments;

		private List<HybridMetric> hybridMetrics;

		private List<Alarm> alarms;

		private List<AlarmDimension> alarmDimensions;

		public Integer getCooldown() {
			return this.cooldown;
		}

		public void setCooldown(Integer cooldown) {
			this.cooldown = cooldown;
		}

		public String getPredictiveValueBehavior() {
			return this.predictiveValueBehavior;
		}

		public void setPredictiveValueBehavior(String predictiveValueBehavior) {
			this.predictiveValueBehavior = predictiveValueBehavior;
		}

		public String getMetricType() {
			return this.metricType;
		}

		public void setMetricType(String metricType) {
			this.metricType = metricType;
		}

		public String getScalingRuleAri() {
			return this.scalingRuleAri;
		}

		public void setScalingRuleAri(String scalingRuleAri) {
			this.scalingRuleAri = scalingRuleAri;
		}

		public String getMetricName() {
			return this.metricName;
		}

		public void setMetricName(String metricName) {
			this.metricName = metricName;
		}

		public String getScalingRuleName() {
			return this.scalingRuleName;
		}

		public void setScalingRuleName(String scalingRuleName) {
			this.scalingRuleName = scalingRuleName;
		}

		public Integer getScaleOutEvaluationCount() {
			return this.scaleOutEvaluationCount;
		}

		public void setScaleOutEvaluationCount(Integer scaleOutEvaluationCount) {
			this.scaleOutEvaluationCount = scaleOutEvaluationCount;
		}

		public Integer getInitialMaxSize() {
			return this.initialMaxSize;
		}

		public void setInitialMaxSize(Integer initialMaxSize) {
			this.initialMaxSize = initialMaxSize;
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

		public Integer getPredictiveTaskBufferTime() {
			return this.predictiveTaskBufferTime;
		}

		public void setPredictiveTaskBufferTime(Integer predictiveTaskBufferTime) {
			this.predictiveTaskBufferTime = predictiveTaskBufferTime;
		}

		public Integer getPredictiveValueBuffer() {
			return this.predictiveValueBuffer;
		}

		public void setPredictiveValueBuffer(Integer predictiveValueBuffer) {
			this.predictiveValueBuffer = predictiveValueBuffer;
		}

		public Float getTargetValue() {
			return this.targetValue;
		}

		public void setTargetValue(Float targetValue) {
			this.targetValue = targetValue;
		}

		public String getScalingGroupId() {
			return this.scalingGroupId;
		}

		public void setScalingGroupId(String scalingGroupId) {
			this.scalingGroupId = scalingGroupId;
		}

		public String getScalingRuleId() {
			return this.scalingRuleId;
		}

		public void setScalingRuleId(String scalingRuleId) {
			this.scalingRuleId = scalingRuleId;
		}

		public Integer getMinAdjustmentMagnitude() {
			return this.minAdjustmentMagnitude;
		}

		public void setMinAdjustmentMagnitude(Integer minAdjustmentMagnitude) {
			this.minAdjustmentMagnitude = minAdjustmentMagnitude;
		}

		public Boolean getDisableScaleIn() {
			return this.disableScaleIn;
		}

		public void setDisableScaleIn(Boolean disableScaleIn) {
			this.disableScaleIn = disableScaleIn;
		}

		public Integer getMaxSize() {
			return this.maxSize;
		}

		public void setMaxSize(Integer maxSize) {
			this.maxSize = maxSize;
		}

		public String getAdjustmentType() {
			return this.adjustmentType;
		}

		public void setAdjustmentType(String adjustmentType) {
			this.adjustmentType = adjustmentType;
		}

		public Integer getMinSize() {
			return this.minSize;
		}

		public void setMinSize(Integer minSize) {
			this.minSize = minSize;
		}

		public Integer getAdjustmentValue() {
			return this.adjustmentValue;
		}

		public void setAdjustmentValue(Integer adjustmentValue) {
			this.adjustmentValue = adjustmentValue;
		}

		public String getHybridMonitorNamespace() {
			return this.hybridMonitorNamespace;
		}

		public void setHybridMonitorNamespace(String hybridMonitorNamespace) {
			this.hybridMonitorNamespace = hybridMonitorNamespace;
		}

		public String getPredictiveScalingMode() {
			return this.predictiveScalingMode;
		}

		public void setPredictiveScalingMode(String predictiveScalingMode) {
			this.predictiveScalingMode = predictiveScalingMode;
		}

		public Integer getScaleInEvaluationCount() {
			return this.scaleInEvaluationCount;
		}

		public void setScaleInEvaluationCount(Integer scaleInEvaluationCount) {
			this.scaleInEvaluationCount = scaleInEvaluationCount;
		}

		public List<StepAdjustment> getStepAdjustments() {
			return this.stepAdjustments;
		}

		public void setStepAdjustments(List<StepAdjustment> stepAdjustments) {
			this.stepAdjustments = stepAdjustments;
		}

		public List<HybridMetric> getHybridMetrics() {
			return this.hybridMetrics;
		}

		public void setHybridMetrics(List<HybridMetric> hybridMetrics) {
			this.hybridMetrics = hybridMetrics;
		}

		public List<Alarm> getAlarms() {
			return this.alarms;
		}

		public void setAlarms(List<Alarm> alarms) {
			this.alarms = alarms;
		}

		public List<AlarmDimension> getAlarmDimensions() {
			return this.alarmDimensions;
		}

		public void setAlarmDimensions(List<AlarmDimension> alarmDimensions) {
			this.alarmDimensions = alarmDimensions;
		}

		public static class StepAdjustment {

			private Float metricIntervalUpperBound;

			private Float metricIntervalLowerBound;

			private Integer scalingAdjustment;

			public Float getMetricIntervalUpperBound() {
				return this.metricIntervalUpperBound;
			}

			public void setMetricIntervalUpperBound(Float metricIntervalUpperBound) {
				this.metricIntervalUpperBound = metricIntervalUpperBound;
			}

			public Float getMetricIntervalLowerBound() {
				return this.metricIntervalLowerBound;
			}

			public void setMetricIntervalLowerBound(Float metricIntervalLowerBound) {
				this.metricIntervalLowerBound = metricIntervalLowerBound;
			}

			public Integer getScalingAdjustment() {
				return this.scalingAdjustment;
			}

			public void setScalingAdjustment(Integer scalingAdjustment) {
				this.scalingAdjustment = scalingAdjustment;
			}
		}

		public static class HybridMetric {

			private String metricName;

			private String statistic;

			private String expression;

			private String id;

			private List<Dimension> dimensions;

			public String getMetricName() {
				return this.metricName;
			}

			public void setMetricName(String metricName) {
				this.metricName = metricName;
			}

			public String getStatistic() {
				return this.statistic;
			}

			public void setStatistic(String statistic) {
				this.statistic = statistic;
			}

			public String getExpression() {
				return this.expression;
			}

			public void setExpression(String expression) {
				this.expression = expression;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public List<Dimension> getDimensions() {
				return this.dimensions;
			}

			public void setDimensions(List<Dimension> dimensions) {
				this.dimensions = dimensions;
			}

			public static class Dimension {

				private String dimensionValue;

				private String dimensionKey;

				public String getDimensionValue() {
					return this.dimensionValue;
				}

				public void setDimensionValue(String dimensionValue) {
					this.dimensionValue = dimensionValue;
				}

				public String getDimensionKey() {
					return this.dimensionKey;
				}

				public void setDimensionKey(String dimensionKey) {
					this.dimensionKey = dimensionKey;
				}
			}
		}

		public static class Alarm {

			private String metricName;

			private String comparisonOperator;

			private String metricType;

			private Integer evaluationCount;

			private Integer period;

			private String alarmTaskName;

			private String alarmTaskId;

			private String statistics;

			private Float threshold;

			private List<Dimension2> dimensions1;

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

			public String getMetricType() {
				return this.metricType;
			}

			public void setMetricType(String metricType) {
				this.metricType = metricType;
			}

			public Integer getEvaluationCount() {
				return this.evaluationCount;
			}

			public void setEvaluationCount(Integer evaluationCount) {
				this.evaluationCount = evaluationCount;
			}

			public Integer getPeriod() {
				return this.period;
			}

			public void setPeriod(Integer period) {
				this.period = period;
			}

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

			public String getStatistics() {
				return this.statistics;
			}

			public void setStatistics(String statistics) {
				this.statistics = statistics;
			}

			public Float getThreshold() {
				return this.threshold;
			}

			public void setThreshold(Float threshold) {
				this.threshold = threshold;
			}

			public List<Dimension2> getDimensions1() {
				return this.dimensions1;
			}

			public void setDimensions1(List<Dimension2> dimensions1) {
				this.dimensions1 = dimensions1;
			}

			public static class Dimension2 {

				private String dimensionValue;

				private String dimensionKey;

				public String getDimensionValue() {
					return this.dimensionValue;
				}

				public void setDimensionValue(String dimensionValue) {
					this.dimensionValue = dimensionValue;
				}

				public String getDimensionKey() {
					return this.dimensionKey;
				}

				public void setDimensionKey(String dimensionKey) {
					this.dimensionKey = dimensionKey;
				}
			}
		}

		public static class AlarmDimension {

			private String dimensionValue;

			private String dimensionKey;

			public String getDimensionValue() {
				return this.dimensionValue;
			}

			public void setDimensionValue(String dimensionValue) {
				this.dimensionValue = dimensionValue;
			}

			public String getDimensionKey() {
				return this.dimensionKey;
			}

			public void setDimensionKey(String dimensionKey) {
				this.dimensionKey = dimensionKey;
			}
		}
	}

	@Override
	public DescribeScalingRulesResponse getInstance(UnmarshallerContext context) {
		return	DescribeScalingRulesResponseUnmarshaller.unmarshall(this, context);
	}
}
