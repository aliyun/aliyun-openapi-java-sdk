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

package com.aliyuncs.resourcemanager.model.v20200331;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.resourcemanager.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateControlPolicyRequest extends RpcAcsRequest<CreateControlPolicyResponse> {
	   

	private String description;

	private String effectScope;

	private String policyName;

	private String policyDocument;
	public CreateControlPolicyRequest() {
		super("ResourceManager", "2020-03-31", "CreateControlPolicy", "resourcemanager");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getEffectScope() {
		return this.effectScope;
	}

	public void setEffectScope(String effectScope) {
		this.effectScope = effectScope;
		if(effectScope != null){
			putQueryParameter("EffectScope", effectScope);
		}
	}

	public String getPolicyName() {
		return this.policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
		if(policyName != null){
			putQueryParameter("PolicyName", policyName);
		}
	}

	public String getPolicyDocument() {
		return this.policyDocument;
	}

	public void setPolicyDocument(String policyDocument) {
		this.policyDocument = policyDocument;
		if(policyDocument != null){
			putQueryParameter("PolicyDocument", policyDocument);
		}
	}

	@Override
	public Class<CreateControlPolicyResponse> getResponseClass() {
		return CreateControlPolicyResponse.class;
	}

}
