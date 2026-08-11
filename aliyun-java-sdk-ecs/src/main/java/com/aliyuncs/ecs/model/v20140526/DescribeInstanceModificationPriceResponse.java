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

		private RelatedPrice relatedPrice;

		private Price price;

		private PriceWarning priceWarning;

		public List<Rule> getRules() {
			return this.rules;
		}

		public void setRules(List<Rule> rules) {
			this.rules = rules;
		}

		public RelatedPrice getRelatedPrice() {
			return this.relatedPrice;
		}

		public void setRelatedPrice(RelatedPrice relatedPrice) {
			this.relatedPrice = relatedPrice;
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

		public static class RelatedPrice {

			private MarketplaceImagePrice marketplaceImagePrice;

			public MarketplaceImagePrice getMarketplaceImagePrice() {
				return this.marketplaceImagePrice;
			}

			public void setMarketplaceImagePrice(MarketplaceImagePrice marketplaceImagePrice) {
				this.marketplaceImagePrice = marketplaceImagePrice;
			}

			public static class MarketplaceImagePrice {

				private Float originalPrice;

				private String currency;

				private Float discountPrice;

				private Float tradePrice;

				private List<Promotion> promotions;

				private List<Coupon> coupons;

				public Float getOriginalPrice() {
					return this.originalPrice;
				}

				public void setOriginalPrice(Float originalPrice) {
					this.originalPrice = originalPrice;
				}

				public String getCurrency() {
					return this.currency;
				}

				public void setCurrency(String currency) {
					this.currency = currency;
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

				public List<Promotion> getPromotions() {
					return this.promotions;
				}

				public void setPromotions(List<Promotion> promotions) {
					this.promotions = promotions;
				}

				public List<Coupon> getCoupons() {
					return this.coupons;
				}

				public void setCoupons(List<Coupon> coupons) {
					this.coupons = coupons;
				}

				public static class Promotion {

					private Float discountOff;

					private String type;

					private Long ruleId;

					private String name;

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

				public static class Coupon {

					private String couponNo;

					private Float discountOff;

					private String description;

					private Boolean isSelected;

					private String optionCode;

					private String name;

					private Boolean effective;

					private List<Long> ruleIds;

					private AdditionalInfo additionalInfo;

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

						private Double voucherTotalAmount;

						private String endTime;

						private Double upperLimitAmount;

						private String couponType;

						private String startTime;

						private Double availableAmount;

						private String ineffectiveReason;

						private Double discountRate;

						private Double certainAmount;

						public Double getVoucherTotalAmount() {
							return this.voucherTotalAmount;
						}

						public void setVoucherTotalAmount(Double voucherTotalAmount) {
							this.voucherTotalAmount = voucherTotalAmount;
						}

						public String getEndTime() {
							return this.endTime;
						}

						public void setEndTime(String endTime) {
							this.endTime = endTime;
						}

						public Double getUpperLimitAmount() {
							return this.upperLimitAmount;
						}

						public void setUpperLimitAmount(Double upperLimitAmount) {
							this.upperLimitAmount = upperLimitAmount;
						}

						public String getCouponType() {
							return this.couponType;
						}

						public void setCouponType(String couponType) {
							this.couponType = couponType;
						}

						public String getStartTime() {
							return this.startTime;
						}

						public void setStartTime(String startTime) {
							this.startTime = startTime;
						}

						public Double getAvailableAmount() {
							return this.availableAmount;
						}

						public void setAvailableAmount(Double availableAmount) {
							this.availableAmount = availableAmount;
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
					}
				}
			}
		}

		public static class Price {

			private Float originalPrice;

			private Float discountPrice;

			private String currency;

			private Float tradePrice;

			private List<Promotion3> promotions1;

			private List<DetailInfo> detailInfos;

			private List<Coupon6> coupons2;

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

			public List<Promotion3> getPromotions1() {
				return this.promotions1;
			}

			public void setPromotions1(List<Promotion3> promotions1) {
				this.promotions1 = promotions1;
			}

			public List<DetailInfo> getDetailInfos() {
				return this.detailInfos;
			}

			public void setDetailInfos(List<DetailInfo> detailInfos) {
				this.detailInfos = detailInfos;
			}

			public List<Coupon6> getCoupons2() {
				return this.coupons2;
			}

			public void setCoupons2(List<Coupon6> coupons2) {
				this.coupons2 = coupons2;
			}

			public List<String> getRuleIdSet() {
				return this.ruleIdSet;
			}

			public void setRuleIdSet(List<String> ruleIdSet) {
				this.ruleIdSet = ruleIdSet;
			}

			public static class Promotion3 {

				private Float discountOff;

				private String type;

				private Float remainQuota;

				private String name;

				private List<Long> ruleIds4;

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

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public List<Long> getRuleIds4() {
					return this.ruleIds4;
				}

				public void setRuleIds4(List<Long> ruleIds4) {
					this.ruleIds4 = ruleIds4;
				}
			}

			public static class DetailInfo {

				private Float originalPrice;

				private Float discountPrice;

				private String resource;

				private Float tradePrice;

				private List<Rule5> subRules;

				private List<Attribute> attributes;

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

				public String getResource() {
					return this.resource;
				}

				public void setResource(String resource) {
					this.resource = resource;
				}

				public Float getTradePrice() {
					return this.tradePrice;
				}

				public void setTradePrice(Float tradePrice) {
					this.tradePrice = tradePrice;
				}

				public List<Rule5> getSubRules() {
					return this.subRules;
				}

				public void setSubRules(List<Rule5> subRules) {
					this.subRules = subRules;
				}

				public List<Attribute> getAttributes() {
					return this.attributes;
				}

				public void setAttributes(List<Attribute> attributes) {
					this.attributes = attributes;
				}

				public static class Rule5 {

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

					private String value;

					private String code;

					public String getValue() {
						return this.value;
					}

					public void setValue(String value) {
						this.value = value;
					}

					public String getCode() {
						return this.code;
					}

					public void setCode(String code) {
						this.code = code;
					}
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

					private Double voucherTotalAmount;

					private String endTime;

					private Double upperLimitAmount;

					private String couponType;

					private String startTime;

					private Double availableAmount;

					private String ineffectiveReason;

					private Double discountRate;

					private Double certainAmount;

					public Double getVoucherTotalAmount() {
						return this.voucherTotalAmount;
					}

					public void setVoucherTotalAmount(Double voucherTotalAmount) {
						this.voucherTotalAmount = voucherTotalAmount;
					}

					public String getEndTime() {
						return this.endTime;
					}

					public void setEndTime(String endTime) {
						this.endTime = endTime;
					}

					public Double getUpperLimitAmount() {
						return this.upperLimitAmount;
					}

					public void setUpperLimitAmount(Double upperLimitAmount) {
						this.upperLimitAmount = upperLimitAmount;
					}

					public String getCouponType() {
						return this.couponType;
					}

					public void setCouponType(String couponType) {
						this.couponType = couponType;
					}

					public String getStartTime() {
						return this.startTime;
					}

					public void setStartTime(String startTime) {
						this.startTime = startTime;
					}

					public Double getAvailableAmount() {
						return this.availableAmount;
					}

					public void setAvailableAmount(Double availableAmount) {
						this.availableAmount = availableAmount;
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
	}

	@Override
	public DescribeInstanceModificationPriceResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceModificationPriceResponseUnmarshaller.unmarshall(this, context);
	}
}
