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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryAvailableRegionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryAvailableRegionResponse extends AcsResponse {

	private String requestId;

	private List<IzModel> izModels;

	private Region region;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<IzModel> getIzModels() {
		return this.izModels;
	}

	public void setIzModels(List<IzModel> izModels) {
		this.izModels = izModels;
	}

	public Region getRegion() {
		return this.region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public static class IzModel {

		private String no;

		private String regionNo;

		private String cnName;

		private String enName;

		private String statusCatalogue;

		private String status;

		private Map<Object,Object> deployedInstanceTypeToStatus;

		private List<IZResourceModel> iZResourceModels;

		private List<String> supportedVolumeCategories;

		private List<String> allowedResourceCreation;

		private List<String> supportedInstanceTypeNames;

		private List<String> supportedInstanceTypeFamilies;

		private List<String> supportedInstanceGenerations;

		private List<String> supportedDedicatedHostTypeNames;

		private List<String> supportedDedicatedHostGenerations;

		public String getNo() {
			return this.no;
		}

		public void setNo(String no) {
			this.no = no;
		}

		public String getRegionNo() {
			return this.regionNo;
		}

		public void setRegionNo(String regionNo) {
			this.regionNo = regionNo;
		}

		public String getCnName() {
			return this.cnName;
		}

		public void setCnName(String cnName) {
			this.cnName = cnName;
		}

		public String getEnName() {
			return this.enName;
		}

		public void setEnName(String enName) {
			this.enName = enName;
		}

		public String getStatusCatalogue() {
			return this.statusCatalogue;
		}

		public void setStatusCatalogue(String statusCatalogue) {
			this.statusCatalogue = statusCatalogue;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Map<Object,Object> getDeployedInstanceTypeToStatus() {
			return this.deployedInstanceTypeToStatus;
		}

		public void setDeployedInstanceTypeToStatus(Map<Object,Object> deployedInstanceTypeToStatus) {
			this.deployedInstanceTypeToStatus = deployedInstanceTypeToStatus;
		}

		public List<IZResourceModel> getIZResourceModels() {
			return this.iZResourceModels;
		}

		public void setIZResourceModels(List<IZResourceModel> iZResourceModels) {
			this.iZResourceModels = iZResourceModels;
		}

		public List<String> getSupportedVolumeCategories() {
			return this.supportedVolumeCategories;
		}

		public void setSupportedVolumeCategories(List<String> supportedVolumeCategories) {
			this.supportedVolumeCategories = supportedVolumeCategories;
		}

		public List<String> getAllowedResourceCreation() {
			return this.allowedResourceCreation;
		}

		public void setAllowedResourceCreation(List<String> allowedResourceCreation) {
			this.allowedResourceCreation = allowedResourceCreation;
		}

		public List<String> getSupportedInstanceTypeNames() {
			return this.supportedInstanceTypeNames;
		}

		public void setSupportedInstanceTypeNames(List<String> supportedInstanceTypeNames) {
			this.supportedInstanceTypeNames = supportedInstanceTypeNames;
		}

		public List<String> getSupportedInstanceTypeFamilies() {
			return this.supportedInstanceTypeFamilies;
		}

		public void setSupportedInstanceTypeFamilies(List<String> supportedInstanceTypeFamilies) {
			this.supportedInstanceTypeFamilies = supportedInstanceTypeFamilies;
		}

		public List<String> getSupportedInstanceGenerations() {
			return this.supportedInstanceGenerations;
		}

		public void setSupportedInstanceGenerations(List<String> supportedInstanceGenerations) {
			this.supportedInstanceGenerations = supportedInstanceGenerations;
		}

		public List<String> getSupportedDedicatedHostTypeNames() {
			return this.supportedDedicatedHostTypeNames;
		}

		public void setSupportedDedicatedHostTypeNames(List<String> supportedDedicatedHostTypeNames) {
			this.supportedDedicatedHostTypeNames = supportedDedicatedHostTypeNames;
		}

		public List<String> getSupportedDedicatedHostGenerations() {
			return this.supportedDedicatedHostGenerations;
		}

		public void setSupportedDedicatedHostGenerations(List<String> supportedDedicatedHostGenerations) {
			this.supportedDedicatedHostGenerations = supportedDedicatedHostGenerations;
		}

		public static class IZResourceModel {

			private Integer inventoryResourceType;

			private Boolean supportIoOptimized;

			private Map<Object,Object> deployedInstanceTypeToStatus;

			private List<String> supportedSystemDiskCategories;

			private List<String> supportedDataDiskCategories;

			private List<String> supportedInstanceTypes;

			private List<String> supportedInstanceTypeFamilies1;

			private List<String> supportedInstanceGenerations2;

			private List<String> supportedDedicatedHostTypes;

			private List<String> supportedDedicatedHostGenerations3;

			private List<String> networkTypes;

			public Integer getInventoryResourceType() {
				return this.inventoryResourceType;
			}

			public void setInventoryResourceType(Integer inventoryResourceType) {
				this.inventoryResourceType = inventoryResourceType;
			}

			public Boolean getSupportIoOptimized() {
				return this.supportIoOptimized;
			}

			public void setSupportIoOptimized(Boolean supportIoOptimized) {
				this.supportIoOptimized = supportIoOptimized;
			}

			public Map<Object,Object> getDeployedInstanceTypeToStatus() {
				return this.deployedInstanceTypeToStatus;
			}

			public void setDeployedInstanceTypeToStatus(Map<Object,Object> deployedInstanceTypeToStatus) {
				this.deployedInstanceTypeToStatus = deployedInstanceTypeToStatus;
			}

			public List<String> getSupportedSystemDiskCategories() {
				return this.supportedSystemDiskCategories;
			}

			public void setSupportedSystemDiskCategories(List<String> supportedSystemDiskCategories) {
				this.supportedSystemDiskCategories = supportedSystemDiskCategories;
			}

			public List<String> getSupportedDataDiskCategories() {
				return this.supportedDataDiskCategories;
			}

			public void setSupportedDataDiskCategories(List<String> supportedDataDiskCategories) {
				this.supportedDataDiskCategories = supportedDataDiskCategories;
			}

			public List<String> getSupportedInstanceTypes() {
				return this.supportedInstanceTypes;
			}

			public void setSupportedInstanceTypes(List<String> supportedInstanceTypes) {
				this.supportedInstanceTypes = supportedInstanceTypes;
			}

			public List<String> getSupportedInstanceTypeFamilies1() {
				return this.supportedInstanceTypeFamilies1;
			}

			public void setSupportedInstanceTypeFamilies1(List<String> supportedInstanceTypeFamilies1) {
				this.supportedInstanceTypeFamilies1 = supportedInstanceTypeFamilies1;
			}

			public List<String> getSupportedInstanceGenerations2() {
				return this.supportedInstanceGenerations2;
			}

			public void setSupportedInstanceGenerations2(List<String> supportedInstanceGenerations2) {
				this.supportedInstanceGenerations2 = supportedInstanceGenerations2;
			}

			public List<String> getSupportedDedicatedHostTypes() {
				return this.supportedDedicatedHostTypes;
			}

			public void setSupportedDedicatedHostTypes(List<String> supportedDedicatedHostTypes) {
				this.supportedDedicatedHostTypes = supportedDedicatedHostTypes;
			}

			public List<String> getSupportedDedicatedHostGenerations3() {
				return this.supportedDedicatedHostGenerations3;
			}

			public void setSupportedDedicatedHostGenerations3(List<String> supportedDedicatedHostGenerations3) {
				this.supportedDedicatedHostGenerations3 = supportedDedicatedHostGenerations3;
			}

			public List<String> getNetworkTypes() {
				return this.networkTypes;
			}

			public void setNetworkTypes(List<String> networkTypes) {
				this.networkTypes = networkTypes;
			}
		}
	}

	public static class Region {

		private String regionMemo;

		private String regionNo;

		private String regionName;

		private String regionEnName;

		private String regionNoAlias;

		private Long ecsQuota;

		private Long vmQuota;

		private String isActive;

		public String getRegionMemo() {
			return this.regionMemo;
		}

		public void setRegionMemo(String regionMemo) {
			this.regionMemo = regionMemo;
		}

		public String getRegionNo() {
			return this.regionNo;
		}

		public void setRegionNo(String regionNo) {
			this.regionNo = regionNo;
		}

		public String getRegionName() {
			return this.regionName;
		}

		public void setRegionName(String regionName) {
			this.regionName = regionName;
		}

		public String getRegionEnName() {
			return this.regionEnName;
		}

		public void setRegionEnName(String regionEnName) {
			this.regionEnName = regionEnName;
		}

		public String getRegionNoAlias() {
			return this.regionNoAlias;
		}

		public void setRegionNoAlias(String regionNoAlias) {
			this.regionNoAlias = regionNoAlias;
		}

		public Long getEcsQuota() {
			return this.ecsQuota;
		}

		public void setEcsQuota(Long ecsQuota) {
			this.ecsQuota = ecsQuota;
		}

		public Long getVmQuota() {
			return this.vmQuota;
		}

		public void setVmQuota(Long vmQuota) {
			this.vmQuota = vmQuota;
		}

		public String getIsActive() {
			return this.isActive;
		}

		public void setIsActive(String isActive) {
			this.isActive = isActive;
		}
	}

	@Override
	public OpsQueryAvailableRegionResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryAvailableRegionResponseUnmarshaller.unmarshall(this, context);
	}
}
