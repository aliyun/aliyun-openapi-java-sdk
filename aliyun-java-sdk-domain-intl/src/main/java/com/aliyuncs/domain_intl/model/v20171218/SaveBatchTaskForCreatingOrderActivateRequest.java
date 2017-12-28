/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.domain_intl.model.v20171218;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class SaveBatchTaskForCreatingOrderActivateRequest extends RpcAcsRequest<SaveBatchTaskForCreatingOrderActivateResponse> {
	
	public SaveBatchTaskForCreatingOrderActivateRequest() {
		super("Domain-intl", "2017-12-18", "SaveBatchTaskForCreatingOrderActivate", "domain");
	}

	private List<OrderActivateParam> orderActivateParams;

	private String userClientIp;

	private String lang;

	public List<OrderActivateParam> getOrderActivateParams() {
		return this.orderActivateParams;
	}

	public void setOrderActivateParams(List<OrderActivateParam> orderActivateParams) {
		this.orderActivateParams = orderActivateParams;	
		if (orderActivateParams != null) {
			for (int depth1 = 0; depth1 < orderActivateParams.size(); depth1++) {
				putQueryParameter("OrderActivateParam." + (depth1 + 1) + ".DomainName" , orderActivateParams.get(depth1).getDomainName());
				putQueryParameter("OrderActivateParam." + (depth1 + 1) + ".SubscriptionDuration" , orderActivateParams.get(depth1).getSubscriptionDuration());
				putQueryParameter("OrderActivateParam." + (depth1 + 1) + ".RegistrantProfileId" , orderActivateParams.get(depth1).getRegistrantProfileId());
				putQueryParameter("OrderActivateParam." + (depth1 + 1) + ".EnableDomainProxy" , orderActivateParams.get(depth1).getEnableDomainProxy());
				putQueryParameter("OrderActivateParam." + (depth1 + 1) + ".PermitPremiumActivation" , orderActivateParams.get(depth1).getPermitPremiumActivation());
			}
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

	public static class OrderActivateParam {

		private String domainName;

		private Integer subscriptionDuration;

		private Long registrantProfileId;

		private Boolean enableDomainProxy;

		private Boolean permitPremiumActivation;

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public Integer getSubscriptionDuration() {
			return this.subscriptionDuration;
		}

		public void setSubscriptionDuration(Integer subscriptionDuration) {
			this.subscriptionDuration = subscriptionDuration;
		}

		public Long getRegistrantProfileId() {
			return this.registrantProfileId;
		}

		public void setRegistrantProfileId(Long registrantProfileId) {
			this.registrantProfileId = registrantProfileId;
		}

		public Boolean getEnableDomainProxy() {
			return this.enableDomainProxy;
		}

		public void setEnableDomainProxy(Boolean enableDomainProxy) {
			this.enableDomainProxy = enableDomainProxy;
		}

		public Boolean getPermitPremiumActivation() {
			return this.permitPremiumActivation;
		}

		public void setPermitPremiumActivation(Boolean permitPremiumActivation) {
			this.permitPremiumActivation = permitPremiumActivation;
		}
	}

	@Override
	public Class<SaveBatchTaskForCreatingOrderActivateResponse> getResponseClass() {
		return SaveBatchTaskForCreatingOrderActivateResponse.class;
	}

}
