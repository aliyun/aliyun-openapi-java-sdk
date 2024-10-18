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
public class SaveBatchTaskForCreatingOrderTransferRequest extends RpcAcsRequest<SaveBatchTaskForCreatingOrderTransferResponse> {
	   

	private List<OrderTransferParam> orderTransferParams;

	private String couponNo;

	private Boolean useCoupon;

	private String promotionNo;

	private String userClientIp;

	private String lang;

	private Boolean usePromotion;
	public SaveBatchTaskForCreatingOrderTransferRequest() {
		super("Domain", "2018-01-29", "SaveBatchTaskForCreatingOrderTransfer", "domain");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<OrderTransferParam> getOrderTransferParams() {
		return this.orderTransferParams;
	}

	public void setOrderTransferParams(List<OrderTransferParam> orderTransferParams) {
		this.orderTransferParams = orderTransferParams;	
		if (orderTransferParams != null) {
			for (int depth1 = 0; depth1 < orderTransferParams.size(); depth1++) {
				putQueryParameter("OrderTransferParam." + (depth1 + 1) + ".PermitPremiumTransfer" , orderTransferParams.get(depth1).getPermitPremiumTransfer());
				putQueryParameter("OrderTransferParam." + (depth1 + 1) + ".AuthorizationCode" , orderTransferParams.get(depth1).getAuthorizationCode());
				putQueryParameter("OrderTransferParam." + (depth1 + 1) + ".RegistrantProfileId" , orderTransferParams.get(depth1).getRegistrantProfileId());
				putQueryParameter("OrderTransferParam." + (depth1 + 1) + ".DomainName" , orderTransferParams.get(depth1).getDomainName());
			}
		}	
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

	public static class OrderTransferParam {

		private Boolean permitPremiumTransfer;

		private String authorizationCode;

		private Long registrantProfileId;

		private String domainName;

		public Boolean getPermitPremiumTransfer() {
			return this.permitPremiumTransfer;
		}

		public void setPermitPremiumTransfer(Boolean permitPremiumTransfer) {
			this.permitPremiumTransfer = permitPremiumTransfer;
		}

		public String getAuthorizationCode() {
			return this.authorizationCode;
		}

		public void setAuthorizationCode(String authorizationCode) {
			this.authorizationCode = authorizationCode;
		}

		public Long getRegistrantProfileId() {
			return this.registrantProfileId;
		}

		public void setRegistrantProfileId(Long registrantProfileId) {
			this.registrantProfileId = registrantProfileId;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}
	}

	@Override
	public Class<SaveBatchTaskForCreatingOrderTransferResponse> getResponseClass() {
		return SaveBatchTaskForCreatingOrderTransferResponse.class;
	}

}
