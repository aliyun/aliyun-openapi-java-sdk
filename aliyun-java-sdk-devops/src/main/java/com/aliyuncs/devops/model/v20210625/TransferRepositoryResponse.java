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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.devops.transform.v20210625.TransferRepositoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class TransferRepositoryResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Long id;

		private String path;

		private String name;

		private String description;

		private String pathWithNamespace;

		private String nameWithNamespace;

		private Integer visibilityLevel;

		private String lastActivityAt;

		private Long starCount;

		private String webUrl;

		private Boolean starred;

		private Long namespaceId;

		private Integer accessLevel;

		private Boolean demoProject;

		private String createdAt;

		private String updatedAt;

		private Boolean archived;

		private Long creatorId;

		private Boolean encrypted;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
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

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getPathWithNamespace() {
			return this.pathWithNamespace;
		}

		public void setPathWithNamespace(String pathWithNamespace) {
			this.pathWithNamespace = pathWithNamespace;
		}

		public String getNameWithNamespace() {
			return this.nameWithNamespace;
		}

		public void setNameWithNamespace(String nameWithNamespace) {
			this.nameWithNamespace = nameWithNamespace;
		}

		public Integer getVisibilityLevel() {
			return this.visibilityLevel;
		}

		public void setVisibilityLevel(Integer visibilityLevel) {
			this.visibilityLevel = visibilityLevel;
		}

		public String getLastActivityAt() {
			return this.lastActivityAt;
		}

		public void setLastActivityAt(String lastActivityAt) {
			this.lastActivityAt = lastActivityAt;
		}

		public Long getStarCount() {
			return this.starCount;
		}

		public void setStarCount(Long starCount) {
			this.starCount = starCount;
		}

		public String getWebUrl() {
			return this.webUrl;
		}

		public void setWebUrl(String webUrl) {
			this.webUrl = webUrl;
		}

		public Boolean getStarred() {
			return this.starred;
		}

		public void setStarred(Boolean starred) {
			this.starred = starred;
		}

		public Long getNamespaceId() {
			return this.namespaceId;
		}

		public void setNamespaceId(Long namespaceId) {
			this.namespaceId = namespaceId;
		}

		public Integer getAccessLevel() {
			return this.accessLevel;
		}

		public void setAccessLevel(Integer accessLevel) {
			this.accessLevel = accessLevel;
		}

		public Boolean getDemoProject() {
			return this.demoProject;
		}

		public void setDemoProject(Boolean demoProject) {
			this.demoProject = demoProject;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getUpdatedAt() {
			return this.updatedAt;
		}

		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}

		public Boolean getArchived() {
			return this.archived;
		}

		public void setArchived(Boolean archived) {
			this.archived = archived;
		}

		public Long getCreatorId() {
			return this.creatorId;
		}

		public void setCreatorId(Long creatorId) {
			this.creatorId = creatorId;
		}

		public Boolean getEncrypted() {
			return this.encrypted;
		}

		public void setEncrypted(Boolean encrypted) {
			this.encrypted = encrypted;
		}
	}

	@Override
	public TransferRepositoryResponse getInstance(UnmarshallerContext context) {
		return	TransferRepositoryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
