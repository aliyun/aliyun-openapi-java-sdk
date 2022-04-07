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

package com.aliyuncs.mse.model.v20190531;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mse.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddGatewayDomainRequest extends RpcAcsRequest<AddGatewayDomainResponse> {
	   

	private String gatewayUniqueId;

	private String protocol;

	private Boolean mustHttps;

	private String certIdentifier;

	private String name;

	private String acceptLanguage;
	public AddGatewayDomainRequest() {
		super("mse", "2019-05-31", "AddGatewayDomain", "mse");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getGatewayUniqueId() {
		return this.gatewayUniqueId;
	}

	public void setGatewayUniqueId(String gatewayUniqueId) {
		this.gatewayUniqueId = gatewayUniqueId;
		if(gatewayUniqueId != null){
			putQueryParameter("GatewayUniqueId", gatewayUniqueId);
		}
	}

	public String getBizProtocol() {
		return this.protocol;
	}

	public void setBizProtocol(String protocol) {
		this.protocol = protocol;
		if(protocol != null){
			putQueryParameter("Protocol", protocol);
		}
	}

	public Boolean getMustHttps() {
		return this.mustHttps;
	}

	public void setMustHttps(Boolean mustHttps) {
		this.mustHttps = mustHttps;
		if(mustHttps != null){
			putQueryParameter("MustHttps", mustHttps.toString());
		}
	}

	public String getCertIdentifier() {
		return this.certIdentifier;
	}

	public void setCertIdentifier(String certIdentifier) {
		this.certIdentifier = certIdentifier;
		if(certIdentifier != null){
			putQueryParameter("CertIdentifier", certIdentifier);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getAcceptLanguage() {
		return this.acceptLanguage;
	}

	public void setAcceptLanguage(String acceptLanguage) {
		this.acceptLanguage = acceptLanguage;
		if(acceptLanguage != null){
			putQueryParameter("AcceptLanguage", acceptLanguage);
		}
	}

	@Override
	public Class<AddGatewayDomainResponse> getResponseClass() {
		return AddGatewayDomainResponse.class;
	}

}
