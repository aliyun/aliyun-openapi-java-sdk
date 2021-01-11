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

package com.aliyuncs.dts.model.v20200101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dts.transform.v20200101.DescribeDtsJobsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDtsJobsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errCode;

	private String errMessage;

	private String dynamicCode;

	private String dynamicMessage;

	private Integer httpStatusCode;

	private Integer pageNumber;

	private Integer pageRecordCount;

	private Integer totalRecordCount;

	private List<DtsJobStatus> dtsJobList;

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

	public String getErrCode() {
		return this.errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getErrMessage() {
		return this.errMessage;
	}

	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageRecordCount() {
		return this.pageRecordCount;
	}

	public void setPageRecordCount(Integer pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	public Integer getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Integer totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public List<DtsJobStatus> getDtsJobList() {
		return this.dtsJobList;
	}

	public void setDtsJobList(List<DtsJobStatus> dtsJobList) {
		this.dtsJobList = dtsJobList;
	}

	public static class DtsJobStatus {

		private String dtsInstanceID;

		private String dtsJobId;

		private String dtsJobName;

		private String dtsJobClass;

		private String dtsJobDirection;

		private String payType;

		private String expireTime;

		private String createTime;

		private String status;

		private String errorMessage;

		private Integer delay;

		private String checkpoint;

		private String dbObject;

		private String reserved;

		private List<DtsTag> tagList;

		private SourceEndpoint sourceEndpoint;

		private DestinationEndpoint destinationEndpoint;

		private MigrationMode migrationMode;

		private PrecheckStatus precheckStatus;

		private StructureInitializationStatus structureInitializationStatus;

		private DataInitializationStatus dataInitializationStatus;

		private DataSynchronizationStatus dataSynchronizationStatus;

		private Performance performance;

		private ReverseJob reverseJob;

		public String getDtsInstanceID() {
			return this.dtsInstanceID;
		}

		public void setDtsInstanceID(String dtsInstanceID) {
			this.dtsInstanceID = dtsInstanceID;
		}

		public String getDtsJobId() {
			return this.dtsJobId;
		}

		public void setDtsJobId(String dtsJobId) {
			this.dtsJobId = dtsJobId;
		}

		public String getDtsJobName() {
			return this.dtsJobName;
		}

		public void setDtsJobName(String dtsJobName) {
			this.dtsJobName = dtsJobName;
		}

		public String getDtsJobClass() {
			return this.dtsJobClass;
		}

		public void setDtsJobClass(String dtsJobClass) {
			this.dtsJobClass = dtsJobClass;
		}

		public String getDtsJobDirection() {
			return this.dtsJobDirection;
		}

		public void setDtsJobDirection(String dtsJobDirection) {
			this.dtsJobDirection = dtsJobDirection;
		}

		public String getPayType() {
			return this.payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public Integer getDelay() {
			return this.delay;
		}

		public void setDelay(Integer delay) {
			this.delay = delay;
		}

		public String getCheckpoint() {
			return this.checkpoint;
		}

		public void setCheckpoint(String checkpoint) {
			this.checkpoint = checkpoint;
		}

		public String getDbObject() {
			return this.dbObject;
		}

		public void setDbObject(String dbObject) {
			this.dbObject = dbObject;
		}

		public String getReserved() {
			return this.reserved;
		}

		public void setReserved(String reserved) {
			this.reserved = reserved;
		}

		public List<DtsTag> getTagList() {
			return this.tagList;
		}

		public void setTagList(List<DtsTag> tagList) {
			this.tagList = tagList;
		}

		public SourceEndpoint getSourceEndpoint() {
			return this.sourceEndpoint;
		}

		public void setSourceEndpoint(SourceEndpoint sourceEndpoint) {
			this.sourceEndpoint = sourceEndpoint;
		}

		public DestinationEndpoint getDestinationEndpoint() {
			return this.destinationEndpoint;
		}

		public void setDestinationEndpoint(DestinationEndpoint destinationEndpoint) {
			this.destinationEndpoint = destinationEndpoint;
		}

		public MigrationMode getMigrationMode() {
			return this.migrationMode;
		}

		public void setMigrationMode(MigrationMode migrationMode) {
			this.migrationMode = migrationMode;
		}

		public PrecheckStatus getPrecheckStatus() {
			return this.precheckStatus;
		}

		public void setPrecheckStatus(PrecheckStatus precheckStatus) {
			this.precheckStatus = precheckStatus;
		}

		public StructureInitializationStatus getStructureInitializationStatus() {
			return this.structureInitializationStatus;
		}

		public void setStructureInitializationStatus(StructureInitializationStatus structureInitializationStatus) {
			this.structureInitializationStatus = structureInitializationStatus;
		}

		public DataInitializationStatus getDataInitializationStatus() {
			return this.dataInitializationStatus;
		}

		public void setDataInitializationStatus(DataInitializationStatus dataInitializationStatus) {
			this.dataInitializationStatus = dataInitializationStatus;
		}

		public DataSynchronizationStatus getDataSynchronizationStatus() {
			return this.dataSynchronizationStatus;
		}

		public void setDataSynchronizationStatus(DataSynchronizationStatus dataSynchronizationStatus) {
			this.dataSynchronizationStatus = dataSynchronizationStatus;
		}

		public Performance getPerformance() {
			return this.performance;
		}

		public void setPerformance(Performance performance) {
			this.performance = performance;
		}

		public ReverseJob getReverseJob() {
			return this.reverseJob;
		}

		public void setReverseJob(ReverseJob reverseJob) {
			this.reverseJob = reverseJob;
		}

		public static class DtsTag {

			private String tagKey;

			private String tagValue;

			public String getTagKey() {
				return this.tagKey;
			}

			public void setTagKey(String tagKey) {
				this.tagKey = tagKey;
			}

			public String getTagValue() {
				return this.tagValue;
			}

			public void setTagValue(String tagValue) {
				this.tagValue = tagValue;
			}
		}

		public static class SourceEndpoint {

			private String instanceID;

			private String instanceType;

			private String engineName;

			private String ip;

			private String port;

			private String databaseName;

			private String oracleSID;

			private String userName;

			private String sslSolutionEnum;

			private String region;

			public String getInstanceID() {
				return this.instanceID;
			}

			public void setInstanceID(String instanceID) {
				this.instanceID = instanceID;
			}

			public String getInstanceType() {
				return this.instanceType;
			}

			public void setInstanceType(String instanceType) {
				this.instanceType = instanceType;
			}

			public String getEngineName() {
				return this.engineName;
			}

			public void setEngineName(String engineName) {
				this.engineName = engineName;
			}

			public String getIp() {
				return this.ip;
			}

			public void setIp(String ip) {
				this.ip = ip;
			}

			public String getPort() {
				return this.port;
			}

			public void setPort(String port) {
				this.port = port;
			}

			public String getDatabaseName() {
				return this.databaseName;
			}

			public void setDatabaseName(String databaseName) {
				this.databaseName = databaseName;
			}

			public String getOracleSID() {
				return this.oracleSID;
			}

			public void setOracleSID(String oracleSID) {
				this.oracleSID = oracleSID;
			}

			public String getUserName() {
				return this.userName;
			}

			public void setUserName(String userName) {
				this.userName = userName;
			}

			public String getSslSolutionEnum() {
				return this.sslSolutionEnum;
			}

			public void setSslSolutionEnum(String sslSolutionEnum) {
				this.sslSolutionEnum = sslSolutionEnum;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}
		}

		public static class DestinationEndpoint {

			private String instanceID;

			private String instanceType;

			private String engineName;

			private String ip;

			private String port;

			private String databaseName;

			private String oracleSID;

			private String userName;

			private String sslSolutionEnum;

			private String region;

			public String getInstanceID() {
				return this.instanceID;
			}

			public void setInstanceID(String instanceID) {
				this.instanceID = instanceID;
			}

			public String getInstanceType() {
				return this.instanceType;
			}

			public void setInstanceType(String instanceType) {
				this.instanceType = instanceType;
			}

			public String getEngineName() {
				return this.engineName;
			}

			public void setEngineName(String engineName) {
				this.engineName = engineName;
			}

			public String getIp() {
				return this.ip;
			}

			public void setIp(String ip) {
				this.ip = ip;
			}

			public String getPort() {
				return this.port;
			}

			public void setPort(String port) {
				this.port = port;
			}

			public String getDatabaseName() {
				return this.databaseName;
			}

			public void setDatabaseName(String databaseName) {
				this.databaseName = databaseName;
			}

			public String getOracleSID() {
				return this.oracleSID;
			}

			public void setOracleSID(String oracleSID) {
				this.oracleSID = oracleSID;
			}

			public String getUserName() {
				return this.userName;
			}

			public void setUserName(String userName) {
				this.userName = userName;
			}

			public String getSslSolutionEnum() {
				return this.sslSolutionEnum;
			}

			public void setSslSolutionEnum(String sslSolutionEnum) {
				this.sslSolutionEnum = sslSolutionEnum;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}
		}

		public static class MigrationMode {

			private Boolean structureInitialization;

			private Boolean dataInitialization;

			private Boolean dataSynchronization;

			public Boolean getStructureInitialization() {
				return this.structureInitialization;
			}

			public void setStructureInitialization(Boolean structureInitialization) {
				this.structureInitialization = structureInitialization;
			}

			public Boolean getDataInitialization() {
				return this.dataInitialization;
			}

			public void setDataInitialization(Boolean dataInitialization) {
				this.dataInitialization = dataInitialization;
			}

			public Boolean getDataSynchronization() {
				return this.dataSynchronization;
			}

			public void setDataSynchronization(Boolean dataSynchronization) {
				this.dataSynchronization = dataSynchronization;
			}
		}

		public static class PrecheckStatus {

			private String status;

			private String percent;

			private String errorMessage;

			private List<PrecheckDetail> detail;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getPercent() {
				return this.percent;
			}

			public void setPercent(String percent) {
				this.percent = percent;
			}

			public String getErrorMessage() {
				return this.errorMessage;
			}

			public void setErrorMessage(String errorMessage) {
				this.errorMessage = errorMessage;
			}

			public List<PrecheckDetail> getDetail() {
				return this.detail;
			}

			public void setDetail(List<PrecheckDetail> detail) {
				this.detail = detail;
			}

			public static class PrecheckDetail {

				private String checkItem;

				private String checkItemDescription;

				private String checkResult;

				private String failedReason;

				private String repairMethod;

				public String getCheckItem() {
					return this.checkItem;
				}

				public void setCheckItem(String checkItem) {
					this.checkItem = checkItem;
				}

				public String getCheckItemDescription() {
					return this.checkItemDescription;
				}

				public void setCheckItemDescription(String checkItemDescription) {
					this.checkItemDescription = checkItemDescription;
				}

				public String getCheckResult() {
					return this.checkResult;
				}

				public void setCheckResult(String checkResult) {
					this.checkResult = checkResult;
				}

				public String getFailedReason() {
					return this.failedReason;
				}

				public void setFailedReason(String failedReason) {
					this.failedReason = failedReason;
				}

				public String getRepairMethod() {
					return this.repairMethod;
				}

				public void setRepairMethod(String repairMethod) {
					this.repairMethod = repairMethod;
				}
			}
		}

		public static class StructureInitializationStatus {

			private String status;

			private String errorMessage;

			private String percent;

			private String progress;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getErrorMessage() {
				return this.errorMessage;
			}

			public void setErrorMessage(String errorMessage) {
				this.errorMessage = errorMessage;
			}

			public String getPercent() {
				return this.percent;
			}

			public void setPercent(String percent) {
				this.percent = percent;
			}

			public String getProgress() {
				return this.progress;
			}

			public void setProgress(String progress) {
				this.progress = progress;
			}
		}

		public static class DataInitializationStatus {

			private String status;

			private String errorMessage;

			private String percent;

			private String progress;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getErrorMessage() {
				return this.errorMessage;
			}

			public void setErrorMessage(String errorMessage) {
				this.errorMessage = errorMessage;
			}

			public String getPercent() {
				return this.percent;
			}

			public void setPercent(String percent) {
				this.percent = percent;
			}

			public String getProgress() {
				return this.progress;
			}

			public void setProgress(String progress) {
				this.progress = progress;
			}
		}

		public static class DataSynchronizationStatus {

			private String status;

			private String errorMessage;

			private String percent;

			private String progress;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getErrorMessage() {
				return this.errorMessage;
			}

			public void setErrorMessage(String errorMessage) {
				this.errorMessage = errorMessage;
			}

			public String getPercent() {
				return this.percent;
			}

			public void setPercent(String percent) {
				this.percent = percent;
			}

			public String getProgress() {
				return this.progress;
			}

			public void setProgress(String progress) {
				this.progress = progress;
			}
		}

		public static class Performance {

			private String rps;

			private String flow;

			public String getRps() {
				return this.rps;
			}

			public void setRps(String rps) {
				this.rps = rps;
			}

			public String getFlow() {
				return this.flow;
			}

			public void setFlow(String flow) {
				this.flow = flow;
			}
		}

		public static class ReverseJob {

			private String dtsInstanceID;

			private String dtsJobId;

			private String dtsJobName;

			private String dtsJobClass;

			private String dtsJobDirection;

			private String payType;

			private String expireTime;

			private String createTime;

			private String status;

			private String errorMessage;

			private Integer delay;

			private String checkpoint;

			private String dbObject;

			private String reserved;

			private SourceEndpoint1 sourceEndpoint1;

			private DestinationEndpoint2 destinationEndpoint2;

			private MigrationMode3 migrationMode3;

			private PrecheckStatus4 precheckStatus4;

			private StructureInitializationStatus5 structureInitializationStatus5;

			private DataInitializationStatus6 dataInitializationStatus6;

			private DataSynchronizationStatus7 dataSynchronizationStatus7;

			private Performance8 performance8;

			public String getDtsInstanceID() {
				return this.dtsInstanceID;
			}

			public void setDtsInstanceID(String dtsInstanceID) {
				this.dtsInstanceID = dtsInstanceID;
			}

			public String getDtsJobId() {
				return this.dtsJobId;
			}

			public void setDtsJobId(String dtsJobId) {
				this.dtsJobId = dtsJobId;
			}

			public String getDtsJobName() {
				return this.dtsJobName;
			}

			public void setDtsJobName(String dtsJobName) {
				this.dtsJobName = dtsJobName;
			}

			public String getDtsJobClass() {
				return this.dtsJobClass;
			}

			public void setDtsJobClass(String dtsJobClass) {
				this.dtsJobClass = dtsJobClass;
			}

			public String getDtsJobDirection() {
				return this.dtsJobDirection;
			}

			public void setDtsJobDirection(String dtsJobDirection) {
				this.dtsJobDirection = dtsJobDirection;
			}

			public String getPayType() {
				return this.payType;
			}

			public void setPayType(String payType) {
				this.payType = payType;
			}

			public String getExpireTime() {
				return this.expireTime;
			}

			public void setExpireTime(String expireTime) {
				this.expireTime = expireTime;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getErrorMessage() {
				return this.errorMessage;
			}

			public void setErrorMessage(String errorMessage) {
				this.errorMessage = errorMessage;
			}

			public Integer getDelay() {
				return this.delay;
			}

			public void setDelay(Integer delay) {
				this.delay = delay;
			}

			public String getCheckpoint() {
				return this.checkpoint;
			}

			public void setCheckpoint(String checkpoint) {
				this.checkpoint = checkpoint;
			}

			public String getDbObject() {
				return this.dbObject;
			}

			public void setDbObject(String dbObject) {
				this.dbObject = dbObject;
			}

			public String getReserved() {
				return this.reserved;
			}

			public void setReserved(String reserved) {
				this.reserved = reserved;
			}

			public SourceEndpoint1 getSourceEndpoint1() {
				return this.sourceEndpoint1;
			}

			public void setSourceEndpoint1(SourceEndpoint1 sourceEndpoint1) {
				this.sourceEndpoint1 = sourceEndpoint1;
			}

			public DestinationEndpoint2 getDestinationEndpoint2() {
				return this.destinationEndpoint2;
			}

			public void setDestinationEndpoint2(DestinationEndpoint2 destinationEndpoint2) {
				this.destinationEndpoint2 = destinationEndpoint2;
			}

			public MigrationMode3 getMigrationMode3() {
				return this.migrationMode3;
			}

			public void setMigrationMode3(MigrationMode3 migrationMode3) {
				this.migrationMode3 = migrationMode3;
			}

			public PrecheckStatus4 getPrecheckStatus4() {
				return this.precheckStatus4;
			}

			public void setPrecheckStatus4(PrecheckStatus4 precheckStatus4) {
				this.precheckStatus4 = precheckStatus4;
			}

			public StructureInitializationStatus5 getStructureInitializationStatus5() {
				return this.structureInitializationStatus5;
			}

			public void setStructureInitializationStatus5(StructureInitializationStatus5 structureInitializationStatus5) {
				this.structureInitializationStatus5 = structureInitializationStatus5;
			}

			public DataInitializationStatus6 getDataInitializationStatus6() {
				return this.dataInitializationStatus6;
			}

			public void setDataInitializationStatus6(DataInitializationStatus6 dataInitializationStatus6) {
				this.dataInitializationStatus6 = dataInitializationStatus6;
			}

			public DataSynchronizationStatus7 getDataSynchronizationStatus7() {
				return this.dataSynchronizationStatus7;
			}

			public void setDataSynchronizationStatus7(DataSynchronizationStatus7 dataSynchronizationStatus7) {
				this.dataSynchronizationStatus7 = dataSynchronizationStatus7;
			}

			public Performance8 getPerformance8() {
				return this.performance8;
			}

			public void setPerformance8(Performance8 performance8) {
				this.performance8 = performance8;
			}

			public static class SourceEndpoint1 {

				private String instanceID;

				private String instanceType;

				private String engineName;

				private String ip;

				private String port;

				private String databaseName;

				private String oracleSID;

				private String userName;

				private String sslSolutionEnum;

				private String region;

				public String getInstanceID() {
					return this.instanceID;
				}

				public void setInstanceID(String instanceID) {
					this.instanceID = instanceID;
				}

				public String getInstanceType() {
					return this.instanceType;
				}

				public void setInstanceType(String instanceType) {
					this.instanceType = instanceType;
				}

				public String getEngineName() {
					return this.engineName;
				}

				public void setEngineName(String engineName) {
					this.engineName = engineName;
				}

				public String getIp() {
					return this.ip;
				}

				public void setIp(String ip) {
					this.ip = ip;
				}

				public String getPort() {
					return this.port;
				}

				public void setPort(String port) {
					this.port = port;
				}

				public String getDatabaseName() {
					return this.databaseName;
				}

				public void setDatabaseName(String databaseName) {
					this.databaseName = databaseName;
				}

				public String getOracleSID() {
					return this.oracleSID;
				}

				public void setOracleSID(String oracleSID) {
					this.oracleSID = oracleSID;
				}

				public String getUserName() {
					return this.userName;
				}

				public void setUserName(String userName) {
					this.userName = userName;
				}

				public String getSslSolutionEnum() {
					return this.sslSolutionEnum;
				}

				public void setSslSolutionEnum(String sslSolutionEnum) {
					this.sslSolutionEnum = sslSolutionEnum;
				}

				public String getRegion() {
					return this.region;
				}

				public void setRegion(String region) {
					this.region = region;
				}
			}

			public static class DestinationEndpoint2 {

				private String instanceID;

				private String instanceType;

				private String engineName;

				private String ip;

				private String port;

				private String databaseName;

				private String oracleSID;

				private String userName;

				private String sslSolutionEnum;

				private String region;

				public String getInstanceID() {
					return this.instanceID;
				}

				public void setInstanceID(String instanceID) {
					this.instanceID = instanceID;
				}

				public String getInstanceType() {
					return this.instanceType;
				}

				public void setInstanceType(String instanceType) {
					this.instanceType = instanceType;
				}

				public String getEngineName() {
					return this.engineName;
				}

				public void setEngineName(String engineName) {
					this.engineName = engineName;
				}

				public String getIp() {
					return this.ip;
				}

				public void setIp(String ip) {
					this.ip = ip;
				}

				public String getPort() {
					return this.port;
				}

				public void setPort(String port) {
					this.port = port;
				}

				public String getDatabaseName() {
					return this.databaseName;
				}

				public void setDatabaseName(String databaseName) {
					this.databaseName = databaseName;
				}

				public String getOracleSID() {
					return this.oracleSID;
				}

				public void setOracleSID(String oracleSID) {
					this.oracleSID = oracleSID;
				}

				public String getUserName() {
					return this.userName;
				}

				public void setUserName(String userName) {
					this.userName = userName;
				}

				public String getSslSolutionEnum() {
					return this.sslSolutionEnum;
				}

				public void setSslSolutionEnum(String sslSolutionEnum) {
					this.sslSolutionEnum = sslSolutionEnum;
				}

				public String getRegion() {
					return this.region;
				}

				public void setRegion(String region) {
					this.region = region;
				}
			}

			public static class MigrationMode3 {

				private Boolean structureInitialization;

				private Boolean dataInitialization;

				private Boolean dataSynchronization;

				public Boolean getStructureInitialization() {
					return this.structureInitialization;
				}

				public void setStructureInitialization(Boolean structureInitialization) {
					this.structureInitialization = structureInitialization;
				}

				public Boolean getDataInitialization() {
					return this.dataInitialization;
				}

				public void setDataInitialization(Boolean dataInitialization) {
					this.dataInitialization = dataInitialization;
				}

				public Boolean getDataSynchronization() {
					return this.dataSynchronization;
				}

				public void setDataSynchronization(Boolean dataSynchronization) {
					this.dataSynchronization = dataSynchronization;
				}
			}

			public static class PrecheckStatus4 {

				private String status;

				private String percent;

				private String errorMessage;

				private List<PrecheckDetail10> detail9;

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public String getPercent() {
					return this.percent;
				}

				public void setPercent(String percent) {
					this.percent = percent;
				}

				public String getErrorMessage() {
					return this.errorMessage;
				}

				public void setErrorMessage(String errorMessage) {
					this.errorMessage = errorMessage;
				}

				public List<PrecheckDetail10> getDetail9() {
					return this.detail9;
				}

				public void setDetail9(List<PrecheckDetail10> detail9) {
					this.detail9 = detail9;
				}

				public static class PrecheckDetail10 {

					private String checkItem;

					private String checkItemDescription;

					private String checkResult;

					private String failedReason;

					private String repairMethod;

					public String getCheckItem() {
						return this.checkItem;
					}

					public void setCheckItem(String checkItem) {
						this.checkItem = checkItem;
					}

					public String getCheckItemDescription() {
						return this.checkItemDescription;
					}

					public void setCheckItemDescription(String checkItemDescription) {
						this.checkItemDescription = checkItemDescription;
					}

					public String getCheckResult() {
						return this.checkResult;
					}

					public void setCheckResult(String checkResult) {
						this.checkResult = checkResult;
					}

					public String getFailedReason() {
						return this.failedReason;
					}

					public void setFailedReason(String failedReason) {
						this.failedReason = failedReason;
					}

					public String getRepairMethod() {
						return this.repairMethod;
					}

					public void setRepairMethod(String repairMethod) {
						this.repairMethod = repairMethod;
					}
				}
			}

			public static class StructureInitializationStatus5 {

				private String status;

				private String errorMessage;

				private String percent;

				private String progress;

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public String getErrorMessage() {
					return this.errorMessage;
				}

				public void setErrorMessage(String errorMessage) {
					this.errorMessage = errorMessage;
				}

				public String getPercent() {
					return this.percent;
				}

				public void setPercent(String percent) {
					this.percent = percent;
				}

				public String getProgress() {
					return this.progress;
				}

				public void setProgress(String progress) {
					this.progress = progress;
				}
			}

			public static class DataInitializationStatus6 {

				private String status;

				private String errorMessage;

				private String percent;

				private String progress;

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public String getErrorMessage() {
					return this.errorMessage;
				}

				public void setErrorMessage(String errorMessage) {
					this.errorMessage = errorMessage;
				}

				public String getPercent() {
					return this.percent;
				}

				public void setPercent(String percent) {
					this.percent = percent;
				}

				public String getProgress() {
					return this.progress;
				}

				public void setProgress(String progress) {
					this.progress = progress;
				}
			}

			public static class DataSynchronizationStatus7 {

				private String status;

				private String errorMessage;

				private String percent;

				private String progress;

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public String getErrorMessage() {
					return this.errorMessage;
				}

				public void setErrorMessage(String errorMessage) {
					this.errorMessage = errorMessage;
				}

				public String getPercent() {
					return this.percent;
				}

				public void setPercent(String percent) {
					this.percent = percent;
				}

				public String getProgress() {
					return this.progress;
				}

				public void setProgress(String progress) {
					this.progress = progress;
				}
			}

			public static class Performance8 {

				private String rps;

				private String flow;

				public String getRps() {
					return this.rps;
				}

				public void setRps(String rps) {
					this.rps = rps;
				}

				public String getFlow() {
					return this.flow;
				}

				public void setFlow(String flow) {
					this.flow = flow;
				}
			}
		}
	}

	@Override
	public DescribeDtsJobsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDtsJobsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
