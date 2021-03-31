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
public class CreateAgentRequest extends RpcAcsRequest<CreateAgentResponse> {
	   

	private String clientToken;

	private String instanceId;

	private String accountName;

	private String displayName;

	private List<Long> skillGroupId;

	private List<Long> skillGroupIdList;
	public CreateAgentRequest() {
		super("scsp", "2020-07-02", "CreateAgent");
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

	public List<Long> getSkillGroupId() {
		return this.skillGroupId;
	}

	public void setSkillGroupId(List<Long> skillGroupId) {
		this.skillGroupId = skillGroupId;	
		if (skillGroupId != null) {
			for (int depth1 = 0; depth1 < skillGroupId.size(); depth1++) {
				putBodyParameter("SkillGroupId." + (depth1 + 1) , skillGroupId.get(depth1));
			}
		}	
	}

	public List<Long> getSkillGroupIdList() {
		return this.skillGroupIdList;
	}

	public void setSkillGroupIdList(List<Long> skillGroupIdList) {
		this.skillGroupIdList = skillGroupIdList;	
		if (skillGroupIdList != null) {
			for (int depth1 = 0; depth1 < skillGroupIdList.size(); depth1++) {
				putBodyParameter("SkillGroupIdList." + (depth1 + 1) , skillGroupIdList.get(depth1));
			}
		}	
	}

	@Override
	public Class<CreateAgentResponse> getResponseClass() {
		return CreateAgentResponse.class;
	}

}
