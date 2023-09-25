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
import com.aliyuncs.dataworks_public.transform.v20200518.ListDIAlarmRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDIAlarmRulesResponse extends AcsResponse {

	private String requestId;

	private DIAlarmRulePaging dIAlarmRulePaging;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public DIAlarmRulePaging getDIAlarmRulePaging() {
		return this.dIAlarmRulePaging;
	}

	public void setDIAlarmRulePaging(DIAlarmRulePaging dIAlarmRulePaging) {
		this.dIAlarmRulePaging = dIAlarmRulePaging;
	}

	public static class DIAlarmRulePaging {

		private Long totalCount;

		private Long pageNumber;

		private Long pageSize;

		private List<DIJobAlarmRule> dIJobAlarmRules;

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public Long getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Long pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public List<DIJobAlarmRule> getDIJobAlarmRules() {
			return this.dIJobAlarmRules;
		}

		public void setDIJobAlarmRules(List<DIJobAlarmRule> dIJobAlarmRules) {
			this.dIJobAlarmRules = dIJobAlarmRules;
		}

		public static class DIJobAlarmRule {

			private Long dIAlarmRuleId;

			private Long dIJobId;

			private String description;

			private String metricType;

			private Boolean enabled;

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
	}

	@Override
	public ListDIAlarmRulesResponse getInstance(UnmarshallerContext context) {
		return	ListDIAlarmRulesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
