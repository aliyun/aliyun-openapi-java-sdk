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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.GetStandardSetResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetStandardSetResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private StandardSetInfo standardSetInfo;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public StandardSetInfo getStandardSetInfo() {
		return this.standardSetInfo;
	}

	public void setStandardSetInfo(StandardSetInfo standardSetInfo) {
		this.standardSetInfo = standardSetInfo;
	}

	public static class StandardSetInfo {

		private Long id;

		private String name;

		private String code;

		private String description;

		private String createTime;

		private String modifyTime;

		private Long defaultStandardTemplateId;

		private List<Maintainer> maintainerList;

		private List<Member> memberList;

		private List<MemberGroup> memberGroupList;

		private DirectoryReference directoryReference;

		private VisibilityConfig visibilityConfig;

		private Creator creator;

		private LastModifier lastModifier;

		private ApprovalConfig approvalConfig;

		private OfflineApprovalConfig offlineApprovalConfig;

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

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}

		public Long getDefaultStandardTemplateId() {
			return this.defaultStandardTemplateId;
		}

		public void setDefaultStandardTemplateId(Long defaultStandardTemplateId) {
			this.defaultStandardTemplateId = defaultStandardTemplateId;
		}

		public List<Maintainer> getMaintainerList() {
			return this.maintainerList;
		}

		public void setMaintainerList(List<Maintainer> maintainerList) {
			this.maintainerList = maintainerList;
		}

		public List<Member> getMemberList() {
			return this.memberList;
		}

		public void setMemberList(List<Member> memberList) {
			this.memberList = memberList;
		}

		public List<MemberGroup> getMemberGroupList() {
			return this.memberGroupList;
		}

		public void setMemberGroupList(List<MemberGroup> memberGroupList) {
			this.memberGroupList = memberGroupList;
		}

		public DirectoryReference getDirectoryReference() {
			return this.directoryReference;
		}

		public void setDirectoryReference(DirectoryReference directoryReference) {
			this.directoryReference = directoryReference;
		}

		public VisibilityConfig getVisibilityConfig() {
			return this.visibilityConfig;
		}

		public void setVisibilityConfig(VisibilityConfig visibilityConfig) {
			this.visibilityConfig = visibilityConfig;
		}

		public Creator getCreator() {
			return this.creator;
		}

		public void setCreator(Creator creator) {
			this.creator = creator;
		}

		public LastModifier getLastModifier() {
			return this.lastModifier;
		}

		public void setLastModifier(LastModifier lastModifier) {
			this.lastModifier = lastModifier;
		}

		public ApprovalConfig getApprovalConfig() {
			return this.approvalConfig;
		}

		public void setApprovalConfig(ApprovalConfig approvalConfig) {
			this.approvalConfig = approvalConfig;
		}

		public OfflineApprovalConfig getOfflineApprovalConfig() {
			return this.offlineApprovalConfig;
		}

		public void setOfflineApprovalConfig(OfflineApprovalConfig offlineApprovalConfig) {
			this.offlineApprovalConfig = offlineApprovalConfig;
		}

		public static class Maintainer {

			private String id;

			private String name;

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

		public static class Member {

			private String id;

			private String name;

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

		public static class MemberGroup {

			private String id;

			private String name;

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

		public static class DirectoryReference {

			private String directory;

			public String getDirectory() {
				return this.directory;
			}

			public void setDirectory(String directory) {
				this.directory = directory;
			}
		}

		public static class VisibilityConfig {

			private String type;

			private List<SpecifiedUser> specifiedUserList;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public List<SpecifiedUser> getSpecifiedUserList() {
				return this.specifiedUserList;
			}

			public void setSpecifiedUserList(List<SpecifiedUser> specifiedUserList) {
				this.specifiedUserList = specifiedUserList;
			}

			public static class SpecifiedUser {

				private String id;

				private String name;

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
		}

		public static class Creator {

			private String id;

			private String name;

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

		public static class LastModifier {

			private String id;

			private String name;

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

		public static class ApprovalConfig {

			private Boolean enableApproval;

			private Boolean isSubmitInBatch;

			private String approvalType;

			private Long templateId;

			public Boolean getEnableApproval() {
				return this.enableApproval;
			}

			public void setEnableApproval(Boolean enableApproval) {
				this.enableApproval = enableApproval;
			}

			public Boolean getIsSubmitInBatch() {
				return this.isSubmitInBatch;
			}

			public void setIsSubmitInBatch(Boolean isSubmitInBatch) {
				this.isSubmitInBatch = isSubmitInBatch;
			}

			public String getApprovalType() {
				return this.approvalType;
			}

			public void setApprovalType(String approvalType) {
				this.approvalType = approvalType;
			}

			public Long getTemplateId() {
				return this.templateId;
			}

			public void setTemplateId(Long templateId) {
				this.templateId = templateId;
			}
		}

		public static class OfflineApprovalConfig {

			private Boolean enableApproval;

			private Boolean isSubmitInBatch;

			private String approvalType;

			private Long templateId;

			public Boolean getEnableApproval() {
				return this.enableApproval;
			}

			public void setEnableApproval(Boolean enableApproval) {
				this.enableApproval = enableApproval;
			}

			public Boolean getIsSubmitInBatch() {
				return this.isSubmitInBatch;
			}

			public void setIsSubmitInBatch(Boolean isSubmitInBatch) {
				this.isSubmitInBatch = isSubmitInBatch;
			}

			public String getApprovalType() {
				return this.approvalType;
			}

			public void setApprovalType(String approvalType) {
				this.approvalType = approvalType;
			}

			public Long getTemplateId() {
				return this.templateId;
			}

			public void setTemplateId(Long templateId) {
				this.templateId = templateId;
			}
		}
	}

	@Override
	public GetStandardSetResponse getInstance(UnmarshallerContext context) {
		return	GetStandardSetResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
