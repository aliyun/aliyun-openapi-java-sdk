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

package com.aliyuncs.aiccs.model.v20191015;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.aiccs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateAgentRequest extends RpcAcsRequest<UpdateAgentResponse> {
	   

	private String clientToken;

	private String instanceId;

	private String accountName;

	private String displayName;

	private List<Long> skillGroupIds;

	private List<Long> skillGroupIdLists;
	public UpdateAgentRequest() {
		super("aiccs", "2019-10-15", "UpdateAgent");
		setMethod(MethodType.PUT);
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

	public List<Long> getSkillGroupIds() {
		return this.skillGroupIds;
	}

	public void setSkillGroupIds(List<Long> skillGroupIds) {
		this.skillGroupIds = skillGroupIds;	
		if (skillGroupIds != null) {
			for (int i = 0; i < skillGroupIds.size(); i++) {
				putBodyParameter("SkillGroupId." + (i + 1) , skillGroupIds.get(i));
			}
		}	
	}

	public List<Long> getSkillGroupIdLists() {
		return this.skillGroupIdLists;
	}

	public void setSkillGroupIdLists(List<Long> skillGroupIdLists) {
		this.skillGroupIdLists = skillGroupIdLists;	
		if (skillGroupIdLists != null) {
			for (int i = 0; i < skillGroupIdLists.size(); i++) {
				putBodyParameter("SkillGroupIdList." + (i + 1) , skillGroupIdLists.get(i));
			}
		}	
	}

	@Override
	public Class<UpdateAgentResponse> getResponseClass() {
		return UpdateAgentResponse.class;
	}

}
