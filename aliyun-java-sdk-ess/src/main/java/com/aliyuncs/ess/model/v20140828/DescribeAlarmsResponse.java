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
import com.aliyuncs.ess.transform.v20140828.DescribeAlarmsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAlarmsResponse extends AcsResponse {

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private Integer totalCount;

	private List<Alarm> alarmList;

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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<Alarm> getAlarmList() {
		return this.alarmList;
	}

	public void setAlarmList(List<Alarm> alarmList) {
		this.alarmList = alarmList;
	}

	public static class Alarm {

		private String alarmTaskId;

		private String metricName;

		private Integer evaluationCount;

		private String state;

		private Integer period;

		private String scalingGroupId;

		private String comparisonOperator;

		private String effective;

		private String description;

		private String metricType;

		private String name;

		private Float threshold;

		private Boolean enable;

		private String statistics;

		private String expressionsLogicOperator;

		private String hybridMonitorNamespace;

		private String promQL;

		private List<Dimension> dimensions;

		private List<Expression> expressions;

		private List<HybridMetric> hybridMetrics;

		private List<String> alarmActions;

		public String getAlarmTaskId() {
			return this.alarmTaskId;
		}

		public void setAlarmTaskId(String alarmTaskId) {
			this.alarmTaskId = alarmTaskId;
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

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public Integer getPeriod() {
			return this.period;
		}

		public void setPeriod(Integer period) {
			this.period = period;
		}

		public String getScalingGroupId() {
			return this.scalingGroupId;
		}

		public void setScalingGroupId(String scalingGroupId) {
			this.scalingGroupId = scalingGroupId;
		}

		public String getComparisonOperator() {
			return this.comparisonOperator;
		}

		public void setComparisonOperator(String comparisonOperator) {
			this.comparisonOperator = comparisonOperator;
		}

		public String getEffective() {
			return this.effective;
		}

		public void setEffective(String effective) {
			this.effective = effective;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getMetricType() {
			return this.metricType;
		}

		public void setMetricType(String metricType) {
			this.metricType = metricType;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Float getThreshold() {
			return this.threshold;
		}

		public void setThreshold(Float threshold) {
			this.threshold = threshold;
		}

		public Boolean getEnable() {
			return this.enable;
		}

		public void setEnable(Boolean enable) {
			this.enable = enable;
		}

		public String getStatistics() {
			return this.statistics;
		}

		public void setStatistics(String statistics) {
			this.statistics = statistics;
		}

		public String getExpressionsLogicOperator() {
			return this.expressionsLogicOperator;
		}

		public void setExpressionsLogicOperator(String expressionsLogicOperator) {
			this.expressionsLogicOperator = expressionsLogicOperator;
		}

		public String getHybridMonitorNamespace() {
			return this.hybridMonitorNamespace;
		}

		public void setHybridMonitorNamespace(String hybridMonitorNamespace) {
			this.hybridMonitorNamespace = hybridMonitorNamespace;
		}

		public String getPromQL() {
			return this.promQL;
		}

		public void setPromQL(String promQL) {
			this.promQL = promQL;
		}

		public List<Dimension> getDimensions() {
			return this.dimensions;
		}

		public void setDimensions(List<Dimension> dimensions) {
			this.dimensions = dimensions;
		}

		public List<Expression> getExpressions() {
			return this.expressions;
		}

		public void setExpressions(List<Expression> expressions) {
			this.expressions = expressions;
		}

		public List<HybridMetric> getHybridMetrics() {
			return this.hybridMetrics;
		}

		public void setHybridMetrics(List<HybridMetric> hybridMetrics) {
			this.hybridMetrics = hybridMetrics;
		}

		public List<String> getAlarmActions() {
			return this.alarmActions;
		}

		public void setAlarmActions(List<String> alarmActions) {
			this.alarmActions = alarmActions;
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

		public static class Expression {

			private String metricName;

			private String comparisonOperator;

			private Integer period;

			private String statistics;

			private Float threshold;

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

			public Float getThreshold() {
				return this.threshold;
			}

			public void setThreshold(Float threshold) {
				this.threshold = threshold;
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
	public DescribeAlarmsResponse getInstance(UnmarshallerContext context) {
		return	DescribeAlarmsResponseUnmarshaller.unmarshall(this, context);
	}
}
