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
import com.aliyuncs.cms.transform.v20190101.DescribeSiteMonitorAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSiteMonitorAttributeResponse extends AcsResponse {

	private String code;

	private String message;

	private Boolean success;

	private String requestId;

	private List<MetricRule> metricRules;

	private SiteMonitors siteMonitors;

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<MetricRule> getMetricRules() {
		return this.metricRules;
	}

	public void setMetricRules(List<MetricRule> metricRules) {
		this.metricRules = metricRules;
	}

	public SiteMonitors getSiteMonitors() {
		return this.siteMonitors;
	}

	public void setSiteMonitors(SiteMonitors siteMonitors) {
		this.siteMonitors = siteMonitors;
	}

	public static class MetricRule {

		private String ruleId;

		private String ruleName;

		private String namespace;

		private String metricName;

		private String okActions;

		private String alarmActions;

		private String statistics;

		private String actionEnable;

		private String period;

		private String comparisonOperator;

		private String threshold;

		private String evaluationCount;

		private String level;

		private String expression;

		private String stateValue;

		private String dimensions;

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

		public String getOkActions() {
			return this.okActions;
		}

		public void setOkActions(String okActions) {
			this.okActions = okActions;
		}

		public String getAlarmActions() {
			return this.alarmActions;
		}

		public void setAlarmActions(String alarmActions) {
			this.alarmActions = alarmActions;
		}

		public String getStatistics() {
			return this.statistics;
		}

		public void setStatistics(String statistics) {
			this.statistics = statistics;
		}

		public String getActionEnable() {
			return this.actionEnable;
		}

		public void setActionEnable(String actionEnable) {
			this.actionEnable = actionEnable;
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

		public String getThreshold() {
			return this.threshold;
		}

		public void setThreshold(String threshold) {
			this.threshold = threshold;
		}

		public String getEvaluationCount() {
			return this.evaluationCount;
		}

		public void setEvaluationCount(String evaluationCount) {
			this.evaluationCount = evaluationCount;
		}

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}

		public String getExpression() {
			return this.expression;
		}

		public void setExpression(String expression) {
			this.expression = expression;
		}

		public String getStateValue() {
			return this.stateValue;
		}

		public void setStateValue(String stateValue) {
			this.stateValue = stateValue;
		}

		public String getDimensions() {
			return this.dimensions;
		}

		public void setDimensions(String dimensions) {
			this.dimensions = dimensions;
		}
	}

	public static class SiteMonitors {

		private String taskType;

		private String address;

		private String taskState;

		private String taskName;

		private String interval;

		private String taskId;

		private String optionJson;

		private List<IspCity> ispCities;

		public String getTaskType() {
			return this.taskType;
		}

		public void setTaskType(String taskType) {
			this.taskType = taskType;
		}

		public String getAddress() {
			return this.address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getTaskState() {
			return this.taskState;
		}

		public void setTaskState(String taskState) {
			this.taskState = taskState;
		}

		public String getTaskName() {
			return this.taskName;
		}

		public void setTaskName(String taskName) {
			this.taskName = taskName;
		}

		public String getInterval() {
			return this.interval;
		}

		public void setInterval(String interval) {
			this.interval = interval;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getOptionJson() {
			return this.optionJson;
		}

		public void setOptionJson(String optionJson) {
			this.optionJson = optionJson;
		}

		public List<IspCity> getIspCities() {
			return this.ispCities;
		}

		public void setIspCities(List<IspCity> ispCities) {
			this.ispCities = ispCities;
		}

		public static class IspCity {

			private String cityName;

			private String ispName;

			private String city;

			private String isp;

			public String getCityName() {
				return this.cityName;
			}

			public void setCityName(String cityName) {
				this.cityName = cityName;
			}

			public String getIspName() {
				return this.ispName;
			}

			public void setIspName(String ispName) {
				this.ispName = ispName;
			}

			public String getCity() {
				return this.city;
			}

			public void setCity(String city) {
				this.city = city;
			}

			public String getIsp() {
				return this.isp;
			}

			public void setIsp(String isp) {
				this.isp = isp;
			}
		}
	}

	@Override
	public DescribeSiteMonitorAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeSiteMonitorAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
