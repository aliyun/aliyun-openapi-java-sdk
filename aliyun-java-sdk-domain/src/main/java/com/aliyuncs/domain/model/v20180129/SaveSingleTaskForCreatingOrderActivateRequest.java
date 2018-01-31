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
package com.aliyuncs.domain.model.v20180129;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class SaveSingleTaskForCreatingOrderActivateRequest extends RpcAcsRequest<SaveSingleTaskForCreatingOrderActivateResponse> {
	
	public SaveSingleTaskForCreatingOrderActivateRequest() {
		super("Domain", "2018-01-29", "SaveSingleTaskForCreatingOrderActivate");
	}

	private String country;

	private Integer subscriptionDuration;

	private Boolean permitPremiumActivation;

	private String city;

	private String dns2;

	private String dns1;

	private Long registrantProfileId;

	private Boolean aliyunDns;

	private String zhCity;

	private String telExt;

	private String zhRegistrantName;

	private String province;

	private String postalCode;

	private String lang;

	private String email;

	private String zhRegistrantOrganization;

	private String address;

	private String telArea;

	private String domainName;

	private String zhAddress;

	private String registrantType;

	private String telephone;

	private String zhProvince;

	private String registrantOrganization;

	private String userClientIp;

	private Boolean enableDomainProxy;

	private String registrantName;

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
		if(country != null){
			putQueryParameter("Country", country);
		}
	}

	public Integer getSubscriptionDuration() {
		return this.subscriptionDuration;
	}

	public void setSubscriptionDuration(Integer subscriptionDuration) {
		this.subscriptionDuration = subscriptionDuration;
		if(subscriptionDuration != null){
			putQueryParameter("SubscriptionDuration", subscriptionDuration.toString());
		}
	}

	public Boolean getPermitPremiumActivation() {
		return this.permitPremiumActivation;
	}

	public void setPermitPremiumActivation(Boolean permitPremiumActivation) {
		this.permitPremiumActivation = permitPremiumActivation;
		if(permitPremiumActivation != null){
			putQueryParameter("PermitPremiumActivation", permitPremiumActivation.toString());
		}
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
		if(city != null){
			putQueryParameter("City", city);
		}
	}

	public String getDns2() {
		return this.dns2;
	}

	public void setDns2(String dns2) {
		this.dns2 = dns2;
		if(dns2 != null){
			putQueryParameter("Dns2", dns2);
		}
	}

	public String getDns1() {
		return this.dns1;
	}

	public void setDns1(String dns1) {
		this.dns1 = dns1;
		if(dns1 != null){
			putQueryParameter("Dns1", dns1);
		}
	}

	public Long getRegistrantProfileId() {
		return this.registrantProfileId;
	}

	public void setRegistrantProfileId(Long registrantProfileId) {
		this.registrantProfileId = registrantProfileId;
		if(registrantProfileId != null){
			putQueryParameter("RegistrantProfileId", registrantProfileId.toString());
		}
	}

	public Boolean getAliyunDns() {
		return this.aliyunDns;
	}

	public void setAliyunDns(Boolean aliyunDns) {
		this.aliyunDns = aliyunDns;
		if(aliyunDns != null){
			putQueryParameter("AliyunDns", aliyunDns.toString());
		}
	}

	public String getZhCity() {
		return this.zhCity;
	}

	public void setZhCity(String zhCity) {
		this.zhCity = zhCity;
		if(zhCity != null){
			putQueryParameter("ZhCity", zhCity);
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

	public String getZhRegistrantName() {
		return this.zhRegistrantName;
	}

	public void setZhRegistrantName(String zhRegistrantName) {
		this.zhRegistrantName = zhRegistrantName;
		if(zhRegistrantName != null){
			putQueryParameter("ZhRegistrantName", zhRegistrantName);
		}
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
		if(province != null){
			putQueryParameter("Province", province);
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

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
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

	public String getZhRegistrantOrganization() {
		return this.zhRegistrantOrganization;
	}

	public void setZhRegistrantOrganization(String zhRegistrantOrganization) {
		this.zhRegistrantOrganization = zhRegistrantOrganization;
		if(zhRegistrantOrganization != null){
			putQueryParameter("ZhRegistrantOrganization", zhRegistrantOrganization);
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

	public String getTelArea() {
		return this.telArea;
	}

	public void setTelArea(String telArea) {
		this.telArea = telArea;
		if(telArea != null){
			putQueryParameter("TelArea", telArea);
		}
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		if(domainName != null){
			putQueryParameter("DomainName", domainName);
		}
	}

	public String getZhAddress() {
		return this.zhAddress;
	}

	public void setZhAddress(String zhAddress) {
		this.zhAddress = zhAddress;
		if(zhAddress != null){
			putQueryParameter("ZhAddress", zhAddress);
		}
	}

	public String getRegistrantType() {
		return this.registrantType;
	}

	public void setRegistrantType(String registrantType) {
		this.registrantType = registrantType;
		if(registrantType != null){
			putQueryParameter("RegistrantType", registrantType);
		}
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
		if(telephone != null){
			putQueryParameter("Telephone", telephone);
		}
	}

	public String getZhProvince() {
		return this.zhProvince;
	}

	public void setZhProvince(String zhProvince) {
		this.zhProvince = zhProvince;
		if(zhProvince != null){
			putQueryParameter("ZhProvince", zhProvince);
		}
	}

	public String getRegistrantOrganization() {
		return this.registrantOrganization;
	}

	public void setRegistrantOrganization(String registrantOrganization) {
		this.registrantOrganization = registrantOrganization;
		if(registrantOrganization != null){
			putQueryParameter("RegistrantOrganization", registrantOrganization);
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

	public Boolean getEnableDomainProxy() {
		return this.enableDomainProxy;
	}

	public void setEnableDomainProxy(Boolean enableDomainProxy) {
		this.enableDomainProxy = enableDomainProxy;
		if(enableDomainProxy != null){
			putQueryParameter("EnableDomainProxy", enableDomainProxy.toString());
		}
	}

	public String getRegistrantName() {
		return this.registrantName;
	}

	public void setRegistrantName(String registrantName) {
		this.registrantName = registrantName;
		if(registrantName != null){
			putQueryParameter("RegistrantName", registrantName);
		}
	}

	@Override
	public Class<SaveSingleTaskForCreatingOrderActivateResponse> getResponseClass() {
		return SaveSingleTaskForCreatingOrderActivateResponse.class;
	}

}
