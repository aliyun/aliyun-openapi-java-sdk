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

package com.aliyuncs.devops.model.v20210625;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateResourceMemberRequest extends RoaAcsRequest<CreateResourceMemberResponse> {
	   

	private Long resourceId;

	private String roleName;

	private String resourceType;

	private String organizationId;

	private String accountId;
	public CreateResourceMemberRequest() {
		super("devops", "2021-06-25", "CreateResourceMember");
		setUriPattern("/organization/[organizationId]/[resourceType]/[resourceId]/members");
		setMethod(MethodType.POST);
	}

	public Long getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(Long resourceId) {
		this.resourceId = resourceId;
		if(resourceId != null){
			putPathParameter("resourceId", resourceId.toString());
		}
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
		if(roleName != null){
			putBodyParameter("roleName", roleName);
		}
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putPathParameter("resourceType", resourceType);
		}
	}

	public String getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
		if(organizationId != null){
			putPathParameter("organizationId", organizationId);
		}
	}

	public String getAccountId() {
		return this.accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
		if(accountId != null){
			putBodyParameter("accountId", accountId);
		}
	}

	@Override
	public Class<CreateResourceMemberResponse> getResponseClass() {
		return CreateResourceMemberResponse.class;
	}

}
