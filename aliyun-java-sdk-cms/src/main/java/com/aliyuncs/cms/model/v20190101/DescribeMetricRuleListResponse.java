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

	private Integer code;

	private String message;

	private String requestId;

	private String total;

	private Boolean success;

	private List<Alarm> alarms;

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

	public String getTotal() {
		return this.total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<Alarm> getAlarms() {
		return this.alarms;
	}

	public void setAlarms(List<Alarm> alarms) {
		this.alarms = alarms;
	}

	public static class Alarm {

		private Integer silenceTime;

		private String metricName;

		private String webhook;

		private String contactGroups;

		private String sourceType;

		private String namespace;

		private String mailSubject;

		private String noEffectiveInterval;

		private String effectiveInterval;

		private String ruleName;

		private String alertState;

		private String period;

		private String ruleId;

		private String groupName;

		private String groupId;

		private String dimensions;

		private Boolean enableState;

		private String groupBy;

		private String resources;

		private String noDataPolicy;

		private String options;

		private List<LabelsItem> labels;

		private Escalations escalations;

		private CompositeExpression compositeExpression;

		private Prometheus prometheus;

		public Integer getSilenceTime() {
			return this.silenceTime;
		}

		public void setSilenceTime(Integer silenceTime) {
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

		public String getSourceType() {
			return this.sourceType;
		}

		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getMailSubject() {
			return this.mailSubject;
		}

		public void setMailSubject(String mailSubject) {
			this.mailSubject = mailSubject;
		}

		public String getNoEffectiveInterval() {
			return this.noEffectiveInterval;
		}

		public void setNoEffectiveInterval(String noEffectiveInterval) {
			this.noEffectiveInterval = noEffectiveInterval;
		}

		public String getEffectiveInterval() {
			return this.effectiveInterval;
		}

		public void setEffectiveInterval(String effectiveInterval) {
			this.effectiveInterval = effectiveInterval;
		}

		public String getRuleName() {
			return this.ruleName;
		}

		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}

		public String getAlertState() {
			return this.alertState;
		}

		public void setAlertState(String alertState) {
			this.alertState = alertState;
		}

		public String getPeriod() {
			return this.period;
		}

		public void setPeriod(String period) {
			this.period = period;
		}

		public String getRuleId() {
			return this.ruleId;
		}

		public void setRuleId(String ruleId) {
			this.ruleId = ruleId;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
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

		public String getGroupBy() {
			return this.groupBy;
		}

		public void setGroupBy(String groupBy) {
			this.groupBy = groupBy;
		}

		public String getResources() {
			return this.resources;
		}

		public void setResources(String resources) {
			this.resources = resources;
		}

		public String getNoDataPolicy() {
			return this.noDataPolicy;
		}

		public void setNoDataPolicy(String noDataPolicy) {
			this.noDataPolicy = noDataPolicy;
		}

		public String getOptions() {
			return this.options;
		}

		public void setOptions(String options) {
			this.options = options;
		}

		public List<LabelsItem> getLabels() {
			return this.labels;
		}

		public void setLabels(List<LabelsItem> labels) {
			this.labels = labels;
		}

		public Escalations getEscalations() {
			return this.escalations;
		}

		public void setEscalations(Escalations escalations) {
			this.escalations = escalations;
		}

		public CompositeExpression getCompositeExpression() {
			return this.compositeExpression;
		}

		public void setCompositeExpression(CompositeExpression compositeExpression) {
			this.compositeExpression = compositeExpression;
		}

		public Prometheus getPrometheus() {
			return this.prometheus;
		}

		public void setPrometheus(Prometheus prometheus) {
			this.prometheus = prometheus;
		}

		public static class LabelsItem {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
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

				private String preCondition;

				private Integer times;

				private String threshold;

				private String statistics;

				public String getComparisonOperator() {
					return this.comparisonOperator;
				}

				public void setComparisonOperator(String comparisonOperator) {
					this.comparisonOperator = comparisonOperator;
				}

				public String getPreCondition() {
					return this.preCondition;
				}

				public void setPreCondition(String preCondition) {
					this.preCondition = preCondition;
				}

				public Integer getTimes() {
					return this.times;
				}

				public void setTimes(Integer times) {
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

				private String preCondition;

				private Integer times;

				private String threshold;

				private String statistics;

				public String getComparisonOperator() {
					return this.comparisonOperator;
				}

				public void setComparisonOperator(String comparisonOperator) {
					this.comparisonOperator = comparisonOperator;
				}

				public String getPreCondition() {
					return this.preCondition;
				}

				public void setPreCondition(String preCondition) {
					this.preCondition = preCondition;
				}

				public Integer getTimes() {
					return this.times;
				}

				public void setTimes(Integer times) {
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

				private String preCondition;

				private Integer times;

				private String threshold;

				private String statistics;

				public String getComparisonOperator() {
					return this.comparisonOperator;
				}

				public void setComparisonOperator(String comparisonOperator) {
					this.comparisonOperator = comparisonOperator;
				}

				public String getPreCondition() {
					return this.preCondition;
				}

				public void setPreCondition(String preCondition) {
					this.preCondition = preCondition;
				}

				public Integer getTimes() {
					return this.times;
				}

				public void setTimes(Integer times) {
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

		public static class CompositeExpression {

			private String level;

			private String expressionListJoin;

			private String expressionRaw;

			private Integer times;

			private List<ExpressionListItem> expressionList;

			public String getLevel() {
				return this.level;
			}

			public void setLevel(String level) {
				this.level = level;
			}

			public String getExpressionListJoin() {
				return this.expressionListJoin;
			}

			public void setExpressionListJoin(String expressionListJoin) {
				this.expressionListJoin = expressionListJoin;
			}

			public String getExpressionRaw() {
				return this.expressionRaw;
			}

			public void setExpressionRaw(String expressionRaw) {
				this.expressionRaw = expressionRaw;
			}

			public Integer getTimes() {
				return this.times;
			}

			public void setTimes(Integer times) {
				this.times = times;
			}

			public List<ExpressionListItem> getExpressionList() {
				return this.expressionList;
			}

			public void setExpressionList(List<ExpressionListItem> expressionList) {
				this.expressionList = expressionList;
			}

			public static class ExpressionListItem {

				private String metricName;

				private String comparisonOperator;

				private String statistics;

				private String threshold;

				private Integer period;

				private String id;

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

				public Integer getPeriod() {
					return this.period;
				}

				public void setPeriod(Integer period) {
					this.period = period;
				}

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}
			}
		}

		public static class Prometheus {

			private String promQL;

			private String level;

			private Long times;

			private List<AnnotationsItem> annotations;

			public String getPromQL() {
				return this.promQL;
			}

			public void setPromQL(String promQL) {
				this.promQL = promQL;
			}

			public String getLevel() {
				return this.level;
			}

			public void setLevel(String level) {
				this.level = level;
			}

			public Long getTimes() {
				return this.times;
			}

			public void setTimes(Long times) {
				this.times = times;
			}

			public List<AnnotationsItem> getAnnotations() {
				return this.annotations;
			}

			public void setAnnotations(List<AnnotationsItem> annotations) {
				this.annotations = annotations;
			}

			public static class AnnotationsItem {

				private String key;

				private String value;

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}
		}
	}

	@Override
	public DescribeMetricRuleListResponse getInstance(UnmarshallerContext context) {
		return	DescribeMetricRuleListResponseUnmarshaller.unmarshall(this, context);
	}
}
