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
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class RegistrantProfileRealNameVerificationRequest extends RpcAcsRequest<RegistrantProfileRealNameVerificationResponse> {
	
	public RegistrantProfileRealNameVerificationRequest() {
		super("Domain-intl", "2017-12-18", "RegistrantProfileRealNameVerification", "domain");
		setMethod(MethodType.POST);
	}

	private String identityCredentialType;

	private String userClientIp;

	private Long registrantProfileID;

	private String identityCredential;

	private String lang;

	private String identityCredentialNo;

	public String getIdentityCredentialType() {
		return this.identityCredentialType;
	}

	public void setIdentityCredentialType(String identityCredentialType) {
		this.identityCredentialType = identityCredentialType;
		if(identityCredentialType != null){
			putQueryParameter("IdentityCredentialType", identityCredentialType);
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

	public Long getRegistrantProfileID() {
		return this.registrantProfileID;
	}

	public void setRegistrantProfileID(Long registrantProfileID) {
		this.registrantProfileID = registrantProfileID;
		if(registrantProfileID != null){
			putQueryParameter("RegistrantProfileID", registrantProfileID.toString());
		}
	}

	public String getIdentityCredential() {
		return this.identityCredential;
	}

	public void setIdentityCredential(String identityCredential) {
		this.identityCredential = identityCredential;
		if(identityCredential != null){
			putBodyParameter("IdentityCredential", identityCredential);
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

	public String getIdentityCredentialNo() {
		return this.identityCredentialNo;
	}

	public void setIdentityCredentialNo(String identityCredentialNo) {
		this.identityCredentialNo = identityCredentialNo;
		if(identityCredentialNo != null){
			putQueryParameter("IdentityCredentialNo", identityCredentialNo);
		}
	}

	@Override
	public Class<RegistrantProfileRealNameVerificationResponse> getResponseClass() {
		return RegistrantProfileRealNameVerificationResponse.class;
	}

}
