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
import com.aliyuncs.vpc.transform.v20160428.DescribeVpcAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVpcAttributeResponse extends AcsResponse {

	private String creationTime;

	private String status;

	private String vpcId;

	private Boolean isDefault;

	private Boolean classicLinkEnabled;

	private Long ownerId;

	private String regionId;

	private String vpcName;

	private String vRouterId;

	private String dhcpOptionsSetStatus;

	private String cidrBlock;

	private String requestId;

	private String description;

	private String networkAclNum;

	private String resourceGroupId;

	private String dhcpOptionsSetId;

	private String ipv6CidrBlock;

	private Boolean supportIpv4Gateway;

	private String ipv4GatewayId;

	private List<AssociatedCen> associatedCens;

	private List<CloudResourceSetType> cloudResources;

	private List<Ipv6CidrBlock> ipv6CidrBlocks;

	private List<String> vSwitchIds;

	private List<String> userCidrs;

	private List<String> secondaryCidrBlocks;

	public String getCreationTime() {
		return this.creationTime;
	}

	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
	}

	public Boolean getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	public Boolean getClassicLinkEnabled() {
		return this.classicLinkEnabled;
	}

	public void setClassicLinkEnabled(Boolean classicLinkEnabled) {
		this.classicLinkEnabled = classicLinkEnabled;
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getVpcName() {
		return this.vpcName;
	}

	public void setVpcName(String vpcName) {
		this.vpcName = vpcName;
	}

	public String getVRouterId() {
		return this.vRouterId;
	}

	public void setVRouterId(String vRouterId) {
		this.vRouterId = vRouterId;
	}

	public String getDhcpOptionsSetStatus() {
		return this.dhcpOptionsSetStatus;
	}

	public void setDhcpOptionsSetStatus(String dhcpOptionsSetStatus) {
		this.dhcpOptionsSetStatus = dhcpOptionsSetStatus;
	}

	public String getCidrBlock() {
		return this.cidrBlock;
	}

	public void setCidrBlock(String cidrBlock) {
		this.cidrBlock = cidrBlock;
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

	public String getNetworkAclNum() {
		return this.networkAclNum;
	}

	public void setNetworkAclNum(String networkAclNum) {
		this.networkAclNum = networkAclNum;
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
	}

	public String getDhcpOptionsSetId() {
		return this.dhcpOptionsSetId;
	}

	public void setDhcpOptionsSetId(String dhcpOptionsSetId) {
		this.dhcpOptionsSetId = dhcpOptionsSetId;
	}

	public String getIpv6CidrBlock() {
		return this.ipv6CidrBlock;
	}

	public void setIpv6CidrBlock(String ipv6CidrBlock) {
		this.ipv6CidrBlock = ipv6CidrBlock;
	}

	public Boolean getSupportIpv4Gateway() {
		return this.supportIpv4Gateway;
	}

	public void setSupportIpv4Gateway(Boolean supportIpv4Gateway) {
		this.supportIpv4Gateway = supportIpv4Gateway;
	}

	public String getIpv4GatewayId() {
		return this.ipv4GatewayId;
	}

	public void setIpv4GatewayId(String ipv4GatewayId) {
		this.ipv4GatewayId = ipv4GatewayId;
	}

	public List<AssociatedCen> getAssociatedCens() {
		return this.associatedCens;
	}

	public void setAssociatedCens(List<AssociatedCen> associatedCens) {
		this.associatedCens = associatedCens;
	}

	public List<CloudResourceSetType> getCloudResources() {
		return this.cloudResources;
	}

	public void setCloudResources(List<CloudResourceSetType> cloudResources) {
		this.cloudResources = cloudResources;
	}

	public List<Ipv6CidrBlock> getIpv6CidrBlocks() {
		return this.ipv6CidrBlocks;
	}

	public void setIpv6CidrBlocks(List<Ipv6CidrBlock> ipv6CidrBlocks) {
		this.ipv6CidrBlocks = ipv6CidrBlocks;
	}

	public List<String> getVSwitchIds() {
		return this.vSwitchIds;
	}

	public void setVSwitchIds(List<String> vSwitchIds) {
		this.vSwitchIds = vSwitchIds;
	}

	public List<String> getUserCidrs() {
		return this.userCidrs;
	}

	public void setUserCidrs(List<String> userCidrs) {
		this.userCidrs = userCidrs;
	}

	public List<String> getSecondaryCidrBlocks() {
		return this.secondaryCidrBlocks;
	}

	public void setSecondaryCidrBlocks(List<String> secondaryCidrBlocks) {
		this.secondaryCidrBlocks = secondaryCidrBlocks;
	}

	public static class AssociatedCen {

		private Long cenOwnerId;

		private String cenId;

		private String cenStatus;

		public Long getCenOwnerId() {
			return this.cenOwnerId;
		}

		public void setCenOwnerId(Long cenOwnerId) {
			this.cenOwnerId = cenOwnerId;
		}

		public String getCenId() {
			return this.cenId;
		}

		public void setCenId(String cenId) {
			this.cenId = cenId;
		}

		public String getCenStatus() {
			return this.cenStatus;
		}

		public void setCenStatus(String cenStatus) {
			this.cenStatus = cenStatus;
		}
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

	public static class Ipv6CidrBlock {

		private String ipv6Isp;

		private String ipv6CidrBlock;

		public String getIpv6Isp() {
			return this.ipv6Isp;
		}

		public void setIpv6Isp(String ipv6Isp) {
			this.ipv6Isp = ipv6Isp;
		}

		public String getIpv6CidrBlock() {
			return this.ipv6CidrBlock;
		}

		public void setIpv6CidrBlock(String ipv6CidrBlock) {
			this.ipv6CidrBlock = ipv6CidrBlock;
		}
	}

	@Override
	public DescribeVpcAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeVpcAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
