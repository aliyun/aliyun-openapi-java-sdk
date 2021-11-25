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
public class DescribeWatchItemsRequest extends RpcAcsRequest<DescribeWatchItemsResponse> {
	   

	private String watchItemIds;

	private Long pageNumber;

	private Long pageSize;

	private String watchPolicyId;
	public DescribeWatchItemsRequest() {
		super("Vcs", "2020-05-15", "DescribeWatchItems");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getWatchItemIds() {
		return this.watchItemIds;
	}

	public void setWatchItemIds(String watchItemIds) {
		this.watchItemIds = watchItemIds;
		if(watchItemIds != null){
			putBodyParameter("WatchItemIds", watchItemIds);
		}
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putBodyParameter("PageNumber", pageNumber.toString());
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public String getWatchPolicyId() {
		return this.watchPolicyId;
	}

	public void setWatchPolicyId(String watchPolicyId) {
		this.watchPolicyId = watchPolicyId;
		if(watchPolicyId != null){
			putBodyParameter("WatchPolicyId", watchPolicyId);
		}
	}

	@Override
	public Class<DescribeWatchItemsResponse> getResponseClass() {
		return DescribeWatchItemsResponse.class;
	}

}
