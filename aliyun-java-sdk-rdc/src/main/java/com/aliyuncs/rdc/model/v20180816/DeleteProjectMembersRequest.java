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

package com.aliyuncs.rdc.model.v20180816;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteProjectMembersRequest extends RpcAcsRequest<DeleteProjectMembersResponse> {
	
	public DeleteProjectMembersRequest() {
		super("Rdc", "2018-08-16", "DeleteProjectMembers");
		setMethod(MethodType.POST);
	}

	private String memberStaffIds;

	private String role;

	private String corpIdentifier;

	private String projectId;

	private String staffId;

	public String getMemberStaffIds() {
		return this.memberStaffIds;
	}

	public void setMemberStaffIds(String memberStaffIds) {
		this.memberStaffIds = memberStaffIds;
		if(memberStaffIds != null){
			putBodyParameter("MemberStaffIds", memberStaffIds);
		}
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
		if(role != null){
			putBodyParameter("Role", role);
		}
	}

	public String getCorpIdentifier() {
		return this.corpIdentifier;
	}

	public void setCorpIdentifier(String corpIdentifier) {
		this.corpIdentifier = corpIdentifier;
		if(corpIdentifier != null){
			putQueryParameter("CorpIdentifier", corpIdentifier);
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putBodyParameter("ProjectId", projectId);
		}
	}

	public String getStaffId() {
		return this.staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
		if(staffId != null){
			putBodyParameter("StaffId", staffId);
		}
	}

	@Override
	public Class<DeleteProjectMembersResponse> getResponseClass() {
		return DeleteProjectMembersResponse.class;
	}

}
