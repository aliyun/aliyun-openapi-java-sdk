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
import com.aliyuncs.ecsops.transform.v20160401.OpsDetectRootCauseResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDetectRootCauseResponse extends AcsResponse {

	private String requestId;

	private String startTime;

	private String endTime;

	private List<ExceptionEvent> exceptionEvents;

	private List<KeyExceptionEvent> keyExceptionEvents;

	private RootCause rootCause;

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

	public List<KeyExceptionEvent> getKeyExceptionEvents() {
		return this.keyExceptionEvents;
	}

	public void setKeyExceptionEvents(List<KeyExceptionEvent> keyExceptionEvents) {
		this.keyExceptionEvents = keyExceptionEvents;
	}

	public RootCause getRootCause() {
		return this.rootCause;
	}

	public void setRootCause(RootCause rootCause) {
		this.rootCause = rootCause;
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

		private String exceptionType;

		private String reason;

		private String exceptionName;

		private String instanceType;

		private String warningLevel;

		private String message;

		private String desc;

		private String ncId;

		private String cnSn;

		private List<String> responseTeams;

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

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getWarningLevel() {
			return this.warningLevel;
		}

		public void setWarningLevel(String warningLevel) {
			this.warningLevel = warningLevel;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getDesc() {
			return this.desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

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

		public List<String> getResponseTeams() {
			return this.responseTeams;
		}

		public void setResponseTeams(List<String> responseTeams) {
			this.responseTeams = responseTeams;
		}
	}

	public static class KeyExceptionEvent {

		private String machineId;

		private String ncIp;

		private String startTime;

		private String lastExceptionTime;

		private String exceptionType;

		private String reason;

		private String exceptionName;

		private String warningLevel;

		private String message;

		private String desc;

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

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
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

		public String getWarningLevel() {
			return this.warningLevel;
		}

		public void setWarningLevel(String warningLevel) {
			this.warningLevel = warningLevel;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getDesc() {
			return this.desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}
	}

	public static class RootCause {

		private String additionalInfo;

		private String machineId;

		private String ncIp;

		private String exceptionTime;

		private String reason;

		private String aZone;

		private String exceptionName;

		private String message;

		private String warningLevel;

		private String desc;

		private String ncId;

		private String cnSn;

		private String stressComparisionState;

		private String stressComparisionResult;

		private String stressComparisionStartTime;

		private Integer stressComparisionTime;

		private String riskTag;

		private List<SnNodeInfo> snNodeInfoList;

		private List<String> supportTeams;

		public String getAdditionalInfo() {
			return this.additionalInfo;
		}

		public void setAdditionalInfo(String additionalInfo) {
			this.additionalInfo = additionalInfo;
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

		public String getExceptionTime() {
			return this.exceptionTime;
		}

		public void setExceptionTime(String exceptionTime) {
			this.exceptionTime = exceptionTime;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public String getAZone() {
			return this.aZone;
		}

		public void setAZone(String aZone) {
			this.aZone = aZone;
		}

		public String getExceptionName() {
			return this.exceptionName;
		}

		public void setExceptionName(String exceptionName) {
			this.exceptionName = exceptionName;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getWarningLevel() {
			return this.warningLevel;
		}

		public void setWarningLevel(String warningLevel) {
			this.warningLevel = warningLevel;
		}

		public String getDesc() {
			return this.desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

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

		public List<SnNodeInfo> getSnNodeInfoList() {
			return this.snNodeInfoList;
		}

		public void setSnNodeInfoList(List<SnNodeInfo> snNodeInfoList) {
			this.snNodeInfoList = snNodeInfoList;
		}

		public List<String> getSupportTeams() {
			return this.supportTeams;
		}

		public void setSupportTeams(List<String> supportTeams) {
			this.supportTeams = supportTeams;
		}

		public static class SnNodeInfo {

			private String ncId;

			private String cnSn;

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

	public static class OverviewInfo {

		private Integer vCpuCount;

		private String ncIp;

		private String aliUid;

		private String aZone;

		private String machineId;

		private String region;

		private String hostname;

		private String intranetIp;

		private String extension;

		private String instanceType;

		private String ncId;

		private String cnSn;

		public Integer getVCpuCount() {
			return this.vCpuCount;
		}

		public void setVCpuCount(Integer vCpuCount) {
			this.vCpuCount = vCpuCount;
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

		public String getAZone() {
			return this.aZone;
		}

		public void setAZone(String aZone) {
			this.aZone = aZone;
		}

		public String getMachineId() {
			return this.machineId;
		}

		public void setMachineId(String machineId) {
			this.machineId = machineId;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
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
	}

	@Override
	public OpsDetectRootCauseResponse getInstance(UnmarshallerContext context) {
		return	OpsDetectRootCauseResponseUnmarshaller.unmarshall(this, context);
	}
}
