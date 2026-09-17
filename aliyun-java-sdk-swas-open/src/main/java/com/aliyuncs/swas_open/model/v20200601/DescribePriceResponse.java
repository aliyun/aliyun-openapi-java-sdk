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

package com.aliyuncs.swas_open.model.v20200601;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.swas_open.transform.v20200601.DescribePriceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePriceResponse extends AcsResponse {

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

		private Price price;

		public List<Rule> getRules() {
			return this.rules;
		}

		public void setRules(List<Rule> rules) {
			this.rules = rules;
		}

		public Price getPrice() {
			return this.price;
		}

		public void setPrice(Price price) {
			this.price = price;
		}

		public static class Rule {

			private String description;

			private Long ruleId;

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public Long getRuleId() {
				return this.ruleId;
			}

			public void setRuleId(Long ruleId) {
				this.ruleId = ruleId;
			}
		}

		public static class Price {

			private Float originalPrice;

			private Float discountPrice;

			private String currency;

			private Float standardPrice;

			private Float standardDiscountPrice;

			private Float tradePrice;

			private Boolean isContractPromotion;

			private List<Promotion> promotions;

			private List<DetailInfo> detailInfos;

			private List<Coupon> coupons;

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

			public String getCurrency() {
				return this.currency;
			}

			public void setCurrency(String currency) {
				this.currency = currency;
			}

			public Float getStandardPrice() {
				return this.standardPrice;
			}

			public void setStandardPrice(Float standardPrice) {
				this.standardPrice = standardPrice;
			}

			public Float getStandardDiscountPrice() {
				return this.standardDiscountPrice;
			}

			public void setStandardDiscountPrice(Float standardDiscountPrice) {
				this.standardDiscountPrice = standardDiscountPrice;
			}

			public Float getTradePrice() {
				return this.tradePrice;
			}

			public void setTradePrice(Float tradePrice) {
				this.tradePrice = tradePrice;
			}

			public Boolean getIsContractPromotion() {
				return this.isContractPromotion;
			}

			public void setIsContractPromotion(Boolean isContractPromotion) {
				this.isContractPromotion = isContractPromotion;
			}

			public List<Promotion> getPromotions() {
				return this.promotions;
			}

			public void setPromotions(List<Promotion> promotions) {
				this.promotions = promotions;
			}

			public List<DetailInfo> getDetailInfos() {
				return this.detailInfos;
			}

			public void setDetailInfos(List<DetailInfo> detailInfos) {
				this.detailInfos = detailInfos;
			}

			public List<Coupon> getCoupons() {
				return this.coupons;
			}

			public void setCoupons(List<Coupon> coupons) {
				this.coupons = coupons;
			}

			public static class Promotion {

				private Float discountOff;

				private String name;

				private List<Long> ruleIds;

				public Float getDiscountOff() {
					return this.discountOff;
				}

				public void setDiscountOff(Float discountOff) {
					this.discountOff = discountOff;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public List<Long> getRuleIds() {
					return this.ruleIds;
				}

				public void setRuleIds(List<Long> ruleIds) {
					this.ruleIds = ruleIds;
				}
			}

			public static class DetailInfo {

				private Float originalPrice;

				private Float discountPrice;

				private Float tradePrice;

				private String commodityType;

				private List<PromotionsItem> promotions1;

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

				public Float getTradePrice() {
					return this.tradePrice;
				}

				public void setTradePrice(Float tradePrice) {
					this.tradePrice = tradePrice;
				}

				public String getCommodityType() {
					return this.commodityType;
				}

				public void setCommodityType(String commodityType) {
					this.commodityType = commodityType;
				}

				public List<PromotionsItem> getPromotions1() {
					return this.promotions1;
				}

				public void setPromotions1(List<PromotionsItem> promotions1) {
					this.promotions1 = promotions1;
				}

				public static class PromotionsItem {

					private Float discountOff;

					private Long ruleId;

					private String name;

					public Float getDiscountOff() {
						return this.discountOff;
					}

					public void setDiscountOff(Float discountOff) {
						this.discountOff = discountOff;
					}

					public Long getRuleId() {
						return this.ruleId;
					}

					public void setRuleId(Long ruleId) {
						this.ruleId = ruleId;
					}

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}
				}
			}

			public static class Coupon {

				private String couponNo;

				private Float discountOff;

				private String description;

				private Boolean isSelected;

				private String optionCode;

				private String name;

				public String getCouponNo() {
					return this.couponNo;
				}

				public void setCouponNo(String couponNo) {
					this.couponNo = couponNo;
				}

				public Float getDiscountOff() {
					return this.discountOff;
				}

				public void setDiscountOff(Float discountOff) {
					this.discountOff = discountOff;
				}

				public String getDescription() {
					return this.description;
				}

				public void setDescription(String description) {
					this.description = description;
				}

				public Boolean getIsSelected() {
					return this.isSelected;
				}

				public void setIsSelected(Boolean isSelected) {
					this.isSelected = isSelected;
				}

				public String getOptionCode() {
					return this.optionCode;
				}

				public void setOptionCode(String optionCode) {
					this.optionCode = optionCode;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}
			}
		}
	}

	@Override
	public DescribePriceResponse getInstance(UnmarshallerContext context) {
		return	DescribePriceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
