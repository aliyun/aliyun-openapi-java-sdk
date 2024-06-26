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

package com.aliyuncs.domain_intl.model.v20171218;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SaveBatchTaskForModifyingDomainDnsRequest extends RpcAcsRequest<SaveBatchTaskForModifyingDomainDnsResponse> {
	   

	private List<String> domainNames;

	private Boolean aliyunDns;

	private String userClientIp;

	private List<String> domainNameServers;

	private String lang;
	public SaveBatchTaskForModifyingDomainDnsRequest() {
		super("Domain-intl", "2017-12-18", "SaveBatchTaskForModifyingDomainDns");
		setMethod(MethodType.POST);
	}

	public List<String> getDomainNames() {
		return this.domainNames;
	}

	public void setDomainNames(List<String> domainNames) {
		this.domainNames = domainNames;	
		if (domainNames != null) {
			for (int i = 0; i < domainNames.size(); i++) {
				putQueryParameter("DomainName." + (i + 1) , domainNames.get(i));
			}
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

	public String getUserClientIp() {
		return this.userClientIp;
	}

	public void setUserClientIp(String userClientIp) {
		this.userClientIp = userClientIp;
		if(userClientIp != null){
			putQueryParameter("UserClientIp", userClientIp);
		}
	}

	public List<String> getDomainNameServers() {
		return this.domainNameServers;
	}

	public void setDomainNameServers(List<String> domainNameServers) {
		this.domainNameServers = domainNameServers;	
		if (domainNameServers != null) {
			for (int i = 0; i < domainNameServers.size(); i++) {
				putQueryParameter("DomainNameServer." + (i + 1) , domainNameServers.get(i));
			}
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
	public Class<SaveBatchTaskForModifyingDomainDnsResponse> getResponseClass() {
		return SaveBatchTaskForModifyingDomainDnsResponse.class;
	}

}
