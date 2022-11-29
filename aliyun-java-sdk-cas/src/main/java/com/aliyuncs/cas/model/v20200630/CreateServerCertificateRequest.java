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

package com.aliyuncs.cas.model.v20200630;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateServerCertificateRequest extends RpcAcsRequest<CreateServerCertificateResponse> {
	   

	private String country;

	private String csr;

	private Integer months;

	private Long afterTime;

	private String locality;

	private Integer immediately;

	private Integer years;

	private String commonName;

	private String organization;

	private Integer days;

	private Long beforeTime;

	private String state;

	private String parentIdentifier;

	private String organizationUnit;

	private String algorithm;

	private String domain;
	public CreateServerCertificateRequest() {
		super("cas", "2020-06-30", "CreateServerCertificate");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
		if(country != null){
			putQueryParameter("Country", country);
		}
	}

	public String getCsr() {
		return this.csr;
	}

	public void setCsr(String csr) {
		this.csr = csr;
		if(csr != null){
			putQueryParameter("Csr", csr);
		}
	}

	public Integer getMonths() {
		return this.months;
	}

	public void setMonths(Integer months) {
		this.months = months;
		if(months != null){
			putQueryParameter("Months", months.toString());
		}
	}

	public Long getAfterTime() {
		return this.afterTime;
	}

	public void setAfterTime(Long afterTime) {
		this.afterTime = afterTime;
		if(afterTime != null){
			putQueryParameter("AfterTime", afterTime.toString());
		}
	}

	public String getLocality() {
		return this.locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
		if(locality != null){
			putQueryParameter("Locality", locality);
		}
	}

	public Integer getImmediately() {
		return this.immediately;
	}

	public void setImmediately(Integer immediately) {
		this.immediately = immediately;
		if(immediately != null){
			putQueryParameter("Immediately", immediately.toString());
		}
	}

	public Integer getYears() {
		return this.years;
	}

	public void setYears(Integer years) {
		this.years = years;
		if(years != null){
			putQueryParameter("Years", years.toString());
		}
	}

	public String getCommonName() {
		return this.commonName;
	}

	public void setCommonName(String commonName) {
		this.commonName = commonName;
		if(commonName != null){
			putQueryParameter("CommonName", commonName);
		}
	}

	public String getOrganization() {
		return this.organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
		if(organization != null){
			putQueryParameter("Organization", organization);
		}
	}

	public Integer getDays() {
		return this.days;
	}

	public void setDays(Integer days) {
		this.days = days;
		if(days != null){
			putQueryParameter("Days", days.toString());
		}
	}

	public Long getBeforeTime() {
		return this.beforeTime;
	}

	public void setBeforeTime(Long beforeTime) {
		this.beforeTime = beforeTime;
		if(beforeTime != null){
			putQueryParameter("BeforeTime", beforeTime.toString());
		}
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
		if(state != null){
			putQueryParameter("State", state);
		}
	}

	public String getParentIdentifier() {
		return this.parentIdentifier;
	}

	public void setParentIdentifier(String parentIdentifier) {
		this.parentIdentifier = parentIdentifier;
		if(parentIdentifier != null){
			putQueryParameter("ParentIdentifier", parentIdentifier);
		}
	}

	public String getOrganizationUnit() {
		return this.organizationUnit;
	}

	public void setOrganizationUnit(String organizationUnit) {
		this.organizationUnit = organizationUnit;
		if(organizationUnit != null){
			putQueryParameter("OrganizationUnit", organizationUnit);
		}
	}

	public String getAlgorithm() {
		return this.algorithm;
	}

	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
		if(algorithm != null){
			putQueryParameter("Algorithm", algorithm);
		}
	}

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
		if(domain != null){
			putQueryParameter("Domain", domain);
		}
	}

	@Override
	public Class<CreateServerCertificateResponse> getResponseClass() {
		return CreateServerCertificateResponse.class;
	}

}
