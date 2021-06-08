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

		private String vpcId;

		private HealthCheckConfig healthCheckConfig;

		private StickySessionConfig stickySessionConfig;

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

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
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
