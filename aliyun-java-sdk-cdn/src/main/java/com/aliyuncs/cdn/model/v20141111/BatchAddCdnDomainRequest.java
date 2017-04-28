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
public class BatchAddCdnDomainRequest extends RpcAcsRequest<BatchAddCdnDomainResponse> {
	
	public BatchAddCdnDomainRequest() {
		super("Cdn", "2014-11-11", "BatchAddCdnDomain");
	}

	private Long ownerId;

	private String ownerAccount;

	private String securityToken;

	private String domainNames;

	private String cdnType;

	private String sourceType;

	private String sources;

	private Integer sourcePort;

	private String checkUrl;

	private String scope;

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		putQueryParameter("OwnerId", ownerId);
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		putQueryParameter("OwnerAccount", ownerAccount);
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		putQueryParameter("SecurityToken", securityToken);
	}

	public String getDomainNames() {
		return this.domainNames;
	}

	public void setDomainNames(String domainNames) {
		this.domainNames = domainNames;
		putQueryParameter("DomainNames", domainNames);
	}

	public String getCdnType() {
		return this.cdnType;
	}

	public void setCdnType(String cdnType) {
		this.cdnType = cdnType;
		putQueryParameter("CdnType", cdnType);
	}

	public String getSourceType() {
		return this.sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
		putQueryParameter("SourceType", sourceType);
	}

	public String getSources() {
		return this.sources;
	}

	public void setSources(String sources) {
		this.sources = sources;
		putQueryParameter("Sources", sources);
	}

	public Integer getSourcePort() {
		return this.sourcePort;
	}

	public void setSourcePort(Integer sourcePort) {
		this.sourcePort = sourcePort;
		putQueryParameter("SourcePort", sourcePort);
	}

	public String getCheckUrl() {
		return this.checkUrl;
	}

	public void setCheckUrl(String checkUrl) {
		this.checkUrl = checkUrl;
		putQueryParameter("CheckUrl", checkUrl);
	}

	public String getScope() {
		return this.scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
		putQueryParameter("Scope", scope);
	}

	@Override
	public Class<BatchAddCdnDomainResponse> getResponseClass() {
		return BatchAddCdnDomainResponse.class;
	}

}
