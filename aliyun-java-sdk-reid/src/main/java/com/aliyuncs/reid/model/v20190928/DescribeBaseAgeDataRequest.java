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
public class DescribeBaseAgeDataRequest extends RpcAcsRequest<DescribeBaseAgeDataResponse> {
	   

	private Long storeId;

	private String hour;

	private String summaryType;

	private Long locationId;

	private String day;
	public DescribeBaseAgeDataRequest() {
		super("reid", "2019-09-28", "DescribeBaseAgeData", "1.0.0");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getHour() {
		return this.hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
		if(hour != null){
			putBodyParameter("Hour", hour);
		}
	}

	public String getSummaryType() {
		return this.summaryType;
	}

	public void setSummaryType(String summaryType) {
		this.summaryType = summaryType;
		if(summaryType != null){
			putBodyParameter("SummaryType", summaryType);
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

	public String getDay() {
		return this.day;
	}

	public void setDay(String day) {
		this.day = day;
		if(day != null){
			putBodyParameter("Day", day);
		}
	}

	@Override
	public Class<DescribeBaseAgeDataResponse> getResponseClass() {
		return DescribeBaseAgeDataResponse.class;
	}

}
