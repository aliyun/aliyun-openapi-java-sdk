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

	private String requestId;

	private String vpcId;

	private String regionId;

	private String status;

	private String vpcName;

	private String creationTime;

	private String cidrBlock;

	private String ipv6CidrBlock;

	private String vRouterId;

	private String description;

	private Boolean isDefault;

	private Boolean classicLinkEnabled;

	private String resourceGroupId;

	private String networkAclNum;

	private List<AssociatedCen> associatedCens;

	private List<CloudResourceSetType> cloudResources;

	private List<String> vSwitchIds;

	private List<String> userCidrs;

	private List<String> secondaryCidrBlocks;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getVpcName() {
		return this.vpcName;
	}

	public void setVpcName(String vpcName) {
		this.vpcName = vpcName;
	}

	public String getCreationTime() {
		return this.creationTime;
	}

	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}

	public String getCidrBlock() {
		return this.cidrBlock;
	}

	public void setCidrBlock(String cidrBlock) {
		this.cidrBlock = cidrBlock;
	}

	public String getIpv6CidrBlock() {
		return this.ipv6CidrBlock;
	}

	public void setIpv6CidrBlock(String ipv6CidrBlock) {
		this.ipv6CidrBlock = ipv6CidrBlock;
	}

	public String getVRouterId() {
		return this.vRouterId;
	}

	public void setVRouterId(String vRouterId) {
		this.vRouterId = vRouterId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
	}

	public String getNetworkAclNum() {
		return this.networkAclNum;
	}

	public void setNetworkAclNum(String networkAclNum) {
		this.networkAclNum = networkAclNum;
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

		private String cenId;

		private Long cenOwnerId;

		private String cenStatus;

		public String getCenId() {
			return this.cenId;
		}

		public void setCenId(String cenId) {
			this.cenId = cenId;
		}

		public Long getCenOwnerId() {
			return this.cenOwnerId;
		}

		public void setCenOwnerId(Long cenOwnerId) {
			this.cenOwnerId = cenOwnerId;
		}

		public String getCenStatus() {
			return this.cenStatus;
		}

		public void setCenStatus(String cenStatus) {
			this.cenStatus = cenStatus;
		}
	}

	public static class CloudResourceSetType {

		private String resourceType;

		private Integer resourceCount;

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public Integer getResourceCount() {
			return this.resourceCount;
		}

		public void setResourceCount(Integer resourceCount) {
			this.resourceCount = resourceCount;
		}
	}

	@Override
	public DescribeVpcAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeVpcAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
