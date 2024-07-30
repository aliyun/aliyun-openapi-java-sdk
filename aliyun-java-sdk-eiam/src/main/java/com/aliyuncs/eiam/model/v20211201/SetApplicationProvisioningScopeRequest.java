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

package com.aliyuncs.eiam.model.v20211201;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SetApplicationProvisioningScopeRequest extends RpcAcsRequest<SetApplicationProvisioningScopeResponse> {
	   

	private String applicationId;

	private List<String> organizationalUnitIds;

	private String instanceId;

	private List<String> groupIds;
	public SetApplicationProvisioningScopeRequest() {
		super("Eiam", "2021-12-01", "SetApplicationProvisioningScope", "eiam");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
		if(applicationId != null){
			putQueryParameter("ApplicationId", applicationId);
		}
	}

	public List<String> getOrganizationalUnitIds() {
		return this.organizationalUnitIds;
	}

	public void setOrganizationalUnitIds(List<String> organizationalUnitIds) {
		this.organizationalUnitIds = organizationalUnitIds;	
		if (organizationalUnitIds != null) {
			for (int depth1 = 0; depth1 < organizationalUnitIds.size(); depth1++) {
				putQueryParameter("OrganizationalUnitIds." + (depth1 + 1) , organizationalUnitIds.get(depth1));
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

	public List<String> getGroupIds() {
		return this.groupIds;
	}

	public void setGroupIds(List<String> groupIds) {
		this.groupIds = groupIds;	
		if (groupIds != null) {
			for (int depth1 = 0; depth1 < groupIds.size(); depth1++) {
				putQueryParameter("GroupIds." + (depth1 + 1) , groupIds.get(depth1));
			}
		}	
	}

	@Override
	public Class<SetApplicationProvisioningScopeResponse> getResponseClass() {
		return SetApplicationProvisioningScopeResponse.class;
	}

}
