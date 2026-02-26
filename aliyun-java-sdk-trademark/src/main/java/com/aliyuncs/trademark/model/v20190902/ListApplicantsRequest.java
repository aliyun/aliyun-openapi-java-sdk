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

package com.aliyuncs.trademark.model.v20190902;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.trademark.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListApplicantsRequest extends RpcAcsRequest<ListApplicantsResponse> {
	   

	private Integer pageNumber;

	private String applicantVersion;

	private String applicantName;

	private Integer applicantRegion;

	private Integer pageSize;

	private Integer auditStatus;

	private String systemVersion;

	private Integer applicantType;

	private String cardNumber;

	private Integer principalName;
	public ListApplicantsRequest() {
		super("Trademark", "2019-09-02", "ListApplicants");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getApplicantVersion() {
		return this.applicantVersion;
	}

	public void setApplicantVersion(String applicantVersion) {
		this.applicantVersion = applicantVersion;
		if(applicantVersion != null){
			putQueryParameter("ApplicantVersion", applicantVersion);
		}
	}

	public String getApplicantName() {
		return this.applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
		if(applicantName != null){
			putQueryParameter("ApplicantName", applicantName);
		}
	}

	public Integer getApplicantRegion() {
		return this.applicantRegion;
	}

	public void setApplicantRegion(Integer applicantRegion) {
		this.applicantRegion = applicantRegion;
		if(applicantRegion != null){
			putQueryParameter("ApplicantRegion", applicantRegion.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public Integer getAuditStatus() {
		return this.auditStatus;
	}

	public void setAuditStatus(Integer auditStatus) {
		this.auditStatus = auditStatus;
		if(auditStatus != null){
			putQueryParameter("AuditStatus", auditStatus.toString());
		}
	}

	public String getSystemVersion() {
		return this.systemVersion;
	}

	public void setSystemVersion(String systemVersion) {
		this.systemVersion = systemVersion;
		if(systemVersion != null){
			putQueryParameter("SystemVersion", systemVersion);
		}
	}

	public Integer getApplicantType() {
		return this.applicantType;
	}

	public void setApplicantType(Integer applicantType) {
		this.applicantType = applicantType;
		if(applicantType != null){
			putQueryParameter("ApplicantType", applicantType.toString());
		}
	}

	public String getCardNumber() {
		return this.cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
		if(cardNumber != null){
			putQueryParameter("CardNumber", cardNumber);
		}
	}

	public Integer getPrincipalName() {
		return this.principalName;
	}

	public void setPrincipalName(Integer principalName) {
		this.principalName = principalName;
		if(principalName != null){
			putQueryParameter("PrincipalName", principalName.toString());
		}
	}

	@Override
	public Class<ListApplicantsResponse> getResponseClass() {
		return ListApplicantsResponse.class;
	}

}
