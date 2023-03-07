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
import com.aliyuncs.vpc.transform.v20160428.DescribeVSwitchAttributesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVSwitchAttributesResponse extends AcsResponse {

	private String vpcId;

	private String status;

	private String creationTime;

	private Boolean isDefault;

	private Long availableIpAddressCount;

	private String networkAclId;

	private Long ownerId;

	private String vSwitchId;

	private String requestId;

	private String cidrBlock;

	private String description;

	private String resourceGroupId;

	private String zoneId;

	private String ipv6CidrBlock;

	private String vSwitchName;

	private String shareType;

	private List<CloudResourceSetType> cloudResources;

	private List<Tag> tags;

	private RouteTable routeTable;

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

	public String getCreationTime() {
		return this.creationTime;
	}

	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}

	public Boolean getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	public Long getAvailableIpAddressCount() {
		return this.availableIpAddressCount;
	}

	public void setAvailableIpAddressCount(Long availableIpAddressCount) {
		this.availableIpAddressCount = availableIpAddressCount;
	}

	public String getNetworkAclId() {
		return this.networkAclId;
	}

	public void setNetworkAclId(String networkAclId) {
		this.networkAclId = networkAclId;
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
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

	public String getCidrBlock() {
		return this.cidrBlock;
	}

	public void setCidrBlock(String cidrBlock) {
		this.cidrBlock = cidrBlock;
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

	public String getIpv6CidrBlock() {
		return this.ipv6CidrBlock;
	}

	public void setIpv6CidrBlock(String ipv6CidrBlock) {
		this.ipv6CidrBlock = ipv6CidrBlock;
	}

	public String getVSwitchName() {
		return this.vSwitchName;
	}

	public void setVSwitchName(String vSwitchName) {
		this.vSwitchName = vSwitchName;
	}

	public String getShareType() {
		return this.shareType;
	}

	public void setShareType(String shareType) {
		this.shareType = shareType;
	}

	public List<CloudResourceSetType> getCloudResources() {
		return this.cloudResources;
	}

	public void setCloudResources(List<CloudResourceSetType> cloudResources) {
		this.cloudResources = cloudResources;
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public RouteTable getRouteTable() {
		return this.routeTable;
	}

	public void setRouteTable(RouteTable routeTable) {
		this.routeTable = routeTable;
	}

	public static class CloudResourceSetType {

		private Integer resourceCount;

		private String resourceType;

		public Integer getResourceCount() {
			return this.resourceCount;
		}

		public void setResourceCount(Integer resourceCount) {
			this.resourceCount = resourceCount;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
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

	public static class RouteTable {

		private String routeTableId;

		private String routeTableType;

		public String getRouteTableId() {
			return this.routeTableId;
		}

		public void setRouteTableId(String routeTableId) {
			this.routeTableId = routeTableId;
		}

		public String getRouteTableType() {
			return this.routeTableType;
		}

		public void setRouteTableType(String routeTableType) {
			this.routeTableType = routeTableType;
		}
	}

	@Override
	public DescribeVSwitchAttributesResponse getInstance(UnmarshallerContext context) {
		return	DescribeVSwitchAttributesResponseUnmarshaller.unmarshall(this, context);
	}
}
