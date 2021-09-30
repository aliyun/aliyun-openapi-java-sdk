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
import com.aliyuncs.vpc.transform.v20160428.DescribeNatGatewaysResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeNatGatewaysResponse extends AcsResponse {

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private Integer totalCount;

	private List<NatGateway> natGateways;

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

	public List<NatGateway> getNatGateways() {
		return this.natGateways;
	}

	public void setNatGateways(List<NatGateway> natGateways) {
		this.natGateways = natGateways;
	}

	public static class NatGateway {

		private String status;

		private String creationTime;

		private String vpcId;

		private String natType;

		private Boolean autoPay;

		private String spec;

		private Boolean deletionProtection;

		private String networkType;

		private Boolean securityProtectionEnabled;

		private String instanceChargeType;

		private String regionId;

		private Boolean ecsMetricEnabled;

		private Boolean icmpReplyEnabled;

		private String description;

		private String expiredTime;

		private String resourceGroupId;

		private String natGatewayId;

		private String internetChargeType;

		private String businessStatus;

		private String name;

		private List<IpList> ipLists;

		private List<String> forwardTableIds;

		private List<String> snatTableIds;

		private List<String> bandwidthPackageIds;

		private NatGatewayPrivateInfo natGatewayPrivateInfo;

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

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getNatType() {
			return this.natType;
		}

		public void setNatType(String natType) {
			this.natType = natType;
		}

		public Boolean getAutoPay() {
			return this.autoPay;
		}

		public void setAutoPay(Boolean autoPay) {
			this.autoPay = autoPay;
		}

		public String getSpec() {
			return this.spec;
		}

		public void setSpec(String spec) {
			this.spec = spec;
		}

		public Boolean getDeletionProtection() {
			return this.deletionProtection;
		}

		public void setDeletionProtection(Boolean deletionProtection) {
			this.deletionProtection = deletionProtection;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
		}

		public Boolean getSecurityProtectionEnabled() {
			return this.securityProtectionEnabled;
		}

		public void setSecurityProtectionEnabled(Boolean securityProtectionEnabled) {
			this.securityProtectionEnabled = securityProtectionEnabled;
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

		public Boolean getEcsMetricEnabled() {
			return this.ecsMetricEnabled;
		}

		public void setEcsMetricEnabled(Boolean ecsMetricEnabled) {
			this.ecsMetricEnabled = ecsMetricEnabled;
		}

		public Boolean getIcmpReplyEnabled() {
			return this.icmpReplyEnabled;
		}

		public void setIcmpReplyEnabled(Boolean icmpReplyEnabled) {
			this.icmpReplyEnabled = icmpReplyEnabled;
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

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getNatGatewayId() {
			return this.natGatewayId;
		}

		public void setNatGatewayId(String natGatewayId) {
			this.natGatewayId = natGatewayId;
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

		public List<IpList> getIpLists() {
			return this.ipLists;
		}

		public void setIpLists(List<IpList> ipLists) {
			this.ipLists = ipLists;
		}

		public List<String> getForwardTableIds() {
			return this.forwardTableIds;
		}

		public void setForwardTableIds(List<String> forwardTableIds) {
			this.forwardTableIds = forwardTableIds;
		}

		public List<String> getSnatTableIds() {
			return this.snatTableIds;
		}

		public void setSnatTableIds(List<String> snatTableIds) {
			this.snatTableIds = snatTableIds;
		}

		public List<String> getBandwidthPackageIds() {
			return this.bandwidthPackageIds;
		}

		public void setBandwidthPackageIds(List<String> bandwidthPackageIds) {
			this.bandwidthPackageIds = bandwidthPackageIds;
		}

		public NatGatewayPrivateInfo getNatGatewayPrivateInfo() {
			return this.natGatewayPrivateInfo;
		}

		public void setNatGatewayPrivateInfo(NatGatewayPrivateInfo natGatewayPrivateInfo) {
			this.natGatewayPrivateInfo = natGatewayPrivateInfo;
		}

		public static class IpList {

			private String usingStatus;

			private String ipAddress;

			private Boolean snatEntryEnabled;

			private String allocationId;

			private Boolean apAccessEnabled;

			private String privateIpAddress;

			public String getUsingStatus() {
				return this.usingStatus;
			}

			public void setUsingStatus(String usingStatus) {
				this.usingStatus = usingStatus;
			}

			public String getIpAddress() {
				return this.ipAddress;
			}

			public void setIpAddress(String ipAddress) {
				this.ipAddress = ipAddress;
			}

			public Boolean getSnatEntryEnabled() {
				return this.snatEntryEnabled;
			}

			public void setSnatEntryEnabled(Boolean snatEntryEnabled) {
				this.snatEntryEnabled = snatEntryEnabled;
			}

			public String getAllocationId() {
				return this.allocationId;
			}

			public void setAllocationId(String allocationId) {
				this.allocationId = allocationId;
			}

			public Boolean getApAccessEnabled() {
				return this.apAccessEnabled;
			}

			public void setApAccessEnabled(Boolean apAccessEnabled) {
				this.apAccessEnabled = apAccessEnabled;
			}

			public String getPrivateIpAddress() {
				return this.privateIpAddress;
			}

			public void setPrivateIpAddress(String privateIpAddress) {
				this.privateIpAddress = privateIpAddress;
			}
		}

		public static class NatGatewayPrivateInfo {

			private String vswitchId;

			private String eniInstanceId;

			private Integer maxBandwidth;

			private String privateIpAddress;

			private String izNo;

			private String eniType;

			public String getVswitchId() {
				return this.vswitchId;
			}

			public void setVswitchId(String vswitchId) {
				this.vswitchId = vswitchId;
			}

			public String getEniInstanceId() {
				return this.eniInstanceId;
			}

			public void setEniInstanceId(String eniInstanceId) {
				this.eniInstanceId = eniInstanceId;
			}

			public Integer getMaxBandwidth() {
				return this.maxBandwidth;
			}

			public void setMaxBandwidth(Integer maxBandwidth) {
				this.maxBandwidth = maxBandwidth;
			}

			public String getPrivateIpAddress() {
				return this.privateIpAddress;
			}

			public void setPrivateIpAddress(String privateIpAddress) {
				this.privateIpAddress = privateIpAddress;
			}

			public String getIzNo() {
				return this.izNo;
			}

			public void setIzNo(String izNo) {
				this.izNo = izNo;
			}

			public String getEniType() {
				return this.eniType;
			}

			public void setEniType(String eniType) {
				this.eniType = eniType;
			}
		}
	}

	@Override
	public DescribeNatGatewaysResponse getInstance(UnmarshallerContext context) {
		return	DescribeNatGatewaysResponseUnmarshaller.unmarshall(this, context);
	}
}
