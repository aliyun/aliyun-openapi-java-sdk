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

package com.aliyuncs.cd.model.v2021127;

import com.aliyuncs.RoaAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QueryTicketListRequest extends RoaAcsRequest<QueryTicketListResponse> {
	   

	private String country;

	@SerializedName("shopIdList")
	private List<String> shopIdList;

	private Long endTime;

	private Long startTime;

	private Integer pageNumber;

	@SerializedName("ticketIdList")
	private List<String> ticketIdList;

	private Integer pageSize;

	@SerializedName("ticketTypeList")
	private List<String> ticketTypeList;

	private Integer status;
	public QueryTicketListRequest() {
		super("cd", "2021-12-7", "QueryTicketList");
		setUriPattern("/QueryTicketList");
		setMethod(MethodType.POST);
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
		if(country != null){
			putBodyParameter("Country", country);
		}
	}

	public List<String> getShopIdList() {
		return this.shopIdList;
	}

	public void setShopIdList(List<String> shopIdList) {
		this.shopIdList = shopIdList;	
		if (shopIdList != null) {
			putBodyParameter("ShopIdList" , new Gson().toJson(shopIdList));
		}	
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putBodyParameter("EndTime", endTime.toString());
		}
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putBodyParameter("StartTime", startTime.toString());
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putBodyParameter("PageNumber", pageNumber.toString());
		}
	}

	public List<String> getTicketIdList() {
		return this.ticketIdList;
	}

	public void setTicketIdList(List<String> ticketIdList) {
		this.ticketIdList = ticketIdList;	
		if (ticketIdList != null) {
			putBodyParameter("TicketIdList" , new Gson().toJson(ticketIdList));
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

	public List<String> getTicketTypeList() {
		return this.ticketTypeList;
	}

	public void setTicketTypeList(List<String> ticketTypeList) {
		this.ticketTypeList = ticketTypeList;	
		if (ticketTypeList != null) {
			putBodyParameter("TicketTypeList" , new Gson().toJson(ticketTypeList));
		}	
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status.toString());
		}
	}

	@Override
	public Class<QueryTicketListResponse> getResponseClass() {
		return QueryTicketListResponse.class;
	}

}
