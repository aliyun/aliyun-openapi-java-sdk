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
import com.aliyuncs.cms.transform.v20190101.DescribeAlertingMetricRuleResourcesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAlertingMetricRuleResourcesResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private Integer total;

	private Boolean success;

	private List<Resource> resources;

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

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<Resource> getResources() {
		return this.resources;
	}

	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}

	public static class Resource {

		private String metricName;

		private String retryTimes;

		private String metricValues;

		private String namespace;

		private String ruleName;

		private String ruleId;

		private String productCategory;

		private String startTime;

		private String resource;

		private String lastModifyTime;

		private String groupId;

		private String dimensions;

		private String lastAlertTime;

		private Integer level;

		private String threshold;

		private String statistics;

		private String enable;

		private List<Resource1> escalation;

		public String getMetricName() {
			return this.metricName;
		}

		public void setMetricName(String metricName) {
			this.metricName = metricName;
		}

		public String getRetryTimes() {
			return this.retryTimes;
		}

		public void setRetryTimes(String retryTimes) {
			this.retryTimes = retryTimes;
		}

		public String getMetricValues() {
			return this.metricValues;
		}

		public void setMetricValues(String metricValues) {
			this.metricValues = metricValues;
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

		public String getProductCategory() {
			return this.productCategory;
		}

		public void setProductCategory(String productCategory) {
			this.productCategory = productCategory;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getResource() {
			return this.resource;
		}

		public void setResource(String resource) {
			this.resource = resource;
		}

		public String getLastModifyTime() {
			return this.lastModifyTime;
		}

		public void setLastModifyTime(String lastModifyTime) {
			this.lastModifyTime = lastModifyTime;
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

		public String getLastAlertTime() {
			return this.lastAlertTime;
		}

		public void setLastAlertTime(String lastAlertTime) {
			this.lastAlertTime = lastAlertTime;
		}

		public Integer getLevel() {
			return this.level;
		}

		public void setLevel(Integer level) {
			this.level = level;
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

		public List<Resource1> getEscalation() {
			return this.escalation;
		}

		public void setEscalation(List<Resource1> escalation) {
			this.escalation = escalation;
		}

		public static class Resource1 {

			private String comparisonOperator;

			private String preCondition;

			private String expression;

			private Integer times;

			private String tag;

			private String threshold;

			private Integer level;

			private String expressionListJoin;

			private List<ExpressionListItem> expressionList;

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

			public String getExpression() {
				return this.expression;
			}

			public void setExpression(String expression) {
				this.expression = expression;
			}

			public Integer getTimes() {
				return this.times;
			}

			public void setTimes(Integer times) {
				this.times = times;
			}

			public String getTag() {
				return this.tag;
			}

			public void setTag(String tag) {
				this.tag = tag;
			}

			public String getThreshold() {
				return this.threshold;
			}

			public void setThreshold(String threshold) {
				this.threshold = threshold;
			}

			public Integer getLevel() {
				return this.level;
			}

			public void setLevel(Integer level) {
				this.level = level;
			}

			public String getExpressionListJoin() {
				return this.expressionListJoin;
			}

			public void setExpressionListJoin(String expressionListJoin) {
				this.expressionListJoin = expressionListJoin;
			}

			public List<ExpressionListItem> getExpressionList() {
				return this.expressionList;
			}

			public void setExpressionList(List<ExpressionListItem> expressionList) {
				this.expressionList = expressionList;
			}

			public static class ExpressionListItem {

				private String comparisonOperator;

				private String metricName;

				private String period;

				private String statistics;

				private String threshold;

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

				public String getPeriod() {
					return this.period;
				}

				public void setPeriod(String period) {
					this.period = period;
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
			}
		}
	}

	@Override
	public DescribeAlertingMetricRuleResourcesResponse getInstance(UnmarshallerContext context) {
		return	DescribeAlertingMetricRuleResourcesResponseUnmarshaller.unmarshall(this, context);
	}
}
