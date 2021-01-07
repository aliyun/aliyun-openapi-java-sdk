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

package com.aliyuncs.dbs.model.v20190306;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dbs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateAndStartBackupPlanRequest extends RpcAcsRequest<CreateAndStartBackupPlanResponse> {
	   

	private String databaseType;

	private Long backupGatewayId;

	private String sourceEndpointUserName;

	private String storageType;

	private String databaseRegion;

	private String backupStartTime;

	private String sourceEndpointIP;

	private String crossRoleName;

	private String backupStorageType;

	private Integer duplicationArchivePeriod;

	private String period;

	private Integer backupLogIntervalSeconds;

	private String fromApp;

	private String sourceEndpointPassword;

	private String ownerId;

	private String backupMethod;

	private Integer backupRetentionPeriod;

	private String backupPeriod;

	private Long backupSpeedLimit;

	private String sourceEndpointInstanceType;

	private String backupPlanName;

	private String oSSBucketName;

	private String region;

	private String sourceEndpointRegion;

	private String sourceEndpointInstanceID;

	private String clientToken;

	private String backupPlanId;

	private String instanceClass;

	private String sourceEndpointDatabaseName;

	private Integer duplicationInfrequentAccessPeriod;

	private String instanceType;

	private Boolean enableBackupLog;

	private String crossAliyunId;

	private String backupObjects;

	private Long backupRateLimit;

	private Integer usedTime;

	private Integer sourceEndpointPort;

	private String storageRegion;

	private String sourceEndpointOracleSID;

	private String backupStrategyType;

	private String payType;
	public CreateAndStartBackupPlanRequest() {
		super("Dbs", "2019-03-06", "CreateAndStartBackupPlan", "cbs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDatabaseType() {
		return this.databaseType;
	}

	public void setDatabaseType(String databaseType) {
		this.databaseType = databaseType;
		if(databaseType != null){
			putQueryParameter("DatabaseType", databaseType);
		}
	}

	public Long getBackupGatewayId() {
		return this.backupGatewayId;
	}

	public void setBackupGatewayId(Long backupGatewayId) {
		this.backupGatewayId = backupGatewayId;
		if(backupGatewayId != null){
			putQueryParameter("BackupGatewayId", backupGatewayId.toString());
		}
	}

	public String getSourceEndpointUserName() {
		return this.sourceEndpointUserName;
	}

	public void setSourceEndpointUserName(String sourceEndpointUserName) {
		this.sourceEndpointUserName = sourceEndpointUserName;
		if(sourceEndpointUserName != null){
			putQueryParameter("SourceEndpointUserName", sourceEndpointUserName);
		}
	}

	public String getStorageType() {
		return this.storageType;
	}

	public void setStorageType(String storageType) {
		this.storageType = storageType;
		if(storageType != null){
			putQueryParameter("StorageType", storageType);
		}
	}

	public String getDatabaseRegion() {
		return this.databaseRegion;
	}

	public void setDatabaseRegion(String databaseRegion) {
		this.databaseRegion = databaseRegion;
		if(databaseRegion != null){
			putQueryParameter("DatabaseRegion", databaseRegion);
		}
	}

	public String getBackupStartTime() {
		return this.backupStartTime;
	}

	public void setBackupStartTime(String backupStartTime) {
		this.backupStartTime = backupStartTime;
		if(backupStartTime != null){
			putQueryParameter("BackupStartTime", backupStartTime);
		}
	}

	public String getSourceEndpointIP() {
		return this.sourceEndpointIP;
	}

	public void setSourceEndpointIP(String sourceEndpointIP) {
		this.sourceEndpointIP = sourceEndpointIP;
		if(sourceEndpointIP != null){
			putQueryParameter("SourceEndpointIP", sourceEndpointIP);
		}
	}

	public String getCrossRoleName() {
		return this.crossRoleName;
	}

	public void setCrossRoleName(String crossRoleName) {
		this.crossRoleName = crossRoleName;
		if(crossRoleName != null){
			putQueryParameter("CrossRoleName", crossRoleName);
		}
	}

	public String getBackupStorageType() {
		return this.backupStorageType;
	}

	public void setBackupStorageType(String backupStorageType) {
		this.backupStorageType = backupStorageType;
		if(backupStorageType != null){
			putQueryParameter("BackupStorageType", backupStorageType);
		}
	}

	public Integer getDuplicationArchivePeriod() {
		return this.duplicationArchivePeriod;
	}

	public void setDuplicationArchivePeriod(Integer duplicationArchivePeriod) {
		this.duplicationArchivePeriod = duplicationArchivePeriod;
		if(duplicationArchivePeriod != null){
			putQueryParameter("DuplicationArchivePeriod", duplicationArchivePeriod.toString());
		}
	}

	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
		if(period != null){
			putQueryParameter("Period", period);
		}
	}

	public Integer getBackupLogIntervalSeconds() {
		return this.backupLogIntervalSeconds;
	}

	public void setBackupLogIntervalSeconds(Integer backupLogIntervalSeconds) {
		this.backupLogIntervalSeconds = backupLogIntervalSeconds;
		if(backupLogIntervalSeconds != null){
			putQueryParameter("BackupLogIntervalSeconds", backupLogIntervalSeconds.toString());
		}
	}

	public String getFromApp() {
		return this.fromApp;
	}

	public void setFromApp(String fromApp) {
		this.fromApp = fromApp;
		if(fromApp != null){
			putQueryParameter("FromApp", fromApp);
		}
	}

	public String getSourceEndpointPassword() {
		return this.sourceEndpointPassword;
	}

	public void setSourceEndpointPassword(String sourceEndpointPassword) {
		this.sourceEndpointPassword = sourceEndpointPassword;
		if(sourceEndpointPassword != null){
			putQueryParameter("SourceEndpointPassword", sourceEndpointPassword);
		}
	}

	public String getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId);
		}
	}

	public String getBackupMethod() {
		return this.backupMethod;
	}

	public void setBackupMethod(String backupMethod) {
		this.backupMethod = backupMethod;
		if(backupMethod != null){
			putQueryParameter("BackupMethod", backupMethod);
		}
	}

	public Integer getBackupRetentionPeriod() {
		return this.backupRetentionPeriod;
	}

	public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
		this.backupRetentionPeriod = backupRetentionPeriod;
		if(backupRetentionPeriod != null){
			putQueryParameter("BackupRetentionPeriod", backupRetentionPeriod.toString());
		}
	}

	public String getBackupPeriod() {
		return this.backupPeriod;
	}

	public void setBackupPeriod(String backupPeriod) {
		this.backupPeriod = backupPeriod;
		if(backupPeriod != null){
			putQueryParameter("BackupPeriod", backupPeriod);
		}
	}

	public Long getBackupSpeedLimit() {
		return this.backupSpeedLimit;
	}

	public void setBackupSpeedLimit(Long backupSpeedLimit) {
		this.backupSpeedLimit = backupSpeedLimit;
		if(backupSpeedLimit != null){
			putQueryParameter("BackupSpeedLimit", backupSpeedLimit.toString());
		}
	}

	public String getSourceEndpointInstanceType() {
		return this.sourceEndpointInstanceType;
	}

	public void setSourceEndpointInstanceType(String sourceEndpointInstanceType) {
		this.sourceEndpointInstanceType = sourceEndpointInstanceType;
		if(sourceEndpointInstanceType != null){
			putQueryParameter("SourceEndpointInstanceType", sourceEndpointInstanceType);
		}
	}

	public String getBackupPlanName() {
		return this.backupPlanName;
	}

	public void setBackupPlanName(String backupPlanName) {
		this.backupPlanName = backupPlanName;
		if(backupPlanName != null){
			putQueryParameter("BackupPlanName", backupPlanName);
		}
	}

	public String getOSSBucketName() {
		return this.oSSBucketName;
	}

	public void setOSSBucketName(String oSSBucketName) {
		this.oSSBucketName = oSSBucketName;
		if(oSSBucketName != null){
			putQueryParameter("OSSBucketName", oSSBucketName);
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("Region", region);
		}
	}

	public String getSourceEndpointRegion() {
		return this.sourceEndpointRegion;
	}

	public void setSourceEndpointRegion(String sourceEndpointRegion) {
		this.sourceEndpointRegion = sourceEndpointRegion;
		if(sourceEndpointRegion != null){
			putQueryParameter("SourceEndpointRegion", sourceEndpointRegion);
		}
	}

	public String getSourceEndpointInstanceID() {
		return this.sourceEndpointInstanceID;
	}

	public void setSourceEndpointInstanceID(String sourceEndpointInstanceID) {
		this.sourceEndpointInstanceID = sourceEndpointInstanceID;
		if(sourceEndpointInstanceID != null){
			putQueryParameter("SourceEndpointInstanceID", sourceEndpointInstanceID);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getBackupPlanId() {
		return this.backupPlanId;
	}

	public void setBackupPlanId(String backupPlanId) {
		this.backupPlanId = backupPlanId;
		if(backupPlanId != null){
			putQueryParameter("BackupPlanId", backupPlanId);
		}
	}

	public String getInstanceClass() {
		return this.instanceClass;
	}

	public void setInstanceClass(String instanceClass) {
		this.instanceClass = instanceClass;
		if(instanceClass != null){
			putQueryParameter("InstanceClass", instanceClass);
		}
	}

	public String getSourceEndpointDatabaseName() {
		return this.sourceEndpointDatabaseName;
	}

	public void setSourceEndpointDatabaseName(String sourceEndpointDatabaseName) {
		this.sourceEndpointDatabaseName = sourceEndpointDatabaseName;
		if(sourceEndpointDatabaseName != null){
			putQueryParameter("SourceEndpointDatabaseName", sourceEndpointDatabaseName);
		}
	}

	public Integer getDuplicationInfrequentAccessPeriod() {
		return this.duplicationInfrequentAccessPeriod;
	}

	public void setDuplicationInfrequentAccessPeriod(Integer duplicationInfrequentAccessPeriod) {
		this.duplicationInfrequentAccessPeriod = duplicationInfrequentAccessPeriod;
		if(duplicationInfrequentAccessPeriod != null){
			putQueryParameter("DuplicationInfrequentAccessPeriod", duplicationInfrequentAccessPeriod.toString());
		}
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		if(instanceType != null){
			putQueryParameter("InstanceType", instanceType);
		}
	}

	public Boolean getEnableBackupLog() {
		return this.enableBackupLog;
	}

	public void setEnableBackupLog(Boolean enableBackupLog) {
		this.enableBackupLog = enableBackupLog;
		if(enableBackupLog != null){
			putQueryParameter("EnableBackupLog", enableBackupLog.toString());
		}
	}

	public String getCrossAliyunId() {
		return this.crossAliyunId;
	}

	public void setCrossAliyunId(String crossAliyunId) {
		this.crossAliyunId = crossAliyunId;
		if(crossAliyunId != null){
			putQueryParameter("CrossAliyunId", crossAliyunId);
		}
	}

	public String getBackupObjects() {
		return this.backupObjects;
	}

	public void setBackupObjects(String backupObjects) {
		this.backupObjects = backupObjects;
		if(backupObjects != null){
			putQueryParameter("BackupObjects", backupObjects);
		}
	}

	public Long getBackupRateLimit() {
		return this.backupRateLimit;
	}

	public void setBackupRateLimit(Long backupRateLimit) {
		this.backupRateLimit = backupRateLimit;
		if(backupRateLimit != null){
			putQueryParameter("BackupRateLimit", backupRateLimit.toString());
		}
	}

	public Integer getUsedTime() {
		return this.usedTime;
	}

	public void setUsedTime(Integer usedTime) {
		this.usedTime = usedTime;
		if(usedTime != null){
			putQueryParameter("UsedTime", usedTime.toString());
		}
	}

	public Integer getSourceEndpointPort() {
		return this.sourceEndpointPort;
	}

	public void setSourceEndpointPort(Integer sourceEndpointPort) {
		this.sourceEndpointPort = sourceEndpointPort;
		if(sourceEndpointPort != null){
			putQueryParameter("SourceEndpointPort", sourceEndpointPort.toString());
		}
	}

	public String getStorageRegion() {
		return this.storageRegion;
	}

	public void setStorageRegion(String storageRegion) {
		this.storageRegion = storageRegion;
		if(storageRegion != null){
			putQueryParameter("StorageRegion", storageRegion);
		}
	}

	public String getSourceEndpointOracleSID() {
		return this.sourceEndpointOracleSID;
	}

	public void setSourceEndpointOracleSID(String sourceEndpointOracleSID) {
		this.sourceEndpointOracleSID = sourceEndpointOracleSID;
		if(sourceEndpointOracleSID != null){
			putQueryParameter("SourceEndpointOracleSID", sourceEndpointOracleSID);
		}
	}

	public String getBackupStrategyType() {
		return this.backupStrategyType;
	}

	public void setBackupStrategyType(String backupStrategyType) {
		this.backupStrategyType = backupStrategyType;
		if(backupStrategyType != null){
			putQueryParameter("BackupStrategyType", backupStrategyType);
		}
	}

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
		if(payType != null){
			putQueryParameter("PayType", payType);
		}
	}

	@Override
	public Class<CreateAndStartBackupPlanResponse> getResponseClass() {
		return CreateAndStartBackupPlanResponse.class;
	}

}
