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

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<Ipv6Address> ipv6Addresses;

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

	public List<Ipv6Address> getIpv6Addresses() {
		return this.ipv6Addresses;
	}

	public void setIpv6Addresses(List<Ipv6Address> ipv6Addresses) {
		this.ipv6Addresses = ipv6Addresses;
	}

	public static class Ipv6Address {

		private String ipv6AddressId;

		private String ipv6AddressName;

		private String vSwitchId;

		private String vpcId;

		private String ipv6GatewayId;

		private String ipv6Address;

		private String associatedInstanceId;

		private String associatedInstanceType;

		private String status;

		private String networkType;

		private Integer realBandwidth;

		private String allocationTime;

		private Ipv6InternetBandwidth ipv6InternetBandwidth;

		public String getIpv6AddressId() {
			return this.ipv6AddressId;
		}

		public void setIpv6AddressId(String ipv6AddressId) {
			this.ipv6AddressId = ipv6AddressId;
		}

		public String getIpv6AddressName() {
			return this.ipv6AddressName;
		}

		public void setIpv6AddressName(String ipv6AddressName) {
			this.ipv6AddressName = ipv6AddressName;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getIpv6GatewayId() {
			return this.ipv6GatewayId;
		}

		public void setIpv6GatewayId(String ipv6GatewayId) {
			this.ipv6GatewayId = ipv6GatewayId;
		}

		public String getIpv6Address() {
			return this.ipv6Address;
		}

		public void setIpv6Address(String ipv6Address) {
			this.ipv6Address = ipv6Address;
		}

		public String getAssociatedInstanceId() {
			return this.associatedInstanceId;
		}

		public void setAssociatedInstanceId(String associatedInstanceId) {
			this.associatedInstanceId = associatedInstanceId;
		}

		public String getAssociatedInstanceType() {
			return this.associatedInstanceType;
		}

		public void setAssociatedInstanceType(String associatedInstanceType) {
			this.associatedInstanceType = associatedInstanceType;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
		}

		public Integer getRealBandwidth() {
			return this.realBandwidth;
		}

		public void setRealBandwidth(Integer realBandwidth) {
			this.realBandwidth = realBandwidth;
		}

		public String getAllocationTime() {
			return this.allocationTime;
		}

		public void setAllocationTime(String allocationTime) {
			this.allocationTime = allocationTime;
		}

		public Ipv6InternetBandwidth getIpv6InternetBandwidth() {
			return this.ipv6InternetBandwidth;
		}

		public void setIpv6InternetBandwidth(Ipv6InternetBandwidth ipv6InternetBandwidth) {
			this.ipv6InternetBandwidth = ipv6InternetBandwidth;
		}

		public static class Ipv6InternetBandwidth {

			private Integer bandwidth;

			private String instanceChargeType;

			private String internetChargeType;

			private String businessStatus;

			private String ipv6InternetBandwidthId;

			public Integer getBandwidth() {
				return this.bandwidth;
			}

			public void setBandwidth(Integer bandwidth) {
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

			public String getIpv6InternetBandwidthId() {
				return this.ipv6InternetBandwidthId;
			}

			public void setIpv6InternetBandwidthId(String ipv6InternetBandwidthId) {
				this.ipv6InternetBandwidthId = ipv6InternetBandwidthId;
			}
		}
	}

	@Override
	public DescribeIpv6AddressesResponse getInstance(UnmarshallerContext context) {
		return	DescribeIpv6AddressesResponseUnmarshaller.unmarshall(this, context);
	}
}
