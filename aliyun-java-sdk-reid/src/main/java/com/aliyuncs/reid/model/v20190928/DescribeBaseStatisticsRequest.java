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
public class DescribeBaseStatisticsRequest extends RpcAcsRequest<DescribeBaseStatisticsResponse> {
	   

	private String date;

	private String extraStatisticTypes;

	private Long storeId;

	private String summaryType;

	private Long locationId;
	public DescribeBaseStatisticsRequest() {
		super("reid", "2019-09-28", "DescribeBaseStatistics", "1.1.2");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
		if(date != null){
			putBodyParameter("Date", date);
		}
	}

	public String getExtraStatisticTypes() {
		return this.extraStatisticTypes;
	}

	public void setExtraStatisticTypes(String extraStatisticTypes) {
		this.extraStatisticTypes = extraStatisticTypes;
		if(extraStatisticTypes != null){
			putBodyParameter("ExtraStatisticTypes", extraStatisticTypes);
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

	@Override
	public Class<DescribeBaseStatisticsResponse> getResponseClass() {
		return DescribeBaseStatisticsResponse.class;
	}

}
