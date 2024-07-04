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

package com.aliyuncs.nis.model.v20211216;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetNisNetworkMetricsRequest extends RpcAcsRequest<GetNisNetworkMetricsResponse> {
	   

	private Boolean useCrossAccount;

	private String scanBy;

	private String metricName;

	private Long endTime;

	private Long beginTime;

	private String resourceType;

	private String regionNo;

	private List<String> accountIdss;

	@SerializedName("dimensions")
	private List<Dimensions> dimensions;
	public GetNisNetworkMetricsRequest() {
		super("nis", "2021-12-16", "GetNisNetworkMetrics", "networkana");
		setMethod(MethodType.POST);
	}

	public Boolean getUseCrossAccount() {
		return this.useCrossAccount;
	}

	public void setUseCrossAccount(Boolean useCrossAccount) {
		this.useCrossAccount = useCrossAccount;
		if(useCrossAccount != null){
			putQueryParameter("UseCrossAccount", useCrossAccount.toString());
		}
	}

	public String getScanBy() {
		return this.scanBy;
	}

	public void setScanBy(String scanBy) {
		this.scanBy = scanBy;
		if(scanBy != null){
			putQueryParameter("ScanBy", scanBy);
		}
	}

	public String getMetricName() {
		return this.metricName;
	}

	public void setMetricName(String metricName) {
		this.metricName = metricName;
		if(metricName != null){
			putQueryParameter("MetricName", metricName);
		}
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime.toString());
		}
	}

	public Long getBeginTime() {
		return this.beginTime;
	}

	public void setBeginTime(Long beginTime) {
		this.beginTime = beginTime;
		if(beginTime != null){
			putQueryParameter("BeginTime", beginTime.toString());
		}
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("ResourceType", resourceType);
		}
	}

	public String getRegionNo() {
		return this.regionNo;
	}

	public void setRegionNo(String regionNo) {
		this.regionNo = regionNo;
		if(regionNo != null){
			putQueryParameter("RegionNo", regionNo);
		}
	}

	public List<String> getAccountIdss() {
		return this.accountIdss;
	}

	public void setAccountIdss(List<String> accountIdss) {
		this.accountIdss = accountIdss;	
		if (accountIdss != null) {
			for (int i = 0; i < accountIdss.size(); i++) {
				putQueryParameter("AccountIds." + (i + 1) , accountIdss.get(i));
			}
		}	
	}

	public List<Dimensions> getDimensions() {
		return this.dimensions;
	}

	public void setDimensions(List<Dimensions> dimensions) {
		this.dimensions = dimensions;	
		if (dimensions != null) {
			putQueryParameter("Dimensions" , new Gson().toJson(dimensions));
		}	
	}

	public static class Dimensions {

		@SerializedName("Name")
		private String name;

		@SerializedName("Value")
		private String value;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	@Override
	public Class<GetNisNetworkMetricsResponse> getResponseClass() {
		return GetNisNetworkMetricsResponse.class;
	}

}
