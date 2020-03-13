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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Long errorCode;

	private String errorMessage;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Long getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(Long errorCode) {
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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long copyFrom;

		private Long createdAt;

		private String defaultValue;

		private Boolean deleted;

		private String description;

		private String dynamicOptionFetchUrl;

		private Boolean editable;

		private Boolean enableSearch;

		private String fieldFormat;

		private String fieldLabel;

		private Boolean formInvisible;

		private Long id;

		private Boolean invisible;

		private String name;

		private String projectSign;

		private Boolean required;

		private Long type;

		private Long updatedAt;

		private List<PossibleValuesItem> possibleValues;

		private List<Long> dynamicFieldRequiredDependentFields;

		private List<Long> dynamicFieldRequiredInfluencedFields;

		private List<Long> dynamicOptionFetchDependentFields;

		private List<Long> dynamicOptionFetchInfluencedFields;

		private Creator creator;

		public Long getCopyFrom() {
			return this.copyFrom;
		}

		public void setCopyFrom(Long copyFrom) {
			this.copyFrom = copyFrom;
		}

		public Long getCreatedAt() {
			return this.createdAt;
		}

		public void setCreatedAt(Long createdAt) {
			this.createdAt = createdAt;
		}

		public String getDefaultValue() {
			return this.defaultValue;
		}

		public void setDefaultValue(String defaultValue) {
			this.defaultValue = defaultValue;
		}

		public Boolean getDeleted() {
			return this.deleted;
		}

		public void setDeleted(Boolean deleted) {
			this.deleted = deleted;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getDynamicOptionFetchUrl() {
			return this.dynamicOptionFetchUrl;
		}

		public void setDynamicOptionFetchUrl(String dynamicOptionFetchUrl) {
			this.dynamicOptionFetchUrl = dynamicOptionFetchUrl;
		}

		public Boolean getEditable() {
			return this.editable;
		}

		public void setEditable(Boolean editable) {
			this.editable = editable;
		}

		public Boolean getEnableSearch() {
			return this.enableSearch;
		}

		public void setEnableSearch(Boolean enableSearch) {
			this.enableSearch = enableSearch;
		}

		public String getFieldFormat() {
			return this.fieldFormat;
		}

		public void setFieldFormat(String fieldFormat) {
			this.fieldFormat = fieldFormat;
		}

		public String getFieldLabel() {
			return this.fieldLabel;
		}

		public void setFieldLabel(String fieldLabel) {
			this.fieldLabel = fieldLabel;
		}

		public Boolean getFormInvisible() {
			return this.formInvisible;
		}

		public void setFormInvisible(Boolean formInvisible) {
			this.formInvisible = formInvisible;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Boolean getInvisible() {
			return this.invisible;
		}

		public void setInvisible(Boolean invisible) {
			this.invisible = invisible;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getProjectSign() {
			return this.projectSign;
		}

		public void setProjectSign(String projectSign) {
			this.projectSign = projectSign;
		}

		public Boolean getRequired() {
			return this.required;
		}

		public void setRequired(Boolean required) {
			this.required = required;
		}

		public Long getType() {
			return this.type;
		}

		public void setType(Long type) {
			this.type = type;
		}

		public Long getUpdatedAt() {
			return this.updatedAt;
		}

		public void setUpdatedAt(Long updatedAt) {
			this.updatedAt = updatedAt;
		}

		public List<PossibleValuesItem> getPossibleValues() {
			return this.possibleValues;
		}

		public void setPossibleValues(List<PossibleValuesItem> possibleValues) {
			this.possibleValues = possibleValues;
		}

		public List<Long> getDynamicFieldRequiredDependentFields() {
			return this.dynamicFieldRequiredDependentFields;
		}

		public void setDynamicFieldRequiredDependentFields(List<Long> dynamicFieldRequiredDependentFields) {
			this.dynamicFieldRequiredDependentFields = dynamicFieldRequiredDependentFields;
		}

		public List<Long> getDynamicFieldRequiredInfluencedFields() {
			return this.dynamicFieldRequiredInfluencedFields;
		}

		public void setDynamicFieldRequiredInfluencedFields(List<Long> dynamicFieldRequiredInfluencedFields) {
			this.dynamicFieldRequiredInfluencedFields = dynamicFieldRequiredInfluencedFields;
		}

		public List<Long> getDynamicOptionFetchDependentFields() {
			return this.dynamicOptionFetchDependentFields;
		}

		public void setDynamicOptionFetchDependentFields(List<Long> dynamicOptionFetchDependentFields) {
			this.dynamicOptionFetchDependentFields = dynamicOptionFetchDependentFields;
		}

		public List<Long> getDynamicOptionFetchInfluencedFields() {
			return this.dynamicOptionFetchInfluencedFields;
		}

		public void setDynamicOptionFetchInfluencedFields(List<Long> dynamicOptionFetchInfluencedFields) {
			this.dynamicOptionFetchInfluencedFields = dynamicOptionFetchInfluencedFields;
		}

		public Creator getCreator() {
			return this.creator;
		}

		public void setCreator(Creator creator) {
			this.creator = creator;
		}

		public static class PossibleValuesItem {

			private String key;

			private String label;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getLabel() {
				return this.label;
			}

			public void setLabel(String label) {
				this.label = label;
			}
		}

		public static class Creator {

			private String account;

			private String adDomain;

			private String aliFullName;

			private String authToken;

			private String buName;

			private String buNo;

			private String customer;

			private Boolean deleted;

			private String deptName;

			private String deptNo;

			private String email;

			private String empId;

			private String empType;

			private String empTypeExt;

			private String fullPartTime;

			private Long gitModified;

			private String gitPassword;

			private Long gmtCreate;

			private Long gmtEntry;

			private Long gmtLeave;

			private Long gmtModified;

			private String level;

			private String loginAccount;

			private String loginName;

			private Boolean manager;

			private String mobile;

			private String name;

			private String nickName;

			private String realName;

			private String superName;

			private String superNickName;

			private String superWorkNo;

			private String tenant;

			private Boolean tenantAdmin;

			private String uid;

			private String uniqueId;

			private String userToken;

			private String virtName;

			private String virtWorkNo;

			private String workspace;

			private String workNo;

			private String workStatus;

			private List<String> tenants;

			public String getAccount() {
				return this.account;
			}

			public void setAccount(String account) {
				this.account = account;
			}

			public String getAdDomain() {
				return this.adDomain;
			}

			public void setAdDomain(String adDomain) {
				this.adDomain = adDomain;
			}

			public String getAliFullName() {
				return this.aliFullName;
			}

			public void setAliFullName(String aliFullName) {
				this.aliFullName = aliFullName;
			}

			public String getAuthToken() {
				return this.authToken;
			}

			public void setAuthToken(String authToken) {
				this.authToken = authToken;
			}

			public String getBuName() {
				return this.buName;
			}

			public void setBuName(String buName) {
				this.buName = buName;
			}

			public String getBuNo() {
				return this.buNo;
			}

			public void setBuNo(String buNo) {
				this.buNo = buNo;
			}

			public String getCustomer() {
				return this.customer;
			}

			public void setCustomer(String customer) {
				this.customer = customer;
			}

			public Boolean getDeleted() {
				return this.deleted;
			}

			public void setDeleted(Boolean deleted) {
				this.deleted = deleted;
			}

			public String getDeptName() {
				return this.deptName;
			}

			public void setDeptName(String deptName) {
				this.deptName = deptName;
			}

			public String getDeptNo() {
				return this.deptNo;
			}

			public void setDeptNo(String deptNo) {
				this.deptNo = deptNo;
			}

			public String getEmail() {
				return this.email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			public String getEmpId() {
				return this.empId;
			}

			public void setEmpId(String empId) {
				this.empId = empId;
			}

			public String getEmpType() {
				return this.empType;
			}

			public void setEmpType(String empType) {
				this.empType = empType;
			}

			public String getEmpTypeExt() {
				return this.empTypeExt;
			}

			public void setEmpTypeExt(String empTypeExt) {
				this.empTypeExt = empTypeExt;
			}

			public String getFullPartTime() {
				return this.fullPartTime;
			}

			public void setFullPartTime(String fullPartTime) {
				this.fullPartTime = fullPartTime;
			}

			public Long getGitModified() {
				return this.gitModified;
			}

			public void setGitModified(Long gitModified) {
				this.gitModified = gitModified;
			}

			public String getGitPassword() {
				return this.gitPassword;
			}

			public void setGitPassword(String gitPassword) {
				this.gitPassword = gitPassword;
			}

			public Long getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(Long gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public Long getGmtEntry() {
				return this.gmtEntry;
			}

			public void setGmtEntry(Long gmtEntry) {
				this.gmtEntry = gmtEntry;
			}

			public Long getGmtLeave() {
				return this.gmtLeave;
			}

			public void setGmtLeave(Long gmtLeave) {
				this.gmtLeave = gmtLeave;
			}

			public Long getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(Long gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getLevel() {
				return this.level;
			}

			public void setLevel(String level) {
				this.level = level;
			}

			public String getLoginAccount() {
				return this.loginAccount;
			}

			public void setLoginAccount(String loginAccount) {
				this.loginAccount = loginAccount;
			}

			public String getLoginName() {
				return this.loginName;
			}

			public void setLoginName(String loginName) {
				this.loginName = loginName;
			}

			public Boolean getManager() {
				return this.manager;
			}

			public void setManager(Boolean manager) {
				this.manager = manager;
			}

			public String getMobile() {
				return this.mobile;
			}

			public void setMobile(String mobile) {
				this.mobile = mobile;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getNickName() {
				return this.nickName;
			}

			public void setNickName(String nickName) {
				this.nickName = nickName;
			}

			public String getRealName() {
				return this.realName;
			}

			public void setRealName(String realName) {
				this.realName = realName;
			}

			public String getSuperName() {
				return this.superName;
			}

			public void setSuperName(String superName) {
				this.superName = superName;
			}

			public String getSuperNickName() {
				return this.superNickName;
			}

			public void setSuperNickName(String superNickName) {
				this.superNickName = superNickName;
			}

			public String getSuperWorkNo() {
				return this.superWorkNo;
			}

			public void setSuperWorkNo(String superWorkNo) {
				this.superWorkNo = superWorkNo;
			}

			public String getTenant() {
				return this.tenant;
			}

			public void setTenant(String tenant) {
				this.tenant = tenant;
			}

			public Boolean getTenantAdmin() {
				return this.tenantAdmin;
			}

			public void setTenantAdmin(Boolean tenantAdmin) {
				this.tenantAdmin = tenantAdmin;
			}

			public String getUid() {
				return this.uid;
			}

			public void setUid(String uid) {
				this.uid = uid;
			}

			public String getUniqueId() {
				return this.uniqueId;
			}

			public void setUniqueId(String uniqueId) {
				this.uniqueId = uniqueId;
			}

			public String getUserToken() {
				return this.userToken;
			}

			public void setUserToken(String userToken) {
				this.userToken = userToken;
			}

			public String getVirtName() {
				return this.virtName;
			}

			public void setVirtName(String virtName) {
				this.virtName = virtName;
			}

			public String getVirtWorkNo() {
				return this.virtWorkNo;
			}

			public void setVirtWorkNo(String virtWorkNo) {
				this.virtWorkNo = virtWorkNo;
			}

			public String getWorkspace() {
				return this.workspace;
			}

			public void setWorkspace(String workspace) {
				this.workspace = workspace;
			}

			public String getWorkNo() {
				return this.workNo;
			}

			public void setWorkNo(String workNo) {
				this.workNo = workNo;
			}

			public String getWorkStatus() {
				return this.workStatus;
			}

			public void setWorkStatus(String workStatus) {
				this.workStatus = workStatus;
			}

			public List<String> getTenants() {
				return this.tenants;
			}

			public void setTenants(List<String> tenants) {
				this.tenants = tenants;
			}
		}
	}

	@Override
	public ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse getInstance(UnmarshallerContext context) {
		return	ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
