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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.devops.transform.v20210625.ListUserResourcesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListUserResourcesResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorMessage;

	private String errorCode;

	private Long total;

	private List<ResultItem> result;

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

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private List<Group_infos> groupInfos;

		private List<Repository_infos> repositoryInfos;

		private UserInfo userInfo;

		public List<Group_infos> getGroupInfos() {
			return this.groupInfos;
		}

		public void setGroupInfos(List<Group_infos> groupInfos) {
			this.groupInfos = groupInfos;
		}

		public List<Repository_infos> getRepositoryInfos() {
			return this.repositoryInfos;
		}

		public void setRepositoryInfos(List<Repository_infos> repositoryInfos) {
			this.repositoryInfos = repositoryInfos;
		}

		public UserInfo getUserInfo() {
			return this.userInfo;
		}

		public void setUserInfo(UserInfo userInfo) {
			this.userInfo = userInfo;
		}

		public static class Group_infos {

			private GroupInfo groupInfo;

			private GroupRole groupRole;

			public GroupInfo getGroupInfo() {
				return this.groupInfo;
			}

			public void setGroupInfo(GroupInfo groupInfo) {
				this.groupInfo = groupInfo;
			}

			public GroupRole getGroupRole() {
				return this.groupRole;
			}

			public void setGroupRole(GroupRole groupRole) {
				this.groupRole = groupRole;
			}

			public static class GroupInfo {

				private Long id;

				private String name;

				private String path;

				private String nameWithNamespace;

				private String pathWithNamespace;

				private Long parentId;

				private Long ownerId;

				private String createdAt;

				private String updatedAt;

				private Integer visibilityLevel;

				private String description;

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

				public String getNameWithNamespace() {
					return this.nameWithNamespace;
				}

				public void setNameWithNamespace(String nameWithNamespace) {
					this.nameWithNamespace = nameWithNamespace;
				}

				public String getPathWithNamespace() {
					return this.pathWithNamespace;
				}

				public void setPathWithNamespace(String pathWithNamespace) {
					this.pathWithNamespace = pathWithNamespace;
				}

				public Long getParentId() {
					return this.parentId;
				}

				public void setParentId(Long parentId) {
					this.parentId = parentId;
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

				public Integer getVisibilityLevel() {
					return this.visibilityLevel;
				}

				public void setVisibilityLevel(Integer visibilityLevel) {
					this.visibilityLevel = visibilityLevel;
				}

				public String getDescription() {
					return this.description;
				}

				public void setDescription(String description) {
					this.description = description;
				}
			}

			public static class GroupRole {

				private Long sourceId;

				private String sourceType;

				private Integer accessLevel;

				private String cnRoleName;

				private String enRoleName;

				public Long getSourceId() {
					return this.sourceId;
				}

				public void setSourceId(Long sourceId) {
					this.sourceId = sourceId;
				}

				public String getSourceType() {
					return this.sourceType;
				}

				public void setSourceType(String sourceType) {
					this.sourceType = sourceType;
				}

				public Integer getAccessLevel() {
					return this.accessLevel;
				}

				public void setAccessLevel(Integer accessLevel) {
					this.accessLevel = accessLevel;
				}

				public String getCnRoleName() {
					return this.cnRoleName;
				}

				public void setCnRoleName(String cnRoleName) {
					this.cnRoleName = cnRoleName;
				}

				public String getEnRoleName() {
					return this.enRoleName;
				}

				public void setEnRoleName(String enRoleName) {
					this.enRoleName = enRoleName;
				}
			}
		}

		public static class Repository_infos {

			private RepositoryInfo repositoryInfo;

			private RepositoryRole repositoryRole;

			public RepositoryInfo getRepositoryInfo() {
				return this.repositoryInfo;
			}

			public void setRepositoryInfo(RepositoryInfo repositoryInfo) {
				this.repositoryInfo = repositoryInfo;
			}

			public RepositoryRole getRepositoryRole() {
				return this.repositoryRole;
			}

			public void setRepositoryRole(RepositoryRole repositoryRole) {
				this.repositoryRole = repositoryRole;
			}

			public static class RepositoryInfo {

				private Long id;

				private String name;

				private String path;

				private String description;

				private String nameWithNamespace;

				private String pathWithNamespace;

				private Integer visibilityLevel;

				private String lastActivityAt;

				private Long namespaceId;

				private Integer accessLevel;

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

				public String getDescription() {
					return this.description;
				}

				public void setDescription(String description) {
					this.description = description;
				}

				public String getNameWithNamespace() {
					return this.nameWithNamespace;
				}

				public void setNameWithNamespace(String nameWithNamespace) {
					this.nameWithNamespace = nameWithNamespace;
				}

				public String getPathWithNamespace() {
					return this.pathWithNamespace;
				}

				public void setPathWithNamespace(String pathWithNamespace) {
					this.pathWithNamespace = pathWithNamespace;
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

			public static class RepositoryRole {

				private Long sourceId;

				private String sourceType;

				private Integer accessLevel;

				private String cnRoleName;

				private String enRoleName;

				public Long getSourceId() {
					return this.sourceId;
				}

				public void setSourceId(Long sourceId) {
					this.sourceId = sourceId;
				}

				public String getSourceType() {
					return this.sourceType;
				}

				public void setSourceType(String sourceType) {
					this.sourceType = sourceType;
				}

				public Integer getAccessLevel() {
					return this.accessLevel;
				}

				public void setAccessLevel(Integer accessLevel) {
					this.accessLevel = accessLevel;
				}

				public String getCnRoleName() {
					return this.cnRoleName;
				}

				public void setCnRoleName(String cnRoleName) {
					this.cnRoleName = cnRoleName;
				}

				public String getEnRoleName() {
					return this.enRoleName;
				}

				public void setEnRoleName(String enRoleName) {
					this.enRoleName = enRoleName;
				}
			}
		}

		public static class UserInfo {

			private Long id;

			private String name;

			private String username;

			private String state;

			private String avatarUrl;

			private String email;

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

			public String getUsername() {
				return this.username;
			}

			public void setUsername(String username) {
				this.username = username;
			}

			public String getState() {
				return this.state;
			}

			public void setState(String state) {
				this.state = state;
			}

			public String getAvatarUrl() {
				return this.avatarUrl;
			}

			public void setAvatarUrl(String avatarUrl) {
				this.avatarUrl = avatarUrl;
			}

			public String getEmail() {
				return this.email;
			}

			public void setEmail(String email) {
				this.email = email;
			}
		}
	}

	@Override
	public ListUserResourcesResponse getInstance(UnmarshallerContext context) {
		return	ListUserResourcesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
