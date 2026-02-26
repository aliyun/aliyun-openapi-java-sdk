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
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateProjectMemberRequest extends RoaAcsRequest<UpdateProjectMemberResponse> {
	   

	@SerializedName("body")
	private Body body;

	private String organizationId;

	private String projectId;
	public UpdateProjectMemberRequest() {
		super("devops", "2021-06-25", "UpdateProjectMember");
		setUriPattern("/organization/[organizationId]/projects/[projectId]/updateMember");
		setMethod(MethodType.POST);
	}

	public Body getBody() {
		return this.body;
	}

	public void setBody(Body body) {
		this.body = body;	
		if (body != null) {
			putBodyParameter("body" , new Gson().toJson(body));
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

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putPathParameter("projectId", projectId);
		}
	}

	public static class Body {

		@SerializedName("targetType")
		private String targetType;

		@SerializedName("roleIdentifier")
		private String roleIdentifier;

		@SerializedName("userType")
		private String userType;

		@SerializedName("userIdentifier")
		private String userIdentifier;

		@SerializedName("targetIdentifier")
		private String targetIdentifier;

		public String getTargetType() {
			return this.targetType;
		}

		public void setTargetType(String targetType) {
			this.targetType = targetType;
		}

		public String getRoleIdentifier() {
			return this.roleIdentifier;
		}

		public void setRoleIdentifier(String roleIdentifier) {
			this.roleIdentifier = roleIdentifier;
		}

		public String getUserType() {
			return this.userType;
		}

		public void setUserType(String userType) {
			this.userType = userType;
		}

		public String getUserIdentifier() {
			return this.userIdentifier;
		}

		public void setUserIdentifier(String userIdentifier) {
			this.userIdentifier = userIdentifier;
		}

		public String getTargetIdentifier() {
			return this.targetIdentifier;
		}

		public void setTargetIdentifier(String targetIdentifier) {
			this.targetIdentifier = targetIdentifier;
		}
	}

	@Override
	public Class<UpdateProjectMemberResponse> getResponseClass() {
		return UpdateProjectMemberResponse.class;
	}

}
