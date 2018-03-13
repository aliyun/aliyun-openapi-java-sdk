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

/**
 * @author auto create
 * @version 
 */
public class QueryBidRecordsRequest extends RpcAcsRequest<QueryBidRecordsResponse> {
	
	public QueryBidRecordsRequest() {
		super("Domain", "2018-02-08", "QueryBidRecords");
	}

	private String auctionId;

	private Integer pageSize;

	private Integer currentPage;

	public String getAuctionId() {
		return this.auctionId;
	}

	public void setAuctionId(String auctionId) {
		this.auctionId = auctionId;
		if(auctionId != null){
			putBodyParameter("AuctionId", auctionId);
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
	public Class<QueryBidRecordsResponse> getResponseClass() {
		return QueryBidRecordsResponse.class;
	}

}
