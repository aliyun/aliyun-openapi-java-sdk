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

package com.aliyuncs.vod.model.v20170321;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vod.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeVodPlayerMetricDataRequest extends RpcAcsRequest<DescribeVodPlayerMetricDataResponse> {
	   

	private String language;

	private String startTime;

	private Long pageNumber;

	private Long top;

	private Long pageSize;

	private String os;

	private String endTime;

	private String filters;

	private String appId;

	private String interval;

	private String metrics;

	private String terminalType;
	public DescribeVodPlayerMetricDataRequest() {
		super("vod", "2017-03-21", "DescribeVodPlayerMetricData", "vod");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
		if(language != null){
			putQueryParameter("Language", language);
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

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public Long getTop() {
		return this.top;
	}

	public void setTop(Long top) {
		this.top = top;
		if(top != null){
			putQueryParameter("Top", top.toString());
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getOs() {
		return this.os;
	}

	public void setOs(String os) {
		this.os = os;
		if(os != null){
			putQueryParameter("Os", os);
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

	public String getFilters() {
		return this.filters;
	}

	public void setFilters(String filters) {
		this.filters = filters;
		if(filters != null){
			putQueryParameter("Filters", filters);
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	public String getInterval() {
		return this.interval;
	}

	public void setInterval(String interval) {
		this.interval = interval;
		if(interval != null){
			putQueryParameter("Interval", interval);
		}
	}

	public String getMetrics() {
		return this.metrics;
	}

	public void setMetrics(String metrics) {
		this.metrics = metrics;
		if(metrics != null){
			putQueryParameter("Metrics", metrics);
		}
	}

	public String getTerminalType() {
		return this.terminalType;
	}

	public void setTerminalType(String terminalType) {
		this.terminalType = terminalType;
		if(terminalType != null){
			putQueryParameter("TerminalType", terminalType);
		}
	}

	@Override
	public Class<DescribeVodPlayerMetricDataResponse> getResponseClass() {
		return DescribeVodPlayerMetricDataResponse.class;
	}

}
