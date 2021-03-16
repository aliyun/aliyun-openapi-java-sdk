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
public class OpsSituationalAwareRequest extends RpcAcsRequest<OpsSituationalAwareResponse> {
	   

	private String endTime;

	private String machineIds;

	private String startTime;

	private String filterConditions;

	private String token;

	private String condition;

	private String aliuid;

	private String config;

	private String auditParamStr;
	public OpsSituationalAwareRequest() {
		super("Ecsops", "2016-04-01", "OpsSituationalAware", "ecs");
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

	public String getMachineIds() {
		return this.machineIds;
	}

	public void setMachineIds(String machineIds) {
		this.machineIds = machineIds;
		if(machineIds != null){
			putQueryParameter("MachineIds", machineIds);
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

	public String getFilterConditions() {
		return this.filterConditions;
	}

	public void setFilterConditions(String filterConditions) {
		this.filterConditions = filterConditions;
		if(filterConditions != null){
			putQueryParameter("FilterConditions", filterConditions);
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

	public String getCondition() {
		return this.condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
		if(condition != null){
			putQueryParameter("Condition", condition);
		}
	}

	public String getAliuid() {
		return this.aliuid;
	}

	public void setAliuid(String aliuid) {
		this.aliuid = aliuid;
		if(aliuid != null){
			putQueryParameter("Aliuid", aliuid);
		}
	}

	public String getConfig() {
		return this.config;
	}

	public void setConfig(String config) {
		this.config = config;
		if(config != null){
			putQueryParameter("Config", config);
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
	public Class<OpsSituationalAwareResponse> getResponseClass() {
		return OpsSituationalAwareResponse.class;
	}

}
