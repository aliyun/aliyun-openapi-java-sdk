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
public class CreateRepositoryRequest extends RoaAcsRequest<CreateRepositoryResponse> {
	   

	private String organizationId;

	private String accessToken;

	@SerializedName("body")
	private Body body;

	private Boolean sync;

	private Boolean createParentPath;
	public CreateRepositoryRequest() {
		super("devops", "2021-06-25", "CreateRepository");
		setUriPattern("/repository/create");
		setMethod(MethodType.POST);
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

	public Boolean getSync() {
		return this.sync;
	}

	public void setSync(Boolean sync) {
		this.sync = sync;
		if(sync != null){
			putQueryParameter("sync", sync.toString());
		}
	}

	public Boolean getCreateParentPath() {
		return this.createParentPath;
	}

	public void setCreateParentPath(Boolean createParentPath) {
		this.createParentPath = createParentPath;
		if(createParentPath != null){
			putQueryParameter("createParentPath", createParentPath.toString());
		}
	}

	public static class Body {

		@SerializedName("importToken")
		private String importToken;

		@SerializedName("importTokenEncrypted")
		private String importTokenEncrypted;

		@SerializedName("isCryptoEnabled")
		private Boolean isCryptoEnabled;

		@SerializedName("avatarUrl")
		private String avatarUrl;

		@SerializedName("description")
		private String description;

		@SerializedName("path")
		private String path;

		@SerializedName("readmeType")
		private String readmeType;

		@SerializedName("importAccount")
		private String importAccount;

		@SerializedName("initStandardService")
		private Boolean initStandardService;

		@SerializedName("namespaceId")
		private Long namespaceId;

		@SerializedName("localImportUrl")
		private String localImportUrl;

		@SerializedName("importRepoType")
		private String importRepoType;

		@SerializedName("name")
		private String name;

		@SerializedName("importUrl")
		private String importUrl;

		@SerializedName("visibilityLevel")
		private Integer visibilityLevel;

		@SerializedName("importDemoProject")
		private Boolean importDemoProject;

		@SerializedName("gitignoreType")
		private String gitignoreType;

		public String getImportToken() {
			return this.importToken;
		}

		public void setImportToken(String importToken) {
			this.importToken = importToken;
		}

		public String getImportTokenEncrypted() {
			return this.importTokenEncrypted;
		}

		public void setImportTokenEncrypted(String importTokenEncrypted) {
			this.importTokenEncrypted = importTokenEncrypted;
		}

		public Boolean getIsCryptoEnabled() {
			return this.isCryptoEnabled;
		}

		public void setIsCryptoEnabled(Boolean isCryptoEnabled) {
			this.isCryptoEnabled = isCryptoEnabled;
		}

		public String getAvatarUrl() {
			return this.avatarUrl;
		}

		public void setAvatarUrl(String avatarUrl) {
			this.avatarUrl = avatarUrl;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getPath() {
			return this.path;
		}

		public void setPath(String path) {
			this.path = path;
		}

		public String getReadmeType() {
			return this.readmeType;
		}

		public void setReadmeType(String readmeType) {
			this.readmeType = readmeType;
		}

		public String getImportAccount() {
			return this.importAccount;
		}

		public void setImportAccount(String importAccount) {
			this.importAccount = importAccount;
		}

		public Boolean getInitStandardService() {
			return this.initStandardService;
		}

		public void setInitStandardService(Boolean initStandardService) {
			this.initStandardService = initStandardService;
		}

		public Long getNamespaceId() {
			return this.namespaceId;
		}

		public void setNamespaceId(Long namespaceId) {
			this.namespaceId = namespaceId;
		}

		public String getLocalImportUrl() {
			return this.localImportUrl;
		}

		public void setLocalImportUrl(String localImportUrl) {
			this.localImportUrl = localImportUrl;
		}

		public String getImportRepoType() {
			return this.importRepoType;
		}

		public void setImportRepoType(String importRepoType) {
			this.importRepoType = importRepoType;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getImportUrl() {
			return this.importUrl;
		}

		public void setImportUrl(String importUrl) {
			this.importUrl = importUrl;
		}

		public Integer getVisibilityLevel() {
			return this.visibilityLevel;
		}

		public void setVisibilityLevel(Integer visibilityLevel) {
			this.visibilityLevel = visibilityLevel;
		}

		public Boolean getImportDemoProject() {
			return this.importDemoProject;
		}

		public void setImportDemoProject(Boolean importDemoProject) {
			this.importDemoProject = importDemoProject;
		}

		public String getGitignoreType() {
			return this.gitignoreType;
		}

		public void setGitignoreType(String gitignoreType) {
			this.gitignoreType = gitignoreType;
		}
	}

	@Override
	public Class<CreateRepositoryResponse> getResponseClass() {
		return CreateRepositoryResponse.class;
	}

}
