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
public class ApplyCorpIdentifyRequest extends RpcAcsRequest<ApplyCorpIdentifyResponse> {
	
	public ApplyCorpIdentifyRequest() {
		super("CloudCallCenter", "2017-07-05", "ApplyCorpIdentify", "CloudCallCenter", "innerAPI");
	}

	private String managerContactPhoneNumber;

	private String numberApplicationLetterPic;

	private String businessLicenseAddress;

	private String organizationCode;

	private String regionNameProvince;

	private String telecomUndertakingPic;

	private String legalPersonName;

	private String businessTypeDesc;

	private Integer businessType;

	private String businessLicensePic;

	private String specIdArray;

	private String legalPersonrCertNumber;

	private String procedureDesc;

	private String registeredFundCode;

	private String managerName;

	private String managerCertPic;

	private String corpName;

	private String applyRemark;

	private String corporationCertPic;

	private String regionNameCity;

	private String managerCertNumber;

	public String getManagerContactPhoneNumber() {
		return this.managerContactPhoneNumber;
	}

	public void setManagerContactPhoneNumber(String managerContactPhoneNumber) {
		this.managerContactPhoneNumber = managerContactPhoneNumber;
		if(managerContactPhoneNumber != null){
			putQueryParameter("ManagerContactPhoneNumber", managerContactPhoneNumber);
		}
	}

	public String getNumberApplicationLetterPic() {
		return this.numberApplicationLetterPic;
	}

	public void setNumberApplicationLetterPic(String numberApplicationLetterPic) {
		this.numberApplicationLetterPic = numberApplicationLetterPic;
		if(numberApplicationLetterPic != null){
			putQueryParameter("NumberApplicationLetterPic", numberApplicationLetterPic);
		}
	}

	public String getBusinessLicenseAddress() {
		return this.businessLicenseAddress;
	}

	public void setBusinessLicenseAddress(String businessLicenseAddress) {
		this.businessLicenseAddress = businessLicenseAddress;
		if(businessLicenseAddress != null){
			putQueryParameter("BusinessLicenseAddress", businessLicenseAddress);
		}
	}

	public String getOrganizationCode() {
		return this.organizationCode;
	}

	public void setOrganizationCode(String organizationCode) {
		this.organizationCode = organizationCode;
		if(organizationCode != null){
			putQueryParameter("OrganizationCode", organizationCode);
		}
	}

	public String getRegionNameProvince() {
		return this.regionNameProvince;
	}

	public void setRegionNameProvince(String regionNameProvince) {
		this.regionNameProvince = regionNameProvince;
		if(regionNameProvince != null){
			putQueryParameter("RegionNameProvince", regionNameProvince);
		}
	}

	public String getTelecomUndertakingPic() {
		return this.telecomUndertakingPic;
	}

	public void setTelecomUndertakingPic(String telecomUndertakingPic) {
		this.telecomUndertakingPic = telecomUndertakingPic;
		if(telecomUndertakingPic != null){
			putQueryParameter("TelecomUndertakingPic", telecomUndertakingPic);
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

	public String getBusinessTypeDesc() {
		return this.businessTypeDesc;
	}

	public void setBusinessTypeDesc(String businessTypeDesc) {
		this.businessTypeDesc = businessTypeDesc;
		if(businessTypeDesc != null){
			putQueryParameter("BusinessTypeDesc", businessTypeDesc);
		}
	}

	public Integer getBusinessType() {
		return this.businessType;
	}

	public void setBusinessType(Integer businessType) {
		this.businessType = businessType;
		if(businessType != null){
			putQueryParameter("BusinessType", businessType.toString());
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

	public String getSpecIdArray() {
		return this.specIdArray;
	}

	public void setSpecIdArray(String specIdArray) {
		this.specIdArray = specIdArray;
		if(specIdArray != null){
			putQueryParameter("SpecIdArray", specIdArray);
		}
	}

	public String getLegalPersonrCertNumber() {
		return this.legalPersonrCertNumber;
	}

	public void setLegalPersonrCertNumber(String legalPersonrCertNumber) {
		this.legalPersonrCertNumber = legalPersonrCertNumber;
		if(legalPersonrCertNumber != null){
			putQueryParameter("LegalPersonrCertNumber", legalPersonrCertNumber);
		}
	}

	public String getProcedureDesc() {
		return this.procedureDesc;
	}

	public void setProcedureDesc(String procedureDesc) {
		this.procedureDesc = procedureDesc;
		if(procedureDesc != null){
			putQueryParameter("ProcedureDesc", procedureDesc);
		}
	}

	public String getRegisteredFundCode() {
		return this.registeredFundCode;
	}

	public void setRegisteredFundCode(String registeredFundCode) {
		this.registeredFundCode = registeredFundCode;
		if(registeredFundCode != null){
			putQueryParameter("RegisteredFundCode", registeredFundCode);
		}
	}

	public String getManagerName() {
		return this.managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
		if(managerName != null){
			putQueryParameter("ManagerName", managerName);
		}
	}

	public String getManagerCertPic() {
		return this.managerCertPic;
	}

	public void setManagerCertPic(String managerCertPic) {
		this.managerCertPic = managerCertPic;
		if(managerCertPic != null){
			putQueryParameter("ManagerCertPic", managerCertPic);
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

	public String getCorporationCertPic() {
		return this.corporationCertPic;
	}

	public void setCorporationCertPic(String corporationCertPic) {
		this.corporationCertPic = corporationCertPic;
		if(corporationCertPic != null){
			putQueryParameter("CorporationCertPic", corporationCertPic);
		}
	}

	public String getRegionNameCity() {
		return this.regionNameCity;
	}

	public void setRegionNameCity(String regionNameCity) {
		this.regionNameCity = regionNameCity;
		if(regionNameCity != null){
			putQueryParameter("RegionNameCity", regionNameCity);
		}
	}

	public String getManagerCertNumber() {
		return this.managerCertNumber;
	}

	public void setManagerCertNumber(String managerCertNumber) {
		this.managerCertNumber = managerCertNumber;
		if(managerCertNumber != null){
			putQueryParameter("ManagerCertNumber", managerCertNumber);
		}
	}

	@Override
	public Class<ApplyCorpIdentifyResponse> getResponseClass() {
		return ApplyCorpIdentifyResponse.class;
	}

}
