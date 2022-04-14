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

package com.aliyuncs.edas.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.edas.transform.v20170801.DisableApplicationScalingRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DisableApplicationScalingRuleResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private AppScalingRule appScalingRule;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public AppScalingRule getAppScalingRule() {
		return this.appScalingRule;
	}

	public void setAppScalingRule(AppScalingRule appScalingRule) {
		this.appScalingRule = appScalingRule;
	}

	public static class AppScalingRule {

		private Long updateTime;

		private Long createTime;

		private String appId;

		private Long lastDisableTime;

		private Integer maxReplicas;

		private Boolean scaleRuleEnabled;

		private String scaleRuleType;

		private Integer minReplicas;

		private String scaleRuleName;

		private Metric metric;

		private Trigger trigger;

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public Long getLastDisableTime() {
			return this.lastDisableTime;
		}

		public void setLastDisableTime(Long lastDisableTime) {
			this.lastDisableTime = lastDisableTime;
		}

		public Integer getMaxReplicas() {
			return this.maxReplicas;
		}

		public void setMaxReplicas(Integer maxReplicas) {
			this.maxReplicas = maxReplicas;
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

		public Integer getMinReplicas() {
			return this.minReplicas;
		}

		public void setMinReplicas(Integer minReplicas) {
			this.minReplicas = minReplicas;
		}

		public String getScaleRuleName() {
			return this.scaleRuleName;
		}

		public void setScaleRuleName(String scaleRuleName) {
			this.scaleRuleName = scaleRuleName;
		}

		public Metric getMetric() {
			return this.metric;
		}

		public void setMetric(Metric metric) {
			this.metric = metric;
		}

		public Trigger getTrigger() {
			return this.trigger;
		}

		public void setTrigger(Trigger trigger) {
			this.trigger = trigger;
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
		}

		public static class Trigger {

			private Integer minReplicas;

			private Integer maxReplicas;

			private List<Trigger2> triggers;

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

			public List<Trigger2> getTriggers() {
				return this.triggers;
			}

			public void setTriggers(List<Trigger2> triggers) {
				this.triggers = triggers;
			}

			public static class Trigger2 {

				private String type;

				private String metaData;

				private String name;

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getMetaData() {
					return this.metaData;
				}

				public void setMetaData(String metaData) {
					this.metaData = metaData;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}
			}
		}
	}

	@Override
	public DisableApplicationScalingRuleResponse getInstance(UnmarshallerContext context) {
		return	DisableApplicationScalingRuleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
