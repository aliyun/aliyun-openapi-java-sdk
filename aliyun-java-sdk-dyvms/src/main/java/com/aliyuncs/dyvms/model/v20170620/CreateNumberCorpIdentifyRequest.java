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
public class CreateNumberCorpIdentifyRequest extends RpcAcsRequest<CreateNumberCorpIdentifyResponse> {
	   

	private Long usageId;

	private Long resourceOwnerId;

	private String businessTypeDesc;

	private Integer businessType;

	private String specIdArray;

	private String registeredFundCode;

	private String procedureDesc;

	private Long id;

	private String sceneProcedure;

	private String businessLicenseAddress;

	private String numberApplicationLetterPic;

	private String organizationCode;

	private String regionNameProvince;

	private Long ownerId;

	private String versionNo;

	private String applyRemark;

	private String corporationCertPic;

	private String managerCertNumber;

	private String managerContactPhoneNumber;

	private String legalPersonName;

	private String offsiteCertPic;

	private String businessLicensePic;

	private String legalPersonrCertNumber;

	private String managerName;

	private String managerCertPic;

	private Long oldOrderId;

	private String regionNameCity;

	private String resourceOwnerAccount;

	private String prodCode;

	private String telecomUndertakingPic;

	private String corpName;
	public CreateNumberCorpIdentifyRequest() {
		super("Dyvms", "2017-06-20", "CreateNumberCorpIdentify", "dyvms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getUsageId() {
		return this.usageId;
	}

	public void setUsageId(Long usageId) {
		this.usageId = usageId;
		if(usageId != null){
			putQueryParameter("UsageId", usageId.toString());
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

	public String getSpecIdArray() {
		return this.specIdArray;
	}

	public void setSpecIdArray(String specIdArray) {
		this.specIdArray = specIdArray;
		if(specIdArray != null){
			putQueryParameter("SpecIdArray", specIdArray);
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

	public String getProcedureDesc() {
		return this.procedureDesc;
	}

	public void setProcedureDesc(String procedureDesc) {
		this.procedureDesc = procedureDesc;
		if(procedureDesc != null){
			putQueryParameter("ProcedureDesc", procedureDesc);
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
		}
	}

	public String getSceneProcedure() {
		return this.sceneProcedure;
	}

	public void setSceneProcedure(String sceneProcedure) {
		this.sceneProcedure = sceneProcedure;
		if(sceneProcedure != null){
			putQueryParameter("SceneProcedure", sceneProcedure);
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

	public String getNumberApplicationLetterPic() {
		return this.numberApplicationLetterPic;
	}

	public void setNumberApplicationLetterPic(String numberApplicationLetterPic) {
		this.numberApplicationLetterPic = numberApplicationLetterPic;
		if(numberApplicationLetterPic != null){
			putQueryParameter("NumberApplicationLetterPic", numberApplicationLetterPic);
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getVersionNo() {
		return this.versionNo;
	}

	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
		if(versionNo != null){
			putQueryParameter("VersionNo", versionNo);
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

	public String getManagerCertNumber() {
		return this.managerCertNumber;
	}

	public void setManagerCertNumber(String managerCertNumber) {
		this.managerCertNumber = managerCertNumber;
		if(managerCertNumber != null){
			putQueryParameter("ManagerCertNumber", managerCertNumber);
		}
	}

	public String getManagerContactPhoneNumber() {
		return this.managerContactPhoneNumber;
	}

	public void setManagerContactPhoneNumber(String managerContactPhoneNumber) {
		this.managerContactPhoneNumber = managerContactPhoneNumber;
		if(managerContactPhoneNumber != null){
			putQueryParameter("ManagerContactPhoneNumber", managerContactPhoneNumber);
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

	public String getOffsiteCertPic() {
		return this.offsiteCertPic;
	}

	public void setOffsiteCertPic(String offsiteCertPic) {
		this.offsiteCertPic = offsiteCertPic;
		if(offsiteCertPic != null){
			putQueryParameter("OffsiteCertPic", offsiteCertPic);
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

	public String getLegalPersonrCertNumber() {
		return this.legalPersonrCertNumber;
	}

	public void setLegalPersonrCertNumber(String legalPersonrCertNumber) {
		this.legalPersonrCertNumber = legalPersonrCertNumber;
		if(legalPersonrCertNumber != null){
			putQueryParameter("LegalPersonrCertNumber", legalPersonrCertNumber);
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

	public Long getOldOrderId() {
		return this.oldOrderId;
	}

	public void setOldOrderId(Long oldOrderId) {
		this.oldOrderId = oldOrderId;
		if(oldOrderId != null){
			putQueryParameter("OldOrderId", oldOrderId.toString());
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

	public String getTelecomUndertakingPic() {
		return this.telecomUndertakingPic;
	}

	public void setTelecomUndertakingPic(String telecomUndertakingPic) {
		this.telecomUndertakingPic = telecomUndertakingPic;
		if(telecomUndertakingPic != null){
			putQueryParameter("TelecomUndertakingPic", telecomUndertakingPic);
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

	@Override
	public Class<CreateNumberCorpIdentifyResponse> getResponseClass() {
		return CreateNumberCorpIdentifyResponse.class;
	}

}
