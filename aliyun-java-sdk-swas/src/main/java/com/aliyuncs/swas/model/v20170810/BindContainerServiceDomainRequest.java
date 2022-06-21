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

package com.aliyuncs.swas.model.v20170810;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class BindContainerServiceDomainRequest extends RpcAcsRequest<BindContainerServiceDomainResponse> {
	   

	private String containerServiceId;

	private String site;

	private String domain;
	public BindContainerServiceDomainRequest() {
		super("SWAS", "2017-08-10", "BindContainerServiceDomain", "SWAS");
		setMethod(MethodType.POST);
	}

	public String getContainerServiceId() {
		return this.containerServiceId;
	}

	public void setContainerServiceId(String containerServiceId) {
		this.containerServiceId = containerServiceId;
		if(containerServiceId != null){
			putQueryParameter("ContainerServiceId", containerServiceId);
		}
	}

	public String getSite() {
		return this.site;
	}

	public void setSite(String site) {
		this.site = site;
		if(site != null){
			putQueryParameter("Site", site);
		}
	}

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
		if(domain != null){
			putQueryParameter("Domain", domain);
		}
	}

	@Override
	public Class<BindContainerServiceDomainResponse> getResponseClass() {
		return BindContainerServiceDomainResponse.class;
	}

}
