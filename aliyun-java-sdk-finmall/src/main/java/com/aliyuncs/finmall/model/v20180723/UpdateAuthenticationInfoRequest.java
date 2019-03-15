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
public class UpdateAuthenticationInfoRequest extends RpcAcsRequest<UpdateAuthenticationInfoResponse> {
	
	public UpdateAuthenticationInfoRequest() {
		super("finmall", "2018-07-23", "UpdateAuthenticationInfo", "finmall");
	}

	private String idCardNumber;

	private String address;

	private String employeeEmail;

	private String employeePhoneNumber;

	private String phoneNumber;

	private String businessLicense;

	private String legalPersonName;

	private String userId;

	private String smsIvToken;

	private String bankCard;

	private String email;

	private String employeeName;

	private String employeeIdCardNumber;

	public String getIdCardNumber() {
		return this.idCardNumber;
	}

	public void setIdCardNumber(String idCardNumber) {
		this.idCardNumber = idCardNumber;
		if(idCardNumber != null){
			putBodyParameter("IdCardNumber", idCardNumber);
		}
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
		if(address != null){
			putBodyParameter("Address", address);
		}
	}

	public String getEmployeeEmail() {
		return this.employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
		if(employeeEmail != null){
			putBodyParameter("EmployeeEmail", employeeEmail);
		}
	}

	public String getEmployeePhoneNumber() {
		return this.employeePhoneNumber;
	}

	public void setEmployeePhoneNumber(String employeePhoneNumber) {
		this.employeePhoneNumber = employeePhoneNumber;
		if(employeePhoneNumber != null){
			putBodyParameter("EmployeePhoneNumber", employeePhoneNumber);
		}
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		if(phoneNumber != null){
			putBodyParameter("PhoneNumber", phoneNumber);
		}
	}

	public String getBusinessLicense() {
		return this.businessLicense;
	}

	public void setBusinessLicense(String businessLicense) {
		this.businessLicense = businessLicense;
		if(businessLicense != null){
			putBodyParameter("BusinessLicense", businessLicense);
		}
	}

	public String getLegalPersonName() {
		return this.legalPersonName;
	}

	public void setLegalPersonName(String legalPersonName) {
		this.legalPersonName = legalPersonName;
		if(legalPersonName != null){
			putBodyParameter("LegalPersonName", legalPersonName);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putBodyParameter("UserId", userId);
		}
	}

	public String getSmsIvToken() {
		return this.smsIvToken;
	}

	public void setSmsIvToken(String smsIvToken) {
		this.smsIvToken = smsIvToken;
		if(smsIvToken != null){
			putBodyParameter("SmsIvToken", smsIvToken);
		}
	}

	public String getBankCard() {
		return this.bankCard;
	}

	public void setBankCard(String bankCard) {
		this.bankCard = bankCard;
		if(bankCard != null){
			putBodyParameter("BankCard", bankCard);
		}
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
		if(email != null){
			putBodyParameter("Email", email);
		}
	}

	public String getEmployeeName() {
		return this.employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
		if(employeeName != null){
			putBodyParameter("EmployeeName", employeeName);
		}
	}

	public String getEmployeeIdCardNumber() {
		return this.employeeIdCardNumber;
	}

	public void setEmployeeIdCardNumber(String employeeIdCardNumber) {
		this.employeeIdCardNumber = employeeIdCardNumber;
		if(employeeIdCardNumber != null){
			putBodyParameter("EmployeeIdCardNumber", employeeIdCardNumber);
		}
	}

	@Override
	public Class<UpdateAuthenticationInfoResponse> getResponseClass() {
		return UpdateAuthenticationInfoResponse.class;
	}

}
