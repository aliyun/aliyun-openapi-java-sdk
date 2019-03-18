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

package com.aliyuncs.cas.model.v20180813;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateOrderMaterialRequest extends RpcAcsRequest<CreateOrderMaterialResponse> {
	
	public CreateOrderMaterialRequest() {
		super("cas", "2018-08-13", "CreateOrderMaterial", "cas_esign_fdd");
	}

	private String leaderName;

	private String city;

	private String countryCode;

	private String leaderEmail;

	private String companyAddress;

	private String companyCode;

	private String personEmail;

	private String province;

	private Integer domainAuthType;

	private String leaderPhone;

	private String sourceIp;

	private String csrContent;

	private String lang;

	private String personName;

	private String personIdCardNumber;

	private Long orderId;

	private String leaderTitle;

	private String personTitle;

	private String postCode;

	private Integer createCsr;

	private String personPhone;

	private String companyName;

	private String companyPhone;

	private Integer companyType;

	private String domain;

	private String personDepartment;

	public String getLeaderName() {
		return this.leaderName;
	}

	public void setLeaderName(String leaderName) {
		this.leaderName = leaderName;
		if(leaderName != null){
			putQueryParameter("LeaderName", leaderName);
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

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
		if(countryCode != null){
			putQueryParameter("CountryCode", countryCode);
		}
	}

	public String getLeaderEmail() {
		return this.leaderEmail;
	}

	public void setLeaderEmail(String leaderEmail) {
		this.leaderEmail = leaderEmail;
		if(leaderEmail != null){
			putQueryParameter("LeaderEmail", leaderEmail);
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

	public String getCompanyCode() {
		return this.companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
		if(companyCode != null){
			putQueryParameter("CompanyCode", companyCode);
		}
	}

	public String getPersonEmail() {
		return this.personEmail;
	}

	public void setPersonEmail(String personEmail) {
		this.personEmail = personEmail;
		if(personEmail != null){
			putQueryParameter("PersonEmail", personEmail);
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

	public Integer getDomainAuthType() {
		return this.domainAuthType;
	}

	public void setDomainAuthType(Integer domainAuthType) {
		this.domainAuthType = domainAuthType;
		if(domainAuthType != null){
			putQueryParameter("DomainAuthType", domainAuthType.toString());
		}
	}

	public String getLeaderPhone() {
		return this.leaderPhone;
	}

	public void setLeaderPhone(String leaderPhone) {
		this.leaderPhone = leaderPhone;
		if(leaderPhone != null){
			putQueryParameter("LeaderPhone", leaderPhone);
		}
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public String getCsrContent() {
		return this.csrContent;
	}

	public void setCsrContent(String csrContent) {
		this.csrContent = csrContent;
		if(csrContent != null){
			putQueryParameter("CsrContent", csrContent);
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

	public String getPersonName() {
		return this.personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
		if(personName != null){
			putQueryParameter("PersonName", personName);
		}
	}

	public String getPersonIdCardNumber() {
		return this.personIdCardNumber;
	}

	public void setPersonIdCardNumber(String personIdCardNumber) {
		this.personIdCardNumber = personIdCardNumber;
		if(personIdCardNumber != null){
			putQueryParameter("PersonIdCardNumber", personIdCardNumber);
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

	public String getLeaderTitle() {
		return this.leaderTitle;
	}

	public void setLeaderTitle(String leaderTitle) {
		this.leaderTitle = leaderTitle;
		if(leaderTitle != null){
			putQueryParameter("LeaderTitle", leaderTitle);
		}
	}

	public String getPersonTitle() {
		return this.personTitle;
	}

	public void setPersonTitle(String personTitle) {
		this.personTitle = personTitle;
		if(personTitle != null){
			putQueryParameter("PersonTitle", personTitle);
		}
	}

	public String getPostCode() {
		return this.postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
		if(postCode != null){
			putQueryParameter("PostCode", postCode);
		}
	}

	public Integer getCreateCsr() {
		return this.createCsr;
	}

	public void setCreateCsr(Integer createCsr) {
		this.createCsr = createCsr;
		if(createCsr != null){
			putQueryParameter("CreateCsr", createCsr.toString());
		}
	}

	public String getPersonPhone() {
		return this.personPhone;
	}

	public void setPersonPhone(String personPhone) {
		this.personPhone = personPhone;
		if(personPhone != null){
			putQueryParameter("PersonPhone", personPhone);
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

	public String getCompanyPhone() {
		return this.companyPhone;
	}

	public void setCompanyPhone(String companyPhone) {
		this.companyPhone = companyPhone;
		if(companyPhone != null){
			putQueryParameter("CompanyPhone", companyPhone);
		}
	}

	public Integer getCompanyType() {
		return this.companyType;
	}

	public void setCompanyType(Integer companyType) {
		this.companyType = companyType;
		if(companyType != null){
			putQueryParameter("CompanyType", companyType.toString());
		}
	}

	public String getBizDomain() {
		return this.domain;
	}

	public void setBizDomain(String domain) {
		this.domain = domain;
		if(domain != null){
			putQueryParameter("Domain", domain);
		}
	}

	/**
	 * @deprecated use getBizDomain instead of this.
	 */
	@Deprecated
	public String getDomain() {
		return this.domain;
	}

	/**
	 * @deprecated use setBizDomain instead of this.
	 */
	@Deprecated
	public void setDomain(String domain) {
		this.domain = domain;
		if(domain != null){
			putQueryParameter("Domain", domain);
		}
	}

	public String getPersonDepartment() {
		return this.personDepartment;
	}

	public void setPersonDepartment(String personDepartment) {
		this.personDepartment = personDepartment;
		if(personDepartment != null){
			putQueryParameter("PersonDepartment", personDepartment);
		}
	}

	@Override
	public Class<CreateOrderMaterialResponse> getResponseClass() {
		return CreateOrderMaterialResponse.class;
	}

}
