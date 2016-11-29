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
public class ImportDatabaseBetweenInstancesRequest extends RpcAcsRequest<ImportDatabaseBetweenInstancesResponse> {
	
	public ImportDatabaseBetweenInstancesRequest() {
		super("Rds", "2014-08-15", "ImportDatabaseBetweenInstances", "rds");
	}

	private Long ownerId;

	private String resourceOwnerAccount;

	private Long resourceOwnerId;

	private String dBInstanceId;

	private String sourceDBInstanceId;

	private String dBInfo;

	private String ownerAccount;

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		putQueryParameter("OwnerId", ownerId);
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
		putQueryParameter("ResourceOwnerId", resourceOwnerId);
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		putQueryParameter("DBInstanceId", dBInstanceId);
	}

	public String getSourceDBInstanceId() {
		return this.sourceDBInstanceId;
	}

	public void setSourceDBInstanceId(String sourceDBInstanceId) {
		this.sourceDBInstanceId = sourceDBInstanceId;
		putQueryParameter("SourceDBInstanceId", sourceDBInstanceId);
	}

	public String getDBInfo() {
		return this.dBInfo;
	}

	public void setDBInfo(String dBInfo) {
		this.dBInfo = dBInfo;
		putQueryParameter("DBInfo", dBInfo);
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		putQueryParameter("OwnerAccount", ownerAccount);
	}

	@Override
	public Class<ImportDatabaseBetweenInstancesResponse> getResponseClass() {
		return ImportDatabaseBetweenInstancesResponse.class;
	}

}
