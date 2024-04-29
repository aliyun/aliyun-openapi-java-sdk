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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListSyntheticDetailRequest extends RpcAcsRequest<ListSyntheticDetailResponse> {
	   

	private Long endTime;

	private String orderBy;

	private Long startTime;

	@SerializedName("filters")
	private Map<String,String> filters;

	@SerializedName("exactFilters")
	private List<ExactFilters> exactFilters;

	private Integer syntheticType;

	@SerializedName("advancedFilters")
	private List<AdvancedFilters> advancedFilters;

	private Integer pageSize;

	private String detail;

	private Integer page;

	private String category;

	private String order;
	public ListSyntheticDetailRequest() {
		super("ARMS", "2019-08-08", "ListSyntheticDetail", "arms");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getOrderBy() {
		return this.orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
		if(orderBy != null){
			putQueryParameter("OrderBy", orderBy);
		}
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime.toString());
		}
	}

	public Map<String,String> getFilters() {
		return this.filters;
	}

	public void setFilters(Map<String,String> filters) {
		this.filters = filters;	
		if (filters != null) {
			putQueryParameter("Filters" , new Gson().toJson(filters));
		}	
	}

	public List<ExactFilters> getExactFilters() {
		return this.exactFilters;
	}

	public void setExactFilters(List<ExactFilters> exactFilters) {
		this.exactFilters = exactFilters;	
		if (exactFilters != null) {
			putQueryParameter("ExactFilters" , new Gson().toJson(exactFilters));
		}	
	}

	public Integer getSyntheticType() {
		return this.syntheticType;
	}

	public void setSyntheticType(Integer syntheticType) {
		this.syntheticType = syntheticType;
		if(syntheticType != null){
			putQueryParameter("SyntheticType", syntheticType.toString());
		}
	}

	public List<AdvancedFilters> getAdvancedFilters() {
		return this.advancedFilters;
	}

	public void setAdvancedFilters(List<AdvancedFilters> advancedFilters) {
		this.advancedFilters = advancedFilters;	
		if (advancedFilters != null) {
			putQueryParameter("AdvancedFilters" , new Gson().toJson(advancedFilters));
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

	public String getDetail() {
		return this.detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
		if(detail != null){
			putQueryParameter("Detail", detail);
		}
	}

	public Integer getPage() {
		return this.page;
	}

	public void setPage(Integer page) {
		this.page = page;
		if(page != null){
			putQueryParameter("Page", page.toString());
		}
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
		if(category != null){
			putQueryParameter("Category", category);
		}
	}

	public String getOrder() {
		return this.order;
	}

	public void setOrder(String order) {
		this.order = order;
		if(order != null){
			putQueryParameter("Order", order);
		}
	}

	public static class ExactFilters {

		@SerializedName("OpType")
		private String opType;

		@SerializedName("Value")
		private Object value;

		@SerializedName("Key")
		private String key;

		public String getOpType() {
			return this.opType;
		}

		public void setOpType(String opType) {
			this.opType = opType;
		}

		public Object getValue() {
			return this.value;
		}

		public void setValue(Object value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	public static class AdvancedFilters {

		@SerializedName("OpType")
		private String opType;

		@SerializedName("Value")
		private Object value;

		@SerializedName("Key")
		private String key;

		public String getOpType() {
			return this.opType;
		}

		public void setOpType(String opType) {
			this.opType = opType;
		}

		public Object getValue() {
			return this.value;
		}

		public void setValue(Object value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<ListSyntheticDetailResponse> getResponseClass() {
		return ListSyntheticDetailResponse.class;
	}

}
