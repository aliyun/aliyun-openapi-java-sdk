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
public class CreateSecurityPolicyRequest extends RpcAcsRequest<CreateSecurityPolicyResponse> {
	   

	private String clientToken;

	private String resourceGroupId;

	private List<String> ciphers;

	private List<Tag> tag;

	private List<String> tLSVersions;

	private String securityPolicyName;

	private Boolean dryRun;
	public CreateSecurityPolicyRequest() {
		super("Alb", "2020-06-16", "CreateSecurityPolicy", "alb");
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

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public List<String> getCiphers() {
		return this.ciphers;
	}

	public void setCiphers(List<String> ciphers) {
		this.ciphers = ciphers;	
		if (ciphers != null) {
			for (int depth1 = 0; depth1 < ciphers.size(); depth1++) {
				putQueryParameter("Ciphers." + (depth1 + 1) , ciphers.get(depth1));
			}
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
					
						putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tag.get(depth1).getValue());
						putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tag.get(depth1).getKey());
				}
			}
		}	
	}

	public List<String> getTLSVersions() {
		return this.tLSVersions;
	}

	public void setTLSVersions(List<String> tLSVersions) {
		this.tLSVersions = tLSVersions;	
		if (tLSVersions != null) {
			for (int depth1 = 0; depth1 < tLSVersions.size(); depth1++) {
				putQueryParameter("TLSVersions." + (depth1 + 1) , tLSVersions.get(depth1));
			}
		}	
	}

	public String getSecurityPolicyName() {
		return this.securityPolicyName;
	}

	public void setSecurityPolicyName(String securityPolicyName) {
		this.securityPolicyName = securityPolicyName;
		if(securityPolicyName != null){
			putQueryParameter("SecurityPolicyName", securityPolicyName);
		}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
		}
	}

	public static class Tag {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<CreateSecurityPolicyResponse> getResponseClass() {
		return CreateSecurityPolicyResponse.class;
	}

}
