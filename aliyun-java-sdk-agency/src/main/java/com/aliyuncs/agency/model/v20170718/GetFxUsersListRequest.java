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

package com.aliyuncs.agency.model.v20170718;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.agency.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetFxUsersListRequest extends RpcAcsRequest<GetFxUsersListResponse> {
	   

	private Long parentUid;

	private Integer customerRebateType;

	private Integer pageSize;

	private Integer currentPage;

	private Integer isSub;
	public GetFxUsersListRequest() {
		super("Agency", "2017-07-18", "GetFxUsersList", "openApi");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getParentUid() {
		return this.parentUid;
	}

	public void setParentUid(Long parentUid) {
		this.parentUid = parentUid;
		if(parentUid != null){
			putQueryParameter("ParentUid", parentUid.toString());
		}
	}

	public Integer getCustomerRebateType() {
		return this.customerRebateType;
	}

	public void setCustomerRebateType(Integer customerRebateType) {
		this.customerRebateType = customerRebateType;
		if(customerRebateType != null){
			putQueryParameter("CustomerRebateType", customerRebateType.toString());
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

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
		}
	}

	public Integer getIsSub() {
		return this.isSub;
	}

	public void setIsSub(Integer isSub) {
		this.isSub = isSub;
		if(isSub != null){
			putQueryParameter("IsSub", isSub.toString());
		}
	}

	@Override
	public Class<GetFxUsersListResponse> getResponseClass() {
		return GetFxUsersListResponse.class;
	}

}
