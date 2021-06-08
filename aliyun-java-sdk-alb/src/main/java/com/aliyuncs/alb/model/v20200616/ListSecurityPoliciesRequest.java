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

package com.aliyuncs.alb.model.v20200616;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.alb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListSecurityPoliciesRequest extends RpcAcsRequest<ListSecurityPoliciesResponse> {
	   

	private List<String> securityPolicyNames;

	private String resourceGroupId;

	private String nextToken;

	private List<String> securityPolicyIds;

	private Integer maxResults;
	public ListSecurityPoliciesRequest() {
		super("Alb", "2020-06-16", "ListSecurityPolicies", "alb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getSecurityPolicyNames() {
		return this.securityPolicyNames;
	}

	public void setSecurityPolicyNames(List<String> securityPolicyNames) {
		this.securityPolicyNames = securityPolicyNames;	
		if (securityPolicyNames != null) {
			for (int depth1 = 0; depth1 < securityPolicyNames.size(); depth1++) {
				putQueryParameter("SecurityPolicyNames." + (depth1 + 1) , securityPolicyNames.get(depth1));
			}
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

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public List<String> getSecurityPolicyIds() {
		return this.securityPolicyIds;
	}

	public void setSecurityPolicyIds(List<String> securityPolicyIds) {
		this.securityPolicyIds = securityPolicyIds;	
		if (securityPolicyIds != null) {
			for (int depth1 = 0; depth1 < securityPolicyIds.size(); depth1++) {
				putQueryParameter("SecurityPolicyIds." + (depth1 + 1) , securityPolicyIds.get(depth1));
			}
		}	
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	@Override
	public Class<ListSecurityPoliciesResponse> getResponseClass() {
		return ListSecurityPoliciesResponse.class;
	}

}
