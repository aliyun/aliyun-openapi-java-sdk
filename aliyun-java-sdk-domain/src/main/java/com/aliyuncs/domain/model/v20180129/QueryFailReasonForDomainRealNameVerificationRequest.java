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

/**
 * @author auto create
 * @version 
 */
public class QueryFailReasonForDomainRealNameVerificationRequest extends RpcAcsRequest<QueryFailReasonForDomainRealNameVerificationResponse> {
	
	public QueryFailReasonForDomainRealNameVerificationRequest() {
		super("Domain", "2018-01-29", "QueryFailReasonForDomainRealNameVerification");
	}

	private String realNameVerificationAction;

	private String userClientIp;

	private String domainName;

	private String lang;

	public String getRealNameVerificationAction() {
		return this.realNameVerificationAction;
	}

	public void setRealNameVerificationAction(String realNameVerificationAction) {
		this.realNameVerificationAction = realNameVerificationAction;
		if(realNameVerificationAction != null){
			putQueryParameter("RealNameVerificationAction", realNameVerificationAction);
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
	public Class<QueryFailReasonForDomainRealNameVerificationResponse> getResponseClass() {
		return QueryFailReasonForDomainRealNameVerificationResponse.class;
	}

}
