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

package com.aliyuncs.ga.model.v20191120;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ga.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteCustomRoutingEndpointTrafficPoliciesRequest extends RpcAcsRequest<DeleteCustomRoutingEndpointTrafficPoliciesResponse> {
	   

	private String clientToken;

	private String endpointId;

	private List<String> policyIdss;
	public DeleteCustomRoutingEndpointTrafficPoliciesRequest() {
		super("Ga", "2019-11-20", "DeleteCustomRoutingEndpointTrafficPolicies", "gaplus");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getEndpointId() {
		return this.endpointId;
	}

	public void setEndpointId(String endpointId) {
		this.endpointId = endpointId;
		if(endpointId != null){
			putQueryParameter("EndpointId", endpointId);
		}
	}

	public List<String> getPolicyIdss() {
		return this.policyIdss;
	}

	public void setPolicyIdss(List<String> policyIdss) {
		this.policyIdss = policyIdss;	
		if (policyIdss != null) {
			for (int i = 0; i < policyIdss.size(); i++) {
				putQueryParameter("PolicyIds." + (i + 1) , policyIdss.get(i));
			}
		}	
	}

	@Override
	public Class<DeleteCustomRoutingEndpointTrafficPoliciesResponse> getResponseClass() {
		return DeleteCustomRoutingEndpointTrafficPoliciesResponse.class;
	}

}
