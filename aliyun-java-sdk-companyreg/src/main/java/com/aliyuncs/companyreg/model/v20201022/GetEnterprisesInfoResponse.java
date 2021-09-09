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
import com.aliyuncs.companyreg.transform.v20201022.GetEnterprisesInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetEnterprisesInfoResponse extends AcsResponse {

	private String requestId;

	private String enterpriseName;

	private String taxNo;

	private String corporation;

	private String establishDate;

	private String enterpriseType;

	private String registeredCapital;

	private String address;

	private String businessScope;

	private String fromBusinessTerm;

	private String toBusinessTerm;

	private String enterpriseStatus;

	private String industryCoName;

	private String industryCode;

	private String entityType;

	private String areaName;

	private String regCityName;

	private String changeDate;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getEnterpriseName() {
		return this.enterpriseName;
	}

	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	public String getTaxNo() {
		return this.taxNo;
	}

	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

	public String getCorporation() {
		return this.corporation;
	}

	public void setCorporation(String corporation) {
		this.corporation = corporation;
	}

	public String getEstablishDate() {
		return this.establishDate;
	}

	public void setEstablishDate(String establishDate) {
		this.establishDate = establishDate;
	}

	public String getEnterpriseType() {
		return this.enterpriseType;
	}

	public void setEnterpriseType(String enterpriseType) {
		this.enterpriseType = enterpriseType;
	}

	public String getRegisteredCapital() {
		return this.registeredCapital;
	}

	public void setRegisteredCapital(String registeredCapital) {
		this.registeredCapital = registeredCapital;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBusinessScope() {
		return this.businessScope;
	}

	public void setBusinessScope(String businessScope) {
		this.businessScope = businessScope;
	}

	public String getFromBusinessTerm() {
		return this.fromBusinessTerm;
	}

	public void setFromBusinessTerm(String fromBusinessTerm) {
		this.fromBusinessTerm = fromBusinessTerm;
	}

	public String getToBusinessTerm() {
		return this.toBusinessTerm;
	}

	public void setToBusinessTerm(String toBusinessTerm) {
		this.toBusinessTerm = toBusinessTerm;
	}

	public String getEnterpriseStatus() {
		return this.enterpriseStatus;
	}

	public void setEnterpriseStatus(String enterpriseStatus) {
		this.enterpriseStatus = enterpriseStatus;
	}

	public String getIndustryCoName() {
		return this.industryCoName;
	}

	public void setIndustryCoName(String industryCoName) {
		this.industryCoName = industryCoName;
	}

	public String getIndustryCode() {
		return this.industryCode;
	}

	public void setIndustryCode(String industryCode) {
		this.industryCode = industryCode;
	}

	public String getEntityType() {
		return this.entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public String getAreaName() {
		return this.areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getRegCityName() {
		return this.regCityName;
	}

	public void setRegCityName(String regCityName) {
		this.regCityName = regCityName;
	}

	public String getChangeDate() {
		return this.changeDate;
	}

	public void setChangeDate(String changeDate) {
		this.changeDate = changeDate;
	}

	@Override
	public GetEnterprisesInfoResponse getInstance(UnmarshallerContext context) {
		return	GetEnterprisesInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
