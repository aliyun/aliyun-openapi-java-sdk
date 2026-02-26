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

package com.aliyuncs.ga.model.v20191120;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ga.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateDomainRequest extends RpcAcsRequest<CreateDomainResponse> {
	   

	private List<String> acceleratorIdss;

	private String domain;
	public CreateDomainRequest() {
		super("Ga", "2019-11-20", "CreateDomain", "gaplus");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getAcceleratorIdss() {
		return this.acceleratorIdss;
	}

	public void setAcceleratorIdss(List<String> acceleratorIdss) {
		this.acceleratorIdss = acceleratorIdss;	
		if (acceleratorIdss != null) {
			for (int i = 0; i < acceleratorIdss.size(); i++) {
				putQueryParameter("AcceleratorIds." + (i + 1) , acceleratorIdss.get(i));
			}
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
	public Class<CreateDomainResponse> getResponseClass() {
		return CreateDomainResponse.class;
	}

}
