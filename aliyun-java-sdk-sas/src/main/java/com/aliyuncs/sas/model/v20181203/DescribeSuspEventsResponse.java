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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeSuspEventsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSuspEventsResponse extends AcsResponse {

	private Integer currentPage;

	private Integer pageSize;

	private String requestId;

	private Integer totalCount;

	private Integer count;

	private List<WarningSummary> suspEvents;

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<WarningSummary> getSuspEvents() {
		return this.suspEvents;
	}

	public void setSuspEvents(List<WarningSummary> suspEvents) {
		this.suspEvents = suspEvents;
	}

	public static class WarningSummary {

		private String stages;

		private String internetIp;

		private String k8sClusterName;

		private String containerImageId;

		private Long lastTimeStamp;

		private String occurrenceTime;

		private String alarmUniqueInfo;

		private String desc;

		private Boolean canCancelFault;

		private String alarmEventNameDisplay;

		private String appName;

		private String securityEventIds;

		private String k8sClusterId;

		private String containerImageName;

		private String markMisRules;

		private Boolean canBeDealOnLine;

		private Boolean containHwMode;

		private String k8sNodeId;

		private String instanceName;

		private Integer eventStatus;

		private String saleVersion;

		private String operateErrorCode;

		private String name;

		private Boolean hasTraceInfo;

		private String dataSource;

		private Long operateTime;

		private String eventSubType;

		private Boolean advanced;

		private Long occurrenceTimeStamp;

		private String instanceId;

		private String alarmEventTypeDisplay;

		private String intranetIp;

		private String lastTime;

		private String operateMsg;

		private String uuid;

		private String k8sPodName;

		private String containerId;

		private String alarmEventType;

		private String k8sNamespace;

		private Boolean autoBreaking;

		private String k8sNodeName;

		private String alarmEventName;

		private String uniqueInfo;

		private String maliciousRuleStatus;

		private String level;

		private Long id;

		private List<TacticItem> tacticItems;

		private List<QuaraFile> details;

		private List<EventNote> eventNotes;

		public String getStages() {
			return this.stages;
		}

		public void setStages(String stages) {
			this.stages = stages;
		}

		public String getInternetIp() {
			return this.internetIp;
		}

		public void setInternetIp(String internetIp) {
			this.internetIp = internetIp;
		}

		public String getK8sClusterName() {
			return this.k8sClusterName;
		}

		public void setK8sClusterName(String k8sClusterName) {
			this.k8sClusterName = k8sClusterName;
		}

		public String getContainerImageId() {
			return this.containerImageId;
		}

		public void setContainerImageId(String containerImageId) {
			this.containerImageId = containerImageId;
		}

		public Long getLastTimeStamp() {
			return this.lastTimeStamp;
		}

		public void setLastTimeStamp(Long lastTimeStamp) {
			this.lastTimeStamp = lastTimeStamp;
		}

		public String getOccurrenceTime() {
			return this.occurrenceTime;
		}

		public void setOccurrenceTime(String occurrenceTime) {
			this.occurrenceTime = occurrenceTime;
		}

		public String getAlarmUniqueInfo() {
			return this.alarmUniqueInfo;
		}

		public void setAlarmUniqueInfo(String alarmUniqueInfo) {
			this.alarmUniqueInfo = alarmUniqueInfo;
		}

		public String getDesc() {
			return this.desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public Boolean getCanCancelFault() {
			return this.canCancelFault;
		}

		public void setCanCancelFault(Boolean canCancelFault) {
			this.canCancelFault = canCancelFault;
		}

		public String getAlarmEventNameDisplay() {
			return this.alarmEventNameDisplay;
		}

		public void setAlarmEventNameDisplay(String alarmEventNameDisplay) {
			this.alarmEventNameDisplay = alarmEventNameDisplay;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getSecurityEventIds() {
			return this.securityEventIds;
		}

		public void setSecurityEventIds(String securityEventIds) {
			this.securityEventIds = securityEventIds;
		}

		public String getK8sClusterId() {
			return this.k8sClusterId;
		}

		public void setK8sClusterId(String k8sClusterId) {
			this.k8sClusterId = k8sClusterId;
		}

		public String getContainerImageName() {
			return this.containerImageName;
		}

		public void setContainerImageName(String containerImageName) {
			this.containerImageName = containerImageName;
		}

		public String getMarkMisRules() {
			return this.markMisRules;
		}

		public void setMarkMisRules(String markMisRules) {
			this.markMisRules = markMisRules;
		}

		public Boolean getCanBeDealOnLine() {
			return this.canBeDealOnLine;
		}

		public void setCanBeDealOnLine(Boolean canBeDealOnLine) {
			this.canBeDealOnLine = canBeDealOnLine;
		}

		public Boolean getContainHwMode() {
			return this.containHwMode;
		}

		public void setContainHwMode(Boolean containHwMode) {
			this.containHwMode = containHwMode;
		}

		public String getK8sNodeId() {
			return this.k8sNodeId;
		}

		public void setK8sNodeId(String k8sNodeId) {
			this.k8sNodeId = k8sNodeId;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public Integer getEventStatus() {
			return this.eventStatus;
		}

		public void setEventStatus(Integer eventStatus) {
			this.eventStatus = eventStatus;
		}

		public String getSaleVersion() {
			return this.saleVersion;
		}

		public void setSaleVersion(String saleVersion) {
			this.saleVersion = saleVersion;
		}

		public String getOperateErrorCode() {
			return this.operateErrorCode;
		}

		public void setOperateErrorCode(String operateErrorCode) {
			this.operateErrorCode = operateErrorCode;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Boolean getHasTraceInfo() {
			return this.hasTraceInfo;
		}

		public void setHasTraceInfo(Boolean hasTraceInfo) {
			this.hasTraceInfo = hasTraceInfo;
		}

		public String getDataSource() {
			return this.dataSource;
		}

		public void setDataSource(String dataSource) {
			this.dataSource = dataSource;
		}

		public Long getOperateTime() {
			return this.operateTime;
		}

		public void setOperateTime(Long operateTime) {
			this.operateTime = operateTime;
		}

		public String getEventSubType() {
			return this.eventSubType;
		}

		public void setEventSubType(String eventSubType) {
			this.eventSubType = eventSubType;
		}

		public Boolean getAdvanced() {
			return this.advanced;
		}

		public void setAdvanced(Boolean advanced) {
			this.advanced = advanced;
		}

		public Long getOccurrenceTimeStamp() {
			return this.occurrenceTimeStamp;
		}

		public void setOccurrenceTimeStamp(Long occurrenceTimeStamp) {
			this.occurrenceTimeStamp = occurrenceTimeStamp;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getAlarmEventTypeDisplay() {
			return this.alarmEventTypeDisplay;
		}

		public void setAlarmEventTypeDisplay(String alarmEventTypeDisplay) {
			this.alarmEventTypeDisplay = alarmEventTypeDisplay;
		}

		public String getIntranetIp() {
			return this.intranetIp;
		}

		public void setIntranetIp(String intranetIp) {
			this.intranetIp = intranetIp;
		}

		public String getLastTime() {
			return this.lastTime;
		}

		public void setLastTime(String lastTime) {
			this.lastTime = lastTime;
		}

		public String getOperateMsg() {
			return this.operateMsg;
		}

		public void setOperateMsg(String operateMsg) {
			this.operateMsg = operateMsg;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public String getK8sPodName() {
			return this.k8sPodName;
		}

		public void setK8sPodName(String k8sPodName) {
			this.k8sPodName = k8sPodName;
		}

		public String getContainerId() {
			return this.containerId;
		}

		public void setContainerId(String containerId) {
			this.containerId = containerId;
		}

		public String getAlarmEventType() {
			return this.alarmEventType;
		}

		public void setAlarmEventType(String alarmEventType) {
			this.alarmEventType = alarmEventType;
		}

		public String getK8sNamespace() {
			return this.k8sNamespace;
		}

		public void setK8sNamespace(String k8sNamespace) {
			this.k8sNamespace = k8sNamespace;
		}

		public Boolean getAutoBreaking() {
			return this.autoBreaking;
		}

		public void setAutoBreaking(Boolean autoBreaking) {
			this.autoBreaking = autoBreaking;
		}

		public String getK8sNodeName() {
			return this.k8sNodeName;
		}

		public void setK8sNodeName(String k8sNodeName) {
			this.k8sNodeName = k8sNodeName;
		}

		public String getAlarmEventName() {
			return this.alarmEventName;
		}

		public void setAlarmEventName(String alarmEventName) {
			this.alarmEventName = alarmEventName;
		}

		public String getUniqueInfo() {
			return this.uniqueInfo;
		}

		public void setUniqueInfo(String uniqueInfo) {
			this.uniqueInfo = uniqueInfo;
		}

		public String getMaliciousRuleStatus() {
			return this.maliciousRuleStatus;
		}

		public void setMaliciousRuleStatus(String maliciousRuleStatus) {
			this.maliciousRuleStatus = maliciousRuleStatus;
		}

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public List<TacticItem> getTacticItems() {
			return this.tacticItems;
		}

		public void setTacticItems(List<TacticItem> tacticItems) {
			this.tacticItems = tacticItems;
		}

		public List<QuaraFile> getDetails() {
			return this.details;
		}

		public void setDetails(List<QuaraFile> details) {
			this.details = details;
		}

		public List<EventNote> getEventNotes() {
			return this.eventNotes;
		}

		public void setEventNotes(List<EventNote> eventNotes) {
			this.eventNotes = eventNotes;
		}

		public static class TacticItem {

			private String tacticId;

			private String tacticDisplayName;

			public String getTacticId() {
				return this.tacticId;
			}

			public void setTacticId(String tacticId) {
				this.tacticId = tacticId;
			}

			public String getTacticDisplayName() {
				return this.tacticDisplayName;
			}

			public void setTacticDisplayName(String tacticDisplayName) {
				this.tacticDisplayName = tacticDisplayName;
			}
		}

		public static class QuaraFile {

			private String type;

			private String value;

			private String name;

			private String nameDisplay;

			private String infoType;

			private String valueDisplay;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getNameDisplay() {
				return this.nameDisplay;
			}

			public void setNameDisplay(String nameDisplay) {
				this.nameDisplay = nameDisplay;
			}

			public String getInfoType() {
				return this.infoType;
			}

			public void setInfoType(String infoType) {
				this.infoType = infoType;
			}

			public String getValueDisplay() {
				return this.valueDisplay;
			}

			public void setValueDisplay(String valueDisplay) {
				this.valueDisplay = valueDisplay;
			}
		}

		public static class EventNote {

			private String note;

			private Long noteId;

			private String noteTime;

			public String getNote() {
				return this.note;
			}

			public void setNote(String note) {
				this.note = note;
			}

			public Long getNoteId() {
				return this.noteId;
			}

			public void setNoteId(Long noteId) {
				this.noteId = noteId;
			}

			public String getNoteTime() {
				return this.noteTime;
			}

			public void setNoteTime(String noteTime) {
				this.noteTime = noteTime;
			}
		}
	}

	@Override
	public DescribeSuspEventsResponse getInstance(UnmarshallerContext context) {
		return	DescribeSuspEventsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
