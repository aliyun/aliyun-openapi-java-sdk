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

package com.aliyuncs.arms.model.v20190808;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.ListActivatedAlertsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListActivatedAlertsResponse extends AcsResponse {

	private String requestId;

	private Page page;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Page getPage() {
		return this.page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public static class Page {

		private Integer pageSize;

		private Integer total;

		private Integer page;

		private List<Alert> alerts;

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public Integer getPage() {
			return this.page;
		}

		public void setPage(Integer page) {
			this.page = page;
		}

		public List<Alert> getAlerts() {
			return this.alerts;
		}

		public void setAlerts(List<Alert> alerts) {
			this.alerts = alerts;
		}

		public static class Alert {

			private String status;

			private String severity;

			private String integrationName;

			private Long createTime;

			private String message;

			private String alertType;

			private String involvedObjectName;

			private String alertName;

			private Integer count;

			private Map<Object,Object> expandFields;

			private Long endsAt;

			private String involvedObjectKind;

			private String integrationType;

			private Long startsAt;

			private String alertId;

			private List<DispatchRule> dispatchRules;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getSeverity() {
				return this.severity;
			}

			public void setSeverity(String severity) {
				this.severity = severity;
			}

			public String getIntegrationName() {
				return this.integrationName;
			}

			public void setIntegrationName(String integrationName) {
				this.integrationName = integrationName;
			}

			public Long getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(Long createTime) {
				this.createTime = createTime;
			}

			public String getMessage() {
				return this.message;
			}

			public void setMessage(String message) {
				this.message = message;
			}

			public String getAlertType() {
				return this.alertType;
			}

			public void setAlertType(String alertType) {
				this.alertType = alertType;
			}

			public String getInvolvedObjectName() {
				return this.involvedObjectName;
			}

			public void setInvolvedObjectName(String involvedObjectName) {
				this.involvedObjectName = involvedObjectName;
			}

			public String getAlertName() {
				return this.alertName;
			}

			public void setAlertName(String alertName) {
				this.alertName = alertName;
			}

			public Integer getCount() {
				return this.count;
			}

			public void setCount(Integer count) {
				this.count = count;
			}

			public Map<Object,Object> getExpandFields() {
				return this.expandFields;
			}

			public void setExpandFields(Map<Object,Object> expandFields) {
				this.expandFields = expandFields;
			}

			public Long getEndsAt() {
				return this.endsAt;
			}

			public void setEndsAt(Long endsAt) {
				this.endsAt = endsAt;
			}

			public String getInvolvedObjectKind() {
				return this.involvedObjectKind;
			}

			public void setInvolvedObjectKind(String involvedObjectKind) {
				this.involvedObjectKind = involvedObjectKind;
			}

			public String getIntegrationType() {
				return this.integrationType;
			}

			public void setIntegrationType(String integrationType) {
				this.integrationType = integrationType;
			}

			public Long getStartsAt() {
				return this.startsAt;
			}

			public void setStartsAt(Long startsAt) {
				this.startsAt = startsAt;
			}

			public String getAlertId() {
				return this.alertId;
			}

			public void setAlertId(String alertId) {
				this.alertId = alertId;
			}

			public List<DispatchRule> getDispatchRules() {
				return this.dispatchRules;
			}

			public void setDispatchRules(List<DispatchRule> dispatchRules) {
				this.dispatchRules = dispatchRules;
			}

			public static class DispatchRule {

				private Integer ruleId;

				private String ruleName;

				public Integer getRuleId() {
					return this.ruleId;
				}

				public void setRuleId(Integer ruleId) {
					this.ruleId = ruleId;
				}

				public String getRuleName() {
					return this.ruleName;
				}

				public void setRuleName(String ruleName) {
					this.ruleName = ruleName;
				}
			}
		}
	}

	@Override
	public ListActivatedAlertsResponse getInstance(UnmarshallerContext context) {
		return	ListActivatedAlertsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
