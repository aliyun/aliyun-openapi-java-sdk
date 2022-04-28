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

package com.aliyuncs.vcs.model.v20200515;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vcs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeSearchItemsRequest extends RpcAcsRequest<DescribeSearchItemsResponse> {
	   

	private String pageNumber;

	private String searchTableId;

	private String pageSize;

	private String searchItemIds;
	public DescribeSearchItemsRequest() {
		super("Vcs", "2020-05-15", "DescribeSearchItems");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putBodyParameter("PageNumber", pageNumber);
		}
	}

	public String getSearchTableId() {
		return this.searchTableId;
	}

	public void setSearchTableId(String searchTableId) {
		this.searchTableId = searchTableId;
		if(searchTableId != null){
			putBodyParameter("SearchTableId", searchTableId);
		}
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize);
		}
	}

	public String getSearchItemIds() {
		return this.searchItemIds;
	}

	public void setSearchItemIds(String searchItemIds) {
		this.searchItemIds = searchItemIds;
		if(searchItemIds != null){
			putBodyParameter("SearchItemIds", searchItemIds);
		}
	}

	@Override
	public Class<DescribeSearchItemsResponse> getResponseClass() {
		return DescribeSearchItemsResponse.class;
	}

}
