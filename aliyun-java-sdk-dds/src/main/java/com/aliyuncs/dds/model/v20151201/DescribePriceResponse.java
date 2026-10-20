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

		private Double standPrice;

		private String instanceId;

		private Double standDiscountPrice;

		private String tradeAmount;

		private String originalAmount;

		private String discountAmount;

		private Boolean contractActivity;

		private String isNewOfficialActivity;

		private Boolean isContractActivity;

		private List<OptionalPromotion> optionalPromotions;

		private List<PromDetail> promDetailList;

		private List<ModuleInstanceItem> moduleInstance;

		private List<String> ruleIds;

		private DepreciateInfo depreciateInfo;

		public Double getStandPrice() {
			return this.standPrice;
		}

		public void setStandPrice(Double standPrice) {
			this.standPrice = standPrice;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Double getStandDiscountPrice() {
			return this.standDiscountPrice;
		}

		public void setStandDiscountPrice(Double standDiscountPrice) {
			this.standDiscountPrice = standDiscountPrice;
		}

		public String getTradeAmount() {
			return this.tradeAmount;
		}

		public void setTradeAmount(String tradeAmount) {
			this.tradeAmount = tradeAmount;
		}

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

		public Boolean getContractActivity() {
			return this.contractActivity;
		}

		public void setContractActivity(Boolean contractActivity) {
			this.contractActivity = contractActivity;
		}

		public String getIsNewOfficialActivity() {
			return this.isNewOfficialActivity;
		}

		public void setIsNewOfficialActivity(String isNewOfficialActivity) {
			this.isNewOfficialActivity = isNewOfficialActivity;
		}

		public Boolean getIsContractActivity() {
			return this.isContractActivity;
		}

		public void setIsContractActivity(Boolean isContractActivity) {
			this.isContractActivity = isContractActivity;
		}

		public List<OptionalPromotion> getOptionalPromotions() {
			return this.optionalPromotions;
		}

		public void setOptionalPromotions(List<OptionalPromotion> optionalPromotions) {
			this.optionalPromotions = optionalPromotions;
		}

		public List<PromDetail> getPromDetailList() {
			return this.promDetailList;
		}

		public void setPromDetailList(List<PromDetail> promDetailList) {
			this.promDetailList = promDetailList;
		}

		public List<ModuleInstanceItem> getModuleInstance() {
			return this.moduleInstance;
		}

		public void setModuleInstance(List<ModuleInstanceItem> moduleInstance) {
			this.moduleInstance = moduleInstance;
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

		public static class OptionalPromotion {

			private String activityCategory;

			private String promotionName;

			private String promotionOptionNo;

			private Double canPromFee;

			private Map<Object,Object> activityExtInfo;

			private Boolean show;

			private String optionCode;

			private Boolean selected;

			private List<String> promotionRuleIdList;

			private List<String> targetArticleItemCodes;

			public String getActivityCategory() {
				return this.activityCategory;
			}

			public void setActivityCategory(String activityCategory) {
				this.activityCategory = activityCategory;
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

			public Double getCanPromFee() {
				return this.canPromFee;
			}

			public void setCanPromFee(Double canPromFee) {
				this.canPromFee = canPromFee;
			}

			public Map<Object,Object> getActivityExtInfo() {
				return this.activityExtInfo;
			}

			public void setActivityExtInfo(Map<Object,Object> activityExtInfo) {
				this.activityExtInfo = activityExtInfo;
			}

			public Boolean getShow() {
				return this.show;
			}

			public void setShow(Boolean show) {
				this.show = show;
			}

			public String getOptionCode() {
				return this.optionCode;
			}

			public void setOptionCode(String optionCode) {
				this.optionCode = optionCode;
			}

			public Boolean getSelected() {
				return this.selected;
			}

			public void setSelected(Boolean selected) {
				this.selected = selected;
			}

			public List<String> getPromotionRuleIdList() {
				return this.promotionRuleIdList;
			}

			public void setPromotionRuleIdList(List<String> promotionRuleIdList) {
				this.promotionRuleIdList = promotionRuleIdList;
			}

			public List<String> getTargetArticleItemCodes() {
				return this.targetArticleItemCodes;
			}

			public void setTargetArticleItemCodes(List<String> targetArticleItemCodes) {
				this.targetArticleItemCodes = targetArticleItemCodes;
			}
		}

		public static class PromDetail {

			private String promotionName;

			private String derivedPromType;

			private Long promotionId;

			private Double finalPromFee;

			private String promotionCode;

			private Map<Object,Object> activityExtInfo;

			private String optionCode;

			private String promType;

			public String getPromotionName() {
				return this.promotionName;
			}

			public void setPromotionName(String promotionName) {
				this.promotionName = promotionName;
			}

			public String getDerivedPromType() {
				return this.derivedPromType;
			}

			public void setDerivedPromType(String derivedPromType) {
				this.derivedPromType = derivedPromType;
			}

			public Long getPromotionId() {
				return this.promotionId;
			}

			public void setPromotionId(Long promotionId) {
				this.promotionId = promotionId;
			}

			public Double getFinalPromFee() {
				return this.finalPromFee;
			}

			public void setFinalPromFee(Double finalPromFee) {
				this.finalPromFee = finalPromFee;
			}

			public String getPromotionCode() {
				return this.promotionCode;
			}

			public void setPromotionCode(String promotionCode) {
				this.promotionCode = promotionCode;
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
		}

		public static class ModuleInstanceItem {

			private Double standPrice;

			private String priceUnit;

			private String moduleName;

			private Double standDiscountPrice;

			private String priceType;

			private String discountFee;

			private Boolean needOrderPay;

			private Double payFee;

			private Boolean contractActivity;

			private String cycleFee;

			private Long moduleId;

			private Boolean pricingModule;

			private String moduleCode;

			private String unitPriceUnit4Buy;

			private Double totalProductFee;

			private List<PromDetail3> promDetailList2;

			private List<ModuleAttr> moduleAttrs;

			private DepreciateInfo1 depreciateInfo1;

			public Double getStandPrice() {
				return this.standPrice;
			}

			public void setStandPrice(Double standPrice) {
				this.standPrice = standPrice;
			}

			public String getPriceUnit() {
				return this.priceUnit;
			}

			public void setPriceUnit(String priceUnit) {
				this.priceUnit = priceUnit;
			}

			public String getModuleName() {
				return this.moduleName;
			}

			public void setModuleName(String moduleName) {
				this.moduleName = moduleName;
			}

			public Double getStandDiscountPrice() {
				return this.standDiscountPrice;
			}

			public void setStandDiscountPrice(Double standDiscountPrice) {
				this.standDiscountPrice = standDiscountPrice;
			}

			public String getPriceType() {
				return this.priceType;
			}

			public void setPriceType(String priceType) {
				this.priceType = priceType;
			}

			public String getDiscountFee() {
				return this.discountFee;
			}

			public void setDiscountFee(String discountFee) {
				this.discountFee = discountFee;
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

			public Boolean getContractActivity() {
				return this.contractActivity;
			}

			public void setContractActivity(Boolean contractActivity) {
				this.contractActivity = contractActivity;
			}

			public String getCycleFee() {
				return this.cycleFee;
			}

			public void setCycleFee(String cycleFee) {
				this.cycleFee = cycleFee;
			}

			public Long getModuleId() {
				return this.moduleId;
			}

			public void setModuleId(Long moduleId) {
				this.moduleId = moduleId;
			}

			public Boolean getPricingModule() {
				return this.pricingModule;
			}

			public void setPricingModule(Boolean pricingModule) {
				this.pricingModule = pricingModule;
			}

			public String getModuleCode() {
				return this.moduleCode;
			}

			public void setModuleCode(String moduleCode) {
				this.moduleCode = moduleCode;
			}

			public String getUnitPriceUnit4Buy() {
				return this.unitPriceUnit4Buy;
			}

			public void setUnitPriceUnit4Buy(String unitPriceUnit4Buy) {
				this.unitPriceUnit4Buy = unitPriceUnit4Buy;
			}

			public Double getTotalProductFee() {
				return this.totalProductFee;
			}

			public void setTotalProductFee(Double totalProductFee) {
				this.totalProductFee = totalProductFee;
			}

			public List<PromDetail3> getPromDetailList2() {
				return this.promDetailList2;
			}

			public void setPromDetailList2(List<PromDetail3> promDetailList2) {
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

			public static class PromDetail3 {

				private String promotionName;

				private String derivedPromType;

				private Long promotionId;

				private Double finalPromFee;

				private String promotionCode;

				private Map<Object,Object> activityExtInfo;

				private String optionCode;

				private String promType;

				public String getPromotionName() {
					return this.promotionName;
				}

				public void setPromotionName(String promotionName) {
					this.promotionName = promotionName;
				}

				public String getDerivedPromType() {
					return this.derivedPromType;
				}

				public void setDerivedPromType(String derivedPromType) {
					this.derivedPromType = derivedPromType;
				}

				public Long getPromotionId() {
					return this.promotionId;
				}

				public void setPromotionId(Long promotionId) {
					this.promotionId = promotionId;
				}

				public Double getFinalPromFee() {
					return this.finalPromFee;
				}

				public void setFinalPromFee(Double finalPromFee) {
					this.finalPromFee = finalPromFee;
				}

				public String getPromotionCode() {
					return this.promotionCode;
				}

				public void setPromotionCode(String promotionCode) {
					this.promotionCode = promotionCode;
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
			}

			public static class ModuleAttr {

				private String type;

				private String value;

				private String code;

				private String name;

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
			}

			public static class DepreciateInfo1 {

				private Double cheapRate;

				private Double differential;

				private String differentialName;

				private Double monthPrice;

				private Double cheapStandAmount;

				private Double originalStandAmount;

				private String isShow;

				private Double listPrice;

				private Boolean isContractActivity;

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

				public Double getCheapStandAmount() {
					return this.cheapStandAmount;
				}

				public void setCheapStandAmount(Double cheapStandAmount) {
					this.cheapStandAmount = cheapStandAmount;
				}

				public Double getOriginalStandAmount() {
					return this.originalStandAmount;
				}

				public void setOriginalStandAmount(Double originalStandAmount) {
					this.originalStandAmount = originalStandAmount;
				}

				public String getIsShow() {
					return this.isShow;
				}

				public void setIsShow(String isShow) {
					this.isShow = isShow;
				}

				public Double getListPrice() {
					return this.listPrice;
				}

				public void setListPrice(Double listPrice) {
					this.listPrice = listPrice;
				}

				public Boolean getIsContractActivity() {
					return this.isContractActivity;
				}

				public void setIsContractActivity(Boolean isContractActivity) {
					this.isContractActivity = isContractActivity;
				}
			}
		}

		public static class DepreciateInfo {

			private Double cheapRate;

			private Double differential;

			private String differentialName;

			private Double monthPrice;

			private Double cheapStandAmount;

			private String startTime;

			private Double originalStandAmount;

			private String isShow;

			private Double listPrice;

			private Boolean isContractActivity;

			private ContractActivity contractActivity;

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

			public Double getCheapStandAmount() {
				return this.cheapStandAmount;
			}

			public void setCheapStandAmount(Double cheapStandAmount) {
				this.cheapStandAmount = cheapStandAmount;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public Double getOriginalStandAmount() {
				return this.originalStandAmount;
			}

			public void setOriginalStandAmount(Double originalStandAmount) {
				this.originalStandAmount = originalStandAmount;
			}

			public String getIsShow() {
				return this.isShow;
			}

			public void setIsShow(String isShow) {
				this.isShow = isShow;
			}

			public Double getListPrice() {
				return this.listPrice;
			}

			public void setListPrice(Double listPrice) {
				this.listPrice = listPrice;
			}

			public Boolean getIsContractActivity() {
				return this.isContractActivity;
			}

			public void setIsContractActivity(Boolean isContractActivity) {
				this.isContractActivity = isContractActivity;
			}

			public ContractActivity getContractActivity() {
				return this.contractActivity;
			}

			public void setContractActivity(ContractActivity contractActivity) {
				this.contractActivity = contractActivity;
			}

			public static class ContractActivity {

				private String activityName;

				private Double finalPromFee;

				private Long activityId;

				private Double prodFee;

				private String optionCode;

				private Double finalFee;

				private List<Long> optionIds;

				public String getActivityName() {
					return this.activityName;
				}

				public void setActivityName(String activityName) {
					this.activityName = activityName;
				}

				public Double getFinalPromFee() {
					return this.finalPromFee;
				}

				public void setFinalPromFee(Double finalPromFee) {
					this.finalPromFee = finalPromFee;
				}

				public Long getActivityId() {
					return this.activityId;
				}

				public void setActivityId(Long activityId) {
					this.activityId = activityId;
				}

				public Double getProdFee() {
					return this.prodFee;
				}

				public void setProdFee(Double prodFee) {
					this.prodFee = prodFee;
				}

				public String getOptionCode() {
					return this.optionCode;
				}

				public void setOptionCode(String optionCode) {
					this.optionCode = optionCode;
				}

				public Double getFinalFee() {
					return this.finalFee;
				}

				public void setFinalFee(Double finalFee) {
					this.finalFee = finalFee;
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

		private Double standPrice;

		private Boolean showDiscountInfo;

		private String message;

		private Double standDiscountPrice;

		private String tradeAmount;

		private String originalAmount;

		private String code;

		private String discountAmount;

		private Boolean contractActivity;

		private String optionalPromotions;

		private String currency;

		private String promDetailList;

		private Double totalCostAmount;

		private Boolean isContractActivity;

		private List<Coupon> coupons;

		private List<String> ruleIds4;

		private DepreciateInfo5 depreciateInfo5;

		public Double getStandPrice() {
			return this.standPrice;
		}

		public void setStandPrice(Double standPrice) {
			this.standPrice = standPrice;
		}

		public Boolean getShowDiscountInfo() {
			return this.showDiscountInfo;
		}

		public void setShowDiscountInfo(Boolean showDiscountInfo) {
			this.showDiscountInfo = showDiscountInfo;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public Double getStandDiscountPrice() {
			return this.standDiscountPrice;
		}

		public void setStandDiscountPrice(Double standDiscountPrice) {
			this.standDiscountPrice = standDiscountPrice;
		}

		public String getTradeAmount() {
			return this.tradeAmount;
		}

		public void setTradeAmount(String tradeAmount) {
			this.tradeAmount = tradeAmount;
		}

		public String getOriginalAmount() {
			return this.originalAmount;
		}

		public void setOriginalAmount(String originalAmount) {
			this.originalAmount = originalAmount;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getDiscountAmount() {
			return this.discountAmount;
		}

		public void setDiscountAmount(String discountAmount) {
			this.discountAmount = discountAmount;
		}

		public Boolean getContractActivity() {
			return this.contractActivity;
		}

		public void setContractActivity(Boolean contractActivity) {
			this.contractActivity = contractActivity;
		}

		public String getOptionalPromotions() {
			return this.optionalPromotions;
		}

		public void setOptionalPromotions(String optionalPromotions) {
			this.optionalPromotions = optionalPromotions;
		}

		public String getCurrency() {
			return this.currency;
		}

		public void setCurrency(String currency) {
			this.currency = currency;
		}

		public String getPromDetailList() {
			return this.promDetailList;
		}

		public void setPromDetailList(String promDetailList) {
			this.promDetailList = promDetailList;
		}

		public Double getTotalCostAmount() {
			return this.totalCostAmount;
		}

		public void setTotalCostAmount(Double totalCostAmount) {
			this.totalCostAmount = totalCostAmount;
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

			private String couponNo;

			private String activityCategory;

			private String description;

			private Double priceBreakReduceValue;

			private Double canPromFee;

			private String promotionOptionCode;

			private String isSelected;

			private Map<Object,Object> activityExtInfo;

			private String optionCode;

			private String name;

			private Boolean effective;

			private Double priceBreakThreshold;

			private Double lackForPriceBreak;

			private List<Long> promotionRuleIdList6;

			private List<String> targetArticleItemCodes7;

			public String getCouponNo() {
				return this.couponNo;
			}

			public void setCouponNo(String couponNo) {
				this.couponNo = couponNo;
			}

			public String getActivityCategory() {
				return this.activityCategory;
			}

			public void setActivityCategory(String activityCategory) {
				this.activityCategory = activityCategory;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public Double getPriceBreakReduceValue() {
				return this.priceBreakReduceValue;
			}

			public void setPriceBreakReduceValue(Double priceBreakReduceValue) {
				this.priceBreakReduceValue = priceBreakReduceValue;
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

			public String getIsSelected() {
				return this.isSelected;
			}

			public void setIsSelected(String isSelected) {
				this.isSelected = isSelected;
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

			public Double getPriceBreakThreshold() {
				return this.priceBreakThreshold;
			}

			public void setPriceBreakThreshold(Double priceBreakThreshold) {
				this.priceBreakThreshold = priceBreakThreshold;
			}

			public Double getLackForPriceBreak() {
				return this.lackForPriceBreak;
			}

			public void setLackForPriceBreak(Double lackForPriceBreak) {
				this.lackForPriceBreak = lackForPriceBreak;
			}

			public List<Long> getPromotionRuleIdList6() {
				return this.promotionRuleIdList6;
			}

			public void setPromotionRuleIdList6(List<Long> promotionRuleIdList6) {
				this.promotionRuleIdList6 = promotionRuleIdList6;
			}

			public List<String> getTargetArticleItemCodes7() {
				return this.targetArticleItemCodes7;
			}

			public void setTargetArticleItemCodes7(List<String> targetArticleItemCodes7) {
				this.targetArticleItemCodes7 = targetArticleItemCodes7;
			}
		}

		public static class DepreciateInfo5 {

			private Double cheapRate;

			private Double differential;

			private String differentialName;

			private Double monthPrice;

			private Double cheapStandAmount;

			private Double originalStandAmount;

			private String isShow;

			private Double listPrice;

			private Boolean isContractActivity;

			private ContractActivity8 contractActivity8;

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

			public Double getCheapStandAmount() {
				return this.cheapStandAmount;
			}

			public void setCheapStandAmount(Double cheapStandAmount) {
				this.cheapStandAmount = cheapStandAmount;
			}

			public Double getOriginalStandAmount() {
				return this.originalStandAmount;
			}

			public void setOriginalStandAmount(Double originalStandAmount) {
				this.originalStandAmount = originalStandAmount;
			}

			public String getIsShow() {
				return this.isShow;
			}

			public void setIsShow(String isShow) {
				this.isShow = isShow;
			}

			public Double getListPrice() {
				return this.listPrice;
			}

			public void setListPrice(Double listPrice) {
				this.listPrice = listPrice;
			}

			public Boolean getIsContractActivity() {
				return this.isContractActivity;
			}

			public void setIsContractActivity(Boolean isContractActivity) {
				this.isContractActivity = isContractActivity;
			}

			public ContractActivity8 getContractActivity8() {
				return this.contractActivity8;
			}

			public void setContractActivity8(ContractActivity8 contractActivity8) {
				this.contractActivity8 = contractActivity8;
			}

			public static class ContractActivity8 {

				private String activityName;

				private Double finalPromFee;

				private Long activityId;

				private Double prodFee;

				private String optionCode;

				private Double finalFee;

				private List<Long> optionIds9;

				public String getActivityName() {
					return this.activityName;
				}

				public void setActivityName(String activityName) {
					this.activityName = activityName;
				}

				public Double getFinalPromFee() {
					return this.finalPromFee;
				}

				public void setFinalPromFee(Double finalPromFee) {
					this.finalPromFee = finalPromFee;
				}

				public Long getActivityId() {
					return this.activityId;
				}

				public void setActivityId(Long activityId) {
					this.activityId = activityId;
				}

				public Double getProdFee() {
					return this.prodFee;
				}

				public void setProdFee(Double prodFee) {
					this.prodFee = prodFee;
				}

				public String getOptionCode() {
					return this.optionCode;
				}

				public void setOptionCode(String optionCode) {
					this.optionCode = optionCode;
				}

				public Double getFinalFee() {
					return this.finalFee;
				}

				public void setFinalFee(Double finalFee) {
					this.finalFee = finalFee;
				}

				public List<Long> getOptionIds9() {
					return this.optionIds9;
				}

				public void setOptionIds9(List<Long> optionIds9) {
					this.optionIds9 = optionIds9;
				}
			}
		}
	}

	@Override
	public DescribePriceResponse getInstance(UnmarshallerContext context) {
		return	DescribePriceResponseUnmarshaller.unmarshall(this, context);
	}
}
