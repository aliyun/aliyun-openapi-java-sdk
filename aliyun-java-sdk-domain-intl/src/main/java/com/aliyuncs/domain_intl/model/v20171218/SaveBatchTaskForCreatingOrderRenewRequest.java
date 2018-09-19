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

package com.aliyuncs.domain_intl.model.v20171218;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class SaveBatchTaskForCreatingOrderRenewRequest extends RpcAcsRequest<SaveBatchTaskForCreatingOrderRenewResponse> {
	
	public SaveBatchTaskForCreatingOrderRenewRequest() {
		super("Domain-intl", "2017-12-18", "SaveBatchTaskForCreatingOrderRenew", "domain");
	}

	private String userClientIp;

	private List<OrderRenewParam> orderRenewParams;

	private String lang;

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
