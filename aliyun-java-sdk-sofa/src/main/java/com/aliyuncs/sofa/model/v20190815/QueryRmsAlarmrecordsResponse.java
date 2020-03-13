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
import com.aliyuncs.sofa.transform.v20190815.QueryRmsAlarmrecordsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryRmsAlarmrecordsResponse extends AcsResponse {

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

		private List<EntitiesItem> entities;

		private Meta meta;

		public List<EntitiesItem> getEntities() {
			return this.entities;
		}

		public void setEntities(List<EntitiesItem> entities) {
			this.entities = entities;
		}

		public Meta getMeta() {
			return this.meta;
		}

		public void setMeta(Meta meta) {
			this.meta = meta;
		}

		public static class EntitiesItem {

			private Entity entity;

			public Entity getEntity() {
				return this.entity;
			}

			public void setEntity(Entity entity) {
				this.entity = entity;
			}

			public static class Entity {

				private String alarmTime;

				private String appName;

				private Long id;

				private String monitorItemType;

				private Long monitorPort;

				private String monitorTargetType;

				private String notificationState;

				private String resourceName;

				private String triggerState;

				private Long triggerValue;

				private List<NotificationResultVosItem> notificationResultVos;

				public String getAlarmTime() {
					return this.alarmTime;
				}

				public void setAlarmTime(String alarmTime) {
					this.alarmTime = alarmTime;
				}

				public String getAppName() {
					return this.appName;
				}

				public void setAppName(String appName) {
					this.appName = appName;
				}

				public Long getId() {
					return this.id;
				}

				public void setId(Long id) {
					this.id = id;
				}

				public String getMonitorItemType() {
					return this.monitorItemType;
				}

				public void setMonitorItemType(String monitorItemType) {
					this.monitorItemType = monitorItemType;
				}

				public Long getMonitorPort() {
					return this.monitorPort;
				}

				public void setMonitorPort(Long monitorPort) {
					this.monitorPort = monitorPort;
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

				public String getResourceName() {
					return this.resourceName;
				}

				public void setResourceName(String resourceName) {
					this.resourceName = resourceName;
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

				public List<NotificationResultVosItem> getNotificationResultVos() {
					return this.notificationResultVos;
				}

				public void setNotificationResultVos(List<NotificationResultVosItem> notificationResultVos) {
					this.notificationResultVos = notificationResultVos;
				}

				public static class NotificationResultVosItem {

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

		public static class Meta {

			private Page page;

			public Page getPage() {
				return this.page;
			}

			public void setPage(Page page) {
				this.page = page;
			}

			public static class Page {

				private Long limit;

				private Long offset;

				private Long totalSize;

				public Long getLimit() {
					return this.limit;
				}

				public void setLimit(Long limit) {
					this.limit = limit;
				}

				public Long getOffset() {
					return this.offset;
				}

				public void setOffset(Long offset) {
					this.offset = offset;
				}

				public Long getTotalSize() {
					return this.totalSize;
				}

				public void setTotalSize(Long totalSize) {
					this.totalSize = totalSize;
				}
			}
		}
	}

	@Override
	public QueryRmsAlarmrecordsResponse getInstance(UnmarshallerContext context) {
		return	QueryRmsAlarmrecordsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
