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

package com.aliyuncs.dyvms.model.v20170620;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dyvms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class Create400NumberCorpIdentifyRequest extends RpcAcsRequest<Create400NumberCorpIdentifyResponse> {
	   

	private String corpCertNumber;

	private Long specId;

	private Long resourceOwnerId;

	private String corpRegisteredEffDate;

	private String corpCertType;

	private String corpRegisteredAddrCity;

	private String corpRegisteredAddrDetail;

	private String legalPersonName;

	private String legalPersonCertEffDate;

	private String businessLicensePic;

	private String corpRegisteredAddrProv;

	private String specIdArray;

	private String legalPersonCertType;

	private String corpNumber;

	private Integer oldOrderId;

	private String partnerId;

	private Integer buyCountLimit;

	private String resourceOwnerAccount;

	private String prodCode;

	private String corpRegisteredAddrArea;

	private String legalPersonCertPic;

	private Long ownerId;

	private String legalPersonCertExpDate;

	private String corpRegisteredExpDate;

	private String corpName;

	private String applyRemark;

	private String legalPersonPhoneNumber;

	private String legalPersonCertNumber;
	public Create400NumberCorpIdentifyRequest() {
		super("Dyvms", "2017-06-20", "Create400NumberCorpIdentify", "dyvms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCorpCertNumber() {
		return this.corpCertNumber;
	}

	public void setCorpCertNumber(String corpCertNumber) {
		this.corpCertNumber = corpCertNumber;
		if(corpCertNumber != null){
			putQueryParameter("CorpCertNumber", corpCertNumber);
		}
	}

	public Long getSpecId() {
		return this.specId;
	}

	public void setSpecId(Long specId) {
		this.specId = specId;
		if(specId != null){
			putQueryParameter("SpecId", specId.toString());
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getCorpRegisteredEffDate() {
		return this.corpRegisteredEffDate;
	}

	public void setCorpRegisteredEffDate(String corpRegisteredEffDate) {
		this.corpRegisteredEffDate = corpRegisteredEffDate;
		if(corpRegisteredEffDate != null){
			putQueryParameter("CorpRegisteredEffDate", corpRegisteredEffDate);
		}
	}

	public String getCorpCertType() {
		return this.corpCertType;
	}

	public void setCorpCertType(String corpCertType) {
		this.corpCertType = corpCertType;
		if(corpCertType != null){
			putQueryParameter("CorpCertType", corpCertType);
		}
	}

	public String getCorpRegisteredAddrCity() {
		return this.corpRegisteredAddrCity;
	}

	public void setCorpRegisteredAddrCity(String corpRegisteredAddrCity) {
		this.corpRegisteredAddrCity = corpRegisteredAddrCity;
		if(corpRegisteredAddrCity != null){
			putQueryParameter("CorpRegisteredAddrCity", corpRegisteredAddrCity);
		}
	}

	public String getCorpRegisteredAddrDetail() {
		return this.corpRegisteredAddrDetail;
	}

	public void setCorpRegisteredAddrDetail(String corpRegisteredAddrDetail) {
		this.corpRegisteredAddrDetail = corpRegisteredAddrDetail;
		if(corpRegisteredAddrDetail != null){
			putQueryParameter("CorpRegisteredAddrDetail", corpRegisteredAddrDetail);
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

	public String getLegalPersonCertEffDate() {
		return this.legalPersonCertEffDate;
	}

	public void setLegalPersonCertEffDate(String legalPersonCertEffDate) {
		this.legalPersonCertEffDate = legalPersonCertEffDate;
		if(legalPersonCertEffDate != null){
			putQueryParameter("LegalPersonCertEffDate", legalPersonCertEffDate);
		}
	}

	public String getBusinessLicensePic() {
		return this.businessLicensePic;
	}

	public void setBusinessLicensePic(String businessLicensePic) {
		this.businessLicensePic = businessLicensePic;
		if(businessLicensePic != null){
			putQueryParameter("BusinessLicensePic", businessLicensePic);
		}
	}

	public String getCorpRegisteredAddrProv() {
		return this.corpRegisteredAddrProv;
	}

	public void setCorpRegisteredAddrProv(String corpRegisteredAddrProv) {
		this.corpRegisteredAddrProv = corpRegisteredAddrProv;
		if(corpRegisteredAddrProv != null){
			putQueryParameter("CorpRegisteredAddrProv", corpRegisteredAddrProv);
		}
	}

	public String getSpecIdArray() {
		return this.specIdArray;
	}

	public void setSpecIdArray(String specIdArray) {
		this.specIdArray = specIdArray;
		if(specIdArray != null){
			putQueryParameter("SpecIdArray", specIdArray);
		}
	}

	public String getLegalPersonCertType() {
		return this.legalPersonCertType;
	}

	public void setLegalPersonCertType(String legalPersonCertType) {
		this.legalPersonCertType = legalPersonCertType;
		if(legalPersonCertType != null){
			putQueryParameter("LegalPersonCertType", legalPersonCertType);
		}
	}

	public String getCorpNumber() {
		return this.corpNumber;
	}

	public void setCorpNumber(String corpNumber) {
		this.corpNumber = corpNumber;
		if(corpNumber != null){
			putQueryParameter("CorpNumber", corpNumber);
		}
	}

	public Integer getOldOrderId() {
		return this.oldOrderId;
	}

	public void setOldOrderId(Integer oldOrderId) {
		this.oldOrderId = oldOrderId;
		if(oldOrderId != null){
			putQueryParameter("OldOrderId", oldOrderId.toString());
		}
	}

	public String getPartnerId() {
		return this.partnerId;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
		if(partnerId != null){
			putQueryParameter("PartnerId", partnerId);
		}
	}

	public Integer getBuyCountLimit() {
		return this.buyCountLimit;
	}

	public void setBuyCountLimit(Integer buyCountLimit) {
		this.buyCountLimit = buyCountLimit;
		if(buyCountLimit != null){
			putQueryParameter("BuyCountLimit", buyCountLimit.toString());
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getProdCode() {
		return this.prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
		if(prodCode != null){
			putQueryParameter("ProdCode", prodCode);
		}
	}

	public String getCorpRegisteredAddrArea() {
		return this.corpRegisteredAddrArea;
	}

	public void setCorpRegisteredAddrArea(String corpRegisteredAddrArea) {
		this.corpRegisteredAddrArea = corpRegisteredAddrArea;
		if(corpRegisteredAddrArea != null){
			putQueryParameter("CorpRegisteredAddrArea", corpRegisteredAddrArea);
		}
	}

	public String getLegalPersonCertPic() {
		return this.legalPersonCertPic;
	}

	public void setLegalPersonCertPic(String legalPersonCertPic) {
		this.legalPersonCertPic = legalPersonCertPic;
		if(legalPersonCertPic != null){
			putQueryParameter("LegalPersonCertPic", legalPersonCertPic);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getLegalPersonCertExpDate() {
		return this.legalPersonCertExpDate;
	}

	public void setLegalPersonCertExpDate(String legalPersonCertExpDate) {
		this.legalPersonCertExpDate = legalPersonCertExpDate;
		if(legalPersonCertExpDate != null){
			putQueryParameter("LegalPersonCertExpDate", legalPersonCertExpDate);
		}
	}

	public String getCorpRegisteredExpDate() {
		return this.corpRegisteredExpDate;
	}

	public void setCorpRegisteredExpDate(String corpRegisteredExpDate) {
		this.corpRegisteredExpDate = corpRegisteredExpDate;
		if(corpRegisteredExpDate != null){
			putQueryParameter("CorpRegisteredExpDate", corpRegisteredExpDate);
		}
	}

	public String getCorpName() {
		return this.corpName;
	}

	public void setCorpName(String corpName) {
		this.corpName = corpName;
		if(corpName != null){
			putQueryParameter("CorpName", corpName);
		}
	}

	public String getApplyRemark() {
		return this.applyRemark;
	}

	public void setApplyRemark(String applyRemark) {
		this.applyRemark = applyRemark;
		if(applyRemark != null){
			putQueryParameter("ApplyRemark", applyRemark);
		}
	}

	public String getLegalPersonPhoneNumber() {
		return this.legalPersonPhoneNumber;
	}

	public void setLegalPersonPhoneNumber(String legalPersonPhoneNumber) {
		this.legalPersonPhoneNumber = legalPersonPhoneNumber;
		if(legalPersonPhoneNumber != null){
			putQueryParameter("LegalPersonPhoneNumber", legalPersonPhoneNumber);
		}
	}

	public String getLegalPersonCertNumber() {
		return this.legalPersonCertNumber;
	}

	public void setLegalPersonCertNumber(String legalPersonCertNumber) {
		this.legalPersonCertNumber = legalPersonCertNumber;
		if(legalPersonCertNumber != null){
			putQueryParameter("LegalPersonCertNumber", legalPersonCertNumber);
		}
	}

	@Override
	public Class<Create400NumberCorpIdentifyResponse> getResponseClass() {
		return Create400NumberCorpIdentifyResponse.class;
	}

}
