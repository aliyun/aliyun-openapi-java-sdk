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
import com.aliyuncs.cms.transform.v20190101.DescribeMetricRuleListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMetricRuleListResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer code;

	private String message;

	private String total;

	private List<Alarm> alarms;

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

	public String getTotal() {
		return this.total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public List<Alarm> getAlarms() {
		return this.alarms;
	}

	public void setAlarms(List<Alarm> alarms) {
		this.alarms = alarms;
	}

	public static class Alarm {

		private String ruleId;

		private String namespace;

		private String metricName;

		private String period;

		private String effectiveInterval;

		private String noEffectiveInterval;

		private Integer silenceTime;

		private Boolean enableState;

		private String alertState;

		private String contactGroups;

		private String webhook;

		private String mailSubject;

		private String ruleName;

		private String resources;

		private String groupId;

		private String groupName;

		private String dimensions;

		private String sourceType;

		private String groupBy;

		private Escalations escalations;

		public String getRuleId() {
			return this.ruleId;
		}

		public void setRuleId(String ruleId) {
			this.ruleId = ruleId;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getMetricName() {
			return this.metricName;
		}

		public void setMetricName(String metricName) {
			this.metricName = metricName;
		}

		public String getPeriod() {
			return this.period;
		}

		public void setPeriod(String period) {
			this.period = period;
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

		public Integer getSilenceTime() {
			return this.silenceTime;
		}

		public void setSilenceTime(Integer silenceTime) {
			this.silenceTime = silenceTime;
		}

		public Boolean getEnableState() {
			return this.enableState;
		}

		public void setEnableState(Boolean enableState) {
			this.enableState = enableState;
		}

		public String getAlertState() {
			return this.alertState;
		}

		public void setAlertState(String alertState) {
			this.alertState = alertState;
		}

		public String getContactGroups() {
			return this.contactGroups;
		}

		public void setContactGroups(String contactGroups) {
			this.contactGroups = contactGroups;
		}

		public String getWebhook() {
			return this.webhook;
		}

		public void setWebhook(String webhook) {
			this.webhook = webhook;
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

		public String getResources() {
			return this.resources;
		}

		public void setResources(String resources) {
			this.resources = resources;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public String getDimensions() {
			return this.dimensions;
		}

		public void setDimensions(String dimensions) {
			this.dimensions = dimensions;
		}

		public String getSourceType() {
			return this.sourceType;
		}

		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}

		public String getGroupBy() {
			return this.groupBy;
		}

		public void setGroupBy(String groupBy) {
			this.groupBy = groupBy;
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

				private String statistics;

				private String threshold;

				private Integer times;

				private String preCondition;

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

				public String getThreshold() {
					return this.threshold;
				}

				public void setThreshold(String threshold) {
					this.threshold = threshold;
				}

				public Integer getTimes() {
					return this.times;
				}

				public void setTimes(Integer times) {
					this.times = times;
				}

				public String getPreCondition() {
					return this.preCondition;
				}

				public void setPreCondition(String preCondition) {
					this.preCondition = preCondition;
				}
			}

			public static class Warn {

				private String comparisonOperator;

				private String statistics;

				private String threshold;

				private Integer times;

				private String preCondition;

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

				public String getThreshold() {
					return this.threshold;
				}

				public void setThreshold(String threshold) {
					this.threshold = threshold;
				}

				public Integer getTimes() {
					return this.times;
				}

				public void setTimes(Integer times) {
					this.times = times;
				}

				public String getPreCondition() {
					return this.preCondition;
				}

				public void setPreCondition(String preCondition) {
					this.preCondition = preCondition;
				}
			}

			public static class Critical {

				private String comparisonOperator;

				private String statistics;

				private String threshold;

				private Integer times;

				private String preCondition;

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

				public String getThreshold() {
					return this.threshold;
				}

				public void setThreshold(String threshold) {
					this.threshold = threshold;
				}

				public Integer getTimes() {
					return this.times;
				}

				public void setTimes(Integer times) {
					this.times = times;
				}

				public String getPreCondition() {
					return this.preCondition;
				}

				public void setPreCondition(String preCondition) {
					this.preCondition = preCondition;
				}
			}
		}
	}

	@Override
	public DescribeMetricRuleListResponse getInstance(UnmarshallerContext context) {
		return	DescribeMetricRuleListResponseUnmarshaller.unmarshall(this, context);
	}
}
