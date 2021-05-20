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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dts.transform.v20200101.DescribeDtsJobDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDtsJobDetailResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer code;

	private String errCode;

	private String errMessage;

	private String dynamicMessage;

	private Integer httpStatusCode;

	private String dtsInstanceID;

	private String dtsJobId;

	private String dtsJobName;

	private String dtsJobClass;

	private String dtsJobDirection;

	private String payType;

	private String expireTime;

	private String createTime;

	private String finishTime;

	private String status;

	private Integer checkpoint;

	private Integer delay;

	private String reserved;

	private String errorMessage;

	private String dbObject;

	private String synchronizationDirection;

	private String etlCalculator;

	private String groupId;

	private Integer databaseCount;

	private String subscribeTopic;

	private String consumptionCheckpoint;

	private String beginTimestamp;

	private String endTimestamp;

	private String consumptionClient;

	private String appName;

	private String destNetType;

	private SourceEndpoint sourceEndpoint;

	private DestinationEndpoint destinationEndpoint;

	private MigrationMode migrationMode;

	private SubscriptionHost subscriptionHost;

	private SubscriptionDataType subscriptionDataType;

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

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
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

	public String getFinishTime() {
		return this.finishTime;
	}

	public void setFinishTime(String finishTime) {
		this.finishTime = finishTime;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getCheckpoint() {
		return this.checkpoint;
	}

	public void setCheckpoint(Integer checkpoint) {
		this.checkpoint = checkpoint;
	}

	public Integer getDelay() {
		return this.delay;
	}

	public void setDelay(Integer delay) {
		this.delay = delay;
	}

	public String getReserved() {
		return this.reserved;
	}

	public void setReserved(String reserved) {
		this.reserved = reserved;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getDbObject() {
		return this.dbObject;
	}

	public void setDbObject(String dbObject) {
		this.dbObject = dbObject;
	}

	public String getSynchronizationDirection() {
		return this.synchronizationDirection;
	}

	public void setSynchronizationDirection(String synchronizationDirection) {
		this.synchronizationDirection = synchronizationDirection;
	}

	public String getEtlCalculator() {
		return this.etlCalculator;
	}

	public void setEtlCalculator(String etlCalculator) {
		this.etlCalculator = etlCalculator;
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

	public static class SourceEndpoint {

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

	public static class DestinationEndpoint {

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
	}

	public static class MigrationMode {

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

	public static class SubscriptionHost {

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

	public static class SubscriptionDataType {

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

	@Override
	public DescribeDtsJobDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeDtsJobDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
