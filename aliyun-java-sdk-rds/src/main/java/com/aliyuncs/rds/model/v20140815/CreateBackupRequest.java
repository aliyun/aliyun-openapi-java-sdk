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
public class CreateBackupRequest extends RpcAcsRequest<CreateBackupResponse> {
	
	public CreateBackupRequest() {
		super("Rds", "2014-08-15", "CreateBackup", "Rds");
	}

	private String backupMethod;

	private Long resourceOwnerId;

	private String backupStrategy;

	private String dBName;

	private String dBInstanceId;

	private String backupType;

	public String getBackupMethod() {
		return this.backupMethod;
	}

	public void setBackupMethod(String backupMethod) {
		this.backupMethod = backupMethod;
		if(backupMethod != null){
			putQueryParameter("BackupMethod", backupMethod);
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

	public String getBackupStrategy() {
		return this.backupStrategy;
	}

	public void setBackupStrategy(String backupStrategy) {
		this.backupStrategy = backupStrategy;
		if(backupStrategy != null){
			putQueryParameter("BackupStrategy", backupStrategy);
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

	public String getBackupType() {
		return this.backupType;
	}

	public void setBackupType(String backupType) {
		this.backupType = backupType;
		if(backupType != null){
			putQueryParameter("BackupType", backupType);
		}
	}

	@Override
	public Class<CreateBackupResponse> getResponseClass() {
		return CreateBackupResponse.class;
	}

}
