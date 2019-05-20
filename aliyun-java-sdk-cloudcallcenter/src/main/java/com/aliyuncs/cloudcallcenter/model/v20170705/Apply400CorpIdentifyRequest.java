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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class Apply400CorpIdentifyRequest extends RpcAcsRequest<Apply400CorpIdentifyResponse> {
	
	public Apply400CorpIdentifyRequest() {
		super("CloudCallCenter", "2017-07-05", "Apply400CorpIdentify", "CloudCallCenter", "innerAPI");
	}

	private String corpCertNumber;

	private String corpRegisteredEffDate;

	private String corpCertType;

	private String corpRegisteredAddrCity;

	private String corpRegisteredAddrArea;

	private String corpRegisteredAddrDetail;

	private String legalPersonCertPic;

	private String legalPersonName;

	private String legalPersonCertExpDate;

	private String legalPersonCertEffDate;

	private String businessLicensePic;

	private String corpRegisteredAddrProv;

	private String specIdArray;

	private String corpRegisteredExpDate;

	private String legalPersonCertType;

	private String corpNumber;

	private String corpName;

	private String applyRemark;

	private String oldOrderId;

	private String legalPersonPhoneNumber;

	private String legalPersonCertNumber;

	public String getCorpCertNumber() {
		return this.corpCertNumber;
	}

	public void setCorpCertNumber(String corpCertNumber) {
		this.corpCertNumber = corpCertNumber;
		if(corpCertNumber != null){
			putQueryParameter("CorpCertNumber", corpCertNumber);
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

	public String getCorpRegisteredAddrArea() {
		return this.corpRegisteredAddrArea;
	}

	public void setCorpRegisteredAddrArea(String corpRegisteredAddrArea) {
		this.corpRegisteredAddrArea = corpRegisteredAddrArea;
		if(corpRegisteredAddrArea != null){
			putQueryParameter("CorpRegisteredAddrArea", corpRegisteredAddrArea);
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

	public String getLegalPersonCertPic() {
		return this.legalPersonCertPic;
	}

	public void setLegalPersonCertPic(String legalPersonCertPic) {
		this.legalPersonCertPic = legalPersonCertPic;
		if(legalPersonCertPic != null){
			putQueryParameter("LegalPersonCertPic", legalPersonCertPic);
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

	public String getLegalPersonCertExpDate() {
		return this.legalPersonCertExpDate;
	}

	public void setLegalPersonCertExpDate(String legalPersonCertExpDate) {
		this.legalPersonCertExpDate = legalPersonCertExpDate;
		if(legalPersonCertExpDate != null){
			putQueryParameter("LegalPersonCertExpDate", legalPersonCertExpDate);
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

	public String getCorpRegisteredExpDate() {
		return this.corpRegisteredExpDate;
	}

	public void setCorpRegisteredExpDate(String corpRegisteredExpDate) {
		this.corpRegisteredExpDate = corpRegisteredExpDate;
		if(corpRegisteredExpDate != null){
			putQueryParameter("CorpRegisteredExpDate", corpRegisteredExpDate);
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

	public String getOldOrderId() {
		return this.oldOrderId;
	}

	public void setOldOrderId(String oldOrderId) {
		this.oldOrderId = oldOrderId;
		if(oldOrderId != null){
			putQueryParameter("OldOrderId", oldOrderId);
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
	public Class<Apply400CorpIdentifyResponse> getResponseClass() {
		return Apply400CorpIdentifyResponse.class;
	}

}
