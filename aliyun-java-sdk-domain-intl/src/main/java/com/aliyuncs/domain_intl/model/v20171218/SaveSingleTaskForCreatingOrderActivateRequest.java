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

/**
 * @author auto create
 * @version 
 */
public class SaveSingleTaskForCreatingOrderActivateRequest extends RpcAcsRequest<SaveSingleTaskForCreatingOrderActivateResponse> {
	
	public SaveSingleTaskForCreatingOrderActivateRequest() {
		super("Domain-intl", "2017-12-18", "SaveSingleTaskForCreatingOrderActivate", "domain");
	}

	private Integer subscriptionDuration;

	private Boolean permitPremiumActivation;

	private String userClientIp;

	private String domainName;

	private Long registrantProfileId;

	private Boolean enableDomainProxy;

	private String lang;

	public Integer getSubscriptionDuration() {
		return this.subscriptionDuration;
	}

	public void setSubscriptionDuration(Integer subscriptionDuration) {
		this.subscriptionDuration = subscriptionDuration;
		if(subscriptionDuration != null){
			putQueryParameter("SubscriptionDuration", subscriptionDuration.toString());
		}
	}

	public Boolean getPermitPremiumActivation() {
		return this.permitPremiumActivation;
	}

	public void setPermitPremiumActivation(Boolean permitPremiumActivation) {
		this.permitPremiumActivation = permitPremiumActivation;
		if(permitPremiumActivation != null){
			putQueryParameter("PermitPremiumActivation", permitPremiumActivation.toString());
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

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		if(domainName != null){
			putQueryParameter("DomainName", domainName);
		}
	}

	public Long getRegistrantProfileId() {
		return this.registrantProfileId;
	}

	public void setRegistrantProfileId(Long registrantProfileId) {
		this.registrantProfileId = registrantProfileId;
		if(registrantProfileId != null){
			putQueryParameter("RegistrantProfileId", registrantProfileId.toString());
		}
	}

	public Boolean getEnableDomainProxy() {
		return this.enableDomainProxy;
	}

	public void setEnableDomainProxy(Boolean enableDomainProxy) {
		this.enableDomainProxy = enableDomainProxy;
		if(enableDomainProxy != null){
			putQueryParameter("EnableDomainProxy", enableDomainProxy.toString());
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

	@Override
	public Class<SaveSingleTaskForCreatingOrderActivateResponse> getResponseClass() {
		return SaveSingleTaskForCreatingOrderActivateResponse.class;
	}

}
