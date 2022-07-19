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
import com.aliyuncs.sofa.transform.v20190815.QueryRMSUnifiedAlarmRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryRMSUnifiedAlarmRuleResponse extends AcsResponse {

	private Long currentPage;

	private String requestId;

	private String resultMessage;

	private String resultCode;

	private Long pageSize;

	private Long totalCount;

	private List<AlarmRulesItem> alarmRules;

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

	public List<AlarmRulesItem> getAlarmRules() {
		return this.alarmRules;
	}

	public void setAlarmRules(List<AlarmRulesItem> alarmRules) {
		this.alarmRules = alarmRules;
	}

	public static class AlarmRulesItem {

		private Long status;

		private Long notifyTplId;

		private String channels;

		private Long notifyFiring;

		private String gmtModified;

		private Long notifyEmpty;

		private String creator;

		private String notifyTimeFilter;

		private String modifier;

		private Long notifyRecovered;

		private Long suspendedStartTime;

		private Long deleted;

		private String suspendedReason;

		private Long pendingHit;

		private String name;

		private Long recoveredHit;

		private Long alarmEmpty;

		private Long silenceTime;

		private Long alarmStatus;

		private String emergency;

		private String sourceId;

		private Long suspendedEndTime;

		private Long step;

		private Long workspaceId;

		private String uniqueIdentity;

		private String timeZone;

		private String emergencyUrl;

		private String gmtCreate;

		private String category;

		private Long level;

		private Long id;

		private Long tenantId;

		private String ruleConfig;

		private List<String> conditionsDes;

		public Long getStatus() {
			return this.status;
		}

		public void setStatus(Long status) {
			this.status = status;
		}

		public Long getNotifyTplId() {
			return this.notifyTplId;
		}

		public void setNotifyTplId(Long notifyTplId) {
			this.notifyTplId = notifyTplId;
		}

		public String getChannels() {
			return this.channels;
		}

		public void setChannels(String channels) {
			this.channels = channels;
		}

		public Long getNotifyFiring() {
			return this.notifyFiring;
		}

		public void setNotifyFiring(Long notifyFiring) {
			this.notifyFiring = notifyFiring;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Long getNotifyEmpty() {
			return this.notifyEmpty;
		}

		public void setNotifyEmpty(Long notifyEmpty) {
			this.notifyEmpty = notifyEmpty;
		}

		public String getCreator() {
			return this.creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

		public String getNotifyTimeFilter() {
			return this.notifyTimeFilter;
		}

		public void setNotifyTimeFilter(String notifyTimeFilter) {
			this.notifyTimeFilter = notifyTimeFilter;
		}

		public String getModifier() {
			return this.modifier;
		}

		public void setModifier(String modifier) {
			this.modifier = modifier;
		}

		public Long getNotifyRecovered() {
			return this.notifyRecovered;
		}

		public void setNotifyRecovered(Long notifyRecovered) {
			this.notifyRecovered = notifyRecovered;
		}

		public Long getSuspendedStartTime() {
			return this.suspendedStartTime;
		}

		public void setSuspendedStartTime(Long suspendedStartTime) {
			this.suspendedStartTime = suspendedStartTime;
		}

		public Long getDeleted() {
			return this.deleted;
		}

		public void setDeleted(Long deleted) {
			this.deleted = deleted;
		}

		public String getSuspendedReason() {
			return this.suspendedReason;
		}

		public void setSuspendedReason(String suspendedReason) {
			this.suspendedReason = suspendedReason;
		}

		public Long getPendingHit() {
			return this.pendingHit;
		}

		public void setPendingHit(Long pendingHit) {
			this.pendingHit = pendingHit;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getRecoveredHit() {
			return this.recoveredHit;
		}

		public void setRecoveredHit(Long recoveredHit) {
			this.recoveredHit = recoveredHit;
		}

		public Long getAlarmEmpty() {
			return this.alarmEmpty;
		}

		public void setAlarmEmpty(Long alarmEmpty) {
			this.alarmEmpty = alarmEmpty;
		}

		public Long getSilenceTime() {
			return this.silenceTime;
		}

		public void setSilenceTime(Long silenceTime) {
			this.silenceTime = silenceTime;
		}

		public Long getAlarmStatus() {
			return this.alarmStatus;
		}

		public void setAlarmStatus(Long alarmStatus) {
			this.alarmStatus = alarmStatus;
		}

		public String getEmergency() {
			return this.emergency;
		}

		public void setEmergency(String emergency) {
			this.emergency = emergency;
		}

		public String getSourceId() {
			return this.sourceId;
		}

		public void setSourceId(String sourceId) {
			this.sourceId = sourceId;
		}

		public Long getSuspendedEndTime() {
			return this.suspendedEndTime;
		}

		public void setSuspendedEndTime(Long suspendedEndTime) {
			this.suspendedEndTime = suspendedEndTime;
		}

		public Long getStep() {
			return this.step;
		}

		public void setStep(Long step) {
			this.step = step;
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

		public String getTimeZone() {
			return this.timeZone;
		}

		public void setTimeZone(String timeZone) {
			this.timeZone = timeZone;
		}

		public String getEmergencyUrl() {
			return this.emergencyUrl;
		}

		public void setEmergencyUrl(String emergencyUrl) {
			this.emergencyUrl = emergencyUrl;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public Long getLevel() {
			return this.level;
		}

		public void setLevel(Long level) {
			this.level = level;
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

		public String getRuleConfig() {
			return this.ruleConfig;
		}

		public void setRuleConfig(String ruleConfig) {
			this.ruleConfig = ruleConfig;
		}

		public List<String> getConditionsDes() {
			return this.conditionsDes;
		}

		public void setConditionsDes(List<String> conditionsDes) {
			this.conditionsDes = conditionsDes;
		}
	}

	@Override
	public QueryRMSUnifiedAlarmRuleResponse getInstance(UnmarshallerContext context) {
		return	QueryRMSUnifiedAlarmRuleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
