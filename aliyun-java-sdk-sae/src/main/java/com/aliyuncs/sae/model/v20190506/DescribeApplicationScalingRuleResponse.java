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

package com.aliyuncs.sae.model.v20190506;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sae.transform.v20190506.DescribeApplicationScalingRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeApplicationScalingRuleResponse extends AcsResponse {

	private String requestId;

	private String traceId;

	private String message;

	private String errorCode;

	private String code;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTraceId() {
		return this.traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long updateTime;

		private String appId;

		private Long createTime;

		private Long lastDisableTime;

		private Boolean scaleRuleEnabled;

		private String scaleRuleType;

		private String scaleRuleName;

		private Timer timer;

		private Metric metric;

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getLastDisableTime() {
			return this.lastDisableTime;
		}

		public void setLastDisableTime(Long lastDisableTime) {
			this.lastDisableTime = lastDisableTime;
		}

		public Boolean getScaleRuleEnabled() {
			return this.scaleRuleEnabled;
		}

		public void setScaleRuleEnabled(Boolean scaleRuleEnabled) {
			this.scaleRuleEnabled = scaleRuleEnabled;
		}

		public String getScaleRuleType() {
			return this.scaleRuleType;
		}

		public void setScaleRuleType(String scaleRuleType) {
			this.scaleRuleType = scaleRuleType;
		}

		public String getScaleRuleName() {
			return this.scaleRuleName;
		}

		public void setScaleRuleName(String scaleRuleName) {
			this.scaleRuleName = scaleRuleName;
		}

		public Timer getTimer() {
			return this.timer;
		}

		public void setTimer(Timer timer) {
			this.timer = timer;
		}

		public Metric getMetric() {
			return this.metric;
		}

		public void setMetric(Metric metric) {
			this.metric = metric;
		}

		public static class Timer {

			private String endDate;

			private String beginDate;

			private String period;

			private List<Schedule> schedules;

			public String getEndDate() {
				return this.endDate;
			}

			public void setEndDate(String endDate) {
				this.endDate = endDate;
			}

			public String getBeginDate() {
				return this.beginDate;
			}

			public void setBeginDate(String beginDate) {
				this.beginDate = beginDate;
			}

			public String getPeriod() {
				return this.period;
			}

			public void setPeriod(String period) {
				this.period = period;
			}

			public List<Schedule> getSchedules() {
				return this.schedules;
			}

			public void setSchedules(List<Schedule> schedules) {
				this.schedules = schedules;
			}

			public static class Schedule {

				private String atTime;

				private Integer targetReplicas;

				public String getAtTime() {
					return this.atTime;
				}

				public void setAtTime(String atTime) {
					this.atTime = atTime;
				}

				public Integer getTargetReplicas() {
					return this.targetReplicas;
				}

				public void setTargetReplicas(Integer targetReplicas) {
					this.targetReplicas = targetReplicas;
				}
			}
		}

		public static class Metric {

			private Integer maxReplicas;

			private Integer minReplicas;

			private List<Metric1> metrics;

			private MetricsStatus metricsStatus;

			private ScaleUpRules scaleUpRules;

			private ScaleDownRules scaleDownRules;

			public Integer getMaxReplicas() {
				return this.maxReplicas;
			}

			public void setMaxReplicas(Integer maxReplicas) {
				this.maxReplicas = maxReplicas;
			}

			public Integer getMinReplicas() {
				return this.minReplicas;
			}

			public void setMinReplicas(Integer minReplicas) {
				this.minReplicas = minReplicas;
			}

			public List<Metric1> getMetrics() {
				return this.metrics;
			}

			public void setMetrics(List<Metric1> metrics) {
				this.metrics = metrics;
			}

			public MetricsStatus getMetricsStatus() {
				return this.metricsStatus;
			}

			public void setMetricsStatus(MetricsStatus metricsStatus) {
				this.metricsStatus = metricsStatus;
			}

			public ScaleUpRules getScaleUpRules() {
				return this.scaleUpRules;
			}

			public void setScaleUpRules(ScaleUpRules scaleUpRules) {
				this.scaleUpRules = scaleUpRules;
			}

			public ScaleDownRules getScaleDownRules() {
				return this.scaleDownRules;
			}

			public void setScaleDownRules(ScaleDownRules scaleDownRules) {
				this.scaleDownRules = scaleDownRules;
			}

			public static class Metric1 {

				private Integer metricTargetAverageUtilization;

				private String metricType;

				public Integer getMetricTargetAverageUtilization() {
					return this.metricTargetAverageUtilization;
				}

				public void setMetricTargetAverageUtilization(Integer metricTargetAverageUtilization) {
					this.metricTargetAverageUtilization = metricTargetAverageUtilization;
				}

				public String getMetricType() {
					return this.metricType;
				}

				public void setMetricType(String metricType) {
					this.metricType = metricType;
				}
			}

			public static class MetricsStatus {

				private Long desiredReplicas;

				private Integer nextScaleTimePeriod;

				private Long currentReplicas;

				private String lastScaleTime;

				private List<CurrentMetric> currentMetrics;

				private List<NextScaleMetric> nextScaleMetrics;

				public Long getDesiredReplicas() {
					return this.desiredReplicas;
				}

				public void setDesiredReplicas(Long desiredReplicas) {
					this.desiredReplicas = desiredReplicas;
				}

				public Integer getNextScaleTimePeriod() {
					return this.nextScaleTimePeriod;
				}

				public void setNextScaleTimePeriod(Integer nextScaleTimePeriod) {
					this.nextScaleTimePeriod = nextScaleTimePeriod;
				}

				public Long getCurrentReplicas() {
					return this.currentReplicas;
				}

				public void setCurrentReplicas(Long currentReplicas) {
					this.currentReplicas = currentReplicas;
				}

				public String getLastScaleTime() {
					return this.lastScaleTime;
				}

				public void setLastScaleTime(String lastScaleTime) {
					this.lastScaleTime = lastScaleTime;
				}

				public List<CurrentMetric> getCurrentMetrics() {
					return this.currentMetrics;
				}

				public void setCurrentMetrics(List<CurrentMetric> currentMetrics) {
					this.currentMetrics = currentMetrics;
				}

				public List<NextScaleMetric> getNextScaleMetrics() {
					return this.nextScaleMetrics;
				}

				public void setNextScaleMetrics(List<NextScaleMetric> nextScaleMetrics) {
					this.nextScaleMetrics = nextScaleMetrics;
				}

				public static class CurrentMetric {

					private String type;

					private Long currentValue;

					private String name;

					public String getType() {
						return this.type;
					}

					public void setType(String type) {
						this.type = type;
					}

					public Long getCurrentValue() {
						return this.currentValue;
					}

					public void setCurrentValue(Long currentValue) {
						this.currentValue = currentValue;
					}

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}
				}

				public static class NextScaleMetric {

					private Integer nextScaleOutAverageUtilization;

					private Integer nextScaleInAverageUtilization;

					private String name;

					public Integer getNextScaleOutAverageUtilization() {
						return this.nextScaleOutAverageUtilization;
					}

					public void setNextScaleOutAverageUtilization(Integer nextScaleOutAverageUtilization) {
						this.nextScaleOutAverageUtilization = nextScaleOutAverageUtilization;
					}

					public Integer getNextScaleInAverageUtilization() {
						return this.nextScaleInAverageUtilization;
					}

					public void setNextScaleInAverageUtilization(Integer nextScaleInAverageUtilization) {
						this.nextScaleInAverageUtilization = nextScaleInAverageUtilization;
					}

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}
				}
			}

			public static class ScaleUpRules {

				private Long step;

				private Long stabilizationWindowSeconds;

				private Boolean disabled;

				public Long getStep() {
					return this.step;
				}

				public void setStep(Long step) {
					this.step = step;
				}

				public Long getStabilizationWindowSeconds() {
					return this.stabilizationWindowSeconds;
				}

				public void setStabilizationWindowSeconds(Long stabilizationWindowSeconds) {
					this.stabilizationWindowSeconds = stabilizationWindowSeconds;
				}

				public Boolean getDisabled() {
					return this.disabled;
				}

				public void setDisabled(Boolean disabled) {
					this.disabled = disabled;
				}
			}

			public static class ScaleDownRules {

				private Long step;

				private Long stabilizationWindowSeconds;

				private Boolean disabled;

				public Long getStep() {
					return this.step;
				}

				public void setStep(Long step) {
					this.step = step;
				}

				public Long getStabilizationWindowSeconds() {
					return this.stabilizationWindowSeconds;
				}

				public void setStabilizationWindowSeconds(Long stabilizationWindowSeconds) {
					this.stabilizationWindowSeconds = stabilizationWindowSeconds;
				}

				public Boolean getDisabled() {
					return this.disabled;
				}

				public void setDisabled(Boolean disabled) {
					this.disabled = disabled;
				}
			}
		}
	}

	@Override
	public DescribeApplicationScalingRuleResponse getInstance(UnmarshallerContext context) {
		return	DescribeApplicationScalingRuleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
