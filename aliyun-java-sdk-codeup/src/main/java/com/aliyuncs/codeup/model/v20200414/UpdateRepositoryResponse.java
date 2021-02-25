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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.codeup.transform.v20200414.UpdateRepositoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateRepositoryResponse extends AcsResponse {

	private String errorCode;

	private String errorMessage;

	private String requestId;

	private Boolean success;

	private Result result;

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

		private Boolean archive;

		private String avatarUrl;

		private String createdAt;

		private Long creatorId;

		private String defaultBranch;

		private String description;

		private String httpUrlToRepo;

		private Long id;

		private String lastActivityAt;

		private String name;

		private String nameWithNamespace;

		private String path;

		private String pathWithNamespace;

		private String sshUrlToRepo;

		private String visibilityLevel;

		private String webUrl;

		private Namespace namespace;

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

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public Long getCreatorId() {
			return this.creatorId;
		}

		public void setCreatorId(Long creatorId) {
			this.creatorId = creatorId;
		}

		public String getDefaultBranch() {
			return this.defaultBranch;
		}

		public void setDefaultBranch(String defaultBranch) {
			this.defaultBranch = defaultBranch;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getHttpUrlToRepo() {
			return this.httpUrlToRepo;
		}

		public void setHttpUrlToRepo(String httpUrlToRepo) {
			this.httpUrlToRepo = httpUrlToRepo;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getLastActivityAt() {
			return this.lastActivityAt;
		}

		public void setLastActivityAt(String lastActivityAt) {
			this.lastActivityAt = lastActivityAt;
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

		public String getSshUrlToRepo() {
			return this.sshUrlToRepo;
		}

		public void setSshUrlToRepo(String sshUrlToRepo) {
			this.sshUrlToRepo = sshUrlToRepo;
		}

		public String getVisibilityLevel() {
			return this.visibilityLevel;
		}

		public void setVisibilityLevel(String visibilityLevel) {
			this.visibilityLevel = visibilityLevel;
		}

		public String getWebUrl() {
			return this.webUrl;
		}

		public void setWebUrl(String webUrl) {
			this.webUrl = webUrl;
		}

		public Namespace getNamespace() {
			return this.namespace;
		}

		public void setNamespace(Namespace namespace) {
			this.namespace = namespace;
		}

		public static class Namespace {

			private String avatar;

			private String createdAt;

			private String description;

			private Long id;

			private String name;

			private Long ownerId;

			private String path;

			private Boolean _public;

			private String updatedAt;

			private String visibilityLevel;

			public String getAvatar() {
				return this.avatar;
			}

			public void setAvatar(String avatar) {
				this.avatar = avatar;
			}

			public String getCreatedAt() {
				return this.createdAt;
			}

			public void setCreatedAt(String createdAt) {
				this.createdAt = createdAt;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

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

			public Long getOwnerId() {
				return this.ownerId;
			}

			public void setOwnerId(Long ownerId) {
				this.ownerId = ownerId;
			}

			public String getPath() {
				return this.path;
			}

			public void setPath(String path) {
				this.path = path;
			}

			public Boolean get_Public() {
				return this._public;
			}

			public void set_Public(Boolean _public) {
				this._public = _public;
			}

			public String getUpdatedAt() {
				return this.updatedAt;
			}

			public void setUpdatedAt(String updatedAt) {
				this.updatedAt = updatedAt;
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
	public UpdateRepositoryResponse getInstance(UnmarshallerContext context) {
		return	UpdateRepositoryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
