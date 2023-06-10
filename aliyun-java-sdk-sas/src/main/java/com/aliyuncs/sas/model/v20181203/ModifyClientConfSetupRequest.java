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
public class ModifyClientConfSetupRequest extends RpcAcsRequest<ModifyClientConfSetupResponse> {
	   

	private String strategyConfig;

	private String strategyTag;

	private String strategyTagValue;
	public ModifyClientConfSetupRequest() {
		super("Sas", "2018-12-03", "ModifyClientConfSetup", "sas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getStrategyConfig() {
		return this.strategyConfig;
	}

	public void setStrategyConfig(String strategyConfig) {
		this.strategyConfig = strategyConfig;
		if(strategyConfig != null){
			putQueryParameter("StrategyConfig", strategyConfig);
		}
	}

	public String getStrategyTag() {
		return this.strategyTag;
	}

	public void setStrategyTag(String strategyTag) {
		this.strategyTag = strategyTag;
		if(strategyTag != null){
			putQueryParameter("StrategyTag", strategyTag);
		}
	}

	public String getStrategyTagValue() {
		return this.strategyTagValue;
	}

	public void setStrategyTagValue(String strategyTagValue) {
		this.strategyTagValue = strategyTagValue;
		if(strategyTagValue != null){
			putQueryParameter("StrategyTagValue", strategyTagValue);
		}
	}

	@Override
	public Class<ModifyClientConfSetupResponse> getResponseClass() {
		return ModifyClientConfSetupResponse.class;
	}

}
