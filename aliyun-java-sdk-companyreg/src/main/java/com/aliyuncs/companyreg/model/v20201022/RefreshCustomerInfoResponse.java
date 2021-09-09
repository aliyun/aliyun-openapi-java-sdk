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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.companyreg.transform.v20201022.RefreshCustomerInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RefreshCustomerInfoResponse extends AcsResponse {

	private String acctgSystem;

	private String bizScope;

	private String companyType;

	private String corpAddress;

	private String establishmentDate;

	private String externalUniqueId;

	private String incomeDeclarationPsw;

	private String legalRepresentative;

	private String orgName;

	private String registeredCaptial;

	private String requestId;

	private String taxArea;

	private String taxNo;

	private String taxPreparerName;

	private String taxPreparerPsw;

	private String taxTypes;

	private String taxiationAgentSecret;

	private String taxpayerType;

	private Long tenantId;

	public String getAcctgSystem() {
		return this.acctgSystem;
	}

	public void setAcctgSystem(String acctgSystem) {
		this.acctgSystem = acctgSystem;
	}

	public String getBizScope() {
		return this.bizScope;
	}

	public void setBizScope(String bizScope) {
		this.bizScope = bizScope;
	}

	public String getCompanyType() {
		return this.companyType;
	}

	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	public String getCorpAddress() {
		return this.corpAddress;
	}

	public void setCorpAddress(String corpAddress) {
		this.corpAddress = corpAddress;
	}

	public String getEstablishmentDate() {
		return this.establishmentDate;
	}

	public void setEstablishmentDate(String establishmentDate) {
		this.establishmentDate = establishmentDate;
	}

	public String getExternalUniqueId() {
		return this.externalUniqueId;
	}

	public void setExternalUniqueId(String externalUniqueId) {
		this.externalUniqueId = externalUniqueId;
	}

	public String getIncomeDeclarationPsw() {
		return this.incomeDeclarationPsw;
	}

	public void setIncomeDeclarationPsw(String incomeDeclarationPsw) {
		this.incomeDeclarationPsw = incomeDeclarationPsw;
	}

	public String getLegalRepresentative() {
		return this.legalRepresentative;
	}

	public void setLegalRepresentative(String legalRepresentative) {
		this.legalRepresentative = legalRepresentative;
	}

	public String getOrgName() {
		return this.orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getRegisteredCaptial() {
		return this.registeredCaptial;
	}

	public void setRegisteredCaptial(String registeredCaptial) {
		this.registeredCaptial = registeredCaptial;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTaxArea() {
		return this.taxArea;
	}

	public void setTaxArea(String taxArea) {
		this.taxArea = taxArea;
	}

	public String getTaxNo() {
		return this.taxNo;
	}

	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

	public String getTaxPreparerName() {
		return this.taxPreparerName;
	}

	public void setTaxPreparerName(String taxPreparerName) {
		this.taxPreparerName = taxPreparerName;
	}

	public String getTaxPreparerPsw() {
		return this.taxPreparerPsw;
	}

	public void setTaxPreparerPsw(String taxPreparerPsw) {
		this.taxPreparerPsw = taxPreparerPsw;
	}

	public String getTaxTypes() {
		return this.taxTypes;
	}

	public void setTaxTypes(String taxTypes) {
		this.taxTypes = taxTypes;
	}

	public String getTaxiationAgentSecret() {
		return this.taxiationAgentSecret;
	}

	public void setTaxiationAgentSecret(String taxiationAgentSecret) {
		this.taxiationAgentSecret = taxiationAgentSecret;
	}

	public String getTaxpayerType() {
		return this.taxpayerType;
	}

	public void setTaxpayerType(String taxpayerType) {
		this.taxpayerType = taxpayerType;
	}

	public Long getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
	}

	@Override
	public RefreshCustomerInfoResponse getInstance(UnmarshallerContext context) {
		return	RefreshCustomerInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
