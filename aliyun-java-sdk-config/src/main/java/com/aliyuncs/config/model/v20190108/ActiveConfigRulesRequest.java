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

package com.aliyuncs.config.model.v20190108;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.config.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ActiveConfigRulesRequest extends RpcAcsRequest<ActiveConfigRulesResponse> {
	   

	private String configRuleIds;
	public ActiveConfigRulesRequest() {
		super("Config", "2019-01-08", "ActiveConfigRules", "Config");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getConfigRuleIds() {
		return this.configRuleIds;
	}

	public void setConfigRuleIds(String configRuleIds) {
		this.configRuleIds = configRuleIds;
		if(configRuleIds != null){
			putQueryParameter("ConfigRuleIds", configRuleIds);
		}
	}

	@Override
	public Class<ActiveConfigRulesResponse> getResponseClass() {
		return ActiveConfigRulesResponse.class;
	}

}
