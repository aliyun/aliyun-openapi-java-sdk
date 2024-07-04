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

package com.aliyuncs.nis.model.v20211216;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetNisNetworkRankingRequest extends RpcAcsRequest<GetNisNetworkRankingResponse> {
	   

	private Boolean useCrossAccount;

	private Integer topN;

	private String direction;

	private String orderBy;

	private Long endTime;

	private Long beginTime;

	private String groupBy;

	private String sort;

	private String resourceType;

	private String regionNo;

	@SerializedName("filter")
	private List<Filter> filter;

	private List<String> accountIdss;
	public GetNisNetworkRankingRequest() {
		super("nis", "2021-12-16", "GetNisNetworkRanking", "networkana");
		setMethod(MethodType.POST);
	}

	public Boolean getUseCrossAccount() {
		return this.useCrossAccount;
	}

	public void setUseCrossAccount(Boolean useCrossAccount) {
		this.useCrossAccount = useCrossAccount;
		if(useCrossAccount != null){
			putQueryParameter("UseCrossAccount", useCrossAccount.toString());
		}
	}

	public Integer getTopN() {
		return this.topN;
	}

	public void setTopN(Integer topN) {
		this.topN = topN;
		if(topN != null){
			putQueryParameter("TopN", topN.toString());
		}
	}

	public String getDirection() {
		return this.direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
		if(direction != null){
			putQueryParameter("Direction", direction);
		}
	}

	public String getOrderBy() {
		return this.orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
		if(orderBy != null){
			putQueryParameter("OrderBy", orderBy);
		}
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime.toString());
		}
	}

	public Long getBeginTime() {
		return this.beginTime;
	}

	public void setBeginTime(Long beginTime) {
		this.beginTime = beginTime;
		if(beginTime != null){
			putQueryParameter("BeginTime", beginTime.toString());
		}
	}

	public String getGroupBy() {
		return this.groupBy;
	}

	public void setGroupBy(String groupBy) {
		this.groupBy = groupBy;
		if(groupBy != null){
			putQueryParameter("GroupBy", groupBy);
		}
	}

	public String getSort() {
		return this.sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
		if(sort != null){
			putQueryParameter("Sort", sort);
		}
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("ResourceType", resourceType);
		}
	}

	public String getRegionNo() {
		return this.regionNo;
	}

	public void setRegionNo(String regionNo) {
		this.regionNo = regionNo;
		if(regionNo != null){
			putQueryParameter("RegionNo", regionNo);
		}
	}

	public List<Filter> getFilter() {
		return this.filter;
	}

	public void setFilter(List<Filter> filter) {
		this.filter = filter;	
		if (filter != null) {
			putQueryParameter("Filter" , new Gson().toJson(filter));
		}	
	}

	public List<String> getAccountIdss() {
		return this.accountIdss;
	}

	public void setAccountIdss(List<String> accountIdss) {
		this.accountIdss = accountIdss;	
		if (accountIdss != null) {
			for (int i = 0; i < accountIdss.size(); i++) {
				putQueryParameter("AccountIds." + (i + 1) , accountIdss.get(i));
			}
		}	
	}

	public static class Filter {

		@SerializedName("Name")
		private String name;

		@SerializedName("Value")
		private String value;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	@Override
	public Class<GetNisNetworkRankingResponse> getResponseClass() {
		return GetNisNetworkRankingResponse.class;
	}

}
