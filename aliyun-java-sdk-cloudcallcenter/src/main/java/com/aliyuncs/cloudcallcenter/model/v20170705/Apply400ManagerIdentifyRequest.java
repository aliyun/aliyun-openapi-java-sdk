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
public class Apply400ManagerIdentifyRequest extends RpcAcsRequest<Apply400ManagerIdentifyResponse> {
	
	public Apply400ManagerIdentifyRequest() {
		super("CloudCallCenter", "2017-07-05", "Apply400ManagerIdentify", "CloudCallCenter", "innerAPI");
	}

	private String wttorderId;

	private String managerCertExpDate;

	private String managerMobilePhone;

	private String empowerment;

	private String number;

	private String managerCertEffDate;

	private String unifiedstandardAgreement;

	private String supplementaryMaterial;

	private String managerName;

	private String managerCertPic;

	private String corpName;

	private String oldOrderId;

	private String managerCertNumber;

	private String managerCertType;

	public String getWttorderId() {
		return this.wttorderId;
	}

	public void setWttorderId(String wttorderId) {
		this.wttorderId = wttorderId;
		if(wttorderId != null){
			putQueryParameter("WttorderId", wttorderId);
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

	public String getOldOrderId() {
		return this.oldOrderId;
	}

	public void setOldOrderId(String oldOrderId) {
		this.oldOrderId = oldOrderId;
		if(oldOrderId != null){
			putQueryParameter("OldOrderId", oldOrderId);
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

	public String getManagerCertType() {
		return this.managerCertType;
	}

	public void setManagerCertType(String managerCertType) {
		this.managerCertType = managerCertType;
		if(managerCertType != null){
			putQueryParameter("ManagerCertType", managerCertType);
		}
	}

	@Override
	public Class<Apply400ManagerIdentifyResponse> getResponseClass() {
		return Apply400ManagerIdentifyResponse.class;
	}

}
