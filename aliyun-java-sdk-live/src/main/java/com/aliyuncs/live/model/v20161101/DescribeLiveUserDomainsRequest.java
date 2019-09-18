/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.live.model.v20161101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.live.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveUserDomainsRequest extends RpcAcsRequest<DescribeLiveUserDomainsResponse> {
	
	public DescribeLiveUserDomainsRequest() {
		super("live", "2016-11-01", "DescribeLiveUserDomains", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Integer pageNumber;

	private String securityToken;

	private Integer pageSize;

	private String regionName;

	private String domainName;

	private Long ownerId;

	private String domainStatus;

	private String domainSearchType;

	private String liveDomainType;

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getBizSecurityToken() {
		return this.securityToken;
	}

	public void setBizSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	/**
	 * @deprecated use getBizSecurityToken instead of this.
	 */
	@Deprecated
	public String getSecurityToken() {
		return this.securityToken;
	}

	/**
	 * @deprecated use setBizSecurityToken instead of this.
	 */
	@Deprecated
	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
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

	public String getRegionName() {
		return this.regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
		if(regionName != null){
			putQueryParameter("RegionName", regionName);
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

	public String getLiveDomainType() {
		return this.liveDomainType;
	}

	public void setLiveDomainType(String liveDomainType) {
		this.liveDomainType = liveDomainType;
		if(liveDomainType != null){
			putQueryParameter("LiveDomainType", liveDomainType);
		}
	}

	@Override
	public Class<DescribeLiveUserDomainsResponse> getResponseClass() {
		return DescribeLiveUserDomainsResponse.class;
	}

}
