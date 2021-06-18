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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyStrategyRequest extends RpcAcsRequest<ModifyStrategyResponse> {
	   

	private String cycleDays;

	private String riskSubTypeName;

	private String sourceIp;

	private String id;

	private String cycleStartTime;

	private String name;
	public ModifyStrategyRequest() {
		super("Sas", "2018-12-03", "ModifyStrategy", "sas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCycleDays() {
		return this.cycleDays;
	}

	public void setCycleDays(String cycleDays) {
		this.cycleDays = cycleDays;
		if(cycleDays != null){
			putQueryParameter("CycleDays", cycleDays);
		}
	}

	public String getRiskSubTypeName() {
		return this.riskSubTypeName;
	}

	public void setRiskSubTypeName(String riskSubTypeName) {
		this.riskSubTypeName = riskSubTypeName;
		if(riskSubTypeName != null){
			putQueryParameter("RiskSubTypeName", riskSubTypeName);
		}
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id);
		}
	}

	public String getCycleStartTime() {
		return this.cycleStartTime;
	}

	public void setCycleStartTime(String cycleStartTime) {
		this.cycleStartTime = cycleStartTime;
		if(cycleStartTime != null){
			putQueryParameter("CycleStartTime", cycleStartTime);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	@Override
	public Class<ModifyStrategyResponse> getResponseClass() {
		return ModifyStrategyResponse.class;
	}

}
