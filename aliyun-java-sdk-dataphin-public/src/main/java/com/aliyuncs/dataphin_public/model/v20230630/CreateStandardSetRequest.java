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

package com.aliyuncs.dataphin_public.model.v20230630;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateStandardSetRequest extends RpcAcsRequest<CreateStandardSetResponse> {
	   

	private Long opTenantId;

	@SerializedName("createCommand")
	private CreateCommand createCommand;
	public CreateStandardSetRequest() {
		super("dataphin-public", "2023-06-30", "CreateStandardSet");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Long getOpTenantId() {
		return this.opTenantId;
	}

	public void setOpTenantId(Long opTenantId) {
		this.opTenantId = opTenantId;
		if(opTenantId != null){
			putQueryParameter("OpTenantId", opTenantId.toString());
		}
	}

	public CreateCommand getCreateCommand() {
		return this.createCommand;
	}

	public void setCreateCommand(CreateCommand createCommand) {
		this.createCommand = createCommand;	
		if (createCommand != null) {
			putBodyParameter("CreateCommand" , new Gson().toJson(createCommand));
		}	
	}

	public static class CreateCommand {

		@SerializedName("MaintainerList")
		private List<String> maintainerList;

		@SerializedName("OfflineApprovalConfig")
		private OfflineApprovalConfig offlineApprovalConfig;

		@SerializedName("MemberList")
		private List<String> memberList;

		@SerializedName("Code")
		private String code;

		@SerializedName("ApprovalConfig")
		private ApprovalConfig approvalConfig;

		@SerializedName("Name")
		private String name;

		@SerializedName("Description")
		private String description;

		@SerializedName("VisibilityConfig")
		private VisibilityConfig visibilityConfig;

		@SerializedName("DirectoryReference")
		private DirectoryReference directoryReference;

		@SerializedName("DefaultStandardTemplateId")
		private Long defaultStandardTemplateId;

		@SerializedName("MemberGroupList")
		private List<String> memberGroupList;

		public List<String> getMaintainerList() {
			return this.maintainerList;
		}

		public void setMaintainerList(List<String> maintainerList) {
			this.maintainerList = maintainerList;
		}

		public OfflineApprovalConfig getOfflineApprovalConfig() {
			return this.offlineApprovalConfig;
		}

		public void setOfflineApprovalConfig(OfflineApprovalConfig offlineApprovalConfig) {
			this.offlineApprovalConfig = offlineApprovalConfig;
		}

		public List<String> getMemberList() {
			return this.memberList;
		}

		public void setMemberList(List<String> memberList) {
			this.memberList = memberList;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public ApprovalConfig getApprovalConfig() {
			return this.approvalConfig;
		}

		public void setApprovalConfig(ApprovalConfig approvalConfig) {
			this.approvalConfig = approvalConfig;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public VisibilityConfig getVisibilityConfig() {
			return this.visibilityConfig;
		}

		public void setVisibilityConfig(VisibilityConfig visibilityConfig) {
			this.visibilityConfig = visibilityConfig;
		}

		public DirectoryReference getDirectoryReference() {
			return this.directoryReference;
		}

		public void setDirectoryReference(DirectoryReference directoryReference) {
			this.directoryReference = directoryReference;
		}

		public Long getDefaultStandardTemplateId() {
			return this.defaultStandardTemplateId;
		}

		public void setDefaultStandardTemplateId(Long defaultStandardTemplateId) {
			this.defaultStandardTemplateId = defaultStandardTemplateId;
		}

		public List<String> getMemberGroupList() {
			return this.memberGroupList;
		}

		public void setMemberGroupList(List<String> memberGroupList) {
			this.memberGroupList = memberGroupList;
		}

		public static class OfflineApprovalConfig {

			@SerializedName("ApprovalType")
			private String approvalType;

			@SerializedName("EnableApproval")
			private Boolean enableApproval;

			@SerializedName("TemplateId")
			private Long templateId;

			@SerializedName("IsSubmitInBatch")
			private Boolean isSubmitInBatch;

			public String getApprovalType() {
				return this.approvalType;
			}

			public void setApprovalType(String approvalType) {
				this.approvalType = approvalType;
			}

			public Boolean getEnableApproval() {
				return this.enableApproval;
			}

			public void setEnableApproval(Boolean enableApproval) {
				this.enableApproval = enableApproval;
			}

			public Long getTemplateId() {
				return this.templateId;
			}

			public void setTemplateId(Long templateId) {
				this.templateId = templateId;
			}

			public Boolean getIsSubmitInBatch() {
				return this.isSubmitInBatch;
			}

			public void setIsSubmitInBatch(Boolean isSubmitInBatch) {
				this.isSubmitInBatch = isSubmitInBatch;
			}
		}

		public static class ApprovalConfig {

			@SerializedName("ApprovalType")
			private String approvalType;

			@SerializedName("EnableApproval")
			private Boolean enableApproval;

			@SerializedName("TemplateId")
			private Long templateId;

			@SerializedName("IsSubmitInBatch")
			private Boolean isSubmitInBatch;

			public String getApprovalType() {
				return this.approvalType;
			}

			public void setApprovalType(String approvalType) {
				this.approvalType = approvalType;
			}

			public Boolean getEnableApproval() {
				return this.enableApproval;
			}

			public void setEnableApproval(Boolean enableApproval) {
				this.enableApproval = enableApproval;
			}

			public Long getTemplateId() {
				return this.templateId;
			}

			public void setTemplateId(Long templateId) {
				this.templateId = templateId;
			}

			public Boolean getIsSubmitInBatch() {
				return this.isSubmitInBatch;
			}

			public void setIsSubmitInBatch(Boolean isSubmitInBatch) {
				this.isSubmitInBatch = isSubmitInBatch;
			}
		}

		public static class VisibilityConfig {

			@SerializedName("Type")
			private String type;

			@SerializedName("SpecifiedUserList")
			private List<String> specifiedUserList;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public List<String> getSpecifiedUserList() {
				return this.specifiedUserList;
			}

			public void setSpecifiedUserList(List<String> specifiedUserList) {
				this.specifiedUserList = specifiedUserList;
			}
		}

		public static class DirectoryReference {

			@SerializedName("Directory")
			private String directory;

			public String getDirectory() {
				return this.directory;
			}

			public void setDirectory(String directory) {
				this.directory = directory;
			}
		}
	}

	@Override
	public Class<CreateStandardSetResponse> getResponseClass() {
		return CreateStandardSetResponse.class;
	}

}
