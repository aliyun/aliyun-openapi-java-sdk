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

package com.aliyuncs.reid.model.v20190928;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.reid.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeCustomerFlowByLocationRequest extends RpcAcsRequest<DescribeCustomerFlowByLocationResponse> {
	   

	private String startDate;

	private Long storeId;

	private Long minCount;

	private Long parentAmount;

	private Long maxCount;

	private String endDate;

	private Long locationId;

	private String parentLocationIds;
	public DescribeCustomerFlowByLocationRequest() {
		super("reid", "2019-09-28", "DescribeCustomerFlowByLocation", "1.1.2");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Long getStoreId() {
		return this.storeId;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
		if(storeId != null){
			putBodyParameter("StoreId", storeId.toString());
		}
	}

	public Long getMinCount() {
		return this.minCount;
	}

	public void setMinCount(Long minCount) {
		this.minCount = minCount;
		if(minCount != null){
			putBodyParameter("MinCount", minCount.toString());
		}
	}

	public Long getParentAmount() {
		return this.parentAmount;
	}

	public void setParentAmount(Long parentAmount) {
		this.parentAmount = parentAmount;
		if(parentAmount != null){
			putBodyParameter("ParentAmount", parentAmount.toString());
		}
	}

	public Long getMaxCount() {
		return this.maxCount;
	}

	public void setMaxCount(Long maxCount) {
		this.maxCount = maxCount;
		if(maxCount != null){
			putBodyParameter("MaxCount", maxCount.toString());
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

	public Long getLocationId() {
		return this.locationId;
	}

	public void setLocationId(Long locationId) {
		this.locationId = locationId;
		if(locationId != null){
			putBodyParameter("LocationId", locationId.toString());
		}
	}

	public String getParentLocationIds() {
		return this.parentLocationIds;
	}

	public void setParentLocationIds(String parentLocationIds) {
		this.parentLocationIds = parentLocationIds;
		if(parentLocationIds != null){
			putBodyParameter("ParentLocationIds", parentLocationIds);
		}
	}

	@Override
	public Class<DescribeCustomerFlowByLocationResponse> getResponseClass() {
		return DescribeCustomerFlowByLocationResponse.class;
	}

}
