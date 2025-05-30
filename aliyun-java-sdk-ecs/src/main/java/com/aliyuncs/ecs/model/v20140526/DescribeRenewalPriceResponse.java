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

		private Price price;

		private PriceWarning priceWarning;

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

			private Float standardPrice;

			private Float standardDiscountPrice;

			private Boolean isContractPromotion;

			private List<DetailInfo> detailInfos;

			private List<Coupon> coupons;

			private List<SubPrice> subPrices;

			private List<Promotion7> promotions;

			private List<String> ruleIdSet;

			private DepreciateInfo depreciateInfo;

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

			public List<SubPrice> getSubPrices() {
				return this.subPrices;
			}

			public void setSubPrices(List<SubPrice> subPrices) {
				this.subPrices = subPrices;
			}

			public List<Promotion7> getPromotions() {
				return this.promotions;
			}

			public void setPromotions(List<Promotion7> promotions) {
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

			public static class DetailInfo {

				private String resource;

				private Float originalPrice;

				private Float discountPrice;

				private Float tradePrice;

				private Float standardPrice;

				private Float standardDiscountPrice;

				private Boolean isContractPromotion;

				private List<Rule2> subRules;

				private List<Attribute> attributes;

				private DepreciateInfo1 depreciateInfo1;

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

				public static class DepreciateInfo1 {

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

			public static class Coupon {

				private Boolean isSelected;

				private String couponNo;

				private String description;

				private String name;

				private Float discountOff;

				private String optionCode;

				private List<Long> ruleIds;

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

				public List<Long> getRuleIds() {
					return this.ruleIds;
				}

				public void setRuleIds(List<Long> ruleIds) {
					this.ruleIds = ruleIds;
				}
			}

			public static class SubPrice {

				private Float originalPrice;

				private String instanceId;

				private Float discountPrice;

				private Float tradePrice;

				private Float standardPrice;

				private Float standardDiscountPrice;

				private Boolean isContractPromotion;

				private List<Promotion> promotions5;

				private List<String> ruleIdSet3;

				private DepreciateInfo4 depreciateInfo4;

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

				public List<Promotion> getPromotions5() {
					return this.promotions5;
				}

				public void setPromotions5(List<Promotion> promotions5) {
					this.promotions5 = promotions5;
				}

				public List<String> getRuleIdSet3() {
					return this.ruleIdSet3;
				}

				public void setRuleIdSet3(List<String> ruleIdSet3) {
					this.ruleIdSet3 = ruleIdSet3;
				}

				public DepreciateInfo4 getDepreciateInfo4() {
					return this.depreciateInfo4;
				}

				public void setDepreciateInfo4(DepreciateInfo4 depreciateInfo4) {
					this.depreciateInfo4 = depreciateInfo4;
				}

				public static class Promotion {

					private String name;

					private Float discountOff;

					private String type;

					private Float remainQuota;

					private List<Long> ruleIds6;

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

					public List<Long> getRuleIds6() {
						return this.ruleIds6;
					}

					public void setRuleIds6(List<Long> ruleIds6) {
						this.ruleIds6 = ruleIds6;
					}
				}

				public static class DepreciateInfo4 {

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

			public static class Promotion7 {

				private String name;

				private Float discountOff;

				private String type;

				private Float remainQuota;

				private List<Long> ruleIds8;

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

				public List<Long> getRuleIds8() {
					return this.ruleIds8;
				}

				public void setRuleIds8(List<Long> ruleIds8) {
					this.ruleIds8 = ruleIds8;
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
	}

	@Override
	public DescribeRenewalPriceResponse getInstance(UnmarshallerContext context) {
		return	DescribeRenewalPriceResponseUnmarshaller.unmarshall(this, context);
	}
}
