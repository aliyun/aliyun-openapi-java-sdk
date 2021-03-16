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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeVpcHoneyPotListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVpcHoneyPotListResponse extends AcsResponse {

	private String requestId;

	private List<VpcHoneyPotDTO> vpcHoneyPotDTOList;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<VpcHoneyPotDTO> getVpcHoneyPotDTOList() {
		return this.vpcHoneyPotDTOList;
	}

	public void setVpcHoneyPotDTOList(List<VpcHoneyPotDTO> vpcHoneyPotDTOList) {
		this.vpcHoneyPotDTOList = vpcHoneyPotDTOList;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class VpcHoneyPotDTO {

		private String vpcId;

		private String vpcName;

		private String vpcRegionId;

		private Long createTime;

		private String vpcStatus;

		private String cidrBlock;

		private Boolean honeyPotExistence;

		private String honeyPotVpcSwitchId;

		private String honeyPotInstanceStatus;

		private String honeyPotEniInstanceId;

		private String honeyPotEcsInstanceStatus;

		private List<VpcSwitchInfo> vpcSwitchIdList;

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getVpcName() {
			return this.vpcName;
		}

		public void setVpcName(String vpcName) {
			this.vpcName = vpcName;
		}

		public String getVpcRegionId() {
			return this.vpcRegionId;
		}

		public void setVpcRegionId(String vpcRegionId) {
			this.vpcRegionId = vpcRegionId;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getVpcStatus() {
			return this.vpcStatus;
		}

		public void setVpcStatus(String vpcStatus) {
			this.vpcStatus = vpcStatus;
		}

		public String getCidrBlock() {
			return this.cidrBlock;
		}

		public void setCidrBlock(String cidrBlock) {
			this.cidrBlock = cidrBlock;
		}

		public Boolean getHoneyPotExistence() {
			return this.honeyPotExistence;
		}

		public void setHoneyPotExistence(Boolean honeyPotExistence) {
			this.honeyPotExistence = honeyPotExistence;
		}

		public String getHoneyPotVpcSwitchId() {
			return this.honeyPotVpcSwitchId;
		}

		public void setHoneyPotVpcSwitchId(String honeyPotVpcSwitchId) {
			this.honeyPotVpcSwitchId = honeyPotVpcSwitchId;
		}

		public String getHoneyPotInstanceStatus() {
			return this.honeyPotInstanceStatus;
		}

		public void setHoneyPotInstanceStatus(String honeyPotInstanceStatus) {
			this.honeyPotInstanceStatus = honeyPotInstanceStatus;
		}

		public String getHoneyPotEniInstanceId() {
			return this.honeyPotEniInstanceId;
		}

		public void setHoneyPotEniInstanceId(String honeyPotEniInstanceId) {
			this.honeyPotEniInstanceId = honeyPotEniInstanceId;
		}

		public String getHoneyPotEcsInstanceStatus() {
			return this.honeyPotEcsInstanceStatus;
		}

		public void setHoneyPotEcsInstanceStatus(String honeyPotEcsInstanceStatus) {
			this.honeyPotEcsInstanceStatus = honeyPotEcsInstanceStatus;
		}

		public List<VpcSwitchInfo> getVpcSwitchIdList() {
			return this.vpcSwitchIdList;
		}

		public void setVpcSwitchIdList(List<VpcSwitchInfo> vpcSwitchIdList) {
			this.vpcSwitchIdList = vpcSwitchIdList;
		}

		public static class VpcSwitchInfo {

			private String vpcSwitchId;

			private String vpcSwitchName;

			private String zoneId;

			public String getVpcSwitchId() {
				return this.vpcSwitchId;
			}

			public void setVpcSwitchId(String vpcSwitchId) {
				this.vpcSwitchId = vpcSwitchId;
			}

			public String getVpcSwitchName() {
				return this.vpcSwitchName;
			}

			public void setVpcSwitchName(String vpcSwitchName) {
				this.vpcSwitchName = vpcSwitchName;
			}

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
			}
		}
	}

	public static class PageInfo {

		private Integer count;

		private Integer pageSize;

		private Integer totalCount;

		private Integer currentPage;

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
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

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}
	}

	@Override
	public DescribeVpcHoneyPotListResponse getInstance(UnmarshallerContext context) {
		return	DescribeVpcHoneyPotListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
