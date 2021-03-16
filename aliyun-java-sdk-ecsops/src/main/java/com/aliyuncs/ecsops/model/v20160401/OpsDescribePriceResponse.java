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
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribePriceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribePriceResponse extends AcsResponse {

	private String requestId;

	private PriceInfo priceInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public PriceInfo getPriceInfo() {
		return this.priceInfo;
	}

	public void setPriceInfo(PriceInfo priceInfo) {
		this.priceInfo = priceInfo;
	}

	public static class PriceInfo {

		private List<Rule> rules;

		private List<String> orderParams;

		private Order order;

		private PriceWarning priceWarning;

		public List<Rule> getRules() {
			return this.rules;
		}

		public void setRules(List<Rule> rules) {
			this.rules = rules;
		}

		public List<String> getOrderParams() {
			return this.orderParams;
		}

		public void setOrderParams(List<String> orderParams) {
			this.orderParams = orderParams;
		}

		public Order getOrder() {
			return this.order;
		}

		public void setOrder(Order order) {
			this.order = order;
		}

		public PriceWarning getPriceWarning() {
			return this.priceWarning;
		}

		public void setPriceWarning(PriceWarning priceWarning) {
			this.priceWarning = priceWarning;
		}

		public static class Rule {

			private Long ruleId;

			private String title;

			private String name;

			public Long getRuleId() {
				return this.ruleId;
			}

			public void setRuleId(Long ruleId) {
				this.ruleId = ruleId;
			}

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}

		public static class Order {

			private Float originalPrice;

			private Float discountPrice;

			private Float spotInstanceTypePrice;

			private Float spotInstanceTypeOriginalPrice;

			private Float tradePrice;

			private String currency;

			private List<Coupon> coupons;

			private List<String> ruleIdSet;

			public Float getOriginalPrice() {
				return this.originalPrice;
			}

			public void setOriginalPrice(Float originalPrice) {
				this.originalPrice = originalPrice;
			}

			public Float getDiscountPrice() {
				return this.discountPrice;
			}

			public void setDiscountPrice(Float discountPrice) {
				this.discountPrice = discountPrice;
			}

			public Float getSpotInstanceTypePrice() {
				return this.spotInstanceTypePrice;
			}

			public void setSpotInstanceTypePrice(Float spotInstanceTypePrice) {
				this.spotInstanceTypePrice = spotInstanceTypePrice;
			}

			public Float getSpotInstanceTypeOriginalPrice() {
				return this.spotInstanceTypeOriginalPrice;
			}

			public void setSpotInstanceTypeOriginalPrice(Float spotInstanceTypeOriginalPrice) {
				this.spotInstanceTypeOriginalPrice = spotInstanceTypeOriginalPrice;
			}

			public Float getTradePrice() {
				return this.tradePrice;
			}

			public void setTradePrice(Float tradePrice) {
				this.tradePrice = tradePrice;
			}

			public String getCurrency() {
				return this.currency;
			}

			public void setCurrency(String currency) {
				this.currency = currency;
			}

			public List<Coupon> getCoupons() {
				return this.coupons;
			}

			public void setCoupons(List<Coupon> coupons) {
				this.coupons = coupons;
			}

			public List<String> getRuleIdSet() {
				return this.ruleIdSet;
			}

			public void setRuleIdSet(List<String> ruleIdSet) {
				this.ruleIdSet = ruleIdSet;
			}

			public static class Coupon {

				private String couponNo;

				private String name;

				private String description;

				private Float discountOff;

				private Boolean isSelected;

				public String getCouponNo() {
					return this.couponNo;
				}

				public void setCouponNo(String couponNo) {
					this.couponNo = couponNo;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getDescription() {
					return this.description;
				}

				public void setDescription(String description) {
					this.description = description;
				}

				public Float getDiscountOff() {
					return this.discountOff;
				}

				public void setDiscountOff(Float discountOff) {
					this.discountOff = discountOff;
				}

				public Boolean getIsSelected() {
					return this.isSelected;
				}

				public void setIsSelected(Boolean isSelected) {
					this.isSelected = isSelected;
				}
			}
		}

		public static class PriceWarning {

			private String code;

			private String msg;

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}

			public String getMsg() {
				return this.msg;
			}

			public void setMsg(String msg) {
				this.msg = msg;
			}
		}
	}

	@Override
	public OpsDescribePriceResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribePriceResponseUnmarshaller.unmarshall(this, context);
	}
}
