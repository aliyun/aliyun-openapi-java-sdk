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

package com.aliyuncs.dataworks_public.model.v20200518;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.GetBaselineResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetBaselineResponse extends AcsResponse {

	private Boolean success;

	private String errorCode;

	private String errorMessage;

	private Integer httpStatusCode;

	private String requestId;

	private String dynamicErrorCode;

	private String dynamicErrorMessage;

	private Data data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDynamicErrorCode() {
		return this.dynamicErrorCode;
	}

	public void setDynamicErrorCode(String dynamicErrorCode) {
		this.dynamicErrorCode = dynamicErrorCode;
	}

	public String getDynamicErrorMessage() {
		return this.dynamicErrorMessage;
	}

	public void setDynamicErrorMessage(String dynamicErrorMessage) {
		this.dynamicErrorMessage = dynamicErrorMessage;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long baselineId;

		private String baselineName;

		private Long projectId;

		private String owner;

		private Integer priority;

		private String baselineType;

		private Boolean enabled;

		private Boolean alertEnabled;

		private Integer alertMarginThreshold;

		private List<OverTimeSetting> overTimeSettings;

		private List<AlertSetting> alertSettings;

		private List<Long> taskIds;

		public Long getBaselineId() {
			return this.baselineId;
		}

		public void setBaselineId(Long baselineId) {
			this.baselineId = baselineId;
		}

		public String getBaselineName() {
			return this.baselineName;
		}

		public void setBaselineName(String baselineName) {
			this.baselineName = baselineName;
		}

		public Long getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public String getBaselineType() {
			return this.baselineType;
		}

		public void setBaselineType(String baselineType) {
			this.baselineType = baselineType;
		}

		public Boolean getEnabled() {
			return this.enabled;
		}

		public void setEnabled(Boolean enabled) {
			this.enabled = enabled;
		}

		public Boolean getAlertEnabled() {
			return this.alertEnabled;
		}

		public void setAlertEnabled(Boolean alertEnabled) {
			this.alertEnabled = alertEnabled;
		}

		public Integer getAlertMarginThreshold() {
			return this.alertMarginThreshold;
		}

		public void setAlertMarginThreshold(Integer alertMarginThreshold) {
			this.alertMarginThreshold = alertMarginThreshold;
		}

		public List<OverTimeSetting> getOverTimeSettings() {
			return this.overTimeSettings;
		}

		public void setOverTimeSettings(List<OverTimeSetting> overTimeSettings) {
			this.overTimeSettings = overTimeSettings;
		}

		public List<AlertSetting> getAlertSettings() {
			return this.alertSettings;
		}

		public void setAlertSettings(List<AlertSetting> alertSettings) {
			this.alertSettings = alertSettings;
		}

		public List<Long> getTaskIds() {
			return this.taskIds;
		}

		public void setTaskIds(List<Long> taskIds) {
			this.taskIds = taskIds;
		}

		public static class OverTimeSetting {

			private Integer cycle;

			private String time;

			public Integer getCycle() {
				return this.cycle;
			}

			public void setCycle(Integer cycle) {
				this.cycle = cycle;
			}

			public String getTime() {
				return this.time;
			}

			public void setTime(String time) {
				this.time = time;
			}
		}

		public static class AlertSetting {

			private String alertType;

			private String silenceStartTime;

			private String silenceEndTime;

			private Integer alertInterval;

			private Integer alertMaximum;

			private Boolean baselineAlertEnabled;

			private String alertRecipientType;

			private String alertRecipient;

			private List<DingRobot> dingRobots;

			private List<String> alertMethods;

			private List<String> webhooks;

			private List<String> topicTypes;

			public String getAlertType() {
				return this.alertType;
			}

			public void setAlertType(String alertType) {
				this.alertType = alertType;
			}

			public String getSilenceStartTime() {
				return this.silenceStartTime;
			}

			public void setSilenceStartTime(String silenceStartTime) {
				this.silenceStartTime = silenceStartTime;
			}

			public String getSilenceEndTime() {
				return this.silenceEndTime;
			}

			public void setSilenceEndTime(String silenceEndTime) {
				this.silenceEndTime = silenceEndTime;
			}

			public Integer getAlertInterval() {
				return this.alertInterval;
			}

			public void setAlertInterval(Integer alertInterval) {
				this.alertInterval = alertInterval;
			}

			public Integer getAlertMaximum() {
				return this.alertMaximum;
			}

			public void setAlertMaximum(Integer alertMaximum) {
				this.alertMaximum = alertMaximum;
			}

			public Boolean getBaselineAlertEnabled() {
				return this.baselineAlertEnabled;
			}

			public void setBaselineAlertEnabled(Boolean baselineAlertEnabled) {
				this.baselineAlertEnabled = baselineAlertEnabled;
			}

			public String getAlertRecipientType() {
				return this.alertRecipientType;
			}

			public void setAlertRecipientType(String alertRecipientType) {
				this.alertRecipientType = alertRecipientType;
			}

			public String getAlertRecipient() {
				return this.alertRecipient;
			}

			public void setAlertRecipient(String alertRecipient) {
				this.alertRecipient = alertRecipient;
			}

			public List<DingRobot> getDingRobots() {
				return this.dingRobots;
			}

			public void setDingRobots(List<DingRobot> dingRobots) {
				this.dingRobots = dingRobots;
			}

			public List<String> getAlertMethods() {
				return this.alertMethods;
			}

			public void setAlertMethods(List<String> alertMethods) {
				this.alertMethods = alertMethods;
			}

			public List<String> getWebhooks() {
				return this.webhooks;
			}

			public void setWebhooks(List<String> webhooks) {
				this.webhooks = webhooks;
			}

			public List<String> getTopicTypes() {
				return this.topicTypes;
			}

			public void setTopicTypes(List<String> topicTypes) {
				this.topicTypes = topicTypes;
			}

			public static class DingRobot {

				private String webUrl;

				private Boolean atAll;

				public String getWebUrl() {
					return this.webUrl;
				}

				public void setWebUrl(String webUrl) {
					this.webUrl = webUrl;
				}

				public Boolean getAtAll() {
					return this.atAll;
				}

				public void setAtAll(Boolean atAll) {
					this.atAll = atAll;
				}
			}
		}
	}

	@Override
	public GetBaselineResponse getInstance(UnmarshallerContext context) {
		return	GetBaselineResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
