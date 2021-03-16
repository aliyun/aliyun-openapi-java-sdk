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
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeDemandResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeDemandResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Boolean success;

	private List<DemandInfoModel> demandInfoModelList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<DemandInfoModel> getDemandInfoModelList() {
		return this.demandInfoModelList;
	}

	public void setDemandInfoModelList(List<DemandInfoModel> demandInfoModelList) {
		this.demandInfoModelList = demandInfoModelList;
	}

	public static class DemandInfoModel {

		private String demandId;

		private String batchName;

		private String projectId;

		private String demandTime;

		private String sumitterUid;

		private String sumitterName;

		private Long customerUid;

		private String customerName;

		private String demandSupplyPmName;

		private String demandSupplyPmUid;

		private String supplyStatus;

		private String status;

		private String comment;

		private List<DemandResourceInfoModel> demandResourceInfoModelList;

		public String getDemandId() {
			return this.demandId;
		}

		public void setDemandId(String demandId) {
			this.demandId = demandId;
		}

		public String getBatchName() {
			return this.batchName;
		}

		public void setBatchName(String batchName) {
			this.batchName = batchName;
		}

		public String getProjectId() {
			return this.projectId;
		}

		public void setProjectId(String projectId) {
			this.projectId = projectId;
		}

		public String getDemandTime() {
			return this.demandTime;
		}

		public void setDemandTime(String demandTime) {
			this.demandTime = demandTime;
		}

		public String getSumitterUid() {
			return this.sumitterUid;
		}

		public void setSumitterUid(String sumitterUid) {
			this.sumitterUid = sumitterUid;
		}

		public String getSumitterName() {
			return this.sumitterName;
		}

		public void setSumitterName(String sumitterName) {
			this.sumitterName = sumitterName;
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

		public String getDemandSupplyPmName() {
			return this.demandSupplyPmName;
		}

		public void setDemandSupplyPmName(String demandSupplyPmName) {
			this.demandSupplyPmName = demandSupplyPmName;
		}

		public String getDemandSupplyPmUid() {
			return this.demandSupplyPmUid;
		}

		public void setDemandSupplyPmUid(String demandSupplyPmUid) {
			this.demandSupplyPmUid = demandSupplyPmUid;
		}

		public String getSupplyStatus() {
			return this.supplyStatus;
		}

		public void setSupplyStatus(String supplyStatus) {
			this.supplyStatus = supplyStatus;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public List<DemandResourceInfoModel> getDemandResourceInfoModelList() {
			return this.demandResourceInfoModelList;
		}

		public void setDemandResourceInfoModelList(List<DemandResourceInfoModel> demandResourceInfoModelList) {
			this.demandResourceInfoModelList = demandResourceInfoModelList;
		}

		public static class DemandResourceInfoModel {

			private String subDemandId;

			private String region;

			private String iz;

			private String businessType;

			private String instanceType;

			private String networkType;

			private String payType;

			private Integer payDuration;

			private String payDurationUnit;

			private String expectPayTimeBegin;

			private String expectPayTimeEnd;

			private Integer demandCount;

			private String subDemandSupplyPmName;

			private String subDemandSupplyPerformerUid;

			private String subDemandSupplyPerformerName;

			private String subDemandSupplyPmUid;

			private String status;

			private String supplyStatus;

			private String comment;

			private List<DemandSupplyStatusModel> demandSupplyStatusModelList;

			public String getSubDemandId() {
				return this.subDemandId;
			}

			public void setSubDemandId(String subDemandId) {
				this.subDemandId = subDemandId;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public String getIz() {
				return this.iz;
			}

			public void setIz(String iz) {
				this.iz = iz;
			}

			public String getBusinessType() {
				return this.businessType;
			}

			public void setBusinessType(String businessType) {
				this.businessType = businessType;
			}

			public String getInstanceType() {
				return this.instanceType;
			}

			public void setInstanceType(String instanceType) {
				this.instanceType = instanceType;
			}

			public String getNetworkType() {
				return this.networkType;
			}

			public void setNetworkType(String networkType) {
				this.networkType = networkType;
			}

			public String getPayType() {
				return this.payType;
			}

			public void setPayType(String payType) {
				this.payType = payType;
			}

			public Integer getPayDuration() {
				return this.payDuration;
			}

			public void setPayDuration(Integer payDuration) {
				this.payDuration = payDuration;
			}

			public String getPayDurationUnit() {
				return this.payDurationUnit;
			}

			public void setPayDurationUnit(String payDurationUnit) {
				this.payDurationUnit = payDurationUnit;
			}

			public String getExpectPayTimeBegin() {
				return this.expectPayTimeBegin;
			}

			public void setExpectPayTimeBegin(String expectPayTimeBegin) {
				this.expectPayTimeBegin = expectPayTimeBegin;
			}

			public String getExpectPayTimeEnd() {
				return this.expectPayTimeEnd;
			}

			public void setExpectPayTimeEnd(String expectPayTimeEnd) {
				this.expectPayTimeEnd = expectPayTimeEnd;
			}

			public Integer getDemandCount() {
				return this.demandCount;
			}

			public void setDemandCount(Integer demandCount) {
				this.demandCount = demandCount;
			}

			public String getSubDemandSupplyPmName() {
				return this.subDemandSupplyPmName;
			}

			public void setSubDemandSupplyPmName(String subDemandSupplyPmName) {
				this.subDemandSupplyPmName = subDemandSupplyPmName;
			}

			public String getSubDemandSupplyPerformerUid() {
				return this.subDemandSupplyPerformerUid;
			}

			public void setSubDemandSupplyPerformerUid(String subDemandSupplyPerformerUid) {
				this.subDemandSupplyPerformerUid = subDemandSupplyPerformerUid;
			}

			public String getSubDemandSupplyPerformerName() {
				return this.subDemandSupplyPerformerName;
			}

			public void setSubDemandSupplyPerformerName(String subDemandSupplyPerformerName) {
				this.subDemandSupplyPerformerName = subDemandSupplyPerformerName;
			}

			public String getSubDemandSupplyPmUid() {
				return this.subDemandSupplyPmUid;
			}

			public void setSubDemandSupplyPmUid(String subDemandSupplyPmUid) {
				this.subDemandSupplyPmUid = subDemandSupplyPmUid;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getSupplyStatus() {
				return this.supplyStatus;
			}

			public void setSupplyStatus(String supplyStatus) {
				this.supplyStatus = supplyStatus;
			}

			public String getComment() {
				return this.comment;
			}

			public void setComment(String comment) {
				this.comment = comment;
			}

			public List<DemandSupplyStatusModel> getDemandSupplyStatusModelList() {
				return this.demandSupplyStatusModelList;
			}

			public void setDemandSupplyStatusModelList(List<DemandSupplyStatusModel> demandSupplyStatusModelList) {
				this.demandSupplyStatusModelList = demandSupplyStatusModelList;
			}

			public static class DemandSupplyStatusModel {

				private Integer totalOrder;

				private Integer subOrderId;

				private Integer amount;

				private Integer deliveredAmount;

				private String status;

				private String supplyStatus;

				private Integer consumeCnt;

				private String lastSupplyTime;

				private String actualSupplyTime;

				private String comment;

				public Integer getTotalOrder() {
					return this.totalOrder;
				}

				public void setTotalOrder(Integer totalOrder) {
					this.totalOrder = totalOrder;
				}

				public Integer getSubOrderId() {
					return this.subOrderId;
				}

				public void setSubOrderId(Integer subOrderId) {
					this.subOrderId = subOrderId;
				}

				public Integer getAmount() {
					return this.amount;
				}

				public void setAmount(Integer amount) {
					this.amount = amount;
				}

				public Integer getDeliveredAmount() {
					return this.deliveredAmount;
				}

				public void setDeliveredAmount(Integer deliveredAmount) {
					this.deliveredAmount = deliveredAmount;
				}

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public String getSupplyStatus() {
					return this.supplyStatus;
				}

				public void setSupplyStatus(String supplyStatus) {
					this.supplyStatus = supplyStatus;
				}

				public Integer getConsumeCnt() {
					return this.consumeCnt;
				}

				public void setConsumeCnt(Integer consumeCnt) {
					this.consumeCnt = consumeCnt;
				}

				public String getLastSupplyTime() {
					return this.lastSupplyTime;
				}

				public void setLastSupplyTime(String lastSupplyTime) {
					this.lastSupplyTime = lastSupplyTime;
				}

				public String getActualSupplyTime() {
					return this.actualSupplyTime;
				}

				public void setActualSupplyTime(String actualSupplyTime) {
					this.actualSupplyTime = actualSupplyTime;
				}

				public String getComment() {
					return this.comment;
				}

				public void setComment(String comment) {
					this.comment = comment;
				}
			}
		}
	}

	@Override
	public OpsDescribeDemandResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeDemandResponseUnmarshaller.unmarshall(this, context);
	}
}
