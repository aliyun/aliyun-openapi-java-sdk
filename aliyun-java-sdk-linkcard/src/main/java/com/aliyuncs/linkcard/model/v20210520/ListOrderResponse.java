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

package com.aliyuncs.linkcard.model.v20210520;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkcard.transform.v20210520.ListOrderResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListOrderResponse extends AcsResponse {

	private String code;

	private String errorMessage;

	private String requestId;

	private Boolean success;

	private String localizedMessage;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getLocalizedMessage() {
		return this.localizedMessage;
	}

	public void setLocalizedMessage(String localizedMessage) {
		this.localizedMessage = localizedMessage;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer pageNo;

		private Integer pageSize;

		private Integer pageCount;

		private Integer total;

		private List<OrderListVO> list;

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

		public Integer getPageCount() {
			return this.pageCount;
		}

		public void setPageCount(Integer pageCount) {
			this.pageCount = pageCount;
		}

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public List<OrderListVO> getList() {
			return this.list;
		}

		public void setList(List<OrderListVO> list) {
			this.list = list;
		}

		public static class OrderListVO {

			private String billingCycle;

			private Integer buyNum;

			private String poolCapacityUnit;

			private Integer cardPayCount;

			private String credentialPackage;

			private String vendor;

			private String dataLevel;

			private String payDuration;

			private String aliFee;

			private String orderStatus;

			private String poolNo;

			private Integer functionFee;

			private String payTime;

			private String flowType;

			private String poolCapacity;

			private String orderInfo;

			private String orderType;

			private String orderId;

			private String credentialNo;

			private String orderDetailUrl;

			private List<String> expressNoList;

			private DeliveryInfo deliveryInfo;

			public String getBillingCycle() {
				return this.billingCycle;
			}

			public void setBillingCycle(String billingCycle) {
				this.billingCycle = billingCycle;
			}

			public Integer getBuyNum() {
				return this.buyNum;
			}

			public void setBuyNum(Integer buyNum) {
				this.buyNum = buyNum;
			}

			public String getPoolCapacityUnit() {
				return this.poolCapacityUnit;
			}

			public void setPoolCapacityUnit(String poolCapacityUnit) {
				this.poolCapacityUnit = poolCapacityUnit;
			}

			public Integer getCardPayCount() {
				return this.cardPayCount;
			}

			public void setCardPayCount(Integer cardPayCount) {
				this.cardPayCount = cardPayCount;
			}

			public String getCredentialPackage() {
				return this.credentialPackage;
			}

			public void setCredentialPackage(String credentialPackage) {
				this.credentialPackage = credentialPackage;
			}

			public String getVendor() {
				return this.vendor;
			}

			public void setVendor(String vendor) {
				this.vendor = vendor;
			}

			public String getDataLevel() {
				return this.dataLevel;
			}

			public void setDataLevel(String dataLevel) {
				this.dataLevel = dataLevel;
			}

			public String getPayDuration() {
				return this.payDuration;
			}

			public void setPayDuration(String payDuration) {
				this.payDuration = payDuration;
			}

			public String getAliFee() {
				return this.aliFee;
			}

			public void setAliFee(String aliFee) {
				this.aliFee = aliFee;
			}

			public String getOrderStatus() {
				return this.orderStatus;
			}

			public void setOrderStatus(String orderStatus) {
				this.orderStatus = orderStatus;
			}

			public String getPoolNo() {
				return this.poolNo;
			}

			public void setPoolNo(String poolNo) {
				this.poolNo = poolNo;
			}

			public Integer getFunctionFee() {
				return this.functionFee;
			}

			public void setFunctionFee(Integer functionFee) {
				this.functionFee = functionFee;
			}

			public String getPayTime() {
				return this.payTime;
			}

			public void setPayTime(String payTime) {
				this.payTime = payTime;
			}

			public String getFlowType() {
				return this.flowType;
			}

			public void setFlowType(String flowType) {
				this.flowType = flowType;
			}

			public String getPoolCapacity() {
				return this.poolCapacity;
			}

			public void setPoolCapacity(String poolCapacity) {
				this.poolCapacity = poolCapacity;
			}

			public String getOrderInfo() {
				return this.orderInfo;
			}

			public void setOrderInfo(String orderInfo) {
				this.orderInfo = orderInfo;
			}

			public String getOrderType() {
				return this.orderType;
			}

			public void setOrderType(String orderType) {
				this.orderType = orderType;
			}

			public String getOrderId() {
				return this.orderId;
			}

			public void setOrderId(String orderId) {
				this.orderId = orderId;
			}

			public String getCredentialNo() {
				return this.credentialNo;
			}

			public void setCredentialNo(String credentialNo) {
				this.credentialNo = credentialNo;
			}

			public String getOrderDetailUrl() {
				return this.orderDetailUrl;
			}

			public void setOrderDetailUrl(String orderDetailUrl) {
				this.orderDetailUrl = orderDetailUrl;
			}

			public List<String> getExpressNoList() {
				return this.expressNoList;
			}

			public void setExpressNoList(List<String> expressNoList) {
				this.expressNoList = expressNoList;
			}

			public DeliveryInfo getDeliveryInfo() {
				return this.deliveryInfo;
			}

			public void setDeliveryInfo(DeliveryInfo deliveryInfo) {
				this.deliveryInfo = deliveryInfo;
			}

			public static class DeliveryInfo {

				private String zipCode;

				private String address;

				private String mail;

				private String receiver;

				private String buyerMessage;

				public String getZipCode() {
					return this.zipCode;
				}

				public void setZipCode(String zipCode) {
					this.zipCode = zipCode;
				}

				public String getAddress() {
					return this.address;
				}

				public void setAddress(String address) {
					this.address = address;
				}

				public String getMail() {
					return this.mail;
				}

				public void setMail(String mail) {
					this.mail = mail;
				}

				public String getReceiver() {
					return this.receiver;
				}

				public void setReceiver(String receiver) {
					this.receiver = receiver;
				}

				public String getBuyerMessage() {
					return this.buyerMessage;
				}

				public void setBuyerMessage(String buyerMessage) {
					this.buyerMessage = buyerMessage;
				}
			}
		}
	}

	@Override
	public ListOrderResponse getInstance(UnmarshallerContext context) {
		return	ListOrderResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
