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

package com.aliyuncs.cusanalytic_sc_online.model.v20190524;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.cusanalytic_sc_online.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetAnalyzeCommodityDataRequest extends RpcAcsRequest<GetAnalyzeCommodityDataResponse> {
	
	public GetAnalyzeCommodityDataRequest() {
		super("cusanalytic_sc_online", "2019-05-24", "GetAnalyzeCommodityData");
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Long startUserCount;

	private String endDate;

	private Long endUserCount;

	private Integer pageSize;

	private Long minSupportCount;

	private Integer pageIndex;

	private Long storeId;

	private String startDate;

	private Long stayPeriod;

	public Long getStartUserCount() {
		return this.startUserCount;
	}

	public void setStartUserCount(Long startUserCount) {
		this.startUserCount = startUserCount;
		if(startUserCount != null){
			putBodyParameter("StartUserCount", startUserCount.toString());
		}
	}

	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
		if(endDate != null){
			putBodyParameter("EndDate", endDate);
		}
	}

	public Long getEndUserCount() {
		return this.endUserCount;
	}

	public void setEndUserCount(Long endUserCount) {
		this.endUserCount = endUserCount;
		if(endUserCount != null){
			putBodyParameter("EndUserCount", endUserCount.toString());
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

	public Long getMinSupportCount() {
		return this.minSupportCount;
	}

	public void setMinSupportCount(Long minSupportCount) {
		this.minSupportCount = minSupportCount;
		if(minSupportCount != null){
			putBodyParameter("MinSupportCount", minSupportCount.toString());
		}
	}

	public Integer getPageIndex() {
		return this.pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
		if(pageIndex != null){
			putBodyParameter("PageIndex", pageIndex.toString());
		}
	}

	public Long getStoreId() {
		return this.storeId;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
		if(storeId != null){
			putBodyParameter("StoreId", storeId.toString());
		}
	}

	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
		if(startDate != null){
			putBodyParameter("StartDate", startDate);
		}
	}

	public Long getStayPeriod() {
		return this.stayPeriod;
	}

	public void setStayPeriod(Long stayPeriod) {
		this.stayPeriod = stayPeriod;
		if(stayPeriod != null){
			putBodyParameter("StayPeriod", stayPeriod.toString());
		}
	}

	@Override
	public Class<GetAnalyzeCommodityDataResponse> getResponseClass() {
		return GetAnalyzeCommodityDataResponse.class;
	}

}
