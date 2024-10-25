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

package com.aliyuncs.ens.model.v20171110;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ens.transform.v20171110.DescribeNetworkInterfacesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeNetworkInterfacesResponse extends AcsResponse {

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private String requestId;

	private List<NetworkInterfaceSet> networkInterfaceSets;

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

	public List<NetworkInterfaceSet> getNetworkInterfaceSets() {
		return this.networkInterfaceSets;
	}

	public void setNetworkInterfaceSets(List<NetworkInterfaceSet> networkInterfaceSets) {
		this.networkInterfaceSets = networkInterfaceSets;
	}

	public static class NetworkInterfaceSet {

		private String creationTime;

		private String ensRegionId;

		private String instanceId;

		private String instanceName;

		private String macAddress;

		private String networkInterfaceId;

		private String primaryIp;

		private String primaryIpType;

		private String status;

		private String networkId;

		private String vSwitchId;

		private String networkInterfaceName;

		private String description;

		private String type;

		private List<PrivateIpSet> privateIpSets;

		private List<Ipv6Set> ipv6Sets;

		private List<String> securityGroupIds;

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getEnsRegionId() {
			return this.ensRegionId;
		}

		public void setEnsRegionId(String ensRegionId) {
			this.ensRegionId = ensRegionId;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getMacAddress() {
			return this.macAddress;
		}

		public void setMacAddress(String macAddress) {
			this.macAddress = macAddress;
		}

		public String getNetworkInterfaceId() {
			return this.networkInterfaceId;
		}

		public void setNetworkInterfaceId(String networkInterfaceId) {
			this.networkInterfaceId = networkInterfaceId;
		}

		public String getPrimaryIp() {
			return this.primaryIp;
		}

		public void setPrimaryIp(String primaryIp) {
			this.primaryIp = primaryIp;
		}

		public String getPrimaryIpType() {
			return this.primaryIpType;
		}

		public void setPrimaryIpType(String primaryIpType) {
			this.primaryIpType = primaryIpType;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getNetworkId() {
			return this.networkId;
		}

		public void setNetworkId(String networkId) {
			this.networkId = networkId;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getNetworkInterfaceName() {
			return this.networkInterfaceName;
		}

		public void setNetworkInterfaceName(String networkInterfaceName) {
			this.networkInterfaceName = networkInterfaceName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public List<PrivateIpSet> getPrivateIpSets() {
			return this.privateIpSets;
		}

		public void setPrivateIpSets(List<PrivateIpSet> privateIpSets) {
			this.privateIpSets = privateIpSets;
		}

		public List<Ipv6Set> getIpv6Sets() {
			return this.ipv6Sets;
		}

		public void setIpv6Sets(List<Ipv6Set> ipv6Sets) {
			this.ipv6Sets = ipv6Sets;
		}

		public List<String> getSecurityGroupIds() {
			return this.securityGroupIds;
		}

		public void setSecurityGroupIds(List<String> securityGroupIds) {
			this.securityGroupIds = securityGroupIds;
		}

		public static class PrivateIpSet {

			private String privateIpAddress;

			private Boolean primary;

			public String getPrivateIpAddress() {
				return this.privateIpAddress;
			}

			public void setPrivateIpAddress(String privateIpAddress) {
				this.privateIpAddress = privateIpAddress;
			}

			public Boolean getPrimary() {
				return this.primary;
			}

			public void setPrimary(Boolean primary) {
				this.primary = primary;
			}
		}

		public static class Ipv6Set {

			private String ipv6Address;

			public String getIpv6Address() {
				return this.ipv6Address;
			}

			public void setIpv6Address(String ipv6Address) {
				this.ipv6Address = ipv6Address;
			}
		}
	}

	@Override
	public DescribeNetworkInterfacesResponse getInstance(UnmarshallerContext context) {
		return	DescribeNetworkInterfacesResponseUnmarshaller.unmarshall(this, context);
	}
}
