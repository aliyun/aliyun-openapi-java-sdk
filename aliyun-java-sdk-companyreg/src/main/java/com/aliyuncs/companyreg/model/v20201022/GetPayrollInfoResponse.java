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
import com.aliyuncs.companyreg.transform.v20201022.GetPayrollInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPayrollInfoResponse extends AcsResponse {

	private String corporateHousingAccumulationFund;

	private String corporateSocialInsurance;

	private String employeeTime;

	private Long id;

	private String idNo;

	private String income;

	private String name;

	private String period;

	private String personHousingAccumulationFund;

	private String personSocialInsurance;

	private String phone;

	private String corpPension;

	private String corpMedicalInsurance;

	private String corpUnemploymentInsurance;

	private String corpInjuryInsurance;

	private String corpMaternityInsurance;

	private String persPension;

	private String persUnemploymentInsurance;

	private String persMedicalInsurance;

	private String requestId;

	public String getCorporateHousingAccumulationFund() {
		return this.corporateHousingAccumulationFund;
	}

	public void setCorporateHousingAccumulationFund(String corporateHousingAccumulationFund) {
		this.corporateHousingAccumulationFund = corporateHousingAccumulationFund;
	}

	public String getCorporateSocialInsurance() {
		return this.corporateSocialInsurance;
	}

	public void setCorporateSocialInsurance(String corporateSocialInsurance) {
		this.corporateSocialInsurance = corporateSocialInsurance;
	}

	public String getEmployeeTime() {
		return this.employeeTime;
	}

	public void setEmployeeTime(String employeeTime) {
		this.employeeTime = employeeTime;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdNo() {
		return this.idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getIncome() {
		return this.income;
	}

	public void setIncome(String income) {
		this.income = income;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getPersonHousingAccumulationFund() {
		return this.personHousingAccumulationFund;
	}

	public void setPersonHousingAccumulationFund(String personHousingAccumulationFund) {
		this.personHousingAccumulationFund = personHousingAccumulationFund;
	}

	public String getPersonSocialInsurance() {
		return this.personSocialInsurance;
	}

	public void setPersonSocialInsurance(String personSocialInsurance) {
		this.personSocialInsurance = personSocialInsurance;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCorpPension() {
		return this.corpPension;
	}

	public void setCorpPension(String corpPension) {
		this.corpPension = corpPension;
	}

	public String getCorpMedicalInsurance() {
		return this.corpMedicalInsurance;
	}

	public void setCorpMedicalInsurance(String corpMedicalInsurance) {
		this.corpMedicalInsurance = corpMedicalInsurance;
	}

	public String getCorpUnemploymentInsurance() {
		return this.corpUnemploymentInsurance;
	}

	public void setCorpUnemploymentInsurance(String corpUnemploymentInsurance) {
		this.corpUnemploymentInsurance = corpUnemploymentInsurance;
	}

	public String getCorpInjuryInsurance() {
		return this.corpInjuryInsurance;
	}

	public void setCorpInjuryInsurance(String corpInjuryInsurance) {
		this.corpInjuryInsurance = corpInjuryInsurance;
	}

	public String getCorpMaternityInsurance() {
		return this.corpMaternityInsurance;
	}

	public void setCorpMaternityInsurance(String corpMaternityInsurance) {
		this.corpMaternityInsurance = corpMaternityInsurance;
	}

	public String getPersPension() {
		return this.persPension;
	}

	public void setPersPension(String persPension) {
		this.persPension = persPension;
	}

	public String getPersUnemploymentInsurance() {
		return this.persUnemploymentInsurance;
	}

	public void setPersUnemploymentInsurance(String persUnemploymentInsurance) {
		this.persUnemploymentInsurance = persUnemploymentInsurance;
	}

	public String getPersMedicalInsurance() {
		return this.persMedicalInsurance;
	}

	public void setPersMedicalInsurance(String persMedicalInsurance) {
		this.persMedicalInsurance = persMedicalInsurance;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@Override
	public GetPayrollInfoResponse getInstance(UnmarshallerContext context) {
		return	GetPayrollInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
