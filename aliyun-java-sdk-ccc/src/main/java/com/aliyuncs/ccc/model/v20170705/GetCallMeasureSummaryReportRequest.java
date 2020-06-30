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

package com.aliyuncs.ccc.model.v20170705;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ccc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetCallMeasureSummaryReportRequest extends RpcAcsRequest<GetCallMeasureSummaryReportResponse> {
	   

	private String intervalType;

	private Integer year;

	private Integer pageNumber;

	private Integer month;

	private Integer pageSize;

	private Integer day;
	public GetCallMeasureSummaryReportRequest() {
		super("CCC", "2017-07-05", "GetCallMeasureSummaryReport", "CCC");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getIntervalType() {
		return this.intervalType;
	}

	public void setIntervalType(String intervalType) {
		this.intervalType = intervalType;
		if(intervalType != null){
			putQueryParameter("IntervalType", intervalType);
		}
	}

	public Integer getYear() {
		return this.year;
	}

	public void setYear(Integer year) {
		this.year = year;
		if(year != null){
			putQueryParameter("Year", year.toString());
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

	public Integer getMonth() {
		return this.month;
	}

	public void setMonth(Integer month) {
		this.month = month;
		if(month != null){
			putQueryParameter("Month", month.toString());
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

	public Integer getDay() {
		return this.day;
	}

	public void setDay(Integer day) {
		this.day = day;
		if(day != null){
			putQueryParameter("Day", day.toString());
		}
	}

	@Override
	public Class<GetCallMeasureSummaryReportResponse> getResponseClass() {
		return GetCallMeasureSummaryReportResponse.class;
	}

}
