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
public class ModifyInstanceCrossBackupPolicyRequest extends RpcAcsRequest<ModifyInstanceCrossBackupPolicyResponse> {
	   

	private Long resourceOwnerId;

	private Integer retentType;

	private String backupEnabled;

	private String dBInstanceId;

	private Integer retention;

	private String resourceOwnerAccount;

	private String crossBackupType;

	private String logBackupEnabled;

	private Long ownerId;

	private String crossBackupRegion;
	public ModifyInstanceCrossBackupPolicyRequest() {
		super("Rds", "2014-08-15", "ModifyInstanceCrossBackupPolicy", "rds");
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

	public Integer getRetentType() {
		return this.retentType;
	}

	public void setRetentType(Integer retentType) {
		this.retentType = retentType;
		if(retentType != null){
			putQueryParameter("RetentType", retentType.toString());
		}
	}

	public String getBackupEnabled() {
		return this.backupEnabled;
	}

	public void setBackupEnabled(String backupEnabled) {
		this.backupEnabled = backupEnabled;
		if(backupEnabled != null){
			putQueryParameter("BackupEnabled", backupEnabled);
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

	public Integer getRetention() {
		return this.retention;
	}

	public void setRetention(Integer retention) {
		this.retention = retention;
		if(retention != null){
			putQueryParameter("Retention", retention.toString());
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

	public String getLogBackupEnabled() {
		return this.logBackupEnabled;
	}

	public void setLogBackupEnabled(String logBackupEnabled) {
		this.logBackupEnabled = logBackupEnabled;
		if(logBackupEnabled != null){
			putQueryParameter("LogBackupEnabled", logBackupEnabled);
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

	public String getCrossBackupRegion() {
		return this.crossBackupRegion;
	}

	public void setCrossBackupRegion(String crossBackupRegion) {
		this.crossBackupRegion = crossBackupRegion;
		if(crossBackupRegion != null){
			putQueryParameter("CrossBackupRegion", crossBackupRegion);
		}
	}

	@Override
	public Class<ModifyInstanceCrossBackupPolicyResponse> getResponseClass() {
		return ModifyInstanceCrossBackupPolicyResponse.class;
	}

}
