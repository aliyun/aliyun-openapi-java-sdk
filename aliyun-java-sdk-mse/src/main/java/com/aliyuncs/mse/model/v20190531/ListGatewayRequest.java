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

package com.aliyuncs.mse.model.v20190531;

import com.aliyuncs.RpcAcsRequest;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mse.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListGatewayRequest extends RpcAcsRequest<ListGatewayResponse> {
	   

	private Integer pageNumber;

	private String orderItem;

	private Integer pageSize;

	private Boolean descSort;

	@SerializedName("filterParams")
	private FilterParams filterParams;

	private String acceptLanguage;
	public ListGatewayRequest() {
		super("mse", "2019-05-31", "ListGateway");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getOrderItem() {
		return this.orderItem;
	}

	public void setOrderItem(String orderItem) {
		this.orderItem = orderItem;
		if(orderItem != null){
			putQueryParameter("OrderItem", orderItem);
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

	public Boolean getDescSort() {
		return this.descSort;
	}

	public void setDescSort(Boolean descSort) {
		this.descSort = descSort;
		if(descSort != null){
			putQueryParameter("DescSort", descSort.toString());
		}
	}

	public FilterParams getFilterParams() {
		return this.filterParams;
	}

	public void setFilterParams(FilterParams filterParams) {
		this.filterParams = filterParams;	
		if (filterParams != null) {
			putQueryParameter("FilterParams" , new Gson().toJson(filterParams));
		}	
	}

	public String getAcceptLanguage() {
		return this.acceptLanguage;
	}

	public void setAcceptLanguage(String acceptLanguage) {
		this.acceptLanguage = acceptLanguage;
		if(acceptLanguage != null){
			putQueryParameter("AcceptLanguage", acceptLanguage);
		}
	}

	public static class FilterParams {

		@SerializedName("GatewayType")
		private String gatewayType;

		@SerializedName("InstanceId")
		private String instanceId;

		@SerializedName("GatewayUniqueId")
		private String gatewayUniqueId;

		@SerializedName("Name")
		private String name;

		@SerializedName("Vpc")
		private String vpc;

		public String getGatewayType() {
			return this.gatewayType;
		}

		public void setGatewayType(String gatewayType) {
			this.gatewayType = gatewayType;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getGatewayUniqueId() {
			return this.gatewayUniqueId;
		}

		public void setGatewayUniqueId(String gatewayUniqueId) {
			this.gatewayUniqueId = gatewayUniqueId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getVpc() {
			return this.vpc;
		}

		public void setVpc(String vpc) {
			this.vpc = vpc;
		}
	}

	@Override
	public Class<ListGatewayResponse> getResponseClass() {
		return ListGatewayResponse.class;
	}

}
