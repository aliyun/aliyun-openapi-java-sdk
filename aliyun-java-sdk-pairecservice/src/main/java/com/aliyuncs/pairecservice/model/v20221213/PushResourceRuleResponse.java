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

package com.aliyuncs.pairecservice.model.v20221213;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.pairecservice.transform.v20221213.PushResourceRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PushResourceRuleResponse extends AcsResponse {

	private String requestId;

	private String resourceRuleId;

	private String name;

	private String description;

	private String metricOperationType;

	private String metricPullInfo;

	private String metricPullPeriod;

	private String ruleComputingDefinition;

	private List<RuleItemsItem> ruleItems;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResourceRuleId() {
		return this.resourceRuleId;
	}

	public void setResourceRuleId(String resourceRuleId) {
		this.resourceRuleId = resourceRuleId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMetricOperationType() {
		return this.metricOperationType;
	}

	public void setMetricOperationType(String metricOperationType) {
		this.metricOperationType = metricOperationType;
	}

	public String getMetricPullInfo() {
		return this.metricPullInfo;
	}

	public void setMetricPullInfo(String metricPullInfo) {
		this.metricPullInfo = metricPullInfo;
	}

	public String getMetricPullPeriod() {
		return this.metricPullPeriod;
	}

	public void setMetricPullPeriod(String metricPullPeriod) {
		this.metricPullPeriod = metricPullPeriod;
	}

	public String getRuleComputingDefinition() {
		return this.ruleComputingDefinition;
	}

	public void setRuleComputingDefinition(String ruleComputingDefinition) {
		this.ruleComputingDefinition = ruleComputingDefinition;
	}

	public List<RuleItemsItem> getRuleItems() {
		return this.ruleItems;
	}

	public void setRuleItems(List<RuleItemsItem> ruleItems) {
		this.ruleItems = ruleItems;
	}

	public static class RuleItemsItem {

		private String name;

		private String description;

		private String minValue;

		private String value;

		private String maxValue;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getMinValue() {
			return this.minValue;
		}

		public void setMinValue(String minValue) {
			this.minValue = minValue;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getMaxValue() {
			return this.maxValue;
		}

		public void setMaxValue(String maxValue) {
			this.maxValue = maxValue;
		}
	}

	@Override
	public PushResourceRuleResponse getInstance(UnmarshallerContext context) {
		return	PushResourceRuleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
