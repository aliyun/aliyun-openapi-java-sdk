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
import com.aliyuncs.sofa.transform.v20190815.ListLinkeBahamutMyreleasesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListLinkeBahamutMyreleasesResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String errorMessage;

	private String message;

	private Boolean success;

	private List<ResultItem> result;

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

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private Boolean afterFastDevDate;

		private String aoneReleaseId;

		private Boolean attachable;

		private Boolean betaRelease;

		private Boolean containPreInMultiEnv;

		private Long created;

		private Boolean dailyRelease;

		private String deadlines;

		private Boolean deleted;

		private String dependencies;

		private String externalId;

		private String greenChannelId;

		private String greenChannelName;

		private String greenChannelPortalUrl;

		private Boolean hasCreatedAppReleaseDetail;

		private String id;

		private String iterationType;

		private Long lastModified;

		private Long mergeStartTime;

		private Boolean multiEnvRelease;

		private String name;

		private Long releaseDate;

		private String status;

		private Boolean tagAndMergeMasterWhenEmergency;

		private String tenantId;

		private String ticket;

		private String type;

		private Boolean windowRelease;

		private List<ManagersItem> managers;

		private List<StagesItem> stages;

		private List<TenantReleaseInfosItem> tenantReleaseInfos;

		private List<String> delAppMetaIds;

		private AppGroup appGroup;

		private Creator creator;

		public Boolean getAfterFastDevDate() {
			return this.afterFastDevDate;
		}

		public void setAfterFastDevDate(Boolean afterFastDevDate) {
			this.afterFastDevDate = afterFastDevDate;
		}

		public String getAoneReleaseId() {
			return this.aoneReleaseId;
		}

		public void setAoneReleaseId(String aoneReleaseId) {
			this.aoneReleaseId = aoneReleaseId;
		}

		public Boolean getAttachable() {
			return this.attachable;
		}

		public void setAttachable(Boolean attachable) {
			this.attachable = attachable;
		}

		public Boolean getBetaRelease() {
			return this.betaRelease;
		}

		public void setBetaRelease(Boolean betaRelease) {
			this.betaRelease = betaRelease;
		}

		public Boolean getContainPreInMultiEnv() {
			return this.containPreInMultiEnv;
		}

		public void setContainPreInMultiEnv(Boolean containPreInMultiEnv) {
			this.containPreInMultiEnv = containPreInMultiEnv;
		}

		public Long getCreated() {
			return this.created;
		}

		public void setCreated(Long created) {
			this.created = created;
		}

		public Boolean getDailyRelease() {
			return this.dailyRelease;
		}

		public void setDailyRelease(Boolean dailyRelease) {
			this.dailyRelease = dailyRelease;
		}

		public String getDeadlines() {
			return this.deadlines;
		}

		public void setDeadlines(String deadlines) {
			this.deadlines = deadlines;
		}

		public Boolean getDeleted() {
			return this.deleted;
		}

		public void setDeleted(Boolean deleted) {
			this.deleted = deleted;
		}

		public String getDependencies() {
			return this.dependencies;
		}

		public void setDependencies(String dependencies) {
			this.dependencies = dependencies;
		}

		public String getExternalId() {
			return this.externalId;
		}

		public void setExternalId(String externalId) {
			this.externalId = externalId;
		}

		public String getGreenChannelId() {
			return this.greenChannelId;
		}

		public void setGreenChannelId(String greenChannelId) {
			this.greenChannelId = greenChannelId;
		}

		public String getGreenChannelName() {
			return this.greenChannelName;
		}

		public void setGreenChannelName(String greenChannelName) {
			this.greenChannelName = greenChannelName;
		}

		public String getGreenChannelPortalUrl() {
			return this.greenChannelPortalUrl;
		}

		public void setGreenChannelPortalUrl(String greenChannelPortalUrl) {
			this.greenChannelPortalUrl = greenChannelPortalUrl;
		}

		public Boolean getHasCreatedAppReleaseDetail() {
			return this.hasCreatedAppReleaseDetail;
		}

		public void setHasCreatedAppReleaseDetail(Boolean hasCreatedAppReleaseDetail) {
			this.hasCreatedAppReleaseDetail = hasCreatedAppReleaseDetail;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getIterationType() {
			return this.iterationType;
		}

		public void setIterationType(String iterationType) {
			this.iterationType = iterationType;
		}

		public Long getLastModified() {
			return this.lastModified;
		}

		public void setLastModified(Long lastModified) {
			this.lastModified = lastModified;
		}

		public Long getMergeStartTime() {
			return this.mergeStartTime;
		}

		public void setMergeStartTime(Long mergeStartTime) {
			this.mergeStartTime = mergeStartTime;
		}

		public Boolean getMultiEnvRelease() {
			return this.multiEnvRelease;
		}

		public void setMultiEnvRelease(Boolean multiEnvRelease) {
			this.multiEnvRelease = multiEnvRelease;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getReleaseDate() {
			return this.releaseDate;
		}

		public void setReleaseDate(Long releaseDate) {
			this.releaseDate = releaseDate;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Boolean getTagAndMergeMasterWhenEmergency() {
			return this.tagAndMergeMasterWhenEmergency;
		}

		public void setTagAndMergeMasterWhenEmergency(Boolean tagAndMergeMasterWhenEmergency) {
			this.tagAndMergeMasterWhenEmergency = tagAndMergeMasterWhenEmergency;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}

		public String getTicket() {
			return this.ticket;
		}

		public void setTicket(String ticket) {
			this.ticket = ticket;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Boolean getWindowRelease() {
			return this.windowRelease;
		}

		public void setWindowRelease(Boolean windowRelease) {
			this.windowRelease = windowRelease;
		}

		public List<ManagersItem> getManagers() {
			return this.managers;
		}

		public void setManagers(List<ManagersItem> managers) {
			this.managers = managers;
		}

		public List<StagesItem> getStages() {
			return this.stages;
		}

		public void setStages(List<StagesItem> stages) {
			this.stages = stages;
		}

		public List<TenantReleaseInfosItem> getTenantReleaseInfos() {
			return this.tenantReleaseInfos;
		}

		public void setTenantReleaseInfos(List<TenantReleaseInfosItem> tenantReleaseInfos) {
			this.tenantReleaseInfos = tenantReleaseInfos;
		}

		public List<String> getDelAppMetaIds() {
			return this.delAppMetaIds;
		}

		public void setDelAppMetaIds(List<String> delAppMetaIds) {
			this.delAppMetaIds = delAppMetaIds;
		}

		public AppGroup getAppGroup() {
			return this.appGroup;
		}

		public void setAppGroup(AppGroup appGroup) {
			this.appGroup = appGroup;
		}

		public Creator getCreator() {
			return this.creator;
		}

		public void setCreator(Creator creator) {
			this.creator = creator;
		}

		public static class ManagersItem {

			private String account;

			private Long created;

			private String customer;

			private Boolean deleted;

			private String department;

			private String email;

			private String empId;

			private String id;

			private Long lastLogin;

			private Long lastModified;

			private String name;

			private String nick;

			private String uid;

			private String uniqueId;

			private String ww;

			private List<String> tenants;

			public String getAccount() {
				return this.account;
			}

			public void setAccount(String account) {
				this.account = account;
			}

			public Long getCreated() {
				return this.created;
			}

			public void setCreated(Long created) {
				this.created = created;
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

			public String getDepartment() {
				return this.department;
			}

			public void setDepartment(String department) {
				this.department = department;
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

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public Long getLastLogin() {
				return this.lastLogin;
			}

			public void setLastLogin(Long lastLogin) {
				this.lastLogin = lastLogin;
			}

			public Long getLastModified() {
				return this.lastModified;
			}

			public void setLastModified(Long lastModified) {
				this.lastModified = lastModified;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getNick() {
				return this.nick;
			}

			public void setNick(String nick) {
				this.nick = nick;
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

			public String getWw() {
				return this.ww;
			}

			public void setWw(String ww) {
				this.ww = ww;
			}

			public List<String> getTenants() {
				return this.tenants;
			}

			public void setTenants(List<String> tenants) {
				this.tenants = tenants;
			}
		}

		public static class StagesItem {

			private String displayName;

			private String name;

			private String releaseStatus;

			private String status;

			public String getDisplayName() {
				return this.displayName;
			}

			public void setDisplayName(String displayName) {
				this.displayName = displayName;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getReleaseStatus() {
				return this.releaseStatus;
			}

			public void setReleaseStatus(String releaseStatus) {
				this.releaseStatus = releaseStatus;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}

		public static class TenantReleaseInfosItem {

			private String cloudTenantId;

			private String cloudTenantName;

			private PreEnvReleaseInfo preEnvReleaseInfo;

			private ProdEnvReleaseInfo prodEnvReleaseInfo;

			public String getCloudTenantId() {
				return this.cloudTenantId;
			}

			public void setCloudTenantId(String cloudTenantId) {
				this.cloudTenantId = cloudTenantId;
			}

			public String getCloudTenantName() {
				return this.cloudTenantName;
			}

			public void setCloudTenantName(String cloudTenantName) {
				this.cloudTenantName = cloudTenantName;
			}

			public PreEnvReleaseInfo getPreEnvReleaseInfo() {
				return this.preEnvReleaseInfo;
			}

			public void setPreEnvReleaseInfo(PreEnvReleaseInfo preEnvReleaseInfo) {
				this.preEnvReleaseInfo = preEnvReleaseInfo;
			}

			public ProdEnvReleaseInfo getProdEnvReleaseInfo() {
				return this.prodEnvReleaseInfo;
			}

			public void setProdEnvReleaseInfo(ProdEnvReleaseInfo prodEnvReleaseInfo) {
				this.prodEnvReleaseInfo = prodEnvReleaseInfo;
			}

			public static class PreEnvReleaseInfo {

				private String envId;

				private String info;

				private String status;

				private String ticket;

				private String type;

				private String workspaceId;

				private String workspaceName;

				public String getEnvId() {
					return this.envId;
				}

				public void setEnvId(String envId) {
					this.envId = envId;
				}

				public String getInfo() {
					return this.info;
				}

				public void setInfo(String info) {
					this.info = info;
				}

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public String getTicket() {
					return this.ticket;
				}

				public void setTicket(String ticket) {
					this.ticket = ticket;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getWorkspaceId() {
					return this.workspaceId;
				}

				public void setWorkspaceId(String workspaceId) {
					this.workspaceId = workspaceId;
				}

				public String getWorkspaceName() {
					return this.workspaceName;
				}

				public void setWorkspaceName(String workspaceName) {
					this.workspaceName = workspaceName;
				}
			}

			public static class ProdEnvReleaseInfo {

				private String envId;

				private String info;

				private String status;

				private String ticket;

				private String type;

				private String workspaceId;

				private String workspaceName;

				public String getEnvId() {
					return this.envId;
				}

				public void setEnvId(String envId) {
					this.envId = envId;
				}

				public String getInfo() {
					return this.info;
				}

				public void setInfo(String info) {
					this.info = info;
				}

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public String getTicket() {
					return this.ticket;
				}

				public void setTicket(String ticket) {
					this.ticket = ticket;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getWorkspaceId() {
					return this.workspaceId;
				}

				public void setWorkspaceId(String workspaceId) {
					this.workspaceId = workspaceId;
				}

				public String getWorkspaceName() {
					return this.workspaceName;
				}

				public void setWorkspaceName(String workspaceName) {
					this.workspaceName = workspaceName;
				}
			}
		}

		public static class AppGroup {

			private Long created;

			private Boolean deleted;

			private String id;

			private Long lastModified;

			private String name;

			private String remark;

			private String type;

			private List<AdminsItem> admins;

			private List<String> appList;

			private Creator1 creator1;

			private ModifiyUser modifiyUser;

			private Tenant tenant;

			public Long getCreated() {
				return this.created;
			}

			public void setCreated(Long created) {
				this.created = created;
			}

			public Boolean getDeleted() {
				return this.deleted;
			}

			public void setDeleted(Boolean deleted) {
				this.deleted = deleted;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public Long getLastModified() {
				return this.lastModified;
			}

			public void setLastModified(Long lastModified) {
				this.lastModified = lastModified;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getRemark() {
				return this.remark;
			}

			public void setRemark(String remark) {
				this.remark = remark;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public List<AdminsItem> getAdmins() {
				return this.admins;
			}

			public void setAdmins(List<AdminsItem> admins) {
				this.admins = admins;
			}

			public List<String> getAppList() {
				return this.appList;
			}

			public void setAppList(List<String> appList) {
				this.appList = appList;
			}

			public Creator1 getCreator1() {
				return this.creator1;
			}

			public void setCreator1(Creator1 creator1) {
				this.creator1 = creator1;
			}

			public ModifiyUser getModifiyUser() {
				return this.modifiyUser;
			}

			public void setModifiyUser(ModifiyUser modifiyUser) {
				this.modifiyUser = modifiyUser;
			}

			public Tenant getTenant() {
				return this.tenant;
			}

			public void setTenant(Tenant tenant) {
				this.tenant = tenant;
			}

			public static class AdminsItem {

				private String account;

				private Long created;

				private String customer;

				private Boolean deleted;

				private String department;

				private String email;

				private String empId;

				private String id;

				private Long lastLogin;

				private Long lastModified;

				private String name;

				private String nick;

				private String uid;

				private String uniqueId;

				private String ww;

				private List<String> tenants2;

				public String getAccount() {
					return this.account;
				}

				public void setAccount(String account) {
					this.account = account;
				}

				public Long getCreated() {
					return this.created;
				}

				public void setCreated(Long created) {
					this.created = created;
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

				public String getDepartment() {
					return this.department;
				}

				public void setDepartment(String department) {
					this.department = department;
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

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public Long getLastLogin() {
					return this.lastLogin;
				}

				public void setLastLogin(Long lastLogin) {
					this.lastLogin = lastLogin;
				}

				public Long getLastModified() {
					return this.lastModified;
				}

				public void setLastModified(Long lastModified) {
					this.lastModified = lastModified;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getNick() {
					return this.nick;
				}

				public void setNick(String nick) {
					this.nick = nick;
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

				public String getWw() {
					return this.ww;
				}

				public void setWw(String ww) {
					this.ww = ww;
				}

				public List<String> getTenants2() {
					return this.tenants2;
				}

				public void setTenants2(List<String> tenants2) {
					this.tenants2 = tenants2;
				}
			}

			public static class Creator1 {

				private String account;

				private Long created;

				private String customer;

				private Boolean deleted;

				private String department;

				private String email;

				private String empId;

				private String id;

				private Long lastLogin;

				private Long lastModified;

				private String name;

				private String nick;

				private String uid;

				private String uniqueId;

				private String ww;

				private List<String> tenants3;

				public String getAccount() {
					return this.account;
				}

				public void setAccount(String account) {
					this.account = account;
				}

				public Long getCreated() {
					return this.created;
				}

				public void setCreated(Long created) {
					this.created = created;
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

				public String getDepartment() {
					return this.department;
				}

				public void setDepartment(String department) {
					this.department = department;
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

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public Long getLastLogin() {
					return this.lastLogin;
				}

				public void setLastLogin(Long lastLogin) {
					this.lastLogin = lastLogin;
				}

				public Long getLastModified() {
					return this.lastModified;
				}

				public void setLastModified(Long lastModified) {
					this.lastModified = lastModified;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getNick() {
					return this.nick;
				}

				public void setNick(String nick) {
					this.nick = nick;
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

				public String getWw() {
					return this.ww;
				}

				public void setWw(String ww) {
					this.ww = ww;
				}

				public List<String> getTenants3() {
					return this.tenants3;
				}

				public void setTenants3(List<String> tenants3) {
					this.tenants3 = tenants3;
				}
			}

			public static class ModifiyUser {

				private String account;

				private Long created;

				private String customer;

				private Boolean deleted;

				private String department;

				private String email;

				private String empId;

				private String id;

				private Long lastLogin;

				private Long lastModified;

				private String name;

				private String nick;

				private String uid;

				private String uniqueId;

				private String ww;

				private List<String> tenants4;

				public String getAccount() {
					return this.account;
				}

				public void setAccount(String account) {
					this.account = account;
				}

				public Long getCreated() {
					return this.created;
				}

				public void setCreated(Long created) {
					this.created = created;
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

				public String getDepartment() {
					return this.department;
				}

				public void setDepartment(String department) {
					this.department = department;
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

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public Long getLastLogin() {
					return this.lastLogin;
				}

				public void setLastLogin(Long lastLogin) {
					this.lastLogin = lastLogin;
				}

				public Long getLastModified() {
					return this.lastModified;
				}

				public void setLastModified(Long lastModified) {
					this.lastModified = lastModified;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getNick() {
					return this.nick;
				}

				public void setNick(String nick) {
					this.nick = nick;
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

				public String getWw() {
					return this.ww;
				}

				public void setWw(String ww) {
					this.ww = ww;
				}

				public List<String> getTenants4() {
					return this.tenants4;
				}

				public void setTenants4(List<String> tenants4) {
					this.tenants4 = tenants4;
				}
			}

			public static class Tenant {

				private String accessKey;

				private String accessSecret;

				private String accessToken;

				private Long created;

				private String customer;

				private Boolean deleted;

				private String displayName;

				private Long dropQualityApprovslDate;

				private String endPoint;

				private String externalId;

				private Boolean fromAliyun;

				private Boolean haveNotInited;

				private String id;

				private String initStep;

				private Long lastModified;

				private String name;

				private Boolean openMyBankControl;

				private String path;

				private Boolean useConfigTypes;

				private Boolean yunYou;

				private List<String> authorizedUsers;

				private List<String> configTypes;

				private List<String> sitMergeTrialList;

				private List<String> trialList;

				private List<String> zoneModeList;

				public String getAccessKey() {
					return this.accessKey;
				}

				public void setAccessKey(String accessKey) {
					this.accessKey = accessKey;
				}

				public String getAccessSecret() {
					return this.accessSecret;
				}

				public void setAccessSecret(String accessSecret) {
					this.accessSecret = accessSecret;
				}

				public String getAccessToken() {
					return this.accessToken;
				}

				public void setAccessToken(String accessToken) {
					this.accessToken = accessToken;
				}

				public Long getCreated() {
					return this.created;
				}

				public void setCreated(Long created) {
					this.created = created;
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

				public String getDisplayName() {
					return this.displayName;
				}

				public void setDisplayName(String displayName) {
					this.displayName = displayName;
				}

				public Long getDropQualityApprovslDate() {
					return this.dropQualityApprovslDate;
				}

				public void setDropQualityApprovslDate(Long dropQualityApprovslDate) {
					this.dropQualityApprovslDate = dropQualityApprovslDate;
				}

				public String getEndPoint() {
					return this.endPoint;
				}

				public void setEndPoint(String endPoint) {
					this.endPoint = endPoint;
				}

				public String getExternalId() {
					return this.externalId;
				}

				public void setExternalId(String externalId) {
					this.externalId = externalId;
				}

				public Boolean getFromAliyun() {
					return this.fromAliyun;
				}

				public void setFromAliyun(Boolean fromAliyun) {
					this.fromAliyun = fromAliyun;
				}

				public Boolean getHaveNotInited() {
					return this.haveNotInited;
				}

				public void setHaveNotInited(Boolean haveNotInited) {
					this.haveNotInited = haveNotInited;
				}

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getInitStep() {
					return this.initStep;
				}

				public void setInitStep(String initStep) {
					this.initStep = initStep;
				}

				public Long getLastModified() {
					return this.lastModified;
				}

				public void setLastModified(Long lastModified) {
					this.lastModified = lastModified;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public Boolean getOpenMyBankControl() {
					return this.openMyBankControl;
				}

				public void setOpenMyBankControl(Boolean openMyBankControl) {
					this.openMyBankControl = openMyBankControl;
				}

				public String getPath() {
					return this.path;
				}

				public void setPath(String path) {
					this.path = path;
				}

				public Boolean getUseConfigTypes() {
					return this.useConfigTypes;
				}

				public void setUseConfigTypes(Boolean useConfigTypes) {
					this.useConfigTypes = useConfigTypes;
				}

				public Boolean getYunYou() {
					return this.yunYou;
				}

				public void setYunYou(Boolean yunYou) {
					this.yunYou = yunYou;
				}

				public List<String> getAuthorizedUsers() {
					return this.authorizedUsers;
				}

				public void setAuthorizedUsers(List<String> authorizedUsers) {
					this.authorizedUsers = authorizedUsers;
				}

				public List<String> getConfigTypes() {
					return this.configTypes;
				}

				public void setConfigTypes(List<String> configTypes) {
					this.configTypes = configTypes;
				}

				public List<String> getSitMergeTrialList() {
					return this.sitMergeTrialList;
				}

				public void setSitMergeTrialList(List<String> sitMergeTrialList) {
					this.sitMergeTrialList = sitMergeTrialList;
				}

				public List<String> getTrialList() {
					return this.trialList;
				}

				public void setTrialList(List<String> trialList) {
					this.trialList = trialList;
				}

				public List<String> getZoneModeList() {
					return this.zoneModeList;
				}

				public void setZoneModeList(List<String> zoneModeList) {
					this.zoneModeList = zoneModeList;
				}
			}
		}

		public static class Creator {

			private String account;

			private Long created;

			private String customer;

			private Boolean deleted;

			private String department;

			private String email;

			private String empId;

			private String id;

			private Long lastLogin;

			private Long lastModified;

			private String name;

			private String nick;

			private String uid;

			private String uniqueId;

			private String ww;

			private List<String> tenants5;

			public String getAccount() {
				return this.account;
			}

			public void setAccount(String account) {
				this.account = account;
			}

			public Long getCreated() {
				return this.created;
			}

			public void setCreated(Long created) {
				this.created = created;
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

			public String getDepartment() {
				return this.department;
			}

			public void setDepartment(String department) {
				this.department = department;
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

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public Long getLastLogin() {
				return this.lastLogin;
			}

			public void setLastLogin(Long lastLogin) {
				this.lastLogin = lastLogin;
			}

			public Long getLastModified() {
				return this.lastModified;
			}

			public void setLastModified(Long lastModified) {
				this.lastModified = lastModified;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getNick() {
				return this.nick;
			}

			public void setNick(String nick) {
				this.nick = nick;
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

			public String getWw() {
				return this.ww;
			}

			public void setWw(String ww) {
				this.ww = ww;
			}

			public List<String> getTenants5() {
				return this.tenants5;
			}

			public void setTenants5(List<String> tenants5) {
				this.tenants5 = tenants5;
			}
		}
	}

	@Override
	public ListLinkeBahamutMyreleasesResponse getInstance(UnmarshallerContext context) {
		return	ListLinkeBahamutMyreleasesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
