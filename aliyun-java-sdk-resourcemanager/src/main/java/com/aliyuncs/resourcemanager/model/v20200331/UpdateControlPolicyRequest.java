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
public class UpdateControlPolicyRequest extends RpcAcsRequest<UpdateControlPolicyResponse> {
	   

	private String newPolicyName;

	private String policyId;

	private String newPolicyDocument;

	private String newDescription;
	public UpdateControlPolicyRequest() {
		super("ResourceManager", "2020-03-31", "UpdateControlPolicy", "resourcemanager");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getNewPolicyName() {
		return this.newPolicyName;
	}

	public void setNewPolicyName(String newPolicyName) {
		this.newPolicyName = newPolicyName;
		if(newPolicyName != null){
			putQueryParameter("NewPolicyName", newPolicyName);
		}
	}

	public String getPolicyId() {
		return this.policyId;
	}

	public void setPolicyId(String policyId) {
		this.policyId = policyId;
		if(policyId != null){
			putQueryParameter("PolicyId", policyId);
		}
	}

	public String getNewPolicyDocument() {
		return this.newPolicyDocument;
	}

	public void setNewPolicyDocument(String newPolicyDocument) {
		this.newPolicyDocument = newPolicyDocument;
		if(newPolicyDocument != null){
			putQueryParameter("NewPolicyDocument", newPolicyDocument);
		}
	}

	public String getNewDescription() {
		return this.newDescription;
	}

	public void setNewDescription(String newDescription) {
		this.newDescription = newDescription;
		if(newDescription != null){
			putQueryParameter("NewDescription", newDescription);
		}
	}

	@Override
	public Class<UpdateControlPolicyResponse> getResponseClass() {
		return UpdateControlPolicyResponse.class;
	}

}
