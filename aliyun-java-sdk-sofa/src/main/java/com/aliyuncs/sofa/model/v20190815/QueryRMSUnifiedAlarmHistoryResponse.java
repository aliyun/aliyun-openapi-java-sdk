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
import com.aliyuncs.sofa.transform.v20190815.QueryRMSUnifiedAlarmHistoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryRMSUnifiedAlarmHistoryResponse extends AcsResponse {

	private Long currentPage;

	private String requestId;

	private String resultMessage;

	private String resultCode;

	private Long pageSize;

	private Long totalCount;

	private List<AlarmHistoriesItem> alarmHistories;

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

	public List<AlarmHistoriesItem> getAlarmHistories() {
		return this.alarmHistories;
	}

	public void setAlarmHistories(List<AlarmHistoriesItem> alarmHistories) {
		this.alarmHistories = alarmHistories;
	}

	public static class AlarmHistoriesItem {

		private String alarmTargetType;

		private Long status;

		private String dataSourceName;

		private String alarmType;

		private String gmtModified;

		private String eventId;

		private Long workspaceId;

		private String uniqueIdentity;

		private Long alarmTime;

		private Long alarmRuleId;

		private String gmtCreate;

		private String alarmDetail;

		private String alarmUrl;

		private String alarmContent;

		private String alarmUrlWithDomain;

		private Boolean alarmTargetDeleted;

		private Long alarmLevel;

		private Long id;

		private Long tenantId;

		private String alarmTarget;

		private String alarmRuleName;

		public String getAlarmTargetType() {
			return this.alarmTargetType;
		}

		public void setAlarmTargetType(String alarmTargetType) {
			this.alarmTargetType = alarmTargetType;
		}

		public Long getStatus() {
			return this.status;
		}

		public void setStatus(Long status) {
			this.status = status;
		}

		public String getDataSourceName() {
			return this.dataSourceName;
		}

		public void setDataSourceName(String dataSourceName) {
			this.dataSourceName = dataSourceName;
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

		public String getEventId() {
			return this.eventId;
		}

		public void setEventId(String eventId) {
			this.eventId = eventId;
		}

		public Long getWorkspaceId() {
			return this.workspaceId;
		}

		public void setWorkspaceId(Long workspaceId) {
			this.workspaceId = workspaceId;
		}

		public String getUniqueIdentity() {
			return this.uniqueIdentity;
		}

		public void setUniqueIdentity(String uniqueIdentity) {
			this.uniqueIdentity = uniqueIdentity;
		}

		public Long getAlarmTime() {
			return this.alarmTime;
		}

		public void setAlarmTime(Long alarmTime) {
			this.alarmTime = alarmTime;
		}

		public Long getAlarmRuleId() {
			return this.alarmRuleId;
		}

		public void setAlarmRuleId(Long alarmRuleId) {
			this.alarmRuleId = alarmRuleId;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getAlarmDetail() {
			return this.alarmDetail;
		}

		public void setAlarmDetail(String alarmDetail) {
			this.alarmDetail = alarmDetail;
		}

		public String getAlarmUrl() {
			return this.alarmUrl;
		}

		public void setAlarmUrl(String alarmUrl) {
			this.alarmUrl = alarmUrl;
		}

		public String getAlarmContent() {
			return this.alarmContent;
		}

		public void setAlarmContent(String alarmContent) {
			this.alarmContent = alarmContent;
		}

		public String getAlarmUrlWithDomain() {
			return this.alarmUrlWithDomain;
		}

		public void setAlarmUrlWithDomain(String alarmUrlWithDomain) {
			this.alarmUrlWithDomain = alarmUrlWithDomain;
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

		public String getAlarmTarget() {
			return this.alarmTarget;
		}

		public void setAlarmTarget(String alarmTarget) {
			this.alarmTarget = alarmTarget;
		}

		public String getAlarmRuleName() {
			return this.alarmRuleName;
		}

		public void setAlarmRuleName(String alarmRuleName) {
			this.alarmRuleName = alarmRuleName;
		}
	}

	@Override
	public QueryRMSUnifiedAlarmHistoryResponse getInstance(UnmarshallerContext context) {
		return	QueryRMSUnifiedAlarmHistoryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
