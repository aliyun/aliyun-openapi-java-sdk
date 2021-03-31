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
import com.aliyuncs.sae.transform.v20190506.UpdateApplicationScalingRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateApplicationScalingRuleResponse extends AcsResponse {

	private String requestId;

	private String traceId;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Boolean scaleRuleEnabled;

		private Long lastDisableTime;

		private String appId;

		private Long createTime;

		private Long updateTime;

		private String scaleRuleName;

		private String scaleRuleType;

		private Timer timer;

		private Metric metric;

		public Boolean getScaleRuleEnabled() {
			return this.scaleRuleEnabled;
		}

		public void setScaleRuleEnabled(Boolean scaleRuleEnabled) {
			this.scaleRuleEnabled = scaleRuleEnabled;
		}

		public Long getLastDisableTime() {
			return this.lastDisableTime;
		}

		public void setLastDisableTime(Long lastDisableTime) {
			this.lastDisableTime = lastDisableTime;
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

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public String getScaleRuleName() {
			return this.scaleRuleName;
		}

		public void setScaleRuleName(String scaleRuleName) {
			this.scaleRuleName = scaleRuleName;
		}

		public String getScaleRuleType() {
			return this.scaleRuleType;
		}

		public void setScaleRuleType(String scaleRuleType) {
			this.scaleRuleType = scaleRuleType;
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

			private String period;

			private String endDate;

			private String beginDate;

			private List<Schedule> schedules;

			public String getPeriod() {
				return this.period;
			}

			public void setPeriod(String period) {
				this.period = period;
			}

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

			public List<Schedule> getSchedules() {
				return this.schedules;
			}

			public void setSchedules(List<Schedule> schedules) {
				this.schedules = schedules;
			}

			public static class Schedule {

				private Integer targetReplicas;

				private String atTime;

				public Integer getTargetReplicas() {
					return this.targetReplicas;
				}

				public void setTargetReplicas(Integer targetReplicas) {
					this.targetReplicas = targetReplicas;
				}

				public String getAtTime() {
					return this.atTime;
				}

				public void setAtTime(String atTime) {
					this.atTime = atTime;
				}
			}
		}

		public static class Metric {

			private Integer minReplicas;

			private Integer maxReplicas;

			private List<Metric1> metrics;

			public Integer getMinReplicas() {
				return this.minReplicas;
			}

			public void setMinReplicas(Integer minReplicas) {
				this.minReplicas = minReplicas;
			}

			public Integer getMaxReplicas() {
				return this.maxReplicas;
			}

			public void setMaxReplicas(Integer maxReplicas) {
				this.maxReplicas = maxReplicas;
			}

			public List<Metric1> getMetrics() {
				return this.metrics;
			}

			public void setMetrics(List<Metric1> metrics) {
				this.metrics = metrics;
			}

			public static class Metric1 {

				private String metricType;

				private Integer metricTargetAverageUtilization;

				public String getMetricType() {
					return this.metricType;
				}

				public void setMetricType(String metricType) {
					this.metricType = metricType;
				}

				public Integer getMetricTargetAverageUtilization() {
					return this.metricTargetAverageUtilization;
				}

				public void setMetricTargetAverageUtilization(Integer metricTargetAverageUtilization) {
					this.metricTargetAverageUtilization = metricTargetAverageUtilization;
				}
			}
		}
	}

	@Override
	public UpdateApplicationScalingRuleResponse getInstance(UnmarshallerContext context) {
		return	UpdateApplicationScalingRuleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
