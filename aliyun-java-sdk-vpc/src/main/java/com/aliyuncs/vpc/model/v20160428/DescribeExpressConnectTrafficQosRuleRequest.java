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

package com.aliyuncs.vpc.model.v20160428;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeExpressConnectTrafficQosRuleRequest extends RpcAcsRequest<DescribeExpressConnectTrafficQosRuleResponse> {
	   

	private String clientToken;

	private List<String> ruleIdLists;

	private String qosId;

	private String queueId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private List<String> ruleNameLists;
	public DescribeExpressConnectTrafficQosRuleRequest() {
		super("Vpc", "2016-04-28", "DescribeExpressConnectTrafficQosRule", "vpc");
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

	public List<String> getRuleIdLists() {
		return this.ruleIdLists;
	}

	public void setRuleIdLists(List<String> ruleIdLists) {
		this.ruleIdLists = ruleIdLists;	
		if (ruleIdLists != null) {
			for (int i = 0; i < ruleIdLists.size(); i++) {
				putQueryParameter("RuleIdList." + (i + 1) , ruleIdLists.get(i));
			}
		}	
	}

	public String getQosId() {
		return this.qosId;
	}

	public void setQosId(String qosId) {
		this.qosId = qosId;
		if(qosId != null){
			putQueryParameter("QosId", qosId);
		}
	}

	public String getQueueId() {
		return this.queueId;
	}

	public void setQueueId(String queueId) {
		this.queueId = queueId;
		if(queueId != null){
			putQueryParameter("QueueId", queueId);
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public List<String> getRuleNameLists() {
		return this.ruleNameLists;
	}

	public void setRuleNameLists(List<String> ruleNameLists) {
		this.ruleNameLists = ruleNameLists;	
		if (ruleNameLists != null) {
			for (int i = 0; i < ruleNameLists.size(); i++) {
				putQueryParameter("RuleNameList." + (i + 1) , ruleNameLists.get(i));
			}
		}	
	}

	@Override
	public Class<DescribeExpressConnectTrafficQosRuleResponse> getResponseClass() {
		return DescribeExpressConnectTrafficQosRuleResponse.class;
	}

}
