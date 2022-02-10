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
import com.aliyuncs.dts.transform.v20200101.DescribeDtsJobDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDtsJobDetailResponse extends AcsResponse {

	private String status;

	private String dtsJobName;

	private String finishTime;

	private String errorMessage;

	private String dtsJobId;

	private String createTime;

	private String payType;

	private String reserved;

	private Integer databaseCount;

	private String dtsJobClass;

	private String endTimestamp;

	private String appName;

	private String destNetType;

	private String subscribeTopic;

	private String dtsInstanceID;

	private String requestId;

	private Integer code;

	private Long checkpoint;

	private Long delay;

	private String expireTime;

	private String errCode;

	private Boolean success;

	private String errMessage;

	private String consumptionClient;

	private String dbObject;

	private String dynamicMessage;

	private String consumptionCheckpoint;

	private String etlCalculator;

	private Integer httpStatusCode;

	private String beginTimestamp;

	private String groupId;

	private String synchronizationDirection;

	private String dtsJobDirection;

	private Boolean demoJob;

	private String jobType;

	private String taskType;

	private List<SubDistributedJobItem> subDistributedJob;

	private List<SubSyncJobItem> subSyncJob;

	private SourceEndpoint sourceEndpoint;

	private DestinationEndpoint destinationEndpoint;

	private MigrationMode migrationMode;

	private SubscriptionHost subscriptionHost;

	private SubscriptionDataType subscriptionDataType;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDtsJobName() {
		return this.dtsJobName;
	}

	public void setDtsJobName(String dtsJobName) {
		this.dtsJobName = dtsJobName;
	}

	public String getFinishTime() {
		return this.finishTime;
	}

	public void setFinishTime(String finishTime) {
		this.finishTime = finishTime;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getDtsJobId() {
		return this.dtsJobId;
	}

	public void setDtsJobId(String dtsJobId) {
		this.dtsJobId = dtsJobId;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
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

	public Integer getDatabaseCount() {
		return this.databaseCount;
	}

	public void setDatabaseCount(Integer databaseCount) {
		this.databaseCount = databaseCount;
	}

	public String getDtsJobClass() {
		return this.dtsJobClass;
	}

	public void setDtsJobClass(String dtsJobClass) {
		this.dtsJobClass = dtsJobClass;
	}

	public String getEndTimestamp() {
		return this.endTimestamp;
	}

	public void setEndTimestamp(String endTimestamp) {
		this.endTimestamp = endTimestamp;
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getDestNetType() {
		return this.destNetType;
	}

	public void setDestNetType(String destNetType) {
		this.destNetType = destNetType;
	}

	public String getSubscribeTopic() {
		return this.subscribeTopic;
	}

	public void setSubscribeTopic(String subscribeTopic) {
		this.subscribeTopic = subscribeTopic;
	}

	public String getDtsInstanceID() {
		return this.dtsInstanceID;
	}

	public void setDtsInstanceID(String dtsInstanceID) {
		this.dtsInstanceID = dtsInstanceID;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Long getCheckpoint() {
		return this.checkpoint;
	}

	public void setCheckpoint(Long checkpoint) {
		this.checkpoint = checkpoint;
	}

	public Long getDelay() {
		return this.delay;
	}

	public void setDelay(Long delay) {
		this.delay = delay;
	}

	public String getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public String getErrCode() {
		return this.errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrMessage() {
		return this.errMessage;
	}

	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}

	public String getConsumptionClient() {
		return this.consumptionClient;
	}

	public void setConsumptionClient(String consumptionClient) {
		this.consumptionClient = consumptionClient;
	}

	public String getDbObject() {
		return this.dbObject;
	}

	public void setDbObject(String dbObject) {
		this.dbObject = dbObject;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public String getConsumptionCheckpoint() {
		return this.consumptionCheckpoint;
	}

	public void setConsumptionCheckpoint(String consumptionCheckpoint) {
		this.consumptionCheckpoint = consumptionCheckpoint;
	}

	public String getEtlCalculator() {
		return this.etlCalculator;
	}

	public void setEtlCalculator(String etlCalculator) {
		this.etlCalculator = etlCalculator;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getBeginTimestamp() {
		return this.beginTimestamp;
	}

	public void setBeginTimestamp(String beginTimestamp) {
		this.beginTimestamp = beginTimestamp;
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getSynchronizationDirection() {
		return this.synchronizationDirection;
	}

	public void setSynchronizationDirection(String synchronizationDirection) {
		this.synchronizationDirection = synchronizationDirection;
	}

	public String getDtsJobDirection() {
		return this.dtsJobDirection;
	}

	public void setDtsJobDirection(String dtsJobDirection) {
		this.dtsJobDirection = dtsJobDirection;
	}

	public Boolean getDemoJob() {
		return this.demoJob;
	}

	public void setDemoJob(Boolean demoJob) {
		this.demoJob = demoJob;
	}

	public String getJobType() {
		return this.jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public String getTaskType() {
		return this.taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

	public List<SubDistributedJobItem> getSubDistributedJob() {
		return this.subDistributedJob;
	}

	public void setSubDistributedJob(List<SubDistributedJobItem> subDistributedJob) {
		this.subDistributedJob = subDistributedJob;
	}

	public List<SubSyncJobItem> getSubSyncJob() {
		return this.subSyncJob;
	}

	public void setSubSyncJob(List<SubSyncJobItem> subSyncJob) {
		this.subSyncJob = subSyncJob;
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

	public SubscriptionHost getSubscriptionHost() {
		return this.subscriptionHost;
	}

	public void setSubscriptionHost(SubscriptionHost subscriptionHost) {
		this.subscriptionHost = subscriptionHost;
	}

	public SubscriptionDataType getSubscriptionDataType() {
		return this.subscriptionDataType;
	}

	public void setSubscriptionDataType(SubscriptionDataType subscriptionDataType) {
		this.subscriptionDataType = subscriptionDataType;
	}

	public static class SubDistributedJobItem {

		private String dtsInstanceID;

		private String dtsJobId;

		private String dtsJobName;

		private String groupId;

		private Integer databaseCount;

		private String dtsJobClass;

		private String dtsJobDirection;

		private String synchronizationDirection;

		private String payType;

		private String expireTime;

		private String createTime;

		private String finishTime;

		private String dbObject;

		private String status;

		private String errorMessage;

		private Long delay;

		private String checkpoint;

		private String reserved;

		private String subscribeTopic;

		private String consumptionCheckpoint;

		private String beginTimestamp;

		private String endTimestamp;

		private String consumptionClient;

		private String destNetType;

		private String appName;

		private String etlCalculator;

		private String originType;

		private String jobType;

		private Boolean isDemoJob;

		private String taskType;

		private List<TagListItem> tagList;

		private List<String> subSyncJob1;

		private SourceEndpoint2 sourceEndpoint2;

		private DestinationEndpoint3 destinationEndpoint3;

		private MigrationMode4 migrationMode4;

		private PrecheckStatus precheckStatus;

		private StructureInitializationStatus structureInitializationStatus;

		private DataInitializationStatus dataInitializationStatus;

		private DataSynchronizationStatus dataSynchronizationStatus;

		private DataEtlStatus dataEtlStatus;

		private Performance performance;

		private ReverseJob reverseJob;

		private SubscriptionHost5 subscriptionHost5;

		private SubscriptionDataType6 subscriptionDataType6;

		private RetryState retryState;

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

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public Integer getDatabaseCount() {
			return this.databaseCount;
		}

		public void setDatabaseCount(Integer databaseCount) {
			this.databaseCount = databaseCount;
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

		public String getSynchronizationDirection() {
			return this.synchronizationDirection;
		}

		public void setSynchronizationDirection(String synchronizationDirection) {
			this.synchronizationDirection = synchronizationDirection;
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

		public String getFinishTime() {
			return this.finishTime;
		}

		public void setFinishTime(String finishTime) {
			this.finishTime = finishTime;
		}

		public String getDbObject() {
			return this.dbObject;
		}

		public void setDbObject(String dbObject) {
			this.dbObject = dbObject;
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

		public Long getDelay() {
			return this.delay;
		}

		public void setDelay(Long delay) {
			this.delay = delay;
		}

		public String getCheckpoint() {
			return this.checkpoint;
		}

		public void setCheckpoint(String checkpoint) {
			this.checkpoint = checkpoint;
		}

		public String getReserved() {
			return this.reserved;
		}

		public void setReserved(String reserved) {
			this.reserved = reserved;
		}

		public String getSubscribeTopic() {
			return this.subscribeTopic;
		}

		public void setSubscribeTopic(String subscribeTopic) {
			this.subscribeTopic = subscribeTopic;
		}

		public String getConsumptionCheckpoint() {
			return this.consumptionCheckpoint;
		}

		public void setConsumptionCheckpoint(String consumptionCheckpoint) {
			this.consumptionCheckpoint = consumptionCheckpoint;
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

		public String getConsumptionClient() {
			return this.consumptionClient;
		}

		public void setConsumptionClient(String consumptionClient) {
			this.consumptionClient = consumptionClient;
		}

		public String getDestNetType() {
			return this.destNetType;
		}

		public void setDestNetType(String destNetType) {
			this.destNetType = destNetType;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getEtlCalculator() {
			return this.etlCalculator;
		}

		public void setEtlCalculator(String etlCalculator) {
			this.etlCalculator = etlCalculator;
		}

		public String getOriginType() {
			return this.originType;
		}

		public void setOriginType(String originType) {
			this.originType = originType;
		}

		public String getJobType() {
			return this.jobType;
		}

		public void setJobType(String jobType) {
			this.jobType = jobType;
		}

		public Boolean getIsDemoJob() {
			return this.isDemoJob;
		}

		public void setIsDemoJob(Boolean isDemoJob) {
			this.isDemoJob = isDemoJob;
		}

		public String getTaskType() {
			return this.taskType;
		}

		public void setTaskType(String taskType) {
			this.taskType = taskType;
		}

		public List<TagListItem> getTagList() {
			return this.tagList;
		}

		public void setTagList(List<TagListItem> tagList) {
			this.tagList = tagList;
		}

		public List<String> getSubSyncJob1() {
			return this.subSyncJob1;
		}

		public void setSubSyncJob1(List<String> subSyncJob1) {
			this.subSyncJob1 = subSyncJob1;
		}

		public SourceEndpoint2 getSourceEndpoint2() {
			return this.sourceEndpoint2;
		}

		public void setSourceEndpoint2(SourceEndpoint2 sourceEndpoint2) {
			this.sourceEndpoint2 = sourceEndpoint2;
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

		public DataEtlStatus getDataEtlStatus() {
			return this.dataEtlStatus;
		}

		public void setDataEtlStatus(DataEtlStatus dataEtlStatus) {
			this.dataEtlStatus = dataEtlStatus;
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

		public SubscriptionHost5 getSubscriptionHost5() {
			return this.subscriptionHost5;
		}

		public void setSubscriptionHost5(SubscriptionHost5 subscriptionHost5) {
			this.subscriptionHost5 = subscriptionHost5;
		}

		public SubscriptionDataType6 getSubscriptionDataType6() {
			return this.subscriptionDataType6;
		}

		public void setSubscriptionDataType6(SubscriptionDataType6 subscriptionDataType6) {
			this.subscriptionDataType6 = subscriptionDataType6;
		}

		public RetryState getRetryState() {
			return this.retryState;
		}

		public void setRetryState(RetryState retryState) {
			this.retryState = retryState;
		}

		public static class TagListItem {

			private Long id;

			private String gmtCreate;

			private String gmtModified;

			private String resourceId;

			private String resourceType;

			private String regionId;

			private Long aliUid;

			private String tagKey;

			private String tagValue;

			private String tagCategory;

			private String srcRegion;

			private String scope;

			private Long creator;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getResourceId() {
				return this.resourceId;
			}

			public void setResourceId(String resourceId) {
				this.resourceId = resourceId;
			}

			public String getResourceType() {
				return this.resourceType;
			}

			public void setResourceType(String resourceType) {
				this.resourceType = resourceType;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public Long getAliUid() {
				return this.aliUid;
			}

			public void setAliUid(Long aliUid) {
				this.aliUid = aliUid;
			}

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

			public String getTagCategory() {
				return this.tagCategory;
			}

			public void setTagCategory(String tagCategory) {
				this.tagCategory = tagCategory;
			}

			public String getSrcRegion() {
				return this.srcRegion;
			}

			public void setSrcRegion(String srcRegion) {
				this.srcRegion = srcRegion;
			}

			public String getScope() {
				return this.scope;
			}

			public void setScope(String scope) {
				this.scope = scope;
			}

			public Long getCreator() {
				return this.creator;
			}

			public void setCreator(Long creator) {
				this.creator = creator;
			}
		}

		public static class SourceEndpoint2 {

			private String instanceID;

			private String region;

			private String instanceType;

			private String engineName;

			private String ip;

			private String port;

			private String databaseName;

			private String oracleSID;

			private String userName;

			private String sslSolutionEnum;

			private String roleName;

			private String aliyunUid;

			public String getInstanceID() {
				return this.instanceID;
			}

			public void setInstanceID(String instanceID) {
				this.instanceID = instanceID;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
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

			public String getRoleName() {
				return this.roleName;
			}

			public void setRoleName(String roleName) {
				this.roleName = roleName;
			}

			public String getAliyunUid() {
				return this.aliyunUid;
			}

			public void setAliyunUid(String aliyunUid) {
				this.aliyunUid = aliyunUid;
			}
		}

		public static class DestinationEndpoint3 {

			private String instanceID;

			private String region;

			private String instanceType;

			private String engineName;

			private String ip;

			private String port;

			private String databaseName;

			private String oracleSID;

			private String userName;

			private String sslSolutionEnum;

			private String roleName;

			private String aliyunUid;

			public String getInstanceID() {
				return this.instanceID;
			}

			public void setInstanceID(String instanceID) {
				this.instanceID = instanceID;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
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

			public String getRoleName() {
				return this.roleName;
			}

			public void setRoleName(String roleName) {
				this.roleName = roleName;
			}

			public String getAliyunUid() {
				return this.aliyunUid;
			}

			public void setAliyunUid(String aliyunUid) {
				this.aliyunUid = aliyunUid;
			}
		}

		public static class MigrationMode4 {

			private Boolean structureInitialization;

			private Boolean dataInitialization;

			private Boolean dataSynchronization;

			private Boolean dataExtractTransformLoad;

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

			public Boolean getDataExtractTransformLoad() {
				return this.dataExtractTransformLoad;
			}

			public void setDataExtractTransformLoad(Boolean dataExtractTransformLoad) {
				this.dataExtractTransformLoad = dataExtractTransformLoad;
			}
		}

		public static class PrecheckStatus {

			private String status;

			private String percent;

			private String errorMessage;

			private List<DetailItem> detail;

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

			public List<DetailItem> getDetail() {
				return this.detail;
			}

			public void setDetail(List<DetailItem> detail) {
				this.detail = detail;
			}

			public static class DetailItem {

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

			private Boolean needUpgrade;

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

			public Boolean getNeedUpgrade() {
				return this.needUpgrade;
			}

			public void setNeedUpgrade(Boolean needUpgrade) {
				this.needUpgrade = needUpgrade;
			}
		}

		public static class DataInitializationStatus {

			private String status;

			private String errorMessage;

			private String percent;

			private String progress;

			private Boolean needUpgrade;

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

			public Boolean getNeedUpgrade() {
				return this.needUpgrade;
			}

			public void setNeedUpgrade(Boolean needUpgrade) {
				this.needUpgrade = needUpgrade;
			}
		}

		public static class DataSynchronizationStatus {

			private String status;

			private String errorMessage;

			private String percent;

			private String progress;

			private Boolean needUpgrade;

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

			public Boolean getNeedUpgrade() {
				return this.needUpgrade;
			}

			public void setNeedUpgrade(Boolean needUpgrade) {
				this.needUpgrade = needUpgrade;
			}
		}

		public static class DataEtlStatus {

			private String status;

			private String errorMessage;

			private String percent;

			private String progress;

			private Boolean needUpgrade;

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

			public Boolean getNeedUpgrade() {
				return this.needUpgrade;
			}

			public void setNeedUpgrade(Boolean needUpgrade) {
				this.needUpgrade = needUpgrade;
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

			private String groupId;

			private Integer databaseCount;

			private String dtsJobClass;

			private String dtsJobDirection;

			private String synchronizationDirection;

			private String payType;

			private String expireTime;

			private String createTime;

			private String finishTime;

			private String dbObject;

			private String status;

			private String errorMessage;

			private Long delay;

			private String checkpoint;

			private Object reverseJob;

			private String reserved;

			private String subscribeTopic;

			private String consumptionCheckpoint;

			private String beginTimestamp;

			private String endTimestamp;

			private String consumptionClient;

			private String destNetType;

			private String appName;

			private String etlCalculator;

			private String originType;

			private String jobType;

			private Boolean isDemoJob;

			private String taskType;

			private List<TagListItem20> tagList19;

			private SourceEndpoint7 sourceEndpoint7;

			private DestinationEndpoint8 destinationEndpoint8;

			private MigrationMode9 migrationMode9;

			private PrecheckStatus10 precheckStatus10;

			private StructureInitializationStatus11 structureInitializationStatus11;

			private DataInitializationStatus12 dataInitializationStatus12;

			private DataSynchronizationStatus13 dataSynchronizationStatus13;

			private DataEtlStatus14 dataEtlStatus14;

			private Performance15 performance15;

			private SubscriptionHost16 subscriptionHost16;

			private SubscriptionDataType17 subscriptionDataType17;

			private RetryState18 retryState18;

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

			public String getGroupId() {
				return this.groupId;
			}

			public void setGroupId(String groupId) {
				this.groupId = groupId;
			}

			public Integer getDatabaseCount() {
				return this.databaseCount;
			}

			public void setDatabaseCount(Integer databaseCount) {
				this.databaseCount = databaseCount;
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

			public String getSynchronizationDirection() {
				return this.synchronizationDirection;
			}

			public void setSynchronizationDirection(String synchronizationDirection) {
				this.synchronizationDirection = synchronizationDirection;
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

			public String getFinishTime() {
				return this.finishTime;
			}

			public void setFinishTime(String finishTime) {
				this.finishTime = finishTime;
			}

			public String getDbObject() {
				return this.dbObject;
			}

			public void setDbObject(String dbObject) {
				this.dbObject = dbObject;
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

			public Long getDelay() {
				return this.delay;
			}

			public void setDelay(Long delay) {
				this.delay = delay;
			}

			public String getCheckpoint() {
				return this.checkpoint;
			}

			public void setCheckpoint(String checkpoint) {
				this.checkpoint = checkpoint;
			}

			public Object getReverseJob() {
				return this.reverseJob;
			}

			public void setReverseJob(Object reverseJob) {
				this.reverseJob = reverseJob;
			}

			public String getReserved() {
				return this.reserved;
			}

			public void setReserved(String reserved) {
				this.reserved = reserved;
			}

			public String getSubscribeTopic() {
				return this.subscribeTopic;
			}

			public void setSubscribeTopic(String subscribeTopic) {
				this.subscribeTopic = subscribeTopic;
			}

			public String getConsumptionCheckpoint() {
				return this.consumptionCheckpoint;
			}

			public void setConsumptionCheckpoint(String consumptionCheckpoint) {
				this.consumptionCheckpoint = consumptionCheckpoint;
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

			public String getConsumptionClient() {
				return this.consumptionClient;
			}

			public void setConsumptionClient(String consumptionClient) {
				this.consumptionClient = consumptionClient;
			}

			public String getDestNetType() {
				return this.destNetType;
			}

			public void setDestNetType(String destNetType) {
				this.destNetType = destNetType;
			}

			public String getAppName() {
				return this.appName;
			}

			public void setAppName(String appName) {
				this.appName = appName;
			}

			public String getEtlCalculator() {
				return this.etlCalculator;
			}

			public void setEtlCalculator(String etlCalculator) {
				this.etlCalculator = etlCalculator;
			}

			public String getOriginType() {
				return this.originType;
			}

			public void setOriginType(String originType) {
				this.originType = originType;
			}

			public String getJobType() {
				return this.jobType;
			}

			public void setJobType(String jobType) {
				this.jobType = jobType;
			}

			public Boolean getIsDemoJob() {
				return this.isDemoJob;
			}

			public void setIsDemoJob(Boolean isDemoJob) {
				this.isDemoJob = isDemoJob;
			}

			public String getTaskType() {
				return this.taskType;
			}

			public void setTaskType(String taskType) {
				this.taskType = taskType;
			}

			public List<TagListItem20> getTagList19() {
				return this.tagList19;
			}

			public void setTagList19(List<TagListItem20> tagList19) {
				this.tagList19 = tagList19;
			}

			public SourceEndpoint7 getSourceEndpoint7() {
				return this.sourceEndpoint7;
			}

			public void setSourceEndpoint7(SourceEndpoint7 sourceEndpoint7) {
				this.sourceEndpoint7 = sourceEndpoint7;
			}

			public DestinationEndpoint8 getDestinationEndpoint8() {
				return this.destinationEndpoint8;
			}

			public void setDestinationEndpoint8(DestinationEndpoint8 destinationEndpoint8) {
				this.destinationEndpoint8 = destinationEndpoint8;
			}

			public MigrationMode9 getMigrationMode9() {
				return this.migrationMode9;
			}

			public void setMigrationMode9(MigrationMode9 migrationMode9) {
				this.migrationMode9 = migrationMode9;
			}

			public PrecheckStatus10 getPrecheckStatus10() {
				return this.precheckStatus10;
			}

			public void setPrecheckStatus10(PrecheckStatus10 precheckStatus10) {
				this.precheckStatus10 = precheckStatus10;
			}

			public StructureInitializationStatus11 getStructureInitializationStatus11() {
				return this.structureInitializationStatus11;
			}

			public void setStructureInitializationStatus11(StructureInitializationStatus11 structureInitializationStatus11) {
				this.structureInitializationStatus11 = structureInitializationStatus11;
			}

			public DataInitializationStatus12 getDataInitializationStatus12() {
				return this.dataInitializationStatus12;
			}

			public void setDataInitializationStatus12(DataInitializationStatus12 dataInitializationStatus12) {
				this.dataInitializationStatus12 = dataInitializationStatus12;
			}

			public DataSynchronizationStatus13 getDataSynchronizationStatus13() {
				return this.dataSynchronizationStatus13;
			}

			public void setDataSynchronizationStatus13(DataSynchronizationStatus13 dataSynchronizationStatus13) {
				this.dataSynchronizationStatus13 = dataSynchronizationStatus13;
			}

			public DataEtlStatus14 getDataEtlStatus14() {
				return this.dataEtlStatus14;
			}

			public void setDataEtlStatus14(DataEtlStatus14 dataEtlStatus14) {
				this.dataEtlStatus14 = dataEtlStatus14;
			}

			public Performance15 getPerformance15() {
				return this.performance15;
			}

			public void setPerformance15(Performance15 performance15) {
				this.performance15 = performance15;
			}

			public SubscriptionHost16 getSubscriptionHost16() {
				return this.subscriptionHost16;
			}

			public void setSubscriptionHost16(SubscriptionHost16 subscriptionHost16) {
				this.subscriptionHost16 = subscriptionHost16;
			}

			public SubscriptionDataType17 getSubscriptionDataType17() {
				return this.subscriptionDataType17;
			}

			public void setSubscriptionDataType17(SubscriptionDataType17 subscriptionDataType17) {
				this.subscriptionDataType17 = subscriptionDataType17;
			}

			public RetryState18 getRetryState18() {
				return this.retryState18;
			}

			public void setRetryState18(RetryState18 retryState18) {
				this.retryState18 = retryState18;
			}

			public static class TagListItem20 {

				private Long id;

				private String gmtCreate;

				private String gmtModified;

				private String resourceId;

				private String resourceType;

				private String regionId;

				private Long aliUid;

				private String tagKey;

				private String tagValue;

				private String tagCategory;

				private String srcRegion;

				private String scope;

				private Long creator;

				public Long getId() {
					return this.id;
				}

				public void setId(Long id) {
					this.id = id;
				}

				public String getGmtCreate() {
					return this.gmtCreate;
				}

				public void setGmtCreate(String gmtCreate) {
					this.gmtCreate = gmtCreate;
				}

				public String getGmtModified() {
					return this.gmtModified;
				}

				public void setGmtModified(String gmtModified) {
					this.gmtModified = gmtModified;
				}

				public String getResourceId() {
					return this.resourceId;
				}

				public void setResourceId(String resourceId) {
					this.resourceId = resourceId;
				}

				public String getResourceType() {
					return this.resourceType;
				}

				public void setResourceType(String resourceType) {
					this.resourceType = resourceType;
				}

				public String getRegionId() {
					return this.regionId;
				}

				public void setRegionId(String regionId) {
					this.regionId = regionId;
				}

				public Long getAliUid() {
					return this.aliUid;
				}

				public void setAliUid(Long aliUid) {
					this.aliUid = aliUid;
				}

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

				public String getTagCategory() {
					return this.tagCategory;
				}

				public void setTagCategory(String tagCategory) {
					this.tagCategory = tagCategory;
				}

				public String getSrcRegion() {
					return this.srcRegion;
				}

				public void setSrcRegion(String srcRegion) {
					this.srcRegion = srcRegion;
				}

				public String getScope() {
					return this.scope;
				}

				public void setScope(String scope) {
					this.scope = scope;
				}

				public Long getCreator() {
					return this.creator;
				}

				public void setCreator(Long creator) {
					this.creator = creator;
				}
			}

			public static class SourceEndpoint7 {

				private String instanceID;

				private String region;

				private String instanceType;

				private String engineName;

				private String ip;

				private String port;

				private String databaseName;

				private String oracleSID;

				private String userName;

				private String sslSolutionEnum;

				private String roleName;

				private String aliyunUid;

				public String getInstanceID() {
					return this.instanceID;
				}

				public void setInstanceID(String instanceID) {
					this.instanceID = instanceID;
				}

				public String getRegion() {
					return this.region;
				}

				public void setRegion(String region) {
					this.region = region;
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

				public String getRoleName() {
					return this.roleName;
				}

				public void setRoleName(String roleName) {
					this.roleName = roleName;
				}

				public String getAliyunUid() {
					return this.aliyunUid;
				}

				public void setAliyunUid(String aliyunUid) {
					this.aliyunUid = aliyunUid;
				}
			}

			public static class DestinationEndpoint8 {

				private String instanceID;

				private String region;

				private String instanceType;

				private String engineName;

				private String ip;

				private String port;

				private String databaseName;

				private String oracleSID;

				private String userName;

				private String sslSolutionEnum;

				private String roleName;

				private String aliyunUid;

				public String getInstanceID() {
					return this.instanceID;
				}

				public void setInstanceID(String instanceID) {
					this.instanceID = instanceID;
				}

				public String getRegion() {
					return this.region;
				}

				public void setRegion(String region) {
					this.region = region;
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

				public String getRoleName() {
					return this.roleName;
				}

				public void setRoleName(String roleName) {
					this.roleName = roleName;
				}

				public String getAliyunUid() {
					return this.aliyunUid;
				}

				public void setAliyunUid(String aliyunUid) {
					this.aliyunUid = aliyunUid;
				}
			}

			public static class MigrationMode9 {

				private Boolean structureInitialization;

				private Boolean dataInitialization;

				private Boolean dataSynchronization;

				private Boolean dataExtractTransformLoad;

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

				public Boolean getDataExtractTransformLoad() {
					return this.dataExtractTransformLoad;
				}

				public void setDataExtractTransformLoad(Boolean dataExtractTransformLoad) {
					this.dataExtractTransformLoad = dataExtractTransformLoad;
				}
			}

			public static class PrecheckStatus10 {

				private String status;

				private String percent;

				private String errorMessage;

				private List<DetailItem22> detail21;

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

				public List<DetailItem22> getDetail21() {
					return this.detail21;
				}

				public void setDetail21(List<DetailItem22> detail21) {
					this.detail21 = detail21;
				}

				public static class DetailItem22 {

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

			public static class StructureInitializationStatus11 {

				private String status;

				private String errorMessage;

				private String percent;

				private String progress;

				private Boolean needUpgrade;

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

				public Boolean getNeedUpgrade() {
					return this.needUpgrade;
				}

				public void setNeedUpgrade(Boolean needUpgrade) {
					this.needUpgrade = needUpgrade;
				}
			}

			public static class DataInitializationStatus12 {

				private String status;

				private String errorMessage;

				private String percent;

				private String progress;

				private Boolean needUpgrade;

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

				public Boolean getNeedUpgrade() {
					return this.needUpgrade;
				}

				public void setNeedUpgrade(Boolean needUpgrade) {
					this.needUpgrade = needUpgrade;
				}
			}

			public static class DataSynchronizationStatus13 {

				private String status;

				private String errorMessage;

				private String percent;

				private String progress;

				private Boolean needUpgrade;

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

				public Boolean getNeedUpgrade() {
					return this.needUpgrade;
				}

				public void setNeedUpgrade(Boolean needUpgrade) {
					this.needUpgrade = needUpgrade;
				}
			}

			public static class DataEtlStatus14 {

				private String status;

				private String errorMessage;

				private String percent;

				private String progress;

				private Boolean needUpgrade;

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

				public Boolean getNeedUpgrade() {
					return this.needUpgrade;
				}

				public void setNeedUpgrade(Boolean needUpgrade) {
					this.needUpgrade = needUpgrade;
				}
			}

			public static class Performance15 {

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

			public static class SubscriptionHost16 {

				private String publicHost;

				private String privateHost;

				private String vpcHost;

				public String getPublicHost() {
					return this.publicHost;
				}

				public void setPublicHost(String publicHost) {
					this.publicHost = publicHost;
				}

				public String getPrivateHost() {
					return this.privateHost;
				}

				public void setPrivateHost(String privateHost) {
					this.privateHost = privateHost;
				}

				public String getVpcHost() {
					return this.vpcHost;
				}

				public void setVpcHost(String vpcHost) {
					this.vpcHost = vpcHost;
				}
			}

			public static class SubscriptionDataType17 {

				private Boolean ddl;

				private Boolean dml;

				public Boolean getDdl() {
					return this.ddl;
				}

				public void setDdl(Boolean ddl) {
					this.ddl = ddl;
				}

				public Boolean getDml() {
					return this.dml;
				}

				public void setDml(Boolean dml) {
					this.dml = dml;
				}
			}

			public static class RetryState18 {

				private String jobId;

				private Integer maxRetryTime;

				private Integer retryTime;

				private Integer retryCount;

				private Boolean retrying;

				private String module;

				private String retryTarget;

				private String errMsg;

				public String getJobId() {
					return this.jobId;
				}

				public void setJobId(String jobId) {
					this.jobId = jobId;
				}

				public Integer getMaxRetryTime() {
					return this.maxRetryTime;
				}

				public void setMaxRetryTime(Integer maxRetryTime) {
					this.maxRetryTime = maxRetryTime;
				}

				public Integer getRetryTime() {
					return this.retryTime;
				}

				public void setRetryTime(Integer retryTime) {
					this.retryTime = retryTime;
				}

				public Integer getRetryCount() {
					return this.retryCount;
				}

				public void setRetryCount(Integer retryCount) {
					this.retryCount = retryCount;
				}

				public Boolean getRetrying() {
					return this.retrying;
				}

				public void setRetrying(Boolean retrying) {
					this.retrying = retrying;
				}

				public String getModule() {
					return this.module;
				}

				public void setModule(String module) {
					this.module = module;
				}

				public String getRetryTarget() {
					return this.retryTarget;
				}

				public void setRetryTarget(String retryTarget) {
					this.retryTarget = retryTarget;
				}

				public String getErrMsg() {
					return this.errMsg;
				}

				public void setErrMsg(String errMsg) {
					this.errMsg = errMsg;
				}
			}
		}

		public static class SubscriptionHost5 {

			private String publicHost;

			private String privateHost;

			private String vpcHost;

			public String getPublicHost() {
				return this.publicHost;
			}

			public void setPublicHost(String publicHost) {
				this.publicHost = publicHost;
			}

			public String getPrivateHost() {
				return this.privateHost;
			}

			public void setPrivateHost(String privateHost) {
				this.privateHost = privateHost;
			}

			public String getVpcHost() {
				return this.vpcHost;
			}

			public void setVpcHost(String vpcHost) {
				this.vpcHost = vpcHost;
			}
		}

		public static class SubscriptionDataType6 {

			private Boolean ddl;

			private Boolean dml;

			public Boolean getDdl() {
				return this.ddl;
			}

			public void setDdl(Boolean ddl) {
				this.ddl = ddl;
			}

			public Boolean getDml() {
				return this.dml;
			}

			public void setDml(Boolean dml) {
				this.dml = dml;
			}
		}

		public static class RetryState {

			private String jobId;

			private Integer maxRetryTime;

			private Integer retryTime;

			private Integer retryCount;

			private Boolean retrying;

			private String module;

			private String retryTarget;

			private String errMsg;

			public String getJobId() {
				return this.jobId;
			}

			public void setJobId(String jobId) {
				this.jobId = jobId;
			}

			public Integer getMaxRetryTime() {
				return this.maxRetryTime;
			}

			public void setMaxRetryTime(Integer maxRetryTime) {
				this.maxRetryTime = maxRetryTime;
			}

			public Integer getRetryTime() {
				return this.retryTime;
			}

			public void setRetryTime(Integer retryTime) {
				this.retryTime = retryTime;
			}

			public Integer getRetryCount() {
				return this.retryCount;
			}

			public void setRetryCount(Integer retryCount) {
				this.retryCount = retryCount;
			}

			public Boolean getRetrying() {
				return this.retrying;
			}

			public void setRetrying(Boolean retrying) {
				this.retrying = retrying;
			}

			public String getModule() {
				return this.module;
			}

			public void setModule(String module) {
				this.module = module;
			}

			public String getRetryTarget() {
				return this.retryTarget;
			}

			public void setRetryTarget(String retryTarget) {
				this.retryTarget = retryTarget;
			}

			public String getErrMsg() {
				return this.errMsg;
			}

			public void setErrMsg(String errMsg) {
				this.errMsg = errMsg;
			}
		}
	}

	public static class SubSyncJobItem {

		private String dtsInstanceID;

		private String dtsJobId;

		private String dtsJobName;

		private String groupId;

		private Integer databaseCount;

		private String dtsJobClass;

		private String dtsJobDirection;

		private String synchronizationDirection;

		private String payType;

		private String expireTime;

		private String createTime;

		private String finishTime;

		private String dbObject;

		private String status;

		private String errorMessage;

		private Long delay;

		private String checkpoint;

		private String reserved;

		private String subscribeTopic;

		private String consumptionCheckpoint;

		private String beginTimestamp;

		private String endTimestamp;

		private String consumptionClient;

		private String destNetType;

		private String appName;

		private String etlCalculator;

		private String originType;

		private String jobType;

		private Boolean isDemoJob;

		private String taskType;

		private List<TagListItem38> tagList37;

		private List<String> subSyncJob23;

		private SourceEndpoint24 sourceEndpoint24;

		private DestinationEndpoint25 destinationEndpoint25;

		private MigrationMode26 migrationMode26;

		private PrecheckStatus27 precheckStatus27;

		private StructureInitializationStatus28 structureInitializationStatus28;

		private DataInitializationStatus29 dataInitializationStatus29;

		private DataSynchronizationStatus30 dataSynchronizationStatus30;

		private DataEtlStatus31 dataEtlStatus31;

		private Performance32 performance32;

		private ReverseJob33 reverseJob33;

		private SubscriptionHost34 subscriptionHost34;

		private SubscriptionDataType35 subscriptionDataType35;

		private RetryState36 retryState36;

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

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public Integer getDatabaseCount() {
			return this.databaseCount;
		}

		public void setDatabaseCount(Integer databaseCount) {
			this.databaseCount = databaseCount;
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

		public String getSynchronizationDirection() {
			return this.synchronizationDirection;
		}

		public void setSynchronizationDirection(String synchronizationDirection) {
			this.synchronizationDirection = synchronizationDirection;
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

		public String getFinishTime() {
			return this.finishTime;
		}

		public void setFinishTime(String finishTime) {
			this.finishTime = finishTime;
		}

		public String getDbObject() {
			return this.dbObject;
		}

		public void setDbObject(String dbObject) {
			this.dbObject = dbObject;
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

		public Long getDelay() {
			return this.delay;
		}

		public void setDelay(Long delay) {
			this.delay = delay;
		}

		public String getCheckpoint() {
			return this.checkpoint;
		}

		public void setCheckpoint(String checkpoint) {
			this.checkpoint = checkpoint;
		}

		public String getReserved() {
			return this.reserved;
		}

		public void setReserved(String reserved) {
			this.reserved = reserved;
		}

		public String getSubscribeTopic() {
			return this.subscribeTopic;
		}

		public void setSubscribeTopic(String subscribeTopic) {
			this.subscribeTopic = subscribeTopic;
		}

		public String getConsumptionCheckpoint() {
			return this.consumptionCheckpoint;
		}

		public void setConsumptionCheckpoint(String consumptionCheckpoint) {
			this.consumptionCheckpoint = consumptionCheckpoint;
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

		public String getConsumptionClient() {
			return this.consumptionClient;
		}

		public void setConsumptionClient(String consumptionClient) {
			this.consumptionClient = consumptionClient;
		}

		public String getDestNetType() {
			return this.destNetType;
		}

		public void setDestNetType(String destNetType) {
			this.destNetType = destNetType;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getEtlCalculator() {
			return this.etlCalculator;
		}

		public void setEtlCalculator(String etlCalculator) {
			this.etlCalculator = etlCalculator;
		}

		public String getOriginType() {
			return this.originType;
		}

		public void setOriginType(String originType) {
			this.originType = originType;
		}

		public String getJobType() {
			return this.jobType;
		}

		public void setJobType(String jobType) {
			this.jobType = jobType;
		}

		public Boolean getIsDemoJob() {
			return this.isDemoJob;
		}

		public void setIsDemoJob(Boolean isDemoJob) {
			this.isDemoJob = isDemoJob;
		}

		public String getTaskType() {
			return this.taskType;
		}

		public void setTaskType(String taskType) {
			this.taskType = taskType;
		}

		public List<TagListItem38> getTagList37() {
			return this.tagList37;
		}

		public void setTagList37(List<TagListItem38> tagList37) {
			this.tagList37 = tagList37;
		}

		public List<String> getSubSyncJob23() {
			return this.subSyncJob23;
		}

		public void setSubSyncJob23(List<String> subSyncJob23) {
			this.subSyncJob23 = subSyncJob23;
		}

		public SourceEndpoint24 getSourceEndpoint24() {
			return this.sourceEndpoint24;
		}

		public void setSourceEndpoint24(SourceEndpoint24 sourceEndpoint24) {
			this.sourceEndpoint24 = sourceEndpoint24;
		}

		public DestinationEndpoint25 getDestinationEndpoint25() {
			return this.destinationEndpoint25;
		}

		public void setDestinationEndpoint25(DestinationEndpoint25 destinationEndpoint25) {
			this.destinationEndpoint25 = destinationEndpoint25;
		}

		public MigrationMode26 getMigrationMode26() {
			return this.migrationMode26;
		}

		public void setMigrationMode26(MigrationMode26 migrationMode26) {
			this.migrationMode26 = migrationMode26;
		}

		public PrecheckStatus27 getPrecheckStatus27() {
			return this.precheckStatus27;
		}

		public void setPrecheckStatus27(PrecheckStatus27 precheckStatus27) {
			this.precheckStatus27 = precheckStatus27;
		}

		public StructureInitializationStatus28 getStructureInitializationStatus28() {
			return this.structureInitializationStatus28;
		}

		public void setStructureInitializationStatus28(StructureInitializationStatus28 structureInitializationStatus28) {
			this.structureInitializationStatus28 = structureInitializationStatus28;
		}

		public DataInitializationStatus29 getDataInitializationStatus29() {
			return this.dataInitializationStatus29;
		}

		public void setDataInitializationStatus29(DataInitializationStatus29 dataInitializationStatus29) {
			this.dataInitializationStatus29 = dataInitializationStatus29;
		}

		public DataSynchronizationStatus30 getDataSynchronizationStatus30() {
			return this.dataSynchronizationStatus30;
		}

		public void setDataSynchronizationStatus30(DataSynchronizationStatus30 dataSynchronizationStatus30) {
			this.dataSynchronizationStatus30 = dataSynchronizationStatus30;
		}

		public DataEtlStatus31 getDataEtlStatus31() {
			return this.dataEtlStatus31;
		}

		public void setDataEtlStatus31(DataEtlStatus31 dataEtlStatus31) {
			this.dataEtlStatus31 = dataEtlStatus31;
		}

		public Performance32 getPerformance32() {
			return this.performance32;
		}

		public void setPerformance32(Performance32 performance32) {
			this.performance32 = performance32;
		}

		public ReverseJob33 getReverseJob33() {
			return this.reverseJob33;
		}

		public void setReverseJob33(ReverseJob33 reverseJob33) {
			this.reverseJob33 = reverseJob33;
		}

		public SubscriptionHost34 getSubscriptionHost34() {
			return this.subscriptionHost34;
		}

		public void setSubscriptionHost34(SubscriptionHost34 subscriptionHost34) {
			this.subscriptionHost34 = subscriptionHost34;
		}

		public SubscriptionDataType35 getSubscriptionDataType35() {
			return this.subscriptionDataType35;
		}

		public void setSubscriptionDataType35(SubscriptionDataType35 subscriptionDataType35) {
			this.subscriptionDataType35 = subscriptionDataType35;
		}

		public RetryState36 getRetryState36() {
			return this.retryState36;
		}

		public void setRetryState36(RetryState36 retryState36) {
			this.retryState36 = retryState36;
		}

		public static class TagListItem38 {

			private Long id;

			private String gmtCreate;

			private String gmtModified;

			private String resourceId;

			private String resourceType;

			private String regionId;

			private Long aliUid;

			private String tagKey;

			private String tagValue;

			private String tagCategory;

			private String srcRegion;

			private String scope;

			private Long creator;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getResourceId() {
				return this.resourceId;
			}

			public void setResourceId(String resourceId) {
				this.resourceId = resourceId;
			}

			public String getResourceType() {
				return this.resourceType;
			}

			public void setResourceType(String resourceType) {
				this.resourceType = resourceType;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public Long getAliUid() {
				return this.aliUid;
			}

			public void setAliUid(Long aliUid) {
				this.aliUid = aliUid;
			}

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

			public String getTagCategory() {
				return this.tagCategory;
			}

			public void setTagCategory(String tagCategory) {
				this.tagCategory = tagCategory;
			}

			public String getSrcRegion() {
				return this.srcRegion;
			}

			public void setSrcRegion(String srcRegion) {
				this.srcRegion = srcRegion;
			}

			public String getScope() {
				return this.scope;
			}

			public void setScope(String scope) {
				this.scope = scope;
			}

			public Long getCreator() {
				return this.creator;
			}

			public void setCreator(Long creator) {
				this.creator = creator;
			}
		}

		public static class SourceEndpoint24 {

			private String instanceID;

			private String region;

			private String instanceType;

			private String engineName;

			private String ip;

			private String port;

			private String databaseName;

			private String oracleSID;

			private String userName;

			private String sslSolutionEnum;

			private String roleName;

			private String aliyunUid;

			public String getInstanceID() {
				return this.instanceID;
			}

			public void setInstanceID(String instanceID) {
				this.instanceID = instanceID;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
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

			public String getRoleName() {
				return this.roleName;
			}

			public void setRoleName(String roleName) {
				this.roleName = roleName;
			}

			public String getAliyunUid() {
				return this.aliyunUid;
			}

			public void setAliyunUid(String aliyunUid) {
				this.aliyunUid = aliyunUid;
			}
		}

		public static class DestinationEndpoint25 {

			private String instanceID;

			private String region;

			private String instanceType;

			private String engineName;

			private String ip;

			private String port;

			private String databaseName;

			private String oracleSID;

			private String userName;

			private String sslSolutionEnum;

			private String roleName;

			private String aliyunUid;

			public String getInstanceID() {
				return this.instanceID;
			}

			public void setInstanceID(String instanceID) {
				this.instanceID = instanceID;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
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

			public String getRoleName() {
				return this.roleName;
			}

			public void setRoleName(String roleName) {
				this.roleName = roleName;
			}

			public String getAliyunUid() {
				return this.aliyunUid;
			}

			public void setAliyunUid(String aliyunUid) {
				this.aliyunUid = aliyunUid;
			}
		}

		public static class MigrationMode26 {

			private Boolean structureInitialization;

			private Boolean dataInitialization;

			private Boolean dataSynchronization;

			private Boolean dataExtractTransformLoad;

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

			public Boolean getDataExtractTransformLoad() {
				return this.dataExtractTransformLoad;
			}

			public void setDataExtractTransformLoad(Boolean dataExtractTransformLoad) {
				this.dataExtractTransformLoad = dataExtractTransformLoad;
			}
		}

		public static class PrecheckStatus27 {

			private String status;

			private String percent;

			private String errorMessage;

			private List<DetailItem40> detail39;

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

			public List<DetailItem40> getDetail39() {
				return this.detail39;
			}

			public void setDetail39(List<DetailItem40> detail39) {
				this.detail39 = detail39;
			}

			public static class DetailItem40 {

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

		public static class StructureInitializationStatus28 {

			private String status;

			private String errorMessage;

			private String percent;

			private String progress;

			private Boolean needUpgrade;

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

			public Boolean getNeedUpgrade() {
				return this.needUpgrade;
			}

			public void setNeedUpgrade(Boolean needUpgrade) {
				this.needUpgrade = needUpgrade;
			}
		}

		public static class DataInitializationStatus29 {

			private String status;

			private String errorMessage;

			private String percent;

			private String progress;

			private Boolean needUpgrade;

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

			public Boolean getNeedUpgrade() {
				return this.needUpgrade;
			}

			public void setNeedUpgrade(Boolean needUpgrade) {
				this.needUpgrade = needUpgrade;
			}
		}

		public static class DataSynchronizationStatus30 {

			private String status;

			private String errorMessage;

			private String percent;

			private String progress;

			private Boolean needUpgrade;

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

			public Boolean getNeedUpgrade() {
				return this.needUpgrade;
			}

			public void setNeedUpgrade(Boolean needUpgrade) {
				this.needUpgrade = needUpgrade;
			}
		}

		public static class DataEtlStatus31 {

			private String status;

			private String errorMessage;

			private String percent;

			private String progress;

			private Boolean needUpgrade;

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

			public Boolean getNeedUpgrade() {
				return this.needUpgrade;
			}

			public void setNeedUpgrade(Boolean needUpgrade) {
				this.needUpgrade = needUpgrade;
			}
		}

		public static class Performance32 {

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

		public static class ReverseJob33 {

			private String dtsInstanceID;

			private String dtsJobId;

			private String dtsJobName;

			private String groupId;

			private Integer databaseCount;

			private String dtsJobClass;

			private String dtsJobDirection;

			private String synchronizationDirection;

			private String payType;

			private String expireTime;

			private String createTime;

			private String finishTime;

			private String dbObject;

			private String status;

			private String errorMessage;

			private Long delay;

			private String checkpoint;

			private Object reverseJob;

			private String reserved;

			private String subscribeTopic;

			private String consumptionCheckpoint;

			private String beginTimestamp;

			private String endTimestamp;

			private String consumptionClient;

			private String destNetType;

			private String appName;

			private String etlCalculator;

			private String originType;

			private String jobType;

			private Boolean isDemoJob;

			private String taskType;

			private List<TagListItem54> tagList53;

			private SourceEndpoint41 sourceEndpoint41;

			private DestinationEndpoint42 destinationEndpoint42;

			private MigrationMode43 migrationMode43;

			private PrecheckStatus44 precheckStatus44;

			private StructureInitializationStatus45 structureInitializationStatus45;

			private DataInitializationStatus46 dataInitializationStatus46;

			private DataSynchronizationStatus47 dataSynchronizationStatus47;

			private DataEtlStatus48 dataEtlStatus48;

			private Performance49 performance49;

			private SubscriptionHost50 subscriptionHost50;

			private SubscriptionDataType51 subscriptionDataType51;

			private RetryState52 retryState52;

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

			public String getGroupId() {
				return this.groupId;
			}

			public void setGroupId(String groupId) {
				this.groupId = groupId;
			}

			public Integer getDatabaseCount() {
				return this.databaseCount;
			}

			public void setDatabaseCount(Integer databaseCount) {
				this.databaseCount = databaseCount;
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

			public String getSynchronizationDirection() {
				return this.synchronizationDirection;
			}

			public void setSynchronizationDirection(String synchronizationDirection) {
				this.synchronizationDirection = synchronizationDirection;
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

			public String getFinishTime() {
				return this.finishTime;
			}

			public void setFinishTime(String finishTime) {
				this.finishTime = finishTime;
			}

			public String getDbObject() {
				return this.dbObject;
			}

			public void setDbObject(String dbObject) {
				this.dbObject = dbObject;
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

			public Long getDelay() {
				return this.delay;
			}

			public void setDelay(Long delay) {
				this.delay = delay;
			}

			public String getCheckpoint() {
				return this.checkpoint;
			}

			public void setCheckpoint(String checkpoint) {
				this.checkpoint = checkpoint;
			}

			public Object getReverseJob() {
				return this.reverseJob;
			}

			public void setReverseJob(Object reverseJob) {
				this.reverseJob = reverseJob;
			}

			public String getReserved() {
				return this.reserved;
			}

			public void setReserved(String reserved) {
				this.reserved = reserved;
			}

			public String getSubscribeTopic() {
				return this.subscribeTopic;
			}

			public void setSubscribeTopic(String subscribeTopic) {
				this.subscribeTopic = subscribeTopic;
			}

			public String getConsumptionCheckpoint() {
				return this.consumptionCheckpoint;
			}

			public void setConsumptionCheckpoint(String consumptionCheckpoint) {
				this.consumptionCheckpoint = consumptionCheckpoint;
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

			public String getConsumptionClient() {
				return this.consumptionClient;
			}

			public void setConsumptionClient(String consumptionClient) {
				this.consumptionClient = consumptionClient;
			}

			public String getDestNetType() {
				return this.destNetType;
			}

			public void setDestNetType(String destNetType) {
				this.destNetType = destNetType;
			}

			public String getAppName() {
				return this.appName;
			}

			public void setAppName(String appName) {
				this.appName = appName;
			}

			public String getEtlCalculator() {
				return this.etlCalculator;
			}

			public void setEtlCalculator(String etlCalculator) {
				this.etlCalculator = etlCalculator;
			}

			public String getOriginType() {
				return this.originType;
			}

			public void setOriginType(String originType) {
				this.originType = originType;
			}

			public String getJobType() {
				return this.jobType;
			}

			public void setJobType(String jobType) {
				this.jobType = jobType;
			}

			public Boolean getIsDemoJob() {
				return this.isDemoJob;
			}

			public void setIsDemoJob(Boolean isDemoJob) {
				this.isDemoJob = isDemoJob;
			}

			public String getTaskType() {
				return this.taskType;
			}

			public void setTaskType(String taskType) {
				this.taskType = taskType;
			}

			public List<TagListItem54> getTagList53() {
				return this.tagList53;
			}

			public void setTagList53(List<TagListItem54> tagList53) {
				this.tagList53 = tagList53;
			}

			public SourceEndpoint41 getSourceEndpoint41() {
				return this.sourceEndpoint41;
			}

			public void setSourceEndpoint41(SourceEndpoint41 sourceEndpoint41) {
				this.sourceEndpoint41 = sourceEndpoint41;
			}

			public DestinationEndpoint42 getDestinationEndpoint42() {
				return this.destinationEndpoint42;
			}

			public void setDestinationEndpoint42(DestinationEndpoint42 destinationEndpoint42) {
				this.destinationEndpoint42 = destinationEndpoint42;
			}

			public MigrationMode43 getMigrationMode43() {
				return this.migrationMode43;
			}

			public void setMigrationMode43(MigrationMode43 migrationMode43) {
				this.migrationMode43 = migrationMode43;
			}

			public PrecheckStatus44 getPrecheckStatus44() {
				return this.precheckStatus44;
			}

			public void setPrecheckStatus44(PrecheckStatus44 precheckStatus44) {
				this.precheckStatus44 = precheckStatus44;
			}

			public StructureInitializationStatus45 getStructureInitializationStatus45() {
				return this.structureInitializationStatus45;
			}

			public void setStructureInitializationStatus45(StructureInitializationStatus45 structureInitializationStatus45) {
				this.structureInitializationStatus45 = structureInitializationStatus45;
			}

			public DataInitializationStatus46 getDataInitializationStatus46() {
				return this.dataInitializationStatus46;
			}

			public void setDataInitializationStatus46(DataInitializationStatus46 dataInitializationStatus46) {
				this.dataInitializationStatus46 = dataInitializationStatus46;
			}

			public DataSynchronizationStatus47 getDataSynchronizationStatus47() {
				return this.dataSynchronizationStatus47;
			}

			public void setDataSynchronizationStatus47(DataSynchronizationStatus47 dataSynchronizationStatus47) {
				this.dataSynchronizationStatus47 = dataSynchronizationStatus47;
			}

			public DataEtlStatus48 getDataEtlStatus48() {
				return this.dataEtlStatus48;
			}

			public void setDataEtlStatus48(DataEtlStatus48 dataEtlStatus48) {
				this.dataEtlStatus48 = dataEtlStatus48;
			}

			public Performance49 getPerformance49() {
				return this.performance49;
			}

			public void setPerformance49(Performance49 performance49) {
				this.performance49 = performance49;
			}

			public SubscriptionHost50 getSubscriptionHost50() {
				return this.subscriptionHost50;
			}

			public void setSubscriptionHost50(SubscriptionHost50 subscriptionHost50) {
				this.subscriptionHost50 = subscriptionHost50;
			}

			public SubscriptionDataType51 getSubscriptionDataType51() {
				return this.subscriptionDataType51;
			}

			public void setSubscriptionDataType51(SubscriptionDataType51 subscriptionDataType51) {
				this.subscriptionDataType51 = subscriptionDataType51;
			}

			public RetryState52 getRetryState52() {
				return this.retryState52;
			}

			public void setRetryState52(RetryState52 retryState52) {
				this.retryState52 = retryState52;
			}

			public static class TagListItem54 {

				private Long id;

				private String gmtCreate;

				private String gmtModified;

				private String resourceId;

				private String resourceType;

				private String regionId;

				private Long aliUid;

				private String tagKey;

				private String tagValue;

				private String tagCategory;

				private String srcRegion;

				private String scope;

				private Long creator;

				public Long getId() {
					return this.id;
				}

				public void setId(Long id) {
					this.id = id;
				}

				public String getGmtCreate() {
					return this.gmtCreate;
				}

				public void setGmtCreate(String gmtCreate) {
					this.gmtCreate = gmtCreate;
				}

				public String getGmtModified() {
					return this.gmtModified;
				}

				public void setGmtModified(String gmtModified) {
					this.gmtModified = gmtModified;
				}

				public String getResourceId() {
					return this.resourceId;
				}

				public void setResourceId(String resourceId) {
					this.resourceId = resourceId;
				}

				public String getResourceType() {
					return this.resourceType;
				}

				public void setResourceType(String resourceType) {
					this.resourceType = resourceType;
				}

				public String getRegionId() {
					return this.regionId;
				}

				public void setRegionId(String regionId) {
					this.regionId = regionId;
				}

				public Long getAliUid() {
					return this.aliUid;
				}

				public void setAliUid(Long aliUid) {
					this.aliUid = aliUid;
				}

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

				public String getTagCategory() {
					return this.tagCategory;
				}

				public void setTagCategory(String tagCategory) {
					this.tagCategory = tagCategory;
				}

				public String getSrcRegion() {
					return this.srcRegion;
				}

				public void setSrcRegion(String srcRegion) {
					this.srcRegion = srcRegion;
				}

				public String getScope() {
					return this.scope;
				}

				public void setScope(String scope) {
					this.scope = scope;
				}

				public Long getCreator() {
					return this.creator;
				}

				public void setCreator(Long creator) {
					this.creator = creator;
				}
			}

			public static class SourceEndpoint41 {

				private String instanceID;

				private String region;

				private String instanceType;

				private String engineName;

				private String ip;

				private String port;

				private String databaseName;

				private String oracleSID;

				private String userName;

				private String sslSolutionEnum;

				private String roleName;

				private String aliyunUid;

				public String getInstanceID() {
					return this.instanceID;
				}

				public void setInstanceID(String instanceID) {
					this.instanceID = instanceID;
				}

				public String getRegion() {
					return this.region;
				}

				public void setRegion(String region) {
					this.region = region;
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

				public String getRoleName() {
					return this.roleName;
				}

				public void setRoleName(String roleName) {
					this.roleName = roleName;
				}

				public String getAliyunUid() {
					return this.aliyunUid;
				}

				public void setAliyunUid(String aliyunUid) {
					this.aliyunUid = aliyunUid;
				}
			}

			public static class DestinationEndpoint42 {

				private String instanceID;

				private String region;

				private String instanceType;

				private String engineName;

				private String ip;

				private String port;

				private String databaseName;

				private String oracleSID;

				private String userName;

				private String sslSolutionEnum;

				private String roleName;

				private String aliyunUid;

				public String getInstanceID() {
					return this.instanceID;
				}

				public void setInstanceID(String instanceID) {
					this.instanceID = instanceID;
				}

				public String getRegion() {
					return this.region;
				}

				public void setRegion(String region) {
					this.region = region;
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

				public String getRoleName() {
					return this.roleName;
				}

				public void setRoleName(String roleName) {
					this.roleName = roleName;
				}

				public String getAliyunUid() {
					return this.aliyunUid;
				}

				public void setAliyunUid(String aliyunUid) {
					this.aliyunUid = aliyunUid;
				}
			}

			public static class MigrationMode43 {

				private Boolean structureInitialization;

				private Boolean dataInitialization;

				private Boolean dataSynchronization;

				private Boolean dataExtractTransformLoad;

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

				public Boolean getDataExtractTransformLoad() {
					return this.dataExtractTransformLoad;
				}

				public void setDataExtractTransformLoad(Boolean dataExtractTransformLoad) {
					this.dataExtractTransformLoad = dataExtractTransformLoad;
				}
			}

			public static class PrecheckStatus44 {

				private String status;

				private String percent;

				private String errorMessage;

				private List<DetailItem56> detail55;

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

				public List<DetailItem56> getDetail55() {
					return this.detail55;
				}

				public void setDetail55(List<DetailItem56> detail55) {
					this.detail55 = detail55;
				}

				public static class DetailItem56 {

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

			public static class StructureInitializationStatus45 {

				private String status;

				private String errorMessage;

				private String percent;

				private String progress;

				private Boolean needUpgrade;

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

				public Boolean getNeedUpgrade() {
					return this.needUpgrade;
				}

				public void setNeedUpgrade(Boolean needUpgrade) {
					this.needUpgrade = needUpgrade;
				}
			}

			public static class DataInitializationStatus46 {

				private String status;

				private String errorMessage;

				private String percent;

				private String progress;

				private Boolean needUpgrade;

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

				public Boolean getNeedUpgrade() {
					return this.needUpgrade;
				}

				public void setNeedUpgrade(Boolean needUpgrade) {
					this.needUpgrade = needUpgrade;
				}
			}

			public static class DataSynchronizationStatus47 {

				private String status;

				private String errorMessage;

				private String percent;

				private String progress;

				private Boolean needUpgrade;

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

				public Boolean getNeedUpgrade() {
					return this.needUpgrade;
				}

				public void setNeedUpgrade(Boolean needUpgrade) {
					this.needUpgrade = needUpgrade;
				}
			}

			public static class DataEtlStatus48 {

				private String status;

				private String errorMessage;

				private String percent;

				private String progress;

				private Boolean needUpgrade;

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

				public Boolean getNeedUpgrade() {
					return this.needUpgrade;
				}

				public void setNeedUpgrade(Boolean needUpgrade) {
					this.needUpgrade = needUpgrade;
				}
			}

			public static class Performance49 {

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

			public static class SubscriptionHost50 {

				private String publicHost;

				private String privateHost;

				private String vpcHost;

				public String getPublicHost() {
					return this.publicHost;
				}

				public void setPublicHost(String publicHost) {
					this.publicHost = publicHost;
				}

				public String getPrivateHost() {
					return this.privateHost;
				}

				public void setPrivateHost(String privateHost) {
					this.privateHost = privateHost;
				}

				public String getVpcHost() {
					return this.vpcHost;
				}

				public void setVpcHost(String vpcHost) {
					this.vpcHost = vpcHost;
				}
			}

			public static class SubscriptionDataType51 {

				private Boolean ddl;

				private Boolean dml;

				public Boolean getDdl() {
					return this.ddl;
				}

				public void setDdl(Boolean ddl) {
					this.ddl = ddl;
				}

				public Boolean getDml() {
					return this.dml;
				}

				public void setDml(Boolean dml) {
					this.dml = dml;
				}
			}

			public static class RetryState52 {

				private String jobId;

				private Integer maxRetryTime;

				private Integer retryTime;

				private Integer retryCount;

				private Boolean retrying;

				private String module;

				private String retryTarget;

				private String errMsg;

				public String getJobId() {
					return this.jobId;
				}

				public void setJobId(String jobId) {
					this.jobId = jobId;
				}

				public Integer getMaxRetryTime() {
					return this.maxRetryTime;
				}

				public void setMaxRetryTime(Integer maxRetryTime) {
					this.maxRetryTime = maxRetryTime;
				}

				public Integer getRetryTime() {
					return this.retryTime;
				}

				public void setRetryTime(Integer retryTime) {
					this.retryTime = retryTime;
				}

				public Integer getRetryCount() {
					return this.retryCount;
				}

				public void setRetryCount(Integer retryCount) {
					this.retryCount = retryCount;
				}

				public Boolean getRetrying() {
					return this.retrying;
				}

				public void setRetrying(Boolean retrying) {
					this.retrying = retrying;
				}

				public String getModule() {
					return this.module;
				}

				public void setModule(String module) {
					this.module = module;
				}

				public String getRetryTarget() {
					return this.retryTarget;
				}

				public void setRetryTarget(String retryTarget) {
					this.retryTarget = retryTarget;
				}

				public String getErrMsg() {
					return this.errMsg;
				}

				public void setErrMsg(String errMsg) {
					this.errMsg = errMsg;
				}
			}
		}

		public static class SubscriptionHost34 {

			private String publicHost;

			private String privateHost;

			private String vpcHost;

			public String getPublicHost() {
				return this.publicHost;
			}

			public void setPublicHost(String publicHost) {
				this.publicHost = publicHost;
			}

			public String getPrivateHost() {
				return this.privateHost;
			}

			public void setPrivateHost(String privateHost) {
				this.privateHost = privateHost;
			}

			public String getVpcHost() {
				return this.vpcHost;
			}

			public void setVpcHost(String vpcHost) {
				this.vpcHost = vpcHost;
			}
		}

		public static class SubscriptionDataType35 {

			private Boolean ddl;

			private Boolean dml;

			public Boolean getDdl() {
				return this.ddl;
			}

			public void setDdl(Boolean ddl) {
				this.ddl = ddl;
			}

			public Boolean getDml() {
				return this.dml;
			}

			public void setDml(Boolean dml) {
				this.dml = dml;
			}
		}

		public static class RetryState36 {

			private String jobId;

			private Integer maxRetryTime;

			private Integer retryTime;

			private Integer retryCount;

			private Boolean retrying;

			private String module;

			private String retryTarget;

			private String errMsg;

			public String getJobId() {
				return this.jobId;
			}

			public void setJobId(String jobId) {
				this.jobId = jobId;
			}

			public Integer getMaxRetryTime() {
				return this.maxRetryTime;
			}

			public void setMaxRetryTime(Integer maxRetryTime) {
				this.maxRetryTime = maxRetryTime;
			}

			public Integer getRetryTime() {
				return this.retryTime;
			}

			public void setRetryTime(Integer retryTime) {
				this.retryTime = retryTime;
			}

			public Integer getRetryCount() {
				return this.retryCount;
			}

			public void setRetryCount(Integer retryCount) {
				this.retryCount = retryCount;
			}

			public Boolean getRetrying() {
				return this.retrying;
			}

			public void setRetrying(Boolean retrying) {
				this.retrying = retrying;
			}

			public String getModule() {
				return this.module;
			}

			public void setModule(String module) {
				this.module = module;
			}

			public String getRetryTarget() {
				return this.retryTarget;
			}

			public void setRetryTarget(String retryTarget) {
				this.retryTarget = retryTarget;
			}

			public String getErrMsg() {
				return this.errMsg;
			}

			public void setErrMsg(String errMsg) {
				this.errMsg = errMsg;
			}
		}
	}

	public static class SourceEndpoint {

		private String oracleSID;

		private String sslSolutionEnum;

		private String ip;

		private String instanceID;

		private String roleName;

		private String instanceType;

		private String port;

		private String engineName;

		private String region;

		private String databaseName;

		private String aliyunUid;

		private String userName;

		public String getOracleSID() {
			return this.oracleSID;
		}

		public void setOracleSID(String oracleSID) {
			this.oracleSID = oracleSID;
		}

		public String getSslSolutionEnum() {
			return this.sslSolutionEnum;
		}

		public void setSslSolutionEnum(String sslSolutionEnum) {
			this.sslSolutionEnum = sslSolutionEnum;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public String getInstanceID() {
			return this.instanceID;
		}

		public void setInstanceID(String instanceID) {
			this.instanceID = instanceID;
		}

		public String getRoleName() {
			return this.roleName;
		}

		public void setRoleName(String roleName) {
			this.roleName = roleName;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getPort() {
			return this.port;
		}

		public void setPort(String port) {
			this.port = port;
		}

		public String getEngineName() {
			return this.engineName;
		}

		public void setEngineName(String engineName) {
			this.engineName = engineName;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getDatabaseName() {
			return this.databaseName;
		}

		public void setDatabaseName(String databaseName) {
			this.databaseName = databaseName;
		}

		public String getAliyunUid() {
			return this.aliyunUid;
		}

		public void setAliyunUid(String aliyunUid) {
			this.aliyunUid = aliyunUid;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}
	}

	public static class DestinationEndpoint {

		private String sslSolutionEnum;

		private String oracleSID;

		private String databaseName;

		private String region;

		private String ip;

		private String instanceID;

		private String port;

		private String instanceType;

		private String userName;

		private String engineName;

		public String getSslSolutionEnum() {
			return this.sslSolutionEnum;
		}

		public void setSslSolutionEnum(String sslSolutionEnum) {
			this.sslSolutionEnum = sslSolutionEnum;
		}

		public String getOracleSID() {
			return this.oracleSID;
		}

		public void setOracleSID(String oracleSID) {
			this.oracleSID = oracleSID;
		}

		public String getDatabaseName() {
			return this.databaseName;
		}

		public void setDatabaseName(String databaseName) {
			this.databaseName = databaseName;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public String getInstanceID() {
			return this.instanceID;
		}

		public void setInstanceID(String instanceID) {
			this.instanceID = instanceID;
		}

		public String getPort() {
			return this.port;
		}

		public void setPort(String port) {
			this.port = port;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getEngineName() {
			return this.engineName;
		}

		public void setEngineName(String engineName) {
			this.engineName = engineName;
		}
	}

	public static class MigrationMode {

		private Boolean dataExtractTransformLoad;

		private Boolean dataInitialization;

		private Boolean dataSynchronization;

		private Boolean structureInitialization;

		public Boolean getDataExtractTransformLoad() {
			return this.dataExtractTransformLoad;
		}

		public void setDataExtractTransformLoad(Boolean dataExtractTransformLoad) {
			this.dataExtractTransformLoad = dataExtractTransformLoad;
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

		public Boolean getStructureInitialization() {
			return this.structureInitialization;
		}

		public void setStructureInitialization(Boolean structureInitialization) {
			this.structureInitialization = structureInitialization;
		}
	}

	public static class SubscriptionHost {

		private String vpcHost;

		private String publicHost;

		private String privateHost;

		public String getVpcHost() {
			return this.vpcHost;
		}

		public void setVpcHost(String vpcHost) {
			this.vpcHost = vpcHost;
		}

		public String getPublicHost() {
			return this.publicHost;
		}

		public void setPublicHost(String publicHost) {
			this.publicHost = publicHost;
		}

		public String getPrivateHost() {
			return this.privateHost;
		}

		public void setPrivateHost(String privateHost) {
			this.privateHost = privateHost;
		}
	}

	public static class SubscriptionDataType {

		private Boolean dml;

		private Boolean ddl;

		public Boolean getDml() {
			return this.dml;
		}

		public void setDml(Boolean dml) {
			this.dml = dml;
		}

		public Boolean getDdl() {
			return this.ddl;
		}

		public void setDdl(Boolean ddl) {
			this.ddl = ddl;
		}
	}

	@Override
	public DescribeDtsJobDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeDtsJobDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
