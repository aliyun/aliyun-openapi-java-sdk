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
import com.aliyuncs.vpc.transform.v20160428.DescribeIpv6AddressesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeIpv6AddressesResponse extends AcsResponse {

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private Integer totalCount;

	private List<Ipv6Address> ipv6Addresses;

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

	public List<Ipv6Address> getIpv6Addresses() {
		return this.ipv6Addresses;
	}

	public void setIpv6Addresses(List<Ipv6Address> ipv6Addresses) {
		this.ipv6Addresses = ipv6Addresses;
	}

	public static class Ipv6Address {

		private String vpcId;

		private String status;

		private String ipv6AddressId;

		private String allocationTime;

		private String ipv6AddressName;

		private String ipv6AddressDescription;

		private String associatedInstanceType;

		private String associatedInstanceId;

		private String networkType;

		private String ipv6Address;

		private String addressType;

		private String ipv6Isp;

		private String vSwitchId;

		private String ipv6GatewayId;

		private Integer realBandwidth;

		private String resourceGroupId;

		private Integer serviceManaged;

		private List<Tag> tags;

		private Ipv6InternetBandwidth ipv6InternetBandwidth;

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getIpv6AddressId() {
			return this.ipv6AddressId;
		}

		public void setIpv6AddressId(String ipv6AddressId) {
			this.ipv6AddressId = ipv6AddressId;
		}

		public String getAllocationTime() {
			return this.allocationTime;
		}

		public void setAllocationTime(String allocationTime) {
			this.allocationTime = allocationTime;
		}

		public String getIpv6AddressName() {
			return this.ipv6AddressName;
		}

		public void setIpv6AddressName(String ipv6AddressName) {
			this.ipv6AddressName = ipv6AddressName;
		}

		public String getIpv6AddressDescription() {
			return this.ipv6AddressDescription;
		}

		public void setIpv6AddressDescription(String ipv6AddressDescription) {
			this.ipv6AddressDescription = ipv6AddressDescription;
		}

		public String getAssociatedInstanceType() {
			return this.associatedInstanceType;
		}

		public void setAssociatedInstanceType(String associatedInstanceType) {
			this.associatedInstanceType = associatedInstanceType;
		}

		public String getAssociatedInstanceId() {
			return this.associatedInstanceId;
		}

		public void setAssociatedInstanceId(String associatedInstanceId) {
			this.associatedInstanceId = associatedInstanceId;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
		}

		public String getIpv6Address() {
			return this.ipv6Address;
		}

		public void setIpv6Address(String ipv6Address) {
			this.ipv6Address = ipv6Address;
		}

		public String getAddressType() {
			return this.addressType;
		}

		public void setAddressType(String addressType) {
			this.addressType = addressType;
		}

		public String getIpv6Isp() {
			return this.ipv6Isp;
		}

		public void setIpv6Isp(String ipv6Isp) {
			this.ipv6Isp = ipv6Isp;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getIpv6GatewayId() {
			return this.ipv6GatewayId;
		}

		public void setIpv6GatewayId(String ipv6GatewayId) {
			this.ipv6GatewayId = ipv6GatewayId;
		}

		public Integer getRealBandwidth() {
			return this.realBandwidth;
		}

		public void setRealBandwidth(Integer realBandwidth) {
			this.realBandwidth = realBandwidth;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public Integer getServiceManaged() {
			return this.serviceManaged;
		}

		public void setServiceManaged(Integer serviceManaged) {
			this.serviceManaged = serviceManaged;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public Ipv6InternetBandwidth getIpv6InternetBandwidth() {
			return this.ipv6InternetBandwidth;
		}

		public void setIpv6InternetBandwidth(Ipv6InternetBandwidth ipv6InternetBandwidth) {
			this.ipv6InternetBandwidth = ipv6InternetBandwidth;
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

		public static class Ipv6InternetBandwidth {

			private String internetChargeType;

			private String businessStatus;

			private Integer bandwidth;

			private String ipv6InternetBandwidthId;

			private String instanceChargeType;

			private Boolean hasReservationData;

			private String reservationInternetChargeType;

			private String reservationOrderType;

			private String reservationActiveTime;

			private Long reservationBandwidth;

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

			public Integer getBandwidth() {
				return this.bandwidth;
			}

			public void setBandwidth(Integer bandwidth) {
				this.bandwidth = bandwidth;
			}

			public String getIpv6InternetBandwidthId() {
				return this.ipv6InternetBandwidthId;
			}

			public void setIpv6InternetBandwidthId(String ipv6InternetBandwidthId) {
				this.ipv6InternetBandwidthId = ipv6InternetBandwidthId;
			}

			public String getInstanceChargeType() {
				return this.instanceChargeType;
			}

			public void setInstanceChargeType(String instanceChargeType) {
				this.instanceChargeType = instanceChargeType;
			}

			public Boolean getHasReservationData() {
				return this.hasReservationData;
			}

			public void setHasReservationData(Boolean hasReservationData) {
				this.hasReservationData = hasReservationData;
			}

			public String getReservationInternetChargeType() {
				return this.reservationInternetChargeType;
			}

			public void setReservationInternetChargeType(String reservationInternetChargeType) {
				this.reservationInternetChargeType = reservationInternetChargeType;
			}

			public String getReservationOrderType() {
				return this.reservationOrderType;
			}

			public void setReservationOrderType(String reservationOrderType) {
				this.reservationOrderType = reservationOrderType;
			}

			public String getReservationActiveTime() {
				return this.reservationActiveTime;
			}

			public void setReservationActiveTime(String reservationActiveTime) {
				this.reservationActiveTime = reservationActiveTime;
			}

			public Long getReservationBandwidth() {
				return this.reservationBandwidth;
			}

			public void setReservationBandwidth(Long reservationBandwidth) {
				this.reservationBandwidth = reservationBandwidth;
			}
		}
	}

	@Override
	public DescribeIpv6AddressesResponse getInstance(UnmarshallerContext context) {
		return	DescribeIpv6AddressesResponseUnmarshaller.unmarshall(this, context);
	}
}
