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
	   

	private String appSecret;

	private String sign;

	private String appKey;

	@SerializedName("orders")
	private List<Orders> orders;

	private String timeStr;
	public BatchSaveOrderPopRequest() {
		super("retailadvqa", "2023-04-17", "BatchSaveOrderPop", "qucikmember");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getAppSecret() {
		return this.appSecret;
	}

	public void setAppSecret(String appSecret) {
		this.appSecret = appSecret;
		if(appSecret != null){
			putQueryParameter("AppSecret", appSecret);
		}
	}

	public String getSign() {
		return this.sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
		if(sign != null){
			putQueryParameter("Sign", sign);
		}
	}

	public String getAppKey() {
		return this.appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
		if(appKey != null){
			putQueryParameter("AppKey", appKey);
		}
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

	public String getTimeStr() {
		return this.timeStr;
	}

	public void setTimeStr(String timeStr) {
		this.timeStr = timeStr;
		if(timeStr != null){
			putQueryParameter("TimeStr", timeStr);
		}
	}

	public static class Orders {

		@SerializedName("OpenMerchantId")
		private String openMerchantId;

		@SerializedName("Feature")
		private String feature;

		@SerializedName("TotalFee")
		private String totalFee;

		@SerializedName("OpenOrderId")
		private String openOrderId;

		@SerializedName("ChannelOpenId")
		private String channelOpenId;

		@SerializedName("OrderPayment")
		private String orderPayment;

		@SerializedName("SubOrderModelList")
		private List<SubOrderModelListItem> subOrderModelList;

		@SerializedName("OrderCreateTime")
		private String orderCreateTime;

		@SerializedName("PlatformType")
		private String platformType;

		@SerializedName("ShopId")
		private String shopId;

		@SerializedName("ChannelCode")
		private String channelCode;

		@SerializedName("Status")
		private String status;

		public String getOpenMerchantId() {
			return this.openMerchantId;
		}

		public void setOpenMerchantId(String openMerchantId) {
			this.openMerchantId = openMerchantId;
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

		public String getOpenOrderId() {
			return this.openOrderId;
		}

		public void setOpenOrderId(String openOrderId) {
			this.openOrderId = openOrderId;
		}

		public String getChannelOpenId() {
			return this.channelOpenId;
		}

		public void setChannelOpenId(String channelOpenId) {
			this.channelOpenId = channelOpenId;
		}

		public String getOrderPayment() {
			return this.orderPayment;
		}

		public void setOrderPayment(String orderPayment) {
			this.orderPayment = orderPayment;
		}

		public List<SubOrderModelListItem> getSubOrderModelList() {
			return this.subOrderModelList;
		}

		public void setSubOrderModelList(List<SubOrderModelListItem> subOrderModelList) {
			this.subOrderModelList = subOrderModelList;
		}

		public String getOrderCreateTime() {
			return this.orderCreateTime;
		}

		public void setOrderCreateTime(String orderCreateTime) {
			this.orderCreateTime = orderCreateTime;
		}

		public String getPlatformType() {
			return this.platformType;
		}

		public void setPlatformType(String platformType) {
			this.platformType = platformType;
		}

		public String getShopId() {
			return this.shopId;
		}

		public void setShopId(String shopId) {
			this.shopId = shopId;
		}

		public String getChannelCode() {
			return this.channelCode;
		}

		public void setChannelCode(String channelCode) {
			this.channelCode = channelCode;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public static class SubOrderModelListItem {

			@SerializedName("Feature")
			private String feature;

			@SerializedName("TotalFee")
			private String totalFee;

			@SerializedName("ProductAmount")
			private String productAmount;

			@SerializedName("OrderPayment")
			private String orderPayment;

			@SerializedName("PlatformType")
			private String platformType;

			@SerializedName("OpenSubOrderId")
			private String openSubOrderId;

			@SerializedName("Status")
			private String status;

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

			public String getPlatformType() {
				return this.platformType;
			}

			public void setPlatformType(String platformType) {
				this.platformType = platformType;
			}

			public String getOpenSubOrderId() {
				return this.openSubOrderId;
			}

			public void setOpenSubOrderId(String openSubOrderId) {
				this.openSubOrderId = openSubOrderId;
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
