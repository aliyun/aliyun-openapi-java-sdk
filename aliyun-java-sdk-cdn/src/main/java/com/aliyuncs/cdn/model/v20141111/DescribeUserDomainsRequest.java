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
public class DescribeUserDomainsRequest extends RpcAcsRequest<DescribeUserDomainsResponse> {
	
	public DescribeUserDomainsRequest() {
		super("Cdn", "2014-11-11", "DescribeUserDomains", "None");
	}

	private String sources;

	private String domainName;

	private Long ownerId;

	private Integer pageNumber;

	private String domainStatus;

	private String domainSearchType;

	private Boolean checkDomainShow;

	private String resourceGroupId;

	private String securityToken;

	private String cdnType;

	private Integer pageSize;

	public String getSources() {
		return this.sources;
	}

	public void setSources(String sources) {
		this.sources = sources;
		if(sources != null){
			putQueryParameter("Sources", sources);
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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getDomainStatus() {
		return this.domainStatus;
	}

	public void setDomainStatus(String domainStatus) {
		this.domainStatus = domainStatus;
		if(domainStatus != null){
			putQueryParameter("DomainStatus", domainStatus);
		}
	}

	public String getDomainSearchType() {
		return this.domainSearchType;
	}

	public void setDomainSearchType(String domainSearchType) {
		this.domainSearchType = domainSearchType;
		if(domainSearchType != null){
			putQueryParameter("DomainSearchType", domainSearchType);
		}
	}

	public Boolean getCheckDomainShow() {
		return this.checkDomainShow;
	}

	public void setCheckDomainShow(Boolean checkDomainShow) {
		this.checkDomainShow = checkDomainShow;
		if(checkDomainShow != null){
			putQueryParameter("CheckDomainShow", checkDomainShow.toString());
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	@Override
	public Class<DescribeUserDomainsResponse> getResponseClass() {
		return DescribeUserDomainsResponse.class;
	}

}
