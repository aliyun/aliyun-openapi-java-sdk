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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecsops.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryAggregateReleaseInfoRequest extends RpcAcsRequest<OpsQueryAggregateReleaseInfoResponse> {
	   

	private String startTime;

	private String releaseComponent;

	private String aggregateTimeInterval;

	private String endTime;

	private String machineIds;

	private String token;

	private String releaseSource;

	private String auditParamStr;
	public OpsQueryAggregateReleaseInfoRequest() {
		super("Ecsops", "2016-04-01", "OpsQueryAggregateReleaseInfo", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getReleaseComponent() {
		return this.releaseComponent;
	}

	public void setReleaseComponent(String releaseComponent) {
		this.releaseComponent = releaseComponent;
		if(releaseComponent != null){
			putQueryParameter("ReleaseComponent", releaseComponent);
		}
	}

	public String getAggregateTimeInterval() {
		return this.aggregateTimeInterval;
	}

	public void setAggregateTimeInterval(String aggregateTimeInterval) {
		this.aggregateTimeInterval = aggregateTimeInterval;
		if(aggregateTimeInterval != null){
			putQueryParameter("AggregateTimeInterval", aggregateTimeInterval);
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

	public String getMachineIds() {
		return this.machineIds;
	}

	public void setMachineIds(String machineIds) {
		this.machineIds = machineIds;
		if(machineIds != null){
			putQueryParameter("MachineIds", machineIds);
		}
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putQueryParameter("Token", token);
		}
	}

	public String getReleaseSource() {
		return this.releaseSource;
	}

	public void setReleaseSource(String releaseSource) {
		this.releaseSource = releaseSource;
		if(releaseSource != null){
			putQueryParameter("ReleaseSource", releaseSource);
		}
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	@Override
	public Class<OpsQueryAggregateReleaseInfoResponse> getResponseClass() {
		return OpsQueryAggregateReleaseInfoResponse.class;
	}

}
