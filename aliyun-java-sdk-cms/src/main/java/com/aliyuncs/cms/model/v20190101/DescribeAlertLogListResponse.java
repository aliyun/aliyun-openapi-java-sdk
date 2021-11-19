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
import com.aliyuncs.cms.transform.v20190101.DescribeAlertLogListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAlertLogListResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer pageNumber;

	private Integer pageSize;

	private List<Alarm> alertLogList;

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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<Alarm> getAlertLogList() {
		return this.alertLogList;
	}

	public void setAlertLogList(List<Alarm> alertLogList) {
		this.alertLogList = alertLogList;
	}

	public static class Alarm {

		private String metricName;

		private String eventName;

		private String product;

		private String blackListUUID;

		private String message;

		private String namespace;

		private String levelChange;

		private String instanceId;

		private String ruleName;

		private String ruleId;

		private String blackListName;

		private String groupName;

		private String groupId;

		private String alertTime;

		private String instanceName;

		private String blackListDetail;

		private String level;

		private String sendStatus;

		private List<ExtInfo> extendedInfo;

		private List<DimensionsItem> dimensions;

		private List<WebhookListItem> webhookList;

		private List<SendResult> sendResultList;

		private List<String> dingdingWebhookList;

		private List<String> contactOnCallList;

		private List<String> contactMailList;

		private List<String> contactGroups;

		private List<String> contactALIIWWList;

		private List<String> contactSMSList;

		private List<String> contactDingList;

		private SendDetail sendDetail;

		private Escalation escalation;

		public String getMetricName() {
			return this.metricName;
		}

		public void setMetricName(String metricName) {
			this.metricName = metricName;
		}

		public String getEventName() {
			return this.eventName;
		}

		public void setEventName(String eventName) {
			this.eventName = eventName;
		}

		public String getProduct() {
			return this.product;
		}

		public void setProduct(String product) {
			this.product = product;
		}

		public String getBlackListUUID() {
			return this.blackListUUID;
		}

		public void setBlackListUUID(String blackListUUID) {
			this.blackListUUID = blackListUUID;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getLevelChange() {
			return this.levelChange;
		}

		public void setLevelChange(String levelChange) {
			this.levelChange = levelChange;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
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

		public String getBlackListName() {
			return this.blackListName;
		}

		public void setBlackListName(String blackListName) {
			this.blackListName = blackListName;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getAlertTime() {
			return this.alertTime;
		}

		public void setAlertTime(String alertTime) {
			this.alertTime = alertTime;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getBlackListDetail() {
			return this.blackListDetail;
		}

		public void setBlackListDetail(String blackListDetail) {
			this.blackListDetail = blackListDetail;
		}

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}

		public String getSendStatus() {
			return this.sendStatus;
		}

		public void setSendStatus(String sendStatus) {
			this.sendStatus = sendStatus;
		}

		public List<ExtInfo> getExtendedInfo() {
			return this.extendedInfo;
		}

		public void setExtendedInfo(List<ExtInfo> extendedInfo) {
			this.extendedInfo = extendedInfo;
		}

		public List<DimensionsItem> getDimensions() {
			return this.dimensions;
		}

		public void setDimensions(List<DimensionsItem> dimensions) {
			this.dimensions = dimensions;
		}

		public List<WebhookListItem> getWebhookList() {
			return this.webhookList;
		}

		public void setWebhookList(List<WebhookListItem> webhookList) {
			this.webhookList = webhookList;
		}

		public List<SendResult> getSendResultList() {
			return this.sendResultList;
		}

		public void setSendResultList(List<SendResult> sendResultList) {
			this.sendResultList = sendResultList;
		}

		public List<String> getDingdingWebhookList() {
			return this.dingdingWebhookList;
		}

		public void setDingdingWebhookList(List<String> dingdingWebhookList) {
			this.dingdingWebhookList = dingdingWebhookList;
		}

		public List<String> getContactOnCallList() {
			return this.contactOnCallList;
		}

		public void setContactOnCallList(List<String> contactOnCallList) {
			this.contactOnCallList = contactOnCallList;
		}

		public List<String> getContactMailList() {
			return this.contactMailList;
		}

		public void setContactMailList(List<String> contactMailList) {
			this.contactMailList = contactMailList;
		}

		public List<String> getContactGroups() {
			return this.contactGroups;
		}

		public void setContactGroups(List<String> contactGroups) {
			this.contactGroups = contactGroups;
		}

		public List<String> getContactALIIWWList() {
			return this.contactALIIWWList;
		}

		public void setContactALIIWWList(List<String> contactALIIWWList) {
			this.contactALIIWWList = contactALIIWWList;
		}

		public List<String> getContactSMSList() {
			return this.contactSMSList;
		}

		public void setContactSMSList(List<String> contactSMSList) {
			this.contactSMSList = contactSMSList;
		}

		public List<String> getContactDingList() {
			return this.contactDingList;
		}

		public void setContactDingList(List<String> contactDingList) {
			this.contactDingList = contactDingList;
		}

		public SendDetail getSendDetail() {
			return this.sendDetail;
		}

		public void setSendDetail(SendDetail sendDetail) {
			this.sendDetail = sendDetail;
		}

		public Escalation getEscalation() {
			return this.escalation;
		}

		public void setEscalation(Escalation escalation) {
			this.escalation = escalation;
		}

		public static class ExtInfo {

			private String name;

			private String value;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}

		public static class DimensionsItem {

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

		public static class WebhookListItem {

			private String code;

			private String url;

			private String message;

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}

			public String getUrl() {
				return this.url;
			}

			public void setUrl(String url) {
				this.url = url;
			}

			public String getMessage() {
				return this.message;
			}

			public void setMessage(String message) {
				this.message = message;
			}
		}

		public static class SendResult {

			private String key;

			private List<String> value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public List<String> getValue() {
				return this.value;
			}

			public void setValue(List<String> value) {
				this.value = value;
			}
		}

		public static class SendDetail {

			private String resultCode;

			private List<ChannelResult> channelResultList;

			public String getResultCode() {
				return this.resultCode;
			}

			public void setResultCode(String resultCode) {
				this.resultCode = resultCode;
			}

			public List<ChannelResult> getChannelResultList() {
				return this.channelResultList;
			}

			public void setChannelResultList(List<ChannelResult> channelResultList) {
				this.channelResultList = channelResultList;
			}

			public static class ChannelResult {

				private String channel;

				private List<Result> resultList;

				public String getChannel() {
					return this.channel;
				}

				public void setChannel(String channel) {
					this.channel = channel;
				}

				public List<Result> getResultList() {
					return this.resultList;
				}

				public void setResultList(List<Result> resultList) {
					this.resultList = resultList;
				}

				public static class Result {

					private String code;

					private String requestId;

					private Boolean success;

					private String detail;

					private List<String> notifyTargetList;

					public String getCode() {
						return this.code;
					}

					public void setCode(String code) {
						this.code = code;
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

					public String getDetail() {
						return this.detail;
					}

					public void setDetail(String detail) {
						this.detail = detail;
					}

					public List<String> getNotifyTargetList() {
						return this.notifyTargetList;
					}

					public void setNotifyTargetList(List<String> notifyTargetList) {
						this.notifyTargetList = notifyTargetList;
					}
				}
			}
		}

		public static class Escalation {

			private String expression;

			private Integer times;

			private String level;

			public String getExpression() {
				return this.expression;
			}

			public void setExpression(String expression) {
				this.expression = expression;
			}

			public Integer getTimes() {
				return this.times;
			}

			public void setTimes(Integer times) {
				this.times = times;
			}

			public String getLevel() {
				return this.level;
			}

			public void setLevel(String level) {
				this.level = level;
			}
		}
	}

	@Override
	public DescribeAlertLogListResponse getInstance(UnmarshallerContext context) {
		return	DescribeAlertLogListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
