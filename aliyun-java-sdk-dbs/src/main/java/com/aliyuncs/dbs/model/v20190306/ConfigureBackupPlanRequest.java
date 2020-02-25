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
public class ConfigureBackupPlanRequest extends RpcAcsRequest<ConfigureBackupPlanResponse> {
	   

	private String sourceEndpointRegion;

	private Long backupGatewayId;

	private String sourceEndpointInstanceID;

	private String sourceEndpointUserName;

	private String clientToken;

	private String backupPlanId;

	private String sourceEndpointDatabaseName;

	private Integer duplicationInfrequentAccessPeriod;

	private String backupStartTime;

	private String sourceEndpointIP;

	private Boolean enableBackupLog;

	private Integer duplicationArchivePeriod;

	private String sourceEndpointPassword;

	private String backupObjects;

	private String ownerId;

	private Integer sourceEndpointPort;

	private Integer backupRetentionPeriod;

	private String backupPeriod;

	private String sourceEndpointInstanceType;

	private String backupPlanName;

	private String sourceEndpointOracleSID;

	private String oSSBucketName;
	public ConfigureBackupPlanRequest() {
		super("Dbs", "2019-03-06", "ConfigureBackupPlan");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Long getBackupGatewayId() {
		return this.backupGatewayId;
	}

	public void setBackupGatewayId(Long backupGatewayId) {
		this.backupGatewayId = backupGatewayId;
		if(backupGatewayId != null){
			putQueryParameter("BackupGatewayId", backupGatewayId.toString());
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

	public String getSourceEndpointUserName() {
		return this.sourceEndpointUserName;
	}

	public void setSourceEndpointUserName(String sourceEndpointUserName) {
		this.sourceEndpointUserName = sourceEndpointUserName;
		if(sourceEndpointUserName != null){
			putQueryParameter("SourceEndpointUserName", sourceEndpointUserName);
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

	public Boolean getEnableBackupLog() {
		return this.enableBackupLog;
	}

	public void setEnableBackupLog(Boolean enableBackupLog) {
		this.enableBackupLog = enableBackupLog;
		if(enableBackupLog != null){
			putQueryParameter("EnableBackupLog", enableBackupLog.toString());
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

	public String getSourceEndpointPassword() {
		return this.sourceEndpointPassword;
	}

	public void setSourceEndpointPassword(String sourceEndpointPassword) {
		this.sourceEndpointPassword = sourceEndpointPassword;
		if(sourceEndpointPassword != null){
			putQueryParameter("SourceEndpointPassword", sourceEndpointPassword);
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

	public String getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId);
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

	public String getSourceEndpointOracleSID() {
		return this.sourceEndpointOracleSID;
	}

	public void setSourceEndpointOracleSID(String sourceEndpointOracleSID) {
		this.sourceEndpointOracleSID = sourceEndpointOracleSID;
		if(sourceEndpointOracleSID != null){
			putQueryParameter("SourceEndpointOracleSID", sourceEndpointOracleSID);
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

	@Override
	public Class<ConfigureBackupPlanResponse> getResponseClass() {
		return ConfigureBackupPlanResponse.class;
	}

}
