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

package com.aliyuncs.cms.model.v20190101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cms.transform.v20190101.DescribeActiveMetricRuleListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeActiveMetricRuleListResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private List<Alarm> datapoints;

	private List<Alert> alertList;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<Alarm> getDatapoints() {
		return this.datapoints;
	}

	public void setDatapoints(List<Alarm> datapoints) {
		this.datapoints = datapoints;
	}

	public List<Alert> getAlertList() {
		return this.alertList;
	}

	public void setAlertList(List<Alert> alertList) {
		this.alertList = alertList;
	}

	public static class Alarm {

		private String silenceTime;

		private String metricName;

		private String evaluationCount;

		private String webhook;

		private String state;

		private String contactGroups;

		private String namespace;

		private String ruleName;

		private String ruleId;

		private String period;

		private String comparisonOperator;

		private String endTime;

		private String startTime;

		private String threshold;

		private String statistics;

		private String enable;

		public String getSilenceTime() {
			return this.silenceTime;
		}

		public void setSilenceTime(String silenceTime) {
			this.silenceTime = silenceTime;
		}

		public String getMetricName() {
			return this.metricName;
		}

		public void setMetricName(String metricName) {
			this.metricName = metricName;
		}

		public String getEvaluationCount() {
			return this.evaluationCount;
		}

		public void setEvaluationCount(String evaluationCount) {
			this.evaluationCount = evaluationCount;
		}

		public String getWebhook() {
			return this.webhook;
		}

		public void setWebhook(String webhook) {
			this.webhook = webhook;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getContactGroups() {
			return this.contactGroups;
		}

		public void setContactGroups(String contactGroups) {
			this.contactGroups = contactGroups;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getRuleName() {
			return this.ruleName;
		}

		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}

		public String getRuleId() {
			return this.ruleId;
		}

		public void setRuleId(String ruleId) {
			this.ruleId = ruleId;
		}

		public String getPeriod() {
			return this.period;
		}

		public void setPeriod(String period) {
			this.period = period;
		}

		public String getComparisonOperator() {
			return this.comparisonOperator;
		}

		public void setComparisonOperator(String comparisonOperator) {
			this.comparisonOperator = comparisonOperator;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getThreshold() {
			return this.threshold;
		}

		public void setThreshold(String threshold) {
			this.threshold = threshold;
		}

		public String getStatistics() {
			return this.statistics;
		}

		public void setStatistics(String statistics) {
			this.statistics = statistics;
		}

		public String getEnable() {
			return this.enable;
		}

		public void setEnable(String enable) {
			this.enable = enable;
		}
	}

	public static class Alert {

		private String silenceTime;

		private String metricName;

		private String webhook;

		private String contactGroups;

		private String namespace;

		private String effectiveInterval;

		private String noEffectiveInterval;

		private String mailSubject;

		private String ruleName;

		private String ruleId;

		private String period;

		private String alertState;

		private String dimensions;

		private Boolean enableState;

		private String resources;

		private Escalations escalations;

		public String getSilenceTime() {
			return this.silenceTime;
		}

		public void setSilenceTime(String silenceTime) {
			this.silenceTime = silenceTime;
		}

		public String getMetricName() {
			return this.metricName;
		}

		public void setMetricName(String metricName) {
			this.metricName = metricName;
		}

		public String getWebhook() {
			return this.webhook;
		}

		public void setWebhook(String webhook) {
			this.webhook = webhook;
		}

		public String getContactGroups() {
			return this.contactGroups;
		}

		public void setContactGroups(String contactGroups) {
			this.contactGroups = contactGroups;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getEffectiveInterval() {
			return this.effectiveInterval;
		}

		public void setEffectiveInterval(String effectiveInterval) {
			this.effectiveInterval = effectiveInterval;
		}

		public String getNoEffectiveInterval() {
			return this.noEffectiveInterval;
		}

		public void setNoEffectiveInterval(String noEffectiveInterval) {
			this.noEffectiveInterval = noEffectiveInterval;
		}

		public String getMailSubject() {
			return this.mailSubject;
		}

		public void setMailSubject(String mailSubject) {
			this.mailSubject = mailSubject;
		}

		public String getRuleName() {
			return this.ruleName;
		}

		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}

		public String getRuleId() {
			return this.ruleId;
		}

		public void setRuleId(String ruleId) {
			this.ruleId = ruleId;
		}

		public String getPeriod() {
			return this.period;
		}

		public void setPeriod(String period) {
			this.period = period;
		}

		public String getAlertState() {
			return this.alertState;
		}

		public void setAlertState(String alertState) {
			this.alertState = alertState;
		}

		public String getDimensions() {
			return this.dimensions;
		}

		public void setDimensions(String dimensions) {
			this.dimensions = dimensions;
		}

		public Boolean getEnableState() {
			return this.enableState;
		}

		public void setEnableState(Boolean enableState) {
			this.enableState = enableState;
		}

		public String getResources() {
			return this.resources;
		}

		public void setResources(String resources) {
			this.resources = resources;
		}

		public Escalations getEscalations() {
			return this.escalations;
		}

		public void setEscalations(Escalations escalations) {
			this.escalations = escalations;
		}

		public static class Escalations {

			private Info info;

			private Warn warn;

			private Critical critical;

			public Info getInfo() {
				return this.info;
			}

			public void setInfo(Info info) {
				this.info = info;
			}

			public Warn getWarn() {
				return this.warn;
			}

			public void setWarn(Warn warn) {
				this.warn = warn;
			}

			public Critical getCritical() {
				return this.critical;
			}

			public void setCritical(Critical critical) {
				this.critical = critical;
			}

			public static class Info {

				private String comparisonOperator;

				private String times;

				private String threshold;

				private String statistics;

				public String getComparisonOperator() {
					return this.comparisonOperator;
				}

				public void setComparisonOperator(String comparisonOperator) {
					this.comparisonOperator = comparisonOperator;
				}

				public String getTimes() {
					return this.times;
				}

				public void setTimes(String times) {
					this.times = times;
				}

				public String getThreshold() {
					return this.threshold;
				}

				public void setThreshold(String threshold) {
					this.threshold = threshold;
				}

				public String getStatistics() {
					return this.statistics;
				}

				public void setStatistics(String statistics) {
					this.statistics = statistics;
				}
			}

			public static class Warn {

				private String comparisonOperator;

				private String times;

				private String threshold;

				private String statistics;

				public String getComparisonOperator() {
					return this.comparisonOperator;
				}

				public void setComparisonOperator(String comparisonOperator) {
					this.comparisonOperator = comparisonOperator;
				}

				public String getTimes() {
					return this.times;
				}

				public void setTimes(String times) {
					this.times = times;
				}

				public String getThreshold() {
					return this.threshold;
				}

				public void setThreshold(String threshold) {
					this.threshold = threshold;
				}

				public String getStatistics() {
					return this.statistics;
				}

				public void setStatistics(String statistics) {
					this.statistics = statistics;
				}
			}

			public static class Critical {

				private String comparisonOperator;

				private String times;

				private String threshold;

				private String statistics;

				public String getComparisonOperator() {
					return this.comparisonOperator;
				}

				public void setComparisonOperator(String comparisonOperator) {
					this.comparisonOperator = comparisonOperator;
				}

				public String getTimes() {
					return this.times;
				}

				public void setTimes(String times) {
					this.times = times;
				}

				public String getThreshold() {
					return this.threshold;
				}

				public void setThreshold(String threshold) {
					this.threshold = threshold;
				}

				public String getStatistics() {
					return this.statistics;
				}

				public void setStatistics(String statistics) {
					this.statistics = statistics;
				}
			}
		}
	}

	@Override
	public DescribeActiveMetricRuleListResponse getInstance(UnmarshallerContext context) {
		return	DescribeActiveMetricRuleListResponseUnmarshaller.unmarshall(this, context);
	}
}
