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
import com.aliyuncs.dataphin_public.transform.v20230630.ListAlertNotificationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAlertNotificationsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private ListResult listResult;

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

	public ListResult getListResult() {
		return this.listResult;
	}

	public void setListResult(ListResult listResult) {
		this.listResult = listResult;
	}

	public static class ListResult {

		private Integer totalCount;

		private List<AlertNotificationInfo> data;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<AlertNotificationInfo> getData() {
			return this.data;
		}

		public void setData(List<AlertNotificationInfo> data) {
			this.data = data;
		}

		public static class AlertNotificationInfo {

			private String alertEventId;

			private AlertObject alertObject;

			private AlertReason alertReason;

			private AlertReceiver alertReceiver;

			private AlertSend alertSend;

			public String getAlertEventId() {
				return this.alertEventId;
			}

			public void setAlertEventId(String alertEventId) {
				this.alertEventId = alertEventId;
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

			public AlertReceiver getAlertReceiver() {
				return this.alertReceiver;
			}

			public void setAlertReceiver(AlertReceiver alertReceiver) {
				this.alertReceiver = alertReceiver;
			}

			public AlertSend getAlertSend() {
				return this.alertSend;
			}

			public void setAlertSend(AlertSend alertSend) {
				this.alertSend = alertSend;
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

			public static class AlertReceiver {

				private String alertChannelType;

				private String customAlertChannelId;

				private String type;

				private String onCallTableId;

				private String onCallTableName;

				private User user;

				public String getAlertChannelType() {
					return this.alertChannelType;
				}

				public void setAlertChannelType(String alertChannelType) {
					this.alertChannelType = alertChannelType;
				}

				public String getCustomAlertChannelId() {
					return this.customAlertChannelId;
				}

				public void setCustomAlertChannelId(String customAlertChannelId) {
					this.customAlertChannelId = customAlertChannelId;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getOnCallTableId() {
					return this.onCallTableId;
				}

				public void setOnCallTableId(String onCallTableId) {
					this.onCallTableId = onCallTableId;
				}

				public String getOnCallTableName() {
					return this.onCallTableName;
				}

				public void setOnCallTableName(String onCallTableName) {
					this.onCallTableName = onCallTableName;
				}

				public User getUser() {
					return this.user;
				}

				public void setUser(User user) {
					this.user = user;
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

			public static class AlertSend {

				private String status;

				private String failReason;

				private String sendTime;

				private String sendContent;

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public String getFailReason() {
					return this.failReason;
				}

				public void setFailReason(String failReason) {
					this.failReason = failReason;
				}

				public String getSendTime() {
					return this.sendTime;
				}

				public void setSendTime(String sendTime) {
					this.sendTime = sendTime;
				}

				public String getSendContent() {
					return this.sendContent;
				}

				public void setSendContent(String sendContent) {
					this.sendContent = sendContent;
				}
			}
		}
	}

	@Override
	public ListAlertNotificationsResponse getInstance(UnmarshallerContext context) {
		return	ListAlertNotificationsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
