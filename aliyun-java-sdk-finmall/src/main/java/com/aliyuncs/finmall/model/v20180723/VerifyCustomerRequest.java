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

package com.aliyuncs.finmall.model.v20180723;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class VerifyCustomerRequest extends RpcAcsRequest<VerifyCustomerResponse> {
	
	public VerifyCustomerRequest() {
		super("finmall", "2018-07-23", "VerifyCustomer", "finmall");
	}

	private String idCardNumber;

	private String address;

	private String idCardFrontPage;

	private String phoneNumber;

	private String businessLicense;

	private String idCardBackPage;

	private String legalPersonName;

	private String enterpriseName;

	private String userId;

	private String loanSubject;

	private String zhimaReturnUrl;

	private String bankCard;

	private String email;

	public String getIdCardNumber() {
		return this.idCardNumber;
	}

	public void setIdCardNumber(String idCardNumber) {
		this.idCardNumber = idCardNumber;
		if(idCardNumber != null){
			putQueryParameter("IdCardNumber", idCardNumber);
		}
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
		if(address != null){
			putQueryParameter("Address", address);
		}
	}

	public String getIdCardFrontPage() {
		return this.idCardFrontPage;
	}

	public void setIdCardFrontPage(String idCardFrontPage) {
		this.idCardFrontPage = idCardFrontPage;
		if(idCardFrontPage != null){
			putQueryParameter("IdCardFrontPage", idCardFrontPage);
		}
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		if(phoneNumber != null){
			putQueryParameter("PhoneNumber", phoneNumber);
		}
	}

	public String getBusinessLicense() {
		return this.businessLicense;
	}

	public void setBusinessLicense(String businessLicense) {
		this.businessLicense = businessLicense;
		if(businessLicense != null){
			putQueryParameter("BusinessLicense", businessLicense);
		}
	}

	public String getIdCardBackPage() {
		return this.idCardBackPage;
	}

	public void setIdCardBackPage(String idCardBackPage) {
		this.idCardBackPage = idCardBackPage;
		if(idCardBackPage != null){
			putQueryParameter("IdCardBackPage", idCardBackPage);
		}
	}

	public String getLegalPersonName() {
		return this.legalPersonName;
	}

	public void setLegalPersonName(String legalPersonName) {
		this.legalPersonName = legalPersonName;
		if(legalPersonName != null){
			putQueryParameter("LegalPersonName", legalPersonName);
		}
	}

	public String getEnterpriseName() {
		return this.enterpriseName;
	}

	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
		if(enterpriseName != null){
			putQueryParameter("EnterpriseName", enterpriseName);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
		}
	}

	public String getLoanSubject() {
		return this.loanSubject;
	}

	public void setLoanSubject(String loanSubject) {
		this.loanSubject = loanSubject;
		if(loanSubject != null){
			putQueryParameter("LoanSubject", loanSubject);
		}
	}

	public String getZhimaReturnUrl() {
		return this.zhimaReturnUrl;
	}

	public void setZhimaReturnUrl(String zhimaReturnUrl) {
		this.zhimaReturnUrl = zhimaReturnUrl;
		if(zhimaReturnUrl != null){
			putQueryParameter("ZhimaReturnUrl", zhimaReturnUrl);
		}
	}

	public String getBankCard() {
		return this.bankCard;
	}

	public void setBankCard(String bankCard) {
		this.bankCard = bankCard;
		if(bankCard != null){
			putQueryParameter("BankCard", bankCard);
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
	public Class<VerifyCustomerResponse> getResponseClass() {
		return VerifyCustomerResponse.class;
	}

}
