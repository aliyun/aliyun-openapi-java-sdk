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

package com.aliyuncs.polardb.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardb.transform.v20170801.DescribeDBLogFilesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBLogFilesResponse extends AcsResponse {

	private Integer totalRecords;

	private Integer itemsNumbers;

	private Integer pageNumber;

	private String dBInstanceName;

	private String dBInstanceType;

	private Integer haStatus;

	private String requestId;

	private Integer pageSize;

	private List<HaSwitchLogItem> haLogItems;

	private List<SwitchListItem> switchListItems;

	private List<SwitchLogItem3> switchLogItems;

	public Integer getTotalRecords() {
		return this.totalRecords;
	}

	public void setTotalRecords(Integer totalRecords) {
		this.totalRecords = totalRecords;
	}

	public Integer getItemsNumbers() {
		return this.itemsNumbers;
	}

	public void setItemsNumbers(Integer itemsNumbers) {
		this.itemsNumbers = itemsNumbers;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getDBInstanceName() {
		return this.dBInstanceName;
	}

	public void setDBInstanceName(String dBInstanceName) {
		this.dBInstanceName = dBInstanceName;
	}

	public String getDBInstanceType() {
		return this.dBInstanceType;
	}

	public void setDBInstanceType(String dBInstanceType) {
		this.dBInstanceType = dBInstanceType;
	}

	public Integer getHaStatus() {
		return this.haStatus;
	}

	public void setHaStatus(Integer haStatus) {
		this.haStatus = haStatus;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<HaSwitchLogItem> getHaLogItems() {
		return this.haLogItems;
	}

	public void setHaLogItems(List<HaSwitchLogItem> haLogItems) {
		this.haLogItems = haLogItems;
	}

	public List<SwitchListItem> getSwitchListItems() {
		return this.switchListItems;
	}

	public void setSwitchListItems(List<SwitchListItem> switchListItems) {
		this.switchListItems = switchListItems;
	}

	public List<SwitchLogItem3> getSwitchLogItems() {
		return this.switchLogItems;
	}

	public void setSwitchLogItems(List<SwitchLogItem3> switchLogItems) {
		this.switchLogItems = switchLogItems;
	}

	public static class HaSwitchLogItem {

		private String switchId;

		private String fromDBType;

		private String switchCauseCode;

		private String switchCauseDetail;

		private String switchStartTime;

		private String switchFinishTime;

		private Long totalSessions;

		private Long affectedSessions;

		private Long switchType;

		public String getSwitchId() {
			return this.switchId;
		}

		public void setSwitchId(String switchId) {
			this.switchId = switchId;
		}

		public String getFromDBType() {
			return this.fromDBType;
		}

		public void setFromDBType(String fromDBType) {
			this.fromDBType = fromDBType;
		}

		public String getSwitchCauseCode() {
			return this.switchCauseCode;
		}

		public void setSwitchCauseCode(String switchCauseCode) {
			this.switchCauseCode = switchCauseCode;
		}

		public String getSwitchCauseDetail() {
			return this.switchCauseDetail;
		}

		public void setSwitchCauseDetail(String switchCauseDetail) {
			this.switchCauseDetail = switchCauseDetail;
		}

		public String getSwitchStartTime() {
			return this.switchStartTime;
		}

		public void setSwitchStartTime(String switchStartTime) {
			this.switchStartTime = switchStartTime;
		}

		public String getSwitchFinishTime() {
			return this.switchFinishTime;
		}

		public void setSwitchFinishTime(String switchFinishTime) {
			this.switchFinishTime = switchFinishTime;
		}

		public Long getTotalSessions() {
			return this.totalSessions;
		}

		public void setTotalSessions(Long totalSessions) {
			this.totalSessions = totalSessions;
		}

		public Long getAffectedSessions() {
			return this.affectedSessions;
		}

		public void setAffectedSessions(Long affectedSessions) {
			this.affectedSessions = affectedSessions;
		}

		public Long getSwitchType() {
			return this.switchType;
		}

		public void setSwitchType(Long switchType) {
			this.switchType = switchType;
		}
	}

	public static class SwitchListItem {

		private String simulateListId;

		private String simulateMode;

		private String simulateStatus;

		private String startTime;

		private String endTime;

		private String eventStartTime;

		private String eventFinishTime;

		private String simulateTaskId;

		private String preferredSimulateStartTime;

		private String plannedEscapeMode;

		private String plannedEscapeTime;

		private String faultInjectionType;

		private List<SwitchLogItem> switchLogItems1;

		private List<SwitchStepItem> switchStepItems;

		private List<String> dBNodeCrashList;

		public String getSimulateListId() {
			return this.simulateListId;
		}

		public void setSimulateListId(String simulateListId) {
			this.simulateListId = simulateListId;
		}

		public String getSimulateMode() {
			return this.simulateMode;
		}

		public void setSimulateMode(String simulateMode) {
			this.simulateMode = simulateMode;
		}

		public String getSimulateStatus() {
			return this.simulateStatus;
		}

		public void setSimulateStatus(String simulateStatus) {
			this.simulateStatus = simulateStatus;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getEventStartTime() {
			return this.eventStartTime;
		}

		public void setEventStartTime(String eventStartTime) {
			this.eventStartTime = eventStartTime;
		}

		public String getEventFinishTime() {
			return this.eventFinishTime;
		}

		public void setEventFinishTime(String eventFinishTime) {
			this.eventFinishTime = eventFinishTime;
		}

		public String getSimulateTaskId() {
			return this.simulateTaskId;
		}

		public void setSimulateTaskId(String simulateTaskId) {
			this.simulateTaskId = simulateTaskId;
		}

		public String getPreferredSimulateStartTime() {
			return this.preferredSimulateStartTime;
		}

		public void setPreferredSimulateStartTime(String preferredSimulateStartTime) {
			this.preferredSimulateStartTime = preferredSimulateStartTime;
		}

		public String getPlannedEscapeMode() {
			return this.plannedEscapeMode;
		}

		public void setPlannedEscapeMode(String plannedEscapeMode) {
			this.plannedEscapeMode = plannedEscapeMode;
		}

		public String getPlannedEscapeTime() {
			return this.plannedEscapeTime;
		}

		public void setPlannedEscapeTime(String plannedEscapeTime) {
			this.plannedEscapeTime = plannedEscapeTime;
		}

		public String getFaultInjectionType() {
			return this.faultInjectionType;
		}

		public void setFaultInjectionType(String faultInjectionType) {
			this.faultInjectionType = faultInjectionType;
		}

		public List<SwitchLogItem> getSwitchLogItems1() {
			return this.switchLogItems1;
		}

		public void setSwitchLogItems1(List<SwitchLogItem> switchLogItems1) {
			this.switchLogItems1 = switchLogItems1;
		}

		public List<SwitchStepItem> getSwitchStepItems() {
			return this.switchStepItems;
		}

		public void setSwitchStepItems(List<SwitchStepItem> switchStepItems) {
			this.switchStepItems = switchStepItems;
		}

		public List<String> getDBNodeCrashList() {
			return this.dBNodeCrashList;
		}

		public void setDBNodeCrashList(List<String> dBNodeCrashList) {
			this.dBNodeCrashList = dBNodeCrashList;
		}

		public static class SwitchLogItem {

			private String simulateListId;

			private String simulateLogId;

			private String dBInstanceId;

			private String srcIpPort;

			private String srcDbType;

			private String dstIpPort;

			private String dstDbType;

			private String simulateStatus;

			private String eventStartTime;

			private String eventFinishTime;

			private List<SwitchDetailItem> switchStepItems2;

			public String getSimulateListId() {
				return this.simulateListId;
			}

			public void setSimulateListId(String simulateListId) {
				this.simulateListId = simulateListId;
			}

			public String getSimulateLogId() {
				return this.simulateLogId;
			}

			public void setSimulateLogId(String simulateLogId) {
				this.simulateLogId = simulateLogId;
			}

			public String getDBInstanceId() {
				return this.dBInstanceId;
			}

			public void setDBInstanceId(String dBInstanceId) {
				this.dBInstanceId = dBInstanceId;
			}

			public String getSrcIpPort() {
				return this.srcIpPort;
			}

			public void setSrcIpPort(String srcIpPort) {
				this.srcIpPort = srcIpPort;
			}

			public String getSrcDbType() {
				return this.srcDbType;
			}

			public void setSrcDbType(String srcDbType) {
				this.srcDbType = srcDbType;
			}

			public String getDstIpPort() {
				return this.dstIpPort;
			}

			public void setDstIpPort(String dstIpPort) {
				this.dstIpPort = dstIpPort;
			}

			public String getDstDbType() {
				return this.dstDbType;
			}

			public void setDstDbType(String dstDbType) {
				this.dstDbType = dstDbType;
			}

			public String getSimulateStatus() {
				return this.simulateStatus;
			}

			public void setSimulateStatus(String simulateStatus) {
				this.simulateStatus = simulateStatus;
			}

			public String getEventStartTime() {
				return this.eventStartTime;
			}

			public void setEventStartTime(String eventStartTime) {
				this.eventStartTime = eventStartTime;
			}

			public String getEventFinishTime() {
				return this.eventFinishTime;
			}

			public void setEventFinishTime(String eventFinishTime) {
				this.eventFinishTime = eventFinishTime;
			}

			public List<SwitchDetailItem> getSwitchStepItems2() {
				return this.switchStepItems2;
			}

			public void setSwitchStepItems2(List<SwitchDetailItem> switchStepItems2) {
				this.switchStepItems2 = switchStepItems2;
			}

			public static class SwitchDetailItem {

				private String stepName;

				private String startTime;

				private String simulatePhase;

				private String endTime;

				private String timeCost;

				private String isSuccess;

				public String getStepName() {
					return this.stepName;
				}

				public void setStepName(String stepName) {
					this.stepName = stepName;
				}

				public String getStartTime() {
					return this.startTime;
				}

				public void setStartTime(String startTime) {
					this.startTime = startTime;
				}

				public String getSimulatePhase() {
					return this.simulatePhase;
				}

				public void setSimulatePhase(String simulatePhase) {
					this.simulatePhase = simulatePhase;
				}

				public String getEndTime() {
					return this.endTime;
				}

				public void setEndTime(String endTime) {
					this.endTime = endTime;
				}

				public String getTimeCost() {
					return this.timeCost;
				}

				public void setTimeCost(String timeCost) {
					this.timeCost = timeCost;
				}

				public String getIsSuccess() {
					return this.isSuccess;
				}

				public void setIsSuccess(String isSuccess) {
					this.isSuccess = isSuccess;
				}
			}
		}

		public static class SwitchStepItem {

			private String simulatePhase;

			private String stepName;

			private String startTime;

			private String endTime;

			private String timeCost;

			private String isSuccess;

			private String dBNodeId;

			public String getSimulatePhase() {
				return this.simulatePhase;
			}

			public void setSimulatePhase(String simulatePhase) {
				this.simulatePhase = simulatePhase;
			}

			public String getStepName() {
				return this.stepName;
			}

			public void setStepName(String stepName) {
				this.stepName = stepName;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
			}

			public String getTimeCost() {
				return this.timeCost;
			}

			public void setTimeCost(String timeCost) {
				this.timeCost = timeCost;
			}

			public String getIsSuccess() {
				return this.isSuccess;
			}

			public void setIsSuccess(String isSuccess) {
				this.isSuccess = isSuccess;
			}

			public String getDBNodeId() {
				return this.dBNodeId;
			}

			public void setDBNodeId(String dBNodeId) {
				this.dBNodeId = dBNodeId;
			}
		}
	}

	public static class SwitchLogItem3 {

		private String simulateListId;

		private String simulatecode;

		private String dBInstanceId;

		private String srcIpPort;

		private String srcDbType;

		private String dstIpPort;

		private String dstDbType;

		private String simulateStatus;

		private String eventStartTime;

		private String eventFinishTime;

		private List<SwitchStepItem5> switchStepItems4;

		public String getSimulateListId() {
			return this.simulateListId;
		}

		public void setSimulateListId(String simulateListId) {
			this.simulateListId = simulateListId;
		}

		public String getSimulatecode() {
			return this.simulatecode;
		}

		public void setSimulatecode(String simulatecode) {
			this.simulatecode = simulatecode;
		}

		public String getDBInstanceId() {
			return this.dBInstanceId;
		}

		public void setDBInstanceId(String dBInstanceId) {
			this.dBInstanceId = dBInstanceId;
		}

		public String getSrcIpPort() {
			return this.srcIpPort;
		}

		public void setSrcIpPort(String srcIpPort) {
			this.srcIpPort = srcIpPort;
		}

		public String getSrcDbType() {
			return this.srcDbType;
		}

		public void setSrcDbType(String srcDbType) {
			this.srcDbType = srcDbType;
		}

		public String getDstIpPort() {
			return this.dstIpPort;
		}

		public void setDstIpPort(String dstIpPort) {
			this.dstIpPort = dstIpPort;
		}

		public String getDstDbType() {
			return this.dstDbType;
		}

		public void setDstDbType(String dstDbType) {
			this.dstDbType = dstDbType;
		}

		public String getSimulateStatus() {
			return this.simulateStatus;
		}

		public void setSimulateStatus(String simulateStatus) {
			this.simulateStatus = simulateStatus;
		}

		public String getEventStartTime() {
			return this.eventStartTime;
		}

		public void setEventStartTime(String eventStartTime) {
			this.eventStartTime = eventStartTime;
		}

		public String getEventFinishTime() {
			return this.eventFinishTime;
		}

		public void setEventFinishTime(String eventFinishTime) {
			this.eventFinishTime = eventFinishTime;
		}

		public List<SwitchStepItem5> getSwitchStepItems4() {
			return this.switchStepItems4;
		}

		public void setSwitchStepItems4(List<SwitchStepItem5> switchStepItems4) {
			this.switchStepItems4 = switchStepItems4;
		}

		public static class SwitchStepItem5 {

			private String stepName;

			private String stepMsg;

			private String startTime;

			private String endTime;

			private String timeCost;

			private String isSuccess;

			private String simulatePhase;

			private String dBNodeId;

			public String getStepName() {
				return this.stepName;
			}

			public void setStepName(String stepName) {
				this.stepName = stepName;
			}

			public String getStepMsg() {
				return this.stepMsg;
			}

			public void setStepMsg(String stepMsg) {
				this.stepMsg = stepMsg;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
			}

			public String getTimeCost() {
				return this.timeCost;
			}

			public void setTimeCost(String timeCost) {
				this.timeCost = timeCost;
			}

			public String getIsSuccess() {
				return this.isSuccess;
			}

			public void setIsSuccess(String isSuccess) {
				this.isSuccess = isSuccess;
			}

			public String getSimulatePhase() {
				return this.simulatePhase;
			}

			public void setSimulatePhase(String simulatePhase) {
				this.simulatePhase = simulatePhase;
			}

			public String getDBNodeId() {
				return this.dBNodeId;
			}

			public void setDBNodeId(String dBNodeId) {
				this.dBNodeId = dBNodeId;
			}
		}
	}

	@Override
	public DescribeDBLogFilesResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBLogFilesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
