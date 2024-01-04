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

import com.aliyuncs.RoaAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateProtectedBranchesRequest extends RoaAcsRequest<UpdateProtectedBranchesResponse> {
	   

	private String organizationId;

	private Long repositoryId;

	private String accessToken;

	private Long id;

	@SerializedName("body")
	private Body body;
	public UpdateProtectedBranchesRequest() {
		super("devops", "2021-06-25", "UpdateProtectedBranches");
		setUriPattern("/[repositoryId]/protect_branches/[id]");
		setMethod(MethodType.PUT);
	}

	public String getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
		if(organizationId != null){
			putQueryParameter("organizationId", organizationId);
		}
	}

	public Long getRepositoryId() {
		return this.repositoryId;
	}

	public void setRepositoryId(Long repositoryId) {
		this.repositoryId = repositoryId;
		if(repositoryId != null){
			putPathParameter("repositoryId", repositoryId.toString());
		}
	}

	public String getAccessToken() {
		return this.accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
		if(accessToken != null){
			putQueryParameter("accessToken", accessToken);
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putPathParameter("id", id.toString());
		}
	}

	public Body getBody() {
		return this.body;
	}

	public void setBody(Body body) {
		this.body = body;	
		if (body != null) {
			putBodyParameter("body" , new Gson().toJson(body));
		}	
	}

	public static class Body {

		@SerializedName("allowPushRoles")
		private List<Integer> allowPushRoles;

		@SerializedName("testSettingDTO")
		private TestSettingDTO testSettingDTO;

		@SerializedName("allowPushUserIds")
		private List<String> allowPushUserIds;

		@SerializedName("allowMergeUserIds")
		private List<String> allowMergeUserIds;

		@SerializedName("mergeRequestSetting")
		private MergeRequestSetting mergeRequestSetting;

		@SerializedName("id")
		private Long id;

		@SerializedName("branch")
		private String branch;

		@SerializedName("allowMergeRoles")
		private List<Integer> allowMergeRoles;

		public List<Integer> getAllowPushRoles() {
			return this.allowPushRoles;
		}

		public void setAllowPushRoles(List<Integer> allowPushRoles) {
			this.allowPushRoles = allowPushRoles;
		}

		public TestSettingDTO getTestSettingDTO() {
			return this.testSettingDTO;
		}

		public void setTestSettingDTO(TestSettingDTO testSettingDTO) {
			this.testSettingDTO = testSettingDTO;
		}

		public List<String> getAllowPushUserIds() {
			return this.allowPushUserIds;
		}

		public void setAllowPushUserIds(List<String> allowPushUserIds) {
			this.allowPushUserIds = allowPushUserIds;
		}

		public List<String> getAllowMergeUserIds() {
			return this.allowMergeUserIds;
		}

		public void setAllowMergeUserIds(List<String> allowMergeUserIds) {
			this.allowMergeUserIds = allowMergeUserIds;
		}

		public MergeRequestSetting getMergeRequestSetting() {
			return this.mergeRequestSetting;
		}

		public void setMergeRequestSetting(MergeRequestSetting mergeRequestSetting) {
			this.mergeRequestSetting = mergeRequestSetting;
		}

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

		public List<Integer> getAllowMergeRoles() {
			return this.allowMergeRoles;
		}

		public void setAllowMergeRoles(List<Integer> allowMergeRoles) {
			this.allowMergeRoles = allowMergeRoles;
		}

		public static class TestSettingDTO {

			@SerializedName("sensitiveInfoDetection")
			private SensitiveInfoDetection sensitiveInfoDetection;

			@SerializedName("isRequired")
			private Boolean isRequired;

			@SerializedName("checkTaskQualityConfig")
			private CheckTaskQualityConfig checkTaskQualityConfig;

			@SerializedName("codeGuidelinesDetection")
			private CodeGuidelinesDetection codeGuidelinesDetection;

			@SerializedName("checkConfig")
			private CheckConfig checkConfig;

			public SensitiveInfoDetection getSensitiveInfoDetection() {
				return this.sensitiveInfoDetection;
			}

			public void setSensitiveInfoDetection(SensitiveInfoDetection sensitiveInfoDetection) {
				this.sensitiveInfoDetection = sensitiveInfoDetection;
			}

			public Boolean getIsRequired() {
				return this.isRequired;
			}

			public void setIsRequired(Boolean isRequired) {
				this.isRequired = isRequired;
			}

			public CheckTaskQualityConfig getCheckTaskQualityConfig() {
				return this.checkTaskQualityConfig;
			}

			public void setCheckTaskQualityConfig(CheckTaskQualityConfig checkTaskQualityConfig) {
				this.checkTaskQualityConfig = checkTaskQualityConfig;
			}

			public CodeGuidelinesDetection getCodeGuidelinesDetection() {
				return this.codeGuidelinesDetection;
			}

			public void setCodeGuidelinesDetection(CodeGuidelinesDetection codeGuidelinesDetection) {
				this.codeGuidelinesDetection = codeGuidelinesDetection;
			}

			public CheckConfig getCheckConfig() {
				return this.checkConfig;
			}

			public void setCheckConfig(CheckConfig checkConfig) {
				this.checkConfig = checkConfig;
			}

			public static class SensitiveInfoDetection {

				@SerializedName("message")
				private String message;

				@SerializedName("enabled")
				private Boolean enabled;

				public String getMessage() {
					return this.message;
				}

				public void setMessage(String message) {
					this.message = message;
				}

				public Boolean getEnabled() {
					return this.enabled;
				}

				public void setEnabled(Boolean enabled) {
					this.enabled = enabled;
				}
			}

			public static class CheckTaskQualityConfig {

				@SerializedName("bizNo")
				private String bizNo;

				@SerializedName("taskName")
				private String taskName;

				@SerializedName("message")
				private String message;

				@SerializedName("enabled")
				private Boolean enabled;

				public String getBizNo() {
					return this.bizNo;
				}

				public void setBizNo(String bizNo) {
					this.bizNo = bizNo;
				}

				public String getTaskName() {
					return this.taskName;
				}

				public void setTaskName(String taskName) {
					this.taskName = taskName;
				}

				public String getMessage() {
					return this.message;
				}

				public void setMessage(String message) {
					this.message = message;
				}

				public Boolean getEnabled() {
					return this.enabled;
				}

				public void setEnabled(Boolean enabled) {
					this.enabled = enabled;
				}
			}

			public static class CodeGuidelinesDetection {

				@SerializedName("message")
				private String message;

				@SerializedName("enabled")
				private Boolean enabled;

				public String getMessage() {
					return this.message;
				}

				public void setMessage(String message) {
					this.message = message;
				}

				public Boolean getEnabled() {
					return this.enabled;
				}

				public void setEnabled(Boolean enabled) {
					this.enabled = enabled;
				}
			}

			public static class CheckConfig {

				@SerializedName("checkItems")
				private List<CheckItemsItem> checkItems;

				public List<CheckItemsItem> getCheckItems() {
					return this.checkItems;
				}

				public void setCheckItems(List<CheckItemsItem> checkItems) {
					this.checkItems = checkItems;
				}

				public static class CheckItemsItem {

					@SerializedName("isRequired")
					private Boolean isRequired;

					@SerializedName("name")
					private String name;

					public Boolean getIsRequired() {
						return this.isRequired;
					}

					public void setIsRequired(Boolean isRequired) {
						this.isRequired = isRequired;
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

		public static class MergeRequestSetting {

			@SerializedName("mrMode")
			private String mrMode;

			@SerializedName("defaultAssignees")
			private List<String> defaultAssignees;

			@SerializedName("minimumApproval")
			private Integer minimumApproval;

			@SerializedName("isRequired")
			private Boolean isRequired;

			@SerializedName("isRequireDiscussionProcessed")
			private Boolean isRequireDiscussionProcessed;

			@SerializedName("allowMergeRequestRoles")
			private List<Integer> allowMergeRequestRoles;

			@SerializedName("whiteList")
			private String whiteList;

			@SerializedName("isResetApprovalWhenNewPush")
			private Boolean isResetApprovalWhenNewPush;

			@SerializedName("isAllowSelfApproval")
			private Boolean isAllowSelfApproval;

			public String getMrMode() {
				return this.mrMode;
			}

			public void setMrMode(String mrMode) {
				this.mrMode = mrMode;
			}

			public List<String> getDefaultAssignees() {
				return this.defaultAssignees;
			}

			public void setDefaultAssignees(List<String> defaultAssignees) {
				this.defaultAssignees = defaultAssignees;
			}

			public Integer getMinimumApproval() {
				return this.minimumApproval;
			}

			public void setMinimumApproval(Integer minimumApproval) {
				this.minimumApproval = minimumApproval;
			}

			public Boolean getIsRequired() {
				return this.isRequired;
			}

			public void setIsRequired(Boolean isRequired) {
				this.isRequired = isRequired;
			}

			public Boolean getIsRequireDiscussionProcessed() {
				return this.isRequireDiscussionProcessed;
			}

			public void setIsRequireDiscussionProcessed(Boolean isRequireDiscussionProcessed) {
				this.isRequireDiscussionProcessed = isRequireDiscussionProcessed;
			}

			public List<Integer> getAllowMergeRequestRoles() {
				return this.allowMergeRequestRoles;
			}

			public void setAllowMergeRequestRoles(List<Integer> allowMergeRequestRoles) {
				this.allowMergeRequestRoles = allowMergeRequestRoles;
			}

			public String getWhiteList() {
				return this.whiteList;
			}

			public void setWhiteList(String whiteList) {
				this.whiteList = whiteList;
			}

			public Boolean getIsResetApprovalWhenNewPush() {
				return this.isResetApprovalWhenNewPush;
			}

			public void setIsResetApprovalWhenNewPush(Boolean isResetApprovalWhenNewPush) {
				this.isResetApprovalWhenNewPush = isResetApprovalWhenNewPush;
			}

			public Boolean getIsAllowSelfApproval() {
				return this.isAllowSelfApproval;
			}

			public void setIsAllowSelfApproval(Boolean isAllowSelfApproval) {
				this.isAllowSelfApproval = isAllowSelfApproval;
			}
		}
	}

	@Override
	public Class<UpdateProtectedBranchesResponse> getResponseClass() {
		return UpdateProtectedBranchesResponse.class;
	}

}
