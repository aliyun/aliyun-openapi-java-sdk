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

package com.aliyuncs.ccc.model.v20170705;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ccc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListSkillGroupsRequest extends RpcAcsRequest<ListSkillGroupsResponse> {
	   

	private String instanceId;

	private List<String> skillGroupIds;

	private List<String> skillGroupNames;
	public ListSkillGroupsRequest() {
		super("CCC", "2017-07-05", "ListSkillGroups", "CCC");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public List<String> getSkillGroupIds() {
		return this.skillGroupIds;
	}

	public void setSkillGroupIds(List<String> skillGroupIds) {
		this.skillGroupIds = skillGroupIds;	
		if (skillGroupIds != null) {
			for (int i = 0; i < skillGroupIds.size(); i++) {
				putQueryParameter("SkillGroupId." + (i + 1) , skillGroupIds.get(i));
			}
		}	
	}

	public List<String> getSkillGroupNames() {
		return this.skillGroupNames;
	}

	public void setSkillGroupNames(List<String> skillGroupNames) {
		this.skillGroupNames = skillGroupNames;	
		if (skillGroupNames != null) {
			for (int i = 0; i < skillGroupNames.size(); i++) {
				putQueryParameter("SkillGroupName." + (i + 1) , skillGroupNames.get(i));
			}
		}	
	}

	@Override
	public Class<ListSkillGroupsResponse> getResponseClass() {
		return ListSkillGroupsResponse.class;
	}

}
