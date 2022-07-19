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
import com.aliyuncs.sofa.transform.v20190815.QueryRMSUnifiedAlarmNotifyHistoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryRMSUnifiedAlarmNotifyHistoryResponse extends AcsResponse {

	private Long currentPage;

	private String requestId;

	private String resultMessage;

	private String resultCode;

	private Long pageSize;

	private Long totalCount;

	private List<AlarmNotifyHistoriesItem> alarmNotifyHistories;

	private List<AlarmNotifySubsItem> alarmNotifySubs;

	public Long getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<AlarmNotifyHistoriesItem> getAlarmNotifyHistories() {
		return this.alarmNotifyHistories;
	}

	public void setAlarmNotifyHistories(List<AlarmNotifyHistoriesItem> alarmNotifyHistories) {
		this.alarmNotifyHistories = alarmNotifyHistories;
	}

	public List<AlarmNotifySubsItem> getAlarmNotifySubs() {
		return this.alarmNotifySubs;
	}

	public void setAlarmNotifySubs(List<AlarmNotifySubsItem> alarmNotifySubs) {
		this.alarmNotifySubs = alarmNotifySubs;
	}

	public static class AlarmNotifyHistoriesItem {

		private Long alarmSilenceTime;

		private Long status;

		private String errorMessage;

		private String alarmType;

		private String gmtModified;

		private String notifyContent;

		private Long alarmRuleId;

		private String subscriber;

		private String channel;

		private Boolean alarmTargetDeleted;

		private Long alarmLevel;

		private String alarmEventId;

		private String alarmRuleName;

		private String subscriberType;

		private Long alarmStatus;

		private String dataSourceName;

		private Long workspaceId;

		private String subscriberSource;

		private Long alarmTime;

		private Long aggCount;

		private Long alarmHistoryId;

		private String gmtCreate;

		private String alarmUrl;

		private String alarmUrlWithDomain;

		private String traceId;

		private Long id;

		private Long tenantId;

		private String subscriberName;

		public Long getAlarmSilenceTime() {
			return this.alarmSilenceTime;
		}

		public void setAlarmSilenceTime(Long alarmSilenceTime) {
			this.alarmSilenceTime = alarmSilenceTime;
		}

		public Long getStatus() {
			return this.status;
		}

		public void setStatus(Long status) {
			this.status = status;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public String getAlarmType() {
			return this.alarmType;
		}

		public void setAlarmType(String alarmType) {
			this.alarmType = alarmType;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getNotifyContent() {
			return this.notifyContent;
		}

		public void setNotifyContent(String notifyContent) {
			this.notifyContent = notifyContent;
		}

		public Long getAlarmRuleId() {
			return this.alarmRuleId;
		}

		public void setAlarmRuleId(Long alarmRuleId) {
			this.alarmRuleId = alarmRuleId;
		}

		public String getSubscriber() {
			return this.subscriber;
		}

		public void setSubscriber(String subscriber) {
			this.subscriber = subscriber;
		}

		public String getChannel() {
			return this.channel;
		}

		public void setChannel(String channel) {
			this.channel = channel;
		}

		public Boolean getAlarmTargetDeleted() {
			return this.alarmTargetDeleted;
		}

		public void setAlarmTargetDeleted(Boolean alarmTargetDeleted) {
			this.alarmTargetDeleted = alarmTargetDeleted;
		}

		public Long getAlarmLevel() {
			return this.alarmLevel;
		}

		public void setAlarmLevel(Long alarmLevel) {
			this.alarmLevel = alarmLevel;
		}

		public String getAlarmEventId() {
			return this.alarmEventId;
		}

		public void setAlarmEventId(String alarmEventId) {
			this.alarmEventId = alarmEventId;
		}

		public String getAlarmRuleName() {
			return this.alarmRuleName;
		}

		public void setAlarmRuleName(String alarmRuleName) {
			this.alarmRuleName = alarmRuleName;
		}

		public String getSubscriberType() {
			return this.subscriberType;
		}

		public void setSubscriberType(String subscriberType) {
			this.subscriberType = subscriberType;
		}

		public Long getAlarmStatus() {
			return this.alarmStatus;
		}

		public void setAlarmStatus(Long alarmStatus) {
			this.alarmStatus = alarmStatus;
		}

		public String getDataSourceName() {
			return this.dataSourceName;
		}

		public void setDataSourceName(String dataSourceName) {
			this.dataSourceName = dataSourceName;
		}

		public Long getWorkspaceId() {
			return this.workspaceId;
		}

		public void setWorkspaceId(Long workspaceId) {
			this.workspaceId = workspaceId;
		}

		public String getSubscriberSource() {
			return this.subscriberSource;
		}

		public void setSubscriberSource(String subscriberSource) {
			this.subscriberSource = subscriberSource;
		}

		public Long getAlarmTime() {
			return this.alarmTime;
		}

		public void setAlarmTime(Long alarmTime) {
			this.alarmTime = alarmTime;
		}

		public Long getAggCount() {
			return this.aggCount;
		}

		public void setAggCount(Long aggCount) {
			this.aggCount = aggCount;
		}

		public Long getAlarmHistoryId() {
			return this.alarmHistoryId;
		}

		public void setAlarmHistoryId(Long alarmHistoryId) {
			this.alarmHistoryId = alarmHistoryId;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getAlarmUrl() {
			return this.alarmUrl;
		}

		public void setAlarmUrl(String alarmUrl) {
			this.alarmUrl = alarmUrl;
		}

		public String getAlarmUrlWithDomain() {
			return this.alarmUrlWithDomain;
		}

		public void setAlarmUrlWithDomain(String alarmUrlWithDomain) {
			this.alarmUrlWithDomain = alarmUrlWithDomain;
		}

		public String getTraceId() {
			return this.traceId;
		}

		public void setTraceId(String traceId) {
			this.traceId = traceId;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(Long tenantId) {
			this.tenantId = tenantId;
		}

		public String getSubscriberName() {
			return this.subscriberName;
		}

		public void setSubscriberName(String subscriberName) {
			this.subscriberName = subscriberName;
		}
	}

	public static class AlarmNotifySubsItem {

		private String subscriber;

		private String subscriberSource;

		private String subscriberType;

		private String subscriberName;

		public String getSubscriber() {
			return this.subscriber;
		}

		public void setSubscriber(String subscriber) {
			this.subscriber = subscriber;
		}

		public String getSubscriberSource() {
			return this.subscriberSource;
		}

		public void setSubscriberSource(String subscriberSource) {
			this.subscriberSource = subscriberSource;
		}

		public String getSubscriberType() {
			return this.subscriberType;
		}

		public void setSubscriberType(String subscriberType) {
			this.subscriberType = subscriberType;
		}

		public String getSubscriberName() {
			return this.subscriberName;
		}

		public void setSubscriberName(String subscriberName) {
			this.subscriberName = subscriberName;
		}
	}

	@Override
	public QueryRMSUnifiedAlarmNotifyHistoryResponse getInstance(UnmarshallerContext context) {
		return	QueryRMSUnifiedAlarmNotifyHistoryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
