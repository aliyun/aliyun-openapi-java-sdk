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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeInstanceModificationPriceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceModificationPriceResponse extends AcsResponse {

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

		private PriceWarning priceWarning;

		private RelatedPrice relatedPrice;

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

		public PriceWarning getPriceWarning() {
			return this.priceWarning;
		}

		public void setPriceWarning(PriceWarning priceWarning) {
			this.priceWarning = priceWarning;
		}

		public RelatedPrice getRelatedPrice() {
			return this.relatedPrice;
		}

		public void setRelatedPrice(RelatedPrice relatedPrice) {
			this.relatedPrice = relatedPrice;
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

			private Float tradePrice;

			private List<Coupon> coupons;

			private List<DetailInfo> detailInfos;

			private List<Promotion> promotions;

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

			public String getCurrency() {
				return this.currency;
			}

			public void setCurrency(String currency) {
				this.currency = currency;
			}

			public Float getTradePrice() {
				return this.tradePrice;
			}

			public void setTradePrice(Float tradePrice) {
				this.tradePrice = tradePrice;
			}

			public List<Coupon> getCoupons() {
				return this.coupons;
			}

			public void setCoupons(List<Coupon> coupons) {
				this.coupons = coupons;
			}

			public List<DetailInfo> getDetailInfos() {
				return this.detailInfos;
			}

			public void setDetailInfos(List<DetailInfo> detailInfos) {
				this.detailInfos = detailInfos;
			}

			public List<Promotion> getPromotions() {
				return this.promotions;
			}

			public void setPromotions(List<Promotion> promotions) {
				this.promotions = promotions;
			}

			public List<String> getRuleIdSet() {
				return this.ruleIdSet;
			}

			public void setRuleIdSet(List<String> ruleIdSet) {
				this.ruleIdSet = ruleIdSet;
			}

			public static class Coupon {

				private Boolean isSelected;

				private String couponNo;

				private String description;

				private String name;

				private Float discountOff;

				private String optionCode;

				private Boolean effective;

				private List<Long> ruleIds;

				private AdditionalInfo additionalInfo;

				public Boolean getIsSelected() {
					return this.isSelected;
				}

				public void setIsSelected(Boolean isSelected) {
					this.isSelected = isSelected;
				}

				public String getCouponNo() {
					return this.couponNo;
				}

				public void setCouponNo(String couponNo) {
					this.couponNo = couponNo;
				}

				public String getDescription() {
					return this.description;
				}

				public void setDescription(String description) {
					this.description = description;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public Float getDiscountOff() {
					return this.discountOff;
				}

				public void setDiscountOff(Float discountOff) {
					this.discountOff = discountOff;
				}

				public String getOptionCode() {
					return this.optionCode;
				}

				public void setOptionCode(String optionCode) {
					this.optionCode = optionCode;
				}

				public Boolean getEffective() {
					return this.effective;
				}

				public void setEffective(Boolean effective) {
					this.effective = effective;
				}

				public List<Long> getRuleIds() {
					return this.ruleIds;
				}

				public void setRuleIds(List<Long> ruleIds) {
					this.ruleIds = ruleIds;
				}

				public AdditionalInfo getAdditionalInfo() {
					return this.additionalInfo;
				}

				public void setAdditionalInfo(AdditionalInfo additionalInfo) {
					this.additionalInfo = additionalInfo;
				}

				public static class AdditionalInfo {

					private String couponType;

					private Double availableAmount;

					private Double upperLimitAmount;

					private String startTime;

					private String endTime;

					private String ineffectiveReason;

					private Double discountRate;

					private Double certainAmount;

					private Double voucherTotalAmount;

					public String getCouponType() {
						return this.couponType;
					}

					public void setCouponType(String couponType) {
						this.couponType = couponType;
					}

					public Double getAvailableAmount() {
						return this.availableAmount;
					}

					public void setAvailableAmount(Double availableAmount) {
						this.availableAmount = availableAmount;
					}

					public Double getUpperLimitAmount() {
						return this.upperLimitAmount;
					}

					public void setUpperLimitAmount(Double upperLimitAmount) {
						this.upperLimitAmount = upperLimitAmount;
					}

					public String getStartTime() {
						return this.startTime;
					}

					public void setStartTime(String startTime) {
						this.startTime = startTime;
					}

					public String getEndTime() {
						return this.endTime;
					}

					public void setEndTime(String endTime) {
						this.endTime = endTime;
					}

					public String getIneffectiveReason() {
						return this.ineffectiveReason;
					}

					public void setIneffectiveReason(String ineffectiveReason) {
						this.ineffectiveReason = ineffectiveReason;
					}

					public Double getDiscountRate() {
						return this.discountRate;
					}

					public void setDiscountRate(Double discountRate) {
						this.discountRate = discountRate;
					}

					public Double getCertainAmount() {
						return this.certainAmount;
					}

					public void setCertainAmount(Double certainAmount) {
						this.certainAmount = certainAmount;
					}

					public Double getVoucherTotalAmount() {
						return this.voucherTotalAmount;
					}

					public void setVoucherTotalAmount(Double voucherTotalAmount) {
						this.voucherTotalAmount = voucherTotalAmount;
					}
				}
			}

			public static class DetailInfo {

				private String resource;

				private Float originalPrice;

				private Float discountPrice;

				private Float tradePrice;

				private List<Rule1> subRules;

				private List<Attribute> attributes;

				public String getResource() {
					return this.resource;
				}

				public void setResource(String resource) {
					this.resource = resource;
				}

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

				public List<Rule1> getSubRules() {
					return this.subRules;
				}

				public void setSubRules(List<Rule1> subRules) {
					this.subRules = subRules;
				}

				public List<Attribute> getAttributes() {
					return this.attributes;
				}

				public void setAttributes(List<Attribute> attributes) {
					this.attributes = attributes;
				}

				public static class Rule1 {

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

				public static class Attribute {

					private String code;

					private String value;

					public String getCode() {
						return this.code;
					}

					public void setCode(String code) {
						this.code = code;
					}

					public String getValue() {
						return this.value;
					}

					public void setValue(String value) {
						this.value = value;
					}
				}
			}

			public static class Promotion {

				private String name;

				private Float discountOff;

				private String type;

				private Float remainQuota;

				private List<Long> ruleIds2;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public Float getDiscountOff() {
					return this.discountOff;
				}

				public void setDiscountOff(Float discountOff) {
					this.discountOff = discountOff;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public Float getRemainQuota() {
					return this.remainQuota;
				}

				public void setRemainQuota(Float remainQuota) {
					this.remainQuota = remainQuota;
				}

				public List<Long> getRuleIds2() {
					return this.ruleIds2;
				}

				public void setRuleIds2(List<Long> ruleIds2) {
					this.ruleIds2 = ruleIds2;
				}
			}
		}

		public static class PriceWarning {

			private String msg;

			private String code;

			public String getMsg() {
				return this.msg;
			}

			public void setMsg(String msg) {
				this.msg = msg;
			}

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}
		}

		public static class RelatedPrice {

			private MarketplaceImagePrice marketplaceImagePrice;

			public MarketplaceImagePrice getMarketplaceImagePrice() {
				return this.marketplaceImagePrice;
			}

			public void setMarketplaceImagePrice(MarketplaceImagePrice marketplaceImagePrice) {
				this.marketplaceImagePrice = marketplaceImagePrice;
			}

			public static class MarketplaceImagePrice {

				private String currency;

				private Float originalPrice;

				private Float discountPrice;

				private Float tradePrice;

				private List<Promotion5> promotions3;

				private List<Coupon6> coupons4;

				public String getCurrency() {
					return this.currency;
				}

				public void setCurrency(String currency) {
					this.currency = currency;
				}

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

				public List<Promotion5> getPromotions3() {
					return this.promotions3;
				}

				public void setPromotions3(List<Promotion5> promotions3) {
					this.promotions3 = promotions3;
				}

				public List<Coupon6> getCoupons4() {
					return this.coupons4;
				}

				public void setCoupons4(List<Coupon6> coupons4) {
					this.coupons4 = coupons4;
				}

				public static class Promotion5 {

					private Long ruleId;

					private String name;

					private Float discountOff;

					private String type;

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

					public Float getDiscountOff() {
						return this.discountOff;
					}

					public void setDiscountOff(Float discountOff) {
						this.discountOff = discountOff;
					}

					public String getType() {
						return this.type;
					}

					public void setType(String type) {
						this.type = type;
					}
				}

				public static class Coupon6 {

					private String couponNo;

					private Float discountOff;

					private String description;

					private Boolean isSelected;

					private String optionCode;

					private String name;

					private Boolean effective;

					private List<Long> ruleIds7;

					private AdditionalInfo8 additionalInfo8;

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

					public Boolean getEffective() {
						return this.effective;
					}

					public void setEffective(Boolean effective) {
						this.effective = effective;
					}

					public List<Long> getRuleIds7() {
						return this.ruleIds7;
					}

					public void setRuleIds7(List<Long> ruleIds7) {
						this.ruleIds7 = ruleIds7;
					}

					public AdditionalInfo8 getAdditionalInfo8() {
						return this.additionalInfo8;
					}

					public void setAdditionalInfo8(AdditionalInfo8 additionalInfo8) {
						this.additionalInfo8 = additionalInfo8;
					}

					public static class AdditionalInfo8 {

						private String couponType;

						private Double availableAmount;

						private Double upperLimitAmount;

						private String startTime;

						private String endTime;

						private String ineffectiveReason;

						private Double discountRate;

						private Double certainAmount;

						private Double voucherTotalAmount;

						public String getCouponType() {
							return this.couponType;
						}

						public void setCouponType(String couponType) {
							this.couponType = couponType;
						}

						public Double getAvailableAmount() {
							return this.availableAmount;
						}

						public void setAvailableAmount(Double availableAmount) {
							this.availableAmount = availableAmount;
						}

						public Double getUpperLimitAmount() {
							return this.upperLimitAmount;
						}

						public void setUpperLimitAmount(Double upperLimitAmount) {
							this.upperLimitAmount = upperLimitAmount;
						}

						public String getStartTime() {
							return this.startTime;
						}

						public void setStartTime(String startTime) {
							this.startTime = startTime;
						}

						public String getEndTime() {
							return this.endTime;
						}

						public void setEndTime(String endTime) {
							this.endTime = endTime;
						}

						public String getIneffectiveReason() {
							return this.ineffectiveReason;
						}

						public void setIneffectiveReason(String ineffectiveReason) {
							this.ineffectiveReason = ineffectiveReason;
						}

						public Double getDiscountRate() {
							return this.discountRate;
						}

						public void setDiscountRate(Double discountRate) {
							this.discountRate = discountRate;
						}

						public Double getCertainAmount() {
							return this.certainAmount;
						}

						public void setCertainAmount(Double certainAmount) {
							this.certainAmount = certainAmount;
						}

						public Double getVoucherTotalAmount() {
							return this.voucherTotalAmount;
						}

						public void setVoucherTotalAmount(Double voucherTotalAmount) {
							this.voucherTotalAmount = voucherTotalAmount;
						}
					}
				}
			}
		}
	}

	@Override
	public DescribeInstanceModificationPriceResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceModificationPriceResponseUnmarshaller.unmarshall(this, context);
	}
}
