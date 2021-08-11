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
import com.aliyuncs.ecs.transform.v20140526.CreateNetworkInterfaceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateNetworkInterfaceResponse extends AcsResponse {

	private String status;

	private String type;

	private String vpcId;

	private String networkInterfaceName;

	private String macAddress;

	private String networkInterfaceId;

	private Long serviceID;

	private String ownerId;

	private Boolean serviceManaged;

	private String vSwitchId;

	private String requestId;

	private String description;

	private String resourceGroupId;

	private String zoneId;

	private String privateIpAddress;

	private List<PrivateIpSet> privateIpSets;

	private List<Tag> tags;

	private List<Ipv6Set> ipv6Sets;

	private List<String> securityGroupIds;

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

	public String getNetworkInterfaceName() {
		return this.networkInterfaceName;
	}

	public void setNetworkInterfaceName(String networkInterfaceName) {
		this.networkInterfaceName = networkInterfaceName;
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

	public Long getServiceID() {
		return this.serviceID;
	}

	public void setServiceID(Long serviceID) {
		this.serviceID = serviceID;
	}

	public String getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public Boolean getServiceManaged() {
		return this.serviceManaged;
	}

	public void setServiceManaged(Boolean serviceManaged) {
		this.serviceManaged = serviceManaged;
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
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

	public List<PrivateIpSet> getPrivateIpSets() {
		return this.privateIpSets;
	}

	public void setPrivateIpSets(List<PrivateIpSet> privateIpSets) {
		this.privateIpSets = privateIpSets;
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
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

	public static class Tag {

		private String tagValue;

		private String tagKey;

		public String getTagValue() {
			return this.tagValue;
		}

		public void setTagValue(String tagValue) {
			this.tagValue = tagValue;
		}

		public String getTagKey() {
			return this.tagKey;
		}

		public void setTagKey(String tagKey) {
			this.tagKey = tagKey;
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

	@Override
	public CreateNetworkInterfaceResponse getInstance(UnmarshallerContext context) {
		return	CreateNetworkInterfaceResponseUnmarshaller.unmarshall(this, context);
	}
}
