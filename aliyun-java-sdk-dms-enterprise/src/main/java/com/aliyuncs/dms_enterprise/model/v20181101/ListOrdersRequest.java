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

package com.aliyuncs.dms_enterprise.model.v20181101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dms_enterprise.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListOrdersRequest extends RpcAcsRequest<ListOrdersResponse> {
	   

	private String orderStatus;

	private String searchContent;

	private String searchDateType;

	private String endTime;

	private String startTime;

	private Long tid;

	private Integer pageNumber;

	private String pluginType;

	private Integer pageSize;

	private String orderResultType;
	public ListOrdersRequest() {
		super("dms-enterprise", "2018-11-01", "ListOrders");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
		if(orderStatus != null){
			putQueryParameter("OrderStatus", orderStatus);
		}
	}

	public String getSearchContent() {
		return this.searchContent;
	}

	public void setSearchContent(String searchContent) {
		this.searchContent = searchContent;
		if(searchContent != null){
			putQueryParameter("SearchContent", searchContent);
		}
	}

	public String getSearchDateType() {
		return this.searchDateType;
	}

	public void setSearchDateType(String searchDateType) {
		this.searchDateType = searchDateType;
		if(searchDateType != null){
			putQueryParameter("SearchDateType", searchDateType);
		}
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime);
		}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
		}
	}

	public Long getTid() {
		return this.tid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
		if(tid != null){
			putQueryParameter("Tid", tid.toString());
		}
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

	public String getPluginType() {
		return this.pluginType;
	}

	public void setPluginType(String pluginType) {
		this.pluginType = pluginType;
		if(pluginType != null){
			putQueryParameter("PluginType", pluginType);
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

	public String getOrderResultType() {
		return this.orderResultType;
	}

	public void setOrderResultType(String orderResultType) {
		this.orderResultType = orderResultType;
		if(orderResultType != null){
			putQueryParameter("OrderResultType", orderResultType);
		}
	}

	@Override
	public Class<ListOrdersResponse> getResponseClass() {
		return ListOrdersResponse.class;
	}

}
