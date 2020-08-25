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
import com.aliyuncs.sofa.transform.v20190815.QueryCasDatabaseAccountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryCasDatabaseAccountResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Long totalCount;

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

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String description;

		private String iaasType;

		private String id;

		private String name;

		private String password;

		private String privilege;

		private String status;

		private String utcCreate;

		private String utcModified;

		private Database database;

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getIaasType() {
			return this.iaasType;
		}

		public void setIaasType(String iaasType) {
			this.iaasType = iaasType;
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

		public String getPassword() {
			return this.password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getPrivilege() {
			return this.privilege;
		}

		public void setPrivilege(String privilege) {
			this.privilege = privilege;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
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

		public Database getDatabase() {
			return this.database;
		}

		public void setDatabase(Database database) {
			this.database = database;
		}

		public static class Database {

			private Boolean autoRenew;

			private Long autoRenewPeriod;

			private String connectionAddress;

			private Long cpu;

			private String description;

			private String engine;

			private String engineVersion;

			private String iaasId;

			private String iaasType;

			private String id;

			private String masterZoneId;

			private Long maxConnections;

			private Long maxIops;

			private Long memory;

			private String name;

			private String networkType;

			private String netType;

			private Long port;

			private String specIaasId;

			private String status;

			private Long storage;

			private String type;

			private String utcCreate;

			private String utcModified;

			private String vpcId;

			private String vSwitchIaasId;

			private String workspaceId;

			private List<AssignedAppsItem> assignedApps;

			private List<String> appIds;

			private List<String> appServiceIds;

			private List<String> assignedAppServiceIds;

			private List<String> sharedWorkspaceIds;

			public Boolean getAutoRenew() {
				return this.autoRenew;
			}

			public void setAutoRenew(Boolean autoRenew) {
				this.autoRenew = autoRenew;
			}

			public Long getAutoRenewPeriod() {
				return this.autoRenewPeriod;
			}

			public void setAutoRenewPeriod(Long autoRenewPeriod) {
				this.autoRenewPeriod = autoRenewPeriod;
			}

			public String getConnectionAddress() {
				return this.connectionAddress;
			}

			public void setConnectionAddress(String connectionAddress) {
				this.connectionAddress = connectionAddress;
			}

			public Long getCpu() {
				return this.cpu;
			}

			public void setCpu(Long cpu) {
				this.cpu = cpu;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getEngine() {
				return this.engine;
			}

			public void setEngine(String engine) {
				this.engine = engine;
			}

			public String getEngineVersion() {
				return this.engineVersion;
			}

			public void setEngineVersion(String engineVersion) {
				this.engineVersion = engineVersion;
			}

			public String getIaasId() {
				return this.iaasId;
			}

			public void setIaasId(String iaasId) {
				this.iaasId = iaasId;
			}

			public String getIaasType() {
				return this.iaasType;
			}

			public void setIaasType(String iaasType) {
				this.iaasType = iaasType;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getMasterZoneId() {
				return this.masterZoneId;
			}

			public void setMasterZoneId(String masterZoneId) {
				this.masterZoneId = masterZoneId;
			}

			public Long getMaxConnections() {
				return this.maxConnections;
			}

			public void setMaxConnections(Long maxConnections) {
				this.maxConnections = maxConnections;
			}

			public Long getMaxIops() {
				return this.maxIops;
			}

			public void setMaxIops(Long maxIops) {
				this.maxIops = maxIops;
			}

			public Long getMemory() {
				return this.memory;
			}

			public void setMemory(Long memory) {
				this.memory = memory;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getNetworkType() {
				return this.networkType;
			}

			public void setNetworkType(String networkType) {
				this.networkType = networkType;
			}

			public String getNetType() {
				return this.netType;
			}

			public void setNetType(String netType) {
				this.netType = netType;
			}

			public Long getPort() {
				return this.port;
			}

			public void setPort(Long port) {
				this.port = port;
			}

			public String getSpecIaasId() {
				return this.specIaasId;
			}

			public void setSpecIaasId(String specIaasId) {
				this.specIaasId = specIaasId;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Long getStorage() {
				return this.storage;
			}

			public void setStorage(Long storage) {
				this.storage = storage;
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

			public String getVpcId() {
				return this.vpcId;
			}

			public void setVpcId(String vpcId) {
				this.vpcId = vpcId;
			}

			public String getVSwitchIaasId() {
				return this.vSwitchIaasId;
			}

			public void setVSwitchIaasId(String vSwitchIaasId) {
				this.vSwitchIaasId = vSwitchIaasId;
			}

			public String getWorkspaceId() {
				return this.workspaceId;
			}

			public void setWorkspaceId(String workspaceId) {
				this.workspaceId = workspaceId;
			}

			public List<AssignedAppsItem> getAssignedApps() {
				return this.assignedApps;
			}

			public void setAssignedApps(List<AssignedAppsItem> assignedApps) {
				this.assignedApps = assignedApps;
			}

			public List<String> getAppIds() {
				return this.appIds;
			}

			public void setAppIds(List<String> appIds) {
				this.appIds = appIds;
			}

			public List<String> getAppServiceIds() {
				return this.appServiceIds;
			}

			public void setAppServiceIds(List<String> appServiceIds) {
				this.appServiceIds = appServiceIds;
			}

			public List<String> getAssignedAppServiceIds() {
				return this.assignedAppServiceIds;
			}

			public void setAssignedAppServiceIds(List<String> assignedAppServiceIds) {
				this.assignedAppServiceIds = assignedAppServiceIds;
			}

			public List<String> getSharedWorkspaceIds() {
				return this.sharedWorkspaceIds;
			}

			public void setSharedWorkspaceIds(List<String> sharedWorkspaceIds) {
				this.sharedWorkspaceIds = sharedWorkspaceIds;
			}

			public static class AssignedAppsItem {

				private String appId;

				private String workspaceId;

				public String getAppId() {
					return this.appId;
				}

				public void setAppId(String appId) {
					this.appId = appId;
				}

				public String getWorkspaceId() {
					return this.workspaceId;
				}

				public void setWorkspaceId(String workspaceId) {
					this.workspaceId = workspaceId;
				}
			}
		}
	}

	@Override
	public QueryCasDatabaseAccountResponse getInstance(UnmarshallerContext context) {
		return	QueryCasDatabaseAccountResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
