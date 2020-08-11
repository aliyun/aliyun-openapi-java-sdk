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
public class ModifyPrimaryTrunksOfSkillGroupRequest extends RpcAcsRequest<ModifyPrimaryTrunksOfSkillGroupResponse> {
	   

	private List<String> primaryProviderNames;

	private String instanceId;

	private String skillGroupId;
	public ModifyPrimaryTrunksOfSkillGroupRequest() {
		super("CCC", "2017-07-05", "ModifyPrimaryTrunksOfSkillGroup", "CCC");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getPrimaryProviderNames() {
		return this.primaryProviderNames;
	}

	public void setPrimaryProviderNames(List<String> primaryProviderNames) {
		this.primaryProviderNames = primaryProviderNames;	
		if (primaryProviderNames != null) {
			for (int i = 0; i < primaryProviderNames.size(); i++) {
				putQueryParameter("PrimaryProviderName." + (i + 1) , primaryProviderNames.get(i));
			}
		}	
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

	public String getSkillGroupId() {
		return this.skillGroupId;
	}

	public void setSkillGroupId(String skillGroupId) {
		this.skillGroupId = skillGroupId;
		if(skillGroupId != null){
			putQueryParameter("SkillGroupId", skillGroupId);
		}
	}

	@Override
	public Class<ModifyPrimaryTrunksOfSkillGroupResponse> getResponseClass() {
		return ModifyPrimaryTrunksOfSkillGroupResponse.class;
	}

}
