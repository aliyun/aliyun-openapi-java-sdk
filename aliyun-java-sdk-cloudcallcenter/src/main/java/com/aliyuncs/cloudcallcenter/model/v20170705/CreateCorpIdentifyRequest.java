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
public class CreateCorpIdentifyRequest extends RpcAcsRequest<CreateCorpIdentifyResponse> {
	
	public CreateCorpIdentifyRequest() {
		super("CloudCallCenter", "2017-07-05", "CreateCorpIdentify", "CloudCallCenter", "innerAPI");
	}

	private String managerContactPhoneNumber;

	private String businessLicenseAddress;

	private String numberApplicationLetterPic;

	private String organizationCode;

	private Long orderId;

	private String regionNameProvince;

	private String telecomUndertakingPic;

	private String legalPersonName;

	private Long taobaoUid;

	private Long ramId;

	private String businessLicensePic;

	private String procedureDesc;

	private String managerName;

	private String corpName;

	private Long partnerId;

	private String applyRemark;

	private String managerCertPic;

	private String regionNameCity;

	private String managerCertNumber;

	private String legalPersonCertNumber;

	public String getManagerContactPhoneNumber() {
		return this.managerContactPhoneNumber;
	}

	public void setManagerContactPhoneNumber(String managerContactPhoneNumber) {
		this.managerContactPhoneNumber = managerContactPhoneNumber;
		if(managerContactPhoneNumber != null){
			putQueryParameter("managerContactPhoneNumber", managerContactPhoneNumber);
		}
	}

	public String getBusinessLicenseAddress() {
		return this.businessLicenseAddress;
	}

	public void setBusinessLicenseAddress(String businessLicenseAddress) {
		this.businessLicenseAddress = businessLicenseAddress;
		if(businessLicenseAddress != null){
			putQueryParameter("businessLicenseAddress", businessLicenseAddress);
		}
	}

	public String getNumberApplicationLetterPic() {
		return this.numberApplicationLetterPic;
	}

	public void setNumberApplicationLetterPic(String numberApplicationLetterPic) {
		this.numberApplicationLetterPic = numberApplicationLetterPic;
		if(numberApplicationLetterPic != null){
			putQueryParameter("numberApplicationLetterPic", numberApplicationLetterPic);
		}
	}

	public String getOrganizationCode() {
		return this.organizationCode;
	}

	public void setOrganizationCode(String organizationCode) {
		this.organizationCode = organizationCode;
		if(organizationCode != null){
			putQueryParameter("organizationCode", organizationCode);
		}
	}

	public Long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
		if(orderId != null){
			putQueryParameter("OrderId", orderId.toString());
		}
	}

	public String getRegionNameProvince() {
		return this.regionNameProvince;
	}

	public void setRegionNameProvince(String regionNameProvince) {
		this.regionNameProvince = regionNameProvince;
		if(regionNameProvince != null){
			putQueryParameter("regionNameProvince", regionNameProvince);
		}
	}

	public String getTelecomUndertakingPic() {
		return this.telecomUndertakingPic;
	}

	public void setTelecomUndertakingPic(String telecomUndertakingPic) {
		this.telecomUndertakingPic = telecomUndertakingPic;
		if(telecomUndertakingPic != null){
			putQueryParameter("telecomUndertakingPic", telecomUndertakingPic);
		}
	}

	public String getLegalPersonName() {
		return this.legalPersonName;
	}

	public void setLegalPersonName(String legalPersonName) {
		this.legalPersonName = legalPersonName;
		if(legalPersonName != null){
			putQueryParameter("legalPersonName", legalPersonName);
		}
	}

	public Long getTaobaoUid() {
		return this.taobaoUid;
	}

	public void setTaobaoUid(Long taobaoUid) {
		this.taobaoUid = taobaoUid;
		if(taobaoUid != null){
			putQueryParameter("TaobaoUid", taobaoUid.toString());
		}
	}

	public Long getRamId() {
		return this.ramId;
	}

	public void setRamId(Long ramId) {
		this.ramId = ramId;
		if(ramId != null){
			putQueryParameter("RamId", ramId.toString());
		}
	}

	public String getBusinessLicensePic() {
		return this.businessLicensePic;
	}

	public void setBusinessLicensePic(String businessLicensePic) {
		this.businessLicensePic = businessLicensePic;
		if(businessLicensePic != null){
			putQueryParameter("businessLicensePic", businessLicensePic);
		}
	}

	public String getProcedureDesc() {
		return this.procedureDesc;
	}

	public void setProcedureDesc(String procedureDesc) {
		this.procedureDesc = procedureDesc;
		if(procedureDesc != null){
			putQueryParameter("procedureDesc", procedureDesc);
		}
	}

	public String getManagerName() {
		return this.managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
		if(managerName != null){
			putQueryParameter("managerName", managerName);
		}
	}

	public String getCorpName() {
		return this.corpName;
	}

	public void setCorpName(String corpName) {
		this.corpName = corpName;
		if(corpName != null){
			putQueryParameter("corpName", corpName);
		}
	}

	public Long getPartnerId() {
		return this.partnerId;
	}

	public void setPartnerId(Long partnerId) {
		this.partnerId = partnerId;
		if(partnerId != null){
			putQueryParameter("partnerId", partnerId.toString());
		}
	}

	public String getApplyRemark() {
		return this.applyRemark;
	}

	public void setApplyRemark(String applyRemark) {
		this.applyRemark = applyRemark;
		if(applyRemark != null){
			putQueryParameter("applyRemark", applyRemark);
		}
	}

	public String getManagerCertPic() {
		return this.managerCertPic;
	}

	public void setManagerCertPic(String managerCertPic) {
		this.managerCertPic = managerCertPic;
		if(managerCertPic != null){
			putQueryParameter("managerCertPic", managerCertPic);
		}
	}

	public String getRegionNameCity() {
		return this.regionNameCity;
	}

	public void setRegionNameCity(String regionNameCity) {
		this.regionNameCity = regionNameCity;
		if(regionNameCity != null){
			putQueryParameter("regionNameCity", regionNameCity);
		}
	}

	public String getManagerCertNumber() {
		return this.managerCertNumber;
	}

	public void setManagerCertNumber(String managerCertNumber) {
		this.managerCertNumber = managerCertNumber;
		if(managerCertNumber != null){
			putQueryParameter("managerCertNumber", managerCertNumber);
		}
	}

	public String getLegalPersonCertNumber() {
		return this.legalPersonCertNumber;
	}

	public void setLegalPersonCertNumber(String legalPersonCertNumber) {
		this.legalPersonCertNumber = legalPersonCertNumber;
		if(legalPersonCertNumber != null){
			putQueryParameter("legalPersonCertNumber", legalPersonCertNumber);
		}
	}

	@Override
	public Class<CreateCorpIdentifyResponse> getResponseClass() {
		return CreateCorpIdentifyResponse.class;
	}

}
