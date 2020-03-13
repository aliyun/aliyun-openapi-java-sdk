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
import com.aliyuncs.sofa.transform.v20190815.ListLinkeBahamutWorkspacesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListLinkeBahamutWorkspacesResponse extends AcsResponse {

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

		private String accessKey;

		private String accessSecret;

		private String clusterId;

		private Long created;

		private Boolean crossCloud;

		private String customerId;

		private Boolean defaultUse;

		private Boolean deleted;

		private String envId;

		private String id;

		private Long lastModified;

		private String linkETenant;

		private String namespace;

		private String type;

		private String use;

		private String workspaceGroupId;

		private String workspaceId;

		private String workspaceName;

		private CloudTenant cloudTenant;

		private ExtraInfo extraInfo;

		private Modifier modifier;

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

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public Long getCreated() {
			return this.created;
		}

		public void setCreated(Long created) {
			this.created = created;
		}

		public Boolean getCrossCloud() {
			return this.crossCloud;
		}

		public void setCrossCloud(Boolean crossCloud) {
			this.crossCloud = crossCloud;
		}

		public String getCustomerId() {
			return this.customerId;
		}

		public void setCustomerId(String customerId) {
			this.customerId = customerId;
		}

		public Boolean getDefaultUse() {
			return this.defaultUse;
		}

		public void setDefaultUse(Boolean defaultUse) {
			this.defaultUse = defaultUse;
		}

		public Boolean getDeleted() {
			return this.deleted;
		}

		public void setDeleted(Boolean deleted) {
			this.deleted = deleted;
		}

		public String getEnvId() {
			return this.envId;
		}

		public void setEnvId(String envId) {
			this.envId = envId;
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

		public String getLinkETenant() {
			return this.linkETenant;
		}

		public void setLinkETenant(String linkETenant) {
			this.linkETenant = linkETenant;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getUse() {
			return this.use;
		}

		public void setUse(String use) {
			this.use = use;
		}

		public String getWorkspaceGroupId() {
			return this.workspaceGroupId;
		}

		public void setWorkspaceGroupId(String workspaceGroupId) {
			this.workspaceGroupId = workspaceGroupId;
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

		public CloudTenant getCloudTenant() {
			return this.cloudTenant;
		}

		public void setCloudTenant(CloudTenant cloudTenant) {
			this.cloudTenant = cloudTenant;
		}

		public ExtraInfo getExtraInfo() {
			return this.extraInfo;
		}

		public void setExtraInfo(ExtraInfo extraInfo) {
			this.extraInfo = extraInfo;
		}

		public Modifier getModifier() {
			return this.modifier;
		}

		public void setModifier(Modifier modifier) {
			this.modifier = modifier;
		}

		public static class CloudTenant {

			private String accessKey;

			private String accessSecret;

			private Long created;

			private String customerId;

			private Boolean deleted;

			private String endPoint;

			private String id;

			private Long lastModified;

			private String linkETenant;

			private String stationName;

			private String tenantId;

			private String tenantName;

			private String token;

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

			public Long getCreated() {
				return this.created;
			}

			public void setCreated(Long created) {
				this.created = created;
			}

			public String getCustomerId() {
				return this.customerId;
			}

			public void setCustomerId(String customerId) {
				this.customerId = customerId;
			}

			public Boolean getDeleted() {
				return this.deleted;
			}

			public void setDeleted(Boolean deleted) {
				this.deleted = deleted;
			}

			public String getEndPoint() {
				return this.endPoint;
			}

			public void setEndPoint(String endPoint) {
				this.endPoint = endPoint;
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

			public String getLinkETenant() {
				return this.linkETenant;
			}

			public void setLinkETenant(String linkETenant) {
				this.linkETenant = linkETenant;
			}

			public String getStationName() {
				return this.stationName;
			}

			public void setStationName(String stationName) {
				this.stationName = stationName;
			}

			public String getTenantId() {
				return this.tenantId;
			}

			public void setTenantId(String tenantId) {
				this.tenantId = tenantId;
			}

			public String getTenantName() {
				return this.tenantName;
			}

			public void setTenantName(String tenantName) {
				this.tenantName = tenantName;
			}

			public String getToken() {
				return this.token;
			}

			public void setToken(String token) {
				this.token = token;
			}
		}

		public static class ExtraInfo {

			private String antXUrl;

			private Boolean authTokenType;

			private String envTypeEnum;

			private String groupStrategy;

			private String instanceId;

			private String ldcConsoleUrl;

			private Boolean machImport;

			private Boolean machIter;

			private String mavenModeEnum;

			private String regionName;

			private String registryHost;

			private String releaseTypeEnum;

			private Boolean shareOpenAPI;

			private Boolean sofarouterEnabled;

			private List<String> buildWorkspaceList;

			public String getAntXUrl() {
				return this.antXUrl;
			}

			public void setAntXUrl(String antXUrl) {
				this.antXUrl = antXUrl;
			}

			public Boolean getAuthTokenType() {
				return this.authTokenType;
			}

			public void setAuthTokenType(Boolean authTokenType) {
				this.authTokenType = authTokenType;
			}

			public String getEnvTypeEnum() {
				return this.envTypeEnum;
			}

			public void setEnvTypeEnum(String envTypeEnum) {
				this.envTypeEnum = envTypeEnum;
			}

			public String getGroupStrategy() {
				return this.groupStrategy;
			}

			public void setGroupStrategy(String groupStrategy) {
				this.groupStrategy = groupStrategy;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getLdcConsoleUrl() {
				return this.ldcConsoleUrl;
			}

			public void setLdcConsoleUrl(String ldcConsoleUrl) {
				this.ldcConsoleUrl = ldcConsoleUrl;
			}

			public Boolean getMachImport() {
				return this.machImport;
			}

			public void setMachImport(Boolean machImport) {
				this.machImport = machImport;
			}

			public Boolean getMachIter() {
				return this.machIter;
			}

			public void setMachIter(Boolean machIter) {
				this.machIter = machIter;
			}

			public String getMavenModeEnum() {
				return this.mavenModeEnum;
			}

			public void setMavenModeEnum(String mavenModeEnum) {
				this.mavenModeEnum = mavenModeEnum;
			}

			public String getRegionName() {
				return this.regionName;
			}

			public void setRegionName(String regionName) {
				this.regionName = regionName;
			}

			public String getRegistryHost() {
				return this.registryHost;
			}

			public void setRegistryHost(String registryHost) {
				this.registryHost = registryHost;
			}

			public String getReleaseTypeEnum() {
				return this.releaseTypeEnum;
			}

			public void setReleaseTypeEnum(String releaseTypeEnum) {
				this.releaseTypeEnum = releaseTypeEnum;
			}

			public Boolean getShareOpenAPI() {
				return this.shareOpenAPI;
			}

			public void setShareOpenAPI(Boolean shareOpenAPI) {
				this.shareOpenAPI = shareOpenAPI;
			}

			public Boolean getSofarouterEnabled() {
				return this.sofarouterEnabled;
			}

			public void setSofarouterEnabled(Boolean sofarouterEnabled) {
				this.sofarouterEnabled = sofarouterEnabled;
			}

			public List<String> getBuildWorkspaceList() {
				return this.buildWorkspaceList;
			}

			public void setBuildWorkspaceList(List<String> buildWorkspaceList) {
				this.buildWorkspaceList = buildWorkspaceList;
			}
		}

		public static class Modifier {

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
	}

	@Override
	public ListLinkeBahamutWorkspacesResponse getInstance(UnmarshallerContext context) {
		return	ListLinkeBahamutWorkspacesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
