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
import com.aliyuncs.codeup.transform.v20200414.UpdateMergeRequestResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateMergeRequestResponse extends AcsResponse {

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

		private String acceptedRevision;

		private Integer aheadCommitCount;

		private Integer behindCommitCount;

		private String createdAt;

		private String description;

		private Long id;

		private String mergeError;

		private String mergeStatus;

		private String mergeType;

		private String mergedRevision;

		private String nameWithNamespace;

		private Long projectId;

		private String sourceBranch;

		private String state;

		private String targetBranch;

		private String title;

		private String updatedAt;

		private String webUrl;

		private List<AssigneeListItem> assigneeList;

		private ApproveCheckResult approveCheckResult;

		private Author author;

		public String getAcceptedRevision() {
			return this.acceptedRevision;
		}

		public void setAcceptedRevision(String acceptedRevision) {
			this.acceptedRevision = acceptedRevision;
		}

		public Integer getAheadCommitCount() {
			return this.aheadCommitCount;
		}

		public void setAheadCommitCount(Integer aheadCommitCount) {
			this.aheadCommitCount = aheadCommitCount;
		}

		public Integer getBehindCommitCount() {
			return this.behindCommitCount;
		}

		public void setBehindCommitCount(Integer behindCommitCount) {
			this.behindCommitCount = behindCommitCount;
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

		public String getMergeError() {
			return this.mergeError;
		}

		public void setMergeError(String mergeError) {
			this.mergeError = mergeError;
		}

		public String getMergeStatus() {
			return this.mergeStatus;
		}

		public void setMergeStatus(String mergeStatus) {
			this.mergeStatus = mergeStatus;
		}

		public String getMergeType() {
			return this.mergeType;
		}

		public void setMergeType(String mergeType) {
			this.mergeType = mergeType;
		}

		public String getMergedRevision() {
			return this.mergedRevision;
		}

		public void setMergedRevision(String mergedRevision) {
			this.mergedRevision = mergedRevision;
		}

		public String getNameWithNamespace() {
			return this.nameWithNamespace;
		}

		public void setNameWithNamespace(String nameWithNamespace) {
			this.nameWithNamespace = nameWithNamespace;
		}

		public Long getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}

		public String getSourceBranch() {
			return this.sourceBranch;
		}

		public void setSourceBranch(String sourceBranch) {
			this.sourceBranch = sourceBranch;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
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

		public String getUpdatedAt() {
			return this.updatedAt;
		}

		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}

		public String getWebUrl() {
			return this.webUrl;
		}

		public void setWebUrl(String webUrl) {
			this.webUrl = webUrl;
		}

		public List<AssigneeListItem> getAssigneeList() {
			return this.assigneeList;
		}

		public void setAssigneeList(List<AssigneeListItem> assigneeList) {
			this.assigneeList = assigneeList;
		}

		public ApproveCheckResult getApproveCheckResult() {
			return this.approveCheckResult;
		}

		public void setApproveCheckResult(ApproveCheckResult approveCheckResult) {
			this.approveCheckResult = approveCheckResult;
		}

		public Author getAuthor() {
			return this.author;
		}

		public void setAuthor(Author author) {
			this.author = author;
		}

		public static class AssigneeListItem {

			private String avatarUrl;

			private String externUserId;

			private String id;

			private String name;

			public String getAvatarUrl() {
				return this.avatarUrl;
			}

			public void setAvatarUrl(String avatarUrl) {
				this.avatarUrl = avatarUrl;
			}

			public String getExternUserId() {
				return this.externUserId;
			}

			public void setExternUserId(String externUserId) {
				this.externUserId = externUserId;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}

		public static class ApproveCheckResult {

			private String totalCheckResult;

			private List<SatisfiedCheckResultsItem> satisfiedCheckResults;

			private List<UnsatisfiedCheckResultsItem> unsatisfiedCheckResults;

			public String getTotalCheckResult() {
				return this.totalCheckResult;
			}

			public void setTotalCheckResult(String totalCheckResult) {
				this.totalCheckResult = totalCheckResult;
			}

			public List<SatisfiedCheckResultsItem> getSatisfiedCheckResults() {
				return this.satisfiedCheckResults;
			}

			public void setSatisfiedCheckResults(List<SatisfiedCheckResultsItem> satisfiedCheckResults) {
				this.satisfiedCheckResults = satisfiedCheckResults;
			}

			public List<UnsatisfiedCheckResultsItem> getUnsatisfiedCheckResults() {
				return this.unsatisfiedCheckResults;
			}

			public void setUnsatisfiedCheckResults(List<UnsatisfiedCheckResultsItem> unsatisfiedCheckResults) {
				this.unsatisfiedCheckResults = unsatisfiedCheckResults;
			}

			public static class SatisfiedCheckResultsItem {

				private String checkName;

				private String checkStatus;

				private String checkType;

				private List<ExtraUsersItem> extraUsers;

				private List<String> satisfiedItems;

				private List<String> unsatisfiedItems;

				public String getCheckName() {
					return this.checkName;
				}

				public void setCheckName(String checkName) {
					this.checkName = checkName;
				}

				public String getCheckStatus() {
					return this.checkStatus;
				}

				public void setCheckStatus(String checkStatus) {
					this.checkStatus = checkStatus;
				}

				public String getCheckType() {
					return this.checkType;
				}

				public void setCheckType(String checkType) {
					this.checkType = checkType;
				}

				public List<ExtraUsersItem> getExtraUsers() {
					return this.extraUsers;
				}

				public void setExtraUsers(List<ExtraUsersItem> extraUsers) {
					this.extraUsers = extraUsers;
				}

				public List<String> getSatisfiedItems() {
					return this.satisfiedItems;
				}

				public void setSatisfiedItems(List<String> satisfiedItems) {
					this.satisfiedItems = satisfiedItems;
				}

				public List<String> getUnsatisfiedItems() {
					return this.unsatisfiedItems;
				}

				public void setUnsatisfiedItems(List<String> unsatisfiedItems) {
					this.unsatisfiedItems = unsatisfiedItems;
				}

				public static class ExtraUsersItem {

					private String avatarUrl;

					private String externUserId;

					private Long id;

					private String name;

					public String getAvatarUrl() {
						return this.avatarUrl;
					}

					public void setAvatarUrl(String avatarUrl) {
						this.avatarUrl = avatarUrl;
					}

					public String getExternUserId() {
						return this.externUserId;
					}

					public void setExternUserId(String externUserId) {
						this.externUserId = externUserId;
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
				}
			}

			public static class UnsatisfiedCheckResultsItem {

				private String checkName;

				private String checkStatus;

				private String checkType;

				private List<ExtraUsersItem4> extraUsers3;

				private List<String> satisfiedItems1;

				private List<String> unsatisfiedItems2;

				public String getCheckName() {
					return this.checkName;
				}

				public void setCheckName(String checkName) {
					this.checkName = checkName;
				}

				public String getCheckStatus() {
					return this.checkStatus;
				}

				public void setCheckStatus(String checkStatus) {
					this.checkStatus = checkStatus;
				}

				public String getCheckType() {
					return this.checkType;
				}

				public void setCheckType(String checkType) {
					this.checkType = checkType;
				}

				public List<ExtraUsersItem4> getExtraUsers3() {
					return this.extraUsers3;
				}

				public void setExtraUsers3(List<ExtraUsersItem4> extraUsers3) {
					this.extraUsers3 = extraUsers3;
				}

				public List<String> getSatisfiedItems1() {
					return this.satisfiedItems1;
				}

				public void setSatisfiedItems1(List<String> satisfiedItems1) {
					this.satisfiedItems1 = satisfiedItems1;
				}

				public List<String> getUnsatisfiedItems2() {
					return this.unsatisfiedItems2;
				}

				public void setUnsatisfiedItems2(List<String> unsatisfiedItems2) {
					this.unsatisfiedItems2 = unsatisfiedItems2;
				}

				public static class ExtraUsersItem4 {

					private String avatarUrl;

					private String externUserId;

					private Long id;

					private String name;

					public String getAvatarUrl() {
						return this.avatarUrl;
					}

					public void setAvatarUrl(String avatarUrl) {
						this.avatarUrl = avatarUrl;
					}

					public String getExternUserId() {
						return this.externUserId;
					}

					public void setExternUserId(String externUserId) {
						this.externUserId = externUserId;
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
				}
			}
		}

		public static class Author {

			private String avatarUrl;

			private String externUserId;

			private Long id;

			private String name;

			public String getAvatarUrl() {
				return this.avatarUrl;
			}

			public void setAvatarUrl(String avatarUrl) {
				this.avatarUrl = avatarUrl;
			}

			public String getExternUserId() {
				return this.externUserId;
			}

			public void setExternUserId(String externUserId) {
				this.externUserId = externUserId;
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
		}
	}

	@Override
	public UpdateMergeRequestResponse getInstance(UnmarshallerContext context) {
		return	UpdateMergeRequestResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
