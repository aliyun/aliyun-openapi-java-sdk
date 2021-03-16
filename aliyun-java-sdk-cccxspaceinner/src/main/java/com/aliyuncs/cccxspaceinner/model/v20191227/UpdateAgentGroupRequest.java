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

package com.aliyuncs.cccxspaceinner.model.v20191227;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateAgentGroupRequest extends RpcAcsRequest<UpdateAgentGroupResponse> {
	   

	private Long agentId;

	private String groupIds;

	private Long createAgentId;
	public UpdateAgentGroupRequest() {
		super("CCCXSpaceInner", "2019-12-27", "UpdateAgentGroup");
		setMethod(MethodType.PUT);
	}

	public Long getAgentId() {
		return this.agentId;
	}

	public void setAgentId(Long agentId) {
		this.agentId = agentId;
		if(agentId != null){
			putBodyParameter("AgentId", agentId.toString());
		}
	}

	public String getGroupIds() {
		return this.groupIds;
	}

	public void setGroupIds(String groupIds) {
		this.groupIds = groupIds;
		if(groupIds != null){
			putBodyParameter("GroupIds", groupIds);
		}
	}

	public Long getCreateAgentId() {
		return this.createAgentId;
	}

	public void setCreateAgentId(Long createAgentId) {
		this.createAgentId = createAgentId;
		if(createAgentId != null){
			putBodyParameter("CreateAgentId", createAgentId.toString());
		}
	}

	@Override
	public Class<UpdateAgentGroupResponse> getResponseClass() {
		return UpdateAgentGroupResponse.class;
	}

}
