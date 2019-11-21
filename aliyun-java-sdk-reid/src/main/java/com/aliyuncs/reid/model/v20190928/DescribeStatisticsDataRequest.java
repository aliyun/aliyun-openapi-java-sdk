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
public class DescribeStatisticsDataRequest extends RpcAcsRequest<DescribeStatisticsDataResponse> {
	   

	private Long storeId;

	private String min;

	private Integer hour;

	private String summaryType;

	private String day;
	public DescribeStatisticsDataRequest() {
		super("reid", "2019-09-28", "DescribeStatisticsData", "1.0.0");
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

	public String getMin() {
		return this.min;
	}

	public void setMin(String min) {
		this.min = min;
		if(min != null){
			putBodyParameter("Min", min);
		}
	}

	public Integer getHour() {
		return this.hour;
	}

	public void setHour(Integer hour) {
		this.hour = hour;
		if(hour != null){
			putBodyParameter("Hour", hour.toString());
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
	public Class<DescribeStatisticsDataResponse> getResponseClass() {
		return DescribeStatisticsDataResponse.class;
	}

}
