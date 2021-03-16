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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsSyncDemandResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsSyncDemandResponse extends AcsResponse {

	private String requestId;

	private DemandInfo demandInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public DemandInfo getDemandInfo() {
		return this.demandInfo;
	}

	public void setDemandInfo(DemandInfo demandInfo) {
		this.demandInfo = demandInfo;
	}

	public static class DemandInfo {

		private String regionNo;

		private Integer totalCount;

		private Integer pageNo;

		private Integer pageSize;

		private List<DemandModel> demandModels;

		public String getRegionNo() {
			return this.regionNo;
		}

		public void setRegionNo(String regionNo) {
			this.regionNo = regionNo;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getPageNo() {
			return this.pageNo;
		}

		public void setPageNo(Integer pageNo) {
			this.pageNo = pageNo;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public List<DemandModel> getDemandModels() {
			return this.demandModels;
		}

		public void setDemandModels(List<DemandModel> demandModels) {
			this.demandModels = demandModels;
		}

		public static class DemandModel {

			private String demandId;

			private String subDemandId;

			private String demandTime;

			private Long customerUid;

			private String customerName;

			private Long cbmUid;

			private String cbmName;

			private String availableZoneId;

			private String instanceType;

			private String instanceTypeFamily;

			private String networkType;

			private Boolean ioOptimized;

			private String payType;

			private String payDuration;

			private String durationUnit;

			private String startTime;

			private String endTime;

			private String demandStatus;

			private Integer totalCount;

			private Integer availableAmount;

			private Integer usedAmount;

			private Integer deliveringAmount;

			private String comment;

			private List<DemandSupply> demandSupplyList;

			public String getDemandId() {
				return this.demandId;
			}

			public void setDemandId(String demandId) {
				this.demandId = demandId;
			}

			public String getSubDemandId() {
				return this.subDemandId;
			}

			public void setSubDemandId(String subDemandId) {
				this.subDemandId = subDemandId;
			}

			public String getDemandTime() {
				return this.demandTime;
			}

			public void setDemandTime(String demandTime) {
				this.demandTime = demandTime;
			}

			public Long getCustomerUid() {
				return this.customerUid;
			}

			public void setCustomerUid(Long customerUid) {
				this.customerUid = customerUid;
			}

			public String getCustomerName() {
				return this.customerName;
			}

			public void setCustomerName(String customerName) {
				this.customerName = customerName;
			}

			public Long getCbmUid() {
				return this.cbmUid;
			}

			public void setCbmUid(Long cbmUid) {
				this.cbmUid = cbmUid;
			}

			public String getCbmName() {
				return this.cbmName;
			}

			public void setCbmName(String cbmName) {
				this.cbmName = cbmName;
			}

			public String getAvailableZoneId() {
				return this.availableZoneId;
			}

			public void setAvailableZoneId(String availableZoneId) {
				this.availableZoneId = availableZoneId;
			}

			public String getInstanceType() {
				return this.instanceType;
			}

			public void setInstanceType(String instanceType) {
				this.instanceType = instanceType;
			}

			public String getInstanceTypeFamily() {
				return this.instanceTypeFamily;
			}

			public void setInstanceTypeFamily(String instanceTypeFamily) {
				this.instanceTypeFamily = instanceTypeFamily;
			}

			public String getNetworkType() {
				return this.networkType;
			}

			public void setNetworkType(String networkType) {
				this.networkType = networkType;
			}

			public Boolean getIoOptimized() {
				return this.ioOptimized;
			}

			public void setIoOptimized(Boolean ioOptimized) {
				this.ioOptimized = ioOptimized;
			}

			public String getPayType() {
				return this.payType;
			}

			public void setPayType(String payType) {
				this.payType = payType;
			}

			public String getPayDuration() {
				return this.payDuration;
			}

			public void setPayDuration(String payDuration) {
				this.payDuration = payDuration;
			}

			public String getDurationUnit() {
				return this.durationUnit;
			}

			public void setDurationUnit(String durationUnit) {
				this.durationUnit = durationUnit;
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

			public Integer getTotalCount() {
				return this.totalCount;
			}

			public void setTotalCount(Integer totalCount) {
				this.totalCount = totalCount;
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

			public String getComment() {
				return this.comment;
			}

			public void setComment(String comment) {
				this.comment = comment;
			}

			public List<DemandSupply> getDemandSupplyList() {
				return this.demandSupplyList;
			}

			public void setDemandSupplyList(List<DemandSupply> demandSupplyList) {
				this.demandSupplyList = demandSupplyList;
			}

			public static class DemandSupply {

				private Integer totalAmount;

				private Integer usedAmount;

				private Integer availableAmount;

				private Integer deliveringAmount;

				private String supplyStatus;

				private String startTime;

				private String endTime;

				public Integer getTotalAmount() {
					return this.totalAmount;
				}

				public void setTotalAmount(Integer totalAmount) {
					this.totalAmount = totalAmount;
				}

				public Integer getUsedAmount() {
					return this.usedAmount;
				}

				public void setUsedAmount(Integer usedAmount) {
					this.usedAmount = usedAmount;
				}

				public Integer getAvailableAmount() {
					return this.availableAmount;
				}

				public void setAvailableAmount(Integer availableAmount) {
					this.availableAmount = availableAmount;
				}

				public Integer getDeliveringAmount() {
					return this.deliveringAmount;
				}

				public void setDeliveringAmount(Integer deliveringAmount) {
					this.deliveringAmount = deliveringAmount;
				}

				public String getSupplyStatus() {
					return this.supplyStatus;
				}

				public void setSupplyStatus(String supplyStatus) {
					this.supplyStatus = supplyStatus;
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
			}
		}
	}

	@Override
	public OpsSyncDemandResponse getInstance(UnmarshallerContext context) {
		return	OpsSyncDemandResponseUnmarshaller.unmarshall(this, context);
	}
}
