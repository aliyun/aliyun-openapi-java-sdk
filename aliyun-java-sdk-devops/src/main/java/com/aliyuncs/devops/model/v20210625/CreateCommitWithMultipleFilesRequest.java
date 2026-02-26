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
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateCommitWithMultipleFilesRequest extends RoaAcsRequest<CreateCommitWithMultipleFilesResponse> {
	   

	private String organizationId;

	private String repositoryIdentity;

	private String accessToken;

	@SerializedName("body")
	private Body body;
	public CreateCommitWithMultipleFilesRequest() {
		super("devops", "2021-06-25", "CreateCommitWithMultipleFiles");
		setProtocol(ProtocolType.HTTPS);
		setUriPattern("/api/v4/projects/repository/commits/files");
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

	public String getRepositoryIdentity() {
		return this.repositoryIdentity;
	}

	public void setRepositoryIdentity(String repositoryIdentity) {
		this.repositoryIdentity = repositoryIdentity;
		if(repositoryIdentity != null){
			putQueryParameter("repositoryIdentity", repositoryIdentity);
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

		@SerializedName("commitMessage")
		private String commitMessage;

		@SerializedName("branch")
		private String branch;

		@SerializedName("actions")
		private List<ActionsItem> actions;

		public String getCommitMessage() {
			return this.commitMessage;
		}

		public void setCommitMessage(String commitMessage) {
			this.commitMessage = commitMessage;
		}

		public String getBranch() {
			return this.branch;
		}

		public void setBranch(String branch) {
			this.branch = branch;
		}

		public List<ActionsItem> getActions() {
			return this.actions;
		}

		public void setActions(List<ActionsItem> actions) {
			this.actions = actions;
		}

		public static class ActionsItem {

			@SerializedName("filePath")
			private String filePath;

			@SerializedName("action")
			private String action;

			@SerializedName("content")
			private String content;

			@SerializedName("previousPath")
			private String previousPath;

			public String getFilePath() {
				return this.filePath;
			}

			public void setFilePath(String filePath) {
				this.filePath = filePath;
			}

			public String getAction() {
				return this.action;
			}

			public void setAction(String action) {
				this.action = action;
			}

			public String getContent() {
				return this.content;
			}

			public void setContent(String content) {
				this.content = content;
			}

			public String getPreviousPath() {
				return this.previousPath;
			}

			public void setPreviousPath(String previousPath) {
				this.previousPath = previousPath;
			}
		}
	}

	@Override
	public Class<CreateCommitWithMultipleFilesResponse> getResponseClass() {
		return CreateCommitWithMultipleFilesResponse.class;
	}

}
