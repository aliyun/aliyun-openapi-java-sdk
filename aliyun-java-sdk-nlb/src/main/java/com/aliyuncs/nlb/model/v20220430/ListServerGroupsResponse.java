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

package com.aliyuncs.nlb.model.v20220430;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.nlb.transform.v20220430.ListServerGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListServerGroupsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private String dynamicCode;

	private String dynamicMessage;

	private Integer totalCount;

	private String nextToken;

	private Integer maxResults;

	private List<ServerGroup> serverGroups;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<ServerGroup> getServerGroups() {
		return this.serverGroups;
	}

	public void setServerGroups(List<ServerGroup> serverGroups) {
		this.serverGroups = serverGroups;
	}

	public static class ServerGroup {

		private String regionId;

		private String serverGroupId;

		private String serverGroupName;

		private String serverGroupType;

		private String addressIPVersion;

		private String vpcId;

		private String scheduler;

		private String protocol;

		private Boolean persistenceEnabled;

		private Integer persistenceTimeout;

		private Boolean connectionDrainEnabled;

		private Integer connectionDrainTimeout;

		private Boolean preserveClientIpEnabled;

		private Boolean anyPortEnabled;

		private String resourceGroupId;

		private String serverGroupStatus;

		private Long aliUid;

		private Integer serverCount;

		private List<Tag> tags;

		private List<String> relatedLoadBalancerIds;

		private HealthCheck healthCheck;

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
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

		public String getServerGroupType() {
			return this.serverGroupType;
		}

		public void setServerGroupType(String serverGroupType) {
			this.serverGroupType = serverGroupType;
		}

		public String getAddressIPVersion() {
			return this.addressIPVersion;
		}

		public void setAddressIPVersion(String addressIPVersion) {
			this.addressIPVersion = addressIPVersion;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getScheduler() {
			return this.scheduler;
		}

		public void setScheduler(String scheduler) {
			this.scheduler = scheduler;
		}

		public String getBizProtocol() {
			return this.protocol;
		}

		public void setBizProtocol(String protocol) {
			this.protocol = protocol;
		}

		public Boolean getPersistenceEnabled() {
			return this.persistenceEnabled;
		}

		public void setPersistenceEnabled(Boolean persistenceEnabled) {
			this.persistenceEnabled = persistenceEnabled;
		}

		public Integer getPersistenceTimeout() {
			return this.persistenceTimeout;
		}

		public void setPersistenceTimeout(Integer persistenceTimeout) {
			this.persistenceTimeout = persistenceTimeout;
		}

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

		public Boolean getPreserveClientIpEnabled() {
			return this.preserveClientIpEnabled;
		}

		public void setPreserveClientIpEnabled(Boolean preserveClientIpEnabled) {
			this.preserveClientIpEnabled = preserveClientIpEnabled;
		}

		public Boolean getAnyPortEnabled() {
			return this.anyPortEnabled;
		}

		public void setAnyPortEnabled(Boolean anyPortEnabled) {
			this.anyPortEnabled = anyPortEnabled;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getServerGroupStatus() {
			return this.serverGroupStatus;
		}

		public void setServerGroupStatus(String serverGroupStatus) {
			this.serverGroupStatus = serverGroupStatus;
		}

		public Long getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(Long aliUid) {
			this.aliUid = aliUid;
		}

		public Integer getServerCount() {
			return this.serverCount;
		}

		public void setServerCount(Integer serverCount) {
			this.serverCount = serverCount;
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

		public HealthCheck getHealthCheck() {
			return this.healthCheck;
		}

		public void setHealthCheck(HealthCheck healthCheck) {
			this.healthCheck = healthCheck;
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

		public static class HealthCheck {

			private Boolean healthCheckEnabled;

			private String healthCheckType;

			private Integer healthCheckConnectPort;

			private Integer healthyThreshold;

			private Integer unhealthyThreshold;

			private Integer healthCheckConnectTimeout;

			private Integer healthCheckInterval;

			private String healthCheckDomain;

			private String healthCheckUrl;

			private String httpCheckMethod;

			private List<String> healthCheckHttpCode;

			public Boolean getHealthCheckEnabled() {
				return this.healthCheckEnabled;
			}

			public void setHealthCheckEnabled(Boolean healthCheckEnabled) {
				this.healthCheckEnabled = healthCheckEnabled;
			}

			public String getHealthCheckType() {
				return this.healthCheckType;
			}

			public void setHealthCheckType(String healthCheckType) {
				this.healthCheckType = healthCheckType;
			}

			public Integer getHealthCheckConnectPort() {
				return this.healthCheckConnectPort;
			}

			public void setHealthCheckConnectPort(Integer healthCheckConnectPort) {
				this.healthCheckConnectPort = healthCheckConnectPort;
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

			public Integer getHealthCheckConnectTimeout() {
				return this.healthCheckConnectTimeout;
			}

			public void setHealthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
				this.healthCheckConnectTimeout = healthCheckConnectTimeout;
			}

			public Integer getHealthCheckInterval() {
				return this.healthCheckInterval;
			}

			public void setHealthCheckInterval(Integer healthCheckInterval) {
				this.healthCheckInterval = healthCheckInterval;
			}

			public String getHealthCheckDomain() {
				return this.healthCheckDomain;
			}

			public void setHealthCheckDomain(String healthCheckDomain) {
				this.healthCheckDomain = healthCheckDomain;
			}

			public String getHealthCheckUrl() {
				return this.healthCheckUrl;
			}

			public void setHealthCheckUrl(String healthCheckUrl) {
				this.healthCheckUrl = healthCheckUrl;
			}

			public String getHttpCheckMethod() {
				return this.httpCheckMethod;
			}

			public void setHttpCheckMethod(String httpCheckMethod) {
				this.httpCheckMethod = httpCheckMethod;
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
