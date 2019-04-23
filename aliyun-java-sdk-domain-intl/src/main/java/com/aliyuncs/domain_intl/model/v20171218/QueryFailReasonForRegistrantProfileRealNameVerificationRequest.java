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
public class QueryFailReasonForRegistrantProfileRealNameVerificationRequest extends RpcAcsRequest<QueryFailReasonForRegistrantProfileRealNameVerificationResponse> {
	
	public QueryFailReasonForRegistrantProfileRealNameVerificationRequest() {
		super("Domain-intl", "2017-12-18", "QueryFailReasonForRegistrantProfileRealNameVerification", "domain");
	}

	private String userClientIp;

	private Long registrantProfileID;

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

	public Long getRegistrantProfileID() {
		return this.registrantProfileID;
	}

	public void setRegistrantProfileID(Long registrantProfileID) {
		this.registrantProfileID = registrantProfileID;
		if(registrantProfileID != null){
			putQueryParameter("RegistrantProfileID", registrantProfileID.toString());
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
	public Class<QueryFailReasonForRegistrantProfileRealNameVerificationResponse> getResponseClass() {
		return QueryFailReasonForRegistrantProfileRealNameVerificationResponse.class;
	}

}
