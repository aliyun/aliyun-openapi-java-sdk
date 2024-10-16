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

package com.aliyuncs.gwlb.model.v20240415;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.gwlb.transform.v20240415.ListServerGroupsResponseUnmarshaller;
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

		private String createTime;

		private String protocol;

		private String resourceGroupId;

		private String scheduler;

		private Integer serverCount;

		private String serverGroupId;

		private String serverGroupName;

		private String serverGroupStatus;

		private String serverGroupType;

		private String vpcId;

		private List<TagModel> tags;

		private List<String> relatedLoadBalancerIds;

		private ConnectionDrainConfig connectionDrainConfig;

		private HealthCheckConfig healthCheckConfig;

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

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

		public Integer getServerCount() {
			return this.serverCount;
		}

		public void setServerCount(Integer serverCount) {
			this.serverCount = serverCount;
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

		public List<TagModel> getTags() {
			return this.tags;
		}

		public void setTags(List<TagModel> tags) {
			this.tags = tags;
		}

		public List<String> getRelatedLoadBalancerIds() {
			return this.relatedLoadBalancerIds;
		}

		public void setRelatedLoadBalancerIds(List<String> relatedLoadBalancerIds) {
			this.relatedLoadBalancerIds = relatedLoadBalancerIds;
		}

		public ConnectionDrainConfig getConnectionDrainConfig() {
			return this.connectionDrainConfig;
		}

		public void setConnectionDrainConfig(ConnectionDrainConfig connectionDrainConfig) {
			this.connectionDrainConfig = connectionDrainConfig;
		}

		public HealthCheckConfig getHealthCheckConfig() {
			return this.healthCheckConfig;
		}

		public void setHealthCheckConfig(HealthCheckConfig healthCheckConfig) {
			this.healthCheckConfig = healthCheckConfig;
		}

		public static class TagModel {

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

		public static class ConnectionDrainConfig {

			private Boolean connectionDrainEnabled;

			private Integer connectionDrainTimeout;

			public Boolean getConnectionDrainEnabled() {
				return this.connectionDrainEnabled;
			}

			public void setConnectionDrainEnabled(Boolean connectionDrainEnabled) {
				this.connectionDrainEnabled = connectionDrainEnabled;
			}

			public Integer getConnectionDrainTimeout() {
				return this.connectionDrainTimeout;
			}

			public void setConnectionDrainTimeout(Integer connectionDrainTimeout) {
				this.connectionDrainTimeout = connectionDrainTimeout;
			}
		}

		public static class HealthCheckConfig {

			private Integer healthCheckConnectPort;

			private Integer healthCheckConnectTimeout;

			private String healthCheckDomain;

			private Boolean healthCheckEnabled;

			private Integer healthCheckInterval;

			private String healthCheckPath;

			private String healthCheckProtocol;

			private Integer healthyThreshold;

			private Integer unhealthyThreshold;

			private List<String> healthCheckHttpCode;

			public Integer getHealthCheckConnectPort() {
				return this.healthCheckConnectPort;
			}

			public void setHealthCheckConnectPort(Integer healthCheckConnectPort) {
				this.healthCheckConnectPort = healthCheckConnectPort;
			}

			public Integer getHealthCheckConnectTimeout() {
				return this.healthCheckConnectTimeout;
			}

			public void setHealthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
				this.healthCheckConnectTimeout = healthCheckConnectTimeout;
			}

			public String getHealthCheckDomain() {
				return this.healthCheckDomain;
			}

			public void setHealthCheckDomain(String healthCheckDomain) {
				this.healthCheckDomain = healthCheckDomain;
			}

			public Boolean getHealthCheckEnabled() {
				return this.healthCheckEnabled;
			}

			public void setHealthCheckEnabled(Boolean healthCheckEnabled) {
				this.healthCheckEnabled = healthCheckEnabled;
			}

			public Integer getHealthCheckInterval() {
				return this.healthCheckInterval;
			}

			public void setHealthCheckInterval(Integer healthCheckInterval) {
				this.healthCheckInterval = healthCheckInterval;
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

			public List<String> getHealthCheckHttpCode() {
				return this.healthCheckHttpCode;
			}

			public void setHealthCheckHttpCode(List<String> healthCheckHttpCode) {
				this.healthCheckHttpCode = healthCheckHttpCode;
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
