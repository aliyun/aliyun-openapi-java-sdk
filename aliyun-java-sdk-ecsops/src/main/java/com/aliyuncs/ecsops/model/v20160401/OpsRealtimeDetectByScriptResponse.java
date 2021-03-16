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
import com.aliyuncs.ecsops.transform.v20160401.OpsRealtimeDetectByScriptResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsRealtimeDetectByScriptResponse extends AcsResponse {

	private String requestId;

	private String startTime;

	private String endTime;

	private List<DetectResult> detectResults;

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

	public List<DetectResult> getDetectResults() {
		return this.detectResults;
	}

	public void setDetectResults(List<DetectResult> detectResults) {
		this.detectResults = detectResults;
	}

	public OverviewInfo getOverviewInfo() {
		return this.overviewInfo;
	}

	public void setOverviewInfo(OverviewInfo overviewInfo) {
		this.overviewInfo = overviewInfo;
	}

	public static class DetectResult {

		private String status;

		private String taskUid;

		private Boolean success;

		private String configName;

		private String groupName;

		private String message;

		private List<DetectItem> detectItems;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getTaskUid() {
			return this.taskUid;
		}

		public void setTaskUid(String taskUid) {
			this.taskUid = taskUid;
		}

		public Boolean getSuccess() {
			return this.success;
		}

		public void setSuccess(Boolean success) {
			this.success = success;
		}

		public String getConfigName() {
			return this.configName;
		}

		public void setConfigName(String configName) {
			this.configName = configName;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public List<DetectItem> getDetectItems() {
			return this.detectItems;
		}

		public void setDetectItems(List<DetectItem> detectItems) {
			this.detectItems = detectItems;
		}

		public static class DetectItem {

			private String status;

			private String message;

			private String logFile;

			private String itemName;

			private String fixScript;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getMessage() {
				return this.message;
			}

			public void setMessage(String message) {
				this.message = message;
			}

			public String getLogFile() {
				return this.logFile;
			}

			public void setLogFile(String logFile) {
				this.logFile = logFile;
			}

			public String getItemName() {
				return this.itemName;
			}

			public void setItemName(String itemName) {
				this.itemName = itemName;
			}

			public String getFixScript() {
				return this.fixScript;
			}

			public void setFixScript(String fixScript) {
				this.fixScript = fixScript;
			}
		}
	}

	public static class OverviewInfo {

		private Integer cpuCoreCount;

		private String ncIp;

		private String aliUid;

		private String availableZone;

		private String machineId;

		private String regionId;

		private String hostname;

		private String intranetIp;

		private String extension;

		private String instanceType;

		private String clusterName;

		private String vips;

		private Boolean isLocalDisk;

		private String machineStatus;

		private String machineType;

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

		public Integer getCpuCoreCount() {
			return this.cpuCoreCount;
		}

		public void setCpuCoreCount(Integer cpuCoreCount) {
			this.cpuCoreCount = cpuCoreCount;
		}

		public String getNcIp() {
			return this.ncIp;
		}

		public void setNcIp(String ncIp) {
			this.ncIp = ncIp;
		}

		public String getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(String aliUid) {
			this.aliUid = aliUid;
		}

		public String getAvailableZone() {
			return this.availableZone;
		}

		public void setAvailableZone(String availableZone) {
			this.availableZone = availableZone;
		}

		public String getMachineId() {
			return this.machineId;
		}

		public void setMachineId(String machineId) {
			this.machineId = machineId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getHostname() {
			return this.hostname;
		}

		public void setHostname(String hostname) {
			this.hostname = hostname;
		}

		public String getIntranetIp() {
			return this.intranetIp;
		}

		public void setIntranetIp(String intranetIp) {
			this.intranetIp = intranetIp;
		}

		public String getExtension() {
			return this.extension;
		}

		public void setExtension(String extension) {
			this.extension = extension;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getClusterName() {
			return this.clusterName;
		}

		public void setClusterName(String clusterName) {
			this.clusterName = clusterName;
		}

		public String getVips() {
			return this.vips;
		}

		public void setVips(String vips) {
			this.vips = vips;
		}

		public Boolean getIsLocalDisk() {
			return this.isLocalDisk;
		}

		public void setIsLocalDisk(Boolean isLocalDisk) {
			this.isLocalDisk = isLocalDisk;
		}

		public String getMachineStatus() {
			return this.machineStatus;
		}

		public void setMachineStatus(String machineStatus) {
			this.machineStatus = machineStatus;
		}

		public String getMachineType() {
			return this.machineType;
		}

		public void setMachineType(String machineType) {
			this.machineType = machineType;
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
	public OpsRealtimeDetectByScriptResponse getInstance(UnmarshallerContext context) {
		return	OpsRealtimeDetectByScriptResponseUnmarshaller.unmarshall(this, context);
	}
}
