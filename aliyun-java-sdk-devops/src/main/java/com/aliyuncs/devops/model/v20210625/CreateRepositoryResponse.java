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
import com.aliyuncs.devops.transform.v20210625.CreateRepositoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateRepositoryResponse extends AcsResponse {

	private String errorMessage;

	private String requestId;

	private String errorCode;

	private Boolean success;

	private Result result;

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

		private String description;

		private String defaultBranch;

		private String visibilityLevel;

		private String sshUrlToRepo;

		private String httpUrlToRepo;

		private String webUrl;

		private String name;

		private String nameWithNamespace;

		private String path;

		private String pathWithNamespace;

		private String createdAt;

		private String lastActivityAt;

		private Long creatorId;

		private Boolean archived;

		private String avatar_url;

		private Boolean demoProject;

		private Boolean import_from_svn;

		private Namespace namespace;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
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

		public String getVisibilityLevel() {
			return this.visibilityLevel;
		}

		public void setVisibilityLevel(String visibilityLevel) {
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

		public String getAvatar_url() {
			return this.avatar_url;
		}

		public void setAvatar_url(String avatar_url) {
			this.avatar_url = avatar_url;
		}

		public Boolean getDemoProject() {
			return this.demoProject;
		}

		public void setDemoProject(Boolean demoProject) {
			this.demoProject = demoProject;
		}

		public Boolean getImport_from_svn() {
			return this.import_from_svn;
		}

		public void setImport_from_svn(Boolean import_from_svn) {
			this.import_from_svn = import_from_svn;
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
