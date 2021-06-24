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

		private Integer pageNo;

		private Integer pageSize;

		private Integer totalCount;

		private List<DemandModel> demandModels;

		public String getRegionNo() {
			return this.regionNo;
		}

		public void setRegionNo(String regionNo) {
			this.regionNo = regionNo;
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

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<DemandModel> getDemandModels() {
			return this.demandModels;
		}

		public void setDemandModels(List<DemandModel> demandModels) {
			this.demandModels = demandModels;
		}

		public static class DemandModel {

			private String comment;

			private String demandId;

			private Long customerUid;

			private String demandTime;

			private String payType;

			private String cbmName;

			private String networkType;

			private Integer availableAmount;

			private String customerName;

			private String durationUnit;

			private Integer deliveringAmount;

			private String subDemandId;

			private String availableZoneId;

			private Integer totalCount;

			private String instanceType;

			private String endTime;

			private Boolean ioOptimized;

			private String startTime;

			private Long cbmUid;

			private String payDuration;

			private Integer usedAmount;

			private String instanceTypeFamily;

			private String demandStatus;

			private List<DemandSupply> demandSupplyList;

			public String getComment() {
				return this.comment;
			}

			public void setComment(String comment) {
				this.comment = comment;
			}

			public String getDemandId() {
				return this.demandId;
			}

			public void setDemandId(String demandId) {
				this.demandId = demandId;
			}

			public Long getCustomerUid() {
				return this.customerUid;
			}

			public void setCustomerUid(Long customerUid) {
				this.customerUid = customerUid;
			}

			public String getDemandTime() {
				return this.demandTime;
			}

			public void setDemandTime(String demandTime) {
				this.demandTime = demandTime;
			}

			public String getPayType() {
				return this.payType;
			}

			public void setPayType(String payType) {
				this.payType = payType;
			}

			public String getCbmName() {
				return this.cbmName;
			}

			public void setCbmName(String cbmName) {
				this.cbmName = cbmName;
			}

			public String getNetworkType() {
				return this.networkType;
			}

			public void setNetworkType(String networkType) {
				this.networkType = networkType;
			}

			public Integer getAvailableAmount() {
				return this.availableAmount;
			}

			public void setAvailableAmount(Integer availableAmount) {
				this.availableAmount = availableAmount;
			}

			public String getCustomerName() {
				return this.customerName;
			}

			public void setCustomerName(String customerName) {
				this.customerName = customerName;
			}

			public String getDurationUnit() {
				return this.durationUnit;
			}

			public void setDurationUnit(String durationUnit) {
				this.durationUnit = durationUnit;
			}

			public Integer getDeliveringAmount() {
				return this.deliveringAmount;
			}

			public void setDeliveringAmount(Integer deliveringAmount) {
				this.deliveringAmount = deliveringAmount;
			}

			public String getSubDemandId() {
				return this.subDemandId;
			}

			public void setSubDemandId(String subDemandId) {
				this.subDemandId = subDemandId;
			}

			public String getAvailableZoneId() {
				return this.availableZoneId;
			}

			public void setAvailableZoneId(String availableZoneId) {
				this.availableZoneId = availableZoneId;
			}

			public Integer getTotalCount() {
				return this.totalCount;
			}

			public void setTotalCount(Integer totalCount) {
				this.totalCount = totalCount;
			}

			public String getInstanceType() {
				return this.instanceType;
			}

			public void setInstanceType(String instanceType) {
				this.instanceType = instanceType;
			}

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
			}

			public Boolean getIoOptimized() {
				return this.ioOptimized;
			}

			public void setIoOptimized(Boolean ioOptimized) {
				this.ioOptimized = ioOptimized;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public Long getCbmUid() {
				return this.cbmUid;
			}

			public void setCbmUid(Long cbmUid) {
				this.cbmUid = cbmUid;
			}

			public String getPayDuration() {
				return this.payDuration;
			}

			public void setPayDuration(String payDuration) {
				this.payDuration = payDuration;
			}

			public Integer getUsedAmount() {
				return this.usedAmount;
			}

			public void setUsedAmount(Integer usedAmount) {
				this.usedAmount = usedAmount;
			}

			public String getInstanceTypeFamily() {
				return this.instanceTypeFamily;
			}

			public void setInstanceTypeFamily(String instanceTypeFamily) {
				this.instanceTypeFamily = instanceTypeFamily;
			}

			public String getDemandStatus() {
				return this.demandStatus;
			}

			public void setDemandStatus(String demandStatus) {
				this.demandStatus = demandStatus;
			}

			public List<DemandSupply> getDemandSupplyList() {
				return this.demandSupplyList;
			}

			public void setDemandSupplyList(List<DemandSupply> demandSupplyList) {
				this.demandSupplyList = demandSupplyList;
			}

			public static class DemandSupply {

				private String endTime;

				private Integer availableAmount;

				private String startTime;

				private String supplyStatus;

				private Integer usedAmount;

				private Integer totalAmount;

				private Integer deliveringAmount;

				public String getEndTime() {
					return this.endTime;
				}

				public void setEndTime(String endTime) {
					this.endTime = endTime;
				}

				public Integer getAvailableAmount() {
					return this.availableAmount;
				}

				public void setAvailableAmount(Integer availableAmount) {
					this.availableAmount = availableAmount;
				}

				public String getStartTime() {
					return this.startTime;
				}

				public void setStartTime(String startTime) {
					this.startTime = startTime;
				}

				public String getSupplyStatus() {
					return this.supplyStatus;
				}

				public void setSupplyStatus(String supplyStatus) {
					this.supplyStatus = supplyStatus;
				}

				public Integer getUsedAmount() {
					return this.usedAmount;
				}

				public void setUsedAmount(Integer usedAmount) {
					this.usedAmount = usedAmount;
				}

				public Integer getTotalAmount() {
					return this.totalAmount;
				}

				public void setTotalAmount(Integer totalAmount) {
					this.totalAmount = totalAmount;
				}

				public Integer getDeliveringAmount() {
					return this.deliveringAmount;
				}

				public void setDeliveringAmount(Integer deliveringAmount) {
					this.deliveringAmount = deliveringAmount;
				}
			}
		}
	}

	@Override
	public OpsSyncDemandResponse getInstance(UnmarshallerContext context) {
		return	OpsSyncDemandResponseUnmarshaller.unmarshall(this, context);
	}
}
