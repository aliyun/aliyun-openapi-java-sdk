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
package com.aliyuncs.sts.model.v20150401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AssumeRoleRequest extends RpcAcsRequest<AssumeRoleResponse> {
	
	public AssumeRoleRequest() {
		super("Sts", "2015-04-01", "AssumeRole");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	private Long durationSeconds;

	private String externalId;

	private String policy;

	private String roleArn;

	private String roleSessionName;

	private String serialNumber;

	private String tokenCode;

	public Long getDurationSeconds() {
		return this.durationSeconds;
	}

	public void setDurationSeconds(Long durationSeconds) {
		this.durationSeconds = durationSeconds;
		putQueryParameter("DurationSeconds", String.valueOf(durationSeconds));
	}

	public String getExternalId() {
		return this.externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
		putQueryParameter("ExternalId", externalId);
	}

	public String getPolicy() {
		return this.policy;
	}

	public void setPolicy(String policy) {
		this.policy = policy;
		putQueryParameter("Policy", policy);
	}

	public String getRoleArn() {
		return this.roleArn;
	}

	public void setRoleArn(String roleArn) {
		this.roleArn = roleArn;
		putQueryParameter("RoleArn", roleArn);
	}

	public String getRoleSessionName() {
		return this.roleSessionName;
	}

	public void setRoleSessionName(String roleSessionName) {
		this.roleSessionName = roleSessionName;
		putQueryParameter("RoleSessionName", roleSessionName);
	}

	public String getSerialNumber() {
		return this.serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
		putQueryParameter("SerialNumber", serialNumber);
	}

	public String getTokenCode() {
		return this.tokenCode;
	}

	public void setTokenCode(String tokenCode) {
		this.tokenCode = tokenCode;
		putQueryParameter("TokenCode", tokenCode);
	}

	@Override
	public Class<AssumeRoleResponse> getResponseClass() {
		return AssumeRoleResponse.class;
	}

}
