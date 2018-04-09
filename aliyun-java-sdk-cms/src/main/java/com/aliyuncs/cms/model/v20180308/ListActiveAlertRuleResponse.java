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

package com.aliyuncs.cms.model.v20180308;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cms.transform.v20180308.ListActiveAlertRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListActiveAlertRuleResponse extends AcsResponse {

	private Boolean success;

	private String code;

	private String message;

	private String requestId;

	private List<Alarm> datapoints;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

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

	public List<Alarm> getDatapoints() {
		return this.datapoints;
	}

	public void setDatapoints(List<Alarm> datapoints) {
		this.datapoints = datapoints;
	}

	public static class Alarm {

		private String uuid;

		private String name;

		private String namespace;

		private String metricName;

		private String period;

		private String statistics;

		private String comparisonOperator;

		private String threshold;

		private String evaluationCount;

		private String startTime;

		private String endTime;

		private String silenceTime;

		private String notifyType;

		private String enable;

		private String state;

		private String contactGroups;

		private String webhook;

		private String ruleName;

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
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

		public String getEvaluationCount() {
			return this.evaluationCount;
		}

		public void setEvaluationCount(String evaluationCount) {
			this.evaluationCount = evaluationCount;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getSilenceTime() {
			return this.silenceTime;
		}

		public void setSilenceTime(String silenceTime) {
			this.silenceTime = silenceTime;
		}

		public String getNotifyType() {
			return this.notifyType;
		}

		public void setNotifyType(String notifyType) {
			this.notifyType = notifyType;
		}

		public String getEnable() {
			return this.enable;
		}

		public void setEnable(String enable) {
			this.enable = enable;
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

		public String getWebhook() {
			return this.webhook;
		}

		public void setWebhook(String webhook) {
			this.webhook = webhook;
		}

		public String getRuleName() {
			return this.ruleName;
		}

		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}
	}

	@Override
	public ListActiveAlertRuleResponse getInstance(UnmarshallerContext context) {
		return	ListActiveAlertRuleResponseUnmarshaller.unmarshall(this, context);
	}
}
