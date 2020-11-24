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

package com.aliyuncs.ddoscoo.model.v20200101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ddoscoo.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteWebPreciseAccessRuleRequest extends RpcAcsRequest<DeleteWebPreciseAccessRuleResponse> {
	   

	private String resourceGroupId;

	private List<String> ruleNamess;

	private String domain;
	public DeleteWebPreciseAccessRuleRequest() {
		super("ddoscoo", "2020-01-01", "DeleteWebPreciseAccessRule");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public List<String> getRuleNamess() {
		return this.ruleNamess;
	}

	public void setRuleNamess(List<String> ruleNamess) {
		this.ruleNamess = ruleNamess;	
		if (ruleNamess != null) {
			for (int i = 0; i < ruleNamess.size(); i++) {
				putQueryParameter("RuleNames." + (i + 1) , ruleNamess.get(i));
			}
		}	
	}

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
		if(domain != null){
			putQueryParameter("Domain", domain);
		}
	}

	@Override
	public Class<DeleteWebPreciseAccessRuleResponse> getResponseClass() {
		return DeleteWebPreciseAccessRuleResponse.class;
	}

}
