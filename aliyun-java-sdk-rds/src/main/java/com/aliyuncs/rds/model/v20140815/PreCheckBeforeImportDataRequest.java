/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class PreCheckBeforeImportDataRequest extends RpcAcsRequest<PreCheckBeforeImportDataResponse> {
	
	public PreCheckBeforeImportDataRequest() {
		super("Rds", "2014-08-15", "PreCheckBeforeImportData");
	}

	private Long ownerId;

	private String resourceOwnerAccount;

	private Long resourceOwnerId;

	private String clientToken;

	private String dBInstanceId;

	private String sourceDatabaseIp;

	private String sourceDatabasePort;

	private String sourceDatabaseUserName;

	private String sourceDatabasePassword;

	private String importDataType;

	private String sourceDatabaseDBNames;

	private String ownerAccount;

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		putQueryParameter("OwnerId", String.valueOf(ownerId));
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		putQueryParameter("ResourceOwnerId", String.valueOf(resourceOwnerId));
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		putQueryParameter("ClientToken", clientToken);
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		putQueryParameter("DBInstanceId", dBInstanceId);
	}

	public String getSourceDatabaseIp() {
		return this.sourceDatabaseIp;
	}

	public void setSourceDatabaseIp(String sourceDatabaseIp) {
		this.sourceDatabaseIp = sourceDatabaseIp;
		putQueryParameter("SourceDatabaseIp", sourceDatabaseIp);
	}

	public String getSourceDatabasePort() {
		return this.sourceDatabasePort;
	}

	public void setSourceDatabasePort(String sourceDatabasePort) {
		this.sourceDatabasePort = sourceDatabasePort;
		putQueryParameter("SourceDatabasePort", sourceDatabasePort);
	}

	public String getSourceDatabaseUserName() {
		return this.sourceDatabaseUserName;
	}

	public void setSourceDatabaseUserName(String sourceDatabaseUserName) {
		this.sourceDatabaseUserName = sourceDatabaseUserName;
		putQueryParameter("SourceDatabaseUserName", sourceDatabaseUserName);
	}

	public String getSourceDatabasePassword() {
		return this.sourceDatabasePassword;
	}

	public void setSourceDatabasePassword(String sourceDatabasePassword) {
		this.sourceDatabasePassword = sourceDatabasePassword;
		putQueryParameter("SourceDatabasePassword", sourceDatabasePassword);
	}

	public String getImportDataType() {
		return this.importDataType;
	}

	public void setImportDataType(String importDataType) {
		this.importDataType = importDataType;
		putQueryParameter("ImportDataType", importDataType);
	}

	public String getSourceDatabaseDBNames() {
		return this.sourceDatabaseDBNames;
	}

	public void setSourceDatabaseDBNames(String sourceDatabaseDBNames) {
		this.sourceDatabaseDBNames = sourceDatabaseDBNames;
		putQueryParameter("SourceDatabaseDBNames", sourceDatabaseDBNames);
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		putQueryParameter("OwnerAccount", ownerAccount);
	}

	@Override
	public Class<PreCheckBeforeImportDataResponse> getResponseClass() {
		return PreCheckBeforeImportDataResponse.class;
	}

}
