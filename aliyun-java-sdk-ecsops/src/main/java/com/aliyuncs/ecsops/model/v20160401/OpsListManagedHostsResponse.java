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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsListManagedHostsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsListManagedHostsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private String nextToken;

	private List<ManagedHostSet> managedHostSets;

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

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<ManagedHostSet> getManagedHostSets() {
		return this.managedHostSets;
	}

	public void setManagedHostSets(List<ManagedHostSet> managedHostSets) {
		this.managedHostSets = managedHostSets;
	}

	public static class ManagedHostSet {

		private String managedHostId;

		private String status;

		private String mode;

		private String resourceGroupId;

		private String managedRackId;

		private String managedRealRackId;

		private String managedHostType;

		private List<InstanceSet> instanceSets;

		private List<Tag> tags;

		private List<String> supportInstanceTypeFamilies;

		private List<String> supportedCustomInstanceTypeFamilies;

		private List<String> supportedInstanceTypes;

		private CapacityAttribute capacityAttribute;

		private NetworkAssociation networkAssociation;

		private HostAttribute hostAttribute;

		public String getManagedHostId() {
			return this.managedHostId;
		}

		public void setManagedHostId(String managedHostId) {
			this.managedHostId = managedHostId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
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

		public String getManagedRackId() {
			return this.managedRackId;
		}

		public void setManagedRackId(String managedRackId) {
			this.managedRackId = managedRackId;
		}

		public String getManagedRealRackId() {
			return this.managedRealRackId;
		}

		public void setManagedRealRackId(String managedRealRackId) {
			this.managedRealRackId = managedRealRackId;
		}

		public String getManagedHostType() {
			return this.managedHostType;
		}

		public void setManagedHostType(String managedHostType) {
			this.managedHostType = managedHostType;
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

		public List<String> getSupportInstanceTypeFamilies() {
			return this.supportInstanceTypeFamilies;
		}

		public void setSupportInstanceTypeFamilies(List<String> supportInstanceTypeFamilies) {
			this.supportInstanceTypeFamilies = supportInstanceTypeFamilies;
		}

		public List<String> getSupportedCustomInstanceTypeFamilies() {
			return this.supportedCustomInstanceTypeFamilies;
		}

		public void setSupportedCustomInstanceTypeFamilies(List<String> supportedCustomInstanceTypeFamilies) {
			this.supportedCustomInstanceTypeFamilies = supportedCustomInstanceTypeFamilies;
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

		public NetworkAssociation getNetworkAssociation() {
			return this.networkAssociation;
		}

		public void setNetworkAssociation(NetworkAssociation networkAssociation) {
			this.networkAssociation = networkAssociation;
		}

		public HostAttribute getHostAttribute() {
			return this.hostAttribute;
		}

		public void setHostAttribute(HostAttribute hostAttribute) {
			this.hostAttribute = hostAttribute;
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

			private String tagKey;

			private String tagValue;

			public String getTagKey() {
				return this.tagKey;
			}

			public void setTagKey(String tagKey) {
				this.tagKey = tagKey;
			}

			public String getTagValue() {
				return this.tagValue;
			}

			public void setTagValue(String tagValue) {
				this.tagValue = tagValue;
			}
		}

		public static class CapacityAttribute {

			private Integer totalVcpus;

			private Integer totalMemories;

			private Integer availableMemories;

			private Integer availableVcpus;

			public Integer getTotalVcpus() {
				return this.totalVcpus;
			}

			public void setTotalVcpus(Integer totalVcpus) {
				this.totalVcpus = totalVcpus;
			}

			public Integer getTotalMemories() {
				return this.totalMemories;
			}

			public void setTotalMemories(Integer totalMemories) {
				this.totalMemories = totalMemories;
			}

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

		public static class HostAttribute {

			private String hostType;

			private String cpuModelName;

			private String serialNumber;

			public String getHostType() {
				return this.hostType;
			}

			public void setHostType(String hostType) {
				this.hostType = hostType;
			}

			public String getCpuModelName() {
				return this.cpuModelName;
			}

			public void setCpuModelName(String cpuModelName) {
				this.cpuModelName = cpuModelName;
			}

			public String getSerialNumber() {
				return this.serialNumber;
			}

			public void setSerialNumber(String serialNumber) {
				this.serialNumber = serialNumber;
			}
		}
	}

	@Override
	public OpsListManagedHostsResponse getInstance(UnmarshallerContext context) {
		return	OpsListManagedHostsResponseUnmarshaller.unmarshall(this, context);
	}
}
