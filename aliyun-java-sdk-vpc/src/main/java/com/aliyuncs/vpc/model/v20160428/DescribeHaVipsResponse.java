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
import com.aliyuncs.vpc.transform.v20160428.DescribeHaVipsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeHaVipsResponse extends AcsResponse {

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private Integer totalCount;

	private List<HaVip> haVips;

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

	public List<HaVip> getHaVips() {
		return this.haVips;
	}

	public void setHaVips(List<HaVip> haVips) {
		this.haVips = haVips;
	}

	public static class HaVip {

		private String vpcId;

		private String status;

		private String haVipId;

		private String associatedInstanceType;

		private String createTime;

		private String chargeType;

		private String regionId;

		private String vSwitchId;

		private String ipAddress;

		private String description;

		private String masterInstanceId;

		private String name;

		private String resourceGroupId;

		private List<Tag> tags;

		private List<String> associatedEipAddresses;

		private List<String> associatedInstances;

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

		public String getHaVipId() {
			return this.haVipId;
		}

		public void setHaVipId(String haVipId) {
			this.haVipId = haVipId;
		}

		public String getAssociatedInstanceType() {
			return this.associatedInstanceType;
		}

		public void setAssociatedInstanceType(String associatedInstanceType) {
			this.associatedInstanceType = associatedInstanceType;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getIpAddress() {
			return this.ipAddress;
		}

		public void setIpAddress(String ipAddress) {
			this.ipAddress = ipAddress;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getMasterInstanceId() {
			return this.masterInstanceId;
		}

		public void setMasterInstanceId(String masterInstanceId) {
			this.masterInstanceId = masterInstanceId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public List<String> getAssociatedEipAddresses() {
			return this.associatedEipAddresses;
		}

		public void setAssociatedEipAddresses(List<String> associatedEipAddresses) {
			this.associatedEipAddresses = associatedEipAddresses;
		}

		public List<String> getAssociatedInstances() {
			return this.associatedInstances;
		}

		public void setAssociatedInstances(List<String> associatedInstances) {
			this.associatedInstances = associatedInstances;
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
	public DescribeHaVipsResponse getInstance(UnmarshallerContext context) {
		return	DescribeHaVipsResponseUnmarshaller.unmarshall(this, context);
	}
}
