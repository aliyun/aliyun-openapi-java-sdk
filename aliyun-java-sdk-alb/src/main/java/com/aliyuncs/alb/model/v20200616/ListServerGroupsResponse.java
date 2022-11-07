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

package com.aliyuncs.alb.model.v20200616;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.alb.transform.v20200616.ListServerGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListServerGroupsResponse extends AcsResponse {

	private Integer maxResults;

	private String nextToken;

	private String requestId;

	private Integer totalCount;

	private List<ServerGroup> serverGroups;

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<ServerGroup> getServerGroups() {
		return this.serverGroups;
	}

	public void setServerGroups(List<ServerGroup> serverGroups) {
		this.serverGroups = serverGroups;
	}

	public static class ServerGroup {

		private String protocol;

		private String resourceGroupId;

		private String scheduler;

		private String serverGroupId;

		private String serverGroupName;

		private String serverGroupStatus;

		private String serverGroupType;

		private String vpcId;

		private Boolean serviceManagedEnabled;

		private String serviceManagedMode;

		private Boolean configManagedEnabled;

		private Boolean upstreamKeepaliveEnabled;

		private Boolean ipv6Enabled;

		private Integer serverCount;

		private String serviceName;

		private List<Tag> tags;

		private List<String> relatedLoadBalancerIds;

		private List<String> relatedListenerIds;

		private List<String> relatedRuleIds;

		private HealthCheckConfig healthCheckConfig;

		private StickySessionConfig stickySessionConfig;

		private UchConfig uchConfig;

		public String getBizProtocol() {
			return this.protocol;
		}

		public void setBizProtocol(String protocol) {
			this.protocol = protocol;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getScheduler() {
			return this.scheduler;
		}

		public void setScheduler(String scheduler) {
			this.scheduler = scheduler;
		}

		public String getServerGroupId() {
			return this.serverGroupId;
		}

		public void setServerGroupId(String serverGroupId) {
			this.serverGroupId = serverGroupId;
		}

		public String getServerGroupName() {
			return this.serverGroupName;
		}

		public void setServerGroupName(String serverGroupName) {
			this.serverGroupName = serverGroupName;
		}

		public String getServerGroupStatus() {
			return this.serverGroupStatus;
		}

		public void setServerGroupStatus(String serverGroupStatus) {
			this.serverGroupStatus = serverGroupStatus;
		}

		public String getServerGroupType() {
			return this.serverGroupType;
		}

		public void setServerGroupType(String serverGroupType) {
			this.serverGroupType = serverGroupType;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public Boolean getServiceManagedEnabled() {
			return this.serviceManagedEnabled;
		}

		public void setServiceManagedEnabled(Boolean serviceManagedEnabled) {
			this.serviceManagedEnabled = serviceManagedEnabled;
		}

		public String getServiceManagedMode() {
			return this.serviceManagedMode;
		}

		public void setServiceManagedMode(String serviceManagedMode) {
			this.serviceManagedMode = serviceManagedMode;
		}

		public Boolean getConfigManagedEnabled() {
			return this.configManagedEnabled;
		}

		public void setConfigManagedEnabled(Boolean configManagedEnabled) {
			this.configManagedEnabled = configManagedEnabled;
		}

		public Boolean getUpstreamKeepaliveEnabled() {
			return this.upstreamKeepaliveEnabled;
		}

		public void setUpstreamKeepaliveEnabled(Boolean upstreamKeepaliveEnabled) {
			this.upstreamKeepaliveEnabled = upstreamKeepaliveEnabled;
		}

		public Boolean getIpv6Enabled() {
			return this.ipv6Enabled;
		}

		public void setIpv6Enabled(Boolean ipv6Enabled) {
			this.ipv6Enabled = ipv6Enabled;
		}

		public Integer getServerCount() {
			return this.serverCount;
		}

		public void setServerCount(Integer serverCount) {
			this.serverCount = serverCount;
		}

		public String getServiceName() {
			return this.serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public List<String> getRelatedLoadBalancerIds() {
			return this.relatedLoadBalancerIds;
		}

		public void setRelatedLoadBalancerIds(List<String> relatedLoadBalancerIds) {
			this.relatedLoadBalancerIds = relatedLoadBalancerIds;
		}

		public List<String> getRelatedListenerIds() {
			return this.relatedListenerIds;
		}

		public void setRelatedListenerIds(List<String> relatedListenerIds) {
			this.relatedListenerIds = relatedListenerIds;
		}

		public List<String> getRelatedRuleIds() {
			return this.relatedRuleIds;
		}

		public void setRelatedRuleIds(List<String> relatedRuleIds) {
			this.relatedRuleIds = relatedRuleIds;
		}

		public HealthCheckConfig getHealthCheckConfig() {
			return this.healthCheckConfig;
		}

		public void setHealthCheckConfig(HealthCheckConfig healthCheckConfig) {
			this.healthCheckConfig = healthCheckConfig;
		}

		public StickySessionConfig getStickySessionConfig() {
			return this.stickySessionConfig;
		}

		public void setStickySessionConfig(StickySessionConfig stickySessionConfig) {
			this.stickySessionConfig = stickySessionConfig;
		}

		public UchConfig getUchConfig() {
			return this.uchConfig;
		}

		public void setUchConfig(UchConfig uchConfig) {
			this.uchConfig = uchConfig;
		}

		public static class Tag {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}

		public static class HealthCheckConfig {

			private Integer healthCheckConnectPort;

			private Boolean healthCheckEnabled;

			private String healthCheckHost;

			private String healthCheckHttpVersion;

			private Integer healthCheckInterval;

			private String healthCheckMethod;

			private String healthCheckPath;

			private String healthCheckProtocol;

			private Integer healthCheckTimeout;

			private Integer healthyThreshold;

			private Integer unhealthyThreshold;

			private Boolean healthCheckTcpFastCloseEnabled;

			private List<String> healthCheckHttpCodes;

			private List<String> healthCheckCodes;

			public Integer getHealthCheckConnectPort() {
				return this.healthCheckConnectPort;
			}

			public void setHealthCheckConnectPort(Integer healthCheckConnectPort) {
				this.healthCheckConnectPort = healthCheckConnectPort;
			}

			public Boolean getHealthCheckEnabled() {
				return this.healthCheckEnabled;
			}

			public void setHealthCheckEnabled(Boolean healthCheckEnabled) {
				this.healthCheckEnabled = healthCheckEnabled;
			}

			public String getHealthCheckHost() {
				return this.healthCheckHost;
			}

			public void setHealthCheckHost(String healthCheckHost) {
				this.healthCheckHost = healthCheckHost;
			}

			public String getHealthCheckHttpVersion() {
				return this.healthCheckHttpVersion;
			}

			public void setHealthCheckHttpVersion(String healthCheckHttpVersion) {
				this.healthCheckHttpVersion = healthCheckHttpVersion;
			}

			public Integer getHealthCheckInterval() {
				return this.healthCheckInterval;
			}

			public void setHealthCheckInterval(Integer healthCheckInterval) {
				this.healthCheckInterval = healthCheckInterval;
			}

			public String getHealthCheckMethod() {
				return this.healthCheckMethod;
			}

			public void setHealthCheckMethod(String healthCheckMethod) {
				this.healthCheckMethod = healthCheckMethod;
			}

			public String getHealthCheckPath() {
				return this.healthCheckPath;
			}

			public void setHealthCheckPath(String healthCheckPath) {
				this.healthCheckPath = healthCheckPath;
			}

			public String getHealthCheckProtocol() {
				return this.healthCheckProtocol;
			}

			public void setHealthCheckProtocol(String healthCheckProtocol) {
				this.healthCheckProtocol = healthCheckProtocol;
			}

			public Integer getHealthCheckTimeout() {
				return this.healthCheckTimeout;
			}

			public void setHealthCheckTimeout(Integer healthCheckTimeout) {
				this.healthCheckTimeout = healthCheckTimeout;
			}

			public Integer getHealthyThreshold() {
				return this.healthyThreshold;
			}

			public void setHealthyThreshold(Integer healthyThreshold) {
				this.healthyThreshold = healthyThreshold;
			}

			public Integer getUnhealthyThreshold() {
				return this.unhealthyThreshold;
			}

			public void setUnhealthyThreshold(Integer unhealthyThreshold) {
				this.unhealthyThreshold = unhealthyThreshold;
			}

			public Boolean getHealthCheckTcpFastCloseEnabled() {
				return this.healthCheckTcpFastCloseEnabled;
			}

			public void setHealthCheckTcpFastCloseEnabled(Boolean healthCheckTcpFastCloseEnabled) {
				this.healthCheckTcpFastCloseEnabled = healthCheckTcpFastCloseEnabled;
			}

			public List<String> getHealthCheckHttpCodes() {
				return this.healthCheckHttpCodes;
			}

			public void setHealthCheckHttpCodes(List<String> healthCheckHttpCodes) {
				this.healthCheckHttpCodes = healthCheckHttpCodes;
			}

			public List<String> getHealthCheckCodes() {
				return this.healthCheckCodes;
			}

			public void setHealthCheckCodes(List<String> healthCheckCodes) {
				this.healthCheckCodes = healthCheckCodes;
			}
		}

		public static class StickySessionConfig {

			private String cookie;

			private Integer cookieTimeout;

			private Boolean stickySessionEnabled;

			private String stickySessionType;

			public String getCookie() {
				return this.cookie;
			}

			public void setCookie(String cookie) {
				this.cookie = cookie;
			}

			public Integer getCookieTimeout() {
				return this.cookieTimeout;
			}

			public void setCookieTimeout(Integer cookieTimeout) {
				this.cookieTimeout = cookieTimeout;
			}

			public Boolean getStickySessionEnabled() {
				return this.stickySessionEnabled;
			}

			public void setStickySessionEnabled(Boolean stickySessionEnabled) {
				this.stickySessionEnabled = stickySessionEnabled;
			}

			public String getStickySessionType() {
				return this.stickySessionType;
			}

			public void setStickySessionType(String stickySessionType) {
				this.stickySessionType = stickySessionType;
			}
		}

		public static class UchConfig {

			private String type;

			private String value;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public ListServerGroupsResponse getInstance(UnmarshallerContext context) {
		return	ListServerGroupsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
