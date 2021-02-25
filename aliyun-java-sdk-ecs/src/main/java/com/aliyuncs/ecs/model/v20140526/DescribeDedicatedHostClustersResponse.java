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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeDedicatedHostClustersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDedicatedHostClustersResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<DedicatedHostCluster> dedicatedHostClusters;

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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<DedicatedHostCluster> getDedicatedHostClusters() {
		return this.dedicatedHostClusters;
	}

	public void setDedicatedHostClusters(List<DedicatedHostCluster> dedicatedHostClusters) {
		this.dedicatedHostClusters = dedicatedHostClusters;
	}

	public static class DedicatedHostCluster {

		private String dedicatedHostClusterId;

		private String regionId;

		private String zoneId;

		private String dedicatedHostClusterName;

		private String description;

		private String resourceGroupId;

		private List<Tag> tags;

		private List<String> dedicatedHostIds;

		private DedicatedHostClusterCapacity dedicatedHostClusterCapacity;

		public String getDedicatedHostClusterId() {
			return this.dedicatedHostClusterId;
		}

		public void setDedicatedHostClusterId(String dedicatedHostClusterId) {
			this.dedicatedHostClusterId = dedicatedHostClusterId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getDedicatedHostClusterName() {
			return this.dedicatedHostClusterName;
		}

		public void setDedicatedHostClusterName(String dedicatedHostClusterName) {
			this.dedicatedHostClusterName = dedicatedHostClusterName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public List<String> getDedicatedHostIds() {
			return this.dedicatedHostIds;
		}

		public void setDedicatedHostIds(List<String> dedicatedHostIds) {
			this.dedicatedHostIds = dedicatedHostIds;
		}

		public DedicatedHostClusterCapacity getDedicatedHostClusterCapacity() {
			return this.dedicatedHostClusterCapacity;
		}

		public void setDedicatedHostClusterCapacity(DedicatedHostClusterCapacity dedicatedHostClusterCapacity) {
			this.dedicatedHostClusterCapacity = dedicatedHostClusterCapacity;
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

		public static class DedicatedHostClusterCapacity {

			private Integer totalVcpus;

			private Integer availableVcpus;

			private Integer totalMemory;

			private Integer availableMemory;

			private List<LocalStorageCapacity> localStorageCapacities;

			private List<AvailableInstanceType> availableInstanceTypes;

			public Integer getTotalVcpus() {
				return this.totalVcpus;
			}

			public void setTotalVcpus(Integer totalVcpus) {
				this.totalVcpus = totalVcpus;
			}

			public Integer getAvailableVcpus() {
				return this.availableVcpus;
			}

			public void setAvailableVcpus(Integer availableVcpus) {
				this.availableVcpus = availableVcpus;
			}

			public Integer getTotalMemory() {
				return this.totalMemory;
			}

			public void setTotalMemory(Integer totalMemory) {
				this.totalMemory = totalMemory;
			}

			public Integer getAvailableMemory() {
				return this.availableMemory;
			}

			public void setAvailableMemory(Integer availableMemory) {
				this.availableMemory = availableMemory;
			}

			public List<LocalStorageCapacity> getLocalStorageCapacities() {
				return this.localStorageCapacities;
			}

			public void setLocalStorageCapacities(List<LocalStorageCapacity> localStorageCapacities) {
				this.localStorageCapacities = localStorageCapacities;
			}

			public List<AvailableInstanceType> getAvailableInstanceTypes() {
				return this.availableInstanceTypes;
			}

			public void setAvailableInstanceTypes(List<AvailableInstanceType> availableInstanceTypes) {
				this.availableInstanceTypes = availableInstanceTypes;
			}

			public static class LocalStorageCapacity {

				private Integer totalDisk;

				private Integer availableDisk;

				private String dataDiskCategory;

				public Integer getTotalDisk() {
					return this.totalDisk;
				}

				public void setTotalDisk(Integer totalDisk) {
					this.totalDisk = totalDisk;
				}

				public Integer getAvailableDisk() {
					return this.availableDisk;
				}

				public void setAvailableDisk(Integer availableDisk) {
					this.availableDisk = availableDisk;
				}

				public String getDataDiskCategory() {
					return this.dataDiskCategory;
				}

				public void setDataDiskCategory(String dataDiskCategory) {
					this.dataDiskCategory = dataDiskCategory;
				}
			}

			public static class AvailableInstanceType {

				private String instanceType;

				private Integer availableInstanceCapacity;

				public String getInstanceType() {
					return this.instanceType;
				}

				public void setInstanceType(String instanceType) {
					this.instanceType = instanceType;
				}

				public Integer getAvailableInstanceCapacity() {
					return this.availableInstanceCapacity;
				}

				public void setAvailableInstanceCapacity(Integer availableInstanceCapacity) {
					this.availableInstanceCapacity = availableInstanceCapacity;
				}
			}
		}
	}

	@Override
	public DescribeDedicatedHostClustersResponse getInstance(UnmarshallerContext context) {
		return	DescribeDedicatedHostClustersResponseUnmarshaller.unmarshall(this, context);
	}
}
