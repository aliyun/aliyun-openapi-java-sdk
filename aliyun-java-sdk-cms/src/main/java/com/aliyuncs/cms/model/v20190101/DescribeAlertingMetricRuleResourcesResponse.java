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

	private String requestId;

	private Boolean success;

	private Integer code;

	private String message;

	private Integer total;

	private List<Resource> resources;

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

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<Resource> getResources() {
		return this.resources;
	}

	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}

	public static class Resource {

		private String ruleId;

		private String ruleName;

		private String groupId;

		private String resource;

		private String metricName;

		private String namespace;

		private String enable;

		private String lastAlertTime;

		private String lastModifyTime;

		private String dimensions;

		private String startTime;

		private String metricValues;

		private String retryTimes;

		private String statistics;

		private String threshold;

		private String productCategory;

		private Integer level;

		private List<Resource1> escalation;

		public String getRuleId() {
			return this.ruleId;
		}

		public void setRuleId(String ruleId) {
			this.ruleId = ruleId;
		}

		public String getRuleName() {
			return this.ruleName;
		}

		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getResource() {
			return this.resource;
		}

		public void setResource(String resource) {
			this.resource = resource;
		}

		public String getMetricName() {
			return this.metricName;
		}

		public void setMetricName(String metricName) {
			this.metricName = metricName;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getEnable() {
			return this.enable;
		}

		public void setEnable(String enable) {
			this.enable = enable;
		}

		public String getLastAlertTime() {
			return this.lastAlertTime;
		}

		public void setLastAlertTime(String lastAlertTime) {
			this.lastAlertTime = lastAlertTime;
		}

		public String getLastModifyTime() {
			return this.lastModifyTime;
		}

		public void setLastModifyTime(String lastModifyTime) {
			this.lastModifyTime = lastModifyTime;
		}

		public String getDimensions() {
			return this.dimensions;
		}

		public void setDimensions(String dimensions) {
			this.dimensions = dimensions;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getMetricValues() {
			return this.metricValues;
		}

		public void setMetricValues(String metricValues) {
			this.metricValues = metricValues;
		}

		public String getRetryTimes() {
			return this.retryTimes;
		}

		public void setRetryTimes(String retryTimes) {
			this.retryTimes = retryTimes;
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

		public String getProductCategory() {
			return this.productCategory;
		}

		public void setProductCategory(String productCategory) {
			this.productCategory = productCategory;
		}

		public Integer getLevel() {
			return this.level;
		}

		public void setLevel(Integer level) {
			this.level = level;
		}

		public List<Resource1> getEscalation() {
			return this.escalation;
		}

		public void setEscalation(List<Resource1> escalation) {
			this.escalation = escalation;
		}

		public static class Resource1 {

			private String expression;

			private String preCondition;

			private Integer level;

			private Integer times;

			private String comparisonOperator;

			private String tag;

			private String threshold;

			public String getExpression() {
				return this.expression;
			}

			public void setExpression(String expression) {
				this.expression = expression;
			}

			public String getPreCondition() {
				return this.preCondition;
			}

			public void setPreCondition(String preCondition) {
				this.preCondition = preCondition;
			}

			public Integer getLevel() {
				return this.level;
			}

			public void setLevel(Integer level) {
				this.level = level;
			}

			public Integer getTimes() {
				return this.times;
			}

			public void setTimes(Integer times) {
				this.times = times;
			}

			public String getComparisonOperator() {
				return this.comparisonOperator;
			}

			public void setComparisonOperator(String comparisonOperator) {
				this.comparisonOperator = comparisonOperator;
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
		}
	}

	@Override
	public DescribeAlertingMetricRuleResourcesResponse getInstance(UnmarshallerContext context) {
		return	DescribeAlertingMetricRuleResourcesResponseUnmarshaller.unmarshall(this, context);
	}
}
