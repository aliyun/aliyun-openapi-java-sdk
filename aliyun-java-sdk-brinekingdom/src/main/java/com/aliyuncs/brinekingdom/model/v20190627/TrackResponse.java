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

package com.aliyuncs.brinekingdom.model.v20190627;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.brinekingdom.transform.v20190627.TrackResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class TrackResponse extends AcsResponse {

	private String message;

	private Boolean success;

	private String requestId;

	private List<DataListItem> dataList;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataListItem> getDataList() {
		return this.dataList;
	}

	public void setDataList(List<DataListItem> dataList) {
		this.dataList = dataList;
	}

	public static class DataListItem {

		private Integer moveQty;

		private String sourceId;

		private Long demandId;

		private Integer supplyQty;

		private Long expectDate;

		private String demandStatus;

		private String source;

		private List<ProgressListItem> progressList;

		public Integer getMoveQty() {
			return this.moveQty;
		}

		public void setMoveQty(Integer moveQty) {
			this.moveQty = moveQty;
		}

		public String getSourceId() {
			return this.sourceId;
		}

		public void setSourceId(String sourceId) {
			this.sourceId = sourceId;
		}

		public Long getDemandId() {
			return this.demandId;
		}

		public void setDemandId(Long demandId) {
			this.demandId = demandId;
		}

		public Integer getSupplyQty() {
			return this.supplyQty;
		}

		public void setSupplyQty(Integer supplyQty) {
			this.supplyQty = supplyQty;
		}

		public Long getExpectDate() {
			return this.expectDate;
		}

		public void setExpectDate(Long expectDate) {
			this.expectDate = expectDate;
		}

		public String getDemandStatus() {
			return this.demandStatus;
		}

		public void setDemandStatus(String demandStatus) {
			this.demandStatus = demandStatus;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public List<ProgressListItem> getProgressList() {
			return this.progressList;
		}

		public void setProgressList(List<ProgressListItem> progressList) {
			this.progressList = progressList;
		}

		public static class ProgressListItem {

			private Long realDeliveryDate;

			private String orderErrorMsg;

			private Long slaDeliveryDate;

			private Long ladingCnt;

			private String orderNumber;

			private Long expectDate;

			private Long dealCnt;

			private String deliveryStatus;

			private Long deliveryCnt;

			private String rackStatus;

			private String deliveryType;

			private List<FcstDeliveryListItem> fcstDeliveryList;

			private List<DeliveryInfoListItem> deliveryInfoList;

			public Long getRealDeliveryDate() {
				return this.realDeliveryDate;
			}

			public void setRealDeliveryDate(Long realDeliveryDate) {
				this.realDeliveryDate = realDeliveryDate;
			}

			public String getOrderErrorMsg() {
				return this.orderErrorMsg;
			}

			public void setOrderErrorMsg(String orderErrorMsg) {
				this.orderErrorMsg = orderErrorMsg;
			}

			public Long getSlaDeliveryDate() {
				return this.slaDeliveryDate;
			}

			public void setSlaDeliveryDate(Long slaDeliveryDate) {
				this.slaDeliveryDate = slaDeliveryDate;
			}

			public Long getLadingCnt() {
				return this.ladingCnt;
			}

			public void setLadingCnt(Long ladingCnt) {
				this.ladingCnt = ladingCnt;
			}

			public String getOrderNumber() {
				return this.orderNumber;
			}

			public void setOrderNumber(String orderNumber) {
				this.orderNumber = orderNumber;
			}

			public Long getExpectDate() {
				return this.expectDate;
			}

			public void setExpectDate(Long expectDate) {
				this.expectDate = expectDate;
			}

			public Long getDealCnt() {
				return this.dealCnt;
			}

			public void setDealCnt(Long dealCnt) {
				this.dealCnt = dealCnt;
			}

			public String getDeliveryStatus() {
				return this.deliveryStatus;
			}

			public void setDeliveryStatus(String deliveryStatus) {
				this.deliveryStatus = deliveryStatus;
			}

			public Long getDeliveryCnt() {
				return this.deliveryCnt;
			}

			public void setDeliveryCnt(Long deliveryCnt) {
				this.deliveryCnt = deliveryCnt;
			}

			public String getRackStatus() {
				return this.rackStatus;
			}

			public void setRackStatus(String rackStatus) {
				this.rackStatus = rackStatus;
			}

			public String getDeliveryType() {
				return this.deliveryType;
			}

			public void setDeliveryType(String deliveryType) {
				this.deliveryType = deliveryType;
			}

			public List<FcstDeliveryListItem> getFcstDeliveryList() {
				return this.fcstDeliveryList;
			}

			public void setFcstDeliveryList(List<FcstDeliveryListItem> fcstDeliveryList) {
				this.fcstDeliveryList = fcstDeliveryList;
			}

			public List<DeliveryInfoListItem> getDeliveryInfoList() {
				return this.deliveryInfoList;
			}

			public void setDeliveryInfoList(List<DeliveryInfoListItem> deliveryInfoList) {
				this.deliveryInfoList = deliveryInfoList;
			}

			public static class FcstDeliveryListItem {

				private Long fcstDeliveryDate;

				private Integer fcstDeliveryCnt;

				public Long getFcstDeliveryDate() {
					return this.fcstDeliveryDate;
				}

				public void setFcstDeliveryDate(Long fcstDeliveryDate) {
					this.fcstDeliveryDate = fcstDeliveryDate;
				}

				public Integer getFcstDeliveryCnt() {
					return this.fcstDeliveryCnt;
				}

				public void setFcstDeliveryCnt(Integer fcstDeliveryCnt) {
					this.fcstDeliveryCnt = fcstDeliveryCnt;
				}
			}

			public static class DeliveryInfoListItem {

				private String deviceSource;

				private String brandCode;

				private String orderNumber;

				private String creator;

				private Long ladingOrderTime;

				private String transferTypeDES;

				private String securityDomain;

				private String idcName;

				private String parentFactoryModelName;

				private Long finishTime;

				private String receiveType;

				private Integer loading;

				private String logicZone;

				private String networkType;

				private String logicZoneName;

				private String templateName;

				private Boolean keepData;

				private String modelName;

				private String roomName;

				private String transferNumber;

				private String batchNumber;

				private String poNumber;

				private String osName;

				private String errorInfo;

				private String prNumber;

				private String shipNumber;

				private Boolean installSwitch;

				private String businessLabel;

				private Integer transferType;

				private String progressStepEnum;

				private Long preInputTime;

				private Long gmtCreate;

				private String transferName;

				private String sourceAppGroup;

				private String sourceIdcName;

				private String rackName;

				private String sn;

				private String appGroupName;

				public String getDeviceSource() {
					return this.deviceSource;
				}

				public void setDeviceSource(String deviceSource) {
					this.deviceSource = deviceSource;
				}

				public String getBrandCode() {
					return this.brandCode;
				}

				public void setBrandCode(String brandCode) {
					this.brandCode = brandCode;
				}

				public String getOrderNumber() {
					return this.orderNumber;
				}

				public void setOrderNumber(String orderNumber) {
					this.orderNumber = orderNumber;
				}

				public String getCreator() {
					return this.creator;
				}

				public void setCreator(String creator) {
					this.creator = creator;
				}

				public Long getLadingOrderTime() {
					return this.ladingOrderTime;
				}

				public void setLadingOrderTime(Long ladingOrderTime) {
					this.ladingOrderTime = ladingOrderTime;
				}

				public String getTransferTypeDES() {
					return this.transferTypeDES;
				}

				public void setTransferTypeDES(String transferTypeDES) {
					this.transferTypeDES = transferTypeDES;
				}

				public String getSecurityDomain() {
					return this.securityDomain;
				}

				public void setSecurityDomain(String securityDomain) {
					this.securityDomain = securityDomain;
				}

				public String getIdcName() {
					return this.idcName;
				}

				public void setIdcName(String idcName) {
					this.idcName = idcName;
				}

				public String getParentFactoryModelName() {
					return this.parentFactoryModelName;
				}

				public void setParentFactoryModelName(String parentFactoryModelName) {
					this.parentFactoryModelName = parentFactoryModelName;
				}

				public Long getFinishTime() {
					return this.finishTime;
				}

				public void setFinishTime(Long finishTime) {
					this.finishTime = finishTime;
				}

				public String getReceiveType() {
					return this.receiveType;
				}

				public void setReceiveType(String receiveType) {
					this.receiveType = receiveType;
				}

				public Integer getLoading() {
					return this.loading;
				}

				public void setLoading(Integer loading) {
					this.loading = loading;
				}

				public String getLogicZone() {
					return this.logicZone;
				}

				public void setLogicZone(String logicZone) {
					this.logicZone = logicZone;
				}

				public String getNetworkType() {
					return this.networkType;
				}

				public void setNetworkType(String networkType) {
					this.networkType = networkType;
				}

				public String getLogicZoneName() {
					return this.logicZoneName;
				}

				public void setLogicZoneName(String logicZoneName) {
					this.logicZoneName = logicZoneName;
				}

				public String getTemplateName() {
					return this.templateName;
				}

				public void setTemplateName(String templateName) {
					this.templateName = templateName;
				}

				public Boolean getKeepData() {
					return this.keepData;
				}

				public void setKeepData(Boolean keepData) {
					this.keepData = keepData;
				}

				public String getModelName() {
					return this.modelName;
				}

				public void setModelName(String modelName) {
					this.modelName = modelName;
				}

				public String getRoomName() {
					return this.roomName;
				}

				public void setRoomName(String roomName) {
					this.roomName = roomName;
				}

				public String getTransferNumber() {
					return this.transferNumber;
				}

				public void setTransferNumber(String transferNumber) {
					this.transferNumber = transferNumber;
				}

				public String getBatchNumber() {
					return this.batchNumber;
				}

				public void setBatchNumber(String batchNumber) {
					this.batchNumber = batchNumber;
				}

				public String getPoNumber() {
					return this.poNumber;
				}

				public void setPoNumber(String poNumber) {
					this.poNumber = poNumber;
				}

				public String getOsName() {
					return this.osName;
				}

				public void setOsName(String osName) {
					this.osName = osName;
				}

				public String getErrorInfo() {
					return this.errorInfo;
				}

				public void setErrorInfo(String errorInfo) {
					this.errorInfo = errorInfo;
				}

				public String getPrNumber() {
					return this.prNumber;
				}

				public void setPrNumber(String prNumber) {
					this.prNumber = prNumber;
				}

				public String getShipNumber() {
					return this.shipNumber;
				}

				public void setShipNumber(String shipNumber) {
					this.shipNumber = shipNumber;
				}

				public Boolean getInstallSwitch() {
					return this.installSwitch;
				}

				public void setInstallSwitch(Boolean installSwitch) {
					this.installSwitch = installSwitch;
				}

				public String getBusinessLabel() {
					return this.businessLabel;
				}

				public void setBusinessLabel(String businessLabel) {
					this.businessLabel = businessLabel;
				}

				public Integer getTransferType() {
					return this.transferType;
				}

				public void setTransferType(Integer transferType) {
					this.transferType = transferType;
				}

				public String getProgressStepEnum() {
					return this.progressStepEnum;
				}

				public void setProgressStepEnum(String progressStepEnum) {
					this.progressStepEnum = progressStepEnum;
				}

				public Long getPreInputTime() {
					return this.preInputTime;
				}

				public void setPreInputTime(Long preInputTime) {
					this.preInputTime = preInputTime;
				}

				public Long getGmtCreate() {
					return this.gmtCreate;
				}

				public void setGmtCreate(Long gmtCreate) {
					this.gmtCreate = gmtCreate;
				}

				public String getTransferName() {
					return this.transferName;
				}

				public void setTransferName(String transferName) {
					this.transferName = transferName;
				}

				public String getSourceAppGroup() {
					return this.sourceAppGroup;
				}

				public void setSourceAppGroup(String sourceAppGroup) {
					this.sourceAppGroup = sourceAppGroup;
				}

				public String getSourceIdcName() {
					return this.sourceIdcName;
				}

				public void setSourceIdcName(String sourceIdcName) {
					this.sourceIdcName = sourceIdcName;
				}

				public String getRackName() {
					return this.rackName;
				}

				public void setRackName(String rackName) {
					this.rackName = rackName;
				}

				public String getSn() {
					return this.sn;
				}

				public void setSn(String sn) {
					this.sn = sn;
				}

				public String getAppGroupName() {
					return this.appGroupName;
				}

				public void setAppGroupName(String appGroupName) {
					this.appGroupName = appGroupName;
				}
			}
		}
	}

	@Override
	public TrackResponse getInstance(UnmarshallerContext context) {
		return	TrackResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
