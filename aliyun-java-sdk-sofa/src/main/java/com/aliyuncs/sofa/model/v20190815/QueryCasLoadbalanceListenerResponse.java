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
import com.aliyuncs.sofa.transform.v20190815.QueryCasLoadbalanceListenerResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryCasLoadbalanceListenerResponse extends AcsResponse {

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

		private Long backendServerPort;

		private Long bandwidth;

		private String certificateIaasId;

		private String certificateId;

		private String cookie;

		private Long cookieTimeout;

		private String description;

		private Long establishedTimeout;

		private String gmCryptoCertIaasId;

		private String iaasId;

		private String iaasType;

		private String id;

		private String isHealthMonitor;

		private Long listenerPort;

		private String name;

		private Long persistTimeout;

		private String scheduler;

		private String status;

		private String stickySession;

		private String stickySessionType;

		private String type;

		private String urlPath;

		private String xForwardedFor;

		private HealthMonitor healthMonitor;

		private LoadBalancer loadBalancer;

		public Long getBackendServerPort() {
			return this.backendServerPort;
		}

		public void setBackendServerPort(Long backendServerPort) {
			this.backendServerPort = backendServerPort;
		}

		public Long getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(Long bandwidth) {
			this.bandwidth = bandwidth;
		}

		public String getCertificateIaasId() {
			return this.certificateIaasId;
		}

		public void setCertificateIaasId(String certificateIaasId) {
			this.certificateIaasId = certificateIaasId;
		}

		public String getCertificateId() {
			return this.certificateId;
		}

		public void setCertificateId(String certificateId) {
			this.certificateId = certificateId;
		}

		public String getCookie() {
			return this.cookie;
		}

		public void setCookie(String cookie) {
			this.cookie = cookie;
		}

		public Long getCookieTimeout() {
			return this.cookieTimeout;
		}

		public void setCookieTimeout(Long cookieTimeout) {
			this.cookieTimeout = cookieTimeout;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Long getEstablishedTimeout() {
			return this.establishedTimeout;
		}

		public void setEstablishedTimeout(Long establishedTimeout) {
			this.establishedTimeout = establishedTimeout;
		}

		public String getGmCryptoCertIaasId() {
			return this.gmCryptoCertIaasId;
		}

		public void setGmCryptoCertIaasId(String gmCryptoCertIaasId) {
			this.gmCryptoCertIaasId = gmCryptoCertIaasId;
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

		public String getIsHealthMonitor() {
			return this.isHealthMonitor;
		}

		public void setIsHealthMonitor(String isHealthMonitor) {
			this.isHealthMonitor = isHealthMonitor;
		}

		public Long getListenerPort() {
			return this.listenerPort;
		}

		public void setListenerPort(Long listenerPort) {
			this.listenerPort = listenerPort;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getPersistTimeout() {
			return this.persistTimeout;
		}

		public void setPersistTimeout(Long persistTimeout) {
			this.persistTimeout = persistTimeout;
		}

		public String getScheduler() {
			return this.scheduler;
		}

		public void setScheduler(String scheduler) {
			this.scheduler = scheduler;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getStickySession() {
			return this.stickySession;
		}

		public void setStickySession(String stickySession) {
			this.stickySession = stickySession;
		}

		public String getStickySessionType() {
			return this.stickySessionType;
		}

		public void setStickySessionType(String stickySessionType) {
			this.stickySessionType = stickySessionType;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getUrlPath() {
			return this.urlPath;
		}

		public void setUrlPath(String urlPath) {
			this.urlPath = urlPath;
		}

		public String getXForwardedFor() {
			return this.xForwardedFor;
		}

		public void setXForwardedFor(String xForwardedFor) {
			this.xForwardedFor = xForwardedFor;
		}

		public HealthMonitor getHealthMonitor() {
			return this.healthMonitor;
		}

		public void setHealthMonitor(HealthMonitor healthMonitor) {
			this.healthMonitor = healthMonitor;
		}

		public LoadBalancer getLoadBalancer() {
			return this.loadBalancer;
		}

		public void setLoadBalancer(LoadBalancer loadBalancer) {
			this.loadBalancer = loadBalancer;
		}

		public static class HealthMonitor {

			private String checkType;

			private Long connectPort;

			private String domain;

			private Long healthyThreshold;

			private String httpMethod;

			private String id;

			private Long interval;

			private Long timeout;

			private Long unHealthyThreshold;

			private String uri;

			private List<String> healthCheckHttpCode;

			public String getCheckType() {
				return this.checkType;
			}

			public void setCheckType(String checkType) {
				this.checkType = checkType;
			}

			public Long getConnectPort() {
				return this.connectPort;
			}

			public void setConnectPort(Long connectPort) {
				this.connectPort = connectPort;
			}

			public String getDomain() {
				return this.domain;
			}

			public void setDomain(String domain) {
				this.domain = domain;
			}

			public Long getHealthyThreshold() {
				return this.healthyThreshold;
			}

			public void setHealthyThreshold(Long healthyThreshold) {
				this.healthyThreshold = healthyThreshold;
			}

			public String getHttpMethod() {
				return this.httpMethod;
			}

			public void setHttpMethod(String httpMethod) {
				this.httpMethod = httpMethod;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public Long getInterval() {
				return this.interval;
			}

			public void setInterval(Long interval) {
				this.interval = interval;
			}

			public Long getTimeout() {
				return this.timeout;
			}

			public void setTimeout(Long timeout) {
				this.timeout = timeout;
			}

			public Long getUnHealthyThreshold() {
				return this.unHealthyThreshold;
			}

			public void setUnHealthyThreshold(Long unHealthyThreshold) {
				this.unHealthyThreshold = unHealthyThreshold;
			}

			public String getUri() {
				return this.uri;
			}

			public void setUri(String uri) {
				this.uri = uri;
			}

			public List<String> getHealthCheckHttpCode() {
				return this.healthCheckHttpCode;
			}

			public void setHealthCheckHttpCode(List<String> healthCheckHttpCode) {
				this.healthCheckHttpCode = healthCheckHttpCode;
			}
		}

		public static class LoadBalancer {

			private String appId;

			private Boolean autoRenew;

			private Long autoRenewPeriod;

			private Long bandwidth;

			private String clusterId;

			private Boolean clusterMode;

			private String iaasType;

			private String id;

			private String internetChargeType;

			private String name;

			private String networkType;

			private Boolean shareMode;

			private String status;

			private String utcCreate;

			private String utcModified;

			private String vipAddressType;

			private String vipType;

			private String vpcId;

			private String vswitchIaasId;

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

			public String getVswitchIaasId() {
				return this.vswitchIaasId;
			}

			public void setVswitchIaasId(String vswitchIaasId) {
				this.vswitchIaasId = vswitchIaasId;
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
	}

	@Override
	public QueryCasLoadbalanceListenerResponse getInstance(UnmarshallerContext context) {
		return	QueryCasLoadbalanceListenerResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
