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

package com.aliyuncs.trademark.model.v20180724;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.trademark.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SaveTradeMarkReviewMaterialDetailRequest extends RpcAcsRequest<SaveTradeMarkReviewMaterialDetailResponse> {
	   

	private String contactEmail;

	private String engName;

	private String country;

	private String legalNoticeOssKey;

	private String contactNumber;

	private String engAddress;

	private Integer type;

	private String contactName;

	private String passportOssKey;

	private String province;

	private Integer submitType;

	private String loaOssKey;

	private String contactAddress;

	private String address;

	private String idCardOssKey;

	private String applicationOssKey;

	private String businessLicenceOssKey;

	private String bizId;

	private String name;

	private String additionalOssKeyList;

	private String cardNumber;

	private Integer region;
	public SaveTradeMarkReviewMaterialDetailRequest() {
		super("Trademark", "2018-07-24", "SaveTradeMarkReviewMaterialDetail");
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
			putBodyParameter("ContactEmail", contactEmail);
		}
	}

	public String getEngName() {
		return this.engName;
	}

	public void setEngName(String engName) {
		this.engName = engName;
		if(engName != null){
			putBodyParameter("EngName", engName);
		}
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
		if(country != null){
			putBodyParameter("Country", country);
		}
	}

	public String getLegalNoticeOssKey() {
		return this.legalNoticeOssKey;
	}

	public void setLegalNoticeOssKey(String legalNoticeOssKey) {
		this.legalNoticeOssKey = legalNoticeOssKey;
		if(legalNoticeOssKey != null){
			putBodyParameter("LegalNoticeOssKey", legalNoticeOssKey);
		}
	}

	public String getContactNumber() {
		return this.contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
		if(contactNumber != null){
			putBodyParameter("ContactNumber", contactNumber);
		}
	}

	public String getEngAddress() {
		return this.engAddress;
	}

	public void setEngAddress(String engAddress) {
		this.engAddress = engAddress;
		if(engAddress != null){
			putBodyParameter("EngAddress", engAddress);
		}
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type.toString());
		}
	}

	public String getContactName() {
		return this.contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
		if(contactName != null){
			putBodyParameter("ContactName", contactName);
		}
	}

	public String getPassportOssKey() {
		return this.passportOssKey;
	}

	public void setPassportOssKey(String passportOssKey) {
		this.passportOssKey = passportOssKey;
		if(passportOssKey != null){
			putBodyParameter("PassportOssKey", passportOssKey);
		}
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
		if(province != null){
			putBodyParameter("Province", province);
		}
	}

	public Integer getSubmitType() {
		return this.submitType;
	}

	public void setSubmitType(Integer submitType) {
		this.submitType = submitType;
		if(submitType != null){
			putBodyParameter("SubmitType", submitType.toString());
		}
	}

	public String getLoaOssKey() {
		return this.loaOssKey;
	}

	public void setLoaOssKey(String loaOssKey) {
		this.loaOssKey = loaOssKey;
		if(loaOssKey != null){
			putBodyParameter("LoaOssKey", loaOssKey);
		}
	}

	public String getContactAddress() {
		return this.contactAddress;
	}

	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
		if(contactAddress != null){
			putBodyParameter("ContactAddress", contactAddress);
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

	public String getIdCardOssKey() {
		return this.idCardOssKey;
	}

	public void setIdCardOssKey(String idCardOssKey) {
		this.idCardOssKey = idCardOssKey;
		if(idCardOssKey != null){
			putBodyParameter("IdCardOssKey", idCardOssKey);
		}
	}

	public String getApplicationOssKey() {
		return this.applicationOssKey;
	}

	public void setApplicationOssKey(String applicationOssKey) {
		this.applicationOssKey = applicationOssKey;
		if(applicationOssKey != null){
			putBodyParameter("ApplicationOssKey", applicationOssKey);
		}
	}

	public String getBusinessLicenceOssKey() {
		return this.businessLicenceOssKey;
	}

	public void setBusinessLicenceOssKey(String businessLicenceOssKey) {
		this.businessLicenceOssKey = businessLicenceOssKey;
		if(businessLicenceOssKey != null){
			putBodyParameter("BusinessLicenceOssKey", businessLicenceOssKey);
		}
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putBodyParameter("BizId", bizId);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public String getAdditionalOssKeyList() {
		return this.additionalOssKeyList;
	}

	public void setAdditionalOssKeyList(String additionalOssKeyList) {
		this.additionalOssKeyList = additionalOssKeyList;
		if(additionalOssKeyList != null){
			putBodyParameter("AdditionalOssKeyList", additionalOssKeyList);
		}
	}

	public String getCardNumber() {
		return this.cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
		if(cardNumber != null){
			putBodyParameter("CardNumber", cardNumber);
		}
	}

	public Integer getRegion() {
		return this.region;
	}

	public void setRegion(Integer region) {
		this.region = region;
		if(region != null){
			putBodyParameter("Region", region.toString());
		}
	}

	@Override
	public Class<SaveTradeMarkReviewMaterialDetailResponse> getResponseClass() {
		return SaveTradeMarkReviewMaterialDetailResponse.class;
	}

}
