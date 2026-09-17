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

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribePriceRequest extends RpcAcsRequest<DescribePriceResponse> {
	   

	private String priceUnit;

	private String commodityType;

	private Integer period;

	private Integer amount;

	private PromotionOptions promotionOptions;

	private String instanceId;

	private Integer dataDiskSize;

	private String acceptLanguage;

	private String planId;

	private String payType;

	private String orderType;
	public DescribePriceRequest() {
		super("SWAS-OPEN", "2020-06-01", "DescribePrice", "SimpleApplicationServer");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getPriceUnit() {
		return this.priceUnit;
	}

	public void setPriceUnit(String priceUnit) {
		this.priceUnit = priceUnit;
		if(priceUnit != null){
			putQueryParameter("PriceUnit", priceUnit);
		}
	}

	public String getCommodityType() {
		return this.commodityType;
	}

	public void setCommodityType(String commodityType) {
		this.commodityType = commodityType;
		if(commodityType != null){
			putQueryParameter("CommodityType", commodityType);
		}
	}

	public Integer getPeriod() {
		return this.period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
		if(period != null){
			putQueryParameter("Period", period.toString());
		}
	}

	public Integer getAmount() {
		return this.amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
		if(amount != null){
			putQueryParameter("Amount", amount.toString());
		}
	}

	public PromotionOptions getPromotionOptions() {
		return this.promotionOptions;
	}

	public void setPromotionOptions(PromotionOptions promotionOptions) {
		this.promotionOptions = promotionOptions;	
		if (promotionOptions != null) {
			
				putQueryParameter("PromotionOptions.CouponNo" , promotionOptions.getCouponNo());
				putQueryParameter("PromotionOptions.ActivityId" , promotionOptions.getActivityId());
		}	
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public Integer getDataDiskSize() {
		return this.dataDiskSize;
	}

	public void setDataDiskSize(Integer dataDiskSize) {
		this.dataDiskSize = dataDiskSize;
		if(dataDiskSize != null){
			putQueryParameter("DataDiskSize", dataDiskSize.toString());
		}
	}

	public String getAcceptLanguage() {
		return this.acceptLanguage;
	}

	public void setAcceptLanguage(String acceptLanguage) {
		this.acceptLanguage = acceptLanguage;
		if(acceptLanguage != null){
			putQueryParameter("AcceptLanguage", acceptLanguage);
		}
	}

	public String getPlanId() {
		return this.planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
		if(planId != null){
			putQueryParameter("PlanId", planId);
		}
	}

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
		if(payType != null){
			putQueryParameter("PayType", payType);
		}
	}

	public String getOrderType() {
		return this.orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
		if(orderType != null){
			putQueryParameter("OrderType", orderType);
		}
	}

	public static class PromotionOptions {

		private String couponNo;

		private String activityId;

		public String getCouponNo() {
			return this.couponNo;
		}

		public void setCouponNo(String couponNo) {
			this.couponNo = couponNo;
		}

		public String getActivityId() {
			return this.activityId;
		}

		public void setActivityId(String activityId) {
			this.activityId = activityId;
		}
	}

	@Override
	public Class<DescribePriceResponse> getResponseClass() {
		return DescribePriceResponse.class;
	}

}
