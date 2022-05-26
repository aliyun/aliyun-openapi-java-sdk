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
public class RegisterInternalAccountForBucRequest extends RpcAcsRequest<RegisterInternalAccountForBucResponse> {
	   

	private String nationalityCode;

	private Boolean isMobileConfirmed;

	private Boolean isEmailConfirmed;

	private String mobile;

	private String plainPassword;

	private String preferredLanguage;

	private Boolean isMobileLogin;

	private String bid;

	private String accountTypeCode;

	private String email;
	public RegisterInternalAccountForBucRequest() {
		super("account-crm", "2016-06-06", "RegisterInternalAccountForBuc");
		setMethod(MethodType.POST);
	}

	public String getNationalityCode() {
		return this.nationalityCode;
	}

	public void setNationalityCode(String nationalityCode) {
		this.nationalityCode = nationalityCode;
		if(nationalityCode != null){
			putQueryParameter("NationalityCode", nationalityCode);
		}
	}

	public Boolean getIsMobileConfirmed() {
		return this.isMobileConfirmed;
	}

	public void setIsMobileConfirmed(Boolean isMobileConfirmed) {
		this.isMobileConfirmed = isMobileConfirmed;
		if(isMobileConfirmed != null){
			putQueryParameter("IsMobileConfirmed", isMobileConfirmed.toString());
		}
	}

	public Boolean getIsEmailConfirmed() {
		return this.isEmailConfirmed;
	}

	public void setIsEmailConfirmed(Boolean isEmailConfirmed) {
		this.isEmailConfirmed = isEmailConfirmed;
		if(isEmailConfirmed != null){
			putQueryParameter("IsEmailConfirmed", isEmailConfirmed.toString());
		}
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
		if(mobile != null){
			putQueryParameter("Mobile", mobile);
		}
	}

	public String getPlainPassword() {
		return this.plainPassword;
	}

	public void setPlainPassword(String plainPassword) {
		this.plainPassword = plainPassword;
		if(plainPassword != null){
			putQueryParameter("PlainPassword", plainPassword);
		}
	}

	public String getPreferredLanguage() {
		return this.preferredLanguage;
	}

	public void setPreferredLanguage(String preferredLanguage) {
		this.preferredLanguage = preferredLanguage;
		if(preferredLanguage != null){
			putQueryParameter("PreferredLanguage", preferredLanguage);
		}
	}

	public Boolean getIsMobileLogin() {
		return this.isMobileLogin;
	}

	public void setIsMobileLogin(Boolean isMobileLogin) {
		this.isMobileLogin = isMobileLogin;
		if(isMobileLogin != null){
			putQueryParameter("IsMobileLogin", isMobileLogin.toString());
		}
	}

	public String getBid() {
		return this.bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
		if(bid != null){
			putQueryParameter("Bid", bid);
		}
	}

	public String getAccountTypeCode() {
		return this.accountTypeCode;
	}

	public void setAccountTypeCode(String accountTypeCode) {
		this.accountTypeCode = accountTypeCode;
		if(accountTypeCode != null){
			putQueryParameter("accountTypeCode", accountTypeCode);
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
	public Class<RegisterInternalAccountForBucResponse> getResponseClass() {
		return RegisterInternalAccountForBucResponse.class;
	}

}
