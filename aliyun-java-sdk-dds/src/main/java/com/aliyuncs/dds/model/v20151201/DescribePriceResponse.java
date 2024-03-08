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

package com.aliyuncs.dds.model.v20151201;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dds.transform.v20151201.DescribePriceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePriceResponse extends AcsResponse {

	private String requestId;

	private String traceId;

	private String orderParams;

	private List<SubOrder> subOrders;

	private List<Rule> rules;

	private Order order;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTraceId() {
		return this.traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public String getOrderParams() {
		return this.orderParams;
	}

	public void setOrderParams(String orderParams) {
		this.orderParams = orderParams;
	}

	public List<SubOrder> getSubOrders() {
		return this.subOrders;
	}

	public void setSubOrders(List<SubOrder> subOrders) {
		this.subOrders = subOrders;
	}

	public List<Rule> getRules() {
		return this.rules;
	}

	public void setRules(List<Rule> rules) {
		this.rules = rules;
	}

	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public static class SubOrder {

		private String originalAmount;

		private String discountAmount;

		private String tradeAmount;

		private String instanceId;

		private String isNewOfficialActivity;

		private Boolean contractActivity;

		private Double standDiscountPrice;

		private Double standPrice;

		private Boolean isContractActivity;

		private List<ModuleInstanceItem> moduleInstance;

		private List<OptionalPromotion> optionalPromotions;

		private List<PromDetal3> promDetailList;

		private List<String> ruleIds;

		private DepreciateInfo depreciateInfo;

		public String getOriginalAmount() {
			return this.originalAmount;
		}

		public void setOriginalAmount(String originalAmount) {
			this.originalAmount = originalAmount;
		}

		public String getDiscountAmount() {
			return this.discountAmount;
		}

		public void setDiscountAmount(String discountAmount) {
			this.discountAmount = discountAmount;
		}

		public String getTradeAmount() {
			return this.tradeAmount;
		}

		public void setTradeAmount(String tradeAmount) {
			this.tradeAmount = tradeAmount;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getIsNewOfficialActivity() {
			return this.isNewOfficialActivity;
		}

		public void setIsNewOfficialActivity(String isNewOfficialActivity) {
			this.isNewOfficialActivity = isNewOfficialActivity;
		}

		public Boolean getContractActivity() {
			return this.contractActivity;
		}

		public void setContractActivity(Boolean contractActivity) {
			this.contractActivity = contractActivity;
		}

		public Double getStandDiscountPrice() {
			return this.standDiscountPrice;
		}

		public void setStandDiscountPrice(Double standDiscountPrice) {
			this.standDiscountPrice = standDiscountPrice;
		}

		public Double getStandPrice() {
			return this.standPrice;
		}

		public void setStandPrice(Double standPrice) {
			this.standPrice = standPrice;
		}

		public Boolean getIsContractActivity() {
			return this.isContractActivity;
		}

		public void setIsContractActivity(Boolean isContractActivity) {
			this.isContractActivity = isContractActivity;
		}

		public List<ModuleInstanceItem> getModuleInstance() {
			return this.moduleInstance;
		}

		public void setModuleInstance(List<ModuleInstanceItem> moduleInstance) {
			this.moduleInstance = moduleInstance;
		}

		public List<OptionalPromotion> getOptionalPromotions() {
			return this.optionalPromotions;
		}

		public void setOptionalPromotions(List<OptionalPromotion> optionalPromotions) {
			this.optionalPromotions = optionalPromotions;
		}

		public List<PromDetal3> getPromDetailList() {
			return this.promDetailList;
		}

		public void setPromDetailList(List<PromDetal3> promDetailList) {
			this.promDetailList = promDetailList;
		}

		public List<String> getRuleIds() {
			return this.ruleIds;
		}

		public void setRuleIds(List<String> ruleIds) {
			this.ruleIds = ruleIds;
		}

		public DepreciateInfo getDepreciateInfo() {
			return this.depreciateInfo;
		}

		public void setDepreciateInfo(DepreciateInfo depreciateInfo) {
			this.depreciateInfo = depreciateInfo;
		}

		public static class ModuleInstanceItem {

			private String cycleFee;

			private String discountFee;

			private String moduleCode;

			private Long moduleId;

			private String moduleName;

			private Boolean needOrderPay;

			private Double payFee;

			private Boolean pricingModule;

			private Double standPrice;

			private Double totalProductFee;

			private Boolean contractActivity;

			private List<PromDetal> promDetailList2;

			private List<ModuleAttr> moduleAttrs;

			private DepreciateInfo1 depreciateInfo1;

			public String getCycleFee() {
				return this.cycleFee;
			}

			public void setCycleFee(String cycleFee) {
				this.cycleFee = cycleFee;
			}

			public String getDiscountFee() {
				return this.discountFee;
			}

			public void setDiscountFee(String discountFee) {
				this.discountFee = discountFee;
			}

			public String getModuleCode() {
				return this.moduleCode;
			}

			public void setModuleCode(String moduleCode) {
				this.moduleCode = moduleCode;
			}

			public Long getModuleId() {
				return this.moduleId;
			}

			public void setModuleId(Long moduleId) {
				this.moduleId = moduleId;
			}

			public String getModuleName() {
				return this.moduleName;
			}

			public void setModuleName(String moduleName) {
				this.moduleName = moduleName;
			}

			public Boolean getNeedOrderPay() {
				return this.needOrderPay;
			}

			public void setNeedOrderPay(Boolean needOrderPay) {
				this.needOrderPay = needOrderPay;
			}

			public Double getPayFee() {
				return this.payFee;
			}

			public void setPayFee(Double payFee) {
				this.payFee = payFee;
			}

			public Boolean getPricingModule() {
				return this.pricingModule;
			}

			public void setPricingModule(Boolean pricingModule) {
				this.pricingModule = pricingModule;
			}

			public Double getStandPrice() {
				return this.standPrice;
			}

			public void setStandPrice(Double standPrice) {
				this.standPrice = standPrice;
			}

			public Double getTotalProductFee() {
				return this.totalProductFee;
			}

			public void setTotalProductFee(Double totalProductFee) {
				this.totalProductFee = totalProductFee;
			}

			public Boolean getContractActivity() {
				return this.contractActivity;
			}

			public void setContractActivity(Boolean contractActivity) {
				this.contractActivity = contractActivity;
			}

			public List<PromDetal> getPromDetailList2() {
				return this.promDetailList2;
			}

			public void setPromDetailList2(List<PromDetal> promDetailList2) {
				this.promDetailList2 = promDetailList2;
			}

			public List<ModuleAttr> getModuleAttrs() {
				return this.moduleAttrs;
			}

			public void setModuleAttrs(List<ModuleAttr> moduleAttrs) {
				this.moduleAttrs = moduleAttrs;
			}

			public DepreciateInfo1 getDepreciateInfo1() {
				return this.depreciateInfo1;
			}

			public void setDepreciateInfo1(DepreciateInfo1 depreciateInfo1) {
				this.depreciateInfo1 = depreciateInfo1;
			}

			public static class PromDetal {

				private Double finalPromFee;

				private Map<Object,Object> activityExtInfo;

				private String optionCode;

				private String promType;

				private Long promotionId;

				private String promotionName;

				private String promotionCode;

				private String derivedPromType;

				public Double getFinalPromFee() {
					return this.finalPromFee;
				}

				public void setFinalPromFee(Double finalPromFee) {
					this.finalPromFee = finalPromFee;
				}

				public Map<Object,Object> getActivityExtInfo() {
					return this.activityExtInfo;
				}

				public void setActivityExtInfo(Map<Object,Object> activityExtInfo) {
					this.activityExtInfo = activityExtInfo;
				}

				public String getOptionCode() {
					return this.optionCode;
				}

				public void setOptionCode(String optionCode) {
					this.optionCode = optionCode;
				}

				public String getPromType() {
					return this.promType;
				}

				public void setPromType(String promType) {
					this.promType = promType;
				}

				public Long getPromotionId() {
					return this.promotionId;
				}

				public void setPromotionId(Long promotionId) {
					this.promotionId = promotionId;
				}

				public String getPromotionName() {
					return this.promotionName;
				}

				public void setPromotionName(String promotionName) {
					this.promotionName = promotionName;
				}

				public String getPromotionCode() {
					return this.promotionCode;
				}

				public void setPromotionCode(String promotionCode) {
					this.promotionCode = promotionCode;
				}

				public String getDerivedPromType() {
					return this.derivedPromType;
				}

				public void setDerivedPromType(String derivedPromType) {
					this.derivedPromType = derivedPromType;
				}
			}

			public static class ModuleAttr {

				private String code;

				private String name;

				private String type;

				private String value;

				public String getCode() {
					return this.code;
				}

				public void setCode(String code) {
					this.code = code;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class DepreciateInfo1 {

				private Double listPrice;

				private Double originalStandAmount;

				private Double cheapStandAmount;

				private Double cheapRate;

				private Double differential;

				private String differentialName;

				private Double monthPrice;

				private Boolean isContractActivity;

				private String isShow;

				public Double getListPrice() {
					return this.listPrice;
				}

				public void setListPrice(Double listPrice) {
					this.listPrice = listPrice;
				}

				public Double getOriginalStandAmount() {
					return this.originalStandAmount;
				}

				public void setOriginalStandAmount(Double originalStandAmount) {
					this.originalStandAmount = originalStandAmount;
				}

				public Double getCheapStandAmount() {
					return this.cheapStandAmount;
				}

				public void setCheapStandAmount(Double cheapStandAmount) {
					this.cheapStandAmount = cheapStandAmount;
				}

				public Double getCheapRate() {
					return this.cheapRate;
				}

				public void setCheapRate(Double cheapRate) {
					this.cheapRate = cheapRate;
				}

				public Double getDifferential() {
					return this.differential;
				}

				public void setDifferential(Double differential) {
					this.differential = differential;
				}

				public String getDifferentialName() {
					return this.differentialName;
				}

				public void setDifferentialName(String differentialName) {
					this.differentialName = differentialName;
				}

				public Double getMonthPrice() {
					return this.monthPrice;
				}

				public void setMonthPrice(Double monthPrice) {
					this.monthPrice = monthPrice;
				}

				public Boolean getIsContractActivity() {
					return this.isContractActivity;
				}

				public void setIsContractActivity(Boolean isContractActivity) {
					this.isContractActivity = isContractActivity;
				}

				public String getIsShow() {
					return this.isShow;
				}

				public void setIsShow(String isShow) {
					this.isShow = isShow;
				}
			}
		}

		public static class OptionalPromotion {

			private String activityCategory;

			private Map<Object,Object> activityExtInfo;

			private Double canPromFee;

			private String optionCode;

			private String promotionName;

			private String promotionOptionNo;

			private Boolean selected;

			private Boolean show;

			private List<String> targetArticleItemCodes;

			public String getActivityCategory() {
				return this.activityCategory;
			}

			public void setActivityCategory(String activityCategory) {
				this.activityCategory = activityCategory;
			}

			public Map<Object,Object> getActivityExtInfo() {
				return this.activityExtInfo;
			}

			public void setActivityExtInfo(Map<Object,Object> activityExtInfo) {
				this.activityExtInfo = activityExtInfo;
			}

			public Double getCanPromFee() {
				return this.canPromFee;
			}

			public void setCanPromFee(Double canPromFee) {
				this.canPromFee = canPromFee;
			}

			public String getOptionCode() {
				return this.optionCode;
			}

			public void setOptionCode(String optionCode) {
				this.optionCode = optionCode;
			}

			public String getPromotionName() {
				return this.promotionName;
			}

			public void setPromotionName(String promotionName) {
				this.promotionName = promotionName;
			}

			public String getPromotionOptionNo() {
				return this.promotionOptionNo;
			}

			public void setPromotionOptionNo(String promotionOptionNo) {
				this.promotionOptionNo = promotionOptionNo;
			}

			public Boolean getSelected() {
				return this.selected;
			}

			public void setSelected(Boolean selected) {
				this.selected = selected;
			}

			public Boolean getShow() {
				return this.show;
			}

			public void setShow(Boolean show) {
				this.show = show;
			}

			public List<String> getTargetArticleItemCodes() {
				return this.targetArticleItemCodes;
			}

			public void setTargetArticleItemCodes(List<String> targetArticleItemCodes) {
				this.targetArticleItemCodes = targetArticleItemCodes;
			}
		}

		public static class PromDetal3 {

			private Double finalPromFee;

			private Map<Object,Object> activityExtInfo;

			private String optionCode;

			private String promType;

			private Long promotionId;

			private String promotionName;

			private String promotionCode;

			private String derivedPromType;

			public Double getFinalPromFee() {
				return this.finalPromFee;
			}

			public void setFinalPromFee(Double finalPromFee) {
				this.finalPromFee = finalPromFee;
			}

			public Map<Object,Object> getActivityExtInfo() {
				return this.activityExtInfo;
			}

			public void setActivityExtInfo(Map<Object,Object> activityExtInfo) {
				this.activityExtInfo = activityExtInfo;
			}

			public String getOptionCode() {
				return this.optionCode;
			}

			public void setOptionCode(String optionCode) {
				this.optionCode = optionCode;
			}

			public String getPromType() {
				return this.promType;
			}

			public void setPromType(String promType) {
				this.promType = promType;
			}

			public Long getPromotionId() {
				return this.promotionId;
			}

			public void setPromotionId(Long promotionId) {
				this.promotionId = promotionId;
			}

			public String getPromotionName() {
				return this.promotionName;
			}

			public void setPromotionName(String promotionName) {
				this.promotionName = promotionName;
			}

			public String getPromotionCode() {
				return this.promotionCode;
			}

			public void setPromotionCode(String promotionCode) {
				this.promotionCode = promotionCode;
			}

			public String getDerivedPromType() {
				return this.derivedPromType;
			}

			public void setDerivedPromType(String derivedPromType) {
				this.derivedPromType = derivedPromType;
			}
		}

		public static class DepreciateInfo {

			private Double listPrice;

			private Double originalStandAmount;

			private Double cheapStandAmount;

			private Double cheapRate;

			private Double differential;

			private String differentialName;

			private Double monthPrice;

			private Boolean isContractActivity;

			private String isShow;

			private ContractActivity contractActivity;

			public Double getListPrice() {
				return this.listPrice;
			}

			public void setListPrice(Double listPrice) {
				this.listPrice = listPrice;
			}

			public Double getOriginalStandAmount() {
				return this.originalStandAmount;
			}

			public void setOriginalStandAmount(Double originalStandAmount) {
				this.originalStandAmount = originalStandAmount;
			}

			public Double getCheapStandAmount() {
				return this.cheapStandAmount;
			}

			public void setCheapStandAmount(Double cheapStandAmount) {
				this.cheapStandAmount = cheapStandAmount;
			}

			public Double getCheapRate() {
				return this.cheapRate;
			}

			public void setCheapRate(Double cheapRate) {
				this.cheapRate = cheapRate;
			}

			public Double getDifferential() {
				return this.differential;
			}

			public void setDifferential(Double differential) {
				this.differential = differential;
			}

			public String getDifferentialName() {
				return this.differentialName;
			}

			public void setDifferentialName(String differentialName) {
				this.differentialName = differentialName;
			}

			public Double getMonthPrice() {
				return this.monthPrice;
			}

			public void setMonthPrice(Double monthPrice) {
				this.monthPrice = monthPrice;
			}

			public Boolean getIsContractActivity() {
				return this.isContractActivity;
			}

			public void setIsContractActivity(Boolean isContractActivity) {
				this.isContractActivity = isContractActivity;
			}

			public String getIsShow() {
				return this.isShow;
			}

			public void setIsShow(String isShow) {
				this.isShow = isShow;
			}

			public ContractActivity getContractActivity() {
				return this.contractActivity;
			}

			public void setContractActivity(ContractActivity contractActivity) {
				this.contractActivity = contractActivity;
			}

			public static class ContractActivity {

				private Double finalPromFee;

				private Double finalFee;

				private Double prodFee;

				private Long activityId;

				private String optionCode;

				private String activityName;

				private List<Long> optionIds;

				public Double getFinalPromFee() {
					return this.finalPromFee;
				}

				public void setFinalPromFee(Double finalPromFee) {
					this.finalPromFee = finalPromFee;
				}

				public Double getFinalFee() {
					return this.finalFee;
				}

				public void setFinalFee(Double finalFee) {
					this.finalFee = finalFee;
				}

				public Double getProdFee() {
					return this.prodFee;
				}

				public void setProdFee(Double prodFee) {
					this.prodFee = prodFee;
				}

				public Long getActivityId() {
					return this.activityId;
				}

				public void setActivityId(Long activityId) {
					this.activityId = activityId;
				}

				public String getOptionCode() {
					return this.optionCode;
				}

				public void setOptionCode(String optionCode) {
					this.optionCode = optionCode;
				}

				public String getActivityName() {
					return this.activityName;
				}

				public void setActivityName(String activityName) {
					this.activityName = activityName;
				}

				public List<Long> getOptionIds() {
					return this.optionIds;
				}

				public void setOptionIds(List<Long> optionIds) {
					this.optionIds = optionIds;
				}
			}
		}
	}

	public static class Rule {

		private Long ruleDescId;

		private String title;

		private String name;

		public Long getRuleDescId() {
			return this.ruleDescId;
		}

		public void setRuleDescId(Long ruleDescId) {
			this.ruleDescId = ruleDescId;
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

		private String originalAmount;

		private String discountAmount;

		private String tradeAmount;

		private String currency;

		private Boolean showDiscountInfo;

		private String optionalPromotions;

		private String promDetailList;

		private Double standDiscountPrice;

		private Double standPrice;

		private Boolean contractActivity;

		private String code;

		private String message;

		private Boolean isContractActivity;

		private List<Coupon> coupons;

		private List<String> ruleIds4;

		private DepreciateInfo5 depreciateInfo5;

		public String getOriginalAmount() {
			return this.originalAmount;
		}

		public void setOriginalAmount(String originalAmount) {
			this.originalAmount = originalAmount;
		}

		public String getDiscountAmount() {
			return this.discountAmount;
		}

		public void setDiscountAmount(String discountAmount) {
			this.discountAmount = discountAmount;
		}

		public String getTradeAmount() {
			return this.tradeAmount;
		}

		public void setTradeAmount(String tradeAmount) {
			this.tradeAmount = tradeAmount;
		}

		public String getCurrency() {
			return this.currency;
		}

		public void setCurrency(String currency) {
			this.currency = currency;
		}

		public Boolean getShowDiscountInfo() {
			return this.showDiscountInfo;
		}

		public void setShowDiscountInfo(Boolean showDiscountInfo) {
			this.showDiscountInfo = showDiscountInfo;
		}

		public String getOptionalPromotions() {
			return this.optionalPromotions;
		}

		public void setOptionalPromotions(String optionalPromotions) {
			this.optionalPromotions = optionalPromotions;
		}

		public String getPromDetailList() {
			return this.promDetailList;
		}

		public void setPromDetailList(String promDetailList) {
			this.promDetailList = promDetailList;
		}

		public Double getStandDiscountPrice() {
			return this.standDiscountPrice;
		}

		public void setStandDiscountPrice(Double standDiscountPrice) {
			this.standDiscountPrice = standDiscountPrice;
		}

		public Double getStandPrice() {
			return this.standPrice;
		}

		public void setStandPrice(Double standPrice) {
			this.standPrice = standPrice;
		}

		public Boolean getContractActivity() {
			return this.contractActivity;
		}

		public void setContractActivity(Boolean contractActivity) {
			this.contractActivity = contractActivity;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public Boolean getIsContractActivity() {
			return this.isContractActivity;
		}

		public void setIsContractActivity(Boolean isContractActivity) {
			this.isContractActivity = isContractActivity;
		}

		public List<Coupon> getCoupons() {
			return this.coupons;
		}

		public void setCoupons(List<Coupon> coupons) {
			this.coupons = coupons;
		}

		public List<String> getRuleIds4() {
			return this.ruleIds4;
		}

		public void setRuleIds4(List<String> ruleIds4) {
			this.ruleIds4 = ruleIds4;
		}

		public DepreciateInfo5 getDepreciateInfo5() {
			return this.depreciateInfo5;
		}

		public void setDepreciateInfo5(DepreciateInfo5 depreciateInfo5) {
			this.depreciateInfo5 = depreciateInfo5;
		}

		public static class Coupon {

			private String description;

			private String isSelected;

			private String couponNo;

			private String name;

			private Double canPromFee;

			private String promotionOptionCode;

			private Double lackForPriceBreak;

			private Double priceBreakThreshold;

			private Double priceBreakReduceValue;

			private String optionCode;

			private String activityCategory;

			private List<Long> promotionRuleIdList;

			private List<String> targetArticleItemCodes6;

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getIsSelected() {
				return this.isSelected;
			}

			public void setIsSelected(String isSelected) {
				this.isSelected = isSelected;
			}

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

			public Double getCanPromFee() {
				return this.canPromFee;
			}

			public void setCanPromFee(Double canPromFee) {
				this.canPromFee = canPromFee;
			}

			public String getPromotionOptionCode() {
				return this.promotionOptionCode;
			}

			public void setPromotionOptionCode(String promotionOptionCode) {
				this.promotionOptionCode = promotionOptionCode;
			}

			public Double getLackForPriceBreak() {
				return this.lackForPriceBreak;
			}

			public void setLackForPriceBreak(Double lackForPriceBreak) {
				this.lackForPriceBreak = lackForPriceBreak;
			}

			public Double getPriceBreakThreshold() {
				return this.priceBreakThreshold;
			}

			public void setPriceBreakThreshold(Double priceBreakThreshold) {
				this.priceBreakThreshold = priceBreakThreshold;
			}

			public Double getPriceBreakReduceValue() {
				return this.priceBreakReduceValue;
			}

			public void setPriceBreakReduceValue(Double priceBreakReduceValue) {
				this.priceBreakReduceValue = priceBreakReduceValue;
			}

			public String getOptionCode() {
				return this.optionCode;
			}

			public void setOptionCode(String optionCode) {
				this.optionCode = optionCode;
			}

			public String getActivityCategory() {
				return this.activityCategory;
			}

			public void setActivityCategory(String activityCategory) {
				this.activityCategory = activityCategory;
			}

			public List<Long> getPromotionRuleIdList() {
				return this.promotionRuleIdList;
			}

			public void setPromotionRuleIdList(List<Long> promotionRuleIdList) {
				this.promotionRuleIdList = promotionRuleIdList;
			}

			public List<String> getTargetArticleItemCodes6() {
				return this.targetArticleItemCodes6;
			}

			public void setTargetArticleItemCodes6(List<String> targetArticleItemCodes6) {
				this.targetArticleItemCodes6 = targetArticleItemCodes6;
			}
		}

		public static class DepreciateInfo5 {

			private Double listPrice;

			private Double originalStandAmount;

			private Double cheapStandAmount;

			private Double cheapRate;

			private Double differential;

			private String differentialName;

			private Double monthPrice;

			private Boolean isContractActivity;

			private String isShow;

			private ContractActivity7 contractActivity7;

			public Double getListPrice() {
				return this.listPrice;
			}

			public void setListPrice(Double listPrice) {
				this.listPrice = listPrice;
			}

			public Double getOriginalStandAmount() {
				return this.originalStandAmount;
			}

			public void setOriginalStandAmount(Double originalStandAmount) {
				this.originalStandAmount = originalStandAmount;
			}

			public Double getCheapStandAmount() {
				return this.cheapStandAmount;
			}

			public void setCheapStandAmount(Double cheapStandAmount) {
				this.cheapStandAmount = cheapStandAmount;
			}

			public Double getCheapRate() {
				return this.cheapRate;
			}

			public void setCheapRate(Double cheapRate) {
				this.cheapRate = cheapRate;
			}

			public Double getDifferential() {
				return this.differential;
			}

			public void setDifferential(Double differential) {
				this.differential = differential;
			}

			public String getDifferentialName() {
				return this.differentialName;
			}

			public void setDifferentialName(String differentialName) {
				this.differentialName = differentialName;
			}

			public Double getMonthPrice() {
				return this.monthPrice;
			}

			public void setMonthPrice(Double monthPrice) {
				this.monthPrice = monthPrice;
			}

			public Boolean getIsContractActivity() {
				return this.isContractActivity;
			}

			public void setIsContractActivity(Boolean isContractActivity) {
				this.isContractActivity = isContractActivity;
			}

			public String getIsShow() {
				return this.isShow;
			}

			public void setIsShow(String isShow) {
				this.isShow = isShow;
			}

			public ContractActivity7 getContractActivity7() {
				return this.contractActivity7;
			}

			public void setContractActivity7(ContractActivity7 contractActivity7) {
				this.contractActivity7 = contractActivity7;
			}

			public static class ContractActivity7 {

				private Double finalPromFee;

				private Double finalFee;

				private Double prodFee;

				private Long activityId;

				private String optionCode;

				private String activityName;

				private List<Long> optionIds8;

				public Double getFinalPromFee() {
					return this.finalPromFee;
				}

				public void setFinalPromFee(Double finalPromFee) {
					this.finalPromFee = finalPromFee;
				}

				public Double getFinalFee() {
					return this.finalFee;
				}

				public void setFinalFee(Double finalFee) {
					this.finalFee = finalFee;
				}

				public Double getProdFee() {
					return this.prodFee;
				}

				public void setProdFee(Double prodFee) {
					this.prodFee = prodFee;
				}

				public Long getActivityId() {
					return this.activityId;
				}

				public void setActivityId(Long activityId) {
					this.activityId = activityId;
				}

				public String getOptionCode() {
					return this.optionCode;
				}

				public void setOptionCode(String optionCode) {
					this.optionCode = optionCode;
				}

				public String getActivityName() {
					return this.activityName;
				}

				public void setActivityName(String activityName) {
					this.activityName = activityName;
				}

				public List<Long> getOptionIds8() {
					return this.optionIds8;
				}

				public void setOptionIds8(List<Long> optionIds8) {
					this.optionIds8 = optionIds8;
				}
			}
		}
	}

	@Override
	public DescribePriceResponse getInstance(UnmarshallerContext context) {
		return	DescribePriceResponseUnmarshaller.unmarshall(this, context);
	}
}
