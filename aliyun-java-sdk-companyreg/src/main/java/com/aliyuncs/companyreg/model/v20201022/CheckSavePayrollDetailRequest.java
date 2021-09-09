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
public class CheckSavePayrollDetailRequest extends RpcAcsRequest<CheckSavePayrollDetailResponse> {
	   

	private String income;

	private String corporateHousingAccumulationFund;

	private String personHousingAccumulationFund;

	private String persMedicalInsurance;

	private String corpUnemploymentInsurance;

	private Long id;

	private String personSocialInsurance;

	private String period;

	private String corporateSocialInsurance;

	private String corpInjuryInsurance;

	private String persPension;

	private String corpMedicalInsurance;

	private String idNo;

	private String employeeTime;

	private Boolean updateEmployeeFlag;

	private String phone;

	private String persUnemploymentInsurance;

	private String bizId;

	private String name;

	private String corpPension;

	private String corpMaternityInsurance;
	public CheckSavePayrollDetailRequest() {
		super("companyreg", "2020-10-22", "CheckSavePayrollDetail", "companyreg");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getIncome() {
		return this.income;
	}

	public void setIncome(String income) {
		this.income = income;
		if(income != null){
			putQueryParameter("Income", income);
		}
	}

	public String getCorporateHousingAccumulationFund() {
		return this.corporateHousingAccumulationFund;
	}

	public void setCorporateHousingAccumulationFund(String corporateHousingAccumulationFund) {
		this.corporateHousingAccumulationFund = corporateHousingAccumulationFund;
		if(corporateHousingAccumulationFund != null){
			putQueryParameter("CorporateHousingAccumulationFund", corporateHousingAccumulationFund);
		}
	}

	public String getPersonHousingAccumulationFund() {
		return this.personHousingAccumulationFund;
	}

	public void setPersonHousingAccumulationFund(String personHousingAccumulationFund) {
		this.personHousingAccumulationFund = personHousingAccumulationFund;
		if(personHousingAccumulationFund != null){
			putQueryParameter("PersonHousingAccumulationFund", personHousingAccumulationFund);
		}
	}

	public String getPersMedicalInsurance() {
		return this.persMedicalInsurance;
	}

	public void setPersMedicalInsurance(String persMedicalInsurance) {
		this.persMedicalInsurance = persMedicalInsurance;
		if(persMedicalInsurance != null){
			putQueryParameter("PersMedicalInsurance", persMedicalInsurance);
		}
	}

	public String getCorpUnemploymentInsurance() {
		return this.corpUnemploymentInsurance;
	}

	public void setCorpUnemploymentInsurance(String corpUnemploymentInsurance) {
		this.corpUnemploymentInsurance = corpUnemploymentInsurance;
		if(corpUnemploymentInsurance != null){
			putQueryParameter("CorpUnemploymentInsurance", corpUnemploymentInsurance);
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
		}
	}

	public String getPersonSocialInsurance() {
		return this.personSocialInsurance;
	}

	public void setPersonSocialInsurance(String personSocialInsurance) {
		this.personSocialInsurance = personSocialInsurance;
		if(personSocialInsurance != null){
			putQueryParameter("PersonSocialInsurance", personSocialInsurance);
		}
	}

	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
		if(period != null){
			putQueryParameter("Period", period);
		}
	}

	public String getCorporateSocialInsurance() {
		return this.corporateSocialInsurance;
	}

	public void setCorporateSocialInsurance(String corporateSocialInsurance) {
		this.corporateSocialInsurance = corporateSocialInsurance;
		if(corporateSocialInsurance != null){
			putQueryParameter("CorporateSocialInsurance", corporateSocialInsurance);
		}
	}

	public String getCorpInjuryInsurance() {
		return this.corpInjuryInsurance;
	}

	public void setCorpInjuryInsurance(String corpInjuryInsurance) {
		this.corpInjuryInsurance = corpInjuryInsurance;
		if(corpInjuryInsurance != null){
			putQueryParameter("CorpInjuryInsurance", corpInjuryInsurance);
		}
	}

	public String getPersPension() {
		return this.persPension;
	}

	public void setPersPension(String persPension) {
		this.persPension = persPension;
		if(persPension != null){
			putQueryParameter("PersPension", persPension);
		}
	}

	public String getCorpMedicalInsurance() {
		return this.corpMedicalInsurance;
	}

	public void setCorpMedicalInsurance(String corpMedicalInsurance) {
		this.corpMedicalInsurance = corpMedicalInsurance;
		if(corpMedicalInsurance != null){
			putQueryParameter("CorpMedicalInsurance", corpMedicalInsurance);
		}
	}

	public String getIdNo() {
		return this.idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
		if(idNo != null){
			putQueryParameter("IdNo", idNo);
		}
	}

	public String getEmployeeTime() {
		return this.employeeTime;
	}

	public void setEmployeeTime(String employeeTime) {
		this.employeeTime = employeeTime;
		if(employeeTime != null){
			putQueryParameter("EmployeeTime", employeeTime);
		}
	}

	public Boolean getUpdateEmployeeFlag() {
		return this.updateEmployeeFlag;
	}

	public void setUpdateEmployeeFlag(Boolean updateEmployeeFlag) {
		this.updateEmployeeFlag = updateEmployeeFlag;
		if(updateEmployeeFlag != null){
			putQueryParameter("UpdateEmployeeFlag", updateEmployeeFlag.toString());
		}
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
		if(phone != null){
			putQueryParameter("Phone", phone);
		}
	}

	public String getPersUnemploymentInsurance() {
		return this.persUnemploymentInsurance;
	}

	public void setPersUnemploymentInsurance(String persUnemploymentInsurance) {
		this.persUnemploymentInsurance = persUnemploymentInsurance;
		if(persUnemploymentInsurance != null){
			putQueryParameter("PersUnemploymentInsurance", persUnemploymentInsurance);
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

	public String getCorpPension() {
		return this.corpPension;
	}

	public void setCorpPension(String corpPension) {
		this.corpPension = corpPension;
		if(corpPension != null){
			putQueryParameter("CorpPension", corpPension);
		}
	}

	public String getCorpMaternityInsurance() {
		return this.corpMaternityInsurance;
	}

	public void setCorpMaternityInsurance(String corpMaternityInsurance) {
		this.corpMaternityInsurance = corpMaternityInsurance;
		if(corpMaternityInsurance != null){
			putQueryParameter("CorpMaternityInsurance", corpMaternityInsurance);
		}
	}

	@Override
	public Class<CheckSavePayrollDetailResponse> getResponseClass() {
		return CheckSavePayrollDetailResponse.class;
	}

}
