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

package com.aliyuncs.dataworks_public.model.v20200518;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListDataServiceApisRequest extends RpcAcsRequest<ListDataServiceApisResponse> {
	   

	private String apiNameKeyword;

	private String apiPathKeyword;

	private String creatorId;

	private Integer pageNumber;

	private Integer pageSize;

	private Long tenantId;

	private Long projectId;
	public ListDataServiceApisRequest() {
		super("dataworks-public", "2020-05-18", "ListDataServiceApis", "dide");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getApiNameKeyword() {
		return this.apiNameKeyword;
	}

	public void setApiNameKeyword(String apiNameKeyword) {
		this.apiNameKeyword = apiNameKeyword;
		if(apiNameKeyword != null){
			putBodyParameter("ApiNameKeyword", apiNameKeyword);
		}
	}

	public String getApiPathKeyword() {
		return this.apiPathKeyword;
	}

	public void setApiPathKeyword(String apiPathKeyword) {
		this.apiPathKeyword = apiPathKeyword;
		if(apiPathKeyword != null){
			putBodyParameter("ApiPathKeyword", apiPathKeyword);
		}
	}

	public String getCreatorId() {
		return this.creatorId;
	}

	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
		if(creatorId != null){
			putBodyParameter("CreatorId", creatorId);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putBodyParameter("PageNumber", pageNumber.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public Long getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId.toString());
		}
	}

	public Long getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putBodyParameter("ProjectId", projectId.toString());
		}
	}

	@Override
	public Class<ListDataServiceApisResponse> getResponseClass() {
		return ListDataServiceApisResponse.class;
	}

}
