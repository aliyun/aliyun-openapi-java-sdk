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

package com.aliyuncs.scsp.model.v20200702;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.scsp.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateThirdSsoAgentRequest extends RpcAcsRequest<CreateThirdSsoAgentResponse> {
	   

	private String clientToken;

	private String instanceId;

	private String clientId;

	private String accountId;

	private String accountName;

	private String displayName;

	private List<Long> skillGroupIds;

	private List<Long> roleIds;
	public CreateThirdSsoAgentRequest() {
		super("scsp", "2020-07-02", "CreateThirdSsoAgent");
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

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public String getClientId() {
		return this.clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
		if(clientId != null){
			putBodyParameter("ClientId", clientId);
		}
	}

	public String getAccountId() {
		return this.accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
		if(accountId != null){
			putBodyParameter("AccountId", accountId);
		}
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
		if(accountName != null){
			putBodyParameter("AccountName", accountName);
		}
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
		if(displayName != null){
			putBodyParameter("DisplayName", displayName);
		}
	}

	public List<Long> getSkillGroupIds() {
		return this.skillGroupIds;
	}

	public void setSkillGroupIds(List<Long> skillGroupIds) {
		this.skillGroupIds = skillGroupIds;	
		if (skillGroupIds != null) {
			for (int depth1 = 0; depth1 < skillGroupIds.size(); depth1++) {
				putBodyParameter("SkillGroupIds." + (depth1 + 1) , skillGroupIds.get(depth1));
			}
		}	
	}

	public List<Long> getRoleIds() {
		return this.roleIds;
	}

	public void setRoleIds(List<Long> roleIds) {
		this.roleIds = roleIds;	
		if (roleIds != null) {
			for (int depth1 = 0; depth1 < roleIds.size(); depth1++) {
				putBodyParameter("RoleIds." + (depth1 + 1) , roleIds.get(depth1));
			}
		}	
	}

	@Override
	public Class<CreateThirdSsoAgentResponse> getResponseClass() {
		return CreateThirdSsoAgentResponse.class;
	}

}
