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
public class CreateDBInstanceforFirstPayRequest extends RpcAcsRequest<CreateDBInstanceforFirstPayResponse> {
	
	public CreateDBInstanceforFirstPayRequest() {
		super("Rds", "2014-08-15", "CreateDBInstanceforFirstPay");
	}

	private Long uid;

	private String bid;

	private String uidLoginEmail;

	private String bidLoginEmail;

	private String engine;

	private String engineVersion;

	private String dBInstanceClass;

	private Integer dBInstanceStorage;

	private String dBInstanceNetType;

	private String characterSetName;

	private String dBInstanceRemarks;

	private String clientToken;

	private String ownerAccount;

	public Long getuid() {
		return this.uid;
	}

	public void setuid(Long uid) {
		this.uid = uid;
		putQueryParameter("uid", String.valueOf(uid));
	}

	public String getbid() {
		return this.bid;
	}

	public void setbid(String bid) {
		this.bid = bid;
		putQueryParameter("bid", bid);
	}

	public String getuidLoginEmail() {
		return this.uidLoginEmail;
	}

	public void setuidLoginEmail(String uidLoginEmail) {
		this.uidLoginEmail = uidLoginEmail;
		putQueryParameter("uidLoginEmail", uidLoginEmail);
	}

	public String getbidLoginEmail() {
		return this.bidLoginEmail;
	}

	public void setbidLoginEmail(String bidLoginEmail) {
		this.bidLoginEmail = bidLoginEmail;
		putQueryParameter("bidLoginEmail", bidLoginEmail);
	}

	public String getEngine() {
		return this.engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
		putQueryParameter("Engine", engine);
	}

	public String getEngineVersion() {
		return this.engineVersion;
	}

	public void setEngineVersion(String engineVersion) {
		this.engineVersion = engineVersion;
		putQueryParameter("EngineVersion", engineVersion);
	}

	public String getDBInstanceClass() {
		return this.dBInstanceClass;
	}

	public void setDBInstanceClass(String dBInstanceClass) {
		this.dBInstanceClass = dBInstanceClass;
		putQueryParameter("DBInstanceClass", dBInstanceClass);
	}

	public Integer getDBInstanceStorage() {
		return this.dBInstanceStorage;
	}

	public void setDBInstanceStorage(Integer dBInstanceStorage) {
		this.dBInstanceStorage = dBInstanceStorage;
		putQueryParameter("DBInstanceStorage", String.valueOf(dBInstanceStorage));
	}

	public String getDBInstanceNetType() {
		return this.dBInstanceNetType;
	}

	public void setDBInstanceNetType(String dBInstanceNetType) {
		this.dBInstanceNetType = dBInstanceNetType;
		putQueryParameter("DBInstanceNetType", dBInstanceNetType);
	}

	public String getCharacterSetName() {
		return this.characterSetName;
	}

	public void setCharacterSetName(String characterSetName) {
		this.characterSetName = characterSetName;
		putQueryParameter("CharacterSetName", characterSetName);
	}

	public String getDBInstanceRemarks() {
		return this.dBInstanceRemarks;
	}

	public void setDBInstanceRemarks(String dBInstanceRemarks) {
		this.dBInstanceRemarks = dBInstanceRemarks;
		putQueryParameter("DBInstanceRemarks", dBInstanceRemarks);
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		putQueryParameter("ClientToken", clientToken);
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		putQueryParameter("OwnerAccount", ownerAccount);
	}

	@Override
	public Class<CreateDBInstanceforFirstPayResponse> getResponseClass() {
		return CreateDBInstanceforFirstPayResponse.class;
	}

}
