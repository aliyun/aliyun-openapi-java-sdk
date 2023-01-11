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
public class CreateSecurityPolicyRequest extends RpcAcsRequest<CreateSecurityPolicyResponse> {
	   

	private String clientToken;

	private String resourceGroupId;

	private List<String> cipherss;

	private List<String> tlsVersionss;

	private String securityPolicyName;

	private Boolean dryRun;
	public CreateSecurityPolicyRequest() {
		super("Nlb", "2022-04-30", "CreateSecurityPolicy", "nlb");
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
			putBodyParameter("ClientToken", clientToken);
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

	public List<String> getCipherss() {
		return this.cipherss;
	}

	public void setCipherss(List<String> cipherss) {
		this.cipherss = cipherss;	
		if (cipherss != null) {
			for (int i = 0; i < cipherss.size(); i++) {
				putBodyParameter("Ciphers." + (i + 1) , cipherss.get(i));
			}
		}	
	}

	public List<String> getTlsVersionss() {
		return this.tlsVersionss;
	}

	public void setTlsVersionss(List<String> tlsVersionss) {
		this.tlsVersionss = tlsVersionss;	
		if (tlsVersionss != null) {
			for (int i = 0; i < tlsVersionss.size(); i++) {
				putBodyParameter("TlsVersions." + (i + 1) , tlsVersionss.get(i));
			}
		}	
	}

	public String getSecurityPolicyName() {
		return this.securityPolicyName;
	}

	public void setSecurityPolicyName(String securityPolicyName) {
		this.securityPolicyName = securityPolicyName;
		if(securityPolicyName != null){
			putBodyParameter("SecurityPolicyName", securityPolicyName);
		}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putBodyParameter("DryRun", dryRun.toString());
		}
	}

	@Override
	public Class<CreateSecurityPolicyResponse> getResponseClass() {
		return CreateSecurityPolicyResponse.class;
	}

}
