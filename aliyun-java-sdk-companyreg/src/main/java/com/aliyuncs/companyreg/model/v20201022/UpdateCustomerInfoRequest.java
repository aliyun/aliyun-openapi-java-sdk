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

package com.aliyuncs.companyreg.model.v20201022;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.companyreg.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateCustomerInfoRequest extends RpcAcsRequest<UpdateCustomerInfoResponse> {
	   

	private String contactTelInfo;

	private String taxPreparerName;

	private String taxAgentSecret;

	private String legalRepresentative;

	private String taxPreparerPassword;

	private String establishmentDate;

	private String contactName;

	private String bizScope;

	private String incomeDeclarationPassword;

	private String companyType;

	private String corpAddress;

	private String bizId;

	private String name;

	private Boolean isRefreshInfo;

	private String registeredCapital;

	private String operatingPeriod;
	public UpdateCustomerInfoRequest() {
		super("companyreg", "2020-10-22", "UpdateCustomerInfo", "companyreg");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getContactTelInfo() {
		return this.contactTelInfo;
	}

	public void setContactTelInfo(String contactTelInfo) {
		this.contactTelInfo = contactTelInfo;
		if(contactTelInfo != null){
			putQueryParameter("ContactTelInfo", contactTelInfo);
		}
	}

	public String getTaxPreparerName() {
		return this.taxPreparerName;
	}

	public void setTaxPreparerName(String taxPreparerName) {
		this.taxPreparerName = taxPreparerName;
		if(taxPreparerName != null){
			putQueryParameter("TaxPreparerName", taxPreparerName);
		}
	}

	public String getTaxAgentSecret() {
		return this.taxAgentSecret;
	}

	public void setTaxAgentSecret(String taxAgentSecret) {
		this.taxAgentSecret = taxAgentSecret;
		if(taxAgentSecret != null){
			putQueryParameter("TaxAgentSecret", taxAgentSecret);
		}
	}

	public String getLegalRepresentative() {
		return this.legalRepresentative;
	}

	public void setLegalRepresentative(String legalRepresentative) {
		this.legalRepresentative = legalRepresentative;
		if(legalRepresentative != null){
			putQueryParameter("LegalRepresentative", legalRepresentative);
		}
	}

	public String getTaxPreparerPassword() {
		return this.taxPreparerPassword;
	}

	public void setTaxPreparerPassword(String taxPreparerPassword) {
		this.taxPreparerPassword = taxPreparerPassword;
		if(taxPreparerPassword != null){
			putQueryParameter("TaxPreparerPassword", taxPreparerPassword);
		}
	}

	public String getEstablishmentDate() {
		return this.establishmentDate;
	}

	public void setEstablishmentDate(String establishmentDate) {
		this.establishmentDate = establishmentDate;
		if(establishmentDate != null){
			putQueryParameter("EstablishmentDate", establishmentDate);
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

	public String getBizScope() {
		return this.bizScope;
	}

	public void setBizScope(String bizScope) {
		this.bizScope = bizScope;
		if(bizScope != null){
			putQueryParameter("BizScope", bizScope);
		}
	}

	public String getIncomeDeclarationPassword() {
		return this.incomeDeclarationPassword;
	}

	public void setIncomeDeclarationPassword(String incomeDeclarationPassword) {
		this.incomeDeclarationPassword = incomeDeclarationPassword;
		if(incomeDeclarationPassword != null){
			putQueryParameter("IncomeDeclarationPassword", incomeDeclarationPassword);
		}
	}

	public String getCompanyType() {
		return this.companyType;
	}

	public void setCompanyType(String companyType) {
		this.companyType = companyType;
		if(companyType != null){
			putQueryParameter("CompanyType", companyType);
		}
	}

	public String getCorpAddress() {
		return this.corpAddress;
	}

	public void setCorpAddress(String corpAddress) {
		this.corpAddress = corpAddress;
		if(corpAddress != null){
			putQueryParameter("CorpAddress", corpAddress);
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public Boolean getIsRefreshInfo() {
		return this.isRefreshInfo;
	}

	public void setIsRefreshInfo(Boolean isRefreshInfo) {
		this.isRefreshInfo = isRefreshInfo;
		if(isRefreshInfo != null){
			putQueryParameter("IsRefreshInfo", isRefreshInfo.toString());
		}
	}

	public String getRegisteredCapital() {
		return this.registeredCapital;
	}

	public void setRegisteredCapital(String registeredCapital) {
		this.registeredCapital = registeredCapital;
		if(registeredCapital != null){
			putQueryParameter("RegisteredCapital", registeredCapital);
		}
	}

	public String getOperatingPeriod() {
		return this.operatingPeriod;
	}

	public void setOperatingPeriod(String operatingPeriod) {
		this.operatingPeriod = operatingPeriod;
		if(operatingPeriod != null){
			putQueryParameter("OperatingPeriod", operatingPeriod);
		}
	}

	@Override
	public Class<UpdateCustomerInfoResponse> getResponseClass() {
		return UpdateCustomerInfoResponse.class;
	}

}
