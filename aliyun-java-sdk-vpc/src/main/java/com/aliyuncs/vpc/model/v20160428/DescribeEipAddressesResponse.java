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
import com.aliyuncs.vpc.transform.v20160428.DescribeEipAddressesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEipAddressesResponse extends AcsResponse {

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private Integer totalCount;

	private List<EipAddress> eipAddresses;

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

	public List<EipAddress> getEipAddresses() {
		return this.eipAddresses;
	}

	public void setEipAddresses(List<EipAddress> eipAddresses) {
		this.eipAddresses = eipAddresses;
	}

	public static class EipAddress {

		private String reservationActiveTime;

		private String status;

		private String reservationOrderType;

		private String allocationTime;

		private String netmode;

		private String chargeType;

		private String descritpion;

		private String description;

		private String mode;

		private String segmentInstanceId;

		private String reservationInternetChargeType;

		private String bandwidthPackageId;

		private String ipAddress;

		private String bandwidth;

		private String reservationBandwidth;

		private String eipBandwidth;

		private String name;

		private String privateIpAddress;

		private String instanceRegionId;

		private Boolean deletionProtection;

		private String instanceId;

		private Boolean secondLimited;

		private String instanceType;

		private String hDMonitorStatus;

		private String regionId;

		private String bandwidthPackageBandwidth;

		private Integer serviceManaged;

		private String expiredTime;

		private String resourceGroupId;

		private String allocationId;

		private String internetChargeType;

		private String businessStatus;

		private String bandwidthPackageType;

		private String hasReservationData;

		private String iSP;

		private String publicIpAddressPoolId;

		private List<LockReason> operationLocks;

		private List<Tag> tags;

		private List<String> availableRegions;

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

		public String getReservationOrderType() {
			return this.reservationOrderType;
		}

		public void setReservationOrderType(String reservationOrderType) {
			this.reservationOrderType = reservationOrderType;
		}

		public String getAllocationTime() {
			return this.allocationTime;
		}

		public void setAllocationTime(String allocationTime) {
			this.allocationTime = allocationTime;
		}

		public String getNetmode() {
			return this.netmode;
		}

		public void setNetmode(String netmode) {
			this.netmode = netmode;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public String getDescritpion() {
			return this.descritpion;
		}

		public void setDescritpion(String descritpion) {
			this.descritpion = descritpion;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getMode() {
			return this.mode;
		}

		public void setMode(String mode) {
			this.mode = mode;
		}

		public String getSegmentInstanceId() {
			return this.segmentInstanceId;
		}

		public void setSegmentInstanceId(String segmentInstanceId) {
			this.segmentInstanceId = segmentInstanceId;
		}

		public String getReservationInternetChargeType() {
			return this.reservationInternetChargeType;
		}

		public void setReservationInternetChargeType(String reservationInternetChargeType) {
			this.reservationInternetChargeType = reservationInternetChargeType;
		}

		public String getBandwidthPackageId() {
			return this.bandwidthPackageId;
		}

		public void setBandwidthPackageId(String bandwidthPackageId) {
			this.bandwidthPackageId = bandwidthPackageId;
		}

		public String getIpAddress() {
			return this.ipAddress;
		}

		public void setIpAddress(String ipAddress) {
			this.ipAddress = ipAddress;
		}

		public String getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(String bandwidth) {
			this.bandwidth = bandwidth;
		}

		public String getReservationBandwidth() {
			return this.reservationBandwidth;
		}

		public void setReservationBandwidth(String reservationBandwidth) {
			this.reservationBandwidth = reservationBandwidth;
		}

		public String getEipBandwidth() {
			return this.eipBandwidth;
		}

		public void setEipBandwidth(String eipBandwidth) {
			this.eipBandwidth = eipBandwidth;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPrivateIpAddress() {
			return this.privateIpAddress;
		}

		public void setPrivateIpAddress(String privateIpAddress) {
			this.privateIpAddress = privateIpAddress;
		}

		public String getInstanceRegionId() {
			return this.instanceRegionId;
		}

		public void setInstanceRegionId(String instanceRegionId) {
			this.instanceRegionId = instanceRegionId;
		}

		public Boolean getDeletionProtection() {
			return this.deletionProtection;
		}

		public void setDeletionProtection(Boolean deletionProtection) {
			this.deletionProtection = deletionProtection;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Boolean getSecondLimited() {
			return this.secondLimited;
		}

		public void setSecondLimited(Boolean secondLimited) {
			this.secondLimited = secondLimited;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getHDMonitorStatus() {
			return this.hDMonitorStatus;
		}

		public void setHDMonitorStatus(String hDMonitorStatus) {
			this.hDMonitorStatus = hDMonitorStatus;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getBandwidthPackageBandwidth() {
			return this.bandwidthPackageBandwidth;
		}

		public void setBandwidthPackageBandwidth(String bandwidthPackageBandwidth) {
			this.bandwidthPackageBandwidth = bandwidthPackageBandwidth;
		}

		public Integer getServiceManaged() {
			return this.serviceManaged;
		}

		public void setServiceManaged(Integer serviceManaged) {
			this.serviceManaged = serviceManaged;
		}

		public String getExpiredTime() {
			return this.expiredTime;
		}

		public void setExpiredTime(String expiredTime) {
			this.expiredTime = expiredTime;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getAllocationId() {
			return this.allocationId;
		}

		public void setAllocationId(String allocationId) {
			this.allocationId = allocationId;
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

		public String getBandwidthPackageType() {
			return this.bandwidthPackageType;
		}

		public void setBandwidthPackageType(String bandwidthPackageType) {
			this.bandwidthPackageType = bandwidthPackageType;
		}

		public String getHasReservationData() {
			return this.hasReservationData;
		}

		public void setHasReservationData(String hasReservationData) {
			this.hasReservationData = hasReservationData;
		}

		public String getISP() {
			return this.iSP;
		}

		public void setISP(String iSP) {
			this.iSP = iSP;
		}

		public String getPublicIpAddressPoolId() {
			return this.publicIpAddressPoolId;
		}

		public void setPublicIpAddressPoolId(String publicIpAddressPoolId) {
			this.publicIpAddressPoolId = publicIpAddressPoolId;
		}

		public List<LockReason> getOperationLocks() {
			return this.operationLocks;
		}

		public void setOperationLocks(List<LockReason> operationLocks) {
			this.operationLocks = operationLocks;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public List<String> getAvailableRegions() {
			return this.availableRegions;
		}

		public void setAvailableRegions(List<String> availableRegions) {
			this.availableRegions = availableRegions;
		}

		public List<String> getSecurityProtectionTypes() {
			return this.securityProtectionTypes;
		}

		public void setSecurityProtectionTypes(List<String> securityProtectionTypes) {
			this.securityProtectionTypes = securityProtectionTypes;
		}

		public static class LockReason {

			private String lockReason;

			public String getLockReason() {
				return this.lockReason;
			}

			public void setLockReason(String lockReason) {
				this.lockReason = lockReason;
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
	public DescribeEipAddressesResponse getInstance(UnmarshallerContext context) {
		return	DescribeEipAddressesResponseUnmarshaller.unmarshall(this, context);
	}
}
