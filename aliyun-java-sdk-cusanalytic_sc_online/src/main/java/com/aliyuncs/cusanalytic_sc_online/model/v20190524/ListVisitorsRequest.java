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
public class ListVisitorsRequest extends RpcAcsRequest<ListVisitorsResponse> {
	
	public ListVisitorsRequest() {
		super("cusanalytic_sc_online", "2019-05-24", "ListVisitors");
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String pkId;

	private String gender;

	private Long ukId;

	private Integer pageSize;

	private String locationIds;

	private String endTime;

	private Long enterCount;

	private Integer pageIndex;

	private String startTime;

	private Long ageStart;

	private Long ageEnd;

	private String storeIds;

	public String getPkId() {
		return this.pkId;
	}

	public void setPkId(String pkId) {
		this.pkId = pkId;
		if(pkId != null){
			putBodyParameter("PkId", pkId);
		}
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
		if(gender != null){
			putBodyParameter("Gender", gender);
		}
	}

	public Long getUkId() {
		return this.ukId;
	}

	public void setUkId(Long ukId) {
		this.ukId = ukId;
		if(ukId != null){
			putBodyParameter("UkId", ukId.toString());
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

	public String getLocationIds() {
		return this.locationIds;
	}

	public void setLocationIds(String locationIds) {
		this.locationIds = locationIds;
		if(locationIds != null){
			putBodyParameter("LocationIds", locationIds);
		}
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putBodyParameter("EndTime", endTime);
		}
	}

	public Long getEnterCount() {
		return this.enterCount;
	}

	public void setEnterCount(Long enterCount) {
		this.enterCount = enterCount;
		if(enterCount != null){
			putBodyParameter("EnterCount", enterCount.toString());
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

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putBodyParameter("StartTime", startTime);
		}
	}

	public Long getAgeStart() {
		return this.ageStart;
	}

	public void setAgeStart(Long ageStart) {
		this.ageStart = ageStart;
		if(ageStart != null){
			putBodyParameter("AgeStart", ageStart.toString());
		}
	}

	public Long getAgeEnd() {
		return this.ageEnd;
	}

	public void setAgeEnd(Long ageEnd) {
		this.ageEnd = ageEnd;
		if(ageEnd != null){
			putBodyParameter("AgeEnd", ageEnd.toString());
		}
	}

	public String getStoreIds() {
		return this.storeIds;
	}

	public void setStoreIds(String storeIds) {
		this.storeIds = storeIds;
		if(storeIds != null){
			putBodyParameter("StoreIds", storeIds);
		}
	}

	@Override
	public Class<ListVisitorsResponse> getResponseClass() {
		return ListVisitorsResponse.class;
	}

}
