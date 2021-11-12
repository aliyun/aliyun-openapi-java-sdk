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

package com.aliyuncs.uisplus.model.v20200707;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.uisplus.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateGreConnectionRequest extends RpcAcsRequest<CreateGreConnectionResponse> {
	   

	private String customerIp;

	private String clientToken;

	private String description;

	private String customerTunnelIp;

	private String resourceMode;

	private String uisId;

	private String cidrs;

	private String localTunnelIp;

	private String name;

	private String localIp;
	public CreateGreConnectionRequest() {
		super("Uisplus", "2020-07-07", "CreateGreConnection", "uisplus");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCustomerIp() {
		return this.customerIp;
	}

	public void setCustomerIp(String customerIp) {
		this.customerIp = customerIp;
		if(customerIp != null){
			putQueryParameter("CustomerIp", customerIp);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getCustomerTunnelIp() {
		return this.customerTunnelIp;
	}

	public void setCustomerTunnelIp(String customerTunnelIp) {
		this.customerTunnelIp = customerTunnelIp;
		if(customerTunnelIp != null){
			putQueryParameter("CustomerTunnelIp", customerTunnelIp);
		}
	}

	public String getResourceMode() {
		return this.resourceMode;
	}

	public void setResourceMode(String resourceMode) {
		this.resourceMode = resourceMode;
		if(resourceMode != null){
			putQueryParameter("ResourceMode", resourceMode);
		}
	}

	public String getUisId() {
		return this.uisId;
	}

	public void setUisId(String uisId) {
		this.uisId = uisId;
		if(uisId != null){
			putQueryParameter("UisId", uisId);
		}
	}

	public String getCidrs() {
		return this.cidrs;
	}

	public void setCidrs(String cidrs) {
		this.cidrs = cidrs;
		if(cidrs != null){
			putQueryParameter("Cidrs", cidrs);
		}
	}

	public String getLocalTunnelIp() {
		return this.localTunnelIp;
	}

	public void setLocalTunnelIp(String localTunnelIp) {
		this.localTunnelIp = localTunnelIp;
		if(localTunnelIp != null){
			putQueryParameter("LocalTunnelIp", localTunnelIp);
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

	public String getLocalIp() {
		return this.localIp;
	}

	public void setLocalIp(String localIp) {
		this.localIp = localIp;
		if(localIp != null){
			putQueryParameter("LocalIp", localIp);
		}
	}

	@Override
	public Class<CreateGreConnectionResponse> getResponseClass() {
		return CreateGreConnectionResponse.class;
	}

}
