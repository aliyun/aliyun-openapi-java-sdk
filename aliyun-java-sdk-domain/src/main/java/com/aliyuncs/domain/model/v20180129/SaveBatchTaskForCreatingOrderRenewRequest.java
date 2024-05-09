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

package com.aliyuncs.domain.model.v20180129;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.domain.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SaveBatchTaskForCreatingOrderRenewRequest extends RpcAcsRequest<SaveBatchTaskForCreatingOrderRenewResponse> {
	   

	private String couponNo;

	private Boolean useCoupon;

	private String promotionNo;

	private String userClientIp;

	private List<OrderRenewParam> orderRenewParams;

	private String lang;

	private Boolean usePromotion;
	public SaveBatchTaskForCreatingOrderRenewRequest() {
		super("Domain", "2018-01-29", "SaveBatchTaskForCreatingOrderRenew", "domain");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCouponNo() {
		return this.couponNo;
	}

	public void setCouponNo(String couponNo) {
		this.couponNo = couponNo;
		if(couponNo != null){
			putQueryParameter("CouponNo", couponNo);
		}
	}

	public Boolean getUseCoupon() {
		return this.useCoupon;
	}

	public void setUseCoupon(Boolean useCoupon) {
		this.useCoupon = useCoupon;
		if(useCoupon != null){
			putQueryParameter("UseCoupon", useCoupon.toString());
		}
	}

	public String getPromotionNo() {
		return this.promotionNo;
	}

	public void setPromotionNo(String promotionNo) {
		this.promotionNo = promotionNo;
		if(promotionNo != null){
			putQueryParameter("PromotionNo", promotionNo);
		}
	}

	public String getUserClientIp() {
		return this.userClientIp;
	}

	public void setUserClientIp(String userClientIp) {
		this.userClientIp = userClientIp;
		if(userClientIp != null){
			putQueryParameter("UserClientIp", userClientIp);
		}
	}

	public List<OrderRenewParam> getOrderRenewParams() {
		return this.orderRenewParams;
	}

	public void setOrderRenewParams(List<OrderRenewParam> orderRenewParams) {
		this.orderRenewParams = orderRenewParams;	
		if (orderRenewParams != null) {
			for (int depth1 = 0; depth1 < orderRenewParams.size(); depth1++) {
				putQueryParameter("OrderRenewParam." + (depth1 + 1) + ".SubscriptionDuration" , orderRenewParams.get(depth1).getSubscriptionDuration());
				putQueryParameter("OrderRenewParam." + (depth1 + 1) + ".CurrentExpirationDate" , orderRenewParams.get(depth1).getCurrentExpirationDate());
				putQueryParameter("OrderRenewParam." + (depth1 + 1) + ".DomainName" , orderRenewParams.get(depth1).getDomainName());
			}
		}	
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public Boolean getUsePromotion() {
		return this.usePromotion;
	}

	public void setUsePromotion(Boolean usePromotion) {
		this.usePromotion = usePromotion;
		if(usePromotion != null){
			putQueryParameter("UsePromotion", usePromotion.toString());
		}
	}

	public static class OrderRenewParam {

		private Integer subscriptionDuration;

		private Long currentExpirationDate;

		private String domainName;

		public Integer getSubscriptionDuration() {
			return this.subscriptionDuration;
		}

		public void setSubscriptionDuration(Integer subscriptionDuration) {
			this.subscriptionDuration = subscriptionDuration;
		}

		public Long getCurrentExpirationDate() {
			return this.currentExpirationDate;
		}

		public void setCurrentExpirationDate(Long currentExpirationDate) {
			this.currentExpirationDate = currentExpirationDate;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}
	}

	@Override
	public Class<SaveBatchTaskForCreatingOrderRenewResponse> getResponseClass() {
		return SaveBatchTaskForCreatingOrderRenewResponse.class;
	}

}
