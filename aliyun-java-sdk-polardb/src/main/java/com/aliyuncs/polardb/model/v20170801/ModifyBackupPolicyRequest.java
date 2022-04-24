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

package com.aliyuncs.polardb.model.v20170801;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.polardb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyBackupPolicyRequest extends RpcAcsRequest<ModifyBackupPolicyResponse> {
	   

	private Long resourceOwnerId;

	private String dataLevel2BackupRetentionPeriod;

	private String dataLevel1BackupPeriod;

	private String dataLevel2BackupPeriod;

	private String preferredBackupPeriod;

	private String dataLevel1BackupRetentionPeriod;

	private String backupRetentionPolicyOnClusterDeletion;

	private String resourceOwnerAccount;

	private String dBClusterId;

	private String ownerAccount;

	private Long ownerId;

	private String preferredBackupTime;

	private String backupFrequency;

	private String dataLevel1BackupFrequency;

	private String dataLevel1BackupTime;
	public ModifyBackupPolicyRequest() {
		super("polardb", "2017-08-01", "ModifyBackupPolicy");
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

	public String getDataLevel2BackupRetentionPeriod() {
		return this.dataLevel2BackupRetentionPeriod;
	}

	public void setDataLevel2BackupRetentionPeriod(String dataLevel2BackupRetentionPeriod) {
		this.dataLevel2BackupRetentionPeriod = dataLevel2BackupRetentionPeriod;
		if(dataLevel2BackupRetentionPeriod != null){
			putQueryParameter("DataLevel2BackupRetentionPeriod", dataLevel2BackupRetentionPeriod);
		}
	}

	public String getDataLevel1BackupPeriod() {
		return this.dataLevel1BackupPeriod;
	}

	public void setDataLevel1BackupPeriod(String dataLevel1BackupPeriod) {
		this.dataLevel1BackupPeriod = dataLevel1BackupPeriod;
		if(dataLevel1BackupPeriod != null){
			putQueryParameter("DataLevel1BackupPeriod", dataLevel1BackupPeriod);
		}
	}

	public String getDataLevel2BackupPeriod() {
		return this.dataLevel2BackupPeriod;
	}

	public void setDataLevel2BackupPeriod(String dataLevel2BackupPeriod) {
		this.dataLevel2BackupPeriod = dataLevel2BackupPeriod;
		if(dataLevel2BackupPeriod != null){
			putQueryParameter("DataLevel2BackupPeriod", dataLevel2BackupPeriod);
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

	public String getDataLevel1BackupRetentionPeriod() {
		return this.dataLevel1BackupRetentionPeriod;
	}

	public void setDataLevel1BackupRetentionPeriod(String dataLevel1BackupRetentionPeriod) {
		this.dataLevel1BackupRetentionPeriod = dataLevel1BackupRetentionPeriod;
		if(dataLevel1BackupRetentionPeriod != null){
			putQueryParameter("DataLevel1BackupRetentionPeriod", dataLevel1BackupRetentionPeriod);
		}
	}

	public String getBackupRetentionPolicyOnClusterDeletion() {
		return this.backupRetentionPolicyOnClusterDeletion;
	}

	public void setBackupRetentionPolicyOnClusterDeletion(String backupRetentionPolicyOnClusterDeletion) {
		this.backupRetentionPolicyOnClusterDeletion = backupRetentionPolicyOnClusterDeletion;
		if(backupRetentionPolicyOnClusterDeletion != null){
			putQueryParameter("BackupRetentionPolicyOnClusterDeletion", backupRetentionPolicyOnClusterDeletion);
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

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
		if(dBClusterId != null){
			putQueryParameter("DBClusterId", dBClusterId);
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

	public String getPreferredBackupTime() {
		return this.preferredBackupTime;
	}

	public void setPreferredBackupTime(String preferredBackupTime) {
		this.preferredBackupTime = preferredBackupTime;
		if(preferredBackupTime != null){
			putQueryParameter("PreferredBackupTime", preferredBackupTime);
		}
	}

	public String getBackupFrequency() {
		return this.backupFrequency;
	}

	public void setBackupFrequency(String backupFrequency) {
		this.backupFrequency = backupFrequency;
		if(backupFrequency != null){
			putQueryParameter("BackupFrequency", backupFrequency);
		}
	}

	public String getDataLevel1BackupFrequency() {
		return this.dataLevel1BackupFrequency;
	}

	public void setDataLevel1BackupFrequency(String dataLevel1BackupFrequency) {
		this.dataLevel1BackupFrequency = dataLevel1BackupFrequency;
		if(dataLevel1BackupFrequency != null){
			putQueryParameter("DataLevel1BackupFrequency", dataLevel1BackupFrequency);
		}
	}

	public String getDataLevel1BackupTime() {
		return this.dataLevel1BackupTime;
	}

	public void setDataLevel1BackupTime(String dataLevel1BackupTime) {
		this.dataLevel1BackupTime = dataLevel1BackupTime;
		if(dataLevel1BackupTime != null){
			putQueryParameter("DataLevel1BackupTime", dataLevel1BackupTime);
		}
	}

	@Override
	public Class<ModifyBackupPolicyResponse> getResponseClass() {
		return ModifyBackupPolicyResponse.class;
	}

}
