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

package com.aliyuncs.account_crm.model.v20160606;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateAgAccountRequest extends RpcAcsRequest<CreateAgAccountResponse> {
	   

	private String securityMobile;

	private String loginEmail;

	private String own;

	private String mpk;

	private String nationCode;
	public CreateAgAccountRequest() {
		super("account-crm", "2016-06-06", "CreateAgAccount");
		setMethod(MethodType.POST);
	}

	public String getSecurityMobile() {
		return this.securityMobile;
	}

	public void setSecurityMobile(String securityMobile) {
		this.securityMobile = securityMobile;
		if(securityMobile != null){
			putQueryParameter("SecurityMobile", securityMobile);
		}
	}

	public String getLoginEmail() {
		return this.loginEmail;
	}

	public void setLoginEmail(String loginEmail) {
		this.loginEmail = loginEmail;
		if(loginEmail != null){
			putQueryParameter("LoginEmail", loginEmail);
		}
	}

	public String getOwn() {
		return this.own;
	}

	public void setOwn(String own) {
		this.own = own;
		if(own != null){
			putQueryParameter("Own", own);
		}
	}

	public String getMpk() {
		return this.mpk;
	}

	public void setMpk(String mpk) {
		this.mpk = mpk;
		if(mpk != null){
			putQueryParameter("Mpk", mpk);
		}
	}

	public String getNationCode() {
		return this.nationCode;
	}

	public void setNationCode(String nationCode) {
		this.nationCode = nationCode;
		if(nationCode != null){
			putQueryParameter("NationCode", nationCode);
		}
	}

	@Override
	public Class<CreateAgAccountResponse> getResponseClass() {
		return CreateAgAccountResponse.class;
	}

}
