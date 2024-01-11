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
import com.aliyuncs.devops.transform.v20210625.GetMergeRequestResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMergeRequestResponse extends AcsResponse {

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

		private String mrBizId;

		private Long projectId;

		private Long localId;

		private String createTime;

		private String updateTime;

		private String mrType;

		private Long sourceProjectId;

		private String sourceBranch;

		private Long targetProjectId;

		private String targetBranch;

		private String title;

		private String description;

		private String status;

		private String createFrom;

		private Integer ahead;

		private Integer behind;

		private Boolean allRequirementsPass;

		private Boolean supportMergeFastForwardOnly;

		private String detailUrl;

		private String webUrl;

		private String targetProjectNameWithNamespace;

		private String targetProjectPathWithNamespace;

		private List<ReviewersItem> reviewers;

		private List<SubscribersItem> subscribers;

		private Author author;

		private TodoList todoList;

		public String getMrBizId() {
			return this.mrBizId;
		}

		public void setMrBizId(String mrBizId) {
			this.mrBizId = mrBizId;
		}

		public Long getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}

		public Long getLocalId() {
			return this.localId;
		}

		public void setLocalId(Long localId) {
			this.localId = localId;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public String getMrType() {
			return this.mrType;
		}

		public void setMrType(String mrType) {
			this.mrType = mrType;
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

		public Long getTargetProjectId() {
			return this.targetProjectId;
		}

		public void setTargetProjectId(Long targetProjectId) {
			this.targetProjectId = targetProjectId;
		}

		public String getTargetBranch() {
			return this.targetBranch;
		}

		public void setTargetBranch(String targetBranch) {
			this.targetBranch = targetBranch;
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

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCreateFrom() {
			return this.createFrom;
		}

		public void setCreateFrom(String createFrom) {
			this.createFrom = createFrom;
		}

		public Integer getAhead() {
			return this.ahead;
		}

		public void setAhead(Integer ahead) {
			this.ahead = ahead;
		}

		public Integer getBehind() {
			return this.behind;
		}

		public void setBehind(Integer behind) {
			this.behind = behind;
		}

		public Boolean getAllRequirementsPass() {
			return this.allRequirementsPass;
		}

		public void setAllRequirementsPass(Boolean allRequirementsPass) {
			this.allRequirementsPass = allRequirementsPass;
		}

		public Boolean getSupportMergeFastForwardOnly() {
			return this.supportMergeFastForwardOnly;
		}

		public void setSupportMergeFastForwardOnly(Boolean supportMergeFastForwardOnly) {
			this.supportMergeFastForwardOnly = supportMergeFastForwardOnly;
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

		public String getTargetProjectNameWithNamespace() {
			return this.targetProjectNameWithNamespace;
		}

		public void setTargetProjectNameWithNamespace(String targetProjectNameWithNamespace) {
			this.targetProjectNameWithNamespace = targetProjectNameWithNamespace;
		}

		public String getTargetProjectPathWithNamespace() {
			return this.targetProjectPathWithNamespace;
		}

		public void setTargetProjectPathWithNamespace(String targetProjectPathWithNamespace) {
			this.targetProjectPathWithNamespace = targetProjectPathWithNamespace;
		}

		public List<ReviewersItem> getReviewers() {
			return this.reviewers;
		}

		public void setReviewers(List<ReviewersItem> reviewers) {
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

		public TodoList getTodoList() {
			return this.todoList;
		}

		public void setTodoList(TodoList todoList) {
			this.todoList = todoList;
		}

		public static class ReviewersItem {

			private Long id;

			private String name;

			private String username;

			private String state;

			private String avatarUrl;

			private String email;

			private Boolean hasReviewed;

			private String reviewOpinionStatus;

			private String reviewTime;

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

			public Boolean getHasReviewed() {
				return this.hasReviewed;
			}

			public void setHasReviewed(Boolean hasReviewed) {
				this.hasReviewed = hasReviewed;
			}

			public String getReviewOpinionStatus() {
				return this.reviewOpinionStatus;
			}

			public void setReviewOpinionStatus(String reviewOpinionStatus) {
				this.reviewOpinionStatus = reviewOpinionStatus;
			}

			public String getReviewTime() {
				return this.reviewTime;
			}

			public void setReviewTime(String reviewTime) {
				this.reviewTime = reviewTime;
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

		public static class TodoList {

			private List<Requirement_rule_items> requirementCheckItems;

			public List<Requirement_rule_items> getRequirementCheckItems() {
				return this.requirementCheckItems;
			}

			public void setRequirementCheckItems(List<Requirement_rule_items> requirementCheckItems) {
				this.requirementCheckItems = requirementCheckItems;
			}

			public static class Requirement_rule_items {

				private String itemType;

				private Boolean pass;

				public String getItemType() {
					return this.itemType;
				}

				public void setItemType(String itemType) {
					this.itemType = itemType;
				}

				public Boolean getPass() {
					return this.pass;
				}

				public void setPass(Boolean pass) {
					this.pass = pass;
				}
			}
		}
	}

	@Override
	public GetMergeRequestResponse getInstance(UnmarshallerContext context) {
		return	GetMergeRequestResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
