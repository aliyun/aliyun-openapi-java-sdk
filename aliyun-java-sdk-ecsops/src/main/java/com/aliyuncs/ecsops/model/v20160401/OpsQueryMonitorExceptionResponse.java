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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryMonitorExceptionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryMonitorExceptionResponse extends AcsResponse {

	private String requestId;

	private String startTime;

	private String endTime;

	private List<ExceptionEvent> exceptionEvents;

	private OverviewInfo overviewInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public List<ExceptionEvent> getExceptionEvents() {
		return this.exceptionEvents;
	}

	public void setExceptionEvents(List<ExceptionEvent> exceptionEvents) {
		this.exceptionEvents = exceptionEvents;
	}

	public OverviewInfo getOverviewInfo() {
		return this.overviewInfo;
	}

	public void setOverviewInfo(OverviewInfo overviewInfo) {
		this.overviewInfo = overviewInfo;
	}

	public static class ExceptionEvent {

		private String machineId;

		private String ncIp;

		private String exceptionTime;

		private String lastExceptionTime;

		private String exceptionType;

		private String reason;

		private String exceptionName;

		private String exceptionCondition;

		private String exceptionCount;

		private String warningLevel;

		private String additionalInfo;

		public String getMachineId() {
			return this.machineId;
		}

		public void setMachineId(String machineId) {
			this.machineId = machineId;
		}

		public String getNcIp() {
			return this.ncIp;
		}

		public void setNcIp(String ncIp) {
			this.ncIp = ncIp;
		}

		public String getExceptionTime() {
			return this.exceptionTime;
		}

		public void setExceptionTime(String exceptionTime) {
			this.exceptionTime = exceptionTime;
		}

		public String getLastExceptionTime() {
			return this.lastExceptionTime;
		}

		public void setLastExceptionTime(String lastExceptionTime) {
			this.lastExceptionTime = lastExceptionTime;
		}

		public String getExceptionType() {
			return this.exceptionType;
		}

		public void setExceptionType(String exceptionType) {
			this.exceptionType = exceptionType;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public String getExceptionName() {
			return this.exceptionName;
		}

		public void setExceptionName(String exceptionName) {
			this.exceptionName = exceptionName;
		}

		public String getExceptionCondition() {
			return this.exceptionCondition;
		}

		public void setExceptionCondition(String exceptionCondition) {
			this.exceptionCondition = exceptionCondition;
		}

		public String getExceptionCount() {
			return this.exceptionCount;
		}

		public void setExceptionCount(String exceptionCount) {
			this.exceptionCount = exceptionCount;
		}

		public String getWarningLevel() {
			return this.warningLevel;
		}

		public void setWarningLevel(String warningLevel) {
			this.warningLevel = warningLevel;
		}

		public String getAdditionalInfo() {
			return this.additionalInfo;
		}

		public void setAdditionalInfo(String additionalInfo) {
			this.additionalInfo = additionalInfo;
		}
	}

	public static class OverviewInfo {

		private Integer vCpuCount;

		private String machineId;

		private String ncIp;

		private String ncId;

		private String machineType;

		private String aZone;

		private String instanceFamily;

		private String machineStatus;

		private String cluster;

		private String extInfo;

		private Boolean isLocalDisk;

		private String vips;

		private String regionId;

		private String stressComparisionState;

		private String stressComparisionResult;

		private String stressComparisionStartTime;

		private Integer stressComparisionTime;

		private String riskTag;

		private String productName;

		private String migrateStatus;

		private String canMigrateSla;

		private String canMigrateBySlb;

		private String canMigrateByType;

		private String canMigrateByOthers;

		private List<SnNodeInfo> snNodeInfoList;

		private List<String> blackListInfo;

		private List<String> whiteListInfo;

		public Integer getVCpuCount() {
			return this.vCpuCount;
		}

		public void setVCpuCount(Integer vCpuCount) {
			this.vCpuCount = vCpuCount;
		}

		public String getMachineId() {
			return this.machineId;
		}

		public void setMachineId(String machineId) {
			this.machineId = machineId;
		}

		public String getNcIp() {
			return this.ncIp;
		}

		public void setNcIp(String ncIp) {
			this.ncIp = ncIp;
		}

		public String getNcId() {
			return this.ncId;
		}

		public void setNcId(String ncId) {
			this.ncId = ncId;
		}

		public String getMachineType() {
			return this.machineType;
		}

		public void setMachineType(String machineType) {
			this.machineType = machineType;
		}

		public String getAZone() {
			return this.aZone;
		}

		public void setAZone(String aZone) {
			this.aZone = aZone;
		}

		public String getInstanceFamily() {
			return this.instanceFamily;
		}

		public void setInstanceFamily(String instanceFamily) {
			this.instanceFamily = instanceFamily;
		}

		public String getMachineStatus() {
			return this.machineStatus;
		}

		public void setMachineStatus(String machineStatus) {
			this.machineStatus = machineStatus;
		}

		public String getCluster() {
			return this.cluster;
		}

		public void setCluster(String cluster) {
			this.cluster = cluster;
		}

		public String getExtInfo() {
			return this.extInfo;
		}

		public void setExtInfo(String extInfo) {
			this.extInfo = extInfo;
		}

		public Boolean getIsLocalDisk() {
			return this.isLocalDisk;
		}

		public void setIsLocalDisk(Boolean isLocalDisk) {
			this.isLocalDisk = isLocalDisk;
		}

		public String getVips() {
			return this.vips;
		}

		public void setVips(String vips) {
			this.vips = vips;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getStressComparisionState() {
			return this.stressComparisionState;
		}

		public void setStressComparisionState(String stressComparisionState) {
			this.stressComparisionState = stressComparisionState;
		}

		public String getStressComparisionResult() {
			return this.stressComparisionResult;
		}

		public void setStressComparisionResult(String stressComparisionResult) {
			this.stressComparisionResult = stressComparisionResult;
		}

		public String getStressComparisionStartTime() {
			return this.stressComparisionStartTime;
		}

		public void setStressComparisionStartTime(String stressComparisionStartTime) {
			this.stressComparisionStartTime = stressComparisionStartTime;
		}

		public Integer getStressComparisionTime() {
			return this.stressComparisionTime;
		}

		public void setStressComparisionTime(Integer stressComparisionTime) {
			this.stressComparisionTime = stressComparisionTime;
		}

		public String getRiskTag() {
			return this.riskTag;
		}

		public void setRiskTag(String riskTag) {
			this.riskTag = riskTag;
		}

		public String getProductName() {
			return this.productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getMigrateStatus() {
			return this.migrateStatus;
		}

		public void setMigrateStatus(String migrateStatus) {
			this.migrateStatus = migrateStatus;
		}

		public String getCanMigrateSla() {
			return this.canMigrateSla;
		}

		public void setCanMigrateSla(String canMigrateSla) {
			this.canMigrateSla = canMigrateSla;
		}

		public String getCanMigrateBySlb() {
			return this.canMigrateBySlb;
		}

		public void setCanMigrateBySlb(String canMigrateBySlb) {
			this.canMigrateBySlb = canMigrateBySlb;
		}

		public String getCanMigrateByType() {
			return this.canMigrateByType;
		}

		public void setCanMigrateByType(String canMigrateByType) {
			this.canMigrateByType = canMigrateByType;
		}

		public String getCanMigrateByOthers() {
			return this.canMigrateByOthers;
		}

		public void setCanMigrateByOthers(String canMigrateByOthers) {
			this.canMigrateByOthers = canMigrateByOthers;
		}

		public List<SnNodeInfo> getSnNodeInfoList() {
			return this.snNodeInfoList;
		}

		public void setSnNodeInfoList(List<SnNodeInfo> snNodeInfoList) {
			this.snNodeInfoList = snNodeInfoList;
		}

		public List<String> getBlackListInfo() {
			return this.blackListInfo;
		}

		public void setBlackListInfo(List<String> blackListInfo) {
			this.blackListInfo = blackListInfo;
		}

		public List<String> getWhiteListInfo() {
			return this.whiteListInfo;
		}

		public void setWhiteListInfo(List<String> whiteListInfo) {
			this.whiteListInfo = whiteListInfo;
		}

		public static class SnNodeInfo {

			private String ncId;

			private String cnSn;

			private String machineStatus;

			private String stressComparisionState;

			private String stressComparisionResult;

			private String stressComparisionStartTime;

			private Integer stressComparisionTime;

			private String riskTag;

			public String getNcId() {
				return this.ncId;
			}

			public void setNcId(String ncId) {
				this.ncId = ncId;
			}

			public String getCnSn() {
				return this.cnSn;
			}

			public void setCnSn(String cnSn) {
				this.cnSn = cnSn;
			}

			public String getMachineStatus() {
				return this.machineStatus;
			}

			public void setMachineStatus(String machineStatus) {
				this.machineStatus = machineStatus;
			}

			public String getStressComparisionState() {
				return this.stressComparisionState;
			}

			public void setStressComparisionState(String stressComparisionState) {
				this.stressComparisionState = stressComparisionState;
			}

			public String getStressComparisionResult() {
				return this.stressComparisionResult;
			}

			public void setStressComparisionResult(String stressComparisionResult) {
				this.stressComparisionResult = stressComparisionResult;
			}

			public String getStressComparisionStartTime() {
				return this.stressComparisionStartTime;
			}

			public void setStressComparisionStartTime(String stressComparisionStartTime) {
				this.stressComparisionStartTime = stressComparisionStartTime;
			}

			public Integer getStressComparisionTime() {
				return this.stressComparisionTime;
			}

			public void setStressComparisionTime(Integer stressComparisionTime) {
				this.stressComparisionTime = stressComparisionTime;
			}

			public String getRiskTag() {
				return this.riskTag;
			}

			public void setRiskTag(String riskTag) {
				this.riskTag = riskTag;
			}
		}
	}

	@Override
	public OpsQueryMonitorExceptionResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryMonitorExceptionResponseUnmarshaller.unmarshall(this, context);
	}
}
