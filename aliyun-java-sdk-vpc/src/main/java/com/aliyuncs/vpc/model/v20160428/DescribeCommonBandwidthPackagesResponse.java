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

package com.aliyuncs.vpc.model.v20160428;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.DescribeCommonBandwidthPackagesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCommonBandwidthPackagesResponse extends AcsResponse {

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private Integer totalCount;

	private List<CommonBandwidthPackage> commonBandwidthPackages;

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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<CommonBandwidthPackage> getCommonBandwidthPackages() {
		return this.commonBandwidthPackages;
	}

	public void setCommonBandwidthPackages(List<CommonBandwidthPackage> commonBandwidthPackages) {
		this.commonBandwidthPackages = commonBandwidthPackages;
	}

	public static class CommonBandwidthPackage {

		private String reservationActiveTime;

		private String status;

		private String creationTime;

		private String reservationOrderType;

		private Boolean deletionProtection;

		private String reservationInternetChargeType;

		private Integer ratio;

		private String instanceChargeType;

		private String regionId;

		private String bandwidthPackageId;

		private Integer serviceManaged;

		private String bandwidth;

		private String description;

		private String expiredTime;

		private String reservationBandwidth;

		private String resourceGroupId;

		private String internetChargeType;

		private String businessStatus;

		private String name;

		private String iSP;

		private String hasReservationData;

		private List<PublicIpAddresse> publicIpAddresses;

		private List<Tag> tags;

		private List<String> securityProtectionTypes;

		public String getReservationActiveTime() {
			return this.reservationActiveTime;
		}

		public void setReservationActiveTime(String reservationActiveTime) {
			this.reservationActiveTime = reservationActiveTime;
		}

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

		public String getReservationOrderType() {
			return this.reservationOrderType;
		}

		public void setReservationOrderType(String reservationOrderType) {
			this.reservationOrderType = reservationOrderType;
		}

		public Boolean getDeletionProtection() {
			return this.deletionProtection;
		}

		public void setDeletionProtection(Boolean deletionProtection) {
			this.deletionProtection = deletionProtection;
		}

		public String getReservationInternetChargeType() {
			return this.reservationInternetChargeType;
		}

		public void setReservationInternetChargeType(String reservationInternetChargeType) {
			this.reservationInternetChargeType = reservationInternetChargeType;
		}

		public Integer getRatio() {
			return this.ratio;
		}

		public void setRatio(Integer ratio) {
			this.ratio = ratio;
		}

		public String getInstanceChargeType() {
			return this.instanceChargeType;
		}

		public void setInstanceChargeType(String instanceChargeType) {
			this.instanceChargeType = instanceChargeType;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getBandwidthPackageId() {
			return this.bandwidthPackageId;
		}

		public void setBandwidthPackageId(String bandwidthPackageId) {
			this.bandwidthPackageId = bandwidthPackageId;
		}

		public Integer getServiceManaged() {
			return this.serviceManaged;
		}

		public void setServiceManaged(Integer serviceManaged) {
			this.serviceManaged = serviceManaged;
		}

		public String getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(String bandwidth) {
			this.bandwidth = bandwidth;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getExpiredTime() {
			return this.expiredTime;
		}

		public void setExpiredTime(String expiredTime) {
			this.expiredTime = expiredTime;
		}

		public String getReservationBandwidth() {
			return this.reservationBandwidth;
		}

		public void setReservationBandwidth(String reservationBandwidth) {
			this.reservationBandwidth = reservationBandwidth;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getInternetChargeType() {
			return this.internetChargeType;
		}

		public void setInternetChargeType(String internetChargeType) {
			this.internetChargeType = internetChargeType;
		}

		public String getBusinessStatus() {
			return this.businessStatus;
		}

		public void setBusinessStatus(String businessStatus) {
			this.businessStatus = businessStatus;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getISP() {
			return this.iSP;
		}

		public void setISP(String iSP) {
			this.iSP = iSP;
		}

		public String getHasReservationData() {
			return this.hasReservationData;
		}

		public void setHasReservationData(String hasReservationData) {
			this.hasReservationData = hasReservationData;
		}

		public List<PublicIpAddresse> getPublicIpAddresses() {
			return this.publicIpAddresses;
		}

		public void setPublicIpAddresses(List<PublicIpAddresse> publicIpAddresses) {
			this.publicIpAddresses = publicIpAddresses;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public List<String> getSecurityProtectionTypes() {
			return this.securityProtectionTypes;
		}

		public void setSecurityProtectionTypes(List<String> securityProtectionTypes) {
			this.securityProtectionTypes = securityProtectionTypes;
		}

		public static class PublicIpAddresse {

			private String ipAddress;

			private String allocationId;

			private String bandwidthPackageIpRelationStatus;

			public String getIpAddress() {
				return this.ipAddress;
			}

			public void setIpAddress(String ipAddress) {
				this.ipAddress = ipAddress;
			}

			public String getAllocationId() {
				return this.allocationId;
			}

			public void setAllocationId(String allocationId) {
				this.allocationId = allocationId;
			}

			public String getBandwidthPackageIpRelationStatus() {
				return this.bandwidthPackageIpRelationStatus;
			}

			public void setBandwidthPackageIpRelationStatus(String bandwidthPackageIpRelationStatus) {
				this.bandwidthPackageIpRelationStatus = bandwidthPackageIpRelationStatus;
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
	}

	@Override
	public DescribeCommonBandwidthPackagesResponse getInstance(UnmarshallerContext context) {
		return	DescribeCommonBandwidthPackagesResponseUnmarshaller.unmarshall(this, context);
	}
}
