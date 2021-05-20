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

	private String dynamicCode;

	private String dynamicMessage;

	private String errCode;

	private String errMessage;

	private Integer httpStatusCode;

	private Integer pageNumber;

	private Integer pageRecordCount;

	private String requestId;

	private Boolean success;

	private Integer totalRecordCount;

	private List<DtsJobStatus> dtsJobList;

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

		private String checkpoint;

		private String createTime;

		private String dbObject;

		private Integer delay;

		private String dtsInstanceID;

		private String dtsJobClass;

		private String dtsJobDirection;

		private String dtsJobId;

		private String dtsJobName;

		private String errorMessage;

		private String expireTime;

		private String payType;

		private String reserved;

		private String status;

		private String consumptionClient;

		private String beginTimestamp;

		private String endTimestamp;

		private String consumptionCheckpoint;

		private String appName;

		private List<DtsTag> tagList;

		private DataInitializationStatus dataInitializationStatus;

		private DataSynchronizationStatus dataSynchronizationStatus;

		private DataEtlStatus dataEtlStatus;

		private DestinationEndpoint destinationEndpoint;

		private MigrationMode migrationMode;

		private Performance performance;

		private PrecheckStatus precheckStatus;

		private ReverseJob reverseJob;

		private SourceEndpoint sourceEndpoint;

		private StructureInitializationStatus structureInitializationStatus;

		public String getCheckpoint() {
			return this.checkpoint;
		}

		public void setCheckpoint(String checkpoint) {
			this.checkpoint = checkpoint;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getDbObject() {
			return this.dbObject;
		}

		public void setDbObject(String dbObject) {
			this.dbObject = dbObject;
		}

		public Integer getDelay() {
			return this.delay;
		}

		public void setDelay(Integer delay) {
			this.delay = delay;
		}

		public String getDtsInstanceID() {
			return this.dtsInstanceID;
		}

		public void setDtsInstanceID(String dtsInstanceID) {
			this.dtsInstanceID = dtsInstanceID;
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

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public String getPayType() {
			return this.payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
		}

		public String getReserved() {
			return this.reserved;
		}

		public void setReserved(String reserved) {
			this.reserved = reserved;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getConsumptionClient() {
			return this.consumptionClient;
		}

		public void setConsumptionClient(String consumptionClient) {
			this.consumptionClient = consumptionClient;
		}

		public String getBeginTimestamp() {
			return this.beginTimestamp;
		}

		public void setBeginTimestamp(String beginTimestamp) {
			this.beginTimestamp = beginTimestamp;
		}

		public String getEndTimestamp() {
			return this.endTimestamp;
		}

		public void setEndTimestamp(String endTimestamp) {
			this.endTimestamp = endTimestamp;
		}

		public String getConsumptionCheckpoint() {
			return this.consumptionCheckpoint;
		}

		public void setConsumptionCheckpoint(String consumptionCheckpoint) {
			this.consumptionCheckpoint = consumptionCheckpoint;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public List<DtsTag> getTagList() {
			return this.tagList;
		}

		public void setTagList(List<DtsTag> tagList) {
			this.tagList = tagList;
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

		public DataEtlStatus getDataEtlStatus() {
			return this.dataEtlStatus;
		}

		public void setDataEtlStatus(DataEtlStatus dataEtlStatus) {
			this.dataEtlStatus = dataEtlStatus;
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

		public Performance getPerformance() {
			return this.performance;
		}

		public void setPerformance(Performance performance) {
			this.performance = performance;
		}

		public PrecheckStatus getPrecheckStatus() {
			return this.precheckStatus;
		}

		public void setPrecheckStatus(PrecheckStatus precheckStatus) {
			this.precheckStatus = precheckStatus;
		}

		public ReverseJob getReverseJob() {
			return this.reverseJob;
		}

		public void setReverseJob(ReverseJob reverseJob) {
			this.reverseJob = reverseJob;
		}

		public SourceEndpoint getSourceEndpoint() {
			return this.sourceEndpoint;
		}

		public void setSourceEndpoint(SourceEndpoint sourceEndpoint) {
			this.sourceEndpoint = sourceEndpoint;
		}

		public StructureInitializationStatus getStructureInitializationStatus() {
			return this.structureInitializationStatus;
		}

		public void setStructureInitializationStatus(StructureInitializationStatus structureInitializationStatus) {
			this.structureInitializationStatus = structureInitializationStatus;
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

		public static class DataInitializationStatus {

			private String errorMessage;

			private String percent;

			private String progress;

			private String status;

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

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}

		public static class DataSynchronizationStatus {

			private String errorMessage;

			private String percent;

			private String progress;

			private String status;

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

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}

		public static class DataEtlStatus {

			private String errorMessage;

			private String percent;

			private String progress;

			private String status;

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

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}

		public static class DestinationEndpoint {

			private String databaseName;

			private String engineName;

			private String instanceID;

			private String instanceType;

			private String ip;

			private String oracleSID;

			private String port;

			private String region;

			private String sslSolutionEnum;

			private String userName;

			public String getDatabaseName() {
				return this.databaseName;
			}

			public void setDatabaseName(String databaseName) {
				this.databaseName = databaseName;
			}

			public String getEngineName() {
				return this.engineName;
			}

			public void setEngineName(String engineName) {
				this.engineName = engineName;
			}

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

			public String getIp() {
				return this.ip;
			}

			public void setIp(String ip) {
				this.ip = ip;
			}

			public String getOracleSID() {
				return this.oracleSID;
			}

			public void setOracleSID(String oracleSID) {
				this.oracleSID = oracleSID;
			}

			public String getPort() {
				return this.port;
			}

			public void setPort(String port) {
				this.port = port;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public String getSslSolutionEnum() {
				return this.sslSolutionEnum;
			}

			public void setSslSolutionEnum(String sslSolutionEnum) {
				this.sslSolutionEnum = sslSolutionEnum;
			}

			public String getUserName() {
				return this.userName;
			}

			public void setUserName(String userName) {
				this.userName = userName;
			}
		}

		public static class MigrationMode {

			private Boolean dataInitialization;

			private Boolean dataSynchronization;

			private Boolean structureInitialization;

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

			public Boolean getStructureInitialization() {
				return this.structureInitialization;
			}

			public void setStructureInitialization(Boolean structureInitialization) {
				this.structureInitialization = structureInitialization;
			}
		}

		public static class Performance {

			private String flow;

			private String rps;

			public String getFlow() {
				return this.flow;
			}

			public void setFlow(String flow) {
				this.flow = flow;
			}

			public String getRps() {
				return this.rps;
			}

			public void setRps(String rps) {
				this.rps = rps;
			}
		}

		public static class PrecheckStatus {

			private String errorMessage;

			private String percent;

			private String status;

			private List<PrecheckDetail> detail;

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

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
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

		public static class ReverseJob {

			private String checkpoint;

			private String createTime;

			private String dbObject;

			private Integer delay;

			private String dtsInstanceID;

			private String dtsJobClass;

			private String dtsJobDirection;

			private String dtsJobId;

			private String dtsJobName;

			private String errorMessage;

			private String expireTime;

			private String payType;

			private String reserved;

			private String status;

			private DataInitializationStatus1 dataInitializationStatus1;

			private DataSynchronizationStatus2 dataSynchronizationStatus2;

			private DestinationEndpoint3 destinationEndpoint3;

			private MigrationMode4 migrationMode4;

			private Performance5 performance5;

			private PrecheckStatus6 precheckStatus6;

			private SourceEndpoint7 sourceEndpoint7;

			private StructureInitializationStatus8 structureInitializationStatus8;

			public String getCheckpoint() {
				return this.checkpoint;
			}

			public void setCheckpoint(String checkpoint) {
				this.checkpoint = checkpoint;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getDbObject() {
				return this.dbObject;
			}

			public void setDbObject(String dbObject) {
				this.dbObject = dbObject;
			}

			public Integer getDelay() {
				return this.delay;
			}

			public void setDelay(Integer delay) {
				this.delay = delay;
			}

			public String getDtsInstanceID() {
				return this.dtsInstanceID;
			}

			public void setDtsInstanceID(String dtsInstanceID) {
				this.dtsInstanceID = dtsInstanceID;
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

			public String getErrorMessage() {
				return this.errorMessage;
			}

			public void setErrorMessage(String errorMessage) {
				this.errorMessage = errorMessage;
			}

			public String getExpireTime() {
				return this.expireTime;
			}

			public void setExpireTime(String expireTime) {
				this.expireTime = expireTime;
			}

			public String getPayType() {
				return this.payType;
			}

			public void setPayType(String payType) {
				this.payType = payType;
			}

			public String getReserved() {
				return this.reserved;
			}

			public void setReserved(String reserved) {
				this.reserved = reserved;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public DataInitializationStatus1 getDataInitializationStatus1() {
				return this.dataInitializationStatus1;
			}

			public void setDataInitializationStatus1(DataInitializationStatus1 dataInitializationStatus1) {
				this.dataInitializationStatus1 = dataInitializationStatus1;
			}

			public DataSynchronizationStatus2 getDataSynchronizationStatus2() {
				return this.dataSynchronizationStatus2;
			}

			public void setDataSynchronizationStatus2(DataSynchronizationStatus2 dataSynchronizationStatus2) {
				this.dataSynchronizationStatus2 = dataSynchronizationStatus2;
			}

			public DestinationEndpoint3 getDestinationEndpoint3() {
				return this.destinationEndpoint3;
			}

			public void setDestinationEndpoint3(DestinationEndpoint3 destinationEndpoint3) {
				this.destinationEndpoint3 = destinationEndpoint3;
			}

			public MigrationMode4 getMigrationMode4() {
				return this.migrationMode4;
			}

			public void setMigrationMode4(MigrationMode4 migrationMode4) {
				this.migrationMode4 = migrationMode4;
			}

			public Performance5 getPerformance5() {
				return this.performance5;
			}

			public void setPerformance5(Performance5 performance5) {
				this.performance5 = performance5;
			}

			public PrecheckStatus6 getPrecheckStatus6() {
				return this.precheckStatus6;
			}

			public void setPrecheckStatus6(PrecheckStatus6 precheckStatus6) {
				this.precheckStatus6 = precheckStatus6;
			}

			public SourceEndpoint7 getSourceEndpoint7() {
				return this.sourceEndpoint7;
			}

			public void setSourceEndpoint7(SourceEndpoint7 sourceEndpoint7) {
				this.sourceEndpoint7 = sourceEndpoint7;
			}

			public StructureInitializationStatus8 getStructureInitializationStatus8() {
				return this.structureInitializationStatus8;
			}

			public void setStructureInitializationStatus8(StructureInitializationStatus8 structureInitializationStatus8) {
				this.structureInitializationStatus8 = structureInitializationStatus8;
			}

			public static class DataInitializationStatus1 {

				private String errorMessage;

				private String percent;

				private String progress;

				private String status;

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

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}
			}

			public static class DataSynchronizationStatus2 {

				private String errorMessage;

				private String percent;

				private String progress;

				private String status;

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

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}
			}

			public static class DestinationEndpoint3 {

				private String databaseName;

				private String engineName;

				private String instanceID;

				private String instanceType;

				private String ip;

				private String oracleSID;

				private String port;

				private String region;

				private String sslSolutionEnum;

				private String userName;

				public String getDatabaseName() {
					return this.databaseName;
				}

				public void setDatabaseName(String databaseName) {
					this.databaseName = databaseName;
				}

				public String getEngineName() {
					return this.engineName;
				}

				public void setEngineName(String engineName) {
					this.engineName = engineName;
				}

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

				public String getIp() {
					return this.ip;
				}

				public void setIp(String ip) {
					this.ip = ip;
				}

				public String getOracleSID() {
					return this.oracleSID;
				}

				public void setOracleSID(String oracleSID) {
					this.oracleSID = oracleSID;
				}

				public String getPort() {
					return this.port;
				}

				public void setPort(String port) {
					this.port = port;
				}

				public String getRegion() {
					return this.region;
				}

				public void setRegion(String region) {
					this.region = region;
				}

				public String getSslSolutionEnum() {
					return this.sslSolutionEnum;
				}

				public void setSslSolutionEnum(String sslSolutionEnum) {
					this.sslSolutionEnum = sslSolutionEnum;
				}

				public String getUserName() {
					return this.userName;
				}

				public void setUserName(String userName) {
					this.userName = userName;
				}
			}

			public static class MigrationMode4 {

				private Boolean dataInitialization;

				private Boolean dataSynchronization;

				private Boolean structureInitialization;

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

				public Boolean getStructureInitialization() {
					return this.structureInitialization;
				}

				public void setStructureInitialization(Boolean structureInitialization) {
					this.structureInitialization = structureInitialization;
				}
			}

			public static class Performance5 {

				private String flow;

				private String rps;

				public String getFlow() {
					return this.flow;
				}

				public void setFlow(String flow) {
					this.flow = flow;
				}

				public String getRps() {
					return this.rps;
				}

				public void setRps(String rps) {
					this.rps = rps;
				}
			}

			public static class PrecheckStatus6 {

				private String errorMessage;

				private String percent;

				private String status;

				private List<PrecheckDetail10> detail9;

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

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
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

			public static class SourceEndpoint7 {

				private String databaseName;

				private String engineName;

				private String instanceID;

				private String instanceType;

				private String ip;

				private String oracleSID;

				private String port;

				private String region;

				private String sslSolutionEnum;

				private String userName;

				public String getDatabaseName() {
					return this.databaseName;
				}

				public void setDatabaseName(String databaseName) {
					this.databaseName = databaseName;
				}

				public String getEngineName() {
					return this.engineName;
				}

				public void setEngineName(String engineName) {
					this.engineName = engineName;
				}

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

				public String getIp() {
					return this.ip;
				}

				public void setIp(String ip) {
					this.ip = ip;
				}

				public String getOracleSID() {
					return this.oracleSID;
				}

				public void setOracleSID(String oracleSID) {
					this.oracleSID = oracleSID;
				}

				public String getPort() {
					return this.port;
				}

				public void setPort(String port) {
					this.port = port;
				}

				public String getRegion() {
					return this.region;
				}

				public void setRegion(String region) {
					this.region = region;
				}

				public String getSslSolutionEnum() {
					return this.sslSolutionEnum;
				}

				public void setSslSolutionEnum(String sslSolutionEnum) {
					this.sslSolutionEnum = sslSolutionEnum;
				}

				public String getUserName() {
					return this.userName;
				}

				public void setUserName(String userName) {
					this.userName = userName;
				}
			}

			public static class StructureInitializationStatus8 {

				private String errorMessage;

				private String percent;

				private String progress;

				private String status;

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

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}
			}
		}

		public static class SourceEndpoint {

			private String databaseName;

			private String engineName;

			private String instanceID;

			private String instanceType;

			private String ip;

			private String oracleSID;

			private String port;

			private String region;

			private String sslSolutionEnum;

			private String userName;

			public String getDatabaseName() {
				return this.databaseName;
			}

			public void setDatabaseName(String databaseName) {
				this.databaseName = databaseName;
			}

			public String getEngineName() {
				return this.engineName;
			}

			public void setEngineName(String engineName) {
				this.engineName = engineName;
			}

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

			public String getIp() {
				return this.ip;
			}

			public void setIp(String ip) {
				this.ip = ip;
			}

			public String getOracleSID() {
				return this.oracleSID;
			}

			public void setOracleSID(String oracleSID) {
				this.oracleSID = oracleSID;
			}

			public String getPort() {
				return this.port;
			}

			public void setPort(String port) {
				this.port = port;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public String getSslSolutionEnum() {
				return this.sslSolutionEnum;
			}

			public void setSslSolutionEnum(String sslSolutionEnum) {
				this.sslSolutionEnum = sslSolutionEnum;
			}

			public String getUserName() {
				return this.userName;
			}

			public void setUserName(String userName) {
				this.userName = userName;
			}
		}

		public static class StructureInitializationStatus {

			private String errorMessage;

			private String percent;

			private String progress;

			private String status;

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

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
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
