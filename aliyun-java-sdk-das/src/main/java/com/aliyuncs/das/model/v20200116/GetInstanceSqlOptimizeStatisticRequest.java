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

package com.aliyuncs.das.model.v20200116;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.das.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetInstanceSqlOptimizeStatisticRequest extends RpcAcsRequest<GetInstanceSqlOptimizeStatisticResponse> {
	   

	private String endTime;

	private String threshold;

	private String startTime;

	private String useMerging;

	private String instanceId;

	private String nodeId;

	private String filterEnable;
	public GetInstanceSqlOptimizeStatisticRequest() {
		super("DAS", "2020-01-16", "GetInstanceSqlOptimizeStatistic");
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

	public String getThreshold() {
		return this.threshold;
	}

	public void setThreshold(String threshold) {
		this.threshold = threshold;
		if(threshold != null){
			putQueryParameter("Threshold", threshold);
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

	public String getUseMerging() {
		return this.useMerging;
	}

	public void setUseMerging(String useMerging) {
		this.useMerging = useMerging;
		if(useMerging != null){
			putQueryParameter("UseMerging", useMerging);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getNodeId() {
		return this.nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
		if(nodeId != null){
			putQueryParameter("NodeId", nodeId);
		}
	}

	public String getFilterEnable() {
		return this.filterEnable;
	}

	public void setFilterEnable(String filterEnable) {
		this.filterEnable = filterEnable;
		if(filterEnable != null){
			putQueryParameter("FilterEnable", filterEnable);
		}
	}

	@Override
	public Class<GetInstanceSqlOptimizeStatisticResponse> getResponseClass() {
		return GetInstanceSqlOptimizeStatisticResponse.class;
	}

}
