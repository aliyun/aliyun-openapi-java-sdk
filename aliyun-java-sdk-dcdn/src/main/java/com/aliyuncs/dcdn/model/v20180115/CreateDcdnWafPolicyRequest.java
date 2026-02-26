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

package com.aliyuncs.dcdn.model.v20180115;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dcdn.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateDcdnWafPolicyRequest extends RpcAcsRequest<CreateDcdnWafPolicyResponse> {
	   

	private String policyStatus;

	private String defenseScene;

	private String policyType;

	private Long ownerId;

	private String policyName;
	public CreateDcdnWafPolicyRequest() {
		super("dcdn", "2018-01-15", "CreateDcdnWafPolicy");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPolicyStatus() {
		return this.policyStatus;
	}

	public void setPolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
		if(policyStatus != null){
			putBodyParameter("PolicyStatus", policyStatus);
		}
	}

	public String getDefenseScene() {
		return this.defenseScene;
	}

	public void setDefenseScene(String defenseScene) {
		this.defenseScene = defenseScene;
		if(defenseScene != null){
			putBodyParameter("DefenseScene", defenseScene);
		}
	}

	public String getPolicyType() {
		return this.policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
		if(policyType != null){
			putBodyParameter("PolicyType", policyType);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getPolicyName() {
		return this.policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
		if(policyName != null){
			putBodyParameter("PolicyName", policyName);
		}
	}

	@Override
	public Class<CreateDcdnWafPolicyResponse> getResponseClass() {
		return CreateDcdnWafPolicyResponse.class;
	}

}
