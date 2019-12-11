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

	private String requestId;

	private Boolean success;

	private Integer code;

	private String message;

	private Resource resource;

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

	public Resource getResource() {
		return this.resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	public static class Resource {

		private String name;

		private String templateId;

		private String restVersion;

		private String description;

		private List<AlertTemplate> alertTemplates;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(String templateId) {
			this.templateId = templateId;
		}

		public String getRestVersion() {
			return this.restVersion;
		}

		public void setRestVersion(String restVersion) {
			this.restVersion = restVersion;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public List<AlertTemplate> getAlertTemplates() {
			return this.alertTemplates;
		}

		public void setAlertTemplates(List<AlertTemplate> alertTemplates) {
			this.alertTemplates = alertTemplates;
		}

		public static class AlertTemplate {

			private String ruleName;

			private String category;

			private String namespace;

			private String metricName;

			private String selector;

			private String webhook;

			private Escalations escalations;

			public String getRuleName() {
				return this.ruleName;
			}

			public void setRuleName(String ruleName) {
				this.ruleName = ruleName;
			}

			public String getCategory() {
				return this.category;
			}

			public void setCategory(String category) {
				this.category = category;
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

					private String statistics;

					private String comparisonOperator;

					private String threshold;

					private Integer times;

					public String getStatistics() {
						return this.statistics;
					}

					public void setStatistics(String statistics) {
						this.statistics = statistics;
					}

					public String getComparisonOperator() {
						return this.comparisonOperator;
					}

					public void setComparisonOperator(String comparisonOperator) {
						this.comparisonOperator = comparisonOperator;
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
				}

				public static class Warn {

					private String statistics;

					private String comparisonOperator;

					private String threshold;

					private Integer times;

					public String getStatistics() {
						return this.statistics;
					}

					public void setStatistics(String statistics) {
						this.statistics = statistics;
					}

					public String getComparisonOperator() {
						return this.comparisonOperator;
					}

					public void setComparisonOperator(String comparisonOperator) {
						this.comparisonOperator = comparisonOperator;
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
				}

				public static class Critical {

					private String statistics;

					private String comparisonOperator;

					private String threshold;

					private Integer times;

					public String getStatistics() {
						return this.statistics;
					}

					public void setStatistics(String statistics) {
						this.statistics = statistics;
					}

					public String getComparisonOperator() {
						return this.comparisonOperator;
					}

					public void setComparisonOperator(String comparisonOperator) {
						this.comparisonOperator = comparisonOperator;
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
				}
			}
		}
	}

	@Override
	public DescribeMetricRuleTemplateAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeMetricRuleTemplateAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
