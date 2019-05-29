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

package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ModifyBackupPolicyRequest extends RpcAcsRequest<ModifyBackupPolicyResponse> {
	
	public ModifyBackupPolicyRequest() {
		super("Rds", "2014-08-15", "ModifyBackupPolicy", "rds");
	}

	private String preferredBackupPeriod;

	private Long resourceOwnerId;

	private String resourceOwnerAccount;

	private String localLogRetentionHours;

	private String ownerAccount;

	private String logBackupFrequency;

	private String compressType;

	private String backupLog;

	private String localLogRetentionSpace;

	private Long ownerId;

	private String duplication;

	private String preferredBackupTime;

	private String backupRetentionPeriod;

	private String duplicationContent;

	private String highSpaceUsageProtection;

	private String dBInstanceId;

	private String duplicationLocation;

	private String logBackupRetentionPeriod;

	private String enableBackupLog;

	private String backupPolicyMode;

	public String getPreferredBackupPeriod() {
		return this.preferredBackupPeriod;
	}

	public void setPreferredBackupPeriod(String preferredBackupPeriod) {
		this.preferredBackupPeriod = preferredBackupPeriod;
		if(preferredBackupPeriod != null){
			putQueryParameter("PreferredBackupPeriod", preferredBackupPeriod);
		}
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

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getLocalLogRetentionHours() {
		return this.localLogRetentionHours;
	}

	public void setLocalLogRetentionHours(String localLogRetentionHours) {
		this.localLogRetentionHours = localLogRetentionHours;
		if(localLogRetentionHours != null){
			putQueryParameter("LocalLogRetentionHours", localLogRetentionHours);
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

	public String getLogBackupFrequency() {
		return this.logBackupFrequency;
	}

	public void setLogBackupFrequency(String logBackupFrequency) {
		this.logBackupFrequency = logBackupFrequency;
		if(logBackupFrequency != null){
			putQueryParameter("LogBackupFrequency", logBackupFrequency);
		}
	}

	public String getCompressType() {
		return this.compressType;
	}

	public void setCompressType(String compressType) {
		this.compressType = compressType;
		if(compressType != null){
			putQueryParameter("CompressType", compressType);
		}
	}

	public String getBackupLog() {
		return this.backupLog;
	}

	public void setBackupLog(String backupLog) {
		this.backupLog = backupLog;
		if(backupLog != null){
			putQueryParameter("BackupLog", backupLog);
		}
	}

	public String getLocalLogRetentionSpace() {
		return this.localLogRetentionSpace;
	}

	public void setLocalLogRetentionSpace(String localLogRetentionSpace) {
		this.localLogRetentionSpace = localLogRetentionSpace;
		if(localLogRetentionSpace != null){
			putQueryParameter("LocalLogRetentionSpace", localLogRetentionSpace);
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

	public String getDuplication() {
		return this.duplication;
	}

	public void setDuplication(String duplication) {
		this.duplication = duplication;
		if(duplication != null){
			putQueryParameter("Duplication", duplication);
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

	public String getBackupRetentionPeriod() {
		return this.backupRetentionPeriod;
	}

	public void setBackupRetentionPeriod(String backupRetentionPeriod) {
		this.backupRetentionPeriod = backupRetentionPeriod;
		if(backupRetentionPeriod != null){
			putQueryParameter("BackupRetentionPeriod", backupRetentionPeriod);
		}
	}

	public String getDuplicationContent() {
		return this.duplicationContent;
	}

	public void setDuplicationContent(String duplicationContent) {
		this.duplicationContent = duplicationContent;
		if(duplicationContent != null){
			putQueryParameter("DuplicationContent", duplicationContent);
		}
	}

	public String getHighSpaceUsageProtection() {
		return this.highSpaceUsageProtection;
	}

	public void setHighSpaceUsageProtection(String highSpaceUsageProtection) {
		this.highSpaceUsageProtection = highSpaceUsageProtection;
		if(highSpaceUsageProtection != null){
			putQueryParameter("HighSpaceUsageProtection", highSpaceUsageProtection);
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

	public String getDuplicationLocation() {
		return this.duplicationLocation;
	}

	public void setDuplicationLocation(String duplicationLocation) {
		this.duplicationLocation = duplicationLocation;
		if(duplicationLocation != null){
			putQueryParameter("DuplicationLocation", duplicationLocation);
		}
	}

	public String getLogBackupRetentionPeriod() {
		return this.logBackupRetentionPeriod;
	}

	public void setLogBackupRetentionPeriod(String logBackupRetentionPeriod) {
		this.logBackupRetentionPeriod = logBackupRetentionPeriod;
		if(logBackupRetentionPeriod != null){
			putQueryParameter("LogBackupRetentionPeriod", logBackupRetentionPeriod);
		}
	}

	public String getEnableBackupLog() {
		return this.enableBackupLog;
	}

	public void setEnableBackupLog(String enableBackupLog) {
		this.enableBackupLog = enableBackupLog;
		if(enableBackupLog != null){
			putQueryParameter("EnableBackupLog", enableBackupLog);
		}
	}

	public String getBackupPolicyMode() {
		return this.backupPolicyMode;
	}

	public void setBackupPolicyMode(String backupPolicyMode) {
		this.backupPolicyMode = backupPolicyMode;
		if(backupPolicyMode != null){
			putQueryParameter("BackupPolicyMode", backupPolicyMode);
		}
	}

	@Override
	public Class<ModifyBackupPolicyResponse> getResponseClass() {
		return ModifyBackupPolicyResponse.class;
	}

}
