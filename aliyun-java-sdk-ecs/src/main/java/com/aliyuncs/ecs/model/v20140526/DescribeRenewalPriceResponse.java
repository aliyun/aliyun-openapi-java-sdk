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
import com.aliyuncs.ecs.transform.v20140526.DescribeRenewalPriceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRenewalPriceResponse extends AcsResponse {

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

				private List<SubPrice> subPrices;

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

				public List<SubPrice> getSubPrices() {
					return this.subPrices;
				}

				public void setSubPrices(List<SubPrice> subPrices) {
					this.subPrices = subPrices;
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

				public static class SubPrice {

					private Float originalPrice;

					private String instanceId;

					private Float discountPrice;

					private Float tradePrice;

					private List<Promotion2> promotions1;

					private List<String> ruleIdSet;

					public Float getOriginalPrice() {
						return this.originalPrice;
					}

					public void setOriginalPrice(Float originalPrice) {
						this.originalPrice = originalPrice;
					}

					public String getInstanceId() {
						return this.instanceId;
					}

					public void setInstanceId(String instanceId) {
						this.instanceId = instanceId;
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

					public List<Promotion2> getPromotions1() {
						return this.promotions1;
					}

					public void setPromotions1(List<Promotion2> promotions1) {
						this.promotions1 = promotions1;
					}

					public List<String> getRuleIdSet() {
						return this.ruleIdSet;
					}

					public void setRuleIdSet(List<String> ruleIdSet) {
						this.ruleIdSet = ruleIdSet;
					}

					public static class Promotion2 {

						private Float discountOff;

						private String type;

						private Float remainQuota;

						private String name;

						private List<Long> ruleIds3;

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

						public List<Long> getRuleIds3() {
							return this.ruleIds3;
						}

						public void setRuleIds3(List<Long> ruleIds3) {
							this.ruleIds3 = ruleIds3;
						}
					}
				}
			}
		}

		public static class Price {

			private Float originalPrice;

			private Float standardPrice;

			private Float standardDiscountPrice;

			private Float tradePrice;

			private Boolean isContractPromotion;

			private Float discountPrice;

			private String currency;

			private List<Promotion8> promotions5;

			private List<DetailInfo> detailInfos;

			private List<Coupon12> coupons6;

			private List<SubPrice15> subPrices7;

			private List<String> ruleIdSet4;

			private DepreciateInfo depreciateInfo;

			public Float getOriginalPrice() {
				return this.originalPrice;
			}

			public void setOriginalPrice(Float originalPrice) {
				this.originalPrice = originalPrice;
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

			public List<Promotion8> getPromotions5() {
				return this.promotions5;
			}

			public void setPromotions5(List<Promotion8> promotions5) {
				this.promotions5 = promotions5;
			}

			public List<DetailInfo> getDetailInfos() {
				return this.detailInfos;
			}

			public void setDetailInfos(List<DetailInfo> detailInfos) {
				this.detailInfos = detailInfos;
			}

			public List<Coupon12> getCoupons6() {
				return this.coupons6;
			}

			public void setCoupons6(List<Coupon12> coupons6) {
				this.coupons6 = coupons6;
			}

			public List<SubPrice15> getSubPrices7() {
				return this.subPrices7;
			}

			public void setSubPrices7(List<SubPrice15> subPrices7) {
				this.subPrices7 = subPrices7;
			}

			public List<String> getRuleIdSet4() {
				return this.ruleIdSet4;
			}

			public void setRuleIdSet4(List<String> ruleIdSet4) {
				this.ruleIdSet4 = ruleIdSet4;
			}

			public DepreciateInfo getDepreciateInfo() {
				return this.depreciateInfo;
			}

			public void setDepreciateInfo(DepreciateInfo depreciateInfo) {
				this.depreciateInfo = depreciateInfo;
			}

			public static class Promotion8 {

				private Float discountOff;

				private String type;

				private Float remainQuota;

				private String name;

				private List<Long> ruleIds9;

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

				public List<Long> getRuleIds9() {
					return this.ruleIds9;
				}

				public void setRuleIds9(List<Long> ruleIds9) {
					this.ruleIds9 = ruleIds9;
				}
			}

			public static class DetailInfo {

				private Float originalPrice;

				private Float discountPrice;

				private String resource;

				private Float standardPrice;

				private Float standardDiscountPrice;

				private Float tradePrice;

				private Boolean isContractPromotion;

				private List<Rule11> subRules;

				private List<Attribute> attributes;

				private DepreciateInfo10 depreciateInfo10;

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

				public List<Rule11> getSubRules() {
					return this.subRules;
				}

				public void setSubRules(List<Rule11> subRules) {
					this.subRules = subRules;
				}

				public List<Attribute> getAttributes() {
					return this.attributes;
				}

				public void setAttributes(List<Attribute> attributes) {
					this.attributes = attributes;
				}

				public DepreciateInfo10 getDepreciateInfo10() {
					return this.depreciateInfo10;
				}

				public void setDepreciateInfo10(DepreciateInfo10 depreciateInfo10) {
					this.depreciateInfo10 = depreciateInfo10;
				}

				public static class Rule11 {

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

				public static class DepreciateInfo10 {

					private Float cheapStandardPrice;

					private Float cheapRate;

					private String differentialName;

					private Float monthPrice;

					private Float originalStandardPrice;

					private Float differentialPrice;

					private String startTime;

					private Boolean isShow;

					private Float listPrice;

					public Float getCheapStandardPrice() {
						return this.cheapStandardPrice;
					}

					public void setCheapStandardPrice(Float cheapStandardPrice) {
						this.cheapStandardPrice = cheapStandardPrice;
					}

					public Float getCheapRate() {
						return this.cheapRate;
					}

					public void setCheapRate(Float cheapRate) {
						this.cheapRate = cheapRate;
					}

					public String getDifferentialName() {
						return this.differentialName;
					}

					public void setDifferentialName(String differentialName) {
						this.differentialName = differentialName;
					}

					public Float getMonthPrice() {
						return this.monthPrice;
					}

					public void setMonthPrice(Float monthPrice) {
						this.monthPrice = monthPrice;
					}

					public Float getOriginalStandardPrice() {
						return this.originalStandardPrice;
					}

					public void setOriginalStandardPrice(Float originalStandardPrice) {
						this.originalStandardPrice = originalStandardPrice;
					}

					public Float getDifferentialPrice() {
						return this.differentialPrice;
					}

					public void setDifferentialPrice(Float differentialPrice) {
						this.differentialPrice = differentialPrice;
					}

					public String getStartTime() {
						return this.startTime;
					}

					public void setStartTime(String startTime) {
						this.startTime = startTime;
					}

					public Boolean getIsShow() {
						return this.isShow;
					}

					public void setIsShow(Boolean isShow) {
						this.isShow = isShow;
					}

					public Float getListPrice() {
						return this.listPrice;
					}

					public void setListPrice(Float listPrice) {
						this.listPrice = listPrice;
					}
				}
			}

			public static class Coupon12 {

				private String couponNo;

				private Float discountOff;

				private String description;

				private Boolean isSelected;

				private String optionCode;

				private String name;

				private Boolean effective;

				private List<Long> ruleIds13;

				private AdditionalInfo14 additionalInfo14;

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

				public List<Long> getRuleIds13() {
					return this.ruleIds13;
				}

				public void setRuleIds13(List<Long> ruleIds13) {
					this.ruleIds13 = ruleIds13;
				}

				public AdditionalInfo14 getAdditionalInfo14() {
					return this.additionalInfo14;
				}

				public void setAdditionalInfo14(AdditionalInfo14 additionalInfo14) {
					this.additionalInfo14 = additionalInfo14;
				}

				public static class AdditionalInfo14 {

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

			public static class SubPrice15 {

				private Float originalPrice;

				private String instanceId;

				private Float discountPrice;

				private Float standardPrice;

				private Float standardDiscountPrice;

				private Float tradePrice;

				private Boolean isContractPromotion;

				private List<Promotion19> promotions18;

				private List<String> ruleIdSet16;

				private DepreciateInfo17 depreciateInfo17;

				public Float getOriginalPrice() {
					return this.originalPrice;
				}

				public void setOriginalPrice(Float originalPrice) {
					this.originalPrice = originalPrice;
				}

				public String getInstanceId() {
					return this.instanceId;
				}

				public void setInstanceId(String instanceId) {
					this.instanceId = instanceId;
				}

				public Float getDiscountPrice() {
					return this.discountPrice;
				}

				public void setDiscountPrice(Float discountPrice) {
					this.discountPrice = discountPrice;
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

				public List<Promotion19> getPromotions18() {
					return this.promotions18;
				}

				public void setPromotions18(List<Promotion19> promotions18) {
					this.promotions18 = promotions18;
				}

				public List<String> getRuleIdSet16() {
					return this.ruleIdSet16;
				}

				public void setRuleIdSet16(List<String> ruleIdSet16) {
					this.ruleIdSet16 = ruleIdSet16;
				}

				public DepreciateInfo17 getDepreciateInfo17() {
					return this.depreciateInfo17;
				}

				public void setDepreciateInfo17(DepreciateInfo17 depreciateInfo17) {
					this.depreciateInfo17 = depreciateInfo17;
				}

				public static class Promotion19 {

					private Float discountOff;

					private String type;

					private Float remainQuota;

					private String name;

					private List<Long> ruleIds20;

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

					public List<Long> getRuleIds20() {
						return this.ruleIds20;
					}

					public void setRuleIds20(List<Long> ruleIds20) {
						this.ruleIds20 = ruleIds20;
					}
				}

				public static class DepreciateInfo17 {

					private Float cheapStandardPrice;

					private Float cheapRate;

					private String differentialName;

					private Float monthPrice;

					private Float originalStandardPrice;

					private Float differentialPrice;

					private String startTime;

					private Boolean isShow;

					private Float listPrice;

					public Float getCheapStandardPrice() {
						return this.cheapStandardPrice;
					}

					public void setCheapStandardPrice(Float cheapStandardPrice) {
						this.cheapStandardPrice = cheapStandardPrice;
					}

					public Float getCheapRate() {
						return this.cheapRate;
					}

					public void setCheapRate(Float cheapRate) {
						this.cheapRate = cheapRate;
					}

					public String getDifferentialName() {
						return this.differentialName;
					}

					public void setDifferentialName(String differentialName) {
						this.differentialName = differentialName;
					}

					public Float getMonthPrice() {
						return this.monthPrice;
					}

					public void setMonthPrice(Float monthPrice) {
						this.monthPrice = monthPrice;
					}

					public Float getOriginalStandardPrice() {
						return this.originalStandardPrice;
					}

					public void setOriginalStandardPrice(Float originalStandardPrice) {
						this.originalStandardPrice = originalStandardPrice;
					}

					public Float getDifferentialPrice() {
						return this.differentialPrice;
					}

					public void setDifferentialPrice(Float differentialPrice) {
						this.differentialPrice = differentialPrice;
					}

					public String getStartTime() {
						return this.startTime;
					}

					public void setStartTime(String startTime) {
						this.startTime = startTime;
					}

					public Boolean getIsShow() {
						return this.isShow;
					}

					public void setIsShow(Boolean isShow) {
						this.isShow = isShow;
					}

					public Float getListPrice() {
						return this.listPrice;
					}

					public void setListPrice(Float listPrice) {
						this.listPrice = listPrice;
					}
				}
			}

			public static class DepreciateInfo {

				private Float cheapStandardPrice;

				private Float cheapRate;

				private String differentialName;

				private Float monthPrice;

				private Float originalStandardPrice;

				private Float differentialPrice;

				private String startTime;

				private Boolean isShow;

				private Float listPrice;

				public Float getCheapStandardPrice() {
					return this.cheapStandardPrice;
				}

				public void setCheapStandardPrice(Float cheapStandardPrice) {
					this.cheapStandardPrice = cheapStandardPrice;
				}

				public Float getCheapRate() {
					return this.cheapRate;
				}

				public void setCheapRate(Float cheapRate) {
					this.cheapRate = cheapRate;
				}

				public String getDifferentialName() {
					return this.differentialName;
				}

				public void setDifferentialName(String differentialName) {
					this.differentialName = differentialName;
				}

				public Float getMonthPrice() {
					return this.monthPrice;
				}

				public void setMonthPrice(Float monthPrice) {
					this.monthPrice = monthPrice;
				}

				public Float getOriginalStandardPrice() {
					return this.originalStandardPrice;
				}

				public void setOriginalStandardPrice(Float originalStandardPrice) {
					this.originalStandardPrice = originalStandardPrice;
				}

				public Float getDifferentialPrice() {
					return this.differentialPrice;
				}

				public void setDifferentialPrice(Float differentialPrice) {
					this.differentialPrice = differentialPrice;
				}

				public String getStartTime() {
					return this.startTime;
				}

				public void setStartTime(String startTime) {
					this.startTime = startTime;
				}

				public Boolean getIsShow() {
					return this.isShow;
				}

				public void setIsShow(Boolean isShow) {
					this.isShow = isShow;
				}

				public Float getListPrice() {
					return this.listPrice;
				}

				public void setListPrice(Float listPrice) {
					this.listPrice = listPrice;
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
	public DescribeRenewalPriceResponse getInstance(UnmarshallerContext context) {
		return	DescribeRenewalPriceResponseUnmarshaller.unmarshall(this, context);
	}
}
