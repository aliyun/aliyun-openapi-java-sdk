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

package com.aliyuncs.dds.model.v20151201;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyBackupPolicyRequest extends RpcAcsRequest<ModifyBackupPolicyResponse> {
	   

	private Long resourceOwnerId;

	private Integer crossLogRetentionValue;

	private String srcRegion;

	private String crossRetentionType;

	private String backupInterval;

	private String instanceType;

	private String dBInstanceId;

	private Long enableBackupLog;

	private String preferredBackupPeriod;

	private Integer backupRetentionPolicyOnClusterDeletion;

	private String destRegion;

	private String resourceOwnerAccount;

	private String crossBackupType;

	private String ownerAccount;

	private Long ownerId;

	private String snapshotBackupType;

	private String preferredBackupTime;

	private Long backupRetentionPeriod;

	private Long highFrequencyBackupRetention;

	private Integer enableCrossLogBackup;

	private String crossBackupPeriod;

	private Integer crossRetentionValue;

	private String crossLogRetentionType;

	private Long logBackupRetentionPeriod;

	private Boolean preserveOneEachHour;
	public ModifyBackupPolicyRequest() {
		super("Dds", "2015-12-01", "ModifyBackupPolicy", "dds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public Integer getCrossLogRetentionValue() {
		return this.crossLogRetentionValue;
	}

	public void setCrossLogRetentionValue(Integer crossLogRetentionValue) {
		this.crossLogRetentionValue = crossLogRetentionValue;
		if(crossLogRetentionValue != null){
			putQueryParameter("CrossLogRetentionValue", crossLogRetentionValue.toString());
		}
	}

	public String getSrcRegion() {
		return this.srcRegion;
	}

	public void setSrcRegion(String srcRegion) {
		this.srcRegion = srcRegion;
		if(srcRegion != null){
			putQueryParameter("SrcRegion", srcRegion);
		}
	}

	public String getCrossRetentionType() {
		return this.crossRetentionType;
	}

	public void setCrossRetentionType(String crossRetentionType) {
		this.crossRetentionType = crossRetentionType;
		if(crossRetentionType != null){
			putQueryParameter("CrossRetentionType", crossRetentionType);
		}
	}

	public String getBackupInterval() {
		return this.backupInterval;
	}

	public void setBackupInterval(String backupInterval) {
		this.backupInterval = backupInterval;
		if(backupInterval != null){
			putQueryParameter("BackupInterval", backupInterval);
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

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		if(dBInstanceId != null){
			putQueryParameter("DBInstanceId", dBInstanceId);
		}
	}

	public Long getEnableBackupLog() {
		return this.enableBackupLog;
	}

	public void setEnableBackupLog(Long enableBackupLog) {
		this.enableBackupLog = enableBackupLog;
		if(enableBackupLog != null){
			putQueryParameter("EnableBackupLog", enableBackupLog.toString());
		}
	}

	public String getPreferredBackupPeriod() {
		return this.preferredBackupPeriod;
	}

	public void setPreferredBackupPeriod(String preferredBackupPeriod) {
		this.preferredBackupPeriod = preferredBackupPeriod;
		if(preferredBackupPeriod != null){
			putQueryParameter("PreferredBackupPeriod", preferredBackupPeriod);
		}
	}

	public Integer getBackupRetentionPolicyOnClusterDeletion() {
		return this.backupRetentionPolicyOnClusterDeletion;
	}

	public void setBackupRetentionPolicyOnClusterDeletion(Integer backupRetentionPolicyOnClusterDeletion) {
		this.backupRetentionPolicyOnClusterDeletion = backupRetentionPolicyOnClusterDeletion;
		if(backupRetentionPolicyOnClusterDeletion != null){
			putQueryParameter("BackupRetentionPolicyOnClusterDeletion", backupRetentionPolicyOnClusterDeletion.toString());
		}
	}

	public String getDestRegion() {
		return this.destRegion;
	}

	public void setDestRegion(String destRegion) {
		this.destRegion = destRegion;
		if(destRegion != null){
			putQueryParameter("DestRegion", destRegion);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getCrossBackupType() {
		return this.crossBackupType;
	}

	public void setCrossBackupType(String crossBackupType) {
		this.crossBackupType = crossBackupType;
		if(crossBackupType != null){
			putQueryParameter("CrossBackupType", crossBackupType);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getSnapshotBackupType() {
		return this.snapshotBackupType;
	}

	public void setSnapshotBackupType(String snapshotBackupType) {
		this.snapshotBackupType = snapshotBackupType;
		if(snapshotBackupType != null){
			putQueryParameter("SnapshotBackupType", snapshotBackupType);
		}
	}

	public String getPreferredBackupTime() {
		return this.preferredBackupTime;
	}

	public void setPreferredBackupTime(String preferredBackupTime) {
		this.preferredBackupTime = preferredBackupTime;
		if(preferredBackupTime != null){
			putQueryParameter("PreferredBackupTime", preferredBackupTime);
		}
	}

	public Long getBackupRetentionPeriod() {
		return this.backupRetentionPeriod;
	}

	public void setBackupRetentionPeriod(Long backupRetentionPeriod) {
		this.backupRetentionPeriod = backupRetentionPeriod;
		if(backupRetentionPeriod != null){
			putQueryParameter("BackupRetentionPeriod", backupRetentionPeriod.toString());
		}
	}

	public Long getHighFrequencyBackupRetention() {
		return this.highFrequencyBackupRetention;
	}

	public void setHighFrequencyBackupRetention(Long highFrequencyBackupRetention) {
		this.highFrequencyBackupRetention = highFrequencyBackupRetention;
		if(highFrequencyBackupRetention != null){
			putQueryParameter("HighFrequencyBackupRetention", highFrequencyBackupRetention.toString());
		}
	}

	public Integer getEnableCrossLogBackup() {
		return this.enableCrossLogBackup;
	}

	public void setEnableCrossLogBackup(Integer enableCrossLogBackup) {
		this.enableCrossLogBackup = enableCrossLogBackup;
		if(enableCrossLogBackup != null){
			putQueryParameter("EnableCrossLogBackup", enableCrossLogBackup.toString());
		}
	}

	public String getCrossBackupPeriod() {
		return this.crossBackupPeriod;
	}

	public void setCrossBackupPeriod(String crossBackupPeriod) {
		this.crossBackupPeriod = crossBackupPeriod;
		if(crossBackupPeriod != null){
			putQueryParameter("CrossBackupPeriod", crossBackupPeriod);
		}
	}

	public Integer getCrossRetentionValue() {
		return this.crossRetentionValue;
	}

	public void setCrossRetentionValue(Integer crossRetentionValue) {
		this.crossRetentionValue = crossRetentionValue;
		if(crossRetentionValue != null){
			putQueryParameter("CrossRetentionValue", crossRetentionValue.toString());
		}
	}

	public String getCrossLogRetentionType() {
		return this.crossLogRetentionType;
	}

	public void setCrossLogRetentionType(String crossLogRetentionType) {
		this.crossLogRetentionType = crossLogRetentionType;
		if(crossLogRetentionType != null){
			putQueryParameter("CrossLogRetentionType", crossLogRetentionType);
		}
	}

	public Long getLogBackupRetentionPeriod() {
		return this.logBackupRetentionPeriod;
	}

	public void setLogBackupRetentionPeriod(Long logBackupRetentionPeriod) {
		this.logBackupRetentionPeriod = logBackupRetentionPeriod;
		if(logBackupRetentionPeriod != null){
			putQueryParameter("LogBackupRetentionPeriod", logBackupRetentionPeriod.toString());
		}
	}

	public Boolean getPreserveOneEachHour() {
		return this.preserveOneEachHour;
	}

	public void setPreserveOneEachHour(Boolean preserveOneEachHour) {
		this.preserveOneEachHour = preserveOneEachHour;
		if(preserveOneEachHour != null){
			putQueryParameter("PreserveOneEachHour", preserveOneEachHour.toString());
		}
	}

	@Override
	public Class<ModifyBackupPolicyResponse> getResponseClass() {
		return ModifyBackupPolicyResponse.class;
	}

}
