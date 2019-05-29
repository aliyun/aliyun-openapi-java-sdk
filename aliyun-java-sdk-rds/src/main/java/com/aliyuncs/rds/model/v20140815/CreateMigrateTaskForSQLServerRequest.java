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
public class CreateMigrateTaskForSQLServerRequest extends RpcAcsRequest<CreateMigrateTaskForSQLServerResponse> {
	
	public CreateMigrateTaskForSQLServerRequest() {
		super("Rds", "2014-08-15", "CreateMigrateTaskForSQLServer", "rds");
	}

	private Long resourceOwnerId;

	private String taskType;

	private String dBName;

	private String resourceOwnerAccount;

	private String isOnlineDB;

	private String dBInstanceId;

	private Long ownerId;

	private String oSSUrls;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getTaskType() {
		return this.taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
		if(taskType != null){
			putQueryParameter("TaskType", taskType);
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

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		if(dBInstanceId != null){
			putQueryParameter("DBInstanceId", dBInstanceId);
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

	public String getOSSUrls() {
		return this.oSSUrls;
	}

	public void setOSSUrls(String oSSUrls) {
		this.oSSUrls = oSSUrls;
		if(oSSUrls != null){
			putQueryParameter("OSSUrls", oSSUrls);
		}
	}

	@Override
	public Class<CreateMigrateTaskForSQLServerResponse> getResponseClass() {
		return CreateMigrateTaskForSQLServerResponse.class;
	}

}
