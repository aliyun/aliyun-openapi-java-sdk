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

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<CommonBandwidthPackage> commonBandwidthPackages;

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

	public List<CommonBandwidthPackage> getCommonBandwidthPackages() {
		return this.commonBandwidthPackages;
	}

	public void setCommonBandwidthPackages(List<CommonBandwidthPackage> commonBandwidthPackages) {
		this.commonBandwidthPackages = commonBandwidthPackages;
	}

	public static class CommonBandwidthPackage {

		private String bandwidthPackageId;

		private String regionId;

		private String name;

		private String description;

		private String bandwidth;

		private String instanceChargeType;

		private String internetChargeType;

		private String businessStatus;

		private String creationTime;

		private String expiredTime;

		private String status;

		private Integer ratio;

		private String resourceGroupId;

		private String hasReservationData;

		private String reservationBandwidth;

		private String reservationInternetChargeType;

		private String reservationActiveTime;

		private String reservationOrderType;

		private String iSP;

		private Boolean deletionProtection;

		private Integer serviceManaged;

		private List<PublicIpAddresse> publicIpAddresses;

		public String getBandwidthPackageId() {
			return this.bandwidthPackageId;
		}

		public void setBandwidthPackageId(String bandwidthPackageId) {
			this.bandwidthPackageId = bandwidthPackageId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(String bandwidth) {
			this.bandwidth = bandwidth;
		}

		public String getInstanceChargeType() {
			return this.instanceChargeType;
		}

		public void setInstanceChargeType(String instanceChargeType) {
			this.instanceChargeType = instanceChargeType;
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

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getExpiredTime() {
			return this.expiredTime;
		}

		public void setExpiredTime(String expiredTime) {
			this.expiredTime = expiredTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Integer getRatio() {
			return this.ratio;
		}

		public void setRatio(Integer ratio) {
			this.ratio = ratio;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getHasReservationData() {
			return this.hasReservationData;
		}

		public void setHasReservationData(String hasReservationData) {
			this.hasReservationData = hasReservationData;
		}

		public String getReservationBandwidth() {
			return this.reservationBandwidth;
		}

		public void setReservationBandwidth(String reservationBandwidth) {
			this.reservationBandwidth = reservationBandwidth;
		}

		public String getReservationInternetChargeType() {
			return this.reservationInternetChargeType;
		}

		public void setReservationInternetChargeType(String reservationInternetChargeType) {
			this.reservationInternetChargeType = reservationInternetChargeType;
		}

		public String getReservationActiveTime() {
			return this.reservationActiveTime;
		}

		public void setReservationActiveTime(String reservationActiveTime) {
			this.reservationActiveTime = reservationActiveTime;
		}

		public String getReservationOrderType() {
			return this.reservationOrderType;
		}

		public void setReservationOrderType(String reservationOrderType) {
			this.reservationOrderType = reservationOrderType;
		}

		public String getISP() {
			return this.iSP;
		}

		public void setISP(String iSP) {
			this.iSP = iSP;
		}

		public Boolean getDeletionProtection() {
			return this.deletionProtection;
		}

		public void setDeletionProtection(Boolean deletionProtection) {
			this.deletionProtection = deletionProtection;
		}

		public Integer getServiceManaged() {
			return this.serviceManaged;
		}

		public void setServiceManaged(Integer serviceManaged) {
			this.serviceManaged = serviceManaged;
		}

		public List<PublicIpAddresse> getPublicIpAddresses() {
			return this.publicIpAddresses;
		}

		public void setPublicIpAddresses(List<PublicIpAddresse> publicIpAddresses) {
			this.publicIpAddresses = publicIpAddresses;
		}

		public static class PublicIpAddresse {

			private String allocationId;

			private String ipAddress;

			private String bandwidthPackageIpRelationStatus;

			public String getAllocationId() {
				return this.allocationId;
			}

			public void setAllocationId(String allocationId) {
				this.allocationId = allocationId;
			}

			public String getIpAddress() {
				return this.ipAddress;
			}

			public void setIpAddress(String ipAddress) {
				this.ipAddress = ipAddress;
			}

			public String getBandwidthPackageIpRelationStatus() {
				return this.bandwidthPackageIpRelationStatus;
			}

			public void setBandwidthPackageIpRelationStatus(String bandwidthPackageIpRelationStatus) {
				this.bandwidthPackageIpRelationStatus = bandwidthPackageIpRelationStatus;
			}
		}
	}

	@Override
	public DescribeCommonBandwidthPackagesResponse getInstance(UnmarshallerContext context) {
		return	DescribeCommonBandwidthPackagesResponseUnmarshaller.unmarshall(this, context);
	}
}
