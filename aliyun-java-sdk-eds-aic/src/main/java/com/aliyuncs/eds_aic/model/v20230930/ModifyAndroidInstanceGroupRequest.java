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

package com.aliyuncs.eds_aic.model.v20230930;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ModifyAndroidInstanceGroupRequest extends RpcAcsRequest<ModifyAndroidInstanceGroupResponse> {
	   

	private String instanceGroupId;

	private String newInstanceGroupName;

	private String policyGroupId;
	public ModifyAndroidInstanceGroupRequest() {
		super("eds-aic", "2023-09-30", "ModifyAndroidInstanceGroup");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getInstanceGroupId() {
		return this.instanceGroupId;
	}

	public void setInstanceGroupId(String instanceGroupId) {
		this.instanceGroupId = instanceGroupId;
		if(instanceGroupId != null){
			putQueryParameter("InstanceGroupId", instanceGroupId);
		}
	}

	public String getNewInstanceGroupName() {
		return this.newInstanceGroupName;
	}

	public void setNewInstanceGroupName(String newInstanceGroupName) {
		this.newInstanceGroupName = newInstanceGroupName;
		if(newInstanceGroupName != null){
			putQueryParameter("NewInstanceGroupName", newInstanceGroupName);
		}
	}

	public String getPolicyGroupId() {
		return this.policyGroupId;
	}

	public void setPolicyGroupId(String policyGroupId) {
		this.policyGroupId = policyGroupId;
		if(policyGroupId != null){
			putQueryParameter("PolicyGroupId", policyGroupId);
		}
	}

	@Override
	public Class<ModifyAndroidInstanceGroupResponse> getResponseClass() {
		return ModifyAndroidInstanceGroupResponse.class;
	}

}
