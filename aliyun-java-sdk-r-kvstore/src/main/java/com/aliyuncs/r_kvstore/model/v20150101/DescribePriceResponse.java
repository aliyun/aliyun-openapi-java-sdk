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

package com.aliyuncs.r_kvstore.model.v20150101;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.r_kvstore.transform.v20150101.DescribePriceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePriceResponse extends AcsResponse {

	private String orderParams;

	private String requestId;

	private List<Rule> rules;

	private List<SubOrder> subOrders;

	private Order order;

	public String getOrderParams() {
		return this.orderParams;
	}

	public void setOrderParams(String orderParams) {
		this.orderParams = orderParams;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Rule> getRules() {
		return this.rules;
	}

	public void setRules(List<Rule> rules) {
		this.rules = rules;
	}

	public List<SubOrder> getSubOrders() {
		return this.subOrders;
	}

	public void setSubOrders(List<SubOrder> subOrders) {
		this.subOrders = subOrders;
	}

	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
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

	public static class SubOrder {

		private String originalAmount;

		private String instanceId;

		private String discountAmount;

		private String tradeAmount;

		private Long standDiscountPrice;

		private Boolean isContractActivity;

		private Long standPrice;

		private Boolean contractActivity;

		private List<OptionalPromotion> optionalPromotions;

		private List<ModuleInstanceItem> moduleInstance;

		private List<PromDetail> promDetailList;

		private List<String> ruleIds;

		private DepreciateInfo depreciateInfo;

		public String getOriginalAmount() {
			return this.originalAmount;
		}

		public void setOriginalAmount(String originalAmount) {
			this.originalAmount = originalAmount;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
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

		public Long getStandDiscountPrice() {
			return this.standDiscountPrice;
		}

		public void setStandDiscountPrice(Long standDiscountPrice) {
			this.standDiscountPrice = standDiscountPrice;
		}

		public Boolean getIsContractActivity() {
			return this.isContractActivity;
		}

		public void setIsContractActivity(Boolean isContractActivity) {
			this.isContractActivity = isContractActivity;
		}

		public Long getStandPrice() {
			return this.standPrice;
		}

		public void setStandPrice(Long standPrice) {
			this.standPrice = standPrice;
		}

		public Boolean getContractActivity() {
			return this.contractActivity;
		}

		public void setContractActivity(Boolean contractActivity) {
			this.contractActivity = contractActivity;
		}

		public List<OptionalPromotion> getOptionalPromotions() {
			return this.optionalPromotions;
		}

		public void setOptionalPromotions(List<OptionalPromotion> optionalPromotions) {
			this.optionalPromotions = optionalPromotions;
		}

		public List<ModuleInstanceItem> getModuleInstance() {
			return this.moduleInstance;
		}

		public void setModuleInstance(List<ModuleInstanceItem> moduleInstance) {
			this.moduleInstance = moduleInstance;
		}

		public List<PromDetail> getPromDetailList() {
			return this.promDetailList;
		}

		public void setPromDetailList(List<PromDetail> promDetailList) {
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

		public static class OptionalPromotion {

			private Boolean selected;

			private String couponNo;

			private String name;

			private String description;

			private Boolean show;

			private Map<Object,Object> activityExtInfo;

			private String optionCode;

			private String promotionName;

			private String promotionOptionNo;

			private String canPromFee;

			public Boolean getSelected() {
				return this.selected;
			}

			public void setSelected(Boolean selected) {
				this.selected = selected;
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

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public Boolean getShow() {
				return this.show;
			}

			public void setShow(Boolean show) {
				this.show = show;
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

			public String getCanPromFee() {
				return this.canPromFee;
			}

			public void setCanPromFee(String canPromFee) {
				this.canPromFee = canPromFee;
			}
		}

		public static class ModuleInstanceItem {

			private String moduleCode;

			private String moduleId;

			private Double standPrice;

			private Boolean pricingModule;

			private String moduleName;

			private Double discountFee;

			private Double totalProductFee;

			private Boolean needOrderPay;

			private Double payFee;

			private Boolean contractActivity;

			private List<ModuleAttr> moduleAttrs;

			private DepreciateInfo1 depreciateInfo1;

			public String getModuleCode() {
				return this.moduleCode;
			}

			public void setModuleCode(String moduleCode) {
				this.moduleCode = moduleCode;
			}

			public String getModuleId() {
				return this.moduleId;
			}

			public void setModuleId(String moduleId) {
				this.moduleId = moduleId;
			}

			public Double getStandPrice() {
				return this.standPrice;
			}

			public void setStandPrice(Double standPrice) {
				this.standPrice = standPrice;
			}

			public Boolean getPricingModule() {
				return this.pricingModule;
			}

			public void setPricingModule(Boolean pricingModule) {
				this.pricingModule = pricingModule;
			}

			public String getModuleName() {
				return this.moduleName;
			}

			public void setModuleName(String moduleName) {
				this.moduleName = moduleName;
			}

			public Double getDiscountFee() {
				return this.discountFee;
			}

			public void setDiscountFee(Double discountFee) {
				this.discountFee = discountFee;
			}

			public Double getTotalProductFee() {
				return this.totalProductFee;
			}

			public void setTotalProductFee(Double totalProductFee) {
				this.totalProductFee = totalProductFee;
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

			public static class ModuleAttr {

				private Long type;

				private String value;

				private String code;

				private String name;

				public Long getType() {
					return this.type;
				}

				public void setType(Long type) {
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

				private Double listPrice;

				private Double originalStandAmount;

				private Double cheapStandAmount;

				private Double cheapRate;

				private Double differential;

				private String differentialName;

				private Double monthPrice;

				private Boolean isContractActivity;

				private Boolean isShow;

				private String startTime;

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

		public static class PromDetail {

			private String promotionName;

			private Long promotionId;

			private Double finalPromFee;

			private String optionCode;

			private String promType;

			private Map<Object,Object> activityExtInfo;

			private String derivedPromType;

			private String promotionCode;

			public String getPromotionName() {
				return this.promotionName;
			}

			public void setPromotionName(String promotionName) {
				this.promotionName = promotionName;
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

			public Map<Object,Object> getActivityExtInfo() {
				return this.activityExtInfo;
			}

			public void setActivityExtInfo(Map<Object,Object> activityExtInfo) {
				this.activityExtInfo = activityExtInfo;
			}

			public String getDerivedPromType() {
				return this.derivedPromType;
			}

			public void setDerivedPromType(String derivedPromType) {
				this.derivedPromType = derivedPromType;
			}

			public String getPromotionCode() {
				return this.promotionCode;
			}

			public void setPromotionCode(String promotionCode) {
				this.promotionCode = promotionCode;
			}
		}

		public static class DepreciateInfo {

			private Long listPrice;

			private Long originalStandAmount;

			private Long cheapStandAmount;

			private Long cheapRate;

			private Long differential;

			private String differentialName;

			private Long monthPrice;

			private Boolean isContractActivity;

			private String startTime;

			private ContractActivity contractActivity;

			public Long getListPrice() {
				return this.listPrice;
			}

			public void setListPrice(Long listPrice) {
				this.listPrice = listPrice;
			}

			public Long getOriginalStandAmount() {
				return this.originalStandAmount;
			}

			public void setOriginalStandAmount(Long originalStandAmount) {
				this.originalStandAmount = originalStandAmount;
			}

			public Long getCheapStandAmount() {
				return this.cheapStandAmount;
			}

			public void setCheapStandAmount(Long cheapStandAmount) {
				this.cheapStandAmount = cheapStandAmount;
			}

			public Long getCheapRate() {
				return this.cheapRate;
			}

			public void setCheapRate(Long cheapRate) {
				this.cheapRate = cheapRate;
			}

			public Long getDifferential() {
				return this.differential;
			}

			public void setDifferential(Long differential) {
				this.differential = differential;
			}

			public String getDifferentialName() {
				return this.differentialName;
			}

			public void setDifferentialName(String differentialName) {
				this.differentialName = differentialName;
			}

			public Long getMonthPrice() {
				return this.monthPrice;
			}

			public void setMonthPrice(Long monthPrice) {
				this.monthPrice = monthPrice;
			}

			public Boolean getIsContractActivity() {
				return this.isContractActivity;
			}

			public void setIsContractActivity(Boolean isContractActivity) {
				this.isContractActivity = isContractActivity;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
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

	public static class Order {

		private String originalAmount;

		private String handlingFeeAmount;

		private String currency;

		private String discountAmount;

		private String tradeAmount;

		private Boolean showDiscountInfo;

		private Long standDiscountPrice;

		private Boolean isContractActivity;

		private Long standPrice;

		private String code;

		private String message;

		private List<Coupon> coupons;

		private List<String> ruleIds2;

		private DepreciateInfo3 depreciateInfo3;

		public String getOriginalAmount() {
			return this.originalAmount;
		}

		public void setOriginalAmount(String originalAmount) {
			this.originalAmount = originalAmount;
		}

		public String getHandlingFeeAmount() {
			return this.handlingFeeAmount;
		}

		public void setHandlingFeeAmount(String handlingFeeAmount) {
			this.handlingFeeAmount = handlingFeeAmount;
		}

		public String getCurrency() {
			return this.currency;
		}

		public void setCurrency(String currency) {
			this.currency = currency;
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

		public Boolean getShowDiscountInfo() {
			return this.showDiscountInfo;
		}

		public void setShowDiscountInfo(Boolean showDiscountInfo) {
			this.showDiscountInfo = showDiscountInfo;
		}

		public Long getStandDiscountPrice() {
			return this.standDiscountPrice;
		}

		public void setStandDiscountPrice(Long standDiscountPrice) {
			this.standDiscountPrice = standDiscountPrice;
		}

		public Boolean getIsContractActivity() {
			return this.isContractActivity;
		}

		public void setIsContractActivity(Boolean isContractActivity) {
			this.isContractActivity = isContractActivity;
		}

		public Long getStandPrice() {
			return this.standPrice;
		}

		public void setStandPrice(Long standPrice) {
			this.standPrice = standPrice;
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

		public List<Coupon> getCoupons() {
			return this.coupons;
		}

		public void setCoupons(List<Coupon> coupons) {
			this.coupons = coupons;
		}

		public List<String> getRuleIds2() {
			return this.ruleIds2;
		}

		public void setRuleIds2(List<String> ruleIds2) {
			this.ruleIds2 = ruleIds2;
		}

		public DepreciateInfo3 getDepreciateInfo3() {
			return this.depreciateInfo3;
		}

		public void setDepreciateInfo3(DepreciateInfo3 depreciateInfo3) {
			this.depreciateInfo3 = depreciateInfo3;
		}

		public static class Coupon {

			private String isSelected;

			private String couponNo;

			private String name;

			private String description;

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

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}
		}

		public static class DepreciateInfo3 {

			private Long listPrice;

			private Long originalStandAmount;

			private Long cheapStandAmount;

			private Long cheapRate;

			private Long differential;

			private String differentialName;

			private Long monthPrice;

			private Boolean isContractActivity;

			private Boolean isShow;

			private ContractActivity4 contractActivity4;

			public Long getListPrice() {
				return this.listPrice;
			}

			public void setListPrice(Long listPrice) {
				this.listPrice = listPrice;
			}

			public Long getOriginalStandAmount() {
				return this.originalStandAmount;
			}

			public void setOriginalStandAmount(Long originalStandAmount) {
				this.originalStandAmount = originalStandAmount;
			}

			public Long getCheapStandAmount() {
				return this.cheapStandAmount;
			}

			public void setCheapStandAmount(Long cheapStandAmount) {
				this.cheapStandAmount = cheapStandAmount;
			}

			public Long getCheapRate() {
				return this.cheapRate;
			}

			public void setCheapRate(Long cheapRate) {
				this.cheapRate = cheapRate;
			}

			public Long getDifferential() {
				return this.differential;
			}

			public void setDifferential(Long differential) {
				this.differential = differential;
			}

			public String getDifferentialName() {
				return this.differentialName;
			}

			public void setDifferentialName(String differentialName) {
				this.differentialName = differentialName;
			}

			public Long getMonthPrice() {
				return this.monthPrice;
			}

			public void setMonthPrice(Long monthPrice) {
				this.monthPrice = monthPrice;
			}

			public Boolean getIsContractActivity() {
				return this.isContractActivity;
			}

			public void setIsContractActivity(Boolean isContractActivity) {
				this.isContractActivity = isContractActivity;
			}

			public Boolean getIsShow() {
				return this.isShow;
			}

			public void setIsShow(Boolean isShow) {
				this.isShow = isShow;
			}

			public ContractActivity4 getContractActivity4() {
				return this.contractActivity4;
			}

			public void setContractActivity4(ContractActivity4 contractActivity4) {
				this.contractActivity4 = contractActivity4;
			}

			public static class ContractActivity4 {

				private Double finalPromFee;

				private Double finalFee;

				private Double prodFee;

				private Long activityId;

				private String optionCode;

				private String activityName;

				private List<Long> optionIds5;

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

				public List<Long> getOptionIds5() {
					return this.optionIds5;
				}

				public void setOptionIds5(List<Long> optionIds5) {
					this.optionIds5 = optionIds5;
				}
			}
		}
	}

	@Override
	public DescribePriceResponse getInstance(UnmarshallerContext context) {
		return	DescribePriceResponseUnmarshaller.unmarshall(this, context);
	}
}
