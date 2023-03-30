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

package com.aliyuncs.domain.model.v20180129;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.domain.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SubmitOperationCredentialsRequest extends RpcAcsRequest<SubmitOperationCredentialsResponse> {
	   

	private String credentials;

	private Long auditRecordId;

	private Integer regType;

	private Integer auditType;

	private String lang;
	public SubmitOperationCredentialsRequest() {
		super("Domain", "2018-01-29", "SubmitOperationCredentials", "domain");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCredentials() {
		return this.credentials;
	}

	public void setCredentials(String credentials) {
		this.credentials = credentials;
		if(credentials != null){
			putQueryParameter("Credentials", credentials);
		}
	}

	public Long getAuditRecordId() {
		return this.auditRecordId;
	}

	public void setAuditRecordId(Long auditRecordId) {
		this.auditRecordId = auditRecordId;
		if(auditRecordId != null){
			putQueryParameter("AuditRecordId", auditRecordId.toString());
		}
	}

	public Integer getRegType() {
		return this.regType;
	}

	public void setRegType(Integer regType) {
		this.regType = regType;
		if(regType != null){
			putQueryParameter("RegType", regType.toString());
		}
	}

	public Integer getAuditType() {
		return this.auditType;
	}

	public void setAuditType(Integer auditType) {
		this.auditType = auditType;
		if(auditType != null){
			putQueryParameter("AuditType", auditType.toString());
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	@Override
	public Class<SubmitOperationCredentialsResponse> getResponseClass() {
		return SubmitOperationCredentialsResponse.class;
	}

}
