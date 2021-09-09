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
import com.aliyuncs.companyreg.transform.v20201022.GetTaxInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTaxInfoResponse extends AcsResponse {

	private String taxPreparerName;

	private String taxiationAgentSecret;

	private String myTaxInfo;

	private String taxArea;

	private String acctgSystem;

	private String requestId;

	private String externalUniqueId;

	private String taxTypes;

	private String incomeDeclarationPsw;

	private String isNeedSmsCode;

	private String taxNo;

	private String taxpayerType;

	private String name;

	private String taxPreparerPsw;

	private String taxAreaCode;

	private Long tenantId;

	public String getTaxPreparerName() {
		return this.taxPreparerName;
	}

	public void setTaxPreparerName(String taxPreparerName) {
		this.taxPreparerName = taxPreparerName;
	}

	public String getTaxiationAgentSecret() {
		return this.taxiationAgentSecret;
	}

	public void setTaxiationAgentSecret(String taxiationAgentSecret) {
		this.taxiationAgentSecret = taxiationAgentSecret;
	}

	public String getMyTaxInfo() {
		return this.myTaxInfo;
	}

	public void setMyTaxInfo(String myTaxInfo) {
		this.myTaxInfo = myTaxInfo;
	}

	public String getTaxArea() {
		return this.taxArea;
	}

	public void setTaxArea(String taxArea) {
		this.taxArea = taxArea;
	}

	public String getAcctgSystem() {
		return this.acctgSystem;
	}

	public void setAcctgSystem(String acctgSystem) {
		this.acctgSystem = acctgSystem;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getExternalUniqueId() {
		return this.externalUniqueId;
	}

	public void setExternalUniqueId(String externalUniqueId) {
		this.externalUniqueId = externalUniqueId;
	}

	public String getTaxTypes() {
		return this.taxTypes;
	}

	public void setTaxTypes(String taxTypes) {
		this.taxTypes = taxTypes;
	}

	public String getIncomeDeclarationPsw() {
		return this.incomeDeclarationPsw;
	}

	public void setIncomeDeclarationPsw(String incomeDeclarationPsw) {
		this.incomeDeclarationPsw = incomeDeclarationPsw;
	}

	public String getIsNeedSmsCode() {
		return this.isNeedSmsCode;
	}

	public void setIsNeedSmsCode(String isNeedSmsCode) {
		this.isNeedSmsCode = isNeedSmsCode;
	}

	public String getTaxNo() {
		return this.taxNo;
	}

	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

	public String getTaxpayerType() {
		return this.taxpayerType;
	}

	public void setTaxpayerType(String taxpayerType) {
		this.taxpayerType = taxpayerType;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTaxPreparerPsw() {
		return this.taxPreparerPsw;
	}

	public void setTaxPreparerPsw(String taxPreparerPsw) {
		this.taxPreparerPsw = taxPreparerPsw;
	}

	public String getTaxAreaCode() {
		return this.taxAreaCode;
	}

	public void setTaxAreaCode(String taxAreaCode) {
		this.taxAreaCode = taxAreaCode;
	}

	public Long getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
	}

	@Override
	public GetTaxInfoResponse getInstance(UnmarshallerContext context) {
		return	GetTaxInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
