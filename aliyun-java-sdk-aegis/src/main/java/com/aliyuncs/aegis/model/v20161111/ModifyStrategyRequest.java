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

package com.aliyuncs.aegis.model.v20161111;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ModifyStrategyRequest extends RpcAcsRequest<ModifyStrategyResponse> {
	
	public ModifyStrategyRequest() {
		super("aegis", "2016-11-11", "ModifyStrategy", "vipaegis");
		setMethod(MethodType.POST);
	}

	private String riskSubTypeName;

	private String sourceIp;

	private String cycleStartTime;

	private String name;

	private String cycleDays;

	private String id;

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

	public String getCycleDays() {
		return this.cycleDays;
	}

	public void setCycleDays(String cycleDays) {
		this.cycleDays = cycleDays;
		if(cycleDays != null){
			putQueryParameter("CycleDays", cycleDays);
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

	@Override
	public Class<ModifyStrategyResponse> getResponseClass() {
		return ModifyStrategyResponse.class;
	}

}
