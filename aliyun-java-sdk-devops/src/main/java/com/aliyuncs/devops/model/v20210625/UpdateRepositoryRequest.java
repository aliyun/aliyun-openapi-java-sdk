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
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateRepositoryRequest extends RoaAcsRequest<UpdateRepositoryResponse> {
	   

	private String organizationId;

	private Long repositoryId;

	private String accessToken;

	@SerializedName("body")
	private Body body;
	public UpdateRepositoryRequest() {
		super("devops", "2021-06-25", "UpdateRepository");
		setUriPattern("/repository/[repositoryId]");
		setMethod(MethodType.PUT);
	}

	public String getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
		if(organizationId != null){
			putQueryParameter("organizationId", organizationId);
		}
	}

	public Long getRepositoryId() {
		return this.repositoryId;
	}

	public void setRepositoryId(Long repositoryId) {
		this.repositoryId = repositoryId;
		if(repositoryId != null){
			putPathParameter("repositoryId", repositoryId.toString());
		}
	}

	public String getAccessToken() {
		return this.accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
		if(accessToken != null){
			putQueryParameter("accessToken", accessToken);
		}
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

	public static class Body {

		@SerializedName("wikiEnabled")
		private Boolean wikiEnabled;

		@SerializedName("projectCloneDownloadRoleList")
		private List<ProjectCloneDownloadRoleListItem> projectCloneDownloadRoleList;

		@SerializedName("adminSettingLanguage")
		private String adminSettingLanguage;

		@SerializedName("buildsEnabled")
		private Boolean buildsEnabled;

		@SerializedName("description")
		private String description;

		@SerializedName("issuesEnabled")
		private Boolean issuesEnabled;

		@SerializedName("avatar")
		private String avatar;

		@SerializedName("openCloneDownloadControl")
		private Boolean openCloneDownloadControl;

		@SerializedName("mergeRequestsEnabled")
		private Boolean mergeRequestsEnabled;

		@SerializedName("path")
		private String path;

		@SerializedName("name")
		private String name;

		@SerializedName("checkEmail")
		private Boolean checkEmail;

		@SerializedName("projectCloneDownloadMethodList")
		private List<ProjectCloneDownloadMethodListItem> projectCloneDownloadMethodList;

		@SerializedName("visibilityLevel")
		private Integer visibilityLevel;

		@SerializedName("id")
		private Long id;

		@SerializedName("defaultBranch")
		private String defaultBranch;

		@SerializedName("snippetsEnabled")
		private Boolean snippetsEnabled;

		public Boolean getWikiEnabled() {
			return this.wikiEnabled;
		}

		public void setWikiEnabled(Boolean wikiEnabled) {
			this.wikiEnabled = wikiEnabled;
		}

		public List<ProjectCloneDownloadRoleListItem> getProjectCloneDownloadRoleList() {
			return this.projectCloneDownloadRoleList;
		}

		public void setProjectCloneDownloadRoleList(List<ProjectCloneDownloadRoleListItem> projectCloneDownloadRoleList) {
			this.projectCloneDownloadRoleList = projectCloneDownloadRoleList;
		}

		public String getAdminSettingLanguage() {
			return this.adminSettingLanguage;
		}

		public void setAdminSettingLanguage(String adminSettingLanguage) {
			this.adminSettingLanguage = adminSettingLanguage;
		}

		public Boolean getBuildsEnabled() {
			return this.buildsEnabled;
		}

		public void setBuildsEnabled(Boolean buildsEnabled) {
			this.buildsEnabled = buildsEnabled;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Boolean getIssuesEnabled() {
			return this.issuesEnabled;
		}

		public void setIssuesEnabled(Boolean issuesEnabled) {
			this.issuesEnabled = issuesEnabled;
		}

		public String getAvatar() {
			return this.avatar;
		}

		public void setAvatar(String avatar) {
			this.avatar = avatar;
		}

		public Boolean getOpenCloneDownloadControl() {
			return this.openCloneDownloadControl;
		}

		public void setOpenCloneDownloadControl(Boolean openCloneDownloadControl) {
			this.openCloneDownloadControl = openCloneDownloadControl;
		}

		public Boolean getMergeRequestsEnabled() {
			return this.mergeRequestsEnabled;
		}

		public void setMergeRequestsEnabled(Boolean mergeRequestsEnabled) {
			this.mergeRequestsEnabled = mergeRequestsEnabled;
		}

		public String getPath() {
			return this.path;
		}

		public void setPath(String path) {
			this.path = path;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Boolean getCheckEmail() {
			return this.checkEmail;
		}

		public void setCheckEmail(Boolean checkEmail) {
			this.checkEmail = checkEmail;
		}

		public List<ProjectCloneDownloadMethodListItem> getProjectCloneDownloadMethodList() {
			return this.projectCloneDownloadMethodList;
		}

		public void setProjectCloneDownloadMethodList(List<ProjectCloneDownloadMethodListItem> projectCloneDownloadMethodList) {
			this.projectCloneDownloadMethodList = projectCloneDownloadMethodList;
		}

		public Integer getVisibilityLevel() {
			return this.visibilityLevel;
		}

		public void setVisibilityLevel(Integer visibilityLevel) {
			this.visibilityLevel = visibilityLevel;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getDefaultBranch() {
			return this.defaultBranch;
		}

		public void setDefaultBranch(String defaultBranch) {
			this.defaultBranch = defaultBranch;
		}

		public Boolean getSnippetsEnabled() {
			return this.snippetsEnabled;
		}

		public void setSnippetsEnabled(Boolean snippetsEnabled) {
			this.snippetsEnabled = snippetsEnabled;
		}

		public static class ProjectCloneDownloadRoleListItem {

			@SerializedName("roleCode")
			private Integer roleCode;

			@SerializedName("allowed")
			private Boolean allowed;

			public Integer getRoleCode() {
				return this.roleCode;
			}

			public void setRoleCode(Integer roleCode) {
				this.roleCode = roleCode;
			}

			public Boolean getAllowed() {
				return this.allowed;
			}

			public void setAllowed(Boolean allowed) {
				this.allowed = allowed;
			}
		}

		public static class ProjectCloneDownloadMethodListItem {

			@SerializedName("permissionCode")
			private String permissionCode;

			@SerializedName("allowed")
			private Boolean allowed;

			public String getPermissionCode() {
				return this.permissionCode;
			}

			public void setPermissionCode(String permissionCode) {
				this.permissionCode = permissionCode;
			}

			public Boolean getAllowed() {
				return this.allowed;
			}

			public void setAllowed(Boolean allowed) {
				this.allowed = allowed;
			}
		}
	}

	@Override
	public Class<UpdateRepositoryResponse> getResponseClass() {
		return UpdateRepositoryResponse.class;
	}

}
