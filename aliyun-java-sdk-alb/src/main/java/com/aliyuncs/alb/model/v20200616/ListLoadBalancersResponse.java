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
import com.aliyuncs.alb.transform.v20200616.ListLoadBalancersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListLoadBalancersResponse extends AcsResponse {

	private Integer maxResults;

	private String nextToken;

	private String requestId;

	private Integer totalCount;

	private List<LoadBalancer> loadBalancers;

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

	public List<LoadBalancer> getLoadBalancers() {
		return this.loadBalancers;
	}

	public void setLoadBalancers(List<LoadBalancer> loadBalancers) {
		this.loadBalancers = loadBalancers;
	}

	public static class LoadBalancer {

		private String addressAllocatedMode;

		private String addressType;

		private String bandwidthPackageId;

		private String createTime;

		private String dNSName;

		private String loadBalancerBussinessStatus;

		private String loadBalancerEdition;

		private String loadBalancerId;

		private String loadBalancerName;

		private String loadBalancerStatus;

		private String resourceGroupId;

		private String vpcId;

		private List<LoadBalancerOperationLock> loadBalancerOperationLocks;

		private List<Tag> tags;

		private AccessLogConfig accessLogConfig;

		private DeletionProtectionConfig deletionProtectionConfig;

		private LoadBalancerBillingConfig loadBalancerBillingConfig;

		private ModificationProtectionConfig modificationProtectionConfig;

		public String getAddressAllocatedMode() {
			return this.addressAllocatedMode;
		}

		public void setAddressAllocatedMode(String addressAllocatedMode) {
			this.addressAllocatedMode = addressAllocatedMode;
		}

		public String getAddressType() {
			return this.addressType;
		}

		public void setAddressType(String addressType) {
			this.addressType = addressType;
		}

		public String getBandwidthPackageId() {
			return this.bandwidthPackageId;
		}

		public void setBandwidthPackageId(String bandwidthPackageId) {
			this.bandwidthPackageId = bandwidthPackageId;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getDNSName() {
			return this.dNSName;
		}

		public void setDNSName(String dNSName) {
			this.dNSName = dNSName;
		}

		public String getLoadBalancerBussinessStatus() {
			return this.loadBalancerBussinessStatus;
		}

		public void setLoadBalancerBussinessStatus(String loadBalancerBussinessStatus) {
			this.loadBalancerBussinessStatus = loadBalancerBussinessStatus;
		}

		public String getLoadBalancerEdition() {
			return this.loadBalancerEdition;
		}

		public void setLoadBalancerEdition(String loadBalancerEdition) {
			this.loadBalancerEdition = loadBalancerEdition;
		}

		public String getLoadBalancerId() {
			return this.loadBalancerId;
		}

		public void setLoadBalancerId(String loadBalancerId) {
			this.loadBalancerId = loadBalancerId;
		}

		public String getLoadBalancerName() {
			return this.loadBalancerName;
		}

		public void setLoadBalancerName(String loadBalancerName) {
			this.loadBalancerName = loadBalancerName;
		}

		public String getLoadBalancerStatus() {
			return this.loadBalancerStatus;
		}

		public void setLoadBalancerStatus(String loadBalancerStatus) {
			this.loadBalancerStatus = loadBalancerStatus;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public List<LoadBalancerOperationLock> getLoadBalancerOperationLocks() {
			return this.loadBalancerOperationLocks;
		}

		public void setLoadBalancerOperationLocks(List<LoadBalancerOperationLock> loadBalancerOperationLocks) {
			this.loadBalancerOperationLocks = loadBalancerOperationLocks;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public AccessLogConfig getAccessLogConfig() {
			return this.accessLogConfig;
		}

		public void setAccessLogConfig(AccessLogConfig accessLogConfig) {
			this.accessLogConfig = accessLogConfig;
		}

		public DeletionProtectionConfig getDeletionProtectionConfig() {
			return this.deletionProtectionConfig;
		}

		public void setDeletionProtectionConfig(DeletionProtectionConfig deletionProtectionConfig) {
			this.deletionProtectionConfig = deletionProtectionConfig;
		}

		public LoadBalancerBillingConfig getLoadBalancerBillingConfig() {
			return this.loadBalancerBillingConfig;
		}

		public void setLoadBalancerBillingConfig(LoadBalancerBillingConfig loadBalancerBillingConfig) {
			this.loadBalancerBillingConfig = loadBalancerBillingConfig;
		}

		public ModificationProtectionConfig getModificationProtectionConfig() {
			return this.modificationProtectionConfig;
		}

		public void setModificationProtectionConfig(ModificationProtectionConfig modificationProtectionConfig) {
			this.modificationProtectionConfig = modificationProtectionConfig;
		}

		public static class LoadBalancerOperationLock {

			private String lockReason;

			private String lockType;

			public String getLockReason() {
				return this.lockReason;
			}

			public void setLockReason(String lockReason) {
				this.lockReason = lockReason;
			}

			public String getLockType() {
				return this.lockType;
			}

			public void setLockType(String lockType) {
				this.lockType = lockType;
			}
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

		public static class AccessLogConfig {

			private String logProject;

			private String logStore;

			public String getLogProject() {
				return this.logProject;
			}

			public void setLogProject(String logProject) {
				this.logProject = logProject;
			}

			public String getLogStore() {
				return this.logStore;
			}

			public void setLogStore(String logStore) {
				this.logStore = logStore;
			}
		}

		public static class DeletionProtectionConfig {

			private Boolean enabled;

			private String enabledTime;

			public Boolean getEnabled() {
				return this.enabled;
			}

			public void setEnabled(Boolean enabled) {
				this.enabled = enabled;
			}

			public String getEnabledTime() {
				return this.enabledTime;
			}

			public void setEnabledTime(String enabledTime) {
				this.enabledTime = enabledTime;
			}
		}

		public static class LoadBalancerBillingConfig {

			private String payType;

			public String getPayType() {
				return this.payType;
			}

			public void setPayType(String payType) {
				this.payType = payType;
			}
		}

		public static class ModificationProtectionConfig {

			private String reason;

			private String status;

			public String getReason() {
				return this.reason;
			}

			public void setReason(String reason) {
				this.reason = reason;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}
	}

	@Override
	public ListLoadBalancersResponse getInstance(UnmarshallerContext context) {
		return	ListLoadBalancersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
