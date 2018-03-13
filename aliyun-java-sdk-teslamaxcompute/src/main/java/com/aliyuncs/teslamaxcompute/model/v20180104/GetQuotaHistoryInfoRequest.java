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
package com.aliyuncs.teslamaxcompute.model.v20180104;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class GetQuotaHistoryInfoRequest extends RpcAcsRequest<GetQuotaHistoryInfoResponse> {
	
	public GetQuotaHistoryInfoRequest() {
		super("TeslaMaxCompute", "2018-01-04", "GetQuotaHistoryInfo");
	}

	private String cluster;

	private Integer endTime;

	private Integer startTime;

	private String region;

	private String quotaName;

	public String getCluster() {
		return this.cluster;
	}

	public void setCluster(String cluster) {
		this.cluster = cluster;
		if(cluster != null){
			putQueryParameter("Cluster", cluster);
		}
	}

	public Integer getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Integer endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime.toString());
		}
	}

	public Integer getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Integer startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime.toString());
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("Region", region);
		}
	}

	public String getQuotaName() {
		return this.quotaName;
	}

	public void setQuotaName(String quotaName) {
		this.quotaName = quotaName;
		if(quotaName != null){
			putQueryParameter("QuotaName", quotaName);
		}
	}

	@Override
	public Class<GetQuotaHistoryInfoResponse> getResponseClass() {
		return GetQuotaHistoryInfoResponse.class;
	}

}
