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
import com.aliyuncs.sofa.transform.v20190815.AddLinkeLinktWorkitemrelationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AddLinkeLinktWorkitemrelationsResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Long errorCode;

	private String errorMessage;

	private Boolean success;

	private List<DataItem> data;

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

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private Boolean asRootLevel;

		private Long childrenCount;

		private Long createdAt;

		private Boolean deleted;

		private String description;

		private Long expectedAt;

		private Long filteredChildrenCount;

		private Long finishedChildrenCount;

		private Long id;

		private String iterationSign;

		private String link;

		private String parentSign;

		private Long priority;

		private String projectName;

		private String projectSign;

		private String region;

		private String sign;

		private String signPath;

		private String stamp;

		private Long statusId;

		private Long statusStage;

		private String subject;

		private Long templateId;

		private Long updatedAt;

		private List<AttachmentVOsItem> attachmentVOs;

		private List<CcsItem> ccs;

		private List<CustomFieldsItem> customFields;

		private List<CustomFieldsValuesItem> customFieldsValues;

		private List<ModulesItem> modules;

		private List<RelatedProjectsItem> relatedProjects;

		private List<TagsItem> tags;

		private List<TemplateListItem> templateList;

		private AssignedToIds assignedToIds;

		private Creator creator;

		private Iteration iteration;

		private Modifier modifier;

		private ParentWorkItem parentWorkItem;

		private PriorityEntity priorityEntity;

		private Project project;

		private Status status;

		private Template template;

		public Boolean getAsRootLevel() {
			return this.asRootLevel;
		}

		public void setAsRootLevel(Boolean asRootLevel) {
			this.asRootLevel = asRootLevel;
		}

		public Long getChildrenCount() {
			return this.childrenCount;
		}

		public void setChildrenCount(Long childrenCount) {
			this.childrenCount = childrenCount;
		}

		public Long getCreatedAt() {
			return this.createdAt;
		}

		public void setCreatedAt(Long createdAt) {
			this.createdAt = createdAt;
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

		public Long getExpectedAt() {
			return this.expectedAt;
		}

		public void setExpectedAt(Long expectedAt) {
			this.expectedAt = expectedAt;
		}

		public Long getFilteredChildrenCount() {
			return this.filteredChildrenCount;
		}

		public void setFilteredChildrenCount(Long filteredChildrenCount) {
			this.filteredChildrenCount = filteredChildrenCount;
		}

		public Long getFinishedChildrenCount() {
			return this.finishedChildrenCount;
		}

		public void setFinishedChildrenCount(Long finishedChildrenCount) {
			this.finishedChildrenCount = finishedChildrenCount;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getIterationSign() {
			return this.iterationSign;
		}

		public void setIterationSign(String iterationSign) {
			this.iterationSign = iterationSign;
		}

		public String getLink() {
			return this.link;
		}

		public void setLink(String link) {
			this.link = link;
		}

		public String getParentSign() {
			return this.parentSign;
		}

		public void setParentSign(String parentSign) {
			this.parentSign = parentSign;
		}

		public Long getPriority() {
			return this.priority;
		}

		public void setPriority(Long priority) {
			this.priority = priority;
		}

		public String getProjectName() {
			return this.projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public String getProjectSign() {
			return this.projectSign;
		}

		public void setProjectSign(String projectSign) {
			this.projectSign = projectSign;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getSign() {
			return this.sign;
		}

		public void setSign(String sign) {
			this.sign = sign;
		}

		public String getSignPath() {
			return this.signPath;
		}

		public void setSignPath(String signPath) {
			this.signPath = signPath;
		}

		public String getStamp() {
			return this.stamp;
		}

		public void setStamp(String stamp) {
			this.stamp = stamp;
		}

		public Long getStatusId() {
			return this.statusId;
		}

		public void setStatusId(Long statusId) {
			this.statusId = statusId;
		}

		public Long getStatusStage() {
			return this.statusStage;
		}

		public void setStatusStage(Long statusStage) {
			this.statusStage = statusStage;
		}

		public String getSubject() {
			return this.subject;
		}

		public void setSubject(String subject) {
			this.subject = subject;
		}

		public Long getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(Long templateId) {
			this.templateId = templateId;
		}

		public Long getUpdatedAt() {
			return this.updatedAt;
		}

		public void setUpdatedAt(Long updatedAt) {
			this.updatedAt = updatedAt;
		}

		public List<AttachmentVOsItem> getAttachmentVOs() {
			return this.attachmentVOs;
		}

		public void setAttachmentVOs(List<AttachmentVOsItem> attachmentVOs) {
			this.attachmentVOs = attachmentVOs;
		}

		public List<CcsItem> getCcs() {
			return this.ccs;
		}

		public void setCcs(List<CcsItem> ccs) {
			this.ccs = ccs;
		}

		public List<CustomFieldsItem> getCustomFields() {
			return this.customFields;
		}

		public void setCustomFields(List<CustomFieldsItem> customFields) {
			this.customFields = customFields;
		}

		public List<CustomFieldsValuesItem> getCustomFieldsValues() {
			return this.customFieldsValues;
		}

		public void setCustomFieldsValues(List<CustomFieldsValuesItem> customFieldsValues) {
			this.customFieldsValues = customFieldsValues;
		}

		public List<ModulesItem> getModules() {
			return this.modules;
		}

		public void setModules(List<ModulesItem> modules) {
			this.modules = modules;
		}

		public List<RelatedProjectsItem> getRelatedProjects() {
			return this.relatedProjects;
		}

		public void setRelatedProjects(List<RelatedProjectsItem> relatedProjects) {
			this.relatedProjects = relatedProjects;
		}

		public List<TagsItem> getTags() {
			return this.tags;
		}

		public void setTags(List<TagsItem> tags) {
			this.tags = tags;
		}

		public List<TemplateListItem> getTemplateList() {
			return this.templateList;
		}

		public void setTemplateList(List<TemplateListItem> templateList) {
			this.templateList = templateList;
		}

		public AssignedToIds getAssignedToIds() {
			return this.assignedToIds;
		}

		public void setAssignedToIds(AssignedToIds assignedToIds) {
			this.assignedToIds = assignedToIds;
		}

		public Creator getCreator() {
			return this.creator;
		}

		public void setCreator(Creator creator) {
			this.creator = creator;
		}

		public Iteration getIteration() {
			return this.iteration;
		}

		public void setIteration(Iteration iteration) {
			this.iteration = iteration;
		}

		public Modifier getModifier() {
			return this.modifier;
		}

		public void setModifier(Modifier modifier) {
			this.modifier = modifier;
		}

		public ParentWorkItem getParentWorkItem() {
			return this.parentWorkItem;
		}

		public void setParentWorkItem(ParentWorkItem parentWorkItem) {
			this.parentWorkItem = parentWorkItem;
		}

		public PriorityEntity getPriorityEntity() {
			return this.priorityEntity;
		}

		public void setPriorityEntity(PriorityEntity priorityEntity) {
			this.priorityEntity = priorityEntity;
		}

		public Project getProject() {
			return this.project;
		}

		public void setProject(Project project) {
			this.project = project;
		}

		public Status getStatus() {
			return this.status;
		}

		public void setStatus(Status status) {
			this.status = status;
		}

		public Template getTemplate() {
			return this.template;
		}

		public void setTemplate(Template template) {
			this.template = template;
		}

		public static class AttachmentVOsItem {

			private Long createdAt;

			private Boolean deleted;

			private String filename;

			private Long id;

			private String storedFilename;

			private String target;

			private String targetType;

			private Long updatedAt;

			private String url;

			public Long getCreatedAt() {
				return this.createdAt;
			}

			public void setCreatedAt(Long createdAt) {
				this.createdAt = createdAt;
			}

			public Boolean getDeleted() {
				return this.deleted;
			}

			public void setDeleted(Boolean deleted) {
				this.deleted = deleted;
			}

			public String getFilename() {
				return this.filename;
			}

			public void setFilename(String filename) {
				this.filename = filename;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getStoredFilename() {
				return this.storedFilename;
			}

			public void setStoredFilename(String storedFilename) {
				this.storedFilename = storedFilename;
			}

			public String getTarget() {
				return this.target;
			}

			public void setTarget(String target) {
				this.target = target;
			}

			public String getTargetType() {
				return this.targetType;
			}

			public void setTargetType(String targetType) {
				this.targetType = targetType;
			}

			public Long getUpdatedAt() {
				return this.updatedAt;
			}

			public void setUpdatedAt(Long updatedAt) {
				this.updatedAt = updatedAt;
			}

			public String getUrl() {
				return this.url;
			}

			public void setUrl(String url) {
				this.url = url;
			}
		}

		public static class CcsItem {

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

		public static class CustomFieldsItem {

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

			private Long templateFieldId;

			private Long templateId;

			private Long type;

			private Long updatedAt;

			private List<PossibleValuesItem> possibleValues;

			private List<Long> dynamicFieldRequiredDependentFields;

			private List<Long> dynamicFieldRequiredInfluencedFields;

			private List<Long> dynamicOptionFetchDependentFields;

			private List<Long> dynamicOptionFetchInfluencedFields;

			private Creator1 creator1;

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

			public Long getTemplateFieldId() {
				return this.templateFieldId;
			}

			public void setTemplateFieldId(Long templateFieldId) {
				this.templateFieldId = templateFieldId;
			}

			public Long getTemplateId() {
				return this.templateId;
			}

			public void setTemplateId(Long templateId) {
				this.templateId = templateId;
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

			public Creator1 getCreator1() {
				return this.creator1;
			}

			public void setCreator1(Creator1 creator1) {
				this.creator1 = creator1;
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

			public static class Creator1 {

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

				private List<String> tenants2;

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

				public List<String> getTenants2() {
					return this.tenants2;
				}

				public void setTenants2(List<String> tenants2) {
					this.tenants2 = tenants2;
				}
			}
		}

		public static class CustomFieldsValuesItem {

			private Long createdAt;

			private Long dateValue;

			private Boolean deleted;

			private Long id;

			private String target;

			private String targetType;

			private Long templateFieldId;

			private Long updatedAt;

			private String value;

			private List<ListUserValueItem> listUserValue;

			private List<String> listValue;

			private CustomField customField;

			private UserValue userValue;

			public Long getCreatedAt() {
				return this.createdAt;
			}

			public void setCreatedAt(Long createdAt) {
				this.createdAt = createdAt;
			}

			public Long getDateValue() {
				return this.dateValue;
			}

			public void setDateValue(Long dateValue) {
				this.dateValue = dateValue;
			}

			public Boolean getDeleted() {
				return this.deleted;
			}

			public void setDeleted(Boolean deleted) {
				this.deleted = deleted;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getTarget() {
				return this.target;
			}

			public void setTarget(String target) {
				this.target = target;
			}

			public String getTargetType() {
				return this.targetType;
			}

			public void setTargetType(String targetType) {
				this.targetType = targetType;
			}

			public Long getTemplateFieldId() {
				return this.templateFieldId;
			}

			public void setTemplateFieldId(Long templateFieldId) {
				this.templateFieldId = templateFieldId;
			}

			public Long getUpdatedAt() {
				return this.updatedAt;
			}

			public void setUpdatedAt(Long updatedAt) {
				this.updatedAt = updatedAt;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public List<ListUserValueItem> getListUserValue() {
				return this.listUserValue;
			}

			public void setListUserValue(List<ListUserValueItem> listUserValue) {
				this.listUserValue = listUserValue;
			}

			public List<String> getListValue() {
				return this.listValue;
			}

			public void setListValue(List<String> listValue) {
				this.listValue = listValue;
			}

			public CustomField getCustomField() {
				return this.customField;
			}

			public void setCustomField(CustomField customField) {
				this.customField = customField;
			}

			public UserValue getUserValue() {
				return this.userValue;
			}

			public void setUserValue(UserValue userValue) {
				this.userValue = userValue;
			}

			public static class ListUserValueItem {

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

				private List<String> tenants3;

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

				public List<String> getTenants3() {
					return this.tenants3;
				}

				public void setTenants3(List<String> tenants3) {
					this.tenants3 = tenants3;
				}
			}

			public static class CustomField {

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

				private List<PossibleValuesItem10> possibleValues9;

				private List<Long> dynamicFieldRequiredDependentFields4;

				private List<Long> dynamicFieldRequiredInfluencedFields5;

				private List<Long> dynamicOptionFetchDependentFields6;

				private List<Long> dynamicOptionFetchInfluencedFields7;

				private Creator8 creator8;

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

				public List<PossibleValuesItem10> getPossibleValues9() {
					return this.possibleValues9;
				}

				public void setPossibleValues9(List<PossibleValuesItem10> possibleValues9) {
					this.possibleValues9 = possibleValues9;
				}

				public List<Long> getDynamicFieldRequiredDependentFields4() {
					return this.dynamicFieldRequiredDependentFields4;
				}

				public void setDynamicFieldRequiredDependentFields4(List<Long> dynamicFieldRequiredDependentFields4) {
					this.dynamicFieldRequiredDependentFields4 = dynamicFieldRequiredDependentFields4;
				}

				public List<Long> getDynamicFieldRequiredInfluencedFields5() {
					return this.dynamicFieldRequiredInfluencedFields5;
				}

				public void setDynamicFieldRequiredInfluencedFields5(List<Long> dynamicFieldRequiredInfluencedFields5) {
					this.dynamicFieldRequiredInfluencedFields5 = dynamicFieldRequiredInfluencedFields5;
				}

				public List<Long> getDynamicOptionFetchDependentFields6() {
					return this.dynamicOptionFetchDependentFields6;
				}

				public void setDynamicOptionFetchDependentFields6(List<Long> dynamicOptionFetchDependentFields6) {
					this.dynamicOptionFetchDependentFields6 = dynamicOptionFetchDependentFields6;
				}

				public List<Long> getDynamicOptionFetchInfluencedFields7() {
					return this.dynamicOptionFetchInfluencedFields7;
				}

				public void setDynamicOptionFetchInfluencedFields7(List<Long> dynamicOptionFetchInfluencedFields7) {
					this.dynamicOptionFetchInfluencedFields7 = dynamicOptionFetchInfluencedFields7;
				}

				public Creator8 getCreator8() {
					return this.creator8;
				}

				public void setCreator8(Creator8 creator8) {
					this.creator8 = creator8;
				}

				public static class PossibleValuesItem10 {

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

				public static class Creator8 {

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

					private List<String> tenants11;

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

					public List<String> getTenants11() {
						return this.tenants11;
					}

					public void setTenants11(List<String> tenants11) {
						this.tenants11 = tenants11;
					}
				}
			}

			public static class UserValue {

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

				private List<String> tenants12;

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

				public List<String> getTenants12() {
					return this.tenants12;
				}

				public void setTenants12(List<String> tenants12) {
					this.tenants12 = tenants12;
				}
			}
		}

		public static class ModulesItem {

			private Long createdAt;

			private Boolean deleted;

			private String description;

			private Long id;

			private String name;

			private Long parentId;

			private String projectSign;

			private String region;

			private Long updatedAt;

			private Creator13 creator13;

			private Modifier14 modifier14;

			private Owners owners;

			public Long getCreatedAt() {
				return this.createdAt;
			}

			public void setCreatedAt(Long createdAt) {
				this.createdAt = createdAt;
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

			public Long getParentId() {
				return this.parentId;
			}

			public void setParentId(Long parentId) {
				this.parentId = parentId;
			}

			public String getProjectSign() {
				return this.projectSign;
			}

			public void setProjectSign(String projectSign) {
				this.projectSign = projectSign;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public Long getUpdatedAt() {
				return this.updatedAt;
			}

			public void setUpdatedAt(Long updatedAt) {
				this.updatedAt = updatedAt;
			}

			public Creator13 getCreator13() {
				return this.creator13;
			}

			public void setCreator13(Creator13 creator13) {
				this.creator13 = creator13;
			}

			public Modifier14 getModifier14() {
				return this.modifier14;
			}

			public void setModifier14(Modifier14 modifier14) {
				this.modifier14 = modifier14;
			}

			public Owners getOwners() {
				return this.owners;
			}

			public void setOwners(Owners owners) {
				this.owners = owners;
			}

			public static class Creator13 {

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

				private List<String> tenants15;

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

				public List<String> getTenants15() {
					return this.tenants15;
				}

				public void setTenants15(List<String> tenants15) {
					this.tenants15 = tenants15;
				}
			}

			public static class Modifier14 {

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

				private List<String> tenants16;

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

				public List<String> getTenants16() {
					return this.tenants16;
				}

				public void setTenants16(List<String> tenants16) {
					this.tenants16 = tenants16;
				}
			}

			public static class Owners {

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

				private List<String> tenants17;

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

				public List<String> getTenants17() {
					return this.tenants17;
				}

				public void setTenants17(List<String> tenants17) {
					this.tenants17 = tenants17;
				}
			}
		}

		public static class RelatedProjectsItem {

			private Boolean archive;

			private Boolean asPublic;

			private Long createdAt;

			private Boolean deleted;

			private String description;

			private Long id;

			private String link;

			private String name;

			private String parentSign;

			private String sign;

			private String signPath;

			private Long updatedAt;

			private Creator18 creator18;

			public Boolean getArchive() {
				return this.archive;
			}

			public void setArchive(Boolean archive) {
				this.archive = archive;
			}

			public Boolean getAsPublic() {
				return this.asPublic;
			}

			public void setAsPublic(Boolean asPublic) {
				this.asPublic = asPublic;
			}

			public Long getCreatedAt() {
				return this.createdAt;
			}

			public void setCreatedAt(Long createdAt) {
				this.createdAt = createdAt;
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

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getLink() {
				return this.link;
			}

			public void setLink(String link) {
				this.link = link;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getParentSign() {
				return this.parentSign;
			}

			public void setParentSign(String parentSign) {
				this.parentSign = parentSign;
			}

			public String getSign() {
				return this.sign;
			}

			public void setSign(String sign) {
				this.sign = sign;
			}

			public String getSignPath() {
				return this.signPath;
			}

			public void setSignPath(String signPath) {
				this.signPath = signPath;
			}

			public Long getUpdatedAt() {
				return this.updatedAt;
			}

			public void setUpdatedAt(Long updatedAt) {
				this.updatedAt = updatedAt;
			}

			public Creator18 getCreator18() {
				return this.creator18;
			}

			public void setCreator18(Creator18 creator18) {
				this.creator18 = creator18;
			}

			public static class Creator18 {

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

				private List<String> tenants19;

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

				public List<String> getTenants19() {
					return this.tenants19;
				}

				public void setTenants19(List<String> tenants19) {
					this.tenants19 = tenants19;
				}
			}
		}

		public static class TagsItem {

			private String color;

			private String content;

			private Long createdAt;

			private Boolean deleted;

			private Long id;

			private String projectSign;

			private String region;

			private Long updatedAt;

			private Creator20 creator20;

			public String getColor() {
				return this.color;
			}

			public void setColor(String color) {
				this.color = color;
			}

			public String getContent() {
				return this.content;
			}

			public void setContent(String content) {
				this.content = content;
			}

			public Long getCreatedAt() {
				return this.createdAt;
			}

			public void setCreatedAt(Long createdAt) {
				this.createdAt = createdAt;
			}

			public Boolean getDeleted() {
				return this.deleted;
			}

			public void setDeleted(Boolean deleted) {
				this.deleted = deleted;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getProjectSign() {
				return this.projectSign;
			}

			public void setProjectSign(String projectSign) {
				this.projectSign = projectSign;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public Long getUpdatedAt() {
				return this.updatedAt;
			}

			public void setUpdatedAt(Long updatedAt) {
				this.updatedAt = updatedAt;
			}

			public Creator20 getCreator20() {
				return this.creator20;
			}

			public void setCreator20(Creator20 creator20) {
				this.creator20 = creator20;
			}

			public static class Creator20 {

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

				private List<String> tenants21;

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

				public List<String> getTenants21() {
					return this.tenants21;
				}

				public void setTenants21(List<String> tenants21) {
					this.tenants21 = tenants21;
				}
			}
		}

		public static class TemplateListItem {

			private Long createdAt;

			private String defaultContent;

			private Boolean deleted;

			private String description;

			private Long id;

			private String name;

			private Long priority;

			private String projectSign;

			private String stamp;

			private String templateLabel;

			private Long type;

			private Long updatedAt;

			private Long workflowId;

			private Creator22 creator22;

			public Long getCreatedAt() {
				return this.createdAt;
			}

			public void setCreatedAt(Long createdAt) {
				this.createdAt = createdAt;
			}

			public String getDefaultContent() {
				return this.defaultContent;
			}

			public void setDefaultContent(String defaultContent) {
				this.defaultContent = defaultContent;
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

			public Long getPriority() {
				return this.priority;
			}

			public void setPriority(Long priority) {
				this.priority = priority;
			}

			public String getProjectSign() {
				return this.projectSign;
			}

			public void setProjectSign(String projectSign) {
				this.projectSign = projectSign;
			}

			public String getStamp() {
				return this.stamp;
			}

			public void setStamp(String stamp) {
				this.stamp = stamp;
			}

			public String getTemplateLabel() {
				return this.templateLabel;
			}

			public void setTemplateLabel(String templateLabel) {
				this.templateLabel = templateLabel;
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

			public Long getWorkflowId() {
				return this.workflowId;
			}

			public void setWorkflowId(Long workflowId) {
				this.workflowId = workflowId;
			}

			public Creator22 getCreator22() {
				return this.creator22;
			}

			public void setCreator22(Creator22 creator22) {
				this.creator22 = creator22;
			}

			public static class Creator22 {

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

				private List<String> tenants23;

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

				public List<String> getTenants23() {
					return this.tenants23;
				}

				public void setTenants23(List<String> tenants23) {
					this.tenants23 = tenants23;
				}
			}
		}

		public static class AssignedToIds {

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

			private List<String> tenants24;

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

			public List<String> getTenants24() {
				return this.tenants24;
			}

			public void setTenants24(List<String> tenants24) {
				this.tenants24 = tenants24;
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

			private List<String> tenants25;

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

			public List<String> getTenants25() {
				return this.tenants25;
			}

			public void setTenants25(List<String> tenants25) {
				this.tenants25 = tenants25;
			}
		}

		public static class Iteration {

			private Long beginDate;

			private Long createdAt;

			private Boolean deleted;

			private Long endDate;

			private Long id;

			private Boolean locked;

			private String name;

			private String projectSign;

			private String sign;

			private Long updatedAt;

			public Long getBeginDate() {
				return this.beginDate;
			}

			public void setBeginDate(Long beginDate) {
				this.beginDate = beginDate;
			}

			public Long getCreatedAt() {
				return this.createdAt;
			}

			public void setCreatedAt(Long createdAt) {
				this.createdAt = createdAt;
			}

			public Boolean getDeleted() {
				return this.deleted;
			}

			public void setDeleted(Boolean deleted) {
				this.deleted = deleted;
			}

			public Long getEndDate() {
				return this.endDate;
			}

			public void setEndDate(Long endDate) {
				this.endDate = endDate;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public Boolean getLocked() {
				return this.locked;
			}

			public void setLocked(Boolean locked) {
				this.locked = locked;
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

			public String getSign() {
				return this.sign;
			}

			public void setSign(String sign) {
				this.sign = sign;
			}

			public Long getUpdatedAt() {
				return this.updatedAt;
			}

			public void setUpdatedAt(Long updatedAt) {
				this.updatedAt = updatedAt;
			}
		}

		public static class Modifier {

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

			private List<String> tenants26;

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

			public List<String> getTenants26() {
				return this.tenants26;
			}

			public void setTenants26(List<String> tenants26) {
				this.tenants26 = tenants26;
			}
		}

		public static class ParentWorkItem {

			private Long createdAt;

			private Boolean deleted;

			private Long expectedAt;

			private Long id;

			private String iterationSign;

			private String parentSign;

			private Long priority;

			private String projectName;

			private String projectSign;

			private String sign;

			private String signPath;

			private String stamp;

			private Long statusId;

			private Long statusStage;

			private String subject;

			private Long templateId;

			private Long updatedAt;

			private List<CcsItem35> ccs34;

			private AssignedToIds27 assignedToIds27;

			private Creator28 creator28;

			private Iteration29 iteration29;

			private Modifier30 modifier30;

			private PriorityEntity31 priorityEntity31;

			private Project32 project32;

			private Status33 status33;

			public Long getCreatedAt() {
				return this.createdAt;
			}

			public void setCreatedAt(Long createdAt) {
				this.createdAt = createdAt;
			}

			public Boolean getDeleted() {
				return this.deleted;
			}

			public void setDeleted(Boolean deleted) {
				this.deleted = deleted;
			}

			public Long getExpectedAt() {
				return this.expectedAt;
			}

			public void setExpectedAt(Long expectedAt) {
				this.expectedAt = expectedAt;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getIterationSign() {
				return this.iterationSign;
			}

			public void setIterationSign(String iterationSign) {
				this.iterationSign = iterationSign;
			}

			public String getParentSign() {
				return this.parentSign;
			}

			public void setParentSign(String parentSign) {
				this.parentSign = parentSign;
			}

			public Long getPriority() {
				return this.priority;
			}

			public void setPriority(Long priority) {
				this.priority = priority;
			}

			public String getProjectName() {
				return this.projectName;
			}

			public void setProjectName(String projectName) {
				this.projectName = projectName;
			}

			public String getProjectSign() {
				return this.projectSign;
			}

			public void setProjectSign(String projectSign) {
				this.projectSign = projectSign;
			}

			public String getSign() {
				return this.sign;
			}

			public void setSign(String sign) {
				this.sign = sign;
			}

			public String getSignPath() {
				return this.signPath;
			}

			public void setSignPath(String signPath) {
				this.signPath = signPath;
			}

			public String getStamp() {
				return this.stamp;
			}

			public void setStamp(String stamp) {
				this.stamp = stamp;
			}

			public Long getStatusId() {
				return this.statusId;
			}

			public void setStatusId(Long statusId) {
				this.statusId = statusId;
			}

			public Long getStatusStage() {
				return this.statusStage;
			}

			public void setStatusStage(Long statusStage) {
				this.statusStage = statusStage;
			}

			public String getSubject() {
				return this.subject;
			}

			public void setSubject(String subject) {
				this.subject = subject;
			}

			public Long getTemplateId() {
				return this.templateId;
			}

			public void setTemplateId(Long templateId) {
				this.templateId = templateId;
			}

			public Long getUpdatedAt() {
				return this.updatedAt;
			}

			public void setUpdatedAt(Long updatedAt) {
				this.updatedAt = updatedAt;
			}

			public List<CcsItem35> getCcs34() {
				return this.ccs34;
			}

			public void setCcs34(List<CcsItem35> ccs34) {
				this.ccs34 = ccs34;
			}

			public AssignedToIds27 getAssignedToIds27() {
				return this.assignedToIds27;
			}

			public void setAssignedToIds27(AssignedToIds27 assignedToIds27) {
				this.assignedToIds27 = assignedToIds27;
			}

			public Creator28 getCreator28() {
				return this.creator28;
			}

			public void setCreator28(Creator28 creator28) {
				this.creator28 = creator28;
			}

			public Iteration29 getIteration29() {
				return this.iteration29;
			}

			public void setIteration29(Iteration29 iteration29) {
				this.iteration29 = iteration29;
			}

			public Modifier30 getModifier30() {
				return this.modifier30;
			}

			public void setModifier30(Modifier30 modifier30) {
				this.modifier30 = modifier30;
			}

			public PriorityEntity31 getPriorityEntity31() {
				return this.priorityEntity31;
			}

			public void setPriorityEntity31(PriorityEntity31 priorityEntity31) {
				this.priorityEntity31 = priorityEntity31;
			}

			public Project32 getProject32() {
				return this.project32;
			}

			public void setProject32(Project32 project32) {
				this.project32 = project32;
			}

			public Status33 getStatus33() {
				return this.status33;
			}

			public void setStatus33(Status33 status33) {
				this.status33 = status33;
			}

			public static class CcsItem35 {

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

				private List<String> tenants36;

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

				public List<String> getTenants36() {
					return this.tenants36;
				}

				public void setTenants36(List<String> tenants36) {
					this.tenants36 = tenants36;
				}
			}

			public static class AssignedToIds27 {

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

				private List<String> tenants37;

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

				public List<String> getTenants37() {
					return this.tenants37;
				}

				public void setTenants37(List<String> tenants37) {
					this.tenants37 = tenants37;
				}
			}

			public static class Creator28 {

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

				private List<String> tenants38;

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

				public List<String> getTenants38() {
					return this.tenants38;
				}

				public void setTenants38(List<String> tenants38) {
					this.tenants38 = tenants38;
				}
			}

			public static class Iteration29 {

				private Long beginDate;

				private Long createdAt;

				private Boolean deleted;

				private Long endDate;

				private Long id;

				private Boolean locked;

				private String name;

				private String projectSign;

				private String sign;

				private Long updatedAt;

				public Long getBeginDate() {
					return this.beginDate;
				}

				public void setBeginDate(Long beginDate) {
					this.beginDate = beginDate;
				}

				public Long getCreatedAt() {
					return this.createdAt;
				}

				public void setCreatedAt(Long createdAt) {
					this.createdAt = createdAt;
				}

				public Boolean getDeleted() {
					return this.deleted;
				}

				public void setDeleted(Boolean deleted) {
					this.deleted = deleted;
				}

				public Long getEndDate() {
					return this.endDate;
				}

				public void setEndDate(Long endDate) {
					this.endDate = endDate;
				}

				public Long getId() {
					return this.id;
				}

				public void setId(Long id) {
					this.id = id;
				}

				public Boolean getLocked() {
					return this.locked;
				}

				public void setLocked(Boolean locked) {
					this.locked = locked;
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

				public String getSign() {
					return this.sign;
				}

				public void setSign(String sign) {
					this.sign = sign;
				}

				public Long getUpdatedAt() {
					return this.updatedAt;
				}

				public void setUpdatedAt(Long updatedAt) {
					this.updatedAt = updatedAt;
				}
			}

			public static class Modifier30 {

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

				private List<String> tenants39;

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

				public List<String> getTenants39() {
					return this.tenants39;
				}

				public void setTenants39(List<String> tenants39) {
					this.tenants39 = tenants39;
				}
			}

			public static class PriorityEntity31 {

				private Long id;

				private String name;

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

			public static class Project32 {

				private Boolean archive;

				private Boolean asPublic;

				private Long createdAt;

				private Boolean deleted;

				private String description;

				private Long id;

				private String link;

				private String name;

				private String parentSign;

				private String sign;

				private String signPath;

				private Long updatedAt;

				private Creator40 creator40;

				public Boolean getArchive() {
					return this.archive;
				}

				public void setArchive(Boolean archive) {
					this.archive = archive;
				}

				public Boolean getAsPublic() {
					return this.asPublic;
				}

				public void setAsPublic(Boolean asPublic) {
					this.asPublic = asPublic;
				}

				public Long getCreatedAt() {
					return this.createdAt;
				}

				public void setCreatedAt(Long createdAt) {
					this.createdAt = createdAt;
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

				public Long getId() {
					return this.id;
				}

				public void setId(Long id) {
					this.id = id;
				}

				public String getLink() {
					return this.link;
				}

				public void setLink(String link) {
					this.link = link;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getParentSign() {
					return this.parentSign;
				}

				public void setParentSign(String parentSign) {
					this.parentSign = parentSign;
				}

				public String getSign() {
					return this.sign;
				}

				public void setSign(String sign) {
					this.sign = sign;
				}

				public String getSignPath() {
					return this.signPath;
				}

				public void setSignPath(String signPath) {
					this.signPath = signPath;
				}

				public Long getUpdatedAt() {
					return this.updatedAt;
				}

				public void setUpdatedAt(Long updatedAt) {
					this.updatedAt = updatedAt;
				}

				public Creator40 getCreator40() {
					return this.creator40;
				}

				public void setCreator40(Creator40 creator40) {
					this.creator40 = creator40;
				}

				public static class Creator40 {

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

					private List<String> tenants41;

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

					public List<String> getTenants41() {
						return this.tenants41;
					}

					public void setTenants41(List<String> tenants41) {
						this.tenants41 = tenants41;
					}
				}
			}

			public static class Status33 {

				private Long createdAt;

				private Boolean deleted;

				private Long id;

				private String name;

				private String projectSign;

				private String region;

				private Long stage;

				private String stageName;

				private Long updatedAt;

				public Long getCreatedAt() {
					return this.createdAt;
				}

				public void setCreatedAt(Long createdAt) {
					this.createdAt = createdAt;
				}

				public Boolean getDeleted() {
					return this.deleted;
				}

				public void setDeleted(Boolean deleted) {
					this.deleted = deleted;
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

				public String getProjectSign() {
					return this.projectSign;
				}

				public void setProjectSign(String projectSign) {
					this.projectSign = projectSign;
				}

				public String getRegion() {
					return this.region;
				}

				public void setRegion(String region) {
					this.region = region;
				}

				public Long getStage() {
					return this.stage;
				}

				public void setStage(Long stage) {
					this.stage = stage;
				}

				public String getStageName() {
					return this.stageName;
				}

				public void setStageName(String stageName) {
					this.stageName = stageName;
				}

				public Long getUpdatedAt() {
					return this.updatedAt;
				}

				public void setUpdatedAt(Long updatedAt) {
					this.updatedAt = updatedAt;
				}
			}
		}

		public static class PriorityEntity {

			private Long id;

			private String name;

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

		public static class Project {

			private Boolean archive;

			private Boolean asPublic;

			private Long createdAt;

			private Boolean deleted;

			private String description;

			private Long id;

			private String link;

			private String name;

			private String parentSign;

			private String sign;

			private String signPath;

			private Long updatedAt;

			private Creator42 creator42;

			public Boolean getArchive() {
				return this.archive;
			}

			public void setArchive(Boolean archive) {
				this.archive = archive;
			}

			public Boolean getAsPublic() {
				return this.asPublic;
			}

			public void setAsPublic(Boolean asPublic) {
				this.asPublic = asPublic;
			}

			public Long getCreatedAt() {
				return this.createdAt;
			}

			public void setCreatedAt(Long createdAt) {
				this.createdAt = createdAt;
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

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getLink() {
				return this.link;
			}

			public void setLink(String link) {
				this.link = link;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getParentSign() {
				return this.parentSign;
			}

			public void setParentSign(String parentSign) {
				this.parentSign = parentSign;
			}

			public String getSign() {
				return this.sign;
			}

			public void setSign(String sign) {
				this.sign = sign;
			}

			public String getSignPath() {
				return this.signPath;
			}

			public void setSignPath(String signPath) {
				this.signPath = signPath;
			}

			public Long getUpdatedAt() {
				return this.updatedAt;
			}

			public void setUpdatedAt(Long updatedAt) {
				this.updatedAt = updatedAt;
			}

			public Creator42 getCreator42() {
				return this.creator42;
			}

			public void setCreator42(Creator42 creator42) {
				this.creator42 = creator42;
			}

			public static class Creator42 {

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

				private List<String> tenants43;

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

				public List<String> getTenants43() {
					return this.tenants43;
				}

				public void setTenants43(List<String> tenants43) {
					this.tenants43 = tenants43;
				}
			}
		}

		public static class Status {

			private Long createdAt;

			private Boolean deleted;

			private Long id;

			private String name;

			private String projectSign;

			private String region;

			private Long stage;

			private String stageName;

			private Long updatedAt;

			public Long getCreatedAt() {
				return this.createdAt;
			}

			public void setCreatedAt(Long createdAt) {
				this.createdAt = createdAt;
			}

			public Boolean getDeleted() {
				return this.deleted;
			}

			public void setDeleted(Boolean deleted) {
				this.deleted = deleted;
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

			public String getProjectSign() {
				return this.projectSign;
			}

			public void setProjectSign(String projectSign) {
				this.projectSign = projectSign;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public Long getStage() {
				return this.stage;
			}

			public void setStage(Long stage) {
				this.stage = stage;
			}

			public String getStageName() {
				return this.stageName;
			}

			public void setStageName(String stageName) {
				this.stageName = stageName;
			}

			public Long getUpdatedAt() {
				return this.updatedAt;
			}

			public void setUpdatedAt(Long updatedAt) {
				this.updatedAt = updatedAt;
			}
		}

		public static class Template {

			private Long createdAt;

			private String defaultContent;

			private Boolean deleted;

			private String description;

			private Long id;

			private String name;

			private Long priority;

			private String projectSign;

			private String stamp;

			private String templateLabel;

			private Long type;

			private Long updatedAt;

			private Long workflowId;

			private Creator44 creator44;

			public Long getCreatedAt() {
				return this.createdAt;
			}

			public void setCreatedAt(Long createdAt) {
				this.createdAt = createdAt;
			}

			public String getDefaultContent() {
				return this.defaultContent;
			}

			public void setDefaultContent(String defaultContent) {
				this.defaultContent = defaultContent;
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

			public Long getPriority() {
				return this.priority;
			}

			public void setPriority(Long priority) {
				this.priority = priority;
			}

			public String getProjectSign() {
				return this.projectSign;
			}

			public void setProjectSign(String projectSign) {
				this.projectSign = projectSign;
			}

			public String getStamp() {
				return this.stamp;
			}

			public void setStamp(String stamp) {
				this.stamp = stamp;
			}

			public String getTemplateLabel() {
				return this.templateLabel;
			}

			public void setTemplateLabel(String templateLabel) {
				this.templateLabel = templateLabel;
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

			public Long getWorkflowId() {
				return this.workflowId;
			}

			public void setWorkflowId(Long workflowId) {
				this.workflowId = workflowId;
			}

			public Creator44 getCreator44() {
				return this.creator44;
			}

			public void setCreator44(Creator44 creator44) {
				this.creator44 = creator44;
			}

			public static class Creator44 {

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

				private List<String> tenants45;

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

				public List<String> getTenants45() {
					return this.tenants45;
				}

				public void setTenants45(List<String> tenants45) {
					this.tenants45 = tenants45;
				}
			}
		}
	}

	@Override
	public AddLinkeLinktWorkitemrelationsResponse getInstance(UnmarshallerContext context) {
		return	AddLinkeLinktWorkitemrelationsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
