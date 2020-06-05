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

package com.aliyuncs.sgw.model.v20180511;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sgw.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SetGatewayLDAPInfoRequest extends RpcAcsRequest<SetGatewayLDAPInfoResponse> {
	   

	private Boolean isTls;

	private String password;

	private String rootDN;

	private String securityToken;

	private String serverIp;

	private String baseDN;

	private String gatewayId;

	private Boolean isEnabled;
	public SetGatewayLDAPInfoRequest() {
		super("sgw", "2018-05-11", "SetGatewayLDAPInfo", "hcs_sgw");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getIsTls() {
		return this.isTls;
	}

	public void setIsTls(Boolean isTls) {
		this.isTls = isTls;
		if(isTls != null){
			putQueryParameter("IsTls", isTls.toString());
		}
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
		if(password != null){
			putQueryParameter("Password", password);
		}
	}

	public String getRootDN() {
		return this.rootDN;
	}

	public void setRootDN(String rootDN) {
		this.rootDN = rootDN;
		if(rootDN != null){
			putQueryParameter("RootDN", rootDN);
		}
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public String getServerIp() {
		return this.serverIp;
	}

	public void setServerIp(String serverIp) {
		this.serverIp = serverIp;
		if(serverIp != null){
			putQueryParameter("ServerIp", serverIp);
		}
	}

	public String getBaseDN() {
		return this.baseDN;
	}

	public void setBaseDN(String baseDN) {
		this.baseDN = baseDN;
		if(baseDN != null){
			putQueryParameter("BaseDN", baseDN);
		}
	}

	public String getGatewayId() {
		return this.gatewayId;
	}

	public void setGatewayId(String gatewayId) {
		this.gatewayId = gatewayId;
		if(gatewayId != null){
			putQueryParameter("GatewayId", gatewayId);
		}
	}

	public Boolean getIsEnabled() {
		return this.isEnabled;
	}

	public void setIsEnabled(Boolean isEnabled) {
		this.isEnabled = isEnabled;
		if(isEnabled != null){
			putQueryParameter("IsEnabled", isEnabled.toString());
		}
	}

	@Override
	public Class<SetGatewayLDAPInfoResponse> getResponseClass() {
		return SetGatewayLDAPInfoResponse.class;
	}

}
