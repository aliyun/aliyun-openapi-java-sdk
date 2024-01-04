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
import com.aliyuncs.devops.transform.v20210625.ListMergeRequestsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMergeRequestsResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private Long total;

	private List<ResultItem> result;

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

		private Boolean newMergeRequestIdentifier;

		private Long projectId;

		private Long id;

		private Long iid;

		private String mrBizId;

		private Long localId;

		private String title;

		private String description;

		private String state;

		private String newVersionState;

		private String createdAt;

		private String updatedAt;

		private String sourceBranch;

		private String targetBranch;

		private Long sourceProjectId;

		private Long targetProjectId;

		private Boolean workInProgress;

		private String detailUrl;

		private String webUrl;

		private String sshUrl;

		private String creationMethod;

		private String sourceType;

		private String targetType;

		private String nameWithNamespace;

		private Boolean supportMergeFFOnly;

		private List<Assignees> reviewers;

		private List<SubscribersItem> subscribers;

		private Author author;

		public Boolean getNewMergeRequestIdentifier() {
			return this.newMergeRequestIdentifier;
		}

		public void setNewMergeRequestIdentifier(Boolean newMergeRequestIdentifier) {
			this.newMergeRequestIdentifier = newMergeRequestIdentifier;
		}

		public Long getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getIid() {
			return this.iid;
		}

		public void setIid(Long iid) {
			this.iid = iid;
		}

		public String getMrBizId() {
			return this.mrBizId;
		}

		public void setMrBizId(String mrBizId) {
			this.mrBizId = mrBizId;
		}

		public Long getLocalId() {
			return this.localId;
		}

		public void setLocalId(Long localId) {
			this.localId = localId;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
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

		public String getNewVersionState() {
			return this.newVersionState;
		}

		public void setNewVersionState(String newVersionState) {
			this.newVersionState = newVersionState;
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

		public String getSourceBranch() {
			return this.sourceBranch;
		}

		public void setSourceBranch(String sourceBranch) {
			this.sourceBranch = sourceBranch;
		}

		public String getTargetBranch() {
			return this.targetBranch;
		}

		public void setTargetBranch(String targetBranch) {
			this.targetBranch = targetBranch;
		}

		public Long getSourceProjectId() {
			return this.sourceProjectId;
		}

		public void setSourceProjectId(Long sourceProjectId) {
			this.sourceProjectId = sourceProjectId;
		}

		public Long getTargetProjectId() {
			return this.targetProjectId;
		}

		public void setTargetProjectId(Long targetProjectId) {
			this.targetProjectId = targetProjectId;
		}

		public Boolean getWorkInProgress() {
			return this.workInProgress;
		}

		public void setWorkInProgress(Boolean workInProgress) {
			this.workInProgress = workInProgress;
		}

		public String getDetailUrl() {
			return this.detailUrl;
		}

		public void setDetailUrl(String detailUrl) {
			this.detailUrl = detailUrl;
		}

		public String getWebUrl() {
			return this.webUrl;
		}

		public void setWebUrl(String webUrl) {
			this.webUrl = webUrl;
		}

		public String getSshUrl() {
			return this.sshUrl;
		}

		public void setSshUrl(String sshUrl) {
			this.sshUrl = sshUrl;
		}

		public String getCreationMethod() {
			return this.creationMethod;
		}

		public void setCreationMethod(String creationMethod) {
			this.creationMethod = creationMethod;
		}

		public String getSourceType() {
			return this.sourceType;
		}

		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}

		public String getTargetType() {
			return this.targetType;
		}

		public void setTargetType(String targetType) {
			this.targetType = targetType;
		}

		public String getNameWithNamespace() {
			return this.nameWithNamespace;
		}

		public void setNameWithNamespace(String nameWithNamespace) {
			this.nameWithNamespace = nameWithNamespace;
		}

		public Boolean getSupportMergeFFOnly() {
			return this.supportMergeFFOnly;
		}

		public void setSupportMergeFFOnly(Boolean supportMergeFFOnly) {
			this.supportMergeFFOnly = supportMergeFFOnly;
		}

		public List<Assignees> getReviewers() {
			return this.reviewers;
		}

		public void setReviewers(List<Assignees> reviewers) {
			this.reviewers = reviewers;
		}

		public List<SubscribersItem> getSubscribers() {
			return this.subscribers;
		}

		public void setSubscribers(List<SubscribersItem> subscribers) {
			this.subscribers = subscribers;
		}

		public Author getAuthor() {
			return this.author;
		}

		public void setAuthor(Author author) {
			this.author = author;
		}

		public static class Assignees {

			private Long id;

			private String name;

			private String username;

			private String state;

			private String avatarUrl;

			private String email;

			private String status;

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

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}

		public static class SubscribersItem {

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

		public static class Author {

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
	public ListMergeRequestsResponse getInstance(UnmarshallerContext context) {
		return	ListMergeRequestsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
