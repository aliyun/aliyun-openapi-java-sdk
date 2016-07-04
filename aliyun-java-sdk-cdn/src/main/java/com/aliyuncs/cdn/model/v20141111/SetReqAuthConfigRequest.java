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
package com.aliyuncs.cdn.model.v20141111;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class SetReqAuthConfigRequest extends RpcAcsRequest<SetReqAuthConfigResponse> {
	
	public SetReqAuthConfigRequest() {
		super("Cdn", "2014-11-11", "SetReqAuthConfig");
	}

	private Long ownerId;

	private String securityToken;

	private String domainName;

	private String authType;

	private String key1;

	private String key2;

	private String timeOut;

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		putQueryParameter("OwnerId", ownerId);
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		putQueryParameter("SecurityToken", securityToken);
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		putQueryParameter("DomainName", domainName);
	}

	public String getAuthType() {
		return this.authType;
	}

	public void setAuthType(String authType) {
		this.authType = authType;
		putQueryParameter("AuthType", authType);
	}

	public String getKey1() {
		return this.key1;
	}

	public void setKey1(String key1) {
		this.key1 = key1;
		putQueryParameter("Key1", key1);
	}

	public String getKey2() {
		return this.key2;
	}

	public void setKey2(String key2) {
		this.key2 = key2;
		putQueryParameter("Key2", key2);
	}

	public String getTimeOut() {
		return this.timeOut;
	}

	public void setTimeOut(String timeOut) {
		this.timeOut = timeOut;
		putQueryParameter("TimeOut", timeOut);
	}

	@Override
	public Class<SetReqAuthConfigResponse> getResponseClass() {
		return SetReqAuthConfigResponse.class;
	}

}
