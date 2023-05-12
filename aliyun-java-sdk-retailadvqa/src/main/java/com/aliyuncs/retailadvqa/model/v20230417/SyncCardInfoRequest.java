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
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SyncCardInfoRequest extends RpcAcsRequest<SyncCardInfoResponse> {
	   

	@SerializedName("body")
	private Body body;
	public SyncCardInfoRequest() {
		super("retailadvqa", "2023-04-17", "SyncCardInfo");
		setMethod(MethodType.POST);
	}

	public Body getBody() {
		return this.body;
	}

	public void setBody(Body body) {
		this.body = body;	
		if (body != null) {
			putQueryParameter("body" , new Gson().toJson(body));
		}	
	}

	public static class Body {

		@SerializedName("OccurredAt")
		private String occurredAt;

		@SerializedName("OpenMerchantId")
		private String openMerchantId;

		@SerializedName("TransferredAt")
		private String transferredAt;

		@SerializedName("OrderId")
		private String orderId;

		@SerializedName("PresentDetail")
		private PresentDetail presentDetail;

		@SerializedName("TransferId")
		private String transferId;

		@SerializedName("BuyerId")
		private String buyerId;

		@SerializedName("ReceivedAt")
		private String receivedAt;

		@SerializedName("Gifters")
		private Gifters gifters;

		@SerializedName("Extra")
		private String extra;

		@SerializedName("Recipient")
		private Recipient recipient;

		@SerializedName("Theme")
		private String theme;

		@SerializedName("Status")
		private String status;

		public String getOccurredAt() {
			return this.occurredAt;
		}

		public void setOccurredAt(String occurredAt) {
			this.occurredAt = occurredAt;
		}

		public String getOpenMerchantId() {
			return this.openMerchantId;
		}

		public void setOpenMerchantId(String openMerchantId) {
			this.openMerchantId = openMerchantId;
		}

		public String getTransferredAt() {
			return this.transferredAt;
		}

		public void setTransferredAt(String transferredAt) {
			this.transferredAt = transferredAt;
		}

		public String getOrderId() {
			return this.orderId;
		}

		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}

		public PresentDetail getPresentDetail() {
			return this.presentDetail;
		}

		public void setPresentDetail(PresentDetail presentDetail) {
			this.presentDetail = presentDetail;
		}

		public String getTransferId() {
			return this.transferId;
		}

		public void setTransferId(String transferId) {
			this.transferId = transferId;
		}

		public String getBuyerId() {
			return this.buyerId;
		}

		public void setBuyerId(String buyerId) {
			this.buyerId = buyerId;
		}

		public String getReceivedAt() {
			return this.receivedAt;
		}

		public void setReceivedAt(String receivedAt) {
			this.receivedAt = receivedAt;
		}

		public Gifters getGifters() {
			return this.gifters;
		}

		public void setGifters(Gifters gifters) {
			this.gifters = gifters;
		}

		public String getExtra() {
			return this.extra;
		}

		public void setExtra(String extra) {
			this.extra = extra;
		}

		public Recipient getRecipient() {
			return this.recipient;
		}

		public void setRecipient(Recipient recipient) {
			this.recipient = recipient;
		}

		public String getTheme() {
			return this.theme;
		}

		public void setTheme(String theme) {
			this.theme = theme;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public static class PresentDetail {

			@SerializedName("ItemId")
			private String itemId;

			@SerializedName("Price")
			private Double price;

			@SerializedName("Name")
			private String name;

			@SerializedName("Count")
			private Long count;

			@SerializedName("SkuId")
			private String skuId;

			public String getItemId() {
				return this.itemId;
			}

			public void setItemId(String itemId) {
				this.itemId = itemId;
			}

			public Double getPrice() {
				return this.price;
			}

			public void setPrice(Double price) {
				this.price = price;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Long getCount() {
				return this.count;
			}

			public void setCount(Long count) {
				this.count = count;
			}

			public String getSkuId() {
				return this.skuId;
			}

			public void setSkuId(String skuId) {
				this.skuId = skuId;
			}
		}

		public static class Gifters {

			@SerializedName("Phone")
			private String phone;

			@SerializedName("OpenId")
			private String openId;

			@SerializedName("Nickname")
			private String nickname;

			@SerializedName("Id")
			private String id;

			@SerializedName("HeaderImg")
			private String headerImg;

			public String getPhone() {
				return this.phone;
			}

			public void setPhone(String phone) {
				this.phone = phone;
			}

			public String getOpenId() {
				return this.openId;
			}

			public void setOpenId(String openId) {
				this.openId = openId;
			}

			public String getNickname() {
				return this.nickname;
			}

			public void setNickname(String nickname) {
				this.nickname = nickname;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getHeaderImg() {
				return this.headerImg;
			}

			public void setHeaderImg(String headerImg) {
				this.headerImg = headerImg;
			}
		}

		public static class Recipient {

			@SerializedName("Phone")
			private String phone;

			@SerializedName("OpenId")
			private String openId;

			@SerializedName("Nickname")
			private String nickname;

			@SerializedName("Id")
			private String id;

			@SerializedName("HeaderImg")
			private String headerImg;

			public String getPhone() {
				return this.phone;
			}

			public void setPhone(String phone) {
				this.phone = phone;
			}

			public String getOpenId() {
				return this.openId;
			}

			public void setOpenId(String openId) {
				this.openId = openId;
			}

			public String getNickname() {
				return this.nickname;
			}

			public void setNickname(String nickname) {
				this.nickname = nickname;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getHeaderImg() {
				return this.headerImg;
			}

			public void setHeaderImg(String headerImg) {
				this.headerImg = headerImg;
			}
		}
	}

	@Override
	public Class<SyncCardInfoResponse> getResponseClass() {
		return SyncCardInfoResponse.class;
	}

}
