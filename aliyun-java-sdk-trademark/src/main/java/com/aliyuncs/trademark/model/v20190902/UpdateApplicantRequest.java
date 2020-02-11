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

package com.aliyuncs.trademark.model.v20190902;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.trademark.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateApplicantRequest extends RpcAcsRequest<UpdateApplicantResponse> {
	   

	private String contactEmail;

	private String eAddress;

	private String legalNoticeOssKey;

	private String contactNumber;

	private String contactName;

	private String passportOssKey;

	private String province;

	private String applicantName;

	private String contactAddress;

	private String authorizationOssKey;

	private String address;

	private String idCardOssKey;

	private String contactZipcode;

	private String eName;

	private String businessLicenceOssKey;

	private String cardNumber;

	private Long applicantId;
	public UpdateApplicantRequest() {
		super("Trademark", "2019-09-02", "UpdateApplicant");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getContactEmail() {
		return this.contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
		if(contactEmail != null){
			putQueryParameter("ContactEmail", contactEmail);
		}
	}

	public String getEAddress() {
		return this.eAddress;
	}

	public void setEAddress(String eAddress) {
		this.eAddress = eAddress;
		if(eAddress != null){
			putQueryParameter("EAddress", eAddress);
		}
	}

	public String getLegalNoticeOssKey() {
		return this.legalNoticeOssKey;
	}

	public void setLegalNoticeOssKey(String legalNoticeOssKey) {
		this.legalNoticeOssKey = legalNoticeOssKey;
		if(legalNoticeOssKey != null){
			putQueryParameter("LegalNoticeOssKey", legalNoticeOssKey);
		}
	}

	public String getContactNumber() {
		return this.contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
		if(contactNumber != null){
			putQueryParameter("ContactNumber", contactNumber);
		}
	}

	public String getContactName() {
		return this.contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
		if(contactName != null){
			putQueryParameter("ContactName", contactName);
		}
	}

	public String getPassportOssKey() {
		return this.passportOssKey;
	}

	public void setPassportOssKey(String passportOssKey) {
		this.passportOssKey = passportOssKey;
		if(passportOssKey != null){
			putQueryParameter("PassportOssKey", passportOssKey);
		}
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
		if(province != null){
			putQueryParameter("Province", province);
		}
	}

	public String getApplicantName() {
		return this.applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
		if(applicantName != null){
			putQueryParameter("ApplicantName", applicantName);
		}
	}

	public String getContactAddress() {
		return this.contactAddress;
	}

	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
		if(contactAddress != null){
			putQueryParameter("ContactAddress", contactAddress);
		}
	}

	public String getAuthorizationOssKey() {
		return this.authorizationOssKey;
	}

	public void setAuthorizationOssKey(String authorizationOssKey) {
		this.authorizationOssKey = authorizationOssKey;
		if(authorizationOssKey != null){
			putQueryParameter("AuthorizationOssKey", authorizationOssKey);
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

	public String getIdCardOssKey() {
		return this.idCardOssKey;
	}

	public void setIdCardOssKey(String idCardOssKey) {
		this.idCardOssKey = idCardOssKey;
		if(idCardOssKey != null){
			putQueryParameter("IdCardOssKey", idCardOssKey);
		}
	}

	public String getContactZipcode() {
		return this.contactZipcode;
	}

	public void setContactZipcode(String contactZipcode) {
		this.contactZipcode = contactZipcode;
		if(contactZipcode != null){
			putQueryParameter("ContactZipcode", contactZipcode);
		}
	}

	public String getEName() {
		return this.eName;
	}

	public void setEName(String eName) {
		this.eName = eName;
		if(eName != null){
			putQueryParameter("EName", eName);
		}
	}

	public String getBusinessLicenceOssKey() {
		return this.businessLicenceOssKey;
	}

	public void setBusinessLicenceOssKey(String businessLicenceOssKey) {
		this.businessLicenceOssKey = businessLicenceOssKey;
		if(businessLicenceOssKey != null){
			putQueryParameter("BusinessLicenceOssKey", businessLicenceOssKey);
		}
	}

	public String getCardNumber() {
		return this.cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
		if(cardNumber != null){
			putQueryParameter("CardNumber", cardNumber);
		}
	}

	public Long getApplicantId() {
		return this.applicantId;
	}

	public void setApplicantId(Long applicantId) {
		this.applicantId = applicantId;
		if(applicantId != null){
			putQueryParameter("ApplicantId", applicantId.toString());
		}
	}

	@Override
	public Class<UpdateApplicantResponse> getResponseClass() {
		return UpdateApplicantResponse.class;
	}

}
