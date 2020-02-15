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

package com.aliyuncs.baas.model.v20181221;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CheckFabricOrganizationDomainRequest extends RpcAcsRequest<CheckFabricOrganizationDomainResponse> {
	   

	private String domainCode;

	private String domain;
	public CheckFabricOrganizationDomainRequest() {
		super("Baas", "2018-12-21", "CheckFabricOrganizationDomain", "baas");
		setMethod(MethodType.PUT);
	}

	public String getDomainCode() {
		return this.domainCode;
	}

	public void setDomainCode(String domainCode) {
		this.domainCode = domainCode;
		if(domainCode != null){
			putBodyParameter("DomainCode", domainCode);
		}
	}

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
		if(domain != null){
			putBodyParameter("Domain", domain);
		}
	}

	@Override
	public Class<CheckFabricOrganizationDomainResponse> getResponseClass() {
		return CheckFabricOrganizationDomainResponse.class;
	}

}
