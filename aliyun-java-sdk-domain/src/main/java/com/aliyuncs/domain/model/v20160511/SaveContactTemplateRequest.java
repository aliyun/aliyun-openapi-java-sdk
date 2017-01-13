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

	private String userClientIp;

	private String lang;

	private Long contactTemplateId;

	private Boolean defaultTemplate;

	private String cCity;

	private String cCompany;

	private String cCountry;

	private String cName;

	private String cProvince;

	private String cVenu;

	private String eCity;

	private String eCompany;

	private String eName;

	private String eProvince;

	private String eVenu;

	private String email;

	private String postalCode;

	private String telArea;

	private String telMain;

	private String telExt;

	private String regType;

	public String getUserClientIp() {
		return this.userClientIp;
	}

	public void setUserClientIp(String userClientIp) {
		this.userClientIp = userClientIp;
		putQueryParameter("UserClientIp", userClientIp);
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		putQueryParameter("Lang", lang);
	}

	public Long getContactTemplateId() {
		return this.contactTemplateId;
	}

	public void setContactTemplateId(Long contactTemplateId) {
		this.contactTemplateId = contactTemplateId;
		putQueryParameter("ContactTemplateId", contactTemplateId);
	}

	public Boolean getDefaultTemplate() {
		return this.defaultTemplate;
	}

	public void setDefaultTemplate(Boolean defaultTemplate) {
		this.defaultTemplate = defaultTemplate;
		putQueryParameter("DefaultTemplate", defaultTemplate);
	}

	public String getCCity() {
		return this.cCity;
	}

	public void setCCity(String cCity) {
		this.cCity = cCity;
		putQueryParameter("CCity", cCity);
	}

	public String getCCompany() {
		return this.cCompany;
	}

	public void setCCompany(String cCompany) {
		this.cCompany = cCompany;
		putQueryParameter("CCompany", cCompany);
	}

	public String getCCountry() {
		return this.cCountry;
	}

	public void setCCountry(String cCountry) {
		this.cCountry = cCountry;
		putQueryParameter("CCountry", cCountry);
	}

	public String getCName() {
		return this.cName;
	}

	public void setCName(String cName) {
		this.cName = cName;
		putQueryParameter("CName", cName);
	}

	public String getCProvince() {
		return this.cProvince;
	}

	public void setCProvince(String cProvince) {
		this.cProvince = cProvince;
		putQueryParameter("CProvince", cProvince);
	}

	public String getCVenu() {
		return this.cVenu;
	}

	public void setCVenu(String cVenu) {
		this.cVenu = cVenu;
		putQueryParameter("CVenu", cVenu);
	}

	public String getECity() {
		return this.eCity;
	}

	public void setECity(String eCity) {
		this.eCity = eCity;
		putQueryParameter("ECity", eCity);
	}

	public String getECompany() {
		return this.eCompany;
	}

	public void setECompany(String eCompany) {
		this.eCompany = eCompany;
		putQueryParameter("ECompany", eCompany);
	}

	public String getEName() {
		return this.eName;
	}

	public void setEName(String eName) {
		this.eName = eName;
		putQueryParameter("EName", eName);
	}

	public String getEProvince() {
		return this.eProvince;
	}

	public void setEProvince(String eProvince) {
		this.eProvince = eProvince;
		putQueryParameter("EProvince", eProvince);
	}

	public String getEVenu() {
		return this.eVenu;
	}

	public void setEVenu(String eVenu) {
		this.eVenu = eVenu;
		putQueryParameter("EVenu", eVenu);
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
		putQueryParameter("Email", email);
	}

	public String getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
		putQueryParameter("PostalCode", postalCode);
	}

	public String getTelArea() {
		return this.telArea;
	}

	public void setTelArea(String telArea) {
		this.telArea = telArea;
		putQueryParameter("TelArea", telArea);
	}

	public String getTelMain() {
		return this.telMain;
	}

	public void setTelMain(String telMain) {
		this.telMain = telMain;
		putQueryParameter("TelMain", telMain);
	}

	public String getTelExt() {
		return this.telExt;
	}

	public void setTelExt(String telExt) {
		this.telExt = telExt;
		putQueryParameter("TelExt", telExt);
	}

	public String getRegType() {
		return this.regType;
	}

	public void setRegType(String regType) {
		this.regType = regType;
		putQueryParameter("RegType", regType);
	}

	@Override
	public Class<SaveContactTemplateResponse> getResponseClass() {
		return SaveContactTemplateResponse.class;
	}

}
