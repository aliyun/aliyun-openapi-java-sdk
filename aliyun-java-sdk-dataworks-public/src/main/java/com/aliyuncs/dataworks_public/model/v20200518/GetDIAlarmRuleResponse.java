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
import com.aliyuncs.dataworks_public.transform.v20200518.GetDIAlarmRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDIAlarmRuleResponse extends AcsResponse {

	private String requestId;

	private DIAlarmRule dIAlarmRule;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public DIAlarmRule getDIAlarmRule() {
		return this.dIAlarmRule;
	}

	public void setDIAlarmRule(DIAlarmRule dIAlarmRule) {
		this.dIAlarmRule = dIAlarmRule;
	}

	public static class DIAlarmRule {

		private Long dIAlarmRuleId;

		private Long dIJobId;

		private String description;

		private String metricType;

		private Boolean enabled;

		private String createdUid;

		private Long createdTime;

		private String updatedUid;

		private Long updatedTime;

		private List<TriggerCondition> triggerConditions;

		private NotificationSettings notificationSettings;

		public Long getDIAlarmRuleId() {
			return this.dIAlarmRuleId;
		}

		public void setDIAlarmRuleId(Long dIAlarmRuleId) {
			this.dIAlarmRuleId = dIAlarmRuleId;
		}

		public Long getDIJobId() {
			return this.dIJobId;
		}

		public void setDIJobId(Long dIJobId) {
			this.dIJobId = dIJobId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getMetricType() {
			return this.metricType;
		}

		public void setMetricType(String metricType) {
			this.metricType = metricType;
		}

		public Boolean getEnabled() {
			return this.enabled;
		}

		public void setEnabled(Boolean enabled) {
			this.enabled = enabled;
		}

		public String getCreatedUid() {
			return this.createdUid;
		}

		public void setCreatedUid(String createdUid) {
			this.createdUid = createdUid;
		}

		public Long getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(Long createdTime) {
			this.createdTime = createdTime;
		}

		public String getUpdatedUid() {
			return this.updatedUid;
		}

		public void setUpdatedUid(String updatedUid) {
			this.updatedUid = updatedUid;
		}

		public Long getUpdatedTime() {
			return this.updatedTime;
		}

		public void setUpdatedTime(Long updatedTime) {
			this.updatedTime = updatedTime;
		}

		public List<TriggerCondition> getTriggerConditions() {
			return this.triggerConditions;
		}

		public void setTriggerConditions(List<TriggerCondition> triggerConditions) {
			this.triggerConditions = triggerConditions;
		}

		public NotificationSettings getNotificationSettings() {
			return this.notificationSettings;
		}

		public void setNotificationSettings(NotificationSettings notificationSettings) {
			this.notificationSettings = notificationSettings;
		}

		public static class TriggerCondition {

			private String severity;

			private Long duration;

			private Long threshold;

			public String getSeverity() {
				return this.severity;
			}

			public void setSeverity(String severity) {
				this.severity = severity;
			}

			public Long getDuration() {
				return this.duration;
			}

			public void setDuration(Long duration) {
				this.duration = duration;
			}

			public Long getThreshold() {
				return this.threshold;
			}

			public void setThreshold(Long threshold) {
				this.threshold = threshold;
			}
		}

		public static class NotificationSettings {

			private Integer inhibitionInterval;

			private List<NotificationChannel> notificationChannels;

			private List<NotificationReceiver> notificationReceivers;

			public Integer getInhibitionInterval() {
				return this.inhibitionInterval;
			}

			public void setInhibitionInterval(Integer inhibitionInterval) {
				this.inhibitionInterval = inhibitionInterval;
			}

			public List<NotificationChannel> getNotificationChannels() {
				return this.notificationChannels;
			}

			public void setNotificationChannels(List<NotificationChannel> notificationChannels) {
				this.notificationChannels = notificationChannels;
			}

			public List<NotificationReceiver> getNotificationReceivers() {
				return this.notificationReceivers;
			}

			public void setNotificationReceivers(List<NotificationReceiver> notificationReceivers) {
				this.notificationReceivers = notificationReceivers;
			}

			public static class NotificationChannel {

				private String severity;

				private List<String> channels;

				public String getSeverity() {
					return this.severity;
				}

				public void setSeverity(String severity) {
					this.severity = severity;
				}

				public List<String> getChannels() {
					return this.channels;
				}

				public void setChannels(List<String> channels) {
					this.channels = channels;
				}
			}

			public static class NotificationReceiver {

				private String receiverType;

				private List<String> receiverValues;

				public String getReceiverType() {
					return this.receiverType;
				}

				public void setReceiverType(String receiverType) {
					this.receiverType = receiverType;
				}

				public List<String> getReceiverValues() {
					return this.receiverValues;
				}

				public void setReceiverValues(List<String> receiverValues) {
					this.receiverValues = receiverValues;
				}
			}
		}
	}

	@Override
	public GetDIAlarmRuleResponse getInstance(UnmarshallerContext context) {
		return	GetDIAlarmRuleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
