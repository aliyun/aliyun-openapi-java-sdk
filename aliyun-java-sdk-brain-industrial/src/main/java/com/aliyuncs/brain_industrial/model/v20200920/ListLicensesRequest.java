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

package com.aliyuncs.brain_industrial.model.v20200920;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.brain_industrial.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListLicensesRequest extends RpcAcsRequest<ListLicensesResponse> {
	   

	private Integer pageSize;

	private String queryStr;

	private Integer currentPage;
	public ListLicensesRequest() {
		super("brain-industrial", "2020-09-20", "ListLicenses", "aistudio");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getQueryStr() {
		return this.queryStr;
	}

	public void setQueryStr(String queryStr) {
		this.queryStr = queryStr;
		if(queryStr != null){
			putBodyParameter("QueryStr", queryStr);
		}
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putBodyParameter("CurrentPage", currentPage.toString());
		}
	}

	@Override
	public Class<ListLicensesResponse> getResponseClass() {
		return ListLicensesResponse.class;
	}

}
