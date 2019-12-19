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
import com.aliyuncs.ecs.transform.v20140526.DescribeNetworkInterfacesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeNetworkInterfacesResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private String nextToken;

	private List<NetworkInterfaceSet> networkInterfaceSets;

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

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<NetworkInterfaceSet> getNetworkInterfaceSets() {
		return this.networkInterfaceSets;
	}

	public void setNetworkInterfaceSets(List<NetworkInterfaceSet> networkInterfaceSets) {
		this.networkInterfaceSets = networkInterfaceSets;
	}

	public static class NetworkInterfaceSet {

		private String networkInterfaceId;

		private String status;

		private String type;

		private String vpcId;

		private String vSwitchId;

		private String zoneId;

		private String privateIpAddress;

		private String macAddress;

		private String networkInterfaceName;

		private String description;

		private String instanceId;

		private String creationTime;

		private String resourceGroupId;

		private Long serviceID;

		private Boolean serviceManaged;

		private List<PrivateIpSet> privateIpSets;

		private List<Ipv6Set> ipv6Sets;

		private List<Tag> tags;

		private List<String> securityGroupIds;

		private AssociatedPublicIp associatedPublicIp;

		public String getNetworkInterfaceId() {
			return this.networkInterfaceId;
		}

		public void setNetworkInterfaceId(String networkInterfaceId) {
			this.networkInterfaceId = networkInterfaceId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getPrivateIpAddress() {
			return this.privateIpAddress;
		}

		public void setPrivateIpAddress(String privateIpAddress) {
			this.privateIpAddress = privateIpAddress;
		}

		public String getMacAddress() {
			return this.macAddress;
		}

		public void setMacAddress(String macAddress) {
			this.macAddress = macAddress;
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

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public Long getServiceID() {
			return this.serviceID;
		}

		public void setServiceID(Long serviceID) {
			this.serviceID = serviceID;
		}

		public Boolean getServiceManaged() {
			return this.serviceManaged;
		}

		public void setServiceManaged(Boolean serviceManaged) {
			this.serviceManaged = serviceManaged;
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

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public List<String> getSecurityGroupIds() {
			return this.securityGroupIds;
		}

		public void setSecurityGroupIds(List<String> securityGroupIds) {
			this.securityGroupIds = securityGroupIds;
		}

		public AssociatedPublicIp getAssociatedPublicIp() {
			return this.associatedPublicIp;
		}

		public void setAssociatedPublicIp(AssociatedPublicIp associatedPublicIp) {
			this.associatedPublicIp = associatedPublicIp;
		}

		public static class PrivateIpSet {

			private String privateIpAddress;

			private Boolean primary;

			private AssociatedPublicIp1 associatedPublicIp1;

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

			public AssociatedPublicIp1 getAssociatedPublicIp1() {
				return this.associatedPublicIp1;
			}

			public void setAssociatedPublicIp1(AssociatedPublicIp1 associatedPublicIp1) {
				this.associatedPublicIp1 = associatedPublicIp1;
			}

			public static class AssociatedPublicIp1 {

				private String publicIpAddress;

				private String allocationId;

				public String getPublicIpAddress() {
					return this.publicIpAddress;
				}

				public void setPublicIpAddress(String publicIpAddress) {
					this.publicIpAddress = publicIpAddress;
				}

				public String getAllocationId() {
					return this.allocationId;
				}

				public void setAllocationId(String allocationId) {
					this.allocationId = allocationId;
				}
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

		public static class AssociatedPublicIp {

			private String publicIpAddress;

			private String allocationId;

			public String getPublicIpAddress() {
				return this.publicIpAddress;
			}

			public void setPublicIpAddress(String publicIpAddress) {
				this.publicIpAddress = publicIpAddress;
			}

			public String getAllocationId() {
				return this.allocationId;
			}

			public void setAllocationId(String allocationId) {
				this.allocationId = allocationId;
			}
		}
	}

	@Override
	public DescribeNetworkInterfacesResponse getInstance(UnmarshallerContext context) {
		return	DescribeNetworkInterfacesResponseUnmarshaller.unmarshall(this, context);
	}
}
