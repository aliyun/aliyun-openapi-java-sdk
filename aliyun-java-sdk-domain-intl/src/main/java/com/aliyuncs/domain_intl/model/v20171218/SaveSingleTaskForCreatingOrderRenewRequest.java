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

/**
 * @author auto create
 * @version 
 */
public class SaveSingleTaskForCreatingOrderRenewRequest extends RpcAcsRequest<SaveSingleTaskForCreatingOrderRenewResponse> {
	
	public SaveSingleTaskForCreatingOrderRenewRequest() {
		super("Domain-intl", "2017-12-18", "SaveSingleTaskForCreatingOrderRenew", "domain");
	}

	private Integer subscriptionDuration;

	private Long currentExpirationDate;

	private String userClientIp;

	private String domainName;

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

	public Long getCurrentExpirationDate() {
		return this.currentExpirationDate;
	}

	public void setCurrentExpirationDate(Long currentExpirationDate) {
		this.currentExpirationDate = currentExpirationDate;
		if(currentExpirationDate != null){
			putQueryParameter("CurrentExpirationDate", currentExpirationDate.toString());
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
	public Class<SaveSingleTaskForCreatingOrderRenewResponse> getResponseClass() {
		return SaveSingleTaskForCreatingOrderRenewResponse.class;
	}

}
