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

package com.aliyuncs.dcdn.model.v20180115;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dcdn.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeDcdnUserDomainsRequest extends RpcAcsRequest<DescribeDcdnUserDomainsResponse> {
	   

	private Integer pageNumber;

	private Boolean checkDomainShow;

	private String resourceGroupId;

	private String securityToken;

	private String changeEndTime;

	private Integer pageSize;

	private String domainName;

	private Long ownerId;

	private String domainStatus;

	private String domainSearchType;

	private String changeStartTime;
	public DescribeDcdnUserDomainsRequest() {
		super("dcdn", "2018-01-15", "DescribeDcdnUserDomains");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getChangeEndTime() {
		return this.changeEndTime;
	}

	public void setChangeEndTime(String changeEndTime) {
		this.changeEndTime = changeEndTime;
		if(changeEndTime != null){
			putQueryParameter("ChangeEndTime", changeEndTime);
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

	public String getChangeStartTime() {
		return this.changeStartTime;
	}

	public void setChangeStartTime(String changeStartTime) {
		this.changeStartTime = changeStartTime;
		if(changeStartTime != null){
			putQueryParameter("ChangeStartTime", changeStartTime);
		}
	}

	@Override
	public Class<DescribeDcdnUserDomainsResponse> getResponseClass() {
		return DescribeDcdnUserDomainsResponse.class;
	}

}
