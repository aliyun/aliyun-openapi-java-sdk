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
public class Apply400ManagerIdentifyRequest extends RpcAcsRequest<Apply400ManagerIdentifyResponse> {
	   

	private Long resourceOwnerId;

	private String remark;

	private String managerMobilePhone;

	private String empowerment;

	private String number;

	private String managerCertEffDate;

	private String managerName;

	private Integer oldOrderId;

	private String partnerId;

	private String managerCertPic;

	private String managerCertType;

	private String resourceOwnerAccount;

	private String prodCode;

	private String wttorderId;

	private Long ownerId;

	private String managerCertExpDate;

	private String realName;

	private String unifiedstandardAgreement;

	private String supplementaryMaterial;

	private String corpName;

	private String managerCertNumber;
	public Apply400ManagerIdentifyRequest() {
		super("Dyvms", "2017-06-20", "Apply400ManagerIdentify", "dyvms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
		if(remark != null){
			putQueryParameter("Remark", remark);
		}
	}

	public String getManagerMobilePhone() {
		return this.managerMobilePhone;
	}

	public void setManagerMobilePhone(String managerMobilePhone) {
		this.managerMobilePhone = managerMobilePhone;
		if(managerMobilePhone != null){
			putQueryParameter("ManagerMobilePhone", managerMobilePhone);
		}
	}

	public String getEmpowerment() {
		return this.empowerment;
	}

	public void setEmpowerment(String empowerment) {
		this.empowerment = empowerment;
		if(empowerment != null){
			putQueryParameter("Empowerment", empowerment);
		}
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
		if(number != null){
			putQueryParameter("Number", number);
		}
	}

	public String getManagerCertEffDate() {
		return this.managerCertEffDate;
	}

	public void setManagerCertEffDate(String managerCertEffDate) {
		this.managerCertEffDate = managerCertEffDate;
		if(managerCertEffDate != null){
			putQueryParameter("ManagerCertEffDate", managerCertEffDate);
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

	public String getManagerCertPic() {
		return this.managerCertPic;
	}

	public void setManagerCertPic(String managerCertPic) {
		this.managerCertPic = managerCertPic;
		if(managerCertPic != null){
			putQueryParameter("ManagerCertPic", managerCertPic);
		}
	}

	public String getManagerCertType() {
		return this.managerCertType;
	}

	public void setManagerCertType(String managerCertType) {
		this.managerCertType = managerCertType;
		if(managerCertType != null){
			putQueryParameter("ManagerCertType", managerCertType);
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

	public String getWttorderId() {
		return this.wttorderId;
	}

	public void setWttorderId(String wttorderId) {
		this.wttorderId = wttorderId;
		if(wttorderId != null){
			putQueryParameter("WttorderId", wttorderId);
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

	public String getManagerCertExpDate() {
		return this.managerCertExpDate;
	}

	public void setManagerCertExpDate(String managerCertExpDate) {
		this.managerCertExpDate = managerCertExpDate;
		if(managerCertExpDate != null){
			putQueryParameter("ManagerCertExpDate", managerCertExpDate);
		}
	}

	public String getRealName() {
		return this.realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
		if(realName != null){
			putQueryParameter("RealName", realName);
		}
	}

	public String getUnifiedstandardAgreement() {
		return this.unifiedstandardAgreement;
	}

	public void setUnifiedstandardAgreement(String unifiedstandardAgreement) {
		this.unifiedstandardAgreement = unifiedstandardAgreement;
		if(unifiedstandardAgreement != null){
			putQueryParameter("UnifiedstandardAgreement", unifiedstandardAgreement);
		}
	}

	public String getSupplementaryMaterial() {
		return this.supplementaryMaterial;
	}

	public void setSupplementaryMaterial(String supplementaryMaterial) {
		this.supplementaryMaterial = supplementaryMaterial;
		if(supplementaryMaterial != null){
			putQueryParameter("SupplementaryMaterial", supplementaryMaterial);
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
	public Class<Apply400ManagerIdentifyResponse> getResponseClass() {
		return Apply400ManagerIdentifyResponse.class;
	}

}
