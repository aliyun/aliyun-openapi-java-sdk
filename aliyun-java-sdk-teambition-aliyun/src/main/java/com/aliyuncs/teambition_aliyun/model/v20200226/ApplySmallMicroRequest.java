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

package com.aliyuncs.teambition_aliyun.model.v20200226;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ApplySmallMicroRequest extends RpcAcsRequest<ApplySmallMicroResponse> {
	   

	private String applicantEmail;

	private String developScale;

	private String type;

	private String orgId;

	private String applicantPosition;

	private String developLanguage;

	private String orgName;

	private String applicantTel;

	private String solution;

	private String forHelp;

	private String applicantName;

	private String businessModel;
	public ApplySmallMicroRequest() {
		super("teambition-aliyun", "2020-02-26", "ApplySmallMicro");
		setMethod(MethodType.POST);
	}

	public String getApplicantEmail() {
		return this.applicantEmail;
	}

	public void setApplicantEmail(String applicantEmail) {
		this.applicantEmail = applicantEmail;
		if(applicantEmail != null){
			putBodyParameter("ApplicantEmail", applicantEmail);
		}
	}

	public String getDevelopScale() {
		return this.developScale;
	}

	public void setDevelopScale(String developScale) {
		this.developScale = developScale;
		if(developScale != null){
			putQueryParameter("DevelopScale", developScale);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type);
		}
	}

	public String getOrgId() {
		return this.orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
		if(orgId != null){
			putBodyParameter("OrgId", orgId);
		}
	}

	public String getApplicantPosition() {
		return this.applicantPosition;
	}

	public void setApplicantPosition(String applicantPosition) {
		this.applicantPosition = applicantPosition;
		if(applicantPosition != null){
			putBodyParameter("ApplicantPosition", applicantPosition);
		}
	}

	public String getDevelopLanguage() {
		return this.developLanguage;
	}

	public void setDevelopLanguage(String developLanguage) {
		this.developLanguage = developLanguage;
		if(developLanguage != null){
			putBodyParameter("DevelopLanguage", developLanguage);
		}
	}

	public String getOrgName() {
		return this.orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
		if(orgName != null){
			putBodyParameter("OrgName", orgName);
		}
	}

	public String getApplicantTel() {
		return this.applicantTel;
	}

	public void setApplicantTel(String applicantTel) {
		this.applicantTel = applicantTel;
		if(applicantTel != null){
			putBodyParameter("ApplicantTel", applicantTel);
		}
	}

	public String getSolution() {
		return this.solution;
	}

	public void setSolution(String solution) {
		this.solution = solution;
		if(solution != null){
			putBodyParameter("Solution", solution);
		}
	}

	public String getForHelp() {
		return this.forHelp;
	}

	public void setForHelp(String forHelp) {
		this.forHelp = forHelp;
		if(forHelp != null){
			putBodyParameter("ForHelp", forHelp);
		}
	}

	public String getApplicantName() {
		return this.applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
		if(applicantName != null){
			putBodyParameter("ApplicantName", applicantName);
		}
	}

	public String getBusinessModel() {
		return this.businessModel;
	}

	public void setBusinessModel(String businessModel) {
		this.businessModel = businessModel;
		if(businessModel != null){
			putBodyParameter("BusinessModel", businessModel);
		}
	}

	@Override
	public Class<ApplySmallMicroResponse> getResponseClass() {
		return ApplySmallMicroResponse.class;
	}

}
