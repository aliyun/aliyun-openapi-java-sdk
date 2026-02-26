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
public class CreateMergeRequestRequest extends RoaAcsRequest<CreateMergeRequestResponse> {
	   

	private String organizationId;

	private Long repositoryId;

	private String accessToken;

	@SerializedName("body")
	private Body body;
	public CreateMergeRequestRequest() {
		super("devops", "2021-06-25", "CreateMergeRequest");
		setUriPattern("/api/v4/projects/[repositoryId]/merge_requests");
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

		@SerializedName("targetProjectId")
		private Long targetProjectId;

		@SerializedName("reviewerIds")
		private List<String> reviewerIds;

		@SerializedName("createFrom")
		private String createFrom;

		@SerializedName("sourceProjectId")
		private Long sourceProjectId;

		@SerializedName("sourceBranch")
		private String sourceBranch;

		@SerializedName("workItemIds")
		private String workItemIds;

		@SerializedName("description")
		private String description;

		@SerializedName("title")
		private String title;

		@SerializedName("targetBranch")
		private String targetBranch;

		public Long getTargetProjectId() {
			return this.targetProjectId;
		}

		public void setTargetProjectId(Long targetProjectId) {
			this.targetProjectId = targetProjectId;
		}

		public List<String> getReviewerIds() {
			return this.reviewerIds;
		}

		public void setReviewerIds(List<String> reviewerIds) {
			this.reviewerIds = reviewerIds;
		}

		public String getCreateFrom() {
			return this.createFrom;
		}

		public void setCreateFrom(String createFrom) {
			this.createFrom = createFrom;
		}

		public Long getSourceProjectId() {
			return this.sourceProjectId;
		}

		public void setSourceProjectId(Long sourceProjectId) {
			this.sourceProjectId = sourceProjectId;
		}

		public String getSourceBranch() {
			return this.sourceBranch;
		}

		public void setSourceBranch(String sourceBranch) {
			this.sourceBranch = sourceBranch;
		}

		public String getWorkItemIds() {
			return this.workItemIds;
		}

		public void setWorkItemIds(String workItemIds) {
			this.workItemIds = workItemIds;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getTargetBranch() {
			return this.targetBranch;
		}

		public void setTargetBranch(String targetBranch) {
			this.targetBranch = targetBranch;
		}
	}

	@Override
	public Class<CreateMergeRequestResponse> getResponseClass() {
		return CreateMergeRequestResponse.class;
	}

}
