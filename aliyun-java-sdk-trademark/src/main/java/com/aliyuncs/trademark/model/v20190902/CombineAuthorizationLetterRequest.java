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

package com.aliyuncs.trademark.model.v20190902;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.trademark.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CombineAuthorizationLetterRequest extends RpcAcsRequest<CombineAuthorizationLetterResponse> {
	   

	private String materialName;

	private String materialId;

	private String contactName;

	private String tmProduceType;

	private String personalType;

	private String contactPhone;

	private String address;

	private String applicantType;

	private String contactPostcode;

	private String trademarkName;

	private String nationality;

	private Integer principalName;
	public CombineAuthorizationLetterRequest() {
		super("Trademark", "2019-09-02", "CombineAuthorizationLetter");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMaterialName() {
		return this.materialName;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
		if(materialName != null){
			putQueryParameter("MaterialName", materialName);
		}
	}

	public String getMaterialId() {
		return this.materialId;
	}

	public void setMaterialId(String materialId) {
		this.materialId = materialId;
		if(materialId != null){
			putQueryParameter("MaterialId", materialId);
		}
	}

	public String getContactName() {
		return this.contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
		if(contactName != null){
			putQueryParameter("ContactName", contactName);
		}
	}

	public String getTmProduceType() {
		return this.tmProduceType;
	}

	public void setTmProduceType(String tmProduceType) {
		this.tmProduceType = tmProduceType;
		if(tmProduceType != null){
			putQueryParameter("TmProduceType", tmProduceType);
		}
	}

	public String getPersonalType() {
		return this.personalType;
	}

	public void setPersonalType(String personalType) {
		this.personalType = personalType;
		if(personalType != null){
			putQueryParameter("PersonalType", personalType);
		}
	}

	public String getContactPhone() {
		return this.contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
		if(contactPhone != null){
			putQueryParameter("ContactPhone", contactPhone);
		}
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
		if(address != null){
			putQueryParameter("Address", address);
		}
	}

	public String getApplicantType() {
		return this.applicantType;
	}

	public void setApplicantType(String applicantType) {
		this.applicantType = applicantType;
		if(applicantType != null){
			putQueryParameter("ApplicantType", applicantType);
		}
	}

	public String getContactPostcode() {
		return this.contactPostcode;
	}

	public void setContactPostcode(String contactPostcode) {
		this.contactPostcode = contactPostcode;
		if(contactPostcode != null){
			putQueryParameter("ContactPostcode", contactPostcode);
		}
	}

	public String getTrademarkName() {
		return this.trademarkName;
	}

	public void setTrademarkName(String trademarkName) {
		this.trademarkName = trademarkName;
		if(trademarkName != null){
			putQueryParameter("TrademarkName", trademarkName);
		}
	}

	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
		if(nationality != null){
			putQueryParameter("Nationality", nationality);
		}
	}

	public Integer getPrincipalName() {
		return this.principalName;
	}

	public void setPrincipalName(Integer principalName) {
		this.principalName = principalName;
		if(principalName != null){
			putQueryParameter("PrincipalName", principalName.toString());
		}
	}

	@Override
	public Class<CombineAuthorizationLetterResponse> getResponseClass() {
		return CombineAuthorizationLetterResponse.class;
	}

}
