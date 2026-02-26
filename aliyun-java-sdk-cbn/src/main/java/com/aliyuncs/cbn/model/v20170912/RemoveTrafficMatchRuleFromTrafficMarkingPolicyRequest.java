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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cbn.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RemoveTrafficMatchRuleFromTrafficMarkingPolicyRequest extends RpcAcsRequest<RemoveTrafficMatchRuleFromTrafficMarkingPolicyResponse> {
	   

	private Long resourceOwnerId;

	private String clientToken;

	private String trafficMarkingPolicyId;

	private Boolean dryRun;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private List<String> trafficMarkRuleIdss;

	private Long ownerId;
	public RemoveTrafficMatchRuleFromTrafficMarkingPolicyRequest() {
		super("Cbn", "2017-09-12", "RemoveTrafficMatchRuleFromTrafficMarkingPolicy", "cbn");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public List<String> getTrafficMarkRuleIdss() {
		return this.trafficMarkRuleIdss;
	}

	public void setTrafficMarkRuleIdss(List<String> trafficMarkRuleIdss) {
		this.trafficMarkRuleIdss = trafficMarkRuleIdss;	
		if (trafficMarkRuleIdss != null) {
			for (int i = 0; i < trafficMarkRuleIdss.size(); i++) {
				putQueryParameter("TrafficMarkRuleIds." + (i + 1) , trafficMarkRuleIdss.get(i));
			}
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
	public Class<RemoveTrafficMatchRuleFromTrafficMarkingPolicyResponse> getResponseClass() {
		return RemoveTrafficMatchRuleFromTrafficMarkingPolicyResponse.class;
	}

}
