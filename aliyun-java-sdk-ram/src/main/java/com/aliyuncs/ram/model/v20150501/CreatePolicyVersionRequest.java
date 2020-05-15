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

package com.aliyuncs.ram.model.v20150501;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ram.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreatePolicyVersionRequest extends RpcAcsRequest<CreatePolicyVersionResponse> {
	   

	private Boolean setAsDefault;

	private String policyName;

	private String policyDocument;

	private String rotateStrategy;
	public CreatePolicyVersionRequest() {
		super("Ram", "2015-05-01", "CreatePolicyVersion", "Ram");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getSetAsDefault() {
		return this.setAsDefault;
	}

	public void setSetAsDefault(Boolean setAsDefault) {
		this.setAsDefault = setAsDefault;
		if(setAsDefault != null){
			putQueryParameter("SetAsDefault", setAsDefault.toString());
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

	public String getRotateStrategy() {
		return this.rotateStrategy;
	}

	public void setRotateStrategy(String rotateStrategy) {
		this.rotateStrategy = rotateStrategy;
		if(rotateStrategy != null){
			putQueryParameter("RotateStrategy", rotateStrategy);
		}
	}

	@Override
	public Class<CreatePolicyVersionResponse> getResponseClass() {
		return CreatePolicyVersionResponse.class;
	}

}
