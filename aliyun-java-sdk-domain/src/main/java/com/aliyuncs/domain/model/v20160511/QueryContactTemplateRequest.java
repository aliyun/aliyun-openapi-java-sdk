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
public class QueryContactTemplateRequest extends RpcAcsRequest<QueryContactTemplateResponse> {
	
	public QueryContactTemplateRequest() {
		super("Domain", "2016-05-11", "QueryContactTemplate");
	}

	private String cCompany;

	private String auditStatus;

	private Boolean defaultTemplate;

	private String eCompany;

	private String userClientIp;

	private Integer pageSize;

	private String lang;

	private Integer pageNum;

	private Long contactTemplateId;

	private String regType;

	public String getCCompany() {
		return this.cCompany;
	}

	public void setCCompany(String cCompany) {
		this.cCompany = cCompany;
		if(cCompany != null){
			putQueryParameter("CCompany", cCompany);
		}
	}

	public String getAuditStatus() {
		return this.auditStatus;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
		if(auditStatus != null){
			putQueryParameter("AuditStatus", auditStatus);
		}
	}

	public Boolean getDefaultTemplate() {
		return this.defaultTemplate;
	}

	public void setDefaultTemplate(Boolean defaultTemplate) {
		this.defaultTemplate = defaultTemplate;
		if(defaultTemplate != null){
			putQueryParameter("DefaultTemplate", defaultTemplate.toString());
		}
	}

	public String getECompany() {
		return this.eCompany;
	}

	public void setECompany(String eCompany) {
		this.eCompany = eCompany;
		if(eCompany != null){
			putQueryParameter("ECompany", eCompany);
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
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

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
		if(pageNum != null){
			putQueryParameter("PageNum", pageNum.toString());
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

	public String getRegType() {
		return this.regType;
	}

	public void setRegType(String regType) {
		this.regType = regType;
		if(regType != null){
			putQueryParameter("RegType", regType);
		}
	}

	@Override
	public Class<QueryContactTemplateResponse> getResponseClass() {
		return QueryContactTemplateResponse.class;
	}

}
