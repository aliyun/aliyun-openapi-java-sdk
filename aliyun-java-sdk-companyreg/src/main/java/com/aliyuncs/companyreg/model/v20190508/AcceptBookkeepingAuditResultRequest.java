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

package com.aliyuncs.companyreg.model.v20190508;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.companyreg.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AcceptBookkeepingAuditResultRequest extends RpcAcsRequest<AcceptBookkeepingAuditResultResponse> {
	   

	private String note;

	private String orgCode;

	private String orgAddress;

	private String orgName;

	private Long serviceStartTime;

	private Boolean auditResult;

	private String bizId;

	private String orgMobile;
	public AcceptBookkeepingAuditResultRequest() {
		super("companyreg", "2019-05-08", "AcceptBookkeepingAuditResult");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
		if(note != null){
			putQueryParameter("Note", note);
		}
	}

	public String getOrgCode() {
		return this.orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
		if(orgCode != null){
			putQueryParameter("OrgCode", orgCode);
		}
	}

	public String getOrgAddress() {
		return this.orgAddress;
	}

	public void setOrgAddress(String orgAddress) {
		this.orgAddress = orgAddress;
		if(orgAddress != null){
			putQueryParameter("OrgAddress", orgAddress);
		}
	}

	public String getOrgName() {
		return this.orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
		if(orgName != null){
			putQueryParameter("OrgName", orgName);
		}
	}

	public Long getServiceStartTime() {
		return this.serviceStartTime;
	}

	public void setServiceStartTime(Long serviceStartTime) {
		this.serviceStartTime = serviceStartTime;
		if(serviceStartTime != null){
			putQueryParameter("ServiceStartTime", serviceStartTime.toString());
		}
	}

	public Boolean getAuditResult() {
		return this.auditResult;
	}

	public void setAuditResult(Boolean auditResult) {
		this.auditResult = auditResult;
		if(auditResult != null){
			putQueryParameter("AuditResult", auditResult.toString());
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

	public String getOrgMobile() {
		return this.orgMobile;
	}

	public void setOrgMobile(String orgMobile) {
		this.orgMobile = orgMobile;
		if(orgMobile != null){
			putQueryParameter("OrgMobile", orgMobile);
		}
	}

	@Override
	public Class<AcceptBookkeepingAuditResultResponse> getResponseClass() {
		return AcceptBookkeepingAuditResultResponse.class;
	}

}
