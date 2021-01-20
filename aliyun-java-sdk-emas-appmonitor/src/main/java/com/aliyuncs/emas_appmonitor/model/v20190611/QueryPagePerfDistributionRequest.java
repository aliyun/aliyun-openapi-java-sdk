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

package com.aliyuncs.emas_appmonitor.model.v20190611;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.emas_appmonitor.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryPagePerfDistributionRequest extends RpcAcsRequest<QueryPagePerfDistributionResponse> {
	   

	private String metricType;

	private String appVersionStrategy;

	private Long startTime;

	private String deviceLevel;

	private List<String> provinces;

	private Integer intervalMinutes;

	private String uniqueAppId;

	private Long endTime;

	private List<String> appVersions;

	private List<String> pages;
	public QueryPagePerfDistributionRequest() {
		super("emas-appmonitor", "2019-06-11", "QueryPagePerfDistribution");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMetricType() {
		return this.metricType;
	}

	public void setMetricType(String metricType) {
		this.metricType = metricType;
		if(metricType != null){
			putBodyParameter("MetricType", metricType);
		}
	}

	public String getAppVersionStrategy() {
		return this.appVersionStrategy;
	}

	public void setAppVersionStrategy(String appVersionStrategy) {
		this.appVersionStrategy = appVersionStrategy;
		if(appVersionStrategy != null){
			putBodyParameter("AppVersionStrategy", appVersionStrategy);
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

	public String getDeviceLevel() {
		return this.deviceLevel;
	}

	public void setDeviceLevel(String deviceLevel) {
		this.deviceLevel = deviceLevel;
		if(deviceLevel != null){
			putBodyParameter("DeviceLevel", deviceLevel);
		}
	}

	public List<String> getProvinces() {
		return this.provinces;
	}

	public void setProvinces(List<String> provinces) {
		this.provinces = provinces;	
		if (provinces != null) {
			for (int i = 0; i < provinces.size(); i++) {
				putBodyParameter("Province." + (i + 1) , provinces.get(i));
			}
		}	
	}

	public Integer getIntervalMinutes() {
		return this.intervalMinutes;
	}

	public void setIntervalMinutes(Integer intervalMinutes) {
		this.intervalMinutes = intervalMinutes;
		if(intervalMinutes != null){
			putBodyParameter("IntervalMinutes", intervalMinutes.toString());
		}
	}

	public String getUniqueAppId() {
		return this.uniqueAppId;
	}

	public void setUniqueAppId(String uniqueAppId) {
		this.uniqueAppId = uniqueAppId;
		if(uniqueAppId != null){
			putBodyParameter("UniqueAppId", uniqueAppId);
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

	public List<String> getAppVersions() {
		return this.appVersions;
	}

	public void setAppVersions(List<String> appVersions) {
		this.appVersions = appVersions;	
		if (appVersions != null) {
			for (int i = 0; i < appVersions.size(); i++) {
				putBodyParameter("AppVersion." + (i + 1) , appVersions.get(i));
			}
		}	
	}

	public List<String> getPages() {
		return this.pages;
	}

	public void setPages(List<String> pages) {
		this.pages = pages;	
		if (pages != null) {
			for (int i = 0; i < pages.size(); i++) {
				putBodyParameter("Page." + (i + 1) , pages.get(i));
			}
		}	
	}

	@Override
	public Class<QueryPagePerfDistributionResponse> getResponseClass() {
		return QueryPagePerfDistributionResponse.class;
	}

}
