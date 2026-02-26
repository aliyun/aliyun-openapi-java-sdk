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

package com.aliyuncs.cbn.model.v20170912;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cbn.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyTrafficMatchRuleToTrafficMarkingPolicyRequest extends RpcAcsRequest<ModifyTrafficMatchRuleToTrafficMarkingPolicyResponse> {
	   

	private String trafficMatchRuleId;

	private Long resourceOwnerId;

	private String trafficMatchRuleDescription;

	private String clientToken;

	private String trafficMarkingPolicyId;

	private Boolean dryRun;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String trafficMatchRuleName;

	private Long ownerId;
	public ModifyTrafficMatchRuleToTrafficMarkingPolicyRequest() {
		super("Cbn", "2017-09-12", "ModifyTrafficMatchRuleToTrafficMarkingPolicy", "cbn");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTrafficMatchRuleId() {
		return this.trafficMatchRuleId;
	}

	public void setTrafficMatchRuleId(String trafficMatchRuleId) {
		this.trafficMatchRuleId = trafficMatchRuleId;
		if(trafficMatchRuleId != null){
			putQueryParameter("TrafficMatchRuleId", trafficMatchRuleId);
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getTrafficMatchRuleDescription() {
		return this.trafficMatchRuleDescription;
	}

	public void setTrafficMatchRuleDescription(String trafficMatchRuleDescription) {
		this.trafficMatchRuleDescription = trafficMatchRuleDescription;
		if(trafficMatchRuleDescription != null){
			putQueryParameter("TrafficMatchRuleDescription", trafficMatchRuleDescription);
		}
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

	public String getTrafficMarkingPolicyId() {
		return this.trafficMarkingPolicyId;
	}

	public void setTrafficMarkingPolicyId(String trafficMarkingPolicyId) {
		this.trafficMarkingPolicyId = trafficMarkingPolicyId;
		if(trafficMarkingPolicyId != null){
			putQueryParameter("TrafficMarkingPolicyId", trafficMarkingPolicyId);
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

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getTrafficMatchRuleName() {
		return this.trafficMatchRuleName;
	}

	public void setTrafficMatchRuleName(String trafficMatchRuleName) {
		this.trafficMatchRuleName = trafficMatchRuleName;
		if(trafficMatchRuleName != null){
			putQueryParameter("TrafficMatchRuleName", trafficMatchRuleName);
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

	@Override
	public Class<ModifyTrafficMatchRuleToTrafficMarkingPolicyResponse> getResponseClass() {
		return ModifyTrafficMatchRuleToTrafficMarkingPolicyResponse.class;
	}

}
