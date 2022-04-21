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

package com.aliyuncs.cms.model.v20190101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateCmsOrderRequest extends RpcAcsRequest<CreateCmsOrderResponse> {
	   

	private String smsCount;

	private Boolean autoUseCoupon;

	private String logMonitorStream;

	private String customTimeSeries;

	private String apiCount;

	private String phoneCount;

	private Integer autoRenewPeriod;

	private Integer period;

	private Boolean autoPay;

	private String suggestType;

	private String eventStoreNum;

	private String siteTaskNum;

	private String periodUnit;

	private String siteOperatorNum;

	private String siteEcsNum;

	private String eventStoreTime;

	private String payType;
	public CreateCmsOrderRequest() {
		super("Cms", "2019-01-01", "CreateCmsOrder", "cms");
		setMethod(MethodType.POST);
	}

	public String getSmsCount() {
		return this.smsCount;
	}

	public void setSmsCount(String smsCount) {
		this.smsCount = smsCount;
		if(smsCount != null){
			putQueryParameter("SmsCount", smsCount);
		}
	}

	public Boolean getAutoUseCoupon() {
		return this.autoUseCoupon;
	}

	public void setAutoUseCoupon(Boolean autoUseCoupon) {
		this.autoUseCoupon = autoUseCoupon;
		if(autoUseCoupon != null){
			putQueryParameter("AutoUseCoupon", autoUseCoupon.toString());
		}
	}

	public String getLogMonitorStream() {
		return this.logMonitorStream;
	}

	public void setLogMonitorStream(String logMonitorStream) {
		this.logMonitorStream = logMonitorStream;
		if(logMonitorStream != null){
			putQueryParameter("LogMonitorStream", logMonitorStream);
		}
	}

	public String getCustomTimeSeries() {
		return this.customTimeSeries;
	}

	public void setCustomTimeSeries(String customTimeSeries) {
		this.customTimeSeries = customTimeSeries;
		if(customTimeSeries != null){
			putQueryParameter("CustomTimeSeries", customTimeSeries);
		}
	}

	public String getApiCount() {
		return this.apiCount;
	}

	public void setApiCount(String apiCount) {
		this.apiCount = apiCount;
		if(apiCount != null){
			putQueryParameter("ApiCount", apiCount);
		}
	}

	public String getPhoneCount() {
		return this.phoneCount;
	}

	public void setPhoneCount(String phoneCount) {
		this.phoneCount = phoneCount;
		if(phoneCount != null){
			putQueryParameter("PhoneCount", phoneCount);
		}
	}

	public Integer getAutoRenewPeriod() {
		return this.autoRenewPeriod;
	}

	public void setAutoRenewPeriod(Integer autoRenewPeriod) {
		this.autoRenewPeriod = autoRenewPeriod;
		if(autoRenewPeriod != null){
			putQueryParameter("AutoRenewPeriod", autoRenewPeriod.toString());
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

	public Boolean getAutoPay() {
		return this.autoPay;
	}

	public void setAutoPay(Boolean autoPay) {
		this.autoPay = autoPay;
		if(autoPay != null){
			putQueryParameter("AutoPay", autoPay.toString());
		}
	}

	public String getSuggestType() {
		return this.suggestType;
	}

	public void setSuggestType(String suggestType) {
		this.suggestType = suggestType;
		if(suggestType != null){
			putQueryParameter("SuggestType", suggestType);
		}
	}

	public String getEventStoreNum() {
		return this.eventStoreNum;
	}

	public void setEventStoreNum(String eventStoreNum) {
		this.eventStoreNum = eventStoreNum;
		if(eventStoreNum != null){
			putQueryParameter("EventStoreNum", eventStoreNum);
		}
	}

	public String getSiteTaskNum() {
		return this.siteTaskNum;
	}

	public void setSiteTaskNum(String siteTaskNum) {
		this.siteTaskNum = siteTaskNum;
		if(siteTaskNum != null){
			putQueryParameter("SiteTaskNum", siteTaskNum);
		}
	}

	public String getPeriodUnit() {
		return this.periodUnit;
	}

	public void setPeriodUnit(String periodUnit) {
		this.periodUnit = periodUnit;
		if(periodUnit != null){
			putQueryParameter("PeriodUnit", periodUnit);
		}
	}

	public String getSiteOperatorNum() {
		return this.siteOperatorNum;
	}

	public void setSiteOperatorNum(String siteOperatorNum) {
		this.siteOperatorNum = siteOperatorNum;
		if(siteOperatorNum != null){
			putQueryParameter("SiteOperatorNum", siteOperatorNum);
		}
	}

	public String getSiteEcsNum() {
		return this.siteEcsNum;
	}

	public void setSiteEcsNum(String siteEcsNum) {
		this.siteEcsNum = siteEcsNum;
		if(siteEcsNum != null){
			putQueryParameter("SiteEcsNum", siteEcsNum);
		}
	}

	public String getEventStoreTime() {
		return this.eventStoreTime;
	}

	public void setEventStoreTime(String eventStoreTime) {
		this.eventStoreTime = eventStoreTime;
		if(eventStoreTime != null){
			putQueryParameter("EventStoreTime", eventStoreTime);
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

	@Override
	public Class<CreateCmsOrderResponse> getResponseClass() {
		return CreateCmsOrderResponse.class;
	}

}
