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
public class ModifyHttpHeaderConfigRequest extends RpcAcsRequest<ModifyHttpHeaderConfigResponse> {
	
	public ModifyHttpHeaderConfigRequest() {
		super("Cdn", "2014-11-11", "ModifyHttpHeaderConfig");
	}

	private Long ownerId;

	private String securityToken;

	private String domainName;

	private String headerKey;

	private String headerValue;

	private String configID;

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

	public String getHeaderKey() {
		return this.headerKey;
	}

	public void setHeaderKey(String headerKey) {
		this.headerKey = headerKey;
		putQueryParameter("HeaderKey", headerKey);
	}

	public String getHeaderValue() {
		return this.headerValue;
	}

	public void setHeaderValue(String headerValue) {
		this.headerValue = headerValue;
		putQueryParameter("HeaderValue", headerValue);
	}

	public String getConfigID() {
		return this.configID;
	}

	public void setConfigID(String configID) {
		this.configID = configID;
		putQueryParameter("ConfigID", configID);
	}

	@Override
	public Class<ModifyHttpHeaderConfigResponse> getResponseClass() {
		return ModifyHttpHeaderConfigResponse.class;
	}

}
