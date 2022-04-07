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
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mse.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddServiceSourceRequest extends RpcAcsRequest<AddServiceSourceResponse> {
	   

	@SerializedName("ingressOptionsRequest")
	private IngressOptionsRequest ingressOptionsRequest;

	private String gatewayUniqueId;

	private String source;

	private String type;

	private String address;

	private String name;

	private String acceptLanguage;
	public AddServiceSourceRequest() {
		super("mse", "2019-05-31", "AddServiceSource", "mse");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public IngressOptionsRequest getIngressOptionsRequest() {
		return this.ingressOptionsRequest;
	}

	public void setIngressOptionsRequest(IngressOptionsRequest ingressOptionsRequest) {
		this.ingressOptionsRequest = ingressOptionsRequest;	
		if (ingressOptionsRequest != null) {
			putQueryParameter("IngressOptionsRequest" , new Gson().toJson(ingressOptionsRequest));
		}	
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

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
		if(source != null){
			putQueryParameter("Source", source);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
		if(address != null){
			putQueryParameter("Address", address);
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

	public static class IngressOptionsRequest {

		@SerializedName("EnableIngress")
		private Boolean enableIngress;

		@SerializedName("WatchNamespace")
		private String watchNamespace;

		@SerializedName("IngressClass")
		private String ingressClass;

		public Boolean getEnableIngress() {
			return this.enableIngress;
		}

		public void setEnableIngress(Boolean enableIngress) {
			this.enableIngress = enableIngress;
		}

		public String getWatchNamespace() {
			return this.watchNamespace;
		}

		public void setWatchNamespace(String watchNamespace) {
			this.watchNamespace = watchNamespace;
		}

		public String getIngressClass() {
			return this.ingressClass;
		}

		public void setIngressClass(String ingressClass) {
			this.ingressClass = ingressClass;
		}
	}

	@Override
	public Class<AddServiceSourceResponse> getResponseClass() {
		return AddServiceSourceResponse.class;
	}

}
