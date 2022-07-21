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
import com.aliyuncs.cms.transform.v20190101.DescribeMetricRuleBlackListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMetricRuleBlackListResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Integer total;

	private Boolean success;

	private List<DescribeMetricRuleBlackListItem> describeMetricRuleBlackList;

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

	public List<DescribeMetricRuleBlackListItem> getDescribeMetricRuleBlackList() {
		return this.describeMetricRuleBlackList;
	}

	public void setDescribeMetricRuleBlackList(List<DescribeMetricRuleBlackListItem> describeMetricRuleBlackList) {
		this.describeMetricRuleBlackList = describeMetricRuleBlackList;
	}

	public static class DescribeMetricRuleBlackListItem {

		private String effectiveTime;

		private String updateTime;

		private String createTime;

		private String scopeType;

		private Boolean isEnable;

		private String namespace;

		private String category;

		private Long enableEndTime;

		private String name;

		private Long enableStartTime;

		private String id;

		private List<MetricsItem> metrics;

		private List<String> instances;

		private List<String> scopeValue;

		public String getEffectiveTime() {
			return this.effectiveTime;
		}

		public void setEffectiveTime(String effectiveTime) {
			this.effectiveTime = effectiveTime;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getScopeType() {
			return this.scopeType;
		}

		public void setScopeType(String scopeType) {
			this.scopeType = scopeType;
		}

		public Boolean getIsEnable() {
			return this.isEnable;
		}

		public void setIsEnable(Boolean isEnable) {
			this.isEnable = isEnable;
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

		public Long getEnableEndTime() {
			return this.enableEndTime;
		}

		public void setEnableEndTime(Long enableEndTime) {
			this.enableEndTime = enableEndTime;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getEnableStartTime() {
			return this.enableStartTime;
		}

		public void setEnableStartTime(Long enableStartTime) {
			this.enableStartTime = enableStartTime;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public List<MetricsItem> getMetrics() {
			return this.metrics;
		}

		public void setMetrics(List<MetricsItem> metrics) {
			this.metrics = metrics;
		}

		public List<String> getInstances() {
			return this.instances;
		}

		public void setInstances(List<String> instances) {
			this.instances = instances;
		}

		public List<String> getScopeValue() {
			return this.scopeValue;
		}

		public void setScopeValue(List<String> scopeValue) {
			this.scopeValue = scopeValue;
		}

		public static class MetricsItem {

			private String resource;

			private String metricName;

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
		}
	}

	@Override
	public DescribeMetricRuleBlackListResponse getInstance(UnmarshallerContext context) {
		return	DescribeMetricRuleBlackListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
