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
import com.aliyuncs.cms.transform.v20190101.DescribeMetricRuleTemplateAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMetricRuleTemplateAttributeResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private Boolean success;

	private Resource resource;

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Resource getResource() {
		return this.resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	public static class Resource {

		private String description;

		private String systemEventTemplates;

		private String processMonitorTemplates;

		private String name;

		private String restVersion;

		private String hostAvailabilityTemplates;

		private String templateId;

		private List<AlertTemplate> alertTemplates;

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getSystemEventTemplates() {
			return this.systemEventTemplates;
		}

		public void setSystemEventTemplates(String systemEventTemplates) {
			this.systemEventTemplates = systemEventTemplates;
		}

		public String getProcessMonitorTemplates() {
			return this.processMonitorTemplates;
		}

		public void setProcessMonitorTemplates(String processMonitorTemplates) {
			this.processMonitorTemplates = processMonitorTemplates;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getRestVersion() {
			return this.restVersion;
		}

		public void setRestVersion(String restVersion) {
			this.restVersion = restVersion;
		}

		public String getHostAvailabilityTemplates() {
			return this.hostAvailabilityTemplates;
		}

		public void setHostAvailabilityTemplates(String hostAvailabilityTemplates) {
			this.hostAvailabilityTemplates = hostAvailabilityTemplates;
		}

		public String getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(String templateId) {
			this.templateId = templateId;
		}

		public List<AlertTemplate> getAlertTemplates() {
			return this.alertTemplates;
		}

		public void setAlertTemplates(List<AlertTemplate> alertTemplates) {
			this.alertTemplates = alertTemplates;
		}

		public static class AlertTemplate {

			private String metricName;

			private String selector;

			private String webhook;

			private String namespace;

			private String category;

			private String ruleName;

			private String noDataPolicy;

			private CompositeExpression compositeExpression;

			private Escalations escalations;

			public String getMetricName() {
				return this.metricName;
			}

			public void setMetricName(String metricName) {
				this.metricName = metricName;
			}

			public String getSelector() {
				return this.selector;
			}

			public void setSelector(String selector) {
				this.selector = selector;
			}

			public String getWebhook() {
				return this.webhook;
			}

			public void setWebhook(String webhook) {
				this.webhook = webhook;
			}

			public String getNamespace() {
				return this.namespace;
			}

			public void setNamespace(String namespace) {
				this.namespace = namespace;
			}

			public String getCategory() {
				return this.category;
			}

			public void setCategory(String category) {
				this.category = category;
			}

			public String getRuleName() {
				return this.ruleName;
			}

			public void setRuleName(String ruleName) {
				this.ruleName = ruleName;
			}

			public String getNoDataPolicy() {
				return this.noDataPolicy;
			}

			public void setNoDataPolicy(String noDataPolicy) {
				this.noDataPolicy = noDataPolicy;
			}

			public CompositeExpression getCompositeExpression() {
				return this.compositeExpression;
			}

			public void setCompositeExpression(CompositeExpression compositeExpression) {
				this.compositeExpression = compositeExpression;
			}

			public Escalations getEscalations() {
				return this.escalations;
			}

			public void setEscalations(Escalations escalations) {
				this.escalations = escalations;
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

					private Integer times;

					private String threshold;

					private String statistics;

					private String preCondition;

					public String getComparisonOperator() {
						return this.comparisonOperator;
					}

					public void setComparisonOperator(String comparisonOperator) {
						this.comparisonOperator = comparisonOperator;
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

					public String getPreCondition() {
						return this.preCondition;
					}

					public void setPreCondition(String preCondition) {
						this.preCondition = preCondition;
					}
				}

				public static class Warn {

					private String comparisonOperator;

					private Integer times;

					private String threshold;

					private String statistics;

					private String preCondition;

					public String getComparisonOperator() {
						return this.comparisonOperator;
					}

					public void setComparisonOperator(String comparisonOperator) {
						this.comparisonOperator = comparisonOperator;
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

					public String getPreCondition() {
						return this.preCondition;
					}

					public void setPreCondition(String preCondition) {
						this.preCondition = preCondition;
					}
				}

				public static class Critical {

					private String comparisonOperator;

					private Integer times;

					private String threshold;

					private String statistics;

					private String preCondition;

					public String getComparisonOperator() {
						return this.comparisonOperator;
					}

					public void setComparisonOperator(String comparisonOperator) {
						this.comparisonOperator = comparisonOperator;
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

					public String getPreCondition() {
						return this.preCondition;
					}

					public void setPreCondition(String preCondition) {
						this.preCondition = preCondition;
					}
				}
			}
		}
	}

	@Override
	public DescribeMetricRuleTemplateAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeMetricRuleTemplateAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
