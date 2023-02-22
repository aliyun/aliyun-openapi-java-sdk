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
public class ModifyInterceptionRuleSwitchRequest extends RpcAcsRequest<ModifyInterceptionRuleSwitchResponse> {
	   

	private String clusterId;

	private String ruleIds;

	private Integer ruleSwitch;
	public ModifyInterceptionRuleSwitchRequest() {
		super("Sas", "2018-12-03", "ModifyInterceptionRuleSwitch");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public String getRuleIds() {
		return this.ruleIds;
	}

	public void setRuleIds(String ruleIds) {
		this.ruleIds = ruleIds;
		if(ruleIds != null){
			putQueryParameter("RuleIds", ruleIds);
		}
	}

	public Integer getRuleSwitch() {
		return this.ruleSwitch;
	}

	public void setRuleSwitch(Integer ruleSwitch) {
		this.ruleSwitch = ruleSwitch;
		if(ruleSwitch != null){
			putQueryParameter("RuleSwitch", ruleSwitch.toString());
		}
	}

	@Override
	public Class<ModifyInterceptionRuleSwitchResponse> getResponseClass() {
		return ModifyInterceptionRuleSwitchResponse.class;
	}

}
