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
import com.aliyuncs.ecs.transform.v20140526.DescribeDemandsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDemandsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private String regionId;

	private List<Demand> demands;

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

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public List<Demand> getDemands() {
		return this.demands;
	}

	public void setDemands(List<Demand> demands) {
		this.demands = demands;
	}

	public static class Demand {

		private String zoneId;

		private String demandTime;

		private String instanceTypeFamily;

		private String demandId;

		private String demandName;

		private String comment;

		private String demandDescription;

		private String instanceType;

		private String instanceChargeType;

		private Integer period;

		private String periodUnit;

		private String startTime;

		private String endTime;

		private String demandStatus;

		private Integer totalAmount;

		private Integer availableAmount;

		private Integer usedAmount;

		private Integer deliveringAmount;

		private List<SupplyInfo> supplyInfos;

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getDemandTime() {
			return this.demandTime;
		}

		public void setDemandTime(String demandTime) {
			this.demandTime = demandTime;
		}

		public String getInstanceTypeFamily() {
			return this.instanceTypeFamily;
		}

		public void setInstanceTypeFamily(String instanceTypeFamily) {
			this.instanceTypeFamily = instanceTypeFamily;
		}

		public String getDemandId() {
			return this.demandId;
		}

		public void setDemandId(String demandId) {
			this.demandId = demandId;
		}

		public String getDemandName() {
			return this.demandName;
		}

		public void setDemandName(String demandName) {
			this.demandName = demandName;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public String getDemandDescription() {
			return this.demandDescription;
		}

		public void setDemandDescription(String demandDescription) {
			this.demandDescription = demandDescription;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getInstanceChargeType() {
			return this.instanceChargeType;
		}

		public void setInstanceChargeType(String instanceChargeType) {
			this.instanceChargeType = instanceChargeType;
		}

		public Integer getPeriod() {
			return this.period;
		}

		public void setPeriod(Integer period) {
			this.period = period;
		}

		public String getPeriodUnit() {
			return this.periodUnit;
		}

		public void setPeriodUnit(String periodUnit) {
			this.periodUnit = periodUnit;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getDemandStatus() {
			return this.demandStatus;
		}

		public void setDemandStatus(String demandStatus) {
			this.demandStatus = demandStatus;
		}

		public Integer getTotalAmount() {
			return this.totalAmount;
		}

		public void setTotalAmount(Integer totalAmount) {
			this.totalAmount = totalAmount;
		}

		public Integer getAvailableAmount() {
			return this.availableAmount;
		}

		public void setAvailableAmount(Integer availableAmount) {
			this.availableAmount = availableAmount;
		}

		public Integer getUsedAmount() {
			return this.usedAmount;
		}

		public void setUsedAmount(Integer usedAmount) {
			this.usedAmount = usedAmount;
		}

		public Integer getDeliveringAmount() {
			return this.deliveringAmount;
		}

		public void setDeliveringAmount(Integer deliveringAmount) {
			this.deliveringAmount = deliveringAmount;
		}

		public List<SupplyInfo> getSupplyInfos() {
			return this.supplyInfos;
		}

		public void setSupplyInfos(List<SupplyInfo> supplyInfos) {
			this.supplyInfos = supplyInfos;
		}

		public static class SupplyInfo {

			private Integer amount;

			private String supplyStatus;

			private String supplyStartTime;

			private String supplyEndTime;

			public Integer getAmount() {
				return this.amount;
			}

			public void setAmount(Integer amount) {
				this.amount = amount;
			}

			public String getSupplyStatus() {
				return this.supplyStatus;
			}

			public void setSupplyStatus(String supplyStatus) {
				this.supplyStatus = supplyStatus;
			}

			public String getSupplyStartTime() {
				return this.supplyStartTime;
			}

			public void setSupplyStartTime(String supplyStartTime) {
				this.supplyStartTime = supplyStartTime;
			}

			public String getSupplyEndTime() {
				return this.supplyEndTime;
			}

			public void setSupplyEndTime(String supplyEndTime) {
				this.supplyEndTime = supplyEndTime;
			}
		}
	}

	@Override
	public DescribeDemandsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDemandsResponseUnmarshaller.unmarshall(this, context);
	}
}
