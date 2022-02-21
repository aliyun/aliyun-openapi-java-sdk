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
import com.aliyuncs.cms.transform.v20190101.DescribeAlertHistoryListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAlertHistoryListResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private String total;

	private Boolean success;

	private List<AlarmHistory> alarmHistoryList;

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

	public List<AlarmHistory> getAlarmHistoryList() {
		return this.alarmHistoryList;
	}

	public void setAlarmHistoryList(List<AlarmHistory> alarmHistoryList) {
		this.alarmHistoryList = alarmHistoryList;
	}

	public static class AlarmHistory {

		private Integer status;

		private String metricName;

		private Integer evaluationCount;

		private String state;

		private String preLevel;

		private String namespace;

		private String webhooks;

		private String ruleName;

		private String ruleId;

		private Long lastTime;

		private String value;

		private String expression;

		private String groupId;

		private Long alertTime;

		private String instanceName;

		private String dimensions;

		private String level;

		private List<String> contacts;

		private List<String> contactALIIMs;

		private List<String> contactMails;

		private List<String> contactSmses;

		private List<String> contactGroups;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getMetricName() {
			return this.metricName;
		}

		public void setMetricName(String metricName) {
			this.metricName = metricName;
		}

		public Integer getEvaluationCount() {
			return this.evaluationCount;
		}

		public void setEvaluationCount(Integer evaluationCount) {
			this.evaluationCount = evaluationCount;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getPreLevel() {
			return this.preLevel;
		}

		public void setPreLevel(String preLevel) {
			this.preLevel = preLevel;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getWebhooks() {
			return this.webhooks;
		}

		public void setWebhooks(String webhooks) {
			this.webhooks = webhooks;
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

		public Long getLastTime() {
			return this.lastTime;
		}

		public void setLastTime(Long lastTime) {
			this.lastTime = lastTime;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getExpression() {
			return this.expression;
		}

		public void setExpression(String expression) {
			this.expression = expression;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public Long getAlertTime() {
			return this.alertTime;
		}

		public void setAlertTime(Long alertTime) {
			this.alertTime = alertTime;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getDimensions() {
			return this.dimensions;
		}

		public void setDimensions(String dimensions) {
			this.dimensions = dimensions;
		}

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}

		public List<String> getContacts() {
			return this.contacts;
		}

		public void setContacts(List<String> contacts) {
			this.contacts = contacts;
		}

		public List<String> getContactALIIMs() {
			return this.contactALIIMs;
		}

		public void setContactALIIMs(List<String> contactALIIMs) {
			this.contactALIIMs = contactALIIMs;
		}

		public List<String> getContactMails() {
			return this.contactMails;
		}

		public void setContactMails(List<String> contactMails) {
			this.contactMails = contactMails;
		}

		public List<String> getContactSmses() {
			return this.contactSmses;
		}

		public void setContactSmses(List<String> contactSmses) {
			this.contactSmses = contactSmses;
		}

		public List<String> getContactGroups() {
			return this.contactGroups;
		}

		public void setContactGroups(List<String> contactGroups) {
			this.contactGroups = contactGroups;
		}
	}

	@Override
	public DescribeAlertHistoryListResponse getInstance(UnmarshallerContext context) {
		return	DescribeAlertHistoryListResponseUnmarshaller.unmarshall(this, context);
	}
}
