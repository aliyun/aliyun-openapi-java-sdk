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
public class ImportDataFromDatabaseRequest extends RpcAcsRequest<ImportDataFromDatabaseResponse> {
	
	public ImportDataFromDatabaseRequest() {
		super("Rds", "2014-08-15", "ImportDataFromDatabase", "rds");
	}

	private Long resourceOwnerId;

	private String importDataType;

	private String resourceOwnerAccount;

	private String isLockTable;

	private String ownerAccount;

	private String sourceDatabaseDBNames;

	private String sourceDatabaseIp;

	private Long ownerId;

	private String sourceDatabasePassword;

	private String sourceDatabasePort;

	private String sourceDatabaseUserName;

	private String dBInstanceId;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getImportDataType() {
		return this.importDataType;
	}

	public void setImportDataType(String importDataType) {
		this.importDataType = importDataType;
		if(importDataType != null){
			putQueryParameter("ImportDataType", importDataType);
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

	public String getIsLockTable() {
		return this.isLockTable;
	}

	public void setIsLockTable(String isLockTable) {
		this.isLockTable = isLockTable;
		if(isLockTable != null){
			putQueryParameter("IsLockTable", isLockTable);
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

	public String getSourceDatabaseDBNames() {
		return this.sourceDatabaseDBNames;
	}

	public void setSourceDatabaseDBNames(String sourceDatabaseDBNames) {
		this.sourceDatabaseDBNames = sourceDatabaseDBNames;
		if(sourceDatabaseDBNames != null){
			putQueryParameter("SourceDatabaseDBNames", sourceDatabaseDBNames);
		}
	}

	public String getSourceDatabaseIp() {
		return this.sourceDatabaseIp;
	}

	public void setSourceDatabaseIp(String sourceDatabaseIp) {
		this.sourceDatabaseIp = sourceDatabaseIp;
		if(sourceDatabaseIp != null){
			putQueryParameter("SourceDatabaseIp", sourceDatabaseIp);
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

	public String getSourceDatabasePassword() {
		return this.sourceDatabasePassword;
	}

	public void setSourceDatabasePassword(String sourceDatabasePassword) {
		this.sourceDatabasePassword = sourceDatabasePassword;
		if(sourceDatabasePassword != null){
			putQueryParameter("SourceDatabasePassword", sourceDatabasePassword);
		}
	}

	public String getSourceDatabasePort() {
		return this.sourceDatabasePort;
	}

	public void setSourceDatabasePort(String sourceDatabasePort) {
		this.sourceDatabasePort = sourceDatabasePort;
		if(sourceDatabasePort != null){
			putQueryParameter("SourceDatabasePort", sourceDatabasePort);
		}
	}

	public String getSourceDatabaseUserName() {
		return this.sourceDatabaseUserName;
	}

	public void setSourceDatabaseUserName(String sourceDatabaseUserName) {
		this.sourceDatabaseUserName = sourceDatabaseUserName;
		if(sourceDatabaseUserName != null){
			putQueryParameter("SourceDatabaseUserName", sourceDatabaseUserName);
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

	@Override
	public Class<ImportDataFromDatabaseResponse> getResponseClass() {
		return ImportDataFromDatabaseResponse.class;
	}

}
