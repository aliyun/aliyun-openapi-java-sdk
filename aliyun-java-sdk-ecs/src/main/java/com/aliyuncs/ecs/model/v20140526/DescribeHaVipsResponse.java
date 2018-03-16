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
import com.aliyuncs.ecs.transform.v20140526.DescribeHaVipsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeHaVipsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<HaVip> haVips;

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

	public List<HaVip> getHaVips() {
		return this.haVips;
	}

	public void setHaVips(List<HaVip> haVips) {
		this.haVips = haVips;
	}

	public static class HaVip {

		private String haVipId;

		private String regionId;

		private String vpcId;

		private String vSwitchId;

		private String ipAddress;

		private String status;

		private String masterInstanceId;

		private String description;

		private String createTime;

		private List<String> associatedInstances;

		private List<String> associatedEipAddresses;

		public String getHaVipId() {
			return this.haVipId;
		}

		public void setHaVipId(String haVipId) {
			this.haVipId = haVipId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
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

		public String getIpAddress() {
			return this.ipAddress;
		}

		public void setIpAddress(String ipAddress) {
			this.ipAddress = ipAddress;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getMasterInstanceId() {
			return this.masterInstanceId;
		}

		public void setMasterInstanceId(String masterInstanceId) {
			this.masterInstanceId = masterInstanceId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public List<String> getAssociatedInstances() {
			return this.associatedInstances;
		}

		public void setAssociatedInstances(List<String> associatedInstances) {
			this.associatedInstances = associatedInstances;
		}

		public List<String> getAssociatedEipAddresses() {
			return this.associatedEipAddresses;
		}

		public void setAssociatedEipAddresses(List<String> associatedEipAddresses) {
			this.associatedEipAddresses = associatedEipAddresses;
		}
	}

	@Override
	public DescribeHaVipsResponse getInstance(UnmarshallerContext context) {
		return	DescribeHaVipsResponseUnmarshaller.unmarshall(this, context);
	}
}
