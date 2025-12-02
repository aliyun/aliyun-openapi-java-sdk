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
import com.aliyuncs.ecs.transform.v20140526.DescribePriceResponseUnmarshaller;
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

			private Float reservedInstanceHourPrice;

			private Float discountPrice;

			private String currency;

			private Float tradePrice;

			private Float standardPrice;

			private Float standardDiscountPrice;

			private Boolean isContractPromotion;

			private Float spotInstanceTypePrice;

			private Float spotInstanceTypeOriginalPrice;

			private Float reservedInstanceHourTradePrice;

			private Float reservedInstanceHourDiscountPrice;

			private List<Coupon> coupons;

			private List<DetailInfo> detailInfos;

			private List<Promotion> promotions;

			private List<String> ruleIdSet;

			private DepreciateInfo depreciateInfo;

			public Float getOriginalPrice() {
				return this.originalPrice;
			}

			public void setOriginalPrice(Float originalPrice) {
				this.originalPrice = originalPrice;
			}

			public Float getReservedInstanceHourPrice() {
				return this.reservedInstanceHourPrice;
			}

			public void setReservedInstanceHourPrice(Float reservedInstanceHourPrice) {
				this.reservedInstanceHourPrice = reservedInstanceHourPrice;
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

			public Boolean getIsContractPromotion() {
				return this.isContractPromotion;
			}

			public void setIsContractPromotion(Boolean isContractPromotion) {
				this.isContractPromotion = isContractPromotion;
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

			public Float getReservedInstanceHourTradePrice() {
				return this.reservedInstanceHourTradePrice;
			}

			public void setReservedInstanceHourTradePrice(Float reservedInstanceHourTradePrice) {
				this.reservedInstanceHourTradePrice = reservedInstanceHourTradePrice;
			}

			public Float getReservedInstanceHourDiscountPrice() {
				return this.reservedInstanceHourDiscountPrice;
			}

			public void setReservedInstanceHourDiscountPrice(Float reservedInstanceHourDiscountPrice) {
				this.reservedInstanceHourDiscountPrice = reservedInstanceHourDiscountPrice;
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

			public DepreciateInfo getDepreciateInfo() {
				return this.depreciateInfo;
			}

			public void setDepreciateInfo(DepreciateInfo depreciateInfo) {
				this.depreciateInfo = depreciateInfo;
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

				private Float originalPrice;

				private Float discountPrice;

				private String resource;

				private Float standardPrice;

				private Float standardDiscountPrice;

				private Float tradePrice;

				private Boolean isContractPromotion;

				private List<Rule2> subRules;

				private List<Attribute> attributes;

				private DepreciateInfo1 depreciateInfo1;

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

				public List<Rule2> getSubRules() {
					return this.subRules;
				}

				public void setSubRules(List<Rule2> subRules) {
					this.subRules = subRules;
				}

				public List<Attribute> getAttributes() {
					return this.attributes;
				}

				public void setAttributes(List<Attribute> attributes) {
					this.attributes = attributes;
				}

				public DepreciateInfo1 getDepreciateInfo1() {
					return this.depreciateInfo1;
				}

				public void setDepreciateInfo1(DepreciateInfo1 depreciateInfo1) {
					this.depreciateInfo1 = depreciateInfo1;
				}

				public static class Rule2 {

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

				public static class DepreciateInfo1 {

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

			public static class Promotion {

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

			public static class DepreciateInfo {

				private Float listPrice;

				private Float originalStandardPrice;

				private Float cheapStandardPrice;

				private Float cheapRate;

				private Float differentialPrice;

				private String differentialName;

				private Float monthPrice;

				private Boolean isShow;

				private String startTime;

				public Float getListPrice() {
					return this.listPrice;
				}

				public void setListPrice(Float listPrice) {
					this.listPrice = listPrice;
				}

				public Float getOriginalStandardPrice() {
					return this.originalStandardPrice;
				}

				public void setOriginalStandardPrice(Float originalStandardPrice) {
					this.originalStandardPrice = originalStandardPrice;
				}

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

				public Float getDifferentialPrice() {
					return this.differentialPrice;
				}

				public void setDifferentialPrice(Float differentialPrice) {
					this.differentialPrice = differentialPrice;
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

				public Boolean getIsShow() {
					return this.isShow;
				}

				public void setIsShow(Boolean isShow) {
					this.isShow = isShow;
				}

				public String getStartTime() {
					return this.startTime;
				}

				public void setStartTime(String startTime) {
					this.startTime = startTime;
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
			}
		}
	}

	@Override
	public DescribePriceResponse getInstance(UnmarshallerContext context) {
		return	DescribePriceResponseUnmarshaller.unmarshall(this, context);
	}
}
