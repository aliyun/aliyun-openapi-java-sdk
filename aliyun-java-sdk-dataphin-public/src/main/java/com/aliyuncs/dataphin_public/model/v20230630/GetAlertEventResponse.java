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

package com.aliyuncs.dataphin_public.model.v20230630;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.GetAlertEventResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAlertEventResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private AlertEventInfo alertEventInfo;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

	public AlertEventInfo getAlertEventInfo() {
		return this.alertEventInfo;
	}

	public void setAlertEventInfo(AlertEventInfo alertEventInfo) {
		this.alertEventInfo = alertEventInfo;
	}

	public static class AlertEventInfo {

		private Long id;

		private String latestAlertTime;

		private String firstAlertTime;

		private String status;

		private String alertFrequency;

		private Long totalAlertTimes;

		private String doNotDisturbEndTime;

		private List<AlertReceiver> alertReceiverList;

		private AlertObject alertObject;

		private AlertReason alertReason;

		private BelongProject belongProject;

		private UrlConfig urlConfig;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getLatestAlertTime() {
			return this.latestAlertTime;
		}

		public void setLatestAlertTime(String latestAlertTime) {
			this.latestAlertTime = latestAlertTime;
		}

		public String getFirstAlertTime() {
			return this.firstAlertTime;
		}

		public void setFirstAlertTime(String firstAlertTime) {
			this.firstAlertTime = firstAlertTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getAlertFrequency() {
			return this.alertFrequency;
		}

		public void setAlertFrequency(String alertFrequency) {
			this.alertFrequency = alertFrequency;
		}

		public Long getTotalAlertTimes() {
			return this.totalAlertTimes;
		}

		public void setTotalAlertTimes(Long totalAlertTimes) {
			this.totalAlertTimes = totalAlertTimes;
		}

		public String getDoNotDisturbEndTime() {
			return this.doNotDisturbEndTime;
		}

		public void setDoNotDisturbEndTime(String doNotDisturbEndTime) {
			this.doNotDisturbEndTime = doNotDisturbEndTime;
		}

		public List<AlertReceiver> getAlertReceiverList() {
			return this.alertReceiverList;
		}

		public void setAlertReceiverList(List<AlertReceiver> alertReceiverList) {
			this.alertReceiverList = alertReceiverList;
		}

		public AlertObject getAlertObject() {
			return this.alertObject;
		}

		public void setAlertObject(AlertObject alertObject) {
			this.alertObject = alertObject;
		}

		public AlertReason getAlertReason() {
			return this.alertReason;
		}

		public void setAlertReason(AlertReason alertReason) {
			this.alertReason = alertReason;
		}

		public BelongProject getBelongProject() {
			return this.belongProject;
		}

		public void setBelongProject(BelongProject belongProject) {
			this.belongProject = belongProject;
		}

		public UrlConfig getUrlConfig() {
			return this.urlConfig;
		}

		public void setUrlConfig(UrlConfig urlConfig) {
			this.urlConfig = urlConfig;
		}

		public static class AlertReceiver {

			private String type;

			private String onCallTableName;

			private List<User> userList;

			private List<String> alertChannelTypeList;

			private List<String> customAlertChannelIdList;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getOnCallTableName() {
				return this.onCallTableName;
			}

			public void setOnCallTableName(String onCallTableName) {
				this.onCallTableName = onCallTableName;
			}

			public List<User> getUserList() {
				return this.userList;
			}

			public void setUserList(List<User> userList) {
				this.userList = userList;
			}

			public List<String> getAlertChannelTypeList() {
				return this.alertChannelTypeList;
			}

			public void setAlertChannelTypeList(List<String> alertChannelTypeList) {
				this.alertChannelTypeList = alertChannelTypeList;
			}

			public List<String> getCustomAlertChannelIdList() {
				return this.customAlertChannelIdList;
			}

			public void setCustomAlertChannelIdList(List<String> customAlertChannelIdList) {
				this.customAlertChannelIdList = customAlertChannelIdList;
			}

			public static class User {

				private String name;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}
			}
		}

		public static class AlertObject {

			private String sourceSystemType;

			private String name;

			private String type;

			public String getSourceSystemType() {
				return this.sourceSystemType;
			}

			public void setSourceSystemType(String sourceSystemType) {
				this.sourceSystemType = sourceSystemType;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}
		}

		public static class AlertReason {

			private String type;

			private String bizDate;

			private String uniqueKey;

			private List<AlertReasonParam> alertReasonParamList;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getBizDate() {
				return this.bizDate;
			}

			public void setBizDate(String bizDate) {
				this.bizDate = bizDate;
			}

			public String getUniqueKey() {
				return this.uniqueKey;
			}

			public void setUniqueKey(String uniqueKey) {
				this.uniqueKey = uniqueKey;
			}

			public List<AlertReasonParam> getAlertReasonParamList() {
				return this.alertReasonParamList;
			}

			public void setAlertReasonParamList(List<AlertReasonParam> alertReasonParamList) {
				this.alertReasonParamList = alertReasonParamList;
			}

			public static class AlertReasonParam {

				private String key;

				private String value;

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}
		}

		public static class BelongProject {

			private String projectName;

			private String bizName;

			public String getProjectName() {
				return this.projectName;
			}

			public void setProjectName(String projectName) {
				this.projectName = projectName;
			}

			public String getBizName() {
				return this.bizName;
			}

			public void setBizName(String bizName) {
				this.bizName = bizName;
			}
		}

		public static class UrlConfig {

			private String objectUrl;

			private String logUrl;

			private String alertConfigUrl;

			public String getObjectUrl() {
				return this.objectUrl;
			}

			public void setObjectUrl(String objectUrl) {
				this.objectUrl = objectUrl;
			}

			public String getLogUrl() {
				return this.logUrl;
			}

			public void setLogUrl(String logUrl) {
				this.logUrl = logUrl;
			}

			public String getAlertConfigUrl() {
				return this.alertConfigUrl;
			}

			public void setAlertConfigUrl(String alertConfigUrl) {
				this.alertConfigUrl = alertConfigUrl;
			}
		}
	}

	@Override
	public GetAlertEventResponse getInstance(UnmarshallerContext context) {
		return	GetAlertEventResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
