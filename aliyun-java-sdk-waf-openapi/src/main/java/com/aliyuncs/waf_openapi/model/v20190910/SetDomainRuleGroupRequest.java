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

package com.aliyuncs.waf_openapi.model.v20190910;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.waf_openapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SetDomainRuleGroupRequest extends RpcAcsRequest<SetDomainRuleGroupResponse> {
	   

	private Long wafVersion;

	private Long ruleGroupId;

	private String resourceGroupId;

	private String domains;

	private String instanceId;
	public SetDomainRuleGroupRequest() {
		super("waf-openapi", "2019-09-10", "SetDomainRuleGroup", "waf");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getWafVersion() {
		return this.wafVersion;
	}

	public void setWafVersion(Long wafVersion) {
		this.wafVersion = wafVersion;
		if(wafVersion != null){
			putQueryParameter("WafVersion", wafVersion.toString());
		}
	}

	public Long getRuleGroupId() {
		return this.ruleGroupId;
	}

	public void setRuleGroupId(Long ruleGroupId) {
		this.ruleGroupId = ruleGroupId;
		if(ruleGroupId != null){
			putQueryParameter("RuleGroupId", ruleGroupId.toString());
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public String getDomains() {
		return this.domains;
	}

	public void setDomains(String domains) {
		this.domains = domains;
		if(domains != null){
			putQueryParameter("Domains", domains);
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

	@Override
	public Class<SetDomainRuleGroupResponse> getResponseClass() {
		return SetDomainRuleGroupResponse.class;
	}

}
