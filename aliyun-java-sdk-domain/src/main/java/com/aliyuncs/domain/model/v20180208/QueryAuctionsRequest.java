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

package com.aliyuncs.domain.model.v20180208;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.domain.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryAuctionsRequest extends RpcAcsRequest<QueryAuctionsResponse> {
	   

	private Integer currentPage;

	private Integer pageSize;

	private String statuses;

	private String auctionEndTimeOrder;

	private String status;
	public QueryAuctionsRequest() {
		super("Domain", "2018-02-08", "QueryAuctions", "domain");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public String getStatuses() {
		return this.statuses;
	}

	public void setStatuses(String statuses) {
		this.statuses = statuses;
		if(statuses != null){
			putBodyParameter("Statuses", statuses);
		}
	}

	public String getAuctionEndTimeOrder() {
		return this.auctionEndTimeOrder;
	}

	public void setAuctionEndTimeOrder(String auctionEndTimeOrder) {
		this.auctionEndTimeOrder = auctionEndTimeOrder;
		if(auctionEndTimeOrder != null){
			putBodyParameter("AuctionEndTimeOrder", auctionEndTimeOrder);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status);
		}
	}

	@Override
	public Class<QueryAuctionsResponse> getResponseClass() {
		return QueryAuctionsResponse.class;
	}

}
