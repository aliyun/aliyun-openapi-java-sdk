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
public class UpdateFileRequest extends RoaAcsRequest<UpdateFileResponse> {
	   

	private String organizationId;

	private String repositoryId;

	private String accessToken;

	@SerializedName("body")
	private Body body;
	public UpdateFileRequest() {
		super("devops", "2021-06-25", "UpdateFile");
		setUriPattern("/repository/[repositoryId]/files/update");
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

	public String getRepositoryId() {
		return this.repositoryId;
	}

	public void setRepositoryId(String repositoryId) {
		this.repositoryId = repositoryId;
		if(repositoryId != null){
			putPathParameter("repositoryId", repositoryId);
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

		@SerializedName("oldPath")
		private String oldPath;

		@SerializedName("encoding")
		private String encoding;

		@SerializedName("commitMessage")
		private String commitMessage;

		@SerializedName("newPath")
		private String newPath;

		@SerializedName("content")
		private String content;

		@SerializedName("branchName")
		private String branchName;

		public String getOldPath() {
			return this.oldPath;
		}

		public void setOldPath(String oldPath) {
			this.oldPath = oldPath;
		}

		public String getEncoding() {
			return this.encoding;
		}

		public void setEncoding(String encoding) {
			this.encoding = encoding;
		}

		public String getCommitMessage() {
			return this.commitMessage;
		}

		public void setCommitMessage(String commitMessage) {
			this.commitMessage = commitMessage;
		}

		public String getNewPath() {
			return this.newPath;
		}

		public void setNewPath(String newPath) {
			this.newPath = newPath;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getBranchName() {
			return this.branchName;
		}

		public void setBranchName(String branchName) {
			this.branchName = branchName;
		}
	}

	@Override
	public Class<UpdateFileResponse> getResponseClass() {
		return UpdateFileResponse.class;
	}

}
