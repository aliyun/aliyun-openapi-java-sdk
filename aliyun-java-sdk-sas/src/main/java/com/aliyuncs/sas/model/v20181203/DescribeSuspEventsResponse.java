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

	private String requestId;

	private Integer count;

	private Integer pageSize;

	private Integer totalCount;

	private Integer currentPage;

	private List<WarningSummary> suspEvents;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public List<WarningSummary> getSuspEvents() {
		return this.suspEvents;
	}

	public void setSuspEvents(List<WarningSummary> suspEvents) {
		this.suspEvents = suspEvents;
	}

	public static class WarningSummary {

		private String lastTime;

		private Long lastTimeStamp;

		private String occurrenceTime;

		private Long occurrenceTimeStamp;

		private Long id;

		private String securityEventIds;

		private String uniqueInfo;

		private String instanceName;

		private String internetIp;

		private String intranetIp;

		private String uuid;

		private String name;

		private String eventSubType;

		private String level;

		private Integer eventStatus;

		private String desc;

		private String operateMsg;

		private String operateErrorCode;

		private Long operateTime;

		private String dataSource;

		private Boolean canBeDealOnLine;

		private String saleVersion;

		private String alarmEventType;

		private String alarmEventName;

		private String alarmUniqueInfo;

		private Boolean advanced;

		private String markMisRules;

		private String stages;

		private String alarmEventTypeDisplay;

		private String alarmEventNameDisplay;

		private Boolean canCancelFault;

		private Boolean hasTraceInfo;

		private Boolean autoBreaking;

		private Boolean containHwMode;

		private String containerImageId;

		private String containerImageName;

		private String containerId;

		private String k8sNamespace;

		private String k8sClusterId;

		private String k8sNodeId;

		private String k8sPodName;

		private String k8sNodeName;

		private List<QuaraFile> details;

		public String getLastTime() {
			return this.lastTime;
		}

		public void setLastTime(String lastTime) {
			this.lastTime = lastTime;
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

		public Long getOccurrenceTimeStamp() {
			return this.occurrenceTimeStamp;
		}

		public void setOccurrenceTimeStamp(Long occurrenceTimeStamp) {
			this.occurrenceTimeStamp = occurrenceTimeStamp;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getSecurityEventIds() {
			return this.securityEventIds;
		}

		public void setSecurityEventIds(String securityEventIds) {
			this.securityEventIds = securityEventIds;
		}

		public String getUniqueInfo() {
			return this.uniqueInfo;
		}

		public void setUniqueInfo(String uniqueInfo) {
			this.uniqueInfo = uniqueInfo;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getInternetIp() {
			return this.internetIp;
		}

		public void setInternetIp(String internetIp) {
			this.internetIp = internetIp;
		}

		public String getIntranetIp() {
			return this.intranetIp;
		}

		public void setIntranetIp(String intranetIp) {
			this.intranetIp = intranetIp;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEventSubType() {
			return this.eventSubType;
		}

		public void setEventSubType(String eventSubType) {
			this.eventSubType = eventSubType;
		}

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}

		public Integer getEventStatus() {
			return this.eventStatus;
		}

		public void setEventStatus(Integer eventStatus) {
			this.eventStatus = eventStatus;
		}

		public String getDesc() {
			return this.desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public String getOperateMsg() {
			return this.operateMsg;
		}

		public void setOperateMsg(String operateMsg) {
			this.operateMsg = operateMsg;
		}

		public String getOperateErrorCode() {
			return this.operateErrorCode;
		}

		public void setOperateErrorCode(String operateErrorCode) {
			this.operateErrorCode = operateErrorCode;
		}

		public Long getOperateTime() {
			return this.operateTime;
		}

		public void setOperateTime(Long operateTime) {
			this.operateTime = operateTime;
		}

		public String getDataSource() {
			return this.dataSource;
		}

		public void setDataSource(String dataSource) {
			this.dataSource = dataSource;
		}

		public Boolean getCanBeDealOnLine() {
			return this.canBeDealOnLine;
		}

		public void setCanBeDealOnLine(Boolean canBeDealOnLine) {
			this.canBeDealOnLine = canBeDealOnLine;
		}

		public String getSaleVersion() {
			return this.saleVersion;
		}

		public void setSaleVersion(String saleVersion) {
			this.saleVersion = saleVersion;
		}

		public String getAlarmEventType() {
			return this.alarmEventType;
		}

		public void setAlarmEventType(String alarmEventType) {
			this.alarmEventType = alarmEventType;
		}

		public String getAlarmEventName() {
			return this.alarmEventName;
		}

		public void setAlarmEventName(String alarmEventName) {
			this.alarmEventName = alarmEventName;
		}

		public String getAlarmUniqueInfo() {
			return this.alarmUniqueInfo;
		}

		public void setAlarmUniqueInfo(String alarmUniqueInfo) {
			this.alarmUniqueInfo = alarmUniqueInfo;
		}

		public Boolean getAdvanced() {
			return this.advanced;
		}

		public void setAdvanced(Boolean advanced) {
			this.advanced = advanced;
		}

		public String getMarkMisRules() {
			return this.markMisRules;
		}

		public void setMarkMisRules(String markMisRules) {
			this.markMisRules = markMisRules;
		}

		public String getStages() {
			return this.stages;
		}

		public void setStages(String stages) {
			this.stages = stages;
		}

		public String getAlarmEventTypeDisplay() {
			return this.alarmEventTypeDisplay;
		}

		public void setAlarmEventTypeDisplay(String alarmEventTypeDisplay) {
			this.alarmEventTypeDisplay = alarmEventTypeDisplay;
		}

		public String getAlarmEventNameDisplay() {
			return this.alarmEventNameDisplay;
		}

		public void setAlarmEventNameDisplay(String alarmEventNameDisplay) {
			this.alarmEventNameDisplay = alarmEventNameDisplay;
		}

		public Boolean getCanCancelFault() {
			return this.canCancelFault;
		}

		public void setCanCancelFault(Boolean canCancelFault) {
			this.canCancelFault = canCancelFault;
		}

		public Boolean getHasTraceInfo() {
			return this.hasTraceInfo;
		}

		public void setHasTraceInfo(Boolean hasTraceInfo) {
			this.hasTraceInfo = hasTraceInfo;
		}

		public Boolean getAutoBreaking() {
			return this.autoBreaking;
		}

		public void setAutoBreaking(Boolean autoBreaking) {
			this.autoBreaking = autoBreaking;
		}

		public Boolean getContainHwMode() {
			return this.containHwMode;
		}

		public void setContainHwMode(Boolean containHwMode) {
			this.containHwMode = containHwMode;
		}

		public String getContainerImageId() {
			return this.containerImageId;
		}

		public void setContainerImageId(String containerImageId) {
			this.containerImageId = containerImageId;
		}

		public String getContainerImageName() {
			return this.containerImageName;
		}

		public void setContainerImageName(String containerImageName) {
			this.containerImageName = containerImageName;
		}

		public String getContainerId() {
			return this.containerId;
		}

		public void setContainerId(String containerId) {
			this.containerId = containerId;
		}

		public String getK8sNamespace() {
			return this.k8sNamespace;
		}

		public void setK8sNamespace(String k8sNamespace) {
			this.k8sNamespace = k8sNamespace;
		}

		public String getK8sClusterId() {
			return this.k8sClusterId;
		}

		public void setK8sClusterId(String k8sClusterId) {
			this.k8sClusterId = k8sClusterId;
		}

		public String getK8sNodeId() {
			return this.k8sNodeId;
		}

		public void setK8sNodeId(String k8sNodeId) {
			this.k8sNodeId = k8sNodeId;
		}

		public String getK8sPodName() {
			return this.k8sPodName;
		}

		public void setK8sPodName(String k8sPodName) {
			this.k8sPodName = k8sPodName;
		}

		public String getK8sNodeName() {
			return this.k8sNodeName;
		}

		public void setK8sNodeName(String k8sNodeName) {
			this.k8sNodeName = k8sNodeName;
		}

		public List<QuaraFile> getDetails() {
			return this.details;
		}

		public void setDetails(List<QuaraFile> details) {
			this.details = details;
		}

		public static class QuaraFile {

			private String name;

			private String nameDisplay;

			private String type;

			private String infoType;

			private String value;

			private String valueDisplay;

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

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getInfoType() {
				return this.infoType;
			}

			public void setInfoType(String infoType) {
				this.infoType = infoType;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getValueDisplay() {
				return this.valueDisplay;
			}

			public void setValueDisplay(String valueDisplay) {
				this.valueDisplay = valueDisplay;
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
