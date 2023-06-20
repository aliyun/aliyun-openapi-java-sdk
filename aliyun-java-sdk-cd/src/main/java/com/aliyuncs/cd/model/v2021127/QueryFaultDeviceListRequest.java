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
public class QueryFaultDeviceListRequest extends RoaAcsRequest<QueryFaultDeviceListResponse> {
	   

	@SerializedName("shopIdList")
	private List<String> shopIdList;

	private String startDate;

	private String endDate;

	private String faultType;

	private Integer dailyOnlineTime;

	private Integer pageNumber;

	private Integer pageSize;
	public QueryFaultDeviceListRequest() {
		super("cd", "2021-12-7", "QueryFaultDeviceList");
		setUriPattern("/QueryFaultDeviceList");
		setMethod(MethodType.POST);
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

	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
		if(startDate != null){
			putBodyParameter("StartDate", startDate);
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

	public String getFaultType() {
		return this.faultType;
	}

	public void setFaultType(String faultType) {
		this.faultType = faultType;
		if(faultType != null){
			putBodyParameter("FaultType", faultType);
		}
	}

	public Integer getDailyOnlineTime() {
		return this.dailyOnlineTime;
	}

	public void setDailyOnlineTime(Integer dailyOnlineTime) {
		this.dailyOnlineTime = dailyOnlineTime;
		if(dailyOnlineTime != null){
			putBodyParameter("DailyOnlineTime", dailyOnlineTime.toString());
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	@Override
	public Class<QueryFaultDeviceListResponse> getResponseClass() {
		return QueryFaultDeviceListResponse.class;
	}

}
