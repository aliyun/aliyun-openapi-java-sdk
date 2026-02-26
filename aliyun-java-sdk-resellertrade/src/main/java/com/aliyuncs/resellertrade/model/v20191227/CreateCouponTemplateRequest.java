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

package com.aliyuncs.resellertrade.model.v20191227;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import java.util.Map;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.resellertrade.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateCouponTemplateRequest extends RpcAcsRequest<CreateCouponTemplateResponse> {
	   

	private String reason;

	private String clientType;

	private Integer relativeSecond;

	private String couponType;

	private String controlType;

	private String userPkAmount;

	private String messageId;

	private String description;

	private String couponEndTime;

	private String startTime;

	private String type;

	private Long spId;

	private Integer usageCount;

	private String operator;

	private Long marketType;

	private Double certainMoney;

	private String useScene;

	private List<String> selectionIdSets;

	private Double couponAmount;

	private Currency currency;

	private String commodityType;

	private Double upperLimit;

	private String validityType;

	private List<String> orderTypeSets;

	private Double maxRelease;

	private Integer perLimitNum;

	private String fromApp;

	private String endTime;

	private Double discountRate;

	private Long promotionId;

	private String market;

	private String couponStartTime;

	private String site;

	private Long sellerId;

	private Map<String,String> extendsMap;

	private Integer activitySite;

	private String requestId;

	private String name;

	private String universalType;

	private List<String> itemCodeSets;

	private String couponFixedType;

	private Long bid;
	public CreateCouponTemplateRequest() {
		super("ResellerTrade", "2019-12-27", "CreateCouponTemplate");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
		if(reason != null){
			putBodyParameter("Reason", reason);
		}
	}

	public String getClientType() {
		return this.clientType;
	}

	public void setClientType(String clientType) {
		this.clientType = clientType;
		if(clientType != null){
			putBodyParameter("ClientType", clientType);
		}
	}

	public Integer getRelativeSecond() {
		return this.relativeSecond;
	}

	public void setRelativeSecond(Integer relativeSecond) {
		this.relativeSecond = relativeSecond;
		if(relativeSecond != null){
			putBodyParameter("RelativeSecond", relativeSecond.toString());
		}
	}

	public String getCouponType() {
		return this.couponType;
	}

	public void setCouponType(String couponType) {
		this.couponType = couponType;
		if(couponType != null){
			putBodyParameter("CouponType", couponType);
		}
	}

	public String getControlType() {
		return this.controlType;
	}

	public void setControlType(String controlType) {
		this.controlType = controlType;
		if(controlType != null){
			putBodyParameter("ControlType", controlType);
		}
	}

	public String getUserPkAmount() {
		return this.userPkAmount;
	}

	public void setUserPkAmount(String userPkAmount) {
		this.userPkAmount = userPkAmount;
		if(userPkAmount != null){
			putBodyParameter("UserPkAmount", userPkAmount);
		}
	}

	public String getMessageId() {
		return this.messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
		if(messageId != null){
			putBodyParameter("MessageId", messageId);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public String getCouponEndTime() {
		return this.couponEndTime;
	}

	public void setCouponEndTime(String couponEndTime) {
		this.couponEndTime = couponEndTime;
		if(couponEndTime != null){
			putBodyParameter("CouponEndTime", couponEndTime);
		}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putBodyParameter("StartTime", startTime);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type);
		}
	}

	public Long getSpId() {
		return this.spId;
	}

	public void setSpId(Long spId) {
		this.spId = spId;
		if(spId != null){
			putBodyParameter("SpId", spId.toString());
		}
	}

	public Integer getUsageCount() {
		return this.usageCount;
	}

	public void setUsageCount(Integer usageCount) {
		this.usageCount = usageCount;
		if(usageCount != null){
			putBodyParameter("UsageCount", usageCount.toString());
		}
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putBodyParameter("Operator", operator);
		}
	}

	public Long getMarketType() {
		return this.marketType;
	}

	public void setMarketType(Long marketType) {
		this.marketType = marketType;
		if(marketType != null){
			putBodyParameter("MarketType", marketType.toString());
		}
	}

	public Double getCertainMoney() {
		return this.certainMoney;
	}

	public void setCertainMoney(Double certainMoney) {
		this.certainMoney = certainMoney;
		if(certainMoney != null){
			putBodyParameter("CertainMoney", certainMoney.toString());
		}
	}

	public String getUseScene() {
		return this.useScene;
	}

	public void setUseScene(String useScene) {
		this.useScene = useScene;
		if(useScene != null){
			putBodyParameter("UseScene", useScene);
		}
	}

	public List<String> getSelectionIdSets() {
		return this.selectionIdSets;
	}

	public void setSelectionIdSets(List<String> selectionIdSets) {
		this.selectionIdSets = selectionIdSets;	
		if (selectionIdSets != null) {
			for (int i = 0; i < selectionIdSets.size(); i++) {
				putBodyParameter("SelectionIdSet." + (i + 1) , selectionIdSets.get(i));
			}
		}	
	}

	public Double getCouponAmount() {
		return this.couponAmount;
	}

	public void setCouponAmount(Double couponAmount) {
		this.couponAmount = couponAmount;
		if(couponAmount != null){
			putBodyParameter("CouponAmount", couponAmount.toString());
		}
	}

	public Currency getCurrency() {
		return this.currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;	
		if (currency != null) {
			
				putBodyParameter("Currency.DefaultFractionDigits" , currency.getDefaultFractionDigits());
				putBodyParameter("Currency.CurrencyCode" , currency.getCurrencyCode());
				putBodyParameter("Currency.NumericCode" , currency.getNumericCode());
		}	
	}

	public String getCommodityType() {
		return this.commodityType;
	}

	public void setCommodityType(String commodityType) {
		this.commodityType = commodityType;
		if(commodityType != null){
			putBodyParameter("CommodityType", commodityType);
		}
	}

	public Double getUpperLimit() {
		return this.upperLimit;
	}

	public void setUpperLimit(Double upperLimit) {
		this.upperLimit = upperLimit;
		if(upperLimit != null){
			putBodyParameter("UpperLimit", upperLimit.toString());
		}
	}

	public String getValidityType() {
		return this.validityType;
	}

	public void setValidityType(String validityType) {
		this.validityType = validityType;
		if(validityType != null){
			putBodyParameter("ValidityType", validityType);
		}
	}

	public List<String> getOrderTypeSets() {
		return this.orderTypeSets;
	}

	public void setOrderTypeSets(List<String> orderTypeSets) {
		this.orderTypeSets = orderTypeSets;	
		if (orderTypeSets != null) {
			for (int i = 0; i < orderTypeSets.size(); i++) {
				putBodyParameter("OrderTypeSet." + (i + 1) , orderTypeSets.get(i));
			}
		}	
	}

	public Double getMaxRelease() {
		return this.maxRelease;
	}

	public void setMaxRelease(Double maxRelease) {
		this.maxRelease = maxRelease;
		if(maxRelease != null){
			putBodyParameter("MaxRelease", maxRelease.toString());
		}
	}

	public Integer getPerLimitNum() {
		return this.perLimitNum;
	}

	public void setPerLimitNum(Integer perLimitNum) {
		this.perLimitNum = perLimitNum;
		if(perLimitNum != null){
			putBodyParameter("PerLimitNum", perLimitNum.toString());
		}
	}

	public String getFromApp() {
		return this.fromApp;
	}

	public void setFromApp(String fromApp) {
		this.fromApp = fromApp;
		if(fromApp != null){
			putBodyParameter("FromApp", fromApp);
		}
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putBodyParameter("EndTime", endTime);
		}
	}

	public Double getDiscountRate() {
		return this.discountRate;
	}

	public void setDiscountRate(Double discountRate) {
		this.discountRate = discountRate;
		if(discountRate != null){
			putBodyParameter("DiscountRate", discountRate.toString());
		}
	}

	public Long getPromotionId() {
		return this.promotionId;
	}

	public void setPromotionId(Long promotionId) {
		this.promotionId = promotionId;
		if(promotionId != null){
			putBodyParameter("PromotionId", promotionId.toString());
		}
	}

	public String getMarket() {
		return this.market;
	}

	public void setMarket(String market) {
		this.market = market;
		if(market != null){
			putBodyParameter("Market", market);
		}
	}

	public String getCouponStartTime() {
		return this.couponStartTime;
	}

	public void setCouponStartTime(String couponStartTime) {
		this.couponStartTime = couponStartTime;
		if(couponStartTime != null){
			putBodyParameter("CouponStartTime", couponStartTime);
		}
	}

	public String getSite() {
		return this.site;
	}

	public void setSite(String site) {
		this.site = site;
		if(site != null){
			putBodyParameter("Site", site);
		}
	}

	public Long getSellerId() {
		return this.sellerId;
	}

	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
		if(sellerId != null){
			putBodyParameter("SellerId", sellerId.toString());
		}
	}

	public Map<String,String> getExtendsMap() {
		return this.extendsMap;
	}

	public void setExtendsMap(Map<String,String> extendsMap) {
		this.extendsMap = extendsMap;	
		if (extendsMap != null) {
			for (String key1: extendsMap.keySet() ) {
				putBodyParameter("ExtendsMap.#" + key1.length() + "#" + key1 , extendsMap.get(key1));
			}
		}	
	}

	public Integer getActivitySite() {
		return this.activitySite;
	}

	public void setActivitySite(Integer activitySite) {
		this.activitySite = activitySite;
		if(activitySite != null){
			putBodyParameter("ActivitySite", activitySite.toString());
		}
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
		if(requestId != null){
			putBodyParameter("RequestId", requestId);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public String getUniversalType() {
		return this.universalType;
	}

	public void setUniversalType(String universalType) {
		this.universalType = universalType;
		if(universalType != null){
			putBodyParameter("UniversalType", universalType);
		}
	}

	public List<String> getItemCodeSets() {
		return this.itemCodeSets;
	}

	public void setItemCodeSets(List<String> itemCodeSets) {
		this.itemCodeSets = itemCodeSets;	
		if (itemCodeSets != null) {
			for (int i = 0; i < itemCodeSets.size(); i++) {
				putBodyParameter("ItemCodeSet." + (i + 1) , itemCodeSets.get(i));
			}
		}	
	}

	public String getCouponFixedType() {
		return this.couponFixedType;
	}

	public void setCouponFixedType(String couponFixedType) {
		this.couponFixedType = couponFixedType;
		if(couponFixedType != null){
			putBodyParameter("CouponFixedType", couponFixedType);
		}
	}

	public Long getBid() {
		return this.bid;
	}

	public void setBid(Long bid) {
		this.bid = bid;
		if(bid != null){
			putBodyParameter("Bid", bid.toString());
		}
	}

	public static class Currency {

		private Integer defaultFractionDigits;

		private String currencyCode;

		private Integer numericCode;

		public Integer getDefaultFractionDigits() {
			return this.defaultFractionDigits;
		}

		public void setDefaultFractionDigits(Integer defaultFractionDigits) {
			this.defaultFractionDigits = defaultFractionDigits;
		}

		public String getCurrencyCode() {
			return this.currencyCode;
		}

		public void setCurrencyCode(String currencyCode) {
			this.currencyCode = currencyCode;
		}

		public Integer getNumericCode() {
			return this.numericCode;
		}

		public void setNumericCode(Integer numericCode) {
			this.numericCode = numericCode;
		}
	}

	@Override
	public Class<CreateCouponTemplateResponse> getResponseClass() {
		return CreateCouponTemplateResponse.class;
	}

}
