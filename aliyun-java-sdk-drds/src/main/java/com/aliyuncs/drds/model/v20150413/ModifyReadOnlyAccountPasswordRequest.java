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
package com.aliyuncs.drds.model.v20150413;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ModifyReadOnlyAccountPasswordRequest extends RpcAcsRequest<ModifyReadOnlyAccountPasswordResponse> {
	
	public ModifyReadOnlyAccountPasswordRequest() {
		super("Drds", "2015-04-13", "ModifyReadOnlyAccountPassword");
	}

	private String drdsInstanceId;

	private String dbName;

	private String accountName;

	private String originPassword;

	private String newPasswd;

	public String getDrdsInstanceId() {
		return this.drdsInstanceId;
	}

	public void setDrdsInstanceId(String drdsInstanceId) {
		this.drdsInstanceId = drdsInstanceId;
		putQueryParameter("DrdsInstanceId", drdsInstanceId);
	}

	public String getDbName() {
		return this.dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
		putQueryParameter("DbName", dbName);
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
		putQueryParameter("AccountName", accountName);
	}

	public String getOriginPassword() {
		return this.originPassword;
	}

	public void setOriginPassword(String originPassword) {
		this.originPassword = originPassword;
		putQueryParameter("OriginPassword", originPassword);
	}

	public String getNewPasswd() {
		return this.newPasswd;
	}

	public void setNewPasswd(String newPasswd) {
		this.newPasswd = newPasswd;
		putQueryParameter("NewPasswd", newPasswd);
	}

	@Override
	public Class<ModifyReadOnlyAccountPasswordResponse> getResponseClass() {
		return ModifyReadOnlyAccountPasswordResponse.class;
	}

}
