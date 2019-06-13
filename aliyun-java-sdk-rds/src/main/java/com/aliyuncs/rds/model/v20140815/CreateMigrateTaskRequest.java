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
public class CreateMigrateTaskRequest extends RpcAcsRequest<CreateMigrateTaskResponse> {
	
	public CreateMigrateTaskRequest() {
		super("Rds", "2014-08-15", "CreateMigrateTask", "rds");
	}

	private Long resourceOwnerId;

	private String migrateTaskId;

	private String resourceOwnerAccount;

	private String isOnlineDB;

	private Long ownerId;

	private String ossObjectPositions;

	private String oSSUrls;

	private String dBName;

	private String dBInstanceId;

	private String backupMode;

	private String checkDBMode;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getMigrateTaskId() {
		return this.migrateTaskId;
	}

	public void setMigrateTaskId(String migrateTaskId) {
		this.migrateTaskId = migrateTaskId;
		if(migrateTaskId != null){
			putQueryParameter("MigrateTaskId", migrateTaskId);
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

	public String getIsOnlineDB() {
		return this.isOnlineDB;
	}

	public void setIsOnlineDB(String isOnlineDB) {
		this.isOnlineDB = isOnlineDB;
		if(isOnlineDB != null){
			putQueryParameter("IsOnlineDB", isOnlineDB);
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

	public String getOssObjectPositions() {
		return this.ossObjectPositions;
	}

	public void setOssObjectPositions(String ossObjectPositions) {
		this.ossObjectPositions = ossObjectPositions;
		if(ossObjectPositions != null){
			putQueryParameter("OssObjectPositions", ossObjectPositions);
		}
	}

	public String getOSSUrls() {
		return this.oSSUrls;
	}

	public void setOSSUrls(String oSSUrls) {
		this.oSSUrls = oSSUrls;
		if(oSSUrls != null){
			putQueryParameter("OSSUrls", oSSUrls);
		}
	}

	public String getDBName() {
		return this.dBName;
	}

	public void setDBName(String dBName) {
		this.dBName = dBName;
		if(dBName != null){
			putQueryParameter("DBName", dBName);
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

	public String getBackupMode() {
		return this.backupMode;
	}

	public void setBackupMode(String backupMode) {
		this.backupMode = backupMode;
		if(backupMode != null){
			putQueryParameter("BackupMode", backupMode);
		}
	}

	public String getCheckDBMode() {
		return this.checkDBMode;
	}

	public void setCheckDBMode(String checkDBMode) {
		this.checkDBMode = checkDBMode;
		if(checkDBMode != null){
			putQueryParameter("CheckDBMode", checkDBMode);
		}
	}

	@Override
	public Class<CreateMigrateTaskResponse> getResponseClass() {
		return CreateMigrateTaskResponse.class;
	}

}
