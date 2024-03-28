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
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateCommentRequest extends RoaAcsRequest<CreateCommentResponse> {
	   

	private String organizationId;

	private String repositoryIdentity;

	private String accessToken;

	@SerializedName("body")
	private Body body;

	private Long localId;
	public CreateCommentRequest() {
		super("devops", "2021-06-25", "CreateComment");
		setProtocol(ProtocolType.HTTPS);
		setUriPattern("/api/v4/projects/code_reviews/comments/create_comment");
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

	public Long getLocalId() {
		return this.localId;
	}

	public void setLocalId(Long localId) {
		this.localId = localId;
		if(localId != null){
			putQueryParameter("localId", localId.toString());
		}
	}

	public static class Body {

		@SerializedName("lineNumber")
		private Integer lineNumber;

		@SerializedName("filePath")
		private String filePath;

		@SerializedName("draft")
		private Boolean draft;

		@SerializedName("patchSetBizId")
		private String patchSetBizId;

		@SerializedName("commentType")
		private String commentType;

		@SerializedName("parentCommentBizId")
		private String parentCommentBizId;

		@SerializedName("content")
		private String content;

		@SerializedName("resolved")
		private Boolean resolved;

		public Integer getLineNumber() {
			return this.lineNumber;
		}

		public void setLineNumber(Integer lineNumber) {
			this.lineNumber = lineNumber;
		}

		public String getFilePath() {
			return this.filePath;
		}

		public void setFilePath(String filePath) {
			this.filePath = filePath;
		}

		public Boolean getDraft() {
			return this.draft;
		}

		public void setDraft(Boolean draft) {
			this.draft = draft;
		}

		public String getPatchSetBizId() {
			return this.patchSetBizId;
		}

		public void setPatchSetBizId(String patchSetBizId) {
			this.patchSetBizId = patchSetBizId;
		}

		public String getCommentType() {
			return this.commentType;
		}

		public void setCommentType(String commentType) {
			this.commentType = commentType;
		}

		public String getParentCommentBizId() {
			return this.parentCommentBizId;
		}

		public void setParentCommentBizId(String parentCommentBizId) {
			this.parentCommentBizId = parentCommentBizId;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public Boolean getResolved() {
			return this.resolved;
		}

		public void setResolved(Boolean resolved) {
			this.resolved = resolved;
		}
	}

	@Override
	public Class<CreateCommentResponse> getResponseClass() {
		return CreateCommentResponse.class;
	}

}
