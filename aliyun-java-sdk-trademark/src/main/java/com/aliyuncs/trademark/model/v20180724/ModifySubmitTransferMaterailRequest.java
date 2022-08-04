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
public class ModifySubmitTransferMaterailRequest extends RpcAcsRequest<ModifySubmitTransferMaterailResponse> {
	   

	private String contactEmail;

	private String note;

	private String other;

	private String notarization;

	private String buyerBusinessLicense;

	private String contactName;

	private String assigneeProxy;

	private String cardType;

	private String addr;

	private String contactMobile;

	private String sellerProxy;

	private String cardNo;

	private String registrationCert;

	private String buyerIdCard;

	private String sellerIdCard;

	private String sellerApply;

	private String buyerBusinessLicenseTranslation;

	private String sellerBusinessLicenseTranslation;

	private String bizId;

	private String name;

	private String sellerBusinessLicense;

	private Boolean complete;
	public ModifySubmitTransferMaterailRequest() {
		super("Trademark", "2018-07-24", "ModifySubmitTransferMaterail");
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

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
		if(note != null){
			putQueryParameter("Note", note);
		}
	}

	public String getOther() {
		return this.other;
	}

	public void setOther(String other) {
		this.other = other;
		if(other != null){
			putBodyParameter("Other", other);
		}
	}

	public String getNotarization() {
		return this.notarization;
	}

	public void setNotarization(String notarization) {
		this.notarization = notarization;
		if(notarization != null){
			putBodyParameter("Notarization", notarization);
		}
	}

	public String getBuyerBusinessLicense() {
		return this.buyerBusinessLicense;
	}

	public void setBuyerBusinessLicense(String buyerBusinessLicense) {
		this.buyerBusinessLicense = buyerBusinessLicense;
		if(buyerBusinessLicense != null){
			putBodyParameter("BuyerBusinessLicense", buyerBusinessLicense);
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

	public String getAssigneeProxy() {
		return this.assigneeProxy;
	}

	public void setAssigneeProxy(String assigneeProxy) {
		this.assigneeProxy = assigneeProxy;
		if(assigneeProxy != null){
			putQueryParameter("AssigneeProxy", assigneeProxy);
		}
	}

	public String getCardType() {
		return this.cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
		if(cardType != null){
			putBodyParameter("CardType", cardType);
		}
	}

	public String getAddr() {
		return this.addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
		if(addr != null){
			putBodyParameter("Addr", addr);
		}
	}

	public String getContactMobile() {
		return this.contactMobile;
	}

	public void setContactMobile(String contactMobile) {
		this.contactMobile = contactMobile;
		if(contactMobile != null){
			putBodyParameter("ContactMobile", contactMobile);
		}
	}

	public String getSellerProxy() {
		return this.sellerProxy;
	}

	public void setSellerProxy(String sellerProxy) {
		this.sellerProxy = sellerProxy;
		if(sellerProxy != null){
			putBodyParameter("SellerProxy", sellerProxy);
		}
	}

	public String getCardNo() {
		return this.cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
		if(cardNo != null){
			putBodyParameter("CardNo", cardNo);
		}
	}

	public String getRegistrationCert() {
		return this.registrationCert;
	}

	public void setRegistrationCert(String registrationCert) {
		this.registrationCert = registrationCert;
		if(registrationCert != null){
			putBodyParameter("RegistrationCert", registrationCert);
		}
	}

	public String getBuyerIdCard() {
		return this.buyerIdCard;
	}

	public void setBuyerIdCard(String buyerIdCard) {
		this.buyerIdCard = buyerIdCard;
		if(buyerIdCard != null){
			putBodyParameter("BuyerIdCard", buyerIdCard);
		}
	}

	public String getSellerIdCard() {
		return this.sellerIdCard;
	}

	public void setSellerIdCard(String sellerIdCard) {
		this.sellerIdCard = sellerIdCard;
		if(sellerIdCard != null){
			putBodyParameter("SellerIdCard", sellerIdCard);
		}
	}

	public String getSellerApply() {
		return this.sellerApply;
	}

	public void setSellerApply(String sellerApply) {
		this.sellerApply = sellerApply;
		if(sellerApply != null){
			putBodyParameter("SellerApply", sellerApply);
		}
	}

	public String getBuyerBusinessLicenseTranslation() {
		return this.buyerBusinessLicenseTranslation;
	}

	public void setBuyerBusinessLicenseTranslation(String buyerBusinessLicenseTranslation) {
		this.buyerBusinessLicenseTranslation = buyerBusinessLicenseTranslation;
		if(buyerBusinessLicenseTranslation != null){
			putQueryParameter("BuyerBusinessLicenseTranslation", buyerBusinessLicenseTranslation);
		}
	}

	public String getSellerBusinessLicenseTranslation() {
		return this.sellerBusinessLicenseTranslation;
	}

	public void setSellerBusinessLicenseTranslation(String sellerBusinessLicenseTranslation) {
		this.sellerBusinessLicenseTranslation = sellerBusinessLicenseTranslation;
		if(sellerBusinessLicenseTranslation != null){
			putQueryParameter("SellerBusinessLicenseTranslation", sellerBusinessLicenseTranslation);
		}
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putQueryParameter("BizId", bizId);
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

	public String getSellerBusinessLicense() {
		return this.sellerBusinessLicense;
	}

	public void setSellerBusinessLicense(String sellerBusinessLicense) {
		this.sellerBusinessLicense = sellerBusinessLicense;
		if(sellerBusinessLicense != null){
			putBodyParameter("SellerBusinessLicense", sellerBusinessLicense);
		}
	}

	public Boolean getComplete() {
		return this.complete;
	}

	public void setComplete(Boolean complete) {
		this.complete = complete;
		if(complete != null){
			putBodyParameter("Complete", complete.toString());
		}
	}

	@Override
	public Class<ModifySubmitTransferMaterailResponse> getResponseClass() {
		return ModifySubmitTransferMaterailResponse.class;
	}

}
