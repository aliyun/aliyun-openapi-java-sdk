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

package com.aliyuncs.config.model.v20190108;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListDiscoveredResourcesRequest extends RpcAcsRequest<ListDiscoveredResourcesResponse> {
	   

	private Integer resourceDeleted;

	private Boolean multiAccount;

	private String regions;

	private Integer pageNumber;

	private Integer pageSize;

	private String complianceType;

	private String resourceId;

	private String resourceTypes;

	private Long memberId;
	public ListDiscoveredResourcesRequest() {
		super("Config", "2019-01-08", "ListDiscoveredResources", "config");
		setMethod(MethodType.GET);
	}

	public Integer getResourceDeleted() {
		return this.resourceDeleted;
	}

	public void setResourceDeleted(Integer resourceDeleted) {
		this.resourceDeleted = resourceDeleted;
		if(resourceDeleted != null){
			putQueryParameter("ResourceDeleted", resourceDeleted.toString());
		}
	}

	public Boolean getMultiAccount() {
		return this.multiAccount;
	}

	public void setMultiAccount(Boolean multiAccount) {
		this.multiAccount = multiAccount;
		if(multiAccount != null){
			putQueryParameter("MultiAccount", multiAccount.toString());
		}
	}

	public String getRegions() {
		return this.regions;
	}

	public void setRegions(String regions) {
		this.regions = regions;
		if(regions != null){
			putQueryParameter("Regions", regions);
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getComplianceType() {
		return this.complianceType;
	}

	public void setComplianceType(String complianceType) {
		this.complianceType = complianceType;
		if(complianceType != null){
			putQueryParameter("ComplianceType", complianceType);
		}
	}

	public String getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
		if(resourceId != null){
			putQueryParameter("ResourceId", resourceId);
		}
	}

	public String getResourceTypes() {
		return this.resourceTypes;
	}

	public void setResourceTypes(String resourceTypes) {
		this.resourceTypes = resourceTypes;
		if(resourceTypes != null){
			putQueryParameter("ResourceTypes", resourceTypes);
		}
	}

	public Long getMemberId() {
		return this.memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
		if(memberId != null){
			putQueryParameter("MemberId", memberId.toString());
		}
	}

	@Override
	public Class<ListDiscoveredResourcesResponse> getResponseClass() {
		return ListDiscoveredResourcesResponse.class;
	}

}
