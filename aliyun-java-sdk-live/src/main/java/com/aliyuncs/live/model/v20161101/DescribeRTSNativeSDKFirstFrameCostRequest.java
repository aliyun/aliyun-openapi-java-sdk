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

package com.aliyuncs.live.model.v20161101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.live.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeRTSNativeSDKFirstFrameCostRequest extends RpcAcsRequest<DescribeRTSNativeSDKFirstFrameCostResponse> {
	   

	private String endTime;

	@SerializedName("domainNameList")
	private List<String> domainNameList;

	private String startTime;

	private String dataInterval;
	public DescribeRTSNativeSDKFirstFrameCostRequest() {
		super("live", "2016-11-01", "DescribeRTSNativeSDKFirstFrameCost", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public List<String> getDomainNameList() {
		return this.domainNameList;
	}

	public void setDomainNameList(List<String> domainNameList) {
		this.domainNameList = domainNameList;	
		if (domainNameList != null) {
			putQueryParameter("DomainNameList" , new Gson().toJson(domainNameList));
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

	public String getDataInterval() {
		return this.dataInterval;
	}

	public void setDataInterval(String dataInterval) {
		this.dataInterval = dataInterval;
		if(dataInterval != null){
			putQueryParameter("DataInterval", dataInterval);
		}
	}

	@Override
	public Class<DescribeRTSNativeSDKFirstFrameCostResponse> getResponseClass() {
		return DescribeRTSNativeSDKFirstFrameCostResponse.class;
	}

}
