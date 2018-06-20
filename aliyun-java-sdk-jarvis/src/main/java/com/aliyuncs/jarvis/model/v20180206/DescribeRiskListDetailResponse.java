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

package com.aliyuncs.jarvis.model.v20180206;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.jarvis.transform.v20180206.DescribeRiskListDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRiskListDetailResponse extends AcsResponse {

	private String requestId;

	private String module;

	private List<Data> dataList;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public List<Data> getDataList() {
		return this.dataList;
	}

	public void setDataList(List<Data> dataList) {
		this.dataList = dataList;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class Data {

		private Integer riskId;

		private String updateTime;

		private String riskDescribe;

		private String riskType;

		private String riskInstance;

		private String product;

		private String regionId;

		private String tacticsName;

		private String status;

		private String ignoreTime;

		private List<EcsSecGroupRiskItem> ecsSecGroupRisk;

		private List<RdsWhitelistRiskItem> rdsWhitelistRisk;

		private List<String> instanceList;

		public Integer getRiskId() {
			return this.riskId;
		}

		public void setRiskId(Integer riskId) {
			this.riskId = riskId;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public String getRiskDescribe() {
			return this.riskDescribe;
		}

		public void setRiskDescribe(String riskDescribe) {
			this.riskDescribe = riskDescribe;
		}

		public String getRiskType() {
			return this.riskType;
		}

		public void setRiskType(String riskType) {
			this.riskType = riskType;
		}

		public String getRiskInstance() {
			return this.riskInstance;
		}

		public void setRiskInstance(String riskInstance) {
			this.riskInstance = riskInstance;
		}

		public String getProduct() {
			return this.product;
		}

		public void setProduct(String product) {
			this.product = product;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getTacticsName() {
			return this.tacticsName;
		}

		public void setTacticsName(String tacticsName) {
			this.tacticsName = tacticsName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getIgnoreTime() {
			return this.ignoreTime;
		}

		public void setIgnoreTime(String ignoreTime) {
			this.ignoreTime = ignoreTime;
		}

		public List<EcsSecGroupRiskItem> getEcsSecGroupRisk() {
			return this.ecsSecGroupRisk;
		}

		public void setEcsSecGroupRisk(List<EcsSecGroupRiskItem> ecsSecGroupRisk) {
			this.ecsSecGroupRisk = ecsSecGroupRisk;
		}

		public List<RdsWhitelistRiskItem> getRdsWhitelistRisk() {
			return this.rdsWhitelistRisk;
		}

		public void setRdsWhitelistRisk(List<RdsWhitelistRiskItem> rdsWhitelistRisk) {
			this.rdsWhitelistRisk = rdsWhitelistRisk;
		}

		public List<String> getInstanceList() {
			return this.instanceList;
		}

		public void setInstanceList(List<String> instanceList) {
			this.instanceList = instanceList;
		}

		public static class EcsSecGroupRiskItem {

			private String netType;

			private String direction;

			private String dstPortRange;

			private String srcIpRange;

			public String getNetType() {
				return this.netType;
			}

			public void setNetType(String netType) {
				this.netType = netType;
			}

			public String getDirection() {
				return this.direction;
			}

			public void setDirection(String direction) {
				this.direction = direction;
			}

			public String getDstPortRange() {
				return this.dstPortRange;
			}

			public void setDstPortRange(String dstPortRange) {
				this.dstPortRange = dstPortRange;
			}

			public String getSrcIpRange() {
				return this.srcIpRange;
			}

			public void setSrcIpRange(String srcIpRange) {
				this.srcIpRange = srcIpRange;
			}
		}

		public static class RdsWhitelistRiskItem {

			private String rdsWhitelistGroup;

			private String riskDetail;

			public String getRdsWhitelistGroup() {
				return this.rdsWhitelistGroup;
			}

			public void setRdsWhitelistGroup(String rdsWhitelistGroup) {
				this.rdsWhitelistGroup = rdsWhitelistGroup;
			}

			public String getRiskDetail() {
				return this.riskDetail;
			}

			public void setRiskDetail(String riskDetail) {
				this.riskDetail = riskDetail;
			}
		}
	}

	public static class PageInfo {

		private Integer total;

		private Integer pageSize;

		private Integer currentPage;

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}
	}

	@Override
	public DescribeRiskListDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeRiskListDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
