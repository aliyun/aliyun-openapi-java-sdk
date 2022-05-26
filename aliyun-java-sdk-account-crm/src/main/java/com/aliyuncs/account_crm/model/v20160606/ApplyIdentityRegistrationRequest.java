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
public class ApplyIdentityRegistrationRequest extends RpcAcsRequest<ApplyIdentityRegistrationResponse> {
	   

	private String docNum;

	private Integer accountType;

	private String docFrontPic;

	private String docType;

	private String registeredNum;

	private String registeredCountry;

	private String docBackPic;

	private String registeredAddress;

	private String customerId;

	private String tel;

	private String fullName;

	private String email;
	public ApplyIdentityRegistrationRequest() {
		super("account-crm", "2016-06-06", "ApplyIdentityRegistration");
		setMethod(MethodType.POST);
	}

	public String getDocNum() {
		return this.docNum;
	}

	public void setDocNum(String docNum) {
		this.docNum = docNum;
		if(docNum != null){
			putQueryParameter("DocNum", docNum);
		}
	}

	public Integer getAccountType() {
		return this.accountType;
	}

	public void setAccountType(Integer accountType) {
		this.accountType = accountType;
		if(accountType != null){
			putQueryParameter("AccountType", accountType.toString());
		}
	}

	public String getDocFrontPic() {
		return this.docFrontPic;
	}

	public void setDocFrontPic(String docFrontPic) {
		this.docFrontPic = docFrontPic;
		if(docFrontPic != null){
			putQueryParameter("DocFrontPic", docFrontPic);
		}
	}

	public String getDocType() {
		return this.docType;
	}

	public void setDocType(String docType) {
		this.docType = docType;
		if(docType != null){
			putQueryParameter("DocType", docType);
		}
	}

	public String getRegisteredNum() {
		return this.registeredNum;
	}

	public void setRegisteredNum(String registeredNum) {
		this.registeredNum = registeredNum;
		if(registeredNum != null){
			putQueryParameter("RegisteredNum", registeredNum);
		}
	}

	public String getRegisteredCountry() {
		return this.registeredCountry;
	}

	public void setRegisteredCountry(String registeredCountry) {
		this.registeredCountry = registeredCountry;
		if(registeredCountry != null){
			putQueryParameter("RegisteredCountry", registeredCountry);
		}
	}

	public String getDocBackPic() {
		return this.docBackPic;
	}

	public void setDocBackPic(String docBackPic) {
		this.docBackPic = docBackPic;
		if(docBackPic != null){
			putQueryParameter("DocBackPic", docBackPic);
		}
	}

	public String getRegisteredAddress() {
		return this.registeredAddress;
	}

	public void setRegisteredAddress(String registeredAddress) {
		this.registeredAddress = registeredAddress;
		if(registeredAddress != null){
			putQueryParameter("RegisteredAddress", registeredAddress);
		}
	}

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
		if(customerId != null){
			putQueryParameter("CustomerId", customerId);
		}
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
		if(tel != null){
			putQueryParameter("Tel", tel);
		}
	}

	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
		if(fullName != null){
			putQueryParameter("FullName", fullName);
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
	public Class<ApplyIdentityRegistrationResponse> getResponseClass() {
		return ApplyIdentityRegistrationResponse.class;
	}

}
