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
public class DeleteResourceMemberRequest extends RoaAcsRequest<DeleteResourceMemberResponse> {
	   

	private Long resourceId;

	private String resourceType;

	private String organizationId;

	private String accountId;
	public DeleteResourceMemberRequest() {
		super("devops", "2021-06-25", "DeleteResourceMember");
		setUriPattern("/organization/[organizationId]/[resourceType]/[resourceId]/members/[accountId]");
		setMethod(MethodType.DELETE);
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
			putPathParameter("accountId", accountId);
		}
	}

	@Override
	public Class<DeleteResourceMemberResponse> getResponseClass() {
		return DeleteResourceMemberResponse.class;
	}

}
