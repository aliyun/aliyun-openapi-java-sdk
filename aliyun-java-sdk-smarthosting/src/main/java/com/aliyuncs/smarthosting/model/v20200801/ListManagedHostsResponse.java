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

package com.aliyuncs.smarthosting.model.v20200801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.smarthosting.transform.v20200801.ListManagedHostsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListManagedHostsResponse extends AcsResponse {

	private String nextToken;

	private Integer pageSize;

	private String requestId;

	private Integer totalCount;

	private List<ManagedHostSet> managedHostSets;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
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

	public List<ManagedHostSet> getManagedHostSets() {
		return this.managedHostSets;
	}

	public void setManagedHostSets(List<ManagedHostSet> managedHostSets) {
		this.managedHostSets = managedHostSets;
	}

	public static class ManagedHostSet {

		private String managedHostId;

		private String managedHostName;

		private String mode;

		private String resourceGroupId;

		private String status;

		private List<InstanceSet> instanceSets;

		private List<Tag> tags;

		private List<String> supportedCustomInstanceTypeFamilies;

		private List<String> supportedInstanceTypeFamilies;

		private List<String> supportedInstanceTypes;

		private CapacityAttribute capacityAttribute;

		private HostAttribute hostAttribute;

		private NetworkAssociation networkAssociation;

		public String getManagedHostId() {
			return this.managedHostId;
		}

		public void setManagedHostId(String managedHostId) {
			this.managedHostId = managedHostId;
		}

		public String getManagedHostName() {
			return this.managedHostName;
		}

		public void setManagedHostName(String managedHostName) {
			this.managedHostName = managedHostName;
		}

		public String getMode() {
			return this.mode;
		}

		public void setMode(String mode) {
			this.mode = mode;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public List<InstanceSet> getInstanceSets() {
			return this.instanceSets;
		}

		public void setInstanceSets(List<InstanceSet> instanceSets) {
			this.instanceSets = instanceSets;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public List<String> getSupportedCustomInstanceTypeFamilies() {
			return this.supportedCustomInstanceTypeFamilies;
		}

		public void setSupportedCustomInstanceTypeFamilies(List<String> supportedCustomInstanceTypeFamilies) {
			this.supportedCustomInstanceTypeFamilies = supportedCustomInstanceTypeFamilies;
		}

		public List<String> getSupportedInstanceTypeFamilies() {
			return this.supportedInstanceTypeFamilies;
		}

		public void setSupportedInstanceTypeFamilies(List<String> supportedInstanceTypeFamilies) {
			this.supportedInstanceTypeFamilies = supportedInstanceTypeFamilies;
		}

		public List<String> getSupportedInstanceTypes() {
			return this.supportedInstanceTypes;
		}

		public void setSupportedInstanceTypes(List<String> supportedInstanceTypes) {
			this.supportedInstanceTypes = supportedInstanceTypes;
		}

		public CapacityAttribute getCapacityAttribute() {
			return this.capacityAttribute;
		}

		public void setCapacityAttribute(CapacityAttribute capacityAttribute) {
			this.capacityAttribute = capacityAttribute;
		}

		public HostAttribute getHostAttribute() {
			return this.hostAttribute;
		}

		public void setHostAttribute(HostAttribute hostAttribute) {
			this.hostAttribute = hostAttribute;
		}

		public NetworkAssociation getNetworkAssociation() {
			return this.networkAssociation;
		}

		public void setNetworkAssociation(NetworkAssociation networkAssociation) {
			this.networkAssociation = networkAssociation;
		}

		public static class InstanceSet {

			private String instanceId;

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
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

		public static class CapacityAttribute {

			private Integer availableMemories;

			private Integer availableVcpus;

			private Integer totalMemories;

			private Integer totalVcpus;

			public Integer getAvailableMemories() {
				return this.availableMemories;
			}

			public void setAvailableMemories(Integer availableMemories) {
				this.availableMemories = availableMemories;
			}

			public Integer getAvailableVcpus() {
				return this.availableVcpus;
			}

			public void setAvailableVcpus(Integer availableVcpus) {
				this.availableVcpus = availableVcpus;
			}

			public Integer getTotalMemories() {
				return this.totalMemories;
			}

			public void setTotalMemories(Integer totalMemories) {
				this.totalMemories = totalMemories;
			}

			public Integer getTotalVcpus() {
				return this.totalVcpus;
			}

			public void setTotalVcpus(Integer totalVcpus) {
				this.totalVcpus = totalVcpus;
			}
		}

		public static class HostAttribute {

			private String cpuModelName;

			private String hostType;

			public String getCpuModelName() {
				return this.cpuModelName;
			}

			public void setCpuModelName(String cpuModelName) {
				this.cpuModelName = cpuModelName;
			}

			public String getHostType() {
				return this.hostType;
			}

			public void setHostType(String hostType) {
				this.hostType = hostType;
			}
		}

		public static class NetworkAssociation {

			private List<SwitchSet> switchSets;

			public List<SwitchSet> getSwitchSets() {
				return this.switchSets;
			}

			public void setSwitchSets(List<SwitchSet> switchSets) {
				this.switchSets = switchSets;
			}

			public static class SwitchSet {

				private String switchId;

				public String getSwitchId() {
					return this.switchId;
				}

				public void setSwitchId(String switchId) {
					this.switchId = switchId;
				}
			}
		}
	}

	@Override
	public ListManagedHostsResponse getInstance(UnmarshallerContext context) {
		return	ListManagedHostsResponseUnmarshaller.unmarshall(this, context);
	}
}
