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

package com.aliyuncs.codeup.model.v20200414;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.codeup.transform.v20200414.CreateRepositoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateRepositoryResponse extends AcsResponse {

	private Integer errorCode;

	private String errorMessage;

	private String requestId;

	private Boolean success;

	private Result result;

	public Integer getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

		private String sshUrlToRepo;

		private String description;

		private String defaultBranch;

		private Boolean _public;

		private String visibilityLevel;

		private String httpUrlToRepo;

		private String webUrl;

		private String name;

		private String nameWithNamespace;

		private String path;

		private String pathWithNamespace;

		private Boolean issuesEnableStatus;

		private Boolean mergeRequestEnableStatus;

		private Boolean buildsEnableStatus;

		private Boolean wikiEnableStatus;

		private Boolean snippetsEnableStatus;

		private String createdAt;

		private String lastActivityAt;

		private Long creatorId;

		private Boolean archive;

		private String avatarUrl;

		private Boolean demoProjectStatus;

		private List<String> tagList;

		private Namespace namespace;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getSshUrlToRepo() {
			return this.sshUrlToRepo;
		}

		public void setSshUrlToRepo(String sshUrlToRepo) {
			this.sshUrlToRepo = sshUrlToRepo;
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

		public Boolean get_Public() {
			return this._public;
		}

		public void set_Public(Boolean _public) {
			this._public = _public;
		}

		public String getVisibilityLevel() {
			return this.visibilityLevel;
		}

		public void setVisibilityLevel(String visibilityLevel) {
			this.visibilityLevel = visibilityLevel;
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

		public Boolean getIssuesEnableStatus() {
			return this.issuesEnableStatus;
		}

		public void setIssuesEnableStatus(Boolean issuesEnableStatus) {
			this.issuesEnableStatus = issuesEnableStatus;
		}

		public Boolean getMergeRequestEnableStatus() {
			return this.mergeRequestEnableStatus;
		}

		public void setMergeRequestEnableStatus(Boolean mergeRequestEnableStatus) {
			this.mergeRequestEnableStatus = mergeRequestEnableStatus;
		}

		public Boolean getBuildsEnableStatus() {
			return this.buildsEnableStatus;
		}

		public void setBuildsEnableStatus(Boolean buildsEnableStatus) {
			this.buildsEnableStatus = buildsEnableStatus;
		}

		public Boolean getWikiEnableStatus() {
			return this.wikiEnableStatus;
		}

		public void setWikiEnableStatus(Boolean wikiEnableStatus) {
			this.wikiEnableStatus = wikiEnableStatus;
		}

		public Boolean getSnippetsEnableStatus() {
			return this.snippetsEnableStatus;
		}

		public void setSnippetsEnableStatus(Boolean snippetsEnableStatus) {
			this.snippetsEnableStatus = snippetsEnableStatus;
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

		public Boolean getArchive() {
			return this.archive;
		}

		public void setArchive(Boolean archive) {
			this.archive = archive;
		}

		public String getAvatarUrl() {
			return this.avatarUrl;
		}

		public void setAvatarUrl(String avatarUrl) {
			this.avatarUrl = avatarUrl;
		}

		public Boolean getDemoProjectStatus() {
			return this.demoProjectStatus;
		}

		public void setDemoProjectStatus(Boolean demoProjectStatus) {
			this.demoProjectStatus = demoProjectStatus;
		}

		public List<String> getTagList() {
			return this.tagList;
		}

		public void setTagList(List<String> tagList) {
			this.tagList = tagList;
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

			private String state;

			private String avatar;

			private Boolean _public;

			private String visibilityLevel;

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

			public String getState() {
				return this.state;
			}

			public void setState(String state) {
				this.state = state;
			}

			public String getAvatar() {
				return this.avatar;
			}

			public void setAvatar(String avatar) {
				this.avatar = avatar;
			}

			public Boolean get_Public() {
				return this._public;
			}

			public void set_Public(Boolean _public) {
				this._public = _public;
			}

			public String getVisibilityLevel() {
				return this.visibilityLevel;
			}

			public void setVisibilityLevel(String visibilityLevel) {
				this.visibilityLevel = visibilityLevel;
			}
		}
	}

	@Override
	public CreateRepositoryResponse getInstance(UnmarshallerContext context) {
		return	CreateRepositoryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
