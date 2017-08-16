/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.domain.model.v20160511;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class SaveContactTemplateCredentialRequest extends RpcAcsRequest<SaveContactTemplateCredentialResponse> {
	
	public SaveContactTemplateCredentialRequest() {
		super("Domain", "2016-05-11", "SaveContactTemplateCredential");
	}

	private String credentialNo;

	private String credential;

	private String userClientIp;

	private String lang;

	private Long contactTemplateId;

	public String getCredentialNo() {
		return this.credentialNo;
	}

	public void setCredentialNo(String credentialNo) {
		this.credentialNo = credentialNo;
		if(credentialNo != null){
			putQueryParameter("CredentialNo", credentialNo);
		}
	}

	public String getCredential() {
		return this.credential;
	}

	public void setCredential(String credential) {
		this.credential = credential;
		if(credential != null){
			putQueryParameter("Credential", credential);
		}
	}

	public String getUserClientIp() {
		return this.userClientIp;
	}

	public void setUserClientIp(String userClientIp) {
		this.userClientIp = userClientIp;
		if(userClientIp != null){
			putQueryParameter("UserClientIp", userClientIp);
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

	public Long getContactTemplateId() {
		return this.contactTemplateId;
	}

	public void setContactTemplateId(Long contactTemplateId) {
		this.contactTemplateId = contactTemplateId;
		if(contactTemplateId != null){
			putQueryParameter("ContactTemplateId", contactTemplateId.toString());
		}
	}

	@Override
	public Class<SaveContactTemplateCredentialResponse> getResponseClass() {
		return SaveContactTemplateCredentialResponse.class;
	}

}
