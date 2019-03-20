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

package com.aliyuncs.bss.model.v20140714;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.bss.transform.v20140714.DescribeCouponListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCouponListResponse extends AcsResponse {

	private String requestId;

	private List<Coupon> coupons;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Coupon> getCoupons() {
		return this.coupons;
	}

	public void setCoupons(List<Coupon> coupons) {
		this.coupons = coupons;
	}

	public static class Coupon {

		private Long couponTemplateId;

		private String totalAmount;

		private String balanceAmount;

		private String frozenAmount;

		private String expiredAmount;

		private String deliveryTime;

		private String expiredTime;

		private String couponNumber;

		private String status;

		private String description;

		private String creationTime;

		private String modificationTime;

		private String priceLimit;

		private String application;

		private List<String> productCodes;

		private List<String> tradeTypes;

		public Long getCouponTemplateId() {
			return this.couponTemplateId;
		}

		public void setCouponTemplateId(Long couponTemplateId) {
			this.couponTemplateId = couponTemplateId;
		}

		public String getTotalAmount() {
			return this.totalAmount;
		}

		public void setTotalAmount(String totalAmount) {
			this.totalAmount = totalAmount;
		}

		public String getBalanceAmount() {
			return this.balanceAmount;
		}

		public void setBalanceAmount(String balanceAmount) {
			this.balanceAmount = balanceAmount;
		}

		public String getFrozenAmount() {
			return this.frozenAmount;
		}

		public void setFrozenAmount(String frozenAmount) {
			this.frozenAmount = frozenAmount;
		}

		public String getExpiredAmount() {
			return this.expiredAmount;
		}

		public void setExpiredAmount(String expiredAmount) {
			this.expiredAmount = expiredAmount;
		}

		public String getDeliveryTime() {
			return this.deliveryTime;
		}

		public void setDeliveryTime(String deliveryTime) {
			this.deliveryTime = deliveryTime;
		}

		public String getExpiredTime() {
			return this.expiredTime;
		}

		public void setExpiredTime(String expiredTime) {
			this.expiredTime = expiredTime;
		}

		public String getCouponNumber() {
			return this.couponNumber;
		}

		public void setCouponNumber(String couponNumber) {
			this.couponNumber = couponNumber;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getModificationTime() {
			return this.modificationTime;
		}

		public void setModificationTime(String modificationTime) {
			this.modificationTime = modificationTime;
		}

		public String getPriceLimit() {
			return this.priceLimit;
		}

		public void setPriceLimit(String priceLimit) {
			this.priceLimit = priceLimit;
		}

		public String getApplication() {
			return this.application;
		}

		public void setApplication(String application) {
			this.application = application;
		}

		public List<String> getProductCodes() {
			return this.productCodes;
		}

		public void setProductCodes(List<String> productCodes) {
			this.productCodes = productCodes;
		}

		public List<String> getTradeTypes() {
			return this.tradeTypes;
		}

		public void setTradeTypes(List<String> tradeTypes) {
			this.tradeTypes = tradeTypes;
		}
	}

	@Override
	public DescribeCouponListResponse getInstance(UnmarshallerContext context) {
		return	DescribeCouponListResponseUnmarshaller.unmarshall(this, context);
	}
}
