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

package com.aliyuncs.polardb.model.v20170801;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.polardb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBProxyPerformanceRequest extends RpcAcsRequest<DescribeDBProxyPerformanceResponse> {
	   

	private String dBEndpointId;

	private String startTime;

	private String type;

	private String key;

	private String dBClusterId;

	private String endTime;

	private String interval;
	public DescribeDBProxyPerformanceRequest() {
		super("polardb", "2017-08-01", "DescribeDBProxyPerformance", "polardb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDBEndpointId() {
		return this.dBEndpointId;
	}

	public void setDBEndpointId(String dBEndpointId) {
		this.dBEndpointId = dBEndpointId;
		if(dBEndpointId != null){
			putQueryParameter("DBEndpointId", dBEndpointId);
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

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
		if(key != null){
			putQueryParameter("Key", key);
		}
	}

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
		if(dBClusterId != null){
			putQueryParameter("DBClusterId", dBClusterId);
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

	public String getInterval() {
		return this.interval;
	}

	public void setInterval(String interval) {
		this.interval = interval;
		if(interval != null){
			putQueryParameter("Interval", interval);
		}
	}

	@Override
	public Class<DescribeDBProxyPerformanceResponse> getResponseClass() {
		return DescribeDBProxyPerformanceResponse.class;
	}

}
