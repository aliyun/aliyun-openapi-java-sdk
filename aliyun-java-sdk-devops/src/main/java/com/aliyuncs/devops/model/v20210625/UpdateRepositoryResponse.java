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
import com.aliyuncs.devops.transform.v20210625.UpdateRepositoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateRepositoryResponse extends AcsResponse {

	private String requestId;

	private String errorMessage;

	private String errorCode;

	private Boolean success;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
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

		private String name;

		private String nameWithNamespace;

		private String path;

		private String pathWithNamespace;

		private String description;

		private String defaultBranch;

		private Integer visibilityLevel;

		private String sshUrlToRepo;

		private String httpUrlToRepo;

		private String webUrl;

		private Boolean issuesEnabled;

		private Boolean mergeRequestsEnabled;

		private Boolean buildsEnabled;

		private Boolean wikiEnabled;

		private Boolean snippetsEnabled;

		private String createdAt;

		private String lastActivityAt;

		private Long creatorId;

		private Boolean archived;

		private String avatarUrl;

		private Namespace namespace;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getNameWithNamespace() {
			return this.nameWithNamespace;
		}

		public void setNameWithNamespace(String nameWithNamespace) {
			this.nameWithNamespace = nameWithNamespace;
		}

		public String getPath() {
			return this.path;
		}

		public void setPath(String path) {
			this.path = path;
		}

		public String getPathWithNamespace() {
			return this.pathWithNamespace;
		}

		public void setPathWithNamespace(String pathWithNamespace) {
			this.pathWithNamespace = pathWithNamespace;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getDefaultBranch() {
			return this.defaultBranch;
		}

		public void setDefaultBranch(String defaultBranch) {
			this.defaultBranch = defaultBranch;
		}

		public Integer getVisibilityLevel() {
			return this.visibilityLevel;
		}

		public void setVisibilityLevel(Integer visibilityLevel) {
			this.visibilityLevel = visibilityLevel;
		}

		public String getSshUrlToRepo() {
			return this.sshUrlToRepo;
		}

		public void setSshUrlToRepo(String sshUrlToRepo) {
			this.sshUrlToRepo = sshUrlToRepo;
		}

		public String getHttpUrlToRepo() {
			return this.httpUrlToRepo;
		}

		public void setHttpUrlToRepo(String httpUrlToRepo) {
			this.httpUrlToRepo = httpUrlToRepo;
		}

		public String getWebUrl() {
			return this.webUrl;
		}

		public void setWebUrl(String webUrl) {
			this.webUrl = webUrl;
		}

		public Boolean getIssuesEnabled() {
			return this.issuesEnabled;
		}

		public void setIssuesEnabled(Boolean issuesEnabled) {
			this.issuesEnabled = issuesEnabled;
		}

		public Boolean getMergeRequestsEnabled() {
			return this.mergeRequestsEnabled;
		}

		public void setMergeRequestsEnabled(Boolean mergeRequestsEnabled) {
			this.mergeRequestsEnabled = mergeRequestsEnabled;
		}

		public Boolean getBuildsEnabled() {
			return this.buildsEnabled;
		}

		public void setBuildsEnabled(Boolean buildsEnabled) {
			this.buildsEnabled = buildsEnabled;
		}

		public Boolean getWikiEnabled() {
			return this.wikiEnabled;
		}

		public void setWikiEnabled(Boolean wikiEnabled) {
			this.wikiEnabled = wikiEnabled;
		}

		public Boolean getSnippetsEnabled() {
			return this.snippetsEnabled;
		}

		public void setSnippetsEnabled(Boolean snippetsEnabled) {
			this.snippetsEnabled = snippetsEnabled;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getLastActivityAt() {
			return this.lastActivityAt;
		}

		public void setLastActivityAt(String lastActivityAt) {
			this.lastActivityAt = lastActivityAt;
		}

		public Long getCreatorId() {
			return this.creatorId;
		}

		public void setCreatorId(Long creatorId) {
			this.creatorId = creatorId;
		}

		public Boolean getArchived() {
			return this.archived;
		}

		public void setArchived(Boolean archived) {
			this.archived = archived;
		}

		public String getAvatarUrl() {
			return this.avatarUrl;
		}

		public void setAvatarUrl(String avatarUrl) {
			this.avatarUrl = avatarUrl;
		}

		public Namespace getNamespace() {
			return this.namespace;
		}

		public void setNamespace(Namespace namespace) {
			this.namespace = namespace;
		}

		public static class Namespace {

			private Long id;

			private String name;

			private String path;

			private Long ownerId;

			private String createdAt;

			private String updatedAt;

			private String description;

			private String avatar;

			private Integer visibilityLevel;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getPath() {
				return this.path;
			}

			public void setPath(String path) {
				this.path = path;
			}

			public Long getOwnerId() {
				return this.ownerId;
			}

			public void setOwnerId(Long ownerId) {
				this.ownerId = ownerId;
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

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getAvatar() {
				return this.avatar;
			}

			public void setAvatar(String avatar) {
				this.avatar = avatar;
			}

			public Integer getVisibilityLevel() {
				return this.visibilityLevel;
			}

			public void setVisibilityLevel(Integer visibilityLevel) {
				this.visibilityLevel = visibilityLevel;
			}
		}
	}

	@Override
	public UpdateRepositoryResponse getInstance(UnmarshallerContext context) {
		return	UpdateRepositoryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
