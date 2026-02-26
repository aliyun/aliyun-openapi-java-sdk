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
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.domain.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SaveSingleTaskForReserveDropListDomainRequest extends RpcAcsRequest<SaveSingleTaskForReserveDropListDomainResponse> {
	   

	private String dns2;

	private String dns1;

	private String domainName;

	private String contactTemplateId;
	public SaveSingleTaskForReserveDropListDomainRequest() {
		super("Domain", "2018-01-29", "SaveSingleTaskForReserveDropListDomain", "domain");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDns2() {
		return this.dns2;
	}

	public void setDns2(String dns2) {
		this.dns2 = dns2;
		if(dns2 != null){
			putQueryParameter("Dns2", dns2);
		}
	}

	public String getDns1() {
		return this.dns1;
	}

	public void setDns1(String dns1) {
		this.dns1 = dns1;
		if(dns1 != null){
			putQueryParameter("Dns1", dns1);
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

	public String getContactTemplateId() {
		return this.contactTemplateId;
	}

	public void setContactTemplateId(String contactTemplateId) {
		this.contactTemplateId = contactTemplateId;
		if(contactTemplateId != null){
			putQueryParameter("ContactTemplateId", contactTemplateId);
		}
	}

	@Override
	public Class<SaveSingleTaskForReserveDropListDomainResponse> getResponseClass() {
		return SaveSingleTaskForReserveDropListDomainResponse.class;
	}

}
