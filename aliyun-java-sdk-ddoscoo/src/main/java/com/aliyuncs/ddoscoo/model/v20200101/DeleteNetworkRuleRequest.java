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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ddoscoo.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteNetworkRuleRequest extends RpcAcsRequest<DeleteNetworkRuleResponse> {
	   

	private String networkRule;
	public DeleteNetworkRuleRequest() {
		super("ddoscoo", "2020-01-01", "DeleteNetworkRule");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getNetworkRule() {
		return this.networkRule;
	}

	public void setNetworkRule(String networkRule) {
		this.networkRule = networkRule;
		if(networkRule != null){
			putQueryParameter("NetworkRule", networkRule);
		}
	}

	@Override
	public Class<DeleteNetworkRuleResponse> getResponseClass() {
		return DeleteNetworkRuleResponse.class;
	}

}
