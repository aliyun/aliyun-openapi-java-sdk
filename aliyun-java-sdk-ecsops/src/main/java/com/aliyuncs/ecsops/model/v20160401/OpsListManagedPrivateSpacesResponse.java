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
import com.aliyuncs.ecsops.transform.v20160401.OpsListManagedPrivateSpacesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsListManagedPrivateSpacesResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private String nextToken;

	private List<ManagedPrivateSpaceSet> managedPrivateSpaceSets;

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

	public List<ManagedPrivateSpaceSet> getManagedPrivateSpaceSets() {
		return this.managedPrivateSpaceSets;
	}

	public void setManagedPrivateSpaceSets(List<ManagedPrivateSpaceSet> managedPrivateSpaceSets) {
		this.managedPrivateSpaceSets = managedPrivateSpaceSets;
	}

	public static class ManagedPrivateSpaceSet {

		private String creationTime;

		private String description;

		private String managedPrivateSpaceId;

		private String managedPrivateSpaceName;

		private String resourceGroupId;

		private String saleMode;

		private String zoneId;

		private List<DeploymentAttribute> deploymentAttributes;

		private List<ManagedHostSet> managedHostSets;

		private List<Tag> tags;

		private CapacityAttribute capacityAttribute;

		private LifecycleAttribute lifecycleAttribute;

		private LocationAttribute locationAttribute;

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getManagedPrivateSpaceId() {
			return this.managedPrivateSpaceId;
		}

		public void setManagedPrivateSpaceId(String managedPrivateSpaceId) {
			this.managedPrivateSpaceId = managedPrivateSpaceId;
		}

		public String getManagedPrivateSpaceName() {
			return this.managedPrivateSpaceName;
		}

		public void setManagedPrivateSpaceName(String managedPrivateSpaceName) {
			this.managedPrivateSpaceName = managedPrivateSpaceName;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getSaleMode() {
			return this.saleMode;
		}

		public void setSaleMode(String saleMode) {
			this.saleMode = saleMode;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public List<DeploymentAttribute> getDeploymentAttributes() {
			return this.deploymentAttributes;
		}

		public void setDeploymentAttributes(List<DeploymentAttribute> deploymentAttributes) {
			this.deploymentAttributes = deploymentAttributes;
		}

		public List<ManagedHostSet> getManagedHostSets() {
			return this.managedHostSets;
		}

		public void setManagedHostSets(List<ManagedHostSet> managedHostSets) {
			this.managedHostSets = managedHostSets;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public CapacityAttribute getCapacityAttribute() {
			return this.capacityAttribute;
		}

		public void setCapacityAttribute(CapacityAttribute capacityAttribute) {
			this.capacityAttribute = capacityAttribute;
		}

		public LifecycleAttribute getLifecycleAttribute() {
			return this.lifecycleAttribute;
		}

		public void setLifecycleAttribute(LifecycleAttribute lifecycleAttribute) {
			this.lifecycleAttribute = lifecycleAttribute;
		}

		public LocationAttribute getLocationAttribute() {
			return this.locationAttribute;
		}

		public void setLocationAttribute(LocationAttribute locationAttribute) {
			this.locationAttribute = locationAttribute;
		}

		public static class DeploymentAttribute {

			private String contractId;

			private String createTime;

			private String description;

			private List<DeploymentStep> deploymentSteps;

			public String getContractId() {
				return this.contractId;
			}

			public void setContractId(String contractId) {
				this.contractId = contractId;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public List<DeploymentStep> getDeploymentSteps() {
				return this.deploymentSteps;
			}

			public void setDeploymentSteps(List<DeploymentStep> deploymentSteps) {
				this.deploymentSteps = deploymentSteps;
			}

			public static class DeploymentStep {

				private Boolean currentStep;

				private String status;

				private String expectTime;

				private String actualTime;

				public Boolean getCurrentStep() {
					return this.currentStep;
				}

				public void setCurrentStep(Boolean currentStep) {
					this.currentStep = currentStep;
				}

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public String getExpectTime() {
					return this.expectTime;
				}

				public void setExpectTime(String expectTime) {
					this.expectTime = expectTime;
				}

				public String getActualTime() {
					return this.actualTime;
				}

				public void setActualTime(String actualTime) {
					this.actualTime = actualTime;
				}
			}
		}

		public static class ManagedHostSet {

			private String managedHostId;

			private String managedHostStatus;

			public String getManagedHostId() {
				return this.managedHostId;
			}

			public void setManagedHostId(String managedHostId) {
				this.managedHostId = managedHostId;
			}

			public String getManagedHostStatus() {
				return this.managedHostStatus;
			}

			public void setManagedHostStatus(String managedHostStatus) {
				this.managedHostStatus = managedHostStatus;
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

			private Integer totalHostCount;

			private Integer totalVcpus;

			private Integer totalMemories;

			private Integer availableHostCount;

			private Integer availableMemories;

			private Integer availableVcpus;

			private Integer reservedHostCount;

			private Integer reservedVcpus;

			private Integer reservedMemories;

			public Integer getTotalHostCount() {
				return this.totalHostCount;
			}

			public void setTotalHostCount(Integer totalHostCount) {
				this.totalHostCount = totalHostCount;
			}

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

			public Integer getAvailableHostCount() {
				return this.availableHostCount;
			}

			public void setAvailableHostCount(Integer availableHostCount) {
				this.availableHostCount = availableHostCount;
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

			public Integer getReservedHostCount() {
				return this.reservedHostCount;
			}

			public void setReservedHostCount(Integer reservedHostCount) {
				this.reservedHostCount = reservedHostCount;
			}

			public Integer getReservedVcpus() {
				return this.reservedVcpus;
			}

			public void setReservedVcpus(Integer reservedVcpus) {
				this.reservedVcpus = reservedVcpus;
			}

			public Integer getReservedMemories() {
				return this.reservedMemories;
			}

			public void setReservedMemories(Integer reservedMemories) {
				this.reservedMemories = reservedMemories;
			}
		}

		public static class LifecycleAttribute {

			private String expirationTime;

			private String deliveryTime;

			private String receptionTime;

			public String getExpirationTime() {
				return this.expirationTime;
			}

			public void setExpirationTime(String expirationTime) {
				this.expirationTime = expirationTime;
			}

			public String getDeliveryTime() {
				return this.deliveryTime;
			}

			public void setDeliveryTime(String deliveryTime) {
				this.deliveryTime = deliveryTime;
			}

			public String getReceptionTime() {
				return this.receptionTime;
			}

			public void setReceptionTime(String receptionTime) {
				this.receptionTime = receptionTime;
			}
		}

		public static class LocationAttribute {

			private String address;

			public String getAddress() {
				return this.address;
			}

			public void setAddress(String address) {
				this.address = address;
			}
		}
	}

	@Override
	public OpsListManagedPrivateSpacesResponse getInstance(UnmarshallerContext context) {
		return	OpsListManagedPrivateSpacesResponseUnmarshaller.unmarshall(this, context);
	}
}
