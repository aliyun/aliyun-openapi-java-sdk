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
public class SubmitEmailVerificationRequest extends RpcAcsRequest<SubmitEmailVerificationResponse> {
	   

	private Boolean sendIfExist;

	private String userClientIp;

	private String lang;

	private String email;
	public SubmitEmailVerificationRequest() {
		super("Domain-intl", "2017-12-18", "SubmitEmailVerification");
		setMethod(MethodType.POST);
	}

	public Boolean getSendIfExist() {
		return this.sendIfExist;
	}

	public void setSendIfExist(Boolean sendIfExist) {
		this.sendIfExist = sendIfExist;
		if(sendIfExist != null){
			putQueryParameter("SendIfExist", sendIfExist.toString());
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

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
		if(email != null){
			putQueryParameter("Email", email);
		}
	}

	@Override
	public Class<SubmitEmailVerificationResponse> getResponseClass() {
		return SubmitEmailVerificationResponse.class;
	}

}
