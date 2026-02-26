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

package com.aliyuncs.retailadvqa.model.v20230417;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class BatchSaveOrderPopRequest extends RpcAcsRequest<BatchSaveOrderPopResponse> {
	   

	@SerializedName("orders")
	private List<Orders> orders;
	public BatchSaveOrderPopRequest() {
		super("retailadvqa", "2023-04-17", "BatchSaveOrderPop", "qucikmember");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public List<Orders> getOrders() {
		return this.orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;	
		if (orders != null) {
			putQueryParameter("Orders" , new Gson().toJson(orders));
		}	
	}

	public static class Orders {

		@SerializedName("OpenMerchantId")
		private String openMerchantId;

		@SerializedName("OpenOrderId")
		private String openOrderId;

		@SerializedName("OrderPayment")
		private String orderPayment;

		@SerializedName("EndTime")
		private String endTime;

		@SerializedName("PayTime")
		private String payTime;

		@SerializedName("buyerOpenUid")
		private String buyerOpenUid;

		@SerializedName("ChannelCode")
		private String channelCode;

		@SerializedName("Feature")
		private String feature;

		@SerializedName("TotalFee")
		private String totalFee;

		@SerializedName("ChannelOpenId")
		private String channelOpenId;

		@SerializedName("SubOrderModelList")
		private List<SubOrderModelListItem> subOrderModelList;

		@SerializedName("PlatformType")
		private String platformType;

		@SerializedName("OrderCreateTime")
		private String orderCreateTime;

		@SerializedName("ShopId")
		private String shopId;

		@SerializedName("Status")
		private String status;

		public String getOpenMerchantId() {
			return this.openMerchantId;
		}

		public void setOpenMerchantId(String openMerchantId) {
			this.openMerchantId = openMerchantId;
		}

		public String getOpenOrderId() {
			return this.openOrderId;
		}

		public void setOpenOrderId(String openOrderId) {
			this.openOrderId = openOrderId;
		}

		public String getOrderPayment() {
			return this.orderPayment;
		}

		public void setOrderPayment(String orderPayment) {
			this.orderPayment = orderPayment;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getPayTime() {
			return this.payTime;
		}

		public void setPayTime(String payTime) {
			this.payTime = payTime;
		}

		public String getBuyerOpenUid() {
			return this.buyerOpenUid;
		}

		public void setBuyerOpenUid(String buyerOpenUid) {
			this.buyerOpenUid = buyerOpenUid;
		}

		public String getChannelCode() {
			return this.channelCode;
		}

		public void setChannelCode(String channelCode) {
			this.channelCode = channelCode;
		}

		public String getFeature() {
			return this.feature;
		}

		public void setFeature(String feature) {
			this.feature = feature;
		}

		public String getTotalFee() {
			return this.totalFee;
		}

		public void setTotalFee(String totalFee) {
			this.totalFee = totalFee;
		}

		public String getChannelOpenId() {
			return this.channelOpenId;
		}

		public void setChannelOpenId(String channelOpenId) {
			this.channelOpenId = channelOpenId;
		}

		public List<SubOrderModelListItem> getSubOrderModelList() {
			return this.subOrderModelList;
		}

		public void setSubOrderModelList(List<SubOrderModelListItem> subOrderModelList) {
			this.subOrderModelList = subOrderModelList;
		}

		public String getPlatformType() {
			return this.platformType;
		}

		public void setPlatformType(String platformType) {
			this.platformType = platformType;
		}

		public String getOrderCreateTime() {
			return this.orderCreateTime;
		}

		public void setOrderCreateTime(String orderCreateTime) {
			this.orderCreateTime = orderCreateTime;
		}

		public String getShopId() {
			return this.shopId;
		}

		public void setShopId(String shopId) {
			this.shopId = shopId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public static class SubOrderModelListItem {

			@SerializedName("ProductId")
			private String productId;

			@SerializedName("RefundStatus")
			private String refundStatus;

			@SerializedName("Feature")
			private String feature;

			@SerializedName("TotalFee")
			private String totalFee;

			@SerializedName("ProductAmount")
			private String productAmount;

			@SerializedName("OrderPayment")
			private String orderPayment;

			@SerializedName("ProductName")
			private String productName;

			@SerializedName("OpenSubOrderId")
			private String openSubOrderId;

			@SerializedName("OutProductId")
			private String outProductId;

			@SerializedName("Status")
			private String status;

			public String getProductId() {
				return this.productId;
			}

			public void setProductId(String productId) {
				this.productId = productId;
			}

			public String getRefundStatus() {
				return this.refundStatus;
			}

			public void setRefundStatus(String refundStatus) {
				this.refundStatus = refundStatus;
			}

			public String getFeature() {
				return this.feature;
			}

			public void setFeature(String feature) {
				this.feature = feature;
			}

			public String getTotalFee() {
				return this.totalFee;
			}

			public void setTotalFee(String totalFee) {
				this.totalFee = totalFee;
			}

			public String getProductAmount() {
				return this.productAmount;
			}

			public void setProductAmount(String productAmount) {
				this.productAmount = productAmount;
			}

			public String getOrderPayment() {
				return this.orderPayment;
			}

			public void setOrderPayment(String orderPayment) {
				this.orderPayment = orderPayment;
			}

			public String getProductName() {
				return this.productName;
			}

			public void setProductName(String productName) {
				this.productName = productName;
			}

			public String getOpenSubOrderId() {
				return this.openSubOrderId;
			}

			public void setOpenSubOrderId(String openSubOrderId) {
				this.openSubOrderId = openSubOrderId;
			}

			public String getOutProductId() {
				return this.outProductId;
			}

			public void setOutProductId(String outProductId) {
				this.outProductId = outProductId;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}
	}

	@Override
	public Class<BatchSaveOrderPopResponse> getResponseClass() {
		return BatchSaveOrderPopResponse.class;
	}

}
