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
import com.aliyuncs.sofa.transform.v20190815.GetCASApplicationDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCASApplicationDetailResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String appDomainId;

		private String appDomainName;

		private String appLevelName;

		private String buildpackVersion;

		private String chineseName;

		private Long containerCount;

		private Long databaseCount;

		private String description;

		private String extraParams;

		private String id;

		private Boolean isService;

		private String name;

		private Long ocsCount;

		private String ownerId;

		private String ownerName;

		private Long packageCount;

		private String realOwnerName;

		private Long slbCount;

		private String stackId;

		private String stackName;

		private String stackVersion;

		private String status;

		private String tags;

		private String tenantId;

		private String utcCreate;

		private String utcModified;

		private String workspaceId;

		private List<AppExtraInfosItem> appExtraInfos;

		private List<String> domainNames;

		private AppLevel appLevel;

		private AppOwner appOwner;

		private Archetype archetype;

		private CodeRepository codeRepository;

		private LifeCycle lifeCycle;

		public String getAppDomainId() {
			return this.appDomainId;
		}

		public void setAppDomainId(String appDomainId) {
			this.appDomainId = appDomainId;
		}

		public String getAppDomainName() {
			return this.appDomainName;
		}

		public void setAppDomainName(String appDomainName) {
			this.appDomainName = appDomainName;
		}

		public String getAppLevelName() {
			return this.appLevelName;
		}

		public void setAppLevelName(String appLevelName) {
			this.appLevelName = appLevelName;
		}

		public String getBuildpackVersion() {
			return this.buildpackVersion;
		}

		public void setBuildpackVersion(String buildpackVersion) {
			this.buildpackVersion = buildpackVersion;
		}

		public String getChineseName() {
			return this.chineseName;
		}

		public void setChineseName(String chineseName) {
			this.chineseName = chineseName;
		}

		public Long getContainerCount() {
			return this.containerCount;
		}

		public void setContainerCount(Long containerCount) {
			this.containerCount = containerCount;
		}

		public Long getDatabaseCount() {
			return this.databaseCount;
		}

		public void setDatabaseCount(Long databaseCount) {
			this.databaseCount = databaseCount;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getExtraParams() {
			return this.extraParams;
		}

		public void setExtraParams(String extraParams) {
			this.extraParams = extraParams;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public Boolean getIsService() {
			return this.isService;
		}

		public void setIsService(Boolean isService) {
			this.isService = isService;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getOcsCount() {
			return this.ocsCount;
		}

		public void setOcsCount(Long ocsCount) {
			this.ocsCount = ocsCount;
		}

		public String getOwnerId() {
			return this.ownerId;
		}

		public void setOwnerId(String ownerId) {
			this.ownerId = ownerId;
		}

		public String getOwnerName() {
			return this.ownerName;
		}

		public void setOwnerName(String ownerName) {
			this.ownerName = ownerName;
		}

		public Long getPackageCount() {
			return this.packageCount;
		}

		public void setPackageCount(Long packageCount) {
			this.packageCount = packageCount;
		}

		public String getRealOwnerName() {
			return this.realOwnerName;
		}

		public void setRealOwnerName(String realOwnerName) {
			this.realOwnerName = realOwnerName;
		}

		public Long getSlbCount() {
			return this.slbCount;
		}

		public void setSlbCount(Long slbCount) {
			this.slbCount = slbCount;
		}

		public String getStackId() {
			return this.stackId;
		}

		public void setStackId(String stackId) {
			this.stackId = stackId;
		}

		public String getStackName() {
			return this.stackName;
		}

		public void setStackName(String stackName) {
			this.stackName = stackName;
		}

		public String getStackVersion() {
			return this.stackVersion;
		}

		public void setStackVersion(String stackVersion) {
			this.stackVersion = stackVersion;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getTags() {
			return this.tags;
		}

		public void setTags(String tags) {
			this.tags = tags;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}

		public String getUtcCreate() {
			return this.utcCreate;
		}

		public void setUtcCreate(String utcCreate) {
			this.utcCreate = utcCreate;
		}

		public String getUtcModified() {
			return this.utcModified;
		}

		public void setUtcModified(String utcModified) {
			this.utcModified = utcModified;
		}

		public String getWorkspaceId() {
			return this.workspaceId;
		}

		public void setWorkspaceId(String workspaceId) {
			this.workspaceId = workspaceId;
		}

		public List<AppExtraInfosItem> getAppExtraInfos() {
			return this.appExtraInfos;
		}

		public void setAppExtraInfos(List<AppExtraInfosItem> appExtraInfos) {
			this.appExtraInfos = appExtraInfos;
		}

		public List<String> getDomainNames() {
			return this.domainNames;
		}

		public void setDomainNames(List<String> domainNames) {
			this.domainNames = domainNames;
		}

		public AppLevel getAppLevel() {
			return this.appLevel;
		}

		public void setAppLevel(AppLevel appLevel) {
			this.appLevel = appLevel;
		}

		public AppOwner getAppOwner() {
			return this.appOwner;
		}

		public void setAppOwner(AppOwner appOwner) {
			this.appOwner = appOwner;
		}

		public Archetype getArchetype() {
			return this.archetype;
		}

		public void setArchetype(Archetype archetype) {
			this.archetype = archetype;
		}

		public CodeRepository getCodeRepository() {
			return this.codeRepository;
		}

		public void setCodeRepository(CodeRepository codeRepository) {
			this.codeRepository = codeRepository;
		}

		public LifeCycle getLifeCycle() {
			return this.lifeCycle;
		}

		public void setLifeCycle(LifeCycle lifeCycle) {
			this.lifeCycle = lifeCycle;
		}

		public static class AppExtraInfosItem {

			private String appExtrainfoId;

			private String appId;

			private String description;

			private String id;

			private String name;

			private String templateDataId;

			private String templateId;

			private String type;

			private String utcCreate;

			private String utcModified;

			private String value;

			public String getAppExtrainfoId() {
				return this.appExtrainfoId;
			}

			public void setAppExtrainfoId(String appExtrainfoId) {
				this.appExtrainfoId = appExtrainfoId;
			}

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
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

			public String getTemplateDataId() {
				return this.templateDataId;
			}

			public void setTemplateDataId(String templateDataId) {
				this.templateDataId = templateDataId;
			}

			public String getTemplateId() {
				return this.templateId;
			}

			public void setTemplateId(String templateId) {
				this.templateId = templateId;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getUtcCreate() {
				return this.utcCreate;
			}

			public void setUtcCreate(String utcCreate) {
				this.utcCreate = utcCreate;
			}

			public String getUtcModified() {
				return this.utcModified;
			}

			public void setUtcModified(String utcModified) {
				this.utcModified = utcModified;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}

		public static class AppLevel {

			private String creatorId;

			private String id;

			private String name;

			private String tenantId;

			private String utcCreate;

			private String utcModified;

			public String getCreatorId() {
				return this.creatorId;
			}

			public void setCreatorId(String creatorId) {
				this.creatorId = creatorId;
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

			public String getTenantId() {
				return this.tenantId;
			}

			public void setTenantId(String tenantId) {
				this.tenantId = tenantId;
			}

			public String getUtcCreate() {
				return this.utcCreate;
			}

			public void setUtcCreate(String utcCreate) {
				this.utcCreate = utcCreate;
			}

			public String getUtcModified() {
				return this.utcModified;
			}

			public void setUtcModified(String utcModified) {
				this.utcModified = utcModified;
			}
		}

		public static class AppOwner {

			private List<BackupDevArchitectsItem> backupDevArchitects;

			private List<BackupDevOwnersItem> backupDevOwners;

			private List<BackupOpsesItem> backupOpses;

			private List<BackupTestArchitectsItem> backupTestArchitects;

			private List<BackupTestOwnersItem> backupTestOwners;

			private DevArchitect devArchitect;

			private DevOwner devOwner;

			private Ops ops;

			private TestArchitect testArchitect;

			private TestOwner testOwner;

			public List<BackupDevArchitectsItem> getBackupDevArchitects() {
				return this.backupDevArchitects;
			}

			public void setBackupDevArchitects(List<BackupDevArchitectsItem> backupDevArchitects) {
				this.backupDevArchitects = backupDevArchitects;
			}

			public List<BackupDevOwnersItem> getBackupDevOwners() {
				return this.backupDevOwners;
			}

			public void setBackupDevOwners(List<BackupDevOwnersItem> backupDevOwners) {
				this.backupDevOwners = backupDevOwners;
			}

			public List<BackupOpsesItem> getBackupOpses() {
				return this.backupOpses;
			}

			public void setBackupOpses(List<BackupOpsesItem> backupOpses) {
				this.backupOpses = backupOpses;
			}

			public List<BackupTestArchitectsItem> getBackupTestArchitects() {
				return this.backupTestArchitects;
			}

			public void setBackupTestArchitects(List<BackupTestArchitectsItem> backupTestArchitects) {
				this.backupTestArchitects = backupTestArchitects;
			}

			public List<BackupTestOwnersItem> getBackupTestOwners() {
				return this.backupTestOwners;
			}

			public void setBackupTestOwners(List<BackupTestOwnersItem> backupTestOwners) {
				this.backupTestOwners = backupTestOwners;
			}

			public DevArchitect getDevArchitect() {
				return this.devArchitect;
			}

			public void setDevArchitect(DevArchitect devArchitect) {
				this.devArchitect = devArchitect;
			}

			public DevOwner getDevOwner() {
				return this.devOwner;
			}

			public void setDevOwner(DevOwner devOwner) {
				this.devOwner = devOwner;
			}

			public Ops getOps() {
				return this.ops;
			}

			public void setOps(Ops ops) {
				this.ops = ops;
			}

			public TestArchitect getTestArchitect() {
				return this.testArchitect;
			}

			public void setTestArchitect(TestArchitect testArchitect) {
				this.testArchitect = testArchitect;
			}

			public TestOwner getTestOwner() {
				return this.testOwner;
			}

			public void setTestOwner(TestOwner testOwner) {
				this.testOwner = testOwner;
			}

			public static class BackupDevArchitectsItem {

				private String customerId;

				private String email;

				private String enName;

				private String gmtCreate;

				private String gmtModified;

				private String id;

				private String imAccount;

				private String lastLogonTime;

				private String loginName;

				private String mobile;

				private String nation;

				private String nationCountry;

				private String nickName;

				private String personalPhoto;

				private String phone;

				private String realName;

				private String sex;

				private String sourceSystem;

				private String sourceUserId;

				private String status;

				private String type;

				private String workNo;

				public String getCustomerId() {
					return this.customerId;
				}

				public void setCustomerId(String customerId) {
					this.customerId = customerId;
				}

				public String getEmail() {
					return this.email;
				}

				public void setEmail(String email) {
					this.email = email;
				}

				public String getEnName() {
					return this.enName;
				}

				public void setEnName(String enName) {
					this.enName = enName;
				}

				public String getGmtCreate() {
					return this.gmtCreate;
				}

				public void setGmtCreate(String gmtCreate) {
					this.gmtCreate = gmtCreate;
				}

				public String getGmtModified() {
					return this.gmtModified;
				}

				public void setGmtModified(String gmtModified) {
					this.gmtModified = gmtModified;
				}

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getImAccount() {
					return this.imAccount;
				}

				public void setImAccount(String imAccount) {
					this.imAccount = imAccount;
				}

				public String getLastLogonTime() {
					return this.lastLogonTime;
				}

				public void setLastLogonTime(String lastLogonTime) {
					this.lastLogonTime = lastLogonTime;
				}

				public String getLoginName() {
					return this.loginName;
				}

				public void setLoginName(String loginName) {
					this.loginName = loginName;
				}

				public String getMobile() {
					return this.mobile;
				}

				public void setMobile(String mobile) {
					this.mobile = mobile;
				}

				public String getNation() {
					return this.nation;
				}

				public void setNation(String nation) {
					this.nation = nation;
				}

				public String getNationCountry() {
					return this.nationCountry;
				}

				public void setNationCountry(String nationCountry) {
					this.nationCountry = nationCountry;
				}

				public String getNickName() {
					return this.nickName;
				}

				public void setNickName(String nickName) {
					this.nickName = nickName;
				}

				public String getPersonalPhoto() {
					return this.personalPhoto;
				}

				public void setPersonalPhoto(String personalPhoto) {
					this.personalPhoto = personalPhoto;
				}

				public String getPhone() {
					return this.phone;
				}

				public void setPhone(String phone) {
					this.phone = phone;
				}

				public String getRealName() {
					return this.realName;
				}

				public void setRealName(String realName) {
					this.realName = realName;
				}

				public String getSex() {
					return this.sex;
				}

				public void setSex(String sex) {
					this.sex = sex;
				}

				public String getSourceSystem() {
					return this.sourceSystem;
				}

				public void setSourceSystem(String sourceSystem) {
					this.sourceSystem = sourceSystem;
				}

				public String getSourceUserId() {
					return this.sourceUserId;
				}

				public void setSourceUserId(String sourceUserId) {
					this.sourceUserId = sourceUserId;
				}

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getWorkNo() {
					return this.workNo;
				}

				public void setWorkNo(String workNo) {
					this.workNo = workNo;
				}
			}

			public static class BackupDevOwnersItem {

				private String customerId;

				private String email;

				private String enName;

				private String gmtCreate;

				private String gmtModified;

				private String id;

				private String imAccount;

				private String lastLogonTime;

				private String loginName;

				private String mobile;

				private String nation;

				private String nationCountry;

				private String nickName;

				private String personalPhoto;

				private String phone;

				private String realName;

				private String sex;

				private String sourceSystem;

				private String sourceUserId;

				private String status;

				private String type;

				private String workNo;

				public String getCustomerId() {
					return this.customerId;
				}

				public void setCustomerId(String customerId) {
					this.customerId = customerId;
				}

				public String getEmail() {
					return this.email;
				}

				public void setEmail(String email) {
					this.email = email;
				}

				public String getEnName() {
					return this.enName;
				}

				public void setEnName(String enName) {
					this.enName = enName;
				}

				public String getGmtCreate() {
					return this.gmtCreate;
				}

				public void setGmtCreate(String gmtCreate) {
					this.gmtCreate = gmtCreate;
				}

				public String getGmtModified() {
					return this.gmtModified;
				}

				public void setGmtModified(String gmtModified) {
					this.gmtModified = gmtModified;
				}

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getImAccount() {
					return this.imAccount;
				}

				public void setImAccount(String imAccount) {
					this.imAccount = imAccount;
				}

				public String getLastLogonTime() {
					return this.lastLogonTime;
				}

				public void setLastLogonTime(String lastLogonTime) {
					this.lastLogonTime = lastLogonTime;
				}

				public String getLoginName() {
					return this.loginName;
				}

				public void setLoginName(String loginName) {
					this.loginName = loginName;
				}

				public String getMobile() {
					return this.mobile;
				}

				public void setMobile(String mobile) {
					this.mobile = mobile;
				}

				public String getNation() {
					return this.nation;
				}

				public void setNation(String nation) {
					this.nation = nation;
				}

				public String getNationCountry() {
					return this.nationCountry;
				}

				public void setNationCountry(String nationCountry) {
					this.nationCountry = nationCountry;
				}

				public String getNickName() {
					return this.nickName;
				}

				public void setNickName(String nickName) {
					this.nickName = nickName;
				}

				public String getPersonalPhoto() {
					return this.personalPhoto;
				}

				public void setPersonalPhoto(String personalPhoto) {
					this.personalPhoto = personalPhoto;
				}

				public String getPhone() {
					return this.phone;
				}

				public void setPhone(String phone) {
					this.phone = phone;
				}

				public String getRealName() {
					return this.realName;
				}

				public void setRealName(String realName) {
					this.realName = realName;
				}

				public String getSex() {
					return this.sex;
				}

				public void setSex(String sex) {
					this.sex = sex;
				}

				public String getSourceSystem() {
					return this.sourceSystem;
				}

				public void setSourceSystem(String sourceSystem) {
					this.sourceSystem = sourceSystem;
				}

				public String getSourceUserId() {
					return this.sourceUserId;
				}

				public void setSourceUserId(String sourceUserId) {
					this.sourceUserId = sourceUserId;
				}

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getWorkNo() {
					return this.workNo;
				}

				public void setWorkNo(String workNo) {
					this.workNo = workNo;
				}
			}

			public static class BackupOpsesItem {

				private String customerId;

				private String email;

				private String enName;

				private String gmtCreate;

				private String gmtModified;

				private String id;

				private String imAccount;

				private String lastLogonTime;

				private String loginName;

				private String mobile;

				private String nation;

				private String nationCountry;

				private String nickName;

				private String personalPhoto;

				private String phone;

				private String realName;

				private String sex;

				private String sourceSystem;

				private String sourceUserId;

				private String status;

				private String type;

				private String workNo;

				public String getCustomerId() {
					return this.customerId;
				}

				public void setCustomerId(String customerId) {
					this.customerId = customerId;
				}

				public String getEmail() {
					return this.email;
				}

				public void setEmail(String email) {
					this.email = email;
				}

				public String getEnName() {
					return this.enName;
				}

				public void setEnName(String enName) {
					this.enName = enName;
				}

				public String getGmtCreate() {
					return this.gmtCreate;
				}

				public void setGmtCreate(String gmtCreate) {
					this.gmtCreate = gmtCreate;
				}

				public String getGmtModified() {
					return this.gmtModified;
				}

				public void setGmtModified(String gmtModified) {
					this.gmtModified = gmtModified;
				}

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getImAccount() {
					return this.imAccount;
				}

				public void setImAccount(String imAccount) {
					this.imAccount = imAccount;
				}

				public String getLastLogonTime() {
					return this.lastLogonTime;
				}

				public void setLastLogonTime(String lastLogonTime) {
					this.lastLogonTime = lastLogonTime;
				}

				public String getLoginName() {
					return this.loginName;
				}

				public void setLoginName(String loginName) {
					this.loginName = loginName;
				}

				public String getMobile() {
					return this.mobile;
				}

				public void setMobile(String mobile) {
					this.mobile = mobile;
				}

				public String getNation() {
					return this.nation;
				}

				public void setNation(String nation) {
					this.nation = nation;
				}

				public String getNationCountry() {
					return this.nationCountry;
				}

				public void setNationCountry(String nationCountry) {
					this.nationCountry = nationCountry;
				}

				public String getNickName() {
					return this.nickName;
				}

				public void setNickName(String nickName) {
					this.nickName = nickName;
				}

				public String getPersonalPhoto() {
					return this.personalPhoto;
				}

				public void setPersonalPhoto(String personalPhoto) {
					this.personalPhoto = personalPhoto;
				}

				public String getPhone() {
					return this.phone;
				}

				public void setPhone(String phone) {
					this.phone = phone;
				}

				public String getRealName() {
					return this.realName;
				}

				public void setRealName(String realName) {
					this.realName = realName;
				}

				public String getSex() {
					return this.sex;
				}

				public void setSex(String sex) {
					this.sex = sex;
				}

				public String getSourceSystem() {
					return this.sourceSystem;
				}

				public void setSourceSystem(String sourceSystem) {
					this.sourceSystem = sourceSystem;
				}

				public String getSourceUserId() {
					return this.sourceUserId;
				}

				public void setSourceUserId(String sourceUserId) {
					this.sourceUserId = sourceUserId;
				}

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getWorkNo() {
					return this.workNo;
				}

				public void setWorkNo(String workNo) {
					this.workNo = workNo;
				}
			}

			public static class BackupTestArchitectsItem {

				private String customerId;

				private String email;

				private String enName;

				private String gmtCreate;

				private String gmtModified;

				private String id;

				private String imAccount;

				private String lastLogonTime;

				private String loginName;

				private String mobile;

				private String nation;

				private String nationCountry;

				private String nickName;

				private String personalPhoto;

				private String phone;

				private String realName;

				private String sex;

				private String sourceSystem;

				private String sourceUserId;

				private String status;

				private String type;

				private String workNo;

				public String getCustomerId() {
					return this.customerId;
				}

				public void setCustomerId(String customerId) {
					this.customerId = customerId;
				}

				public String getEmail() {
					return this.email;
				}

				public void setEmail(String email) {
					this.email = email;
				}

				public String getEnName() {
					return this.enName;
				}

				public void setEnName(String enName) {
					this.enName = enName;
				}

				public String getGmtCreate() {
					return this.gmtCreate;
				}

				public void setGmtCreate(String gmtCreate) {
					this.gmtCreate = gmtCreate;
				}

				public String getGmtModified() {
					return this.gmtModified;
				}

				public void setGmtModified(String gmtModified) {
					this.gmtModified = gmtModified;
				}

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getImAccount() {
					return this.imAccount;
				}

				public void setImAccount(String imAccount) {
					this.imAccount = imAccount;
				}

				public String getLastLogonTime() {
					return this.lastLogonTime;
				}

				public void setLastLogonTime(String lastLogonTime) {
					this.lastLogonTime = lastLogonTime;
				}

				public String getLoginName() {
					return this.loginName;
				}

				public void setLoginName(String loginName) {
					this.loginName = loginName;
				}

				public String getMobile() {
					return this.mobile;
				}

				public void setMobile(String mobile) {
					this.mobile = mobile;
				}

				public String getNation() {
					return this.nation;
				}

				public void setNation(String nation) {
					this.nation = nation;
				}

				public String getNationCountry() {
					return this.nationCountry;
				}

				public void setNationCountry(String nationCountry) {
					this.nationCountry = nationCountry;
				}

				public String getNickName() {
					return this.nickName;
				}

				public void setNickName(String nickName) {
					this.nickName = nickName;
				}

				public String getPersonalPhoto() {
					return this.personalPhoto;
				}

				public void setPersonalPhoto(String personalPhoto) {
					this.personalPhoto = personalPhoto;
				}

				public String getPhone() {
					return this.phone;
				}

				public void setPhone(String phone) {
					this.phone = phone;
				}

				public String getRealName() {
					return this.realName;
				}

				public void setRealName(String realName) {
					this.realName = realName;
				}

				public String getSex() {
					return this.sex;
				}

				public void setSex(String sex) {
					this.sex = sex;
				}

				public String getSourceSystem() {
					return this.sourceSystem;
				}

				public void setSourceSystem(String sourceSystem) {
					this.sourceSystem = sourceSystem;
				}

				public String getSourceUserId() {
					return this.sourceUserId;
				}

				public void setSourceUserId(String sourceUserId) {
					this.sourceUserId = sourceUserId;
				}

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getWorkNo() {
					return this.workNo;
				}

				public void setWorkNo(String workNo) {
					this.workNo = workNo;
				}
			}

			public static class BackupTestOwnersItem {

				private String customerId;

				private String email;

				private String enName;

				private String gmtCreate;

				private String gmtModified;

				private String id;

				private String imAccount;

				private String lastLogonTime;

				private String loginName;

				private String mobile;

				private String nation;

				private String nationCountry;

				private String nickName;

				private String personalPhoto;

				private String phone;

				private String realName;

				private String sex;

				private String sourceSystem;

				private String sourceUserId;

				private String status;

				private String type;

				private String workNo;

				public String getCustomerId() {
					return this.customerId;
				}

				public void setCustomerId(String customerId) {
					this.customerId = customerId;
				}

				public String getEmail() {
					return this.email;
				}

				public void setEmail(String email) {
					this.email = email;
				}

				public String getEnName() {
					return this.enName;
				}

				public void setEnName(String enName) {
					this.enName = enName;
				}

				public String getGmtCreate() {
					return this.gmtCreate;
				}

				public void setGmtCreate(String gmtCreate) {
					this.gmtCreate = gmtCreate;
				}

				public String getGmtModified() {
					return this.gmtModified;
				}

				public void setGmtModified(String gmtModified) {
					this.gmtModified = gmtModified;
				}

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getImAccount() {
					return this.imAccount;
				}

				public void setImAccount(String imAccount) {
					this.imAccount = imAccount;
				}

				public String getLastLogonTime() {
					return this.lastLogonTime;
				}

				public void setLastLogonTime(String lastLogonTime) {
					this.lastLogonTime = lastLogonTime;
				}

				public String getLoginName() {
					return this.loginName;
				}

				public void setLoginName(String loginName) {
					this.loginName = loginName;
				}

				public String getMobile() {
					return this.mobile;
				}

				public void setMobile(String mobile) {
					this.mobile = mobile;
				}

				public String getNation() {
					return this.nation;
				}

				public void setNation(String nation) {
					this.nation = nation;
				}

				public String getNationCountry() {
					return this.nationCountry;
				}

				public void setNationCountry(String nationCountry) {
					this.nationCountry = nationCountry;
				}

				public String getNickName() {
					return this.nickName;
				}

				public void setNickName(String nickName) {
					this.nickName = nickName;
				}

				public String getPersonalPhoto() {
					return this.personalPhoto;
				}

				public void setPersonalPhoto(String personalPhoto) {
					this.personalPhoto = personalPhoto;
				}

				public String getPhone() {
					return this.phone;
				}

				public void setPhone(String phone) {
					this.phone = phone;
				}

				public String getRealName() {
					return this.realName;
				}

				public void setRealName(String realName) {
					this.realName = realName;
				}

				public String getSex() {
					return this.sex;
				}

				public void setSex(String sex) {
					this.sex = sex;
				}

				public String getSourceSystem() {
					return this.sourceSystem;
				}

				public void setSourceSystem(String sourceSystem) {
					this.sourceSystem = sourceSystem;
				}

				public String getSourceUserId() {
					return this.sourceUserId;
				}

				public void setSourceUserId(String sourceUserId) {
					this.sourceUserId = sourceUserId;
				}

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getWorkNo() {
					return this.workNo;
				}

				public void setWorkNo(String workNo) {
					this.workNo = workNo;
				}
			}

			public static class DevArchitect {

				private String customerId;

				private String email;

				private String enName;

				private String gmtCreate;

				private String gmtModified;

				private String id;

				private String imAccount;

				private String lastLogonTime;

				private String loginName;

				private String mobile;

				private String nation;

				private String nationCountry;

				private String nickName;

				private String personalPhoto;

				private String phone;

				private String realName;

				private String sex;

				private String sourceSystem;

				private String sourceUserId;

				private String status;

				private String type;

				private String workNo;

				public String getCustomerId() {
					return this.customerId;
				}

				public void setCustomerId(String customerId) {
					this.customerId = customerId;
				}

				public String getEmail() {
					return this.email;
				}

				public void setEmail(String email) {
					this.email = email;
				}

				public String getEnName() {
					return this.enName;
				}

				public void setEnName(String enName) {
					this.enName = enName;
				}

				public String getGmtCreate() {
					return this.gmtCreate;
				}

				public void setGmtCreate(String gmtCreate) {
					this.gmtCreate = gmtCreate;
				}

				public String getGmtModified() {
					return this.gmtModified;
				}

				public void setGmtModified(String gmtModified) {
					this.gmtModified = gmtModified;
				}

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getImAccount() {
					return this.imAccount;
				}

				public void setImAccount(String imAccount) {
					this.imAccount = imAccount;
				}

				public String getLastLogonTime() {
					return this.lastLogonTime;
				}

				public void setLastLogonTime(String lastLogonTime) {
					this.lastLogonTime = lastLogonTime;
				}

				public String getLoginName() {
					return this.loginName;
				}

				public void setLoginName(String loginName) {
					this.loginName = loginName;
				}

				public String getMobile() {
					return this.mobile;
				}

				public void setMobile(String mobile) {
					this.mobile = mobile;
				}

				public String getNation() {
					return this.nation;
				}

				public void setNation(String nation) {
					this.nation = nation;
				}

				public String getNationCountry() {
					return this.nationCountry;
				}

				public void setNationCountry(String nationCountry) {
					this.nationCountry = nationCountry;
				}

				public String getNickName() {
					return this.nickName;
				}

				public void setNickName(String nickName) {
					this.nickName = nickName;
				}

				public String getPersonalPhoto() {
					return this.personalPhoto;
				}

				public void setPersonalPhoto(String personalPhoto) {
					this.personalPhoto = personalPhoto;
				}

				public String getPhone() {
					return this.phone;
				}

				public void setPhone(String phone) {
					this.phone = phone;
				}

				public String getRealName() {
					return this.realName;
				}

				public void setRealName(String realName) {
					this.realName = realName;
				}

				public String getSex() {
					return this.sex;
				}

				public void setSex(String sex) {
					this.sex = sex;
				}

				public String getSourceSystem() {
					return this.sourceSystem;
				}

				public void setSourceSystem(String sourceSystem) {
					this.sourceSystem = sourceSystem;
				}

				public String getSourceUserId() {
					return this.sourceUserId;
				}

				public void setSourceUserId(String sourceUserId) {
					this.sourceUserId = sourceUserId;
				}

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getWorkNo() {
					return this.workNo;
				}

				public void setWorkNo(String workNo) {
					this.workNo = workNo;
				}
			}

			public static class DevOwner {

				private String customerId;

				private String email;

				private String enName;

				private String gmtCreate;

				private String gmtModified;

				private String id;

				private String imAccount;

				private String lastLogonTime;

				private String loginName;

				private String mobile;

				private String nation;

				private String nationCountry;

				private String nickName;

				private String personalPhoto;

				private String phone;

				private String realName;

				private String sex;

				private String sourceSystem;

				private String sourceUserId;

				private String status;

				private String type;

				private String workNo;

				public String getCustomerId() {
					return this.customerId;
				}

				public void setCustomerId(String customerId) {
					this.customerId = customerId;
				}

				public String getEmail() {
					return this.email;
				}

				public void setEmail(String email) {
					this.email = email;
				}

				public String getEnName() {
					return this.enName;
				}

				public void setEnName(String enName) {
					this.enName = enName;
				}

				public String getGmtCreate() {
					return this.gmtCreate;
				}

				public void setGmtCreate(String gmtCreate) {
					this.gmtCreate = gmtCreate;
				}

				public String getGmtModified() {
					return this.gmtModified;
				}

				public void setGmtModified(String gmtModified) {
					this.gmtModified = gmtModified;
				}

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getImAccount() {
					return this.imAccount;
				}

				public void setImAccount(String imAccount) {
					this.imAccount = imAccount;
				}

				public String getLastLogonTime() {
					return this.lastLogonTime;
				}

				public void setLastLogonTime(String lastLogonTime) {
					this.lastLogonTime = lastLogonTime;
				}

				public String getLoginName() {
					return this.loginName;
				}

				public void setLoginName(String loginName) {
					this.loginName = loginName;
				}

				public String getMobile() {
					return this.mobile;
				}

				public void setMobile(String mobile) {
					this.mobile = mobile;
				}

				public String getNation() {
					return this.nation;
				}

				public void setNation(String nation) {
					this.nation = nation;
				}

				public String getNationCountry() {
					return this.nationCountry;
				}

				public void setNationCountry(String nationCountry) {
					this.nationCountry = nationCountry;
				}

				public String getNickName() {
					return this.nickName;
				}

				public void setNickName(String nickName) {
					this.nickName = nickName;
				}

				public String getPersonalPhoto() {
					return this.personalPhoto;
				}

				public void setPersonalPhoto(String personalPhoto) {
					this.personalPhoto = personalPhoto;
				}

				public String getPhone() {
					return this.phone;
				}

				public void setPhone(String phone) {
					this.phone = phone;
				}

				public String getRealName() {
					return this.realName;
				}

				public void setRealName(String realName) {
					this.realName = realName;
				}

				public String getSex() {
					return this.sex;
				}

				public void setSex(String sex) {
					this.sex = sex;
				}

				public String getSourceSystem() {
					return this.sourceSystem;
				}

				public void setSourceSystem(String sourceSystem) {
					this.sourceSystem = sourceSystem;
				}

				public String getSourceUserId() {
					return this.sourceUserId;
				}

				public void setSourceUserId(String sourceUserId) {
					this.sourceUserId = sourceUserId;
				}

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getWorkNo() {
					return this.workNo;
				}

				public void setWorkNo(String workNo) {
					this.workNo = workNo;
				}
			}

			public static class Ops {

				private String customerId;

				private String email;

				private String enName;

				private String gmtCreate;

				private String gmtModified;

				private String id;

				private String imAccount;

				private String lastLogonTime;

				private String loginName;

				private String mobile;

				private String nation;

				private String nationCountry;

				private String nickName;

				private String personalPhoto;

				private String phone;

				private String realName;

				private String sex;

				private String sourceSystem;

				private String sourceUserId;

				private String status;

				private String type;

				private String workNo;

				public String getCustomerId() {
					return this.customerId;
				}

				public void setCustomerId(String customerId) {
					this.customerId = customerId;
				}

				public String getEmail() {
					return this.email;
				}

				public void setEmail(String email) {
					this.email = email;
				}

				public String getEnName() {
					return this.enName;
				}

				public void setEnName(String enName) {
					this.enName = enName;
				}

				public String getGmtCreate() {
					return this.gmtCreate;
				}

				public void setGmtCreate(String gmtCreate) {
					this.gmtCreate = gmtCreate;
				}

				public String getGmtModified() {
					return this.gmtModified;
				}

				public void setGmtModified(String gmtModified) {
					this.gmtModified = gmtModified;
				}

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getImAccount() {
					return this.imAccount;
				}

				public void setImAccount(String imAccount) {
					this.imAccount = imAccount;
				}

				public String getLastLogonTime() {
					return this.lastLogonTime;
				}

				public void setLastLogonTime(String lastLogonTime) {
					this.lastLogonTime = lastLogonTime;
				}

				public String getLoginName() {
					return this.loginName;
				}

				public void setLoginName(String loginName) {
					this.loginName = loginName;
				}

				public String getMobile() {
					return this.mobile;
				}

				public void setMobile(String mobile) {
					this.mobile = mobile;
				}

				public String getNation() {
					return this.nation;
				}

				public void setNation(String nation) {
					this.nation = nation;
				}

				public String getNationCountry() {
					return this.nationCountry;
				}

				public void setNationCountry(String nationCountry) {
					this.nationCountry = nationCountry;
				}

				public String getNickName() {
					return this.nickName;
				}

				public void setNickName(String nickName) {
					this.nickName = nickName;
				}

				public String getPersonalPhoto() {
					return this.personalPhoto;
				}

				public void setPersonalPhoto(String personalPhoto) {
					this.personalPhoto = personalPhoto;
				}

				public String getPhone() {
					return this.phone;
				}

				public void setPhone(String phone) {
					this.phone = phone;
				}

				public String getRealName() {
					return this.realName;
				}

				public void setRealName(String realName) {
					this.realName = realName;
				}

				public String getSex() {
					return this.sex;
				}

				public void setSex(String sex) {
					this.sex = sex;
				}

				public String getSourceSystem() {
					return this.sourceSystem;
				}

				public void setSourceSystem(String sourceSystem) {
					this.sourceSystem = sourceSystem;
				}

				public String getSourceUserId() {
					return this.sourceUserId;
				}

				public void setSourceUserId(String sourceUserId) {
					this.sourceUserId = sourceUserId;
				}

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getWorkNo() {
					return this.workNo;
				}

				public void setWorkNo(String workNo) {
					this.workNo = workNo;
				}
			}

			public static class TestArchitect {

				private String customerId;

				private String email;

				private String enName;

				private String gmtCreate;

				private String gmtModified;

				private String id;

				private String imAccount;

				private String lastLogonTime;

				private String loginName;

				private String mobile;

				private String nation;

				private String nationCountry;

				private String nickName;

				private String personalPhoto;

				private String phone;

				private String realName;

				private String sex;

				private String sourceSystem;

				private String sourceUserId;

				private String status;

				private String type;

				private String workNo;

				public String getCustomerId() {
					return this.customerId;
				}

				public void setCustomerId(String customerId) {
					this.customerId = customerId;
				}

				public String getEmail() {
					return this.email;
				}

				public void setEmail(String email) {
					this.email = email;
				}

				public String getEnName() {
					return this.enName;
				}

				public void setEnName(String enName) {
					this.enName = enName;
				}

				public String getGmtCreate() {
					return this.gmtCreate;
				}

				public void setGmtCreate(String gmtCreate) {
					this.gmtCreate = gmtCreate;
				}

				public String getGmtModified() {
					return this.gmtModified;
				}

				public void setGmtModified(String gmtModified) {
					this.gmtModified = gmtModified;
				}

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getImAccount() {
					return this.imAccount;
				}

				public void setImAccount(String imAccount) {
					this.imAccount = imAccount;
				}

				public String getLastLogonTime() {
					return this.lastLogonTime;
				}

				public void setLastLogonTime(String lastLogonTime) {
					this.lastLogonTime = lastLogonTime;
				}

				public String getLoginName() {
					return this.loginName;
				}

				public void setLoginName(String loginName) {
					this.loginName = loginName;
				}

				public String getMobile() {
					return this.mobile;
				}

				public void setMobile(String mobile) {
					this.mobile = mobile;
				}

				public String getNation() {
					return this.nation;
				}

				public void setNation(String nation) {
					this.nation = nation;
				}

				public String getNationCountry() {
					return this.nationCountry;
				}

				public void setNationCountry(String nationCountry) {
					this.nationCountry = nationCountry;
				}

				public String getNickName() {
					return this.nickName;
				}

				public void setNickName(String nickName) {
					this.nickName = nickName;
				}

				public String getPersonalPhoto() {
					return this.personalPhoto;
				}

				public void setPersonalPhoto(String personalPhoto) {
					this.personalPhoto = personalPhoto;
				}

				public String getPhone() {
					return this.phone;
				}

				public void setPhone(String phone) {
					this.phone = phone;
				}

				public String getRealName() {
					return this.realName;
				}

				public void setRealName(String realName) {
					this.realName = realName;
				}

				public String getSex() {
					return this.sex;
				}

				public void setSex(String sex) {
					this.sex = sex;
				}

				public String getSourceSystem() {
					return this.sourceSystem;
				}

				public void setSourceSystem(String sourceSystem) {
					this.sourceSystem = sourceSystem;
				}

				public String getSourceUserId() {
					return this.sourceUserId;
				}

				public void setSourceUserId(String sourceUserId) {
					this.sourceUserId = sourceUserId;
				}

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getWorkNo() {
					return this.workNo;
				}

				public void setWorkNo(String workNo) {
					this.workNo = workNo;
				}
			}

			public static class TestOwner {

				private String customerId;

				private String email;

				private String enName;

				private String gmtCreate;

				private String gmtModified;

				private String id;

				private String imAccount;

				private String lastLogonTime;

				private String loginName;

				private String mobile;

				private String nation;

				private String nationCountry;

				private String nickName;

				private String personalPhoto;

				private String phone;

				private String realName;

				private String sex;

				private String sourceSystem;

				private String sourceUserId;

				private String status;

				private String type;

				private String workNo;

				public String getCustomerId() {
					return this.customerId;
				}

				public void setCustomerId(String customerId) {
					this.customerId = customerId;
				}

				public String getEmail() {
					return this.email;
				}

				public void setEmail(String email) {
					this.email = email;
				}

				public String getEnName() {
					return this.enName;
				}

				public void setEnName(String enName) {
					this.enName = enName;
				}

				public String getGmtCreate() {
					return this.gmtCreate;
				}

				public void setGmtCreate(String gmtCreate) {
					this.gmtCreate = gmtCreate;
				}

				public String getGmtModified() {
					return this.gmtModified;
				}

				public void setGmtModified(String gmtModified) {
					this.gmtModified = gmtModified;
				}

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getImAccount() {
					return this.imAccount;
				}

				public void setImAccount(String imAccount) {
					this.imAccount = imAccount;
				}

				public String getLastLogonTime() {
					return this.lastLogonTime;
				}

				public void setLastLogonTime(String lastLogonTime) {
					this.lastLogonTime = lastLogonTime;
				}

				public String getLoginName() {
					return this.loginName;
				}

				public void setLoginName(String loginName) {
					this.loginName = loginName;
				}

				public String getMobile() {
					return this.mobile;
				}

				public void setMobile(String mobile) {
					this.mobile = mobile;
				}

				public String getNation() {
					return this.nation;
				}

				public void setNation(String nation) {
					this.nation = nation;
				}

				public String getNationCountry() {
					return this.nationCountry;
				}

				public void setNationCountry(String nationCountry) {
					this.nationCountry = nationCountry;
				}

				public String getNickName() {
					return this.nickName;
				}

				public void setNickName(String nickName) {
					this.nickName = nickName;
				}

				public String getPersonalPhoto() {
					return this.personalPhoto;
				}

				public void setPersonalPhoto(String personalPhoto) {
					this.personalPhoto = personalPhoto;
				}

				public String getPhone() {
					return this.phone;
				}

				public void setPhone(String phone) {
					this.phone = phone;
				}

				public String getRealName() {
					return this.realName;
				}

				public void setRealName(String realName) {
					this.realName = realName;
				}

				public String getSex() {
					return this.sex;
				}

				public void setSex(String sex) {
					this.sex = sex;
				}

				public String getSourceSystem() {
					return this.sourceSystem;
				}

				public void setSourceSystem(String sourceSystem) {
					this.sourceSystem = sourceSystem;
				}

				public String getSourceUserId() {
					return this.sourceUserId;
				}

				public void setSourceUserId(String sourceUserId) {
					this.sourceUserId = sourceUserId;
				}

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getWorkNo() {
					return this.workNo;
				}

				public void setWorkNo(String workNo) {
					this.workNo = workNo;
				}
			}
		}

		public static class Archetype {

			private String artifactId;

			private String codePackage;

			private String encoding;

			private Boolean generateCode;

			private String groupId;

			private String metaData;

			private String projectType;

			private Boolean usePrivateRepo;

			private String version;

			public String getArtifactId() {
				return this.artifactId;
			}

			public void setArtifactId(String artifactId) {
				this.artifactId = artifactId;
			}

			public String getCodePackage() {
				return this.codePackage;
			}

			public void setCodePackage(String codePackage) {
				this.codePackage = codePackage;
			}

			public String getEncoding() {
				return this.encoding;
			}

			public void setEncoding(String encoding) {
				this.encoding = encoding;
			}

			public Boolean getGenerateCode() {
				return this.generateCode;
			}

			public void setGenerateCode(Boolean generateCode) {
				this.generateCode = generateCode;
			}

			public String getGroupId() {
				return this.groupId;
			}

			public void setGroupId(String groupId) {
				this.groupId = groupId;
			}

			public String getMetaData() {
				return this.metaData;
			}

			public void setMetaData(String metaData) {
				this.metaData = metaData;
			}

			public String getProjectType() {
				return this.projectType;
			}

			public void setProjectType(String projectType) {
				this.projectType = projectType;
			}

			public Boolean getUsePrivateRepo() {
				return this.usePrivateRepo;
			}

			public void setUsePrivateRepo(Boolean usePrivateRepo) {
				this.usePrivateRepo = usePrivateRepo;
			}

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}
		}

		public static class CodeRepository {

			private String extraParams;

			private String groupName;

			private String id;

			private String instanceId;

			private Boolean isInitStandardPath;

			private String name;

			private String owner;

			private String parentReposName;

			private String remoteRepoId;

			private String repoReuse;

			private String sourceLocation;

			private String status;

			private String type;

			private Boolean useExist;

			public String getExtraParams() {
				return this.extraParams;
			}

			public void setExtraParams(String extraParams) {
				this.extraParams = extraParams;
			}

			public String getGroupName() {
				return this.groupName;
			}

			public void setGroupName(String groupName) {
				this.groupName = groupName;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public Boolean getIsInitStandardPath() {
				return this.isInitStandardPath;
			}

			public void setIsInitStandardPath(Boolean isInitStandardPath) {
				this.isInitStandardPath = isInitStandardPath;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getOwner() {
				return this.owner;
			}

			public void setOwner(String owner) {
				this.owner = owner;
			}

			public String getParentReposName() {
				return this.parentReposName;
			}

			public void setParentReposName(String parentReposName) {
				this.parentReposName = parentReposName;
			}

			public String getRemoteRepoId() {
				return this.remoteRepoId;
			}

			public void setRemoteRepoId(String remoteRepoId) {
				this.remoteRepoId = remoteRepoId;
			}

			public String getRepoReuse() {
				return this.repoReuse;
			}

			public void setRepoReuse(String repoReuse) {
				this.repoReuse = repoReuse;
			}

			public String getSourceLocation() {
				return this.sourceLocation;
			}

			public void setSourceLocation(String sourceLocation) {
				this.sourceLocation = sourceLocation;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Boolean getUseExist() {
				return this.useExist;
			}

			public void setUseExist(Boolean useExist) {
				this.useExist = useExist;
			}
		}

		public static class LifeCycle {

			private String appId;

			private String gmtCreate;

			private String gmtModified;

			private String id;

			private String lastDeployTime;

			private String lastDeployVersion;

			private String lastOpsorderId;

			private String onlineTime;

			private String state;

			private String workspaceId;

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getLastDeployTime() {
				return this.lastDeployTime;
			}

			public void setLastDeployTime(String lastDeployTime) {
				this.lastDeployTime = lastDeployTime;
			}

			public String getLastDeployVersion() {
				return this.lastDeployVersion;
			}

			public void setLastDeployVersion(String lastDeployVersion) {
				this.lastDeployVersion = lastDeployVersion;
			}

			public String getLastOpsorderId() {
				return this.lastOpsorderId;
			}

			public void setLastOpsorderId(String lastOpsorderId) {
				this.lastOpsorderId = lastOpsorderId;
			}

			public String getOnlineTime() {
				return this.onlineTime;
			}

			public void setOnlineTime(String onlineTime) {
				this.onlineTime = onlineTime;
			}

			public String getState() {
				return this.state;
			}

			public void setState(String state) {
				this.state = state;
			}

			public String getWorkspaceId() {
				return this.workspaceId;
			}

			public void setWorkspaceId(String workspaceId) {
				this.workspaceId = workspaceId;
			}
		}
	}

	@Override
	public GetCASApplicationDetailResponse getInstance(UnmarshallerContext context) {
		return	GetCASApplicationDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
