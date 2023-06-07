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

package com.aliyuncs.swas_open.model.v20200601;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.swas_open.transform.v20200601.ListInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListInstancesResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private Integer pageSize;

	private Integer pageNumber;

	private List<Instance> instances;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<Instance> getInstances() {
		return this.instances;
	}

	public void setInstances(List<Instance> instances) {
		this.instances = instances;
	}

	public static class Instance {

		private String status;

		private String creationTime;

		private String innerIpAddress;

		private String chargeType;

		private String instanceId;

		private String planId;

		private String publicIpAddress;

		private String regionId;

		private String expiredTime;

		private String instanceName;

		private String businessStatus;

		private String ddosStatus;

		private String imageId;

		private String disableReason;

		private Boolean combination;

		private String combinationInstanceId;

		private String uuid;

		private ResourceSpec resourceSpec;

		private Image image;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getInnerIpAddress() {
			return this.innerIpAddress;
		}

		public void setInnerIpAddress(String innerIpAddress) {
			this.innerIpAddress = innerIpAddress;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getPlanId() {
			return this.planId;
		}

		public void setPlanId(String planId) {
			this.planId = planId;
		}

		public String getPublicIpAddress() {
			return this.publicIpAddress;
		}

		public void setPublicIpAddress(String publicIpAddress) {
			this.publicIpAddress = publicIpAddress;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getExpiredTime() {
			return this.expiredTime;
		}

		public void setExpiredTime(String expiredTime) {
			this.expiredTime = expiredTime;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getBusinessStatus() {
			return this.businessStatus;
		}

		public void setBusinessStatus(String businessStatus) {
			this.businessStatus = businessStatus;
		}

		public String getDdosStatus() {
			return this.ddosStatus;
		}

		public void setDdosStatus(String ddosStatus) {
			this.ddosStatus = ddosStatus;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public String getDisableReason() {
			return this.disableReason;
		}

		public void setDisableReason(String disableReason) {
			this.disableReason = disableReason;
		}

		public Boolean getCombination() {
			return this.combination;
		}

		public void setCombination(Boolean combination) {
			this.combination = combination;
		}

		public String getCombinationInstanceId() {
			return this.combinationInstanceId;
		}

		public void setCombinationInstanceId(String combinationInstanceId) {
			this.combinationInstanceId = combinationInstanceId;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public ResourceSpec getResourceSpec() {
			return this.resourceSpec;
		}

		public void setResourceSpec(ResourceSpec resourceSpec) {
			this.resourceSpec = resourceSpec;
		}

		public Image getImage() {
			return this.image;
		}

		public void setImage(Image image) {
			this.image = image;
		}

		public static class ResourceSpec {

			private String diskCategory;

			private Integer cpu;

			private Integer bandwidth;

			private Integer diskSize;

			private Double memory;

			private Double flow;

			public String getDiskCategory() {
				return this.diskCategory;
			}

			public void setDiskCategory(String diskCategory) {
				this.diskCategory = diskCategory;
			}

			public Integer getCpu() {
				return this.cpu;
			}

			public void setCpu(Integer cpu) {
				this.cpu = cpu;
			}

			public Integer getBandwidth() {
				return this.bandwidth;
			}

			public void setBandwidth(Integer bandwidth) {
				this.bandwidth = bandwidth;
			}

			public Integer getDiskSize() {
				return this.diskSize;
			}

			public void setDiskSize(Integer diskSize) {
				this.diskSize = diskSize;
			}

			public Double getMemory() {
				return this.memory;
			}

			public void setMemory(Double memory) {
				this.memory = memory;
			}

			public Double getFlow() {
				return this.flow;
			}

			public void setFlow(Double flow) {
				this.flow = flow;
			}
		}

		public static class Image {

			private String osType;

			private String imageName;

			private String imageVersion;

			private String imageType;

			private String imageIconUrl;

			private String imageContact;

			public String getOsType() {
				return this.osType;
			}

			public void setOsType(String osType) {
				this.osType = osType;
			}

			public String getImageName() {
				return this.imageName;
			}

			public void setImageName(String imageName) {
				this.imageName = imageName;
			}

			public String getImageVersion() {
				return this.imageVersion;
			}

			public void setImageVersion(String imageVersion) {
				this.imageVersion = imageVersion;
			}

			public String getImageType() {
				return this.imageType;
			}

			public void setImageType(String imageType) {
				this.imageType = imageType;
			}

			public String getImageIconUrl() {
				return this.imageIconUrl;
			}

			public void setImageIconUrl(String imageIconUrl) {
				this.imageIconUrl = imageIconUrl;
			}

			public String getImageContact() {
				return this.imageContact;
			}

			public void setImageContact(String imageContact) {
				this.imageContact = imageContact;
			}
		}
	}

	@Override
	public ListInstancesResponse getInstance(UnmarshallerContext context) {
		return	ListInstancesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
