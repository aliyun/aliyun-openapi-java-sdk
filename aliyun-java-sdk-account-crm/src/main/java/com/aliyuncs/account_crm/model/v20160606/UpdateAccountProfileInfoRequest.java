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
public class UpdateAccountProfileInfoRequest extends RpcAcsRequest<UpdateAccountProfileInfoResponse> {
	   

	private String trueName;

	private String firstName;

	private String cityJsonString;

	private String address;

	private String address2;

	private String postCode;

	private String lastName;

	private String head;

	private String phone;

	private String certType;

	private String accountAttribute;

	private String contactMethod;

	private String bindAlipayNo;

	private String pK;

	private String fax;

	private String provinceJsonString;
	public UpdateAccountProfileInfoRequest() {
		super("account-crm", "2016-06-06", "UpdateAccountProfileInfo");
		setMethod(MethodType.POST);
	}

	public String getTrueName() {
		return this.trueName;
	}

	public void setTrueName(String trueName) {
		this.trueName = trueName;
		if(trueName != null){
			putQueryParameter("TrueName", trueName);
		}
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
		if(firstName != null){
			putQueryParameter("FirstName", firstName);
		}
	}

	public String getCityJsonString() {
		return this.cityJsonString;
	}

	public void setCityJsonString(String cityJsonString) {
		this.cityJsonString = cityJsonString;
		if(cityJsonString != null){
			putQueryParameter("CityJsonString", cityJsonString);
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

	public String getAddress2() {
		return this.address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
		if(address2 != null){
			putQueryParameter("Address2", address2);
		}
	}

	public String getPostCode() {
		return this.postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
		if(postCode != null){
			putQueryParameter("PostCode", postCode);
		}
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
		if(lastName != null){
			putQueryParameter("LastName", lastName);
		}
	}

	public String getHead() {
		return this.head;
	}

	public void setHead(String head) {
		this.head = head;
		if(head != null){
			putQueryParameter("Head", head);
		}
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
		if(phone != null){
			putQueryParameter("Phone", phone);
		}
	}

	public String getCertType() {
		return this.certType;
	}

	public void setCertType(String certType) {
		this.certType = certType;
		if(certType != null){
			putQueryParameter("CertType", certType);
		}
	}

	public String getAccountAttribute() {
		return this.accountAttribute;
	}

	public void setAccountAttribute(String accountAttribute) {
		this.accountAttribute = accountAttribute;
		if(accountAttribute != null){
			putQueryParameter("AccountAttribute", accountAttribute);
		}
	}

	public String getContactMethod() {
		return this.contactMethod;
	}

	public void setContactMethod(String contactMethod) {
		this.contactMethod = contactMethod;
		if(contactMethod != null){
			putQueryParameter("ContactMethod", contactMethod);
		}
	}

	public String getBindAlipayNo() {
		return this.bindAlipayNo;
	}

	public void setBindAlipayNo(String bindAlipayNo) {
		this.bindAlipayNo = bindAlipayNo;
		if(bindAlipayNo != null){
			putQueryParameter("BindAlipayNo", bindAlipayNo);
		}
	}

	public String getPK() {
		return this.pK;
	}

	public void setPK(String pK) {
		this.pK = pK;
		if(pK != null){
			putQueryParameter("PK", pK);
		}
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
		if(fax != null){
			putQueryParameter("Fax", fax);
		}
	}

	public String getProvinceJsonString() {
		return this.provinceJsonString;
	}

	public void setProvinceJsonString(String provinceJsonString) {
		this.provinceJsonString = provinceJsonString;
		if(provinceJsonString != null){
			putQueryParameter("ProvinceJsonString", provinceJsonString);
		}
	}

	@Override
	public Class<UpdateAccountProfileInfoResponse> getResponseClass() {
		return UpdateAccountProfileInfoResponse.class;
	}

}
