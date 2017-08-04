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
public class AddCdnDomainRequest extends RpcAcsRequest<AddCdnDomainResponse> {
	
	public AddCdnDomainRequest() {
		super("Cdn", "2014-11-11", "AddCdnDomain", "None");
	}

	private String topLevelDomain;

	private String sources;

	private String ownerAccount;

	private String domainName;

	private Long ownerId;

	private String resourceGroupId;

	private Integer sourcePort;

	private String priorities;

	private String securityToken;

	private String cdnType;

	private String scope;

	private String sourceType;

	private String checkUrl;

	private String region;

	public String getTopLevelDomain() {
		return this.topLevelDomain;
	}

	public void setTopLevelDomain(String topLevelDomain) {
		this.topLevelDomain = topLevelDomain;
		if(topLevelDomain != null){
			putQueryParameter("TopLevelDomain", topLevelDomain);
		}
	}

	public String getSources() {
		return this.sources;
	}

	public void setSources(String sources) {
		this.sources = sources;
		if(sources != null){
			putQueryParameter("Sources", sources);
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

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		if(domainName != null){
			putQueryParameter("DomainName", domainName);
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

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public Integer getSourcePort() {
		return this.sourcePort;
	}

	public void setSourcePort(Integer sourcePort) {
		this.sourcePort = sourcePort;
		if(sourcePort != null){
			putQueryParameter("SourcePort", sourcePort.toString());
		}
	}

	public String getPriorities() {
		return this.priorities;
	}

	public void setPriorities(String priorities) {
		this.priorities = priorities;
		if(priorities != null){
			putQueryParameter("Priorities", priorities);
		}
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public String getCdnType() {
		return this.cdnType;
	}

	public void setCdnType(String cdnType) {
		this.cdnType = cdnType;
		if(cdnType != null){
			putQueryParameter("CdnType", cdnType);
		}
	}

	public String getScope() {
		return this.scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
		if(scope != null){
			putQueryParameter("Scope", scope);
		}
	}

	public String getSourceType() {
		return this.sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
		if(sourceType != null){
			putQueryParameter("SourceType", sourceType);
		}
	}

	public String getCheckUrl() {
		return this.checkUrl;
	}

	public void setCheckUrl(String checkUrl) {
		this.checkUrl = checkUrl;
		if(checkUrl != null){
			putQueryParameter("CheckUrl", checkUrl);
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("Region", region);
		}
	}

	@Override
	public Class<AddCdnDomainResponse> getResponseClass() {
		return AddCdnDomainResponse.class;
	}

}
