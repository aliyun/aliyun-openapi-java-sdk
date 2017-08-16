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
public class SaveTaskForUpdatingContactByTemplateIdRequest extends RpcAcsRequest<SaveTaskForUpdatingContactByTemplateIdResponse> {
	
	public SaveTaskForUpdatingContactByTemplateIdRequest() {
		super("Domain", "2016-05-11", "SaveTaskForUpdatingContactByTemplateId");
	}

	private String saleId;

	private String contactType;

	private String userClientIp;

	private String domainName;

	private Boolean addTransferLock;

	private String lang;

	private Long contactTemplateId;

	public String getSaleId() {
		return this.saleId;
	}

	public void setSaleId(String saleId) {
		this.saleId = saleId;
		if(saleId != null){
			putQueryParameter("SaleId", saleId);
		}
	}

	public String getContactType() {
		return this.contactType;
	}

	public void setContactType(String contactType) {
		this.contactType = contactType;
		if(contactType != null){
			putQueryParameter("ContactType", contactType);
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

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		if(domainName != null){
			putQueryParameter("DomainName", domainName);
		}
	}

	public Boolean getAddTransferLock() {
		return this.addTransferLock;
	}

	public void setAddTransferLock(Boolean addTransferLock) {
		this.addTransferLock = addTransferLock;
		if(addTransferLock != null){
			putQueryParameter("AddTransferLock", addTransferLock.toString());
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
	public Class<SaveTaskForUpdatingContactByTemplateIdResponse> getResponseClass() {
		return SaveTaskForUpdatingContactByTemplateIdResponse.class;
	}

}
