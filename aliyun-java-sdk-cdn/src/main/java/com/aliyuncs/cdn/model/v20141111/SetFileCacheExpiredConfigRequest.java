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
public class SetFileCacheExpiredConfigRequest extends RpcAcsRequest<SetFileCacheExpiredConfigResponse> {
	
	public SetFileCacheExpiredConfigRequest() {
		super("Cdn", "2014-11-11", "SetFileCacheExpiredConfig");
	}

	private Long ownerId;

	private String securityToken;

	private String domainName;

	private String cacheContent;

	private String tTL;

	private String weight;

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

	public String getCacheContent() {
		return this.cacheContent;
	}

	public void setCacheContent(String cacheContent) {
		this.cacheContent = cacheContent;
		putQueryParameter("CacheContent", cacheContent);
	}

	public String getTTL() {
		return this.tTL;
	}

	public void setTTL(String tTL) {
		this.tTL = tTL;
		putQueryParameter("TTL", tTL);
	}

	public String getWeight() {
		return this.weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
		putQueryParameter("Weight", weight);
	}

	@Override
	public Class<SetFileCacheExpiredConfigResponse> getResponseClass() {
		return SetFileCacheExpiredConfigResponse.class;
	}

}
