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
import com.aliyuncs.codeup.transform.v20200414.CreateRepositoryProtectedBranchResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateRepositoryProtectedBranchResponse extends AcsResponse {

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

		private Long id;

		private String branch;

		private List<Integer> allowPushRoles;

		private List<Integer> allowMergeRoles;

		private MergeRequestSetting mergeRequestSetting;

		private TestSetting testSetting;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getBranch() {
			return this.branch;
		}

		public void setBranch(String branch) {
			this.branch = branch;
		}

		public List<Integer> getAllowPushRoles() {
			return this.allowPushRoles;
		}

		public void setAllowPushRoles(List<Integer> allowPushRoles) {
			this.allowPushRoles = allowPushRoles;
		}

		public List<Integer> getAllowMergeRoles() {
			return this.allowMergeRoles;
		}

		public void setAllowMergeRoles(List<Integer> allowMergeRoles) {
			this.allowMergeRoles = allowMergeRoles;
		}

		public MergeRequestSetting getMergeRequestSetting() {
			return this.mergeRequestSetting;
		}

		public void setMergeRequestSetting(MergeRequestSetting mergeRequestSetting) {
			this.mergeRequestSetting = mergeRequestSetting;
		}

		public TestSetting getTestSetting() {
			return this.testSetting;
		}

		public void setTestSetting(TestSetting testSetting) {
			this.testSetting = testSetting;
		}

		public static class MergeRequestSetting {

			private Boolean required;

			private String mergeRequestMode;

			private Boolean allowSelfApproval;

			private Boolean isRequireDiscussionProcessed;

			private Boolean isResetApprovalWhenNewPush;

			private Integer minimualApproval;

			private List<Integer> allowMergeRequestRoles;

			private List<String> defaultAssignees;

			public Boolean getRequired() {
				return this.required;
			}

			public void setRequired(Boolean required) {
				this.required = required;
			}

			public String getMergeRequestMode() {
				return this.mergeRequestMode;
			}

			public void setMergeRequestMode(String mergeRequestMode) {
				this.mergeRequestMode = mergeRequestMode;
			}

			public Boolean getAllowSelfApproval() {
				return this.allowSelfApproval;
			}

			public void setAllowSelfApproval(Boolean allowSelfApproval) {
				this.allowSelfApproval = allowSelfApproval;
			}

			public Boolean getIsRequireDiscussionProcessed() {
				return this.isRequireDiscussionProcessed;
			}

			public void setIsRequireDiscussionProcessed(Boolean isRequireDiscussionProcessed) {
				this.isRequireDiscussionProcessed = isRequireDiscussionProcessed;
			}

			public Boolean getIsResetApprovalWhenNewPush() {
				return this.isResetApprovalWhenNewPush;
			}

			public void setIsResetApprovalWhenNewPush(Boolean isResetApprovalWhenNewPush) {
				this.isResetApprovalWhenNewPush = isResetApprovalWhenNewPush;
			}

			public Integer getMinimualApproval() {
				return this.minimualApproval;
			}

			public void setMinimualApproval(Integer minimualApproval) {
				this.minimualApproval = minimualApproval;
			}

			public List<Integer> getAllowMergeRequestRoles() {
				return this.allowMergeRequestRoles;
			}

			public void setAllowMergeRequestRoles(List<Integer> allowMergeRequestRoles) {
				this.allowMergeRequestRoles = allowMergeRequestRoles;
			}

			public List<String> getDefaultAssignees() {
				return this.defaultAssignees;
			}

			public void setDefaultAssignees(List<String> defaultAssignees) {
				this.defaultAssignees = defaultAssignees;
			}
		}

		public static class TestSetting {

			private Boolean required;

			private CodingGuidelinesDetection codingGuidelinesDetection;

			private SensitiveInfoDetection sensitiveInfoDetection;

			private CheckConfig checkConfig;

			public Boolean getRequired() {
				return this.required;
			}

			public void setRequired(Boolean required) {
				this.required = required;
			}

			public CodingGuidelinesDetection getCodingGuidelinesDetection() {
				return this.codingGuidelinesDetection;
			}

			public void setCodingGuidelinesDetection(CodingGuidelinesDetection codingGuidelinesDetection) {
				this.codingGuidelinesDetection = codingGuidelinesDetection;
			}

			public SensitiveInfoDetection getSensitiveInfoDetection() {
				return this.sensitiveInfoDetection;
			}

			public void setSensitiveInfoDetection(SensitiveInfoDetection sensitiveInfoDetection) {
				this.sensitiveInfoDetection = sensitiveInfoDetection;
			}

			public CheckConfig getCheckConfig() {
				return this.checkConfig;
			}

			public void setCheckConfig(CheckConfig checkConfig) {
				this.checkConfig = checkConfig;
			}

			public static class CodingGuidelinesDetection {

				private Boolean enabled;

				private String message;

				public Boolean getEnabled() {
					return this.enabled;
				}

				public void setEnabled(Boolean enabled) {
					this.enabled = enabled;
				}

				public String getMessage() {
					return this.message;
				}

				public void setMessage(String message) {
					this.message = message;
				}
			}

			public static class SensitiveInfoDetection {

				private Boolean enabled;

				private String message;

				public Boolean getEnabled() {
					return this.enabled;
				}

				public void setEnabled(Boolean enabled) {
					this.enabled = enabled;
				}

				public String getMessage() {
					return this.message;
				}

				public void setMessage(String message) {
					this.message = message;
				}
			}

			public static class CheckConfig {

				private List<CheckItemsItem> checkItems;

				public List<CheckItemsItem> getCheckItems() {
					return this.checkItems;
				}

				public void setCheckItems(List<CheckItemsItem> checkItems) {
					this.checkItems = checkItems;
				}

				public static class CheckItemsItem {

					private String name;

					private Boolean required;

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}

					public Boolean getRequired() {
						return this.required;
					}

					public void setRequired(Boolean required) {
						this.required = required;
					}
				}
			}
		}
	}

	@Override
	public CreateRepositoryProtectedBranchResponse getInstance(UnmarshallerContext context) {
		return	CreateRepositoryProtectedBranchResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
