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
public class CheckMaterialValidityRequest extends RpcAcsRequest<CheckMaterialValidityResponse> {
	   

	private Long materialId;

	private Integer materialType;

	private Integer materialRegion;

	private Long personalType;

	private String idCardName;

	private String idCardNumber;

	private String idCardOssKey;

	private String businessLicenseOssKey;

	private String name;

	private String cardNumber;
	public CheckMaterialValidityRequest() {
		super("Trademark", "2019-09-02", "CheckMaterialValidity");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getMaterialId() {
		return this.materialId;
	}

	public void setMaterialId(Long materialId) {
		this.materialId = materialId;
		if(materialId != null){
			putQueryParameter("MaterialId", materialId.toString());
		}
	}

	public Integer getMaterialType() {
		return this.materialType;
	}

	public void setMaterialType(Integer materialType) {
		this.materialType = materialType;
		if(materialType != null){
			putQueryParameter("MaterialType", materialType.toString());
		}
	}

	public Integer getMaterialRegion() {
		return this.materialRegion;
	}

	public void setMaterialRegion(Integer materialRegion) {
		this.materialRegion = materialRegion;
		if(materialRegion != null){
			putQueryParameter("MaterialRegion", materialRegion.toString());
		}
	}

	public Long getPersonalType() {
		return this.personalType;
	}

	public void setPersonalType(Long personalType) {
		this.personalType = personalType;
		if(personalType != null){
			putQueryParameter("PersonalType", personalType.toString());
		}
	}

	public String getIdCardName() {
		return this.idCardName;
	}

	public void setIdCardName(String idCardName) {
		this.idCardName = idCardName;
		if(idCardName != null){
			putQueryParameter("IdCardName", idCardName);
		}
	}

	public String getIdCardNumber() {
		return this.idCardNumber;
	}

	public void setIdCardNumber(String idCardNumber) {
		this.idCardNumber = idCardNumber;
		if(idCardNumber != null){
			putQueryParameter("IdCardNumber", idCardNumber);
		}
	}

	public String getIdCardOssKey() {
		return this.idCardOssKey;
	}

	public void setIdCardOssKey(String idCardOssKey) {
		this.idCardOssKey = idCardOssKey;
		if(idCardOssKey != null){
			putQueryParameter("IdCardOssKey", idCardOssKey);
		}
	}

	public String getBusinessLicenseOssKey() {
		return this.businessLicenseOssKey;
	}

	public void setBusinessLicenseOssKey(String businessLicenseOssKey) {
		this.businessLicenseOssKey = businessLicenseOssKey;
		if(businessLicenseOssKey != null){
			putQueryParameter("BusinessLicenseOssKey", businessLicenseOssKey);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getCardNumber() {
		return this.cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
		if(cardNumber != null){
			putQueryParameter("CardNumber", cardNumber);
		}
	}

	@Override
	public Class<CheckMaterialValidityResponse> getResponseClass() {
		return CheckMaterialValidityResponse.class;
	}

}
