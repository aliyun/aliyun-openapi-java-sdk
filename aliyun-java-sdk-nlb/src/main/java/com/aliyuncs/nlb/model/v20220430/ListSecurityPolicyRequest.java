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

package com.aliyuncs.nlb.model.v20220430;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.nlb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListSecurityPolicyRequest extends RpcAcsRequest<ListSecurityPolicyResponse> {
	   

	private List<String> securityPolicyNamess;

	private String resourceGroupId;

	private String nextToken;

	private List<Tag> tag;

	private List<String> securityPolicyIdss;

	private Integer maxResults;
	public ListSecurityPolicyRequest() {
		super("Nlb", "2022-04-30", "ListSecurityPolicy", "nlb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getSecurityPolicyNamess() {
		return this.securityPolicyNamess;
	}

	public void setSecurityPolicyNamess(List<String> securityPolicyNamess) {
		this.securityPolicyNamess = securityPolicyNamess;	
		if (securityPolicyNamess != null) {
			for (int i = 0; i < securityPolicyNamess.size(); i++) {
				putBodyParameter("SecurityPolicyNames." + (i + 1) , securityPolicyNamess.get(i));
			}
		}	
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putBodyParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putBodyParameter("NextToken", nextToken);
		}
	}

	public List<Tag> getTag() {
		return this.tag;
	}

	public void setTag(List<Tag> tag) {
		this.tag = tag;	
		if (tag != null) {
			for (int depth1 = 0; depth1 < tag.size(); depth1++) {
				if (tag.get(depth1) != null) {
					
						putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tag.get(depth1).getKey());
						putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tag.get(depth1).getValue());
				}
			}
		}	
	}

	public List<String> getSecurityPolicyIdss() {
		return this.securityPolicyIdss;
	}

	public void setSecurityPolicyIdss(List<String> securityPolicyIdss) {
		this.securityPolicyIdss = securityPolicyIdss;	
		if (securityPolicyIdss != null) {
			for (int i = 0; i < securityPolicyIdss.size(); i++) {
				putBodyParameter("SecurityPolicyIds." + (i + 1) , securityPolicyIdss.get(i));
			}
		}	
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putBodyParameter("MaxResults", maxResults.toString());
		}
	}

	public static class Tag {

		private String key;

		private String value;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	@Override
	public Class<ListSecurityPolicyResponse> getResponseClass() {
		return ListSecurityPolicyResponse.class;
	}

}
