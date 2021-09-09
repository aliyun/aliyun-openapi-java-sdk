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

package com.aliyuncs.companyreg.model.v20190508;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.companyreg.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UploadIcpBasicMaterialRequest extends RpcAcsRequest<UploadIcpBasicMaterialResponse> {
	   

	private String socialCreditCode;

	private String businessLicense;

	private String corporateIdCard;

	private String idCardList;

	private String companyAddress;

	private String companyName;

	private String bizId;

	private String corporateName;
	public UploadIcpBasicMaterialRequest() {
		super("companyreg", "2019-05-08", "UploadIcpBasicMaterial", "companyreg");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSocialCreditCode() {
		return this.socialCreditCode;
	}

	public void setSocialCreditCode(String socialCreditCode) {
		this.socialCreditCode = socialCreditCode;
		if(socialCreditCode != null){
			putQueryParameter("SocialCreditCode", socialCreditCode);
		}
	}

	public String getBusinessLicense() {
		return this.businessLicense;
	}

	public void setBusinessLicense(String businessLicense) {
		this.businessLicense = businessLicense;
		if(businessLicense != null){
			putQueryParameter("BusinessLicense", businessLicense);
		}
	}

	public String getCorporateIdCard() {
		return this.corporateIdCard;
	}

	public void setCorporateIdCard(String corporateIdCard) {
		this.corporateIdCard = corporateIdCard;
		if(corporateIdCard != null){
			putQueryParameter("CorporateIdCard", corporateIdCard);
		}
	}

	public String getIdCardList() {
		return this.idCardList;
	}

	public void setIdCardList(String idCardList) {
		this.idCardList = idCardList;
		if(idCardList != null){
			putQueryParameter("IdCardList", idCardList);
		}
	}

	public String getCompanyAddress() {
		return this.companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
		if(companyAddress != null){
			putQueryParameter("CompanyAddress", companyAddress);
		}
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
		if(companyName != null){
			putQueryParameter("CompanyName", companyName);
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

	public String getCorporateName() {
		return this.corporateName;
	}

	public void setCorporateName(String corporateName) {
		this.corporateName = corporateName;
		if(corporateName != null){
			putQueryParameter("CorporateName", corporateName);
		}
	}

	@Override
	public Class<UploadIcpBasicMaterialResponse> getResponseClass() {
		return UploadIcpBasicMaterialResponse.class;
	}

}
