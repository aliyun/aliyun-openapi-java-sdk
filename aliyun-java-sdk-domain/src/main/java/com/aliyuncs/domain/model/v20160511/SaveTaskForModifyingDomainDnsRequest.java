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
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class SaveTaskForModifyingDomainDnsRequest extends RpcAcsRequest<SaveTaskForModifyingDomainDnsResponse> {
	
	public SaveTaskForModifyingDomainDnsRequest() {
		super("Domain", "2016-05-11", "SaveTaskForModifyingDomainDns");
	}

	private String saleId;

	private String userClientIp;

	private String domainName;

	private String lang;

	private Boolean aliyunDns;

	private List<String> dnsLists;

	public String getSaleId() {
		return this.saleId;
	}

	public void setSaleId(String saleId) {
		this.saleId = saleId;
		if(saleId != null){
			putQueryParameter("SaleId", saleId);
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

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public Boolean getAliyunDns() {
		return this.aliyunDns;
	}

	public void setAliyunDns(Boolean aliyunDns) {
		this.aliyunDns = aliyunDns;
		if(aliyunDns != null){
			putQueryParameter("AliyunDns", aliyunDns.toString());
		}
	}

	public List<String> getDnsLists() {
		return this.dnsLists;
	}

	public void setDnsLists(List<String> dnsLists) {
		this.dnsLists = dnsLists;	
		for (int i = 0; i < dnsLists.size(); i++) {
			putQueryParameter("DnsList." + (i + 1) , dnsLists.get(i));
		}	
	}

	@Override
	public Class<SaveTaskForModifyingDomainDnsResponse> getResponseClass() {
		return SaveTaskForModifyingDomainDnsResponse.class;
	}

}
