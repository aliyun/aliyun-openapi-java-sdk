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

package com.aliyuncs.vcs.model.v20200515;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vcs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateUserGroupRequest extends RpcAcsRequest<CreateUserGroupResponse> {
	   

	private String isvSubId;

	private String corpId;

	private String userGroupName;

	private Long parentUserGroupId;
	public CreateUserGroupRequest() {
		super("Vcs", "2020-05-15", "CreateUserGroup", "vcs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getIsvSubId() {
		return this.isvSubId;
	}

	public void setIsvSubId(String isvSubId) {
		this.isvSubId = isvSubId;
		if(isvSubId != null){
			putBodyParameter("IsvSubId", isvSubId);
		}
	}

	public String getCorpId() {
		return this.corpId;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId;
		if(corpId != null){
			putBodyParameter("CorpId", corpId);
		}
	}

	public String getUserGroupName() {
		return this.userGroupName;
	}

	public void setUserGroupName(String userGroupName) {
		this.userGroupName = userGroupName;
		if(userGroupName != null){
			putBodyParameter("UserGroupName", userGroupName);
		}
	}

	public Long getParentUserGroupId() {
		return this.parentUserGroupId;
	}

	public void setParentUserGroupId(Long parentUserGroupId) {
		this.parentUserGroupId = parentUserGroupId;
		if(parentUserGroupId != null){
			putBodyParameter("ParentUserGroupId", parentUserGroupId.toString());
		}
	}

	@Override
	public Class<CreateUserGroupResponse> getResponseClass() {
		return CreateUserGroupResponse.class;
	}

}
