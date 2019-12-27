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
public class CopyDatabaseBetweenInstancesRequest extends RpcAcsRequest<CopyDatabaseBetweenInstancesResponse> {
	   

	private Long resourceOwnerId;

	private String dBInstanceId;

	private String restoreTime;

	private String backupId;

	private String syncUserPrivilege;

	private String dbNames;

	private String targetDBInstanceId;
	public CopyDatabaseBetweenInstancesRequest() {
		super("Rds", "2014-08-15", "CopyDatabaseBetweenInstances", "rds");
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

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		if(dBInstanceId != null){
			putQueryParameter("DBInstanceId", dBInstanceId);
		}
	}

	public String getRestoreTime() {
		return this.restoreTime;
	}

	public void setRestoreTime(String restoreTime) {
		this.restoreTime = restoreTime;
		if(restoreTime != null){
			putQueryParameter("RestoreTime", restoreTime);
		}
	}

	public String getBackupId() {
		return this.backupId;
	}

	public void setBackupId(String backupId) {
		this.backupId = backupId;
		if(backupId != null){
			putQueryParameter("BackupId", backupId);
		}
	}

	public String getSyncUserPrivilege() {
		return this.syncUserPrivilege;
	}

	public void setSyncUserPrivilege(String syncUserPrivilege) {
		this.syncUserPrivilege = syncUserPrivilege;
		if(syncUserPrivilege != null){
			putQueryParameter("SyncUserPrivilege", syncUserPrivilege);
		}
	}

	public String getDbNames() {
		return this.dbNames;
	}

	public void setDbNames(String dbNames) {
		this.dbNames = dbNames;
		if(dbNames != null){
			putQueryParameter("DbNames", dbNames);
		}
	}

	public String getTargetDBInstanceId() {
		return this.targetDBInstanceId;
	}

	public void setTargetDBInstanceId(String targetDBInstanceId) {
		this.targetDBInstanceId = targetDBInstanceId;
		if(targetDBInstanceId != null){
			putQueryParameter("TargetDBInstanceId", targetDBInstanceId);
		}
	}

	@Override
	public Class<CopyDatabaseBetweenInstancesResponse> getResponseClass() {
		return CopyDatabaseBetweenInstancesResponse.class;
	}

}
