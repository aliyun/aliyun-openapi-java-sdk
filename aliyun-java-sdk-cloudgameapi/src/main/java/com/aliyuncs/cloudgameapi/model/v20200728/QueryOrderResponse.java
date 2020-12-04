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

package com.aliyuncs.cloudgameapi.model.v20200728;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudgameapi.transform.v20200728.QueryOrderResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryOrderResponse extends AcsResponse {

	private String requestId;

	private String deliveryStatus;

	private String refundStatus;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDeliveryStatus() {
		return this.deliveryStatus;
	}

	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public String getRefundStatus() {
		return this.refundStatus;
	}

	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String orderId;

		private String itemId;

		private String skuId;

		private Long createTime;

		private Long applyDeliveryTime;

		private Long finishTime;

		private Long originPrice;

		private Long settlementPrice;

		private Long amount;

		private String status;

		private String buyerAccountId;

		private Long autoUnlockTime;

		private String accountDomain;

		public String getOrderId() {
			return this.orderId;
		}

		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}

		public String getItemId() {
			return this.itemId;
		}

		public void setItemId(String itemId) {
			this.itemId = itemId;
		}

		public String getSkuId() {
			return this.skuId;
		}

		public void setSkuId(String skuId) {
			this.skuId = skuId;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getApplyDeliveryTime() {
			return this.applyDeliveryTime;
		}

		public void setApplyDeliveryTime(Long applyDeliveryTime) {
			this.applyDeliveryTime = applyDeliveryTime;
		}

		public Long getFinishTime() {
			return this.finishTime;
		}

		public void setFinishTime(Long finishTime) {
			this.finishTime = finishTime;
		}

		public Long getOriginPrice() {
			return this.originPrice;
		}

		public void setOriginPrice(Long originPrice) {
			this.originPrice = originPrice;
		}

		public Long getSettlementPrice() {
			return this.settlementPrice;
		}

		public void setSettlementPrice(Long settlementPrice) {
			this.settlementPrice = settlementPrice;
		}

		public Long getAmount() {
			return this.amount;
		}

		public void setAmount(Long amount) {
			this.amount = amount;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getBuyerAccountId() {
			return this.buyerAccountId;
		}

		public void setBuyerAccountId(String buyerAccountId) {
			this.buyerAccountId = buyerAccountId;
		}

		public Long getAutoUnlockTime() {
			return this.autoUnlockTime;
		}

		public void setAutoUnlockTime(Long autoUnlockTime) {
			this.autoUnlockTime = autoUnlockTime;
		}

		public String getAccountDomain() {
			return this.accountDomain;
		}

		public void setAccountDomain(String accountDomain) {
			this.accountDomain = accountDomain;
		}
	}

	@Override
	public QueryOrderResponse getInstance(UnmarshallerContext context) {
		return	QueryOrderResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
