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
import com.aliyuncs.sofa.transform.v20190815.GetCasLoadbalanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCasLoadbalanceResponse extends AcsResponse {

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

		private String appId;

		private Boolean autoRenew;

		private Long autoRenewPeriod;

		private Long bandwidth;

		private String clusterId;

		private Boolean clusterMode;

		private String iaasId;

		private String iaasType;

		private String id;

		private String internetChargeType;

		private String name;

		private String networkType;

		private String providerId;

		private String regionId;

		private Boolean shareMode;

		private String status;

		private String utcCreate;

		private String utcModified;

		private String vipAddressType;

		private String vipType;

		private String vpcId;

		private String vSwitchIaasId;

		private String workspaceId;

		private String zoneId;

		private List<String> appServiceIds;

		private List<String> assignedAppIds;

		private List<String> assignedAppServiceIds;

		private List<String> domains;

		private List<String> vipAddresses;

		private Scope scope;

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

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

		public Long getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(Long bandwidth) {
			this.bandwidth = bandwidth;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public Boolean getClusterMode() {
			return this.clusterMode;
		}

		public void setClusterMode(Boolean clusterMode) {
			this.clusterMode = clusterMode;
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

		public String getInternetChargeType() {
			return this.internetChargeType;
		}

		public void setInternetChargeType(String internetChargeType) {
			this.internetChargeType = internetChargeType;
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

		public String getProviderId() {
			return this.providerId;
		}

		public void setProviderId(String providerId) {
			this.providerId = providerId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Boolean getShareMode() {
			return this.shareMode;
		}

		public void setShareMode(Boolean shareMode) {
			this.shareMode = shareMode;
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

		public String getVipAddressType() {
			return this.vipAddressType;
		}

		public void setVipAddressType(String vipAddressType) {
			this.vipAddressType = vipAddressType;
		}

		public String getVipType() {
			return this.vipType;
		}

		public void setVipType(String vipType) {
			this.vipType = vipType;
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

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public List<String> getAppServiceIds() {
			return this.appServiceIds;
		}

		public void setAppServiceIds(List<String> appServiceIds) {
			this.appServiceIds = appServiceIds;
		}

		public List<String> getAssignedAppIds() {
			return this.assignedAppIds;
		}

		public void setAssignedAppIds(List<String> assignedAppIds) {
			this.assignedAppIds = assignedAppIds;
		}

		public List<String> getAssignedAppServiceIds() {
			return this.assignedAppServiceIds;
		}

		public void setAssignedAppServiceIds(List<String> assignedAppServiceIds) {
			this.assignedAppServiceIds = assignedAppServiceIds;
		}

		public List<String> getDomains() {
			return this.domains;
		}

		public void setDomains(List<String> domains) {
			this.domains = domains;
		}

		public List<String> getVipAddresses() {
			return this.vipAddresses;
		}

		public void setVipAddresses(List<String> vipAddresses) {
			this.vipAddresses = vipAddresses;
		}

		public Scope getScope() {
			return this.scope;
		}

		public void setScope(Scope scope) {
			this.scope = scope;
		}

		public static class Scope {

			private String cell;

			private String cluster;

			private String region;

			private String tenant;

			private String workspace;

			private String workspaceGroup;

			private String zone;

			public String getCell() {
				return this.cell;
			}

			public void setCell(String cell) {
				this.cell = cell;
			}

			public String getCluster() {
				return this.cluster;
			}

			public void setCluster(String cluster) {
				this.cluster = cluster;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public String getTenant() {
				return this.tenant;
			}

			public void setTenant(String tenant) {
				this.tenant = tenant;
			}

			public String getWorkspace() {
				return this.workspace;
			}

			public void setWorkspace(String workspace) {
				this.workspace = workspace;
			}

			public String getWorkspaceGroup() {
				return this.workspaceGroup;
			}

			public void setWorkspaceGroup(String workspaceGroup) {
				this.workspaceGroup = workspaceGroup;
			}

			public String getZone() {
				return this.zone;
			}

			public void setZone(String zone) {
				this.zone = zone;
			}
		}
	}

	@Override
	public GetCasLoadbalanceResponse getInstance(UnmarshallerContext context) {
		return	GetCasLoadbalanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
