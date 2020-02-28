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
import com.aliyuncs.vpc.transform.v20160428.DescribeVpcsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVpcsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<Vpc> vpcs;

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

	public List<Vpc> getVpcs() {
		return this.vpcs;
	}

	public void setVpcs(List<Vpc> vpcs) {
		this.vpcs = vpcs;
	}

	public static class Vpc {

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

		private String networkAclNum;

		private String resourceGroupId;

		private String cenStatus;

		private List<Tag> tags;

		private List<String> vSwitchIds;

		private List<String> userCidrs;

		private List<String> natGatewayIds;

		private List<String> routerTableIds;

		private List<String> secondaryCidrBlocks;

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

		public String getCenStatus() {
			return this.cenStatus;
		}

		public void setCenStatus(String cenStatus) {
			this.cenStatus = cenStatus;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
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

		public List<String> getNatGatewayIds() {
			return this.natGatewayIds;
		}

		public void setNatGatewayIds(List<String> natGatewayIds) {
			this.natGatewayIds = natGatewayIds;
		}

		public List<String> getRouterTableIds() {
			return this.routerTableIds;
		}

		public void setRouterTableIds(List<String> routerTableIds) {
			this.routerTableIds = routerTableIds;
		}

		public List<String> getSecondaryCidrBlocks() {
			return this.secondaryCidrBlocks;
		}

		public void setSecondaryCidrBlocks(List<String> secondaryCidrBlocks) {
			this.secondaryCidrBlocks = secondaryCidrBlocks;
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
	public DescribeVpcsResponse getInstance(UnmarshallerContext context) {
		return	DescribeVpcsResponseUnmarshaller.unmarshall(this, context);
	}
}
