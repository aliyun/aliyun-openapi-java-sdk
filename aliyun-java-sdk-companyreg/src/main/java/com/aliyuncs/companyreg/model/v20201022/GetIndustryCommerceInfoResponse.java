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
import com.aliyuncs.companyreg.transform.v20201022.GetIndustryCommerceInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetIndustryCommerceInfoResponse extends AcsResponse {

	private String requestId;

	private String companyType;

	private String establishmentDate;

	private String businessStatus;

	private String taxNo;

	private String registeredCaptial;

	private String name;

	private String legalRepresentative;

	private String operatingPeriod;

	private String bizScope;

	private String corpAddress;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCompanyType() {
		return this.companyType;
	}

	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	public String getEstablishmentDate() {
		return this.establishmentDate;
	}

	public void setEstablishmentDate(String establishmentDate) {
		this.establishmentDate = establishmentDate;
	}

	public String getBusinessStatus() {
		return this.businessStatus;
	}

	public void setBusinessStatus(String businessStatus) {
		this.businessStatus = businessStatus;
	}

	public String getTaxNo() {
		return this.taxNo;
	}

	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

	public String getRegisteredCaptial() {
		return this.registeredCaptial;
	}

	public void setRegisteredCaptial(String registeredCaptial) {
		this.registeredCaptial = registeredCaptial;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLegalRepresentative() {
		return this.legalRepresentative;
	}

	public void setLegalRepresentative(String legalRepresentative) {
		this.legalRepresentative = legalRepresentative;
	}

	public String getOperatingPeriod() {
		return this.operatingPeriod;
	}

	public void setOperatingPeriod(String operatingPeriod) {
		this.operatingPeriod = operatingPeriod;
	}

	public String getBizScope() {
		return this.bizScope;
	}

	public void setBizScope(String bizScope) {
		this.bizScope = bizScope;
	}

	public String getCorpAddress() {
		return this.corpAddress;
	}

	public void setCorpAddress(String corpAddress) {
		this.corpAddress = corpAddress;
	}

	@Override
	public GetIndustryCommerceInfoResponse getInstance(UnmarshallerContext context) {
		return	GetIndustryCommerceInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
