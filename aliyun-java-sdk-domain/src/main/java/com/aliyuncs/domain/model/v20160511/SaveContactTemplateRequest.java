/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.domain.model.v20160511;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class SaveContactTemplateRequest extends RpcAcsRequest<SaveContactTemplateResponse> {
	
	public SaveContactTemplateRequest() {
		super("Domain", "2016-05-11", "SaveContactTemplate");
	}

	private String cCompany;

	private Boolean defaultTemplate;

	private String telArea;

	private String eCompany;

	private String telMain;

	private String cName;

	private String cProvince;

	private String eCity;

	private String cCity;

	private String regType;

	private String eName;

	private String telExt;

	private String cVenu;

	private String eProvince;

	private String postalCode;

	private String userClientIp;

	private String cCountry;

	private String lang;

	private String eVenu;

	private String email;

	private Long contactTemplateId;

	public String getCCompany() {
		return this.cCompany;
	}

	public void setCCompany(String cCompany) {
		this.cCompany = cCompany;
		if(cCompany != null){
			putQueryParameter("CCompany", cCompany);
		}
	}

	public Boolean getDefaultTemplate() {
		return this.defaultTemplate;
	}

	public void setDefaultTemplate(Boolean defaultTemplate) {
		this.defaultTemplate = defaultTemplate;
		if(defaultTemplate != null){
			putQueryParameter("DefaultTemplate", defaultTemplate.toString());
		}
	}

	public String getTelArea() {
		return this.telArea;
	}

	public void setTelArea(String telArea) {
		this.telArea = telArea;
		if(telArea != null){
			putQueryParameter("TelArea", telArea);
		}
	}

	public String getECompany() {
		return this.eCompany;
	}

	public void setECompany(String eCompany) {
		this.eCompany = eCompany;
		if(eCompany != null){
			putQueryParameter("ECompany", eCompany);
		}
	}

	public String getTelMain() {
		return this.telMain;
	}

	public void setTelMain(String telMain) {
		this.telMain = telMain;
		if(telMain != null){
			putQueryParameter("TelMain", telMain);
		}
	}

	public String getCName() {
		return this.cName;
	}

	public void setCName(String cName) {
		this.cName = cName;
		if(cName != null){
			putQueryParameter("CName", cName);
		}
	}

	public String getCProvince() {
		return this.cProvince;
	}

	public void setCProvince(String cProvince) {
		this.cProvince = cProvince;
		if(cProvince != null){
			putQueryParameter("CProvince", cProvince);
		}
	}

	public String getECity() {
		return this.eCity;
	}

	public void setECity(String eCity) {
		this.eCity = eCity;
		if(eCity != null){
			putQueryParameter("ECity", eCity);
		}
	}

	public String getCCity() {
		return this.cCity;
	}

	public void setCCity(String cCity) {
		this.cCity = cCity;
		if(cCity != null){
			putQueryParameter("CCity", cCity);
		}
	}

	public String getRegType() {
		return this.regType;
	}

	public void setRegType(String regType) {
		this.regType = regType;
		if(regType != null){
			putQueryParameter("RegType", regType);
		}
	}

	public String getEName() {
		return this.eName;
	}

	public void setEName(String eName) {
		this.eName = eName;
		if(eName != null){
			putQueryParameter("EName", eName);
		}
	}

	public String getTelExt() {
		return this.telExt;
	}

	public void setTelExt(String telExt) {
		this.telExt = telExt;
		if(telExt != null){
			putQueryParameter("TelExt", telExt);
		}
	}

	public String getCVenu() {
		return this.cVenu;
	}

	public void setCVenu(String cVenu) {
		this.cVenu = cVenu;
		if(cVenu != null){
			putQueryParameter("CVenu", cVenu);
		}
	}

	public String getEProvince() {
		return this.eProvince;
	}

	public void setEProvince(String eProvince) {
		this.eProvince = eProvince;
		if(eProvince != null){
			putQueryParameter("EProvince", eProvince);
		}
	}

	public String getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
		if(postalCode != null){
			putQueryParameter("PostalCode", postalCode);
		}
	}

	public String getUserClientIp() {
		return this.userClientIp;
	}

	public void setUserClientIp(String userClientIp) {
		this.userClientIp = userClientIp;
		if(userClientIp != null){
			putQueryParameter("UserClientIp", userClientIp);
		}
	}

	public String getCCountry() {
		return this.cCountry;
	}

	public void setCCountry(String cCountry) {
		this.cCountry = cCountry;
		if(cCountry != null){
			putQueryParameter("CCountry", cCountry);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public String getEVenu() {
		return this.eVenu;
	}

	public void setEVenu(String eVenu) {
		this.eVenu = eVenu;
		if(eVenu != null){
			putQueryParameter("EVenu", eVenu);
		}
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
		if(email != null){
			putQueryParameter("Email", email);
		}
	}

	public Long getContactTemplateId() {
		return this.contactTemplateId;
	}

	public void setContactTemplateId(Long contactTemplateId) {
		this.contactTemplateId = contactTemplateId;
		if(contactTemplateId != null){
			putQueryParameter("ContactTemplateId", contactTemplateId.toString());
		}
	}

	@Override
	public Class<SaveContactTemplateResponse> getResponseClass() {
		return SaveContactTemplateResponse.class;
	}

}
