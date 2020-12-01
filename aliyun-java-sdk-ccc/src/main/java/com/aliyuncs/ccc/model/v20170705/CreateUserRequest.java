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
public class CreateUserRequest extends RpcAcsRequest<CreateUserResponse> {
	   

	private String privateOutboundNumberId;

	private String loginName;

	private List<String> roleIds;

	private List<Integer> skillLevels;

	private String instanceId;

	private String phone;

	private String displayName;

	private List<String> skillGroupIds;

	private String email;
	public CreateUserRequest() {
		super("CCC", "2017-07-05", "CreateUser");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPrivateOutboundNumberId() {
		return this.privateOutboundNumberId;
	}

	public void setPrivateOutboundNumberId(String privateOutboundNumberId) {
		this.privateOutboundNumberId = privateOutboundNumberId;
		if(privateOutboundNumberId != null){
			putQueryParameter("PrivateOutboundNumberId", privateOutboundNumberId);
		}
	}

	public String getLoginName() {
		return this.loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
		if(loginName != null){
			putQueryParameter("LoginName", loginName);
		}
	}

	public List<String> getRoleIds() {
		return this.roleIds;
	}

	public void setRoleIds(List<String> roleIds) {
		this.roleIds = roleIds;	
		if (roleIds != null) {
			for (int i = 0; i < roleIds.size(); i++) {
				putQueryParameter("RoleId." + (i + 1) , roleIds.get(i));
			}
		}	
	}

	public List<Integer> getSkillLevels() {
		return this.skillLevels;
	}

	public void setSkillLevels(List<Integer> skillLevels) {
		this.skillLevels = skillLevels;	
		if (skillLevels != null) {
			for (int i = 0; i < skillLevels.size(); i++) {
				putQueryParameter("SkillLevel." + (i + 1) , skillLevels.get(i));
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

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
		if(phone != null){
			putQueryParameter("Phone", phone);
		}
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
		if(displayName != null){
			putQueryParameter("DisplayName", displayName);
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

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
		if(email != null){
			putQueryParameter("Email", email);
		}
	}

	@Override
	public Class<CreateUserResponse> getResponseClass() {
		return CreateUserResponse.class;
	}

}
