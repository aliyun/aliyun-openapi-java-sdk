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

package com.aliyuncs.cas.model.v20200407;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateWHCertificateWithExtensionRequest extends RpcAcsRequest<CreateWHCertificateWithExtensionResponse> {
	   

	private Boolean appendCrl;

	private String countryCode;

	private String commonName;

	private String certType;

	private String state;

	private String csrPemString;

	private String algorithmKeySize;

	private Long afterTime;

	private String sans;

	private String locality;

	private Boolean basicConstraintsCritical;

	private String aliasName;

	private String organization;

	private Long beforeTime;

	private String parentIdentifier;

	private String organizationUnit;
	public CreateWHCertificateWithExtensionRequest() {
		super("cas", "2020-04-07", "CreateWHCertificateWithExtension");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getAppendCrl() {
		return this.appendCrl;
	}

	public void setAppendCrl(Boolean appendCrl) {
		this.appendCrl = appendCrl;
		if(appendCrl != null){
			putQueryParameter("AppendCrl", appendCrl.toString());
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

	public String getCommonName() {
		return this.commonName;
	}

	public void setCommonName(String commonName) {
		this.commonName = commonName;
		if(commonName != null){
			putQueryParameter("CommonName", commonName);
		}
	}

	public String getCertType() {
		return this.certType;
	}

	public void setCertType(String certType) {
		this.certType = certType;
		if(certType != null){
			putQueryParameter("CertType", certType);
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

	public String getCsrPemString() {
		return this.csrPemString;
	}

	public void setCsrPemString(String csrPemString) {
		this.csrPemString = csrPemString;
		if(csrPemString != null){
			putQueryParameter("CsrPemString", csrPemString);
		}
	}

	public String getAlgorithmKeySize() {
		return this.algorithmKeySize;
	}

	public void setAlgorithmKeySize(String algorithmKeySize) {
		this.algorithmKeySize = algorithmKeySize;
		if(algorithmKeySize != null){
			putQueryParameter("AlgorithmKeySize", algorithmKeySize);
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

	public String getSans() {
		return this.sans;
	}

	public void setSans(String sans) {
		this.sans = sans;
		if(sans != null){
			putQueryParameter("Sans", sans);
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

	public Boolean getBasicConstraintsCritical() {
		return this.basicConstraintsCritical;
	}

	public void setBasicConstraintsCritical(Boolean basicConstraintsCritical) {
		this.basicConstraintsCritical = basicConstraintsCritical;
		if(basicConstraintsCritical != null){
			putQueryParameter("BasicConstraintsCritical", basicConstraintsCritical.toString());
		}
	}

	public String getAliasName() {
		return this.aliasName;
	}

	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
		if(aliasName != null){
			putQueryParameter("AliasName", aliasName);
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

	public Long getBeforeTime() {
		return this.beforeTime;
	}

	public void setBeforeTime(Long beforeTime) {
		this.beforeTime = beforeTime;
		if(beforeTime != null){
			putQueryParameter("BeforeTime", beforeTime.toString());
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

	@Override
	public Class<CreateWHCertificateWithExtensionResponse> getResponseClass() {
		return CreateWHCertificateWithExtensionResponse.class;
	}

}
