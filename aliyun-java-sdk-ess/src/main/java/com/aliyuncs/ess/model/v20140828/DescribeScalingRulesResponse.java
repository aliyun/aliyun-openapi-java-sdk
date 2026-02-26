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

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<ScalingRule> scalingRules;

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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<ScalingRule> getScalingRules() {
		return this.scalingRules;
	}

	public void setScalingRules(List<ScalingRule> scalingRules) {
		this.scalingRules = scalingRules;
	}

	public static class ScalingRule {

		private String metricName;

		private String adjustmentType;

		private Integer initialMaxSize;

		private Integer estimatedInstanceWarmup;

		private Integer scaleOutEvaluationCount;

		private String predictiveScalingMode;

		private Integer minAdjustmentMagnitude;

		private String scalingRuleAri;

		private Integer predictiveTaskBufferTime;

		private Integer minSize;

		private String scalingGroupId;

		private String predictiveValueBehavior;

		private Float targetValue;

		private Integer cooldown;

		private Integer maxSize;

		private Integer predictiveValueBuffer;

		private String scalingRuleType;

		private Integer adjustmentValue;

		private Integer scaleInEvaluationCount;

		private Boolean disableScaleIn;

		private String scalingRuleName;

		private String scalingRuleId;

		private String metricType;

		private String hybridMonitorNamespace;

		private List<Alarm> alarms;

		private List<StepAdjustment> stepAdjustments;

		private List<AlarmDimension> alarmDimensions;

		private List<HybridMetric> hybridMetrics;

		public String getMetricName() {
			return this.metricName;
		}

		public void setMetricName(String metricName) {
			this.metricName = metricName;
		}

		public String getAdjustmentType() {
			return this.adjustmentType;
		}

		public void setAdjustmentType(String adjustmentType) {
			this.adjustmentType = adjustmentType;
		}

		public Integer getInitialMaxSize() {
			return this.initialMaxSize;
		}

		public void setInitialMaxSize(Integer initialMaxSize) {
			this.initialMaxSize = initialMaxSize;
		}

		public Integer getEstimatedInstanceWarmup() {
			return this.estimatedInstanceWarmup;
		}

		public void setEstimatedInstanceWarmup(Integer estimatedInstanceWarmup) {
			this.estimatedInstanceWarmup = estimatedInstanceWarmup;
		}

		public Integer getScaleOutEvaluationCount() {
			return this.scaleOutEvaluationCount;
		}

		public void setScaleOutEvaluationCount(Integer scaleOutEvaluationCount) {
			this.scaleOutEvaluationCount = scaleOutEvaluationCount;
		}

		public String getPredictiveScalingMode() {
			return this.predictiveScalingMode;
		}

		public void setPredictiveScalingMode(String predictiveScalingMode) {
			this.predictiveScalingMode = predictiveScalingMode;
		}

		public Integer getMinAdjustmentMagnitude() {
			return this.minAdjustmentMagnitude;
		}

		public void setMinAdjustmentMagnitude(Integer minAdjustmentMagnitude) {
			this.minAdjustmentMagnitude = minAdjustmentMagnitude;
		}

		public String getScalingRuleAri() {
			return this.scalingRuleAri;
		}

		public void setScalingRuleAri(String scalingRuleAri) {
			this.scalingRuleAri = scalingRuleAri;
		}

		public Integer getPredictiveTaskBufferTime() {
			return this.predictiveTaskBufferTime;
		}

		public void setPredictiveTaskBufferTime(Integer predictiveTaskBufferTime) {
			this.predictiveTaskBufferTime = predictiveTaskBufferTime;
		}

		public Integer getMinSize() {
			return this.minSize;
		}

		public void setMinSize(Integer minSize) {
			this.minSize = minSize;
		}

		public String getScalingGroupId() {
			return this.scalingGroupId;
		}

		public void setScalingGroupId(String scalingGroupId) {
			this.scalingGroupId = scalingGroupId;
		}

		public String getPredictiveValueBehavior() {
			return this.predictiveValueBehavior;
		}

		public void setPredictiveValueBehavior(String predictiveValueBehavior) {
			this.predictiveValueBehavior = predictiveValueBehavior;
		}

		public Float getTargetValue() {
			return this.targetValue;
		}

		public void setTargetValue(Float targetValue) {
			this.targetValue = targetValue;
		}

		public Integer getCooldown() {
			return this.cooldown;
		}

		public void setCooldown(Integer cooldown) {
			this.cooldown = cooldown;
		}

		public Integer getMaxSize() {
			return this.maxSize;
		}

		public void setMaxSize(Integer maxSize) {
			this.maxSize = maxSize;
		}

		public Integer getPredictiveValueBuffer() {
			return this.predictiveValueBuffer;
		}

		public void setPredictiveValueBuffer(Integer predictiveValueBuffer) {
			this.predictiveValueBuffer = predictiveValueBuffer;
		}

		public String getScalingRuleType() {
			return this.scalingRuleType;
		}

		public void setScalingRuleType(String scalingRuleType) {
			this.scalingRuleType = scalingRuleType;
		}

		public Integer getAdjustmentValue() {
			return this.adjustmentValue;
		}

		public void setAdjustmentValue(Integer adjustmentValue) {
			this.adjustmentValue = adjustmentValue;
		}

		public Integer getScaleInEvaluationCount() {
			return this.scaleInEvaluationCount;
		}

		public void setScaleInEvaluationCount(Integer scaleInEvaluationCount) {
			this.scaleInEvaluationCount = scaleInEvaluationCount;
		}

		public Boolean getDisableScaleIn() {
			return this.disableScaleIn;
		}

		public void setDisableScaleIn(Boolean disableScaleIn) {
			this.disableScaleIn = disableScaleIn;
		}

		public String getScalingRuleName() {
			return this.scalingRuleName;
		}

		public void setScalingRuleName(String scalingRuleName) {
			this.scalingRuleName = scalingRuleName;
		}

		public String getScalingRuleId() {
			return this.scalingRuleId;
		}

		public void setScalingRuleId(String scalingRuleId) {
			this.scalingRuleId = scalingRuleId;
		}

		public String getMetricType() {
			return this.metricType;
		}

		public void setMetricType(String metricType) {
			this.metricType = metricType;
		}

		public String getHybridMonitorNamespace() {
			return this.hybridMonitorNamespace;
		}

		public void setHybridMonitorNamespace(String hybridMonitorNamespace) {
			this.hybridMonitorNamespace = hybridMonitorNamespace;
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

		public List<AlarmDimension> getAlarmDimensions() {
			return this.alarmDimensions;
		}

		public void setAlarmDimensions(List<AlarmDimension> alarmDimensions) {
			this.alarmDimensions = alarmDimensions;
		}

		public List<HybridMetric> getHybridMetrics() {
			return this.hybridMetrics;
		}

		public void setHybridMetrics(List<HybridMetric> hybridMetrics) {
			this.hybridMetrics = hybridMetrics;
		}

		public static class Alarm {

			private String alarmTaskId;

			private String comparisonOperator;

			private String metricName;

			private Integer evaluationCount;

			private String alarmTaskName;

			private String metricType;

			private Float threshold;

			private String statistics;

			private List<Dimension> dimensions;

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

			public String getMetricName() {
				return this.metricName;
			}

			public void setMetricName(String metricName) {
				this.metricName = metricName;
			}

			public Integer getEvaluationCount() {
				return this.evaluationCount;
			}

			public void setEvaluationCount(Integer evaluationCount) {
				this.evaluationCount = evaluationCount;
			}

			public String getAlarmTaskName() {
				return this.alarmTaskName;
			}

			public void setAlarmTaskName(String alarmTaskName) {
				this.alarmTaskName = alarmTaskName;
			}

			public String getMetricType() {
				return this.metricType;
			}

			public void setMetricType(String metricType) {
				this.metricType = metricType;
			}

			public Float getThreshold() {
				return this.threshold;
			}

			public void setThreshold(Float threshold) {
				this.threshold = threshold;
			}

			public String getStatistics() {
				return this.statistics;
			}

			public void setStatistics(String statistics) {
				this.statistics = statistics;
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

			private Float metricIntervalUpperBound;

			private Integer scalingAdjustment;

			private Float metricIntervalLowerBound;

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

			public Float getMetricIntervalLowerBound() {
				return this.metricIntervalLowerBound;
			}

			public void setMetricIntervalLowerBound(Float metricIntervalLowerBound) {
				this.metricIntervalLowerBound = metricIntervalLowerBound;
			}
		}

		public static class AlarmDimension {

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

		public static class HybridMetric {

			private String id;

			private String expression;

			private String metricName;

			private String statistic;

			private List<Dimension2> dimensions1;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getExpression() {
				return this.expression;
			}

			public void setExpression(String expression) {
				this.expression = expression;
			}

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

			public List<Dimension2> getDimensions1() {
				return this.dimensions1;
			}

			public void setDimensions1(List<Dimension2> dimensions1) {
				this.dimensions1 = dimensions1;
			}

			public static class Dimension2 {

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
	}

	@Override
	public DescribeScalingRulesResponse getInstance(UnmarshallerContext context) {
		return	DescribeScalingRulesResponseUnmarshaller.unmarshall(this, context);
	}
}
