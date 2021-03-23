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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.rds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyBackupPolicyRequest extends RpcAcsRequest<ModifyBackupPolicyResponse> {
	   

	private Long resourceOwnerId;

	private String localLogRetentionHours;

	private String logBackupFrequency;

	private Integer archiveBackupKeepCount;

	private String backupLog;

	private String backupInterval;

	private String highSpaceUsageProtection;

	private Integer logBackupLocalRetentionNumber;

	private String dBInstanceId;

	private String enableBackupLog;

	private String backupPolicyMode;

	private String preferredBackupPeriod;

	private String releasedKeepPolicy;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String compressType;

	private String localLogRetentionSpace;

	private Long ownerId;

	private String archiveBackupKeepPolicy;

	private String preferredBackupTime;

	private String backupRetentionPeriod;

	private String backupMethod;

	private String archiveBackupRetentionPeriod;

	private String category;

	private String logBackupRetentionPeriod;
	public ModifyBackupPolicyRequest() {
		super("Rds", "2014-08-15", "ModifyBackupPolicy", "rds");
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

	public String getLocalLogRetentionHours() {
		return this.localLogRetentionHours;
	}

	public void setLocalLogRetentionHours(String localLogRetentionHours) {
		this.localLogRetentionHours = localLogRetentionHours;
		if(localLogRetentionHours != null){
			putQueryParameter("LocalLogRetentionHours", localLogRetentionHours);
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

	public Integer getArchiveBackupKeepCount() {
		return this.archiveBackupKeepCount;
	}

	public void setArchiveBackupKeepCount(Integer archiveBackupKeepCount) {
		this.archiveBackupKeepCount = archiveBackupKeepCount;
		if(archiveBackupKeepCount != null){
			putQueryParameter("ArchiveBackupKeepCount", archiveBackupKeepCount.toString());
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

	public String getBackupInterval() {
		return this.backupInterval;
	}

	public void setBackupInterval(String backupInterval) {
		this.backupInterval = backupInterval;
		if(backupInterval != null){
			putQueryParameter("BackupInterval", backupInterval);
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

	public Integer getLogBackupLocalRetentionNumber() {
		return this.logBackupLocalRetentionNumber;
	}

	public void setLogBackupLocalRetentionNumber(Integer logBackupLocalRetentionNumber) {
		this.logBackupLocalRetentionNumber = logBackupLocalRetentionNumber;
		if(logBackupLocalRetentionNumber != null){
			putQueryParameter("LogBackupLocalRetentionNumber", logBackupLocalRetentionNumber.toString());
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

	public String getPreferredBackupPeriod() {
		return this.preferredBackupPeriod;
	}

	public void setPreferredBackupPeriod(String preferredBackupPeriod) {
		this.preferredBackupPeriod = preferredBackupPeriod;
		if(preferredBackupPeriod != null){
			putQueryParameter("PreferredBackupPeriod", preferredBackupPeriod);
		}
	}

	public String getReleasedKeepPolicy() {
		return this.releasedKeepPolicy;
	}

	public void setReleasedKeepPolicy(String releasedKeepPolicy) {
		this.releasedKeepPolicy = releasedKeepPolicy;
		if(releasedKeepPolicy != null){
			putQueryParameter("ReleasedKeepPolicy", releasedKeepPolicy);
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

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
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

	public String getArchiveBackupKeepPolicy() {
		return this.archiveBackupKeepPolicy;
	}

	public void setArchiveBackupKeepPolicy(String archiveBackupKeepPolicy) {
		this.archiveBackupKeepPolicy = archiveBackupKeepPolicy;
		if(archiveBackupKeepPolicy != null){
			putQueryParameter("ArchiveBackupKeepPolicy", archiveBackupKeepPolicy);
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

	public String getBackupMethod() {
		return this.backupMethod;
	}

	public void setBackupMethod(String backupMethod) {
		this.backupMethod = backupMethod;
		if(backupMethod != null){
			putQueryParameter("BackupMethod", backupMethod);
		}
	}

	public String getArchiveBackupRetentionPeriod() {
		return this.archiveBackupRetentionPeriod;
	}

	public void setArchiveBackupRetentionPeriod(String archiveBackupRetentionPeriod) {
		this.archiveBackupRetentionPeriod = archiveBackupRetentionPeriod;
		if(archiveBackupRetentionPeriod != null){
			putQueryParameter("ArchiveBackupRetentionPeriod", archiveBackupRetentionPeriod);
		}
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
		if(category != null){
			putQueryParameter("Category", category);
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

	@Override
	public Class<ModifyBackupPolicyResponse> getResponseClass() {
		return ModifyBackupPolicyResponse.class;
	}

}
