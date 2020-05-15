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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.QueryRmsAlertRecordsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryRmsAlertRecordsResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Response response;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Response getResponse() {
		return this.response;
	}

	public void setResponse(Response response) {
		this.response = response;
	}

	public static class Response {

		private Entity entity;

		public Entity getEntity() {
			return this.entity;
		}

		public void setEntity(Entity entity) {
			this.entity = entity;
		}

		public static class Entity {

			private List<DataItem> data;

			public List<DataItem> getData() {
				return this.data;
			}

			public void setData(List<DataItem> data) {
				this.data = data;
			}

			public static class DataItem {

				private Long alertRuleId;

				private String id;

				private String monitorItemType;

				private String monitorOpotionKey;

				private String monitorOptionKey;

				private Long monitorPort;

				private String monitorTargetId;

				private String monitorTargetName;

				private String monitorTargetType;

				private String notificationState;

				private String projectId;

				private String ruleType;

				private String tenantId;

				private String triggerState;

				private Long triggerValue;

				private String triggerValueThreshold;

				private String utcCreated;

				private String utcModified;

				private String workspaceId;

				private List<NotificationResultsItem> notificationResults;

				public Long getAlertRuleId() {
					return this.alertRuleId;
				}

				public void setAlertRuleId(Long alertRuleId) {
					this.alertRuleId = alertRuleId;
				}

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getMonitorItemType() {
					return this.monitorItemType;
				}

				public void setMonitorItemType(String monitorItemType) {
					this.monitorItemType = monitorItemType;
				}

				public String getMonitorOpotionKey() {
					return this.monitorOpotionKey;
				}

				public void setMonitorOpotionKey(String monitorOpotionKey) {
					this.monitorOpotionKey = monitorOpotionKey;
				}

				public String getMonitorOptionKey() {
					return this.monitorOptionKey;
				}

				public void setMonitorOptionKey(String monitorOptionKey) {
					this.monitorOptionKey = monitorOptionKey;
				}

				public Long getMonitorPort() {
					return this.monitorPort;
				}

				public void setMonitorPort(Long monitorPort) {
					this.monitorPort = monitorPort;
				}

				public String getMonitorTargetId() {
					return this.monitorTargetId;
				}

				public void setMonitorTargetId(String monitorTargetId) {
					this.monitorTargetId = monitorTargetId;
				}

				public String getMonitorTargetName() {
					return this.monitorTargetName;
				}

				public void setMonitorTargetName(String monitorTargetName) {
					this.monitorTargetName = monitorTargetName;
				}

				public String getMonitorTargetType() {
					return this.monitorTargetType;
				}

				public void setMonitorTargetType(String monitorTargetType) {
					this.monitorTargetType = monitorTargetType;
				}

				public String getNotificationState() {
					return this.notificationState;
				}

				public void setNotificationState(String notificationState) {
					this.notificationState = notificationState;
				}

				public String getProjectId() {
					return this.projectId;
				}

				public void setProjectId(String projectId) {
					this.projectId = projectId;
				}

				public String getRuleType() {
					return this.ruleType;
				}

				public void setRuleType(String ruleType) {
					this.ruleType = ruleType;
				}

				public String getTenantId() {
					return this.tenantId;
				}

				public void setTenantId(String tenantId) {
					this.tenantId = tenantId;
				}

				public String getTriggerState() {
					return this.triggerState;
				}

				public void setTriggerState(String triggerState) {
					this.triggerState = triggerState;
				}

				public Long getTriggerValue() {
					return this.triggerValue;
				}

				public void setTriggerValue(Long triggerValue) {
					this.triggerValue = triggerValue;
				}

				public String getTriggerValueThreshold() {
					return this.triggerValueThreshold;
				}

				public void setTriggerValueThreshold(String triggerValueThreshold) {
					this.triggerValueThreshold = triggerValueThreshold;
				}

				public String getUtcCreated() {
					return this.utcCreated;
				}

				public void setUtcCreated(String utcCreated) {
					this.utcCreated = utcCreated;
				}

				public String getUtcModified() {
					return this.utcModified;
				}

				public void setUtcModified(String utcModified) {
					this.utcModified = utcModified;
				}

				public String getWorkspaceId() {
					return this.workspaceId;
				}

				public void setWorkspaceId(String workspaceId) {
					this.workspaceId = workspaceId;
				}

				public List<NotificationResultsItem> getNotificationResults() {
					return this.notificationResults;
				}

				public void setNotificationResults(List<NotificationResultsItem> notificationResults) {
					this.notificationResults = notificationResults;
				}

				public static class NotificationResultsItem {

					private String errorMessage;

					private String requestId;

					private Boolean success;

					private String targetLoginName;

					private String type;

					public String getErrorMessage() {
						return this.errorMessage;
					}

					public void setErrorMessage(String errorMessage) {
						this.errorMessage = errorMessage;
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

					public String getTargetLoginName() {
						return this.targetLoginName;
					}

					public void setTargetLoginName(String targetLoginName) {
						this.targetLoginName = targetLoginName;
					}

					public String getType() {
						return this.type;
					}

					public void setType(String type) {
						this.type = type;
					}
				}
			}
		}
	}

	@Override
	public QueryRmsAlertRecordsResponse getInstance(UnmarshallerContext context) {
		return	QueryRmsAlertRecordsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
