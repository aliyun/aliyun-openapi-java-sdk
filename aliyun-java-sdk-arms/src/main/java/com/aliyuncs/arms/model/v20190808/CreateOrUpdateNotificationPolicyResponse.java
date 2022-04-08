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
import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.CreateOrUpdateNotificationPolicyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateOrUpdateNotificationPolicyResponse extends AcsResponse {

	private String requestId;

	private NotificationPolicy notificationPolicy;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public NotificationPolicy getNotificationPolicy() {
		return this.notificationPolicy;
	}

	public void setNotificationPolicy(NotificationPolicy notificationPolicy) {
		this.notificationPolicy = notificationPolicy;
	}

	public static class NotificationPolicy {

		private Long id;

		private String name;

		private Boolean sendRecoverMessage;

		private Long escalationPolicyId;

		private Boolean repeat;

		private Long repeatInterval;

		private Long integrationId;

		private List<MatchingRulesItem> matchingRules;

		private GroupRule groupRule;

		private NotifyRule notifyRule;

		private NotifyTemplate notifyTemplate;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Boolean getSendRecoverMessage() {
			return this.sendRecoverMessage;
		}

		public void setSendRecoverMessage(Boolean sendRecoverMessage) {
			this.sendRecoverMessage = sendRecoverMessage;
		}

		public Long getEscalationPolicyId() {
			return this.escalationPolicyId;
		}

		public void setEscalationPolicyId(Long escalationPolicyId) {
			this.escalationPolicyId = escalationPolicyId;
		}

		public Boolean getRepeat() {
			return this.repeat;
		}

		public void setRepeat(Boolean repeat) {
			this.repeat = repeat;
		}

		public Long getRepeatInterval() {
			return this.repeatInterval;
		}

		public void setRepeatInterval(Long repeatInterval) {
			this.repeatInterval = repeatInterval;
		}

		public Long getIntegrationId() {
			return this.integrationId;
		}

		public void setIntegrationId(Long integrationId) {
			this.integrationId = integrationId;
		}

		public List<MatchingRulesItem> getMatchingRules() {
			return this.matchingRules;
		}

		public void setMatchingRules(List<MatchingRulesItem> matchingRules) {
			this.matchingRules = matchingRules;
		}

		public GroupRule getGroupRule() {
			return this.groupRule;
		}

		public void setGroupRule(GroupRule groupRule) {
			this.groupRule = groupRule;
		}

		public NotifyRule getNotifyRule() {
			return this.notifyRule;
		}

		public void setNotifyRule(NotifyRule notifyRule) {
			this.notifyRule = notifyRule;
		}

		public NotifyTemplate getNotifyTemplate() {
			return this.notifyTemplate;
		}

		public void setNotifyTemplate(NotifyTemplate notifyTemplate) {
			this.notifyTemplate = notifyTemplate;
		}

		public static class MatchingRulesItem {

			private List<MatchingConditionsItem> matchingConditions;

			public List<MatchingConditionsItem> getMatchingConditions() {
				return this.matchingConditions;
			}

			public void setMatchingConditions(List<MatchingConditionsItem> matchingConditions) {
				this.matchingConditions = matchingConditions;
			}

			public static class MatchingConditionsItem {

				private String key;

				private String value;

				private String operator;

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

				public String getOperator() {
					return this.operator;
				}

				public void setOperator(String operator) {
					this.operator = operator;
				}
			}
		}

		public static class GroupRule {

			private Long groupWait;

			private Long groupInterval;

			private List<String> groupingFields;

			public Long getGroupWait() {
				return this.groupWait;
			}

			public void setGroupWait(Long groupWait) {
				this.groupWait = groupWait;
			}

			public Long getGroupInterval() {
				return this.groupInterval;
			}

			public void setGroupInterval(Long groupInterval) {
				this.groupInterval = groupInterval;
			}

			public List<String> getGroupingFields() {
				return this.groupingFields;
			}

			public void setGroupingFields(List<String> groupingFields) {
				this.groupingFields = groupingFields;
			}
		}

		public static class NotifyRule {

			private String notifyStartTime;

			private String notifyEndTime;

			private List<NotifyObjectsItem> notifyObjects;

			private List<String> notifyChannels;

			public String getNotifyStartTime() {
				return this.notifyStartTime;
			}

			public void setNotifyStartTime(String notifyStartTime) {
				this.notifyStartTime = notifyStartTime;
			}

			public String getNotifyEndTime() {
				return this.notifyEndTime;
			}

			public void setNotifyEndTime(String notifyEndTime) {
				this.notifyEndTime = notifyEndTime;
			}

			public List<NotifyObjectsItem> getNotifyObjects() {
				return this.notifyObjects;
			}

			public void setNotifyObjects(List<NotifyObjectsItem> notifyObjects) {
				this.notifyObjects = notifyObjects;
			}

			public List<String> getNotifyChannels() {
				return this.notifyChannels;
			}

			public void setNotifyChannels(List<String> notifyChannels) {
				this.notifyChannels = notifyChannels;
			}

			public static class NotifyObjectsItem {

				private String notifyObjectType;

				private Long notifyObjectId;

				private String notifyObjectName;

				public String getNotifyObjectType() {
					return this.notifyObjectType;
				}

				public void setNotifyObjectType(String notifyObjectType) {
					this.notifyObjectType = notifyObjectType;
				}

				public Long getNotifyObjectId() {
					return this.notifyObjectId;
				}

				public void setNotifyObjectId(Long notifyObjectId) {
					this.notifyObjectId = notifyObjectId;
				}

				public String getNotifyObjectName() {
					return this.notifyObjectName;
				}

				public void setNotifyObjectName(String notifyObjectName) {
					this.notifyObjectName = notifyObjectName;
				}
			}
		}

		public static class NotifyTemplate {

			private String emailTitle;

			private String emailContent;

			private String emailRecoverTitle;

			private String emailRecoverContent;

			private String smsContent;

			private String smsRecoverContent;

			private String ttsContent;

			private String ttsRecoverContent;

			private String robotContent;

			public String getEmailTitle() {
				return this.emailTitle;
			}

			public void setEmailTitle(String emailTitle) {
				this.emailTitle = emailTitle;
			}

			public String getEmailContent() {
				return this.emailContent;
			}

			public void setEmailContent(String emailContent) {
				this.emailContent = emailContent;
			}

			public String getEmailRecoverTitle() {
				return this.emailRecoverTitle;
			}

			public void setEmailRecoverTitle(String emailRecoverTitle) {
				this.emailRecoverTitle = emailRecoverTitle;
			}

			public String getEmailRecoverContent() {
				return this.emailRecoverContent;
			}

			public void setEmailRecoverContent(String emailRecoverContent) {
				this.emailRecoverContent = emailRecoverContent;
			}

			public String getSmsContent() {
				return this.smsContent;
			}

			public void setSmsContent(String smsContent) {
				this.smsContent = smsContent;
			}

			public String getSmsRecoverContent() {
				return this.smsRecoverContent;
			}

			public void setSmsRecoverContent(String smsRecoverContent) {
				this.smsRecoverContent = smsRecoverContent;
			}

			public String getTtsContent() {
				return this.ttsContent;
			}

			public void setTtsContent(String ttsContent) {
				this.ttsContent = ttsContent;
			}

			public String getTtsRecoverContent() {
				return this.ttsRecoverContent;
			}

			public void setTtsRecoverContent(String ttsRecoverContent) {
				this.ttsRecoverContent = ttsRecoverContent;
			}

			public String getRobotContent() {
				return this.robotContent;
			}

			public void setRobotContent(String robotContent) {
				this.robotContent = robotContent;
			}
		}
	}

	@Override
	public CreateOrUpdateNotificationPolicyResponse getInstance(UnmarshallerContext context) {
		return	CreateOrUpdateNotificationPolicyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
